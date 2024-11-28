package Lv5;

public class MenuItem {
    private String name;
    private double price;
    private String explanation;

    /**
     *
     * @param name 메뉴 이름
     * @param price 메뉴 가격
     * @param explanation 메뉴 설명
     */

    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
    /**
     * getName 메뉴 이름 반환
     * getPrice 메뉴 가격 반환
     * GetExplnation 메뉴 설명 반환
     */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }

}


