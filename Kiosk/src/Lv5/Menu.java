package Lv5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    /**
     * menuItems : 해당 메뉴의 아이템 목록 저장
     * category : 메뉴 카테고리 이름
     */
    private List<MenuItem> menuItems = new ArrayList<>();
    private String category;

    public Menu(String category, MenuItem... menuItems) {
        this.menuItems.addAll(Arrays.asList(menuItems));
        this.category = category;
    }
    /**
     * getMenuItems : 메뉴 목록 반환
     * getCategory : 카테고리 이름 반환
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategory() {
        return category;
    }
}
