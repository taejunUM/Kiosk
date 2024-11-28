package Lv5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Kiosk {
    /**
     * List<Menu> 형식의 모든 메뉴데이터 저장
     */
    private List<Menu> allMenu = new ArrayList<>();

    /**
     * 메인 프로그램 실행. 사용자의 입력값에 따라 탐색, 선택, 종료 기능 제공
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");

            int i = 0;
            for (Menu menu : allMenu) {
                System.out.println(++i + ". " + menu.getCategory());
            }
            System.out.println("0.   | 종료");

            int j = scanner.nextInt();
            if (j == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(0 < j && j <= allMenu.size())) {
                continue;
            } else {
                i = 0;
                j -= 1;
                System.out.println();
                for (MenuItem menu : allMenu.get(j).getMenuItems()) {
                    System.out.println(++i + ". " + menu.getName() + "| W " + menu.getPrice() + " | " + menu.getExplanation());
                }
            }
            System.out.println("0.   | 종료");
            i = scanner.nextInt();
            if (0 < i && i <= allMenu.get(j).getMenuItems().size()) {
                i -= 1;
                System.out.println(allMenu.get(j).getMenuItems().get(i).getName() + "| W " + allMenu.get(j).getMenuItems().get(i).getPrice() + " | " + allMenu.get(j).getMenuItems().get(i).getExplanation());
                System.out.println();
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }

    }

    /**
     * 초기화 시 메뉴데이터 설정
     */
    public void setAllMenu(Menu... Menus) {
        this.allMenu.addAll(Arrays.asList(Menus));
    }
}
