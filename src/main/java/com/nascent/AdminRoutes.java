package com.nascent;

import com.jfinal.config.Routes;

public class AdminRoutes extends Routes {
    @Override
    public void config() {
        setBaseViewPath("/WEB-INF/pages/views/admin");
    }
}
