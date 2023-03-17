package decoratorpattern.component;

public abstract class Beverage {
  String description = "Unknown Beverage";
  String size = "medium";

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getDescription() {
    return description;
  }
  public abstract double cost();
}
