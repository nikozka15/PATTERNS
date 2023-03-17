package template.caffeinebeverage;

public class Main {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("template.caffeinebeverage.Tea: ");
    tea.prepareRecipe();
    System.out.println("template.caffeinebeverage.Coffee: ");
    coffee.prepareRecipe();
  }
}