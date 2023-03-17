package adapter.simple.enumerationiterator;

import java.util.ArrayList;
import java.util.Enumeration;

public class TestDemo {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList<>();
    arrayList.add("cat");
    arrayList.add("dog");
    arrayList.add("frog");
    Enumeration enumeration = new IteratorEnumeration(arrayList.iterator());
    
    System.out.println(enumeration.hasMoreElements());
    System.out.println(enumeration.nextElement());

  }
}
