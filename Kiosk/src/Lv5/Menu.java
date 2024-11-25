package Lv5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {


    private List<MenuItem> menuItems = new ArrayList<>();
    private String category;

    public Menu(String category, MenuItem... menuItems) {
        this.menuItems.addAll(Arrays.asList(menuItems));
        this.category = category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategory() {
        return category;
    }
}
