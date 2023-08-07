
class Math<Thing extends Number> {
    public Thing obj1;
    public Thing obj2;
    Math(Thing obj1, Thing obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void showVal() {
        System.out.println(obj1 + "," + obj2);
    }

    public Thing sum() {
        if ((obj1 instanceof Integer) && (obj2 instanceof Integer)){
            return (Thing) Integer.valueOf(obj1.intValue() +obj2.intValue());
        }
        return (Thing) Integer.valueOf(-1);
    }
}

public class Main {
    public static void main(String[] args) {
        Math<Integer> num1 = new Math<>(5,3);
        int sum = num1.sum();
        System.out.println(sum);

        System.out.println("Dynamic Array");

        DynamicArray<Integer> numArr = new DynamicArray<>();
        numArr.add(10);
        numArr.add(1);
        numArr.add(3);
        numArr.show();
        numArr.remove(1);
        System.out.println("After removing");
        numArr.show();
        System.out.println("Again adding");
        numArr.add(100);
        numArr.add(465);
        numArr.add((1005));
        System.out.println("Showing the final values");
        numArr.show();
        System.out.println("Length : " + numArr.getLength());

        System.out.println(numArr.nums.length);
    }
}