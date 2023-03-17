package iterator.menu;

import iterator.menu.agregate.Menu;

import java.util.ArrayList;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

  // menuiterator.Waitress waitress = new menuiterator.Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
  //waitress.printMenu();

    ArrayList<Menu> menu = new ArrayList<>();
    menu.add(pancakeHouseMenu);
    menu.add(dinerMenu);
    menu.add(cafeMenu);
    Waitress waitress = new Waitress(menu);
    waitress.printMenu();
  }
}
