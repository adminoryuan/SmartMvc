package com.smartMvc.Core.ReqFunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class postReqFunc implements iFunc {

    public Object intstanc;

    public Method method;
    @Override
    public void invoke(HttpServletResponse response, HttpServletRequest request) {


        Object invoke = null;
        try {
            invoke = method.invoke(intstanc);
            response.getWriter().write(invoke.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
