package com.smartMvc.Core.ReqFunc;

import java.util.HashMap;
import java.util.Map;

public class ViewAndModel {
    private String View;
    private Map<String,Object> objectMap=new HashMap<>();

    public void AddModel(String key,Object model) {
        objectMap.put(key,model);
    }

    public void setView(String view) {
        View = view;
    }

    public String getView() {
        return View;
    }

    public Map<String,Object> getModel() {
        return objectMap;
    }

}
