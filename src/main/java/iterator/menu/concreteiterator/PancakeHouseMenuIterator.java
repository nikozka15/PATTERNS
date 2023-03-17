package iterator.menu.concreteiterator;

import iterator.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenuIterator implements Iterator {
  ArrayList<MenuItem> items;
  int position = 0;
  public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
    this.items = items;
  }
  @Override
  public boolean hasNext() {
    return position < items.size();
  }
  @Override
  public Object next() {
    MenuItem item = items.get(position);
    position += 1;
    return item;
  }
  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException
        ("You can’t remove an item until you’ve done at least one next()");
    }
    if (items.get(position-1) != null) {
      for (int i = position-1; i < (items.size()-1); i++) {
        items.set(i, items.get(i+1));
      }
      items.set(items.size()-1, null);
    }
  }
}
