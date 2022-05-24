package com.smartMvc.Core.ReqFunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Map;

public class getReqFunc implements iFunc {

   public Object intstanc;

   public Method method;

    @Override
    public void invoke(HttpServletResponse response, HttpServletRequest request) {

        try {
            //调用一下方法
            ViewAndModel invoke1 =(ViewAndModel) method.invoke(intstanc);

            Map<String, Object> model = invoke1.getModel();

            for (String s : model.keySet()) {
                request.setAttribute(s,model.get(s));
            }

            //完成视图映射

           //response.getWriter().write("hello");
            request.getRequestDispatcher(invoke1.getView()).forward(request,response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
