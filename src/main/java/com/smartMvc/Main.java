package com.smartMvc;

import com.smartMvc.Core.Anno.ScanController;
import com.smartMvc.Core.RunApplication;

@ScanController(path = "com.smartMvc.Controller.ViewController")
public class Main {
    public static void main(String[] args) {
        RunApplication runApplication = new RunApplication();
        //运行mvc
        runApplication.Run();
    }
}
