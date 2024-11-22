package Lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();

    public void start () {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            int i = 0;
            for (MenuItem menu : menuItems) {
                System.out.println(++i + ". " + menu.getName() + "| W " + menu.getPrice() + " | " + menu.getExplanation());
            }
            System.out.println("0.   | 종료");

            if (scanner.nextInt() == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }

    }

    public void setMenuItems(MenuItem... menuItems) {
        this.menuItems.addAll(Arrays.asList(menuItems));
    }
}
