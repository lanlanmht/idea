package cn.Servlet;

import cn.javabean.Andios;
import cn.javabean.Preson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Andios andios=new Andios();
        andios.setTeaXu(new Preson("孟鹤堂",1,40));
        andios.setStu(new Preson("先生",2,20));
        andios.setLocation("1615");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
