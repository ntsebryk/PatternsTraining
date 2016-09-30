package patterns.gof.iterator;

/**
 * Created by ntsebryk on 30.09.2016.
 */
public class Item implements Container{
    private final int itemId;
    private String itemName;

    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object obj) {
        Item item;
        if(obj == null) return false;
        if(obj == this || ((obj instanceof Item) && (item = (Item) obj).itemId == this.itemId
                && item.itemName == this.itemName)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return itemId * itemName.length();
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
