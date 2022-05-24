package com.smartMvc.Core.ReqFunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ErrorFunc implements iFunc{
    @Override
    public void invoke(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.getWriter().write("404");
    }
}
