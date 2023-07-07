package cn.edu.guet.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

import java.io.InputStream;

/**
 * ������� �ر�����
 *
 * @author liwei
 */
public class DBUtil {
    private static ThreadLocal<SqlSession> sqlSessionThreadLocal = new ThreadLocal<>();

    public static SqlSession getSqlSession() {
        // �ȴ�ThreadLocalȡ
        SqlSession sqlSession = sqlSessionThreadLocal.get();
        if (sqlSession == null) {
            try {
                InputStream in = Resources
                        .getResourceAsStream("mybatis-config.xml");
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
                sqlSession = sqlSessionFactory.openSession();
                sqlSessionThreadLocal.set(sqlSession);
                return sqlSession;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSession;
    }
}
