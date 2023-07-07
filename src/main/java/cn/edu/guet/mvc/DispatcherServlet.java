package cn.edu.guet.mvc;

import cn.edu.guet.ioc.BeanFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author liwei
 * @Date 2020/9/5 15:20
 * @Version 1.0
 */
@WebServlet(value = "*.do")
public class DispatcherServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(DispatcherServlet.class);
    Map<String, ControllerMapping> controllerMapping;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        controllerMapping = (Map<String, ControllerMapping>) config.getServletContext().getAttribute("cn.guet.web.controller");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControllerMapping mapping = null;
        String requestURI = request.getRequestURI();
        requestURI = StringUtils.substringBetween(requestURI, request.getContextPath(), ".do");
        if (controllerMapping.containsKey(requestURI)) {
            mapping = controllerMapping.get(requestURI);
        }
        Class controllerClass = mapping.getControllerClass();
        Method handleMethod = mapping.getHandleMethod();
        Class[] parameterType = handleMethod.getParameterTypes();

        // 反射获取参数的名称
        List<String> paramterList = new ArrayList<String>();
        Parameter[] params = handleMethod.getParameters();
        for (Parameter parameter : params) {
            paramterList.add(parameter.getName());
        }
        Object[] parameterValues = new Object[parameterType.length];
        Object obj = null;
        try {
            String controllerClassName = controllerClass.getSimpleName();
            controllerClassName = StringUtils.replaceChars(controllerClassName, controllerClassName.substring(0, 1), controllerClassName.substring(0, 1).toLowerCase());
            obj = BeanFactory.getInstance().getBean(controllerClassName);
            // obj = controllerClass.newInstance();
            for (int i = 0; i < parameterType.length; i++) {
                if (ClassUtils.isAssignable(parameterType[i], HttpServletRequest.class)) {
                    parameterValues[i] = request;
                } else if (ClassUtils.isAssignable(parameterType[i], HttpServletResponse.class)) {
                    parameterValues[i] = response;
                } else if (ClassUtils.isAssignable(parameterType[i], HttpSession.class)) {
                    parameterValues[i] = request.getSession();
                } else if (parameterType[i].isPrimitive()) {
                    if (parameterType[i].getTypeName().equals("int")) {
                        parameterValues[i] = Integer.parseInt(request.getParameter(paramterList.get(i)));
                    } else if (parameterType[i].getTypeName().equals("float")) {
                        parameterValues[i] = Float.parseFloat(request.getParameter(paramterList.get(i)));
                    } else if (parameterType[i].getTypeName().equals("long")) {
                        parameterValues[i] = Long.parseLong(request.getParameter(paramterList.get(i)));
                    }
                } else if (ClassUtils.isAssignable(parameterType[i], String.class)) {
                    parameterValues[i] = request.getParameter(paramterList.get(i));
                } else if (ClassUtils.isAssignable(parameterType[i], Long.class)) {
                    System.out.println("Long类型：" + request.getParameter(paramterList.get(i)));
                    parameterValues[i] = Long.parseLong(request.getParameter(paramterList.get(i)));
                } else {
                    // 接收前端传的JSON类型
                    request.setCharacterEncoding("UTF-8");
                    InputStreamReader isr = new InputStreamReader(request.getInputStream(), "UTF-8");
                    BufferedReader br = new BufferedReader(isr);
                    StringBuffer sb = new StringBuffer();
                    String line = "";
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                    }
                    Gson gson = new GsonBuilder()
                            .setDateFormat("yyyy-MM-dd HH:mm:ss")
                            .setPrettyPrinting()
                            .create();
                    Object pojo = gson.fromJson(sb.toString(), parameterType[i]);
                    parameterValues[i] = pojo;
                }
            }
            // 反射调用方法
            Object returnValue = handleMethod.invoke(obj, parameterValues);
            // 方法返回的是一个字符串
            if (returnValue != null && returnValue instanceof String) {
                String path = returnValue.toString();
                if (StringUtils.startsWith(path, "redirect:")) {
                    //重定向
                    response.sendRedirect(request.getContextPath() + StringUtils.substringAfter(path, "redirect:"));
                } else {
                    //转发
                    request.getRequestDispatcher(path).forward(request, response);
                }
            }
            // 返回的是一个Bean，并将该Bean转换成JSON
            else if (returnValue != null && !(returnValue instanceof String)) {
                response.setContentType("application/json; charset=UTF-8");
                String json = new GsonBuilder()
                        .setDateFormat("yyyy-MM-dd HH:mm:ss")
                        .setPrettyPrinting()
                        .create()
                        .toJson(returnValue);
                PrintWriter out = response.getWriter();
                out.write(json);
                out.flush();
                out.close();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
