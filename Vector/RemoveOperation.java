import java.util.Vector;

public class RemoveOperation {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        animals.add("Cat");
        animals.add("Cow");
        animals.add("Lion");


        // printing all the values
        for (Object n :
                animals) {
            System.out.println(n);
        }

        System.out.println("Now it's time to delete everything");

        // clearing the whole vector by using clear()
        animals.clear();

        // we can also use removeAll()

        try {
            System.out.println(animals.get(0)); // produces exception
        }
        catch (Exception e) {
            System.out.println("showing exception");
        }
    }
}
