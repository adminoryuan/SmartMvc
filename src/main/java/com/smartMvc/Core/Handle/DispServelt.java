package com.smartMvc.Core.Handle;

import com.smartMvc.Core.ReqFunc.iFunc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/*")
public class DispServelt extends HttpServlet {


    HandleRequest handleRequest=new HandleRequest();
    @Override
    public void init() throws ServletException {
        try {
            System.out.printf("=======开始加载");
            handleRequest.Load(DispServelt.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestURI = req.getRequestURI();

        String method = req.getMethod();


        iFunc reqFunc = handleRequest.getReqFunc(requestURI, method);

        reqFunc.invoke(resp,req);

       // super.service(req, resp);

    }


}
