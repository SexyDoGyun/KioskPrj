package challengeLv1.domain.menu;

import challengeLv1.domain.cart.CartService;

import java.util.List;

/**
 * MenuService 클래스는 메뉴를 콘솔에 출력하는 기능을 담당합니다.
 */
public class MenuService {

    public void showMainMenu(List<Menu> menus, CartService cartService) {
        System.out.println("=====================================================================");
        System.out.println("[                             MAIN MENU                             ]");

        // 카테고리별 메뉴 출력
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i+1) + ". " + menus.get(i).getMenuCategory());
        }
        System.out.println("0. 종료      | 종료");

        // 장바구니가 비어있으면 보여지지않고, 비어있지 않으면 보여줍니다.
        if (!cartService.isCartEmpty()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders     | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel     | 진행중인 주문을 취소합니다.");
        }
        System.out.println("=====================================================================");

    }

    // 특정 카테고리의 메뉴 출력
    public void showMenuItems(Menu menu) {
        System.out.println("=====================================================================");
        System.out.println("[ " + menu.getMenuCategory() + " MENU ]");
        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            System.out.println((i + 1) + ". " + menu.getMenuItems().get(i).getFoodName() + "   | " + menu.getMenuItems().get(i).getPrice() + " | " + menu.getMenuItems().get(i).getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.println("=====================================================================");
        System.out.println();
    }
}
