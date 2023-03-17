package template.caffeinebeverage;

public abstract class CaffeineBeverage {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }
abstract void brew();
  abstract void addCondiments();
  public final void boilWater(){
    System.out.println("Boiling water");
  }
  public final void pourInCup() {
    System.out.println("Pouring into cup");
  }
    boolean customerWantsCondiments() {
      return true;
    }
}
