package patterns.gof.iterator;

/**
 * Created by ntsebryk on 30.09.2016.
 */
public class IteratorDemo {
    public static void execute() {
        Item it1 = new Item(1, "First"), it2 = new Item(2, "Second"), it3 = new Item(2, "Second");
        ItemsMap itemsMap = new ItemsMap();
        itemsMap.addItem(it1);
        itemsMap.addItem(it2);
        itemsMap.addItem(it1);
        itemsMap.addItem(it3);
        Iterator it = itemsMap.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Distinct Iteration");
        itemsMap.getItemsList().stream().distinct().forEach(System.out::println);
    }
}
