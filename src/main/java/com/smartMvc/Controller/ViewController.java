package com.smartMvc.Controller;


import com.smartMvc.Core.Anno.GetMapper;
import com.smartMvc.Core.Anno.PostMapper;
import com.smartMvc.Core.ReqFunc.ViewAndModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewController {

    @GetMapper(UrL = "/index")
    public ViewAndModel Index(){
        System.out.printf("执行了请求了");
        ViewAndModel viewAndModel = new ViewAndModel();
        viewAndModel.setView("/index.jsp");
        viewAndModel.AddModel("name","张三");
        return viewAndModel;
    }
    @PostMapper(Url = "/GetName")
    public String getName(){
        return "你好啊！！！";
    }

}
