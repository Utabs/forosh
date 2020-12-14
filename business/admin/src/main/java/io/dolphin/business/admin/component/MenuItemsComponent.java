package io.dolphin.business.admin.component;

import io.dolphin.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemsComponent extends JpaRepository<Menu, Long> {
    List<Menu> getAllBy();

}
