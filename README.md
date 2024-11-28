# 1. Kisok
## kiosk는 애플리케이션의 핵심 로직을 담당합니다.
- `allMenu: List<Menu>` 형식의 모든 메뉴 데이터를 저장합니다.
### - 메서드
  - `start()` 메인 프로그램 실행합니다. 사용자가 입력한 데이터를 처리하여 메뉴 탐색, 선택, 종료 기능 제공
  - `setAllMenu(Menu...menus)` 초기화시 메뉴 데이터를 설정

# 2. Menu
## Menu의 카테고리와 카테고리에 속한 목록을 관리하는 클래스입니다.
- `menuItems` 헤당 메뉴의 메뉴 목록을 저장합니다.
- `category` 메뉴 카테고리 이름입니다.
### - 메서드
- `getMenuItems()` 메뉴 목록을 반환합니다.
- `getCategory()` 카테고리 이름을 반환합니다.

# 3. MenuItem
## MenuItem의 세부 정보를 저장하는 클래스입니다.
- `name` 메뉴 이름
- `price` 메뉴 가격
- `explanation` 메뉴 설명
### - 메서드
- `getName()` 메뉴 이름을 반환합니다.
- `getPrice()` 메뉴 가격을 반환합니다.
- `getExplanation()` 메뉴 설명을 반환합니다.

# 4. Main
## Kiosk 클래스를 실행하는 프로그램을 시작합니다.
- `main(String[] args)` Kiosk 객체를 생성하고 메뉴 데이터를 설정한 후 프로그램을 실행합니다.
