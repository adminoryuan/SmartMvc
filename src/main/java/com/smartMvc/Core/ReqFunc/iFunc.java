package com.smartMvc.Core.ReqFunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface iFunc {
    void invoke(HttpServletResponse response, HttpServletRequest request) throws IOException;
}
