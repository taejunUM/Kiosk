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
                        new MenuItem("Coke-Cola", 3.5, "시원~한 코카콜라"),
                        new MenuItem("Lemonade", 5.2, "매장에서 직접 만드는 상큼한 레몬에이드"),
                        new MenuItem("Shack Coffee", 5.9, "쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피"),
                        new MenuItem("Shack Latte", 6.4, "쉑 블렌드 원두로 내린 에스프레소에 부드러운 우유를 더한 라떼")),
                new Menu("Sides",
                        new MenuItem("Sichuan Crisp Fries", 6.5, "플레이버타운의 스파이스 시즈닝과 칠리 크리스프 오일, 고소한 치즈 소스가 토핑된 크링클 컷 프라이"),
                        new MenuItem("Fries", 4.9, "바삭하고 담백한 크링클 컷 프라이"),
                        new MenuItem("Cheese Fries", 6.0, "고소하고 진한 치즈 소스를 듬뿍 올린 크링클 컷 프라이"),
                        new MenuItem("Cup & Cones", 5.7, "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)"))
        );


        kiosk.start();

    }
}