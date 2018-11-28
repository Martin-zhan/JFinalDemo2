package com.nascent;

import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.nascent.test.controller.HelloController;

public class FrontRoutes extends Routes {
    @Override
    public void config() {
        //setBaseViewPath("/WEB-INF/pages/views/user");
        setBaseViewPath(PropKit.use("test.txt").get("userBaseViewPath"));
        add("/hello", HelloController.class);
    }
}
