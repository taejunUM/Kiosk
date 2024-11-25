package Lv4;

public class Main {

    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        kiosk.setAllMenu(
                new Menu("Burgers",
                        new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")),
                new Menu("Drinks",
                        new MenuItem("1", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("2", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("3", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("4", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")),
                new Menu("Sides",
                        new MenuItem("5", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("6", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("7", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("8", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"))
        );


        kiosk.start();

    }
}