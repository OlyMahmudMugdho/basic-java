import java.util.Vector;

public class Main {


    public static void main(String[] args) {
        System.out.println("Vector Practice");
        Vector<Integer> numsVector = new Vector<>();

        numsVector.add(0,88);
        numsVector.add(1,86);
        numsVector.add(96);
        numsVector.add(100);
        // gets an item using index
        System.out.println(numsVector.get(1));

        // gets the index of an element from value
        System.out.println(numsVector.indexOf(96));

        // removes an element and gets the removed element
        System.out.println(numsVector.remove(3));

        System.out.println("Printing the rest of the vector elements : ");
        for(Object num : numsVector){
            System.out.println(num);
        }

        // changing element in a vector
        System.out.println("Now changing an element");

        numsVector.set(1,74);

        System.out.println("After changing : ");

        for(Object num : numsVector){
            System.out.println(num);
        }

        // size of the vector
        System.out.println("Size of the vector is : " + numsVector.size());

        // converting to string
        System.out.println(numsVector.toString());

        // converting to array
        
    }
}