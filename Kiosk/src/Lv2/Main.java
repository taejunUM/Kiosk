package Lv2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] menus = {
//                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
//                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
//                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
//                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거",
//                "0. 종료           | 종료"
//        };


        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (MenuItem menu : menuItems) {
                System.out.println(menu.getName() + "| W " + menu.getPrice() + " | " + menu.getExplanation());
            }
            if (scanner.nextInt() == 0) {
                System.out.println("프로그램을 종료합니다.");

            }

        }
    }
}


