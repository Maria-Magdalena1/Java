package Java_OOP.InterfacesAndAbstraction.CollectionHierarchy;

public class MyListImpl extends Collection implements MyList {
    @Override
    public int getUsed() {
        return this.items.size();
    }

    @Override
    public String remove() {
      String itemToRemove=this.items.getFirst();
      this.items.remove(itemToRemove);
      return itemToRemove;
    }

    @Override
    public int add(String item) {
        this.items.add(0, item);
        return 0;
    }
}
