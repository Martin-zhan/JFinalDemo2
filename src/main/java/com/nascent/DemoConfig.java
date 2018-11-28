package com.nascent;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;
import com.nascent.test.controller.HelloController;

public class DemoConfig extends JFinalConfig {
    /**
     *  推荐使用JFinal方法启动
     * @param args
     */
    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8086,"/",0);
    }

    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {
        //  绑定前台的Routes
        routes.add(new FrontRoutes());
        //  绑定后台的Routes
        routes.add(new AdminRoutes());
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
