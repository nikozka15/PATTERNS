package iterator.menu;

import iterator.menu.agregate.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
//  agregate.Menu pancakeHouseMenu;
//  agregate.Menu dinerMenu;
//  agregate.Menu cafe;
  ArrayList menus;

  public Waitress(ArrayList menus) {
    this.menus = menus;
  }

//  public menuiterator.Waitress(agregate.Menu pancakeHouseMenu, agregate.Menu dinerMenu, agregate.Menu cafe) {
//    this.pancakeHouseMenu = pancakeHouseMenu;
//    this.dinerMenu = dinerMenu;
//    this.cafe = cafe;
//  }

  public void printMenu() {
    for (Object o : menus) {
      Menu menu = (Menu) o;
      System.out.println(menu.getClass().toString());
      printMenu(menu.createIterator());
    }
//    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//    Iterator dinerIterator = dinerMenu.createIterator();
//    Iterator cafeIterator = cafe.createIterator();
//    System.out.println("MENU\n----\nBREAKFAST");
//    printMenu(pancakeIterator);
//    System.out.println("\nLUNCH");
//    printMenu(dinerIterator);
//    System.out.println("MENU\n----\nCAFE");
//    printMenu(cafeIterator);
  }
  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
