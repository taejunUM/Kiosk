package Lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {


    List<MenuItem> getMenuItems = new ArrayList<>();
    String category;

    public Menu(String category, MenuItem... menuItems) {
        this.getMenuItems.addAll(Arrays.asList(menuItems));
        this.category = category;
    }
}
