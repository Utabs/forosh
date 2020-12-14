package io.dolphin.application.admin;

import io.dolphin.base.InvocationContext;
import io.dolphin.base.ServiceContext;
import io.dolphin.business.admin.facade.MenuItemsFacade;
import io.dolphin.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@ComponentScan({"io.dolphin.business"})
public class MenuItems {
    @Autowired
    MenuItemsFacade menuItemsFacade;

    @RequestMapping("/bye")
    @ResponseBody
    public InvocationContext<List<Menu>> getAllMenu() {
        ServiceContext sc = new ServiceContext();
        InvocationContext<List<Menu>> listInvocationContext = new InvocationContext<>();
        List<Menu> newList = menuItemsFacade.getAllMenu();
        listInvocationContext.setData(newList);
        return listInvocationContext;
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHello() {
        return "salammm";
    }

}
