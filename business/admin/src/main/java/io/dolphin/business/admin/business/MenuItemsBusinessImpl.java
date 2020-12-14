package io.dolphin.business.admin.business;

import io.dolphin.business.admin.component.MenuItemsComponent;
import io.dolphin.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuItemsBusinessImpl implements MenuItemsBusiness {
    @Autowired
    MenuItemsComponent menuItemsComponent;

    @Override
    public List<Menu> getAllMenu() {
        return menuItemsComponent.getAllBy();
    }
}
