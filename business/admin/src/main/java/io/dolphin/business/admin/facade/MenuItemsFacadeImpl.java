package io.dolphin.business.admin.facade;

import io.dolphin.business.admin.business.MenuItemsBusiness;
import io.dolphin.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuitems")
public class MenuItemsFacadeImpl implements MenuItemsFacade {

    @Autowired
    MenuItemsBusiness menuItemsBusiness;

    @Override
    public List<Menu> getAllMenu() {
        return menuItemsBusiness.getAllMenu();
    }
}
