package cn.edu.guet.controller;

import cn.edu.guet.bean.PlanDesignDTO;
import cn.edu.guet.bean.PlanDesignInfo;
import cn.edu.guet.common.ResponseData;
import cn.edu.guet.mvc.annotation.Controller;
import cn.edu.guet.mvc.annotation.RequestMapping;
import cn.edu.guet.service.PlanDesignInfoService;
import cn.edu.guet.util.TransactionHandler;
import cn.hutool.http.HttpRequest;
import com.google.gson.Gson;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * @Author liwei
 * @Date 2023/5/25 20:15
 * @Version 1.0
 */
@Controller
public class PlanDesignController {

    public static Logger logger = LoggerFactory.getLogger(PlanDesignController.class);

    TransactionHandler transactionHandler = new TransactionHandler();

    private PlanDesignInfoService planDesignInfoService;

    public void setPlanDesignInfoService(PlanDesignInfoService planDesignInfoService) {
        // 创建PlanDesignService代理对象
        this.planDesignInfoService = (PlanDesignInfoService) transactionHandler.createProxyObject(planDesignInfoService);
    }
    /*
    @RequestMapping("/createBill")
    public ResponseData createBill(PlanDesignInfo planDesignInfo) {
        logger.info("创建工单：{}", planDesignInfo);
        planDesignInfo.setReviewer("桂电");
        return planDesignService.createBill(planDesignInfo);
    }
     */

    /**
     * 工单查询
     *
     * @param planDesignDTO
     * @return
     */
    @RequestMapping("/searchBill")
    public ResponseData searchBill(PlanDesignDTO planDesignDTO) {
        logger.info("搜索条件：{}", planDesignDTO);
        return planDesignInfoService.searchBill(planDesignDTO);
    }

    @RequestMapping("/selectBusinessRouteByPlanDesignId")
    public ResponseData selectBusinessRouteByPlanDesignId(Long id) {
        System.out.println("plan_design_id: " + id);
        return planDesignInfoService.selectBusinessRouteByPlanDesignId(id);
    }

    @RequestMapping("/selectRouteCableList")
    public ResponseData selectRouteCableList(Long id) {
        return planDesignInfoService.selectRouteCableList(id);
    }

    @RequestMapping("/parseCAD")
    public ResponseData parseCAD() {
        return planDesignInfoService.parseCAD();
    }
    /*
    @RequestMapping("/createBillAndAnalyse")
    public ResponseData createBillAndAnalyse(PlanDesignInfo planDesignInfo) {
        try {
            planDesignInfo.setCreate_time(new Timestamp(System.currentTimeMillis()));
            planDesignInfo.setUpdate_time(new Timestamp(System.currentTimeMillis()));
            return planDesignService.createBillAndAnalyse(planDesignInfo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    */
    /*
    @RequestMapping("/upload")
    public ResponseData upload(HttpServletRequest request, HttpServletResponse response) {
        String dir = System.getProperty("user.dir");
        dir = dir.substring(0, dir.lastIndexOf("/"));
        Gson gson = new Gson();
        String realPath = dir + "/webapps/upload";
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart == true) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Iterator<FileItem> itr = items.iterator();
            while (itr.hasNext()) {
                FileItem item = (FileItem) itr.next();
                if (!item.isFormField()) {
                    File fullFile = new File(item.getName());
                    File savedFile = new File(realPath + "/", fullFile.getName());
                    try {
                        item.write(savedFile);
                        String url = "http://localhost:8080/upload/" + fullFile.getName();
                        String[] strs = {url};
                        return ResponseData.ok(strs);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            logger.info("the enctype must be multipart/form-data");
        }
        return null;
    }
     */
}
