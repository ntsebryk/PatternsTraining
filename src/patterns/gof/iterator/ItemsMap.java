package patterns.gof.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ntsebryk on 30.09.2016.
 */
public class ItemsMap implements Container{
    private final List<Item> itemsList;

    public List<Item> getItemsList() {
        return itemsList;
    }

    public ItemsMap(List<Item> list) {
        this.itemsList = list;
    }

    public ItemsMap() {
        this(new ArrayList<>());
    }

    public boolean addItem(Item item) {
        return itemsList.add(item);
    }

    @Override
    public Iterator getIterator() {
        return new ItemsIterator(itemsList);
    }

    private class ItemsIterator implements Iterator {
        private java.util.Iterator<Item> it;

        public ItemsIterator(List<Item> list) {
            it = list.iterator();
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Object next() {
            return it.next();
        }
    }
}
