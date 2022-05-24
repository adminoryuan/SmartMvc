# SmartMvc
 - # 介绍
 - smartMvc 是使用java编写基于Servlet实现的一个小型mvc框架

 - 用于更好的学习springmvc的原理
 - # 实现功能
 - 内置tomcat 容器
 - 通过注解实现路由
 - 支持json 转换
 - 支持@Parms() 参数映射
# 使用
 - # 启动类
```java
@ScanController(path = "com.smartMvc.Controller.ViewController")
public class Main {
    public static void main(String[] args) {
        RunApplication runApplication = new RunApplication();
        //运行mvc
        runApplication.Run();
    }
}
```
- # Controller
```java
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
        return "smartmvc！！！";
    }

}
```