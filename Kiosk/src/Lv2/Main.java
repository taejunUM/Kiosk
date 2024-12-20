package Lv2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * 햄버거 메뉴 클래스로 관리하기
         * 햄버거 메뉴를 List로 저장하여 관리
         */

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        /**
         * 햄버거 메뉴 출력 및 입력값에 따라 프로그램 종료
         */

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



