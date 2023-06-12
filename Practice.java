import java.util.Scanner;

class Practice {
    static void sayHello() {
        System.out.println("Hi Mom!");
    }

    public static void main(String[] args) {
        sayHello();

        double marks = 67.93;
        int num = (int) marks;

        System.out.println(num);

        int[] nums = new int[2];
        System.out.println("The size of the array is " + nums.length);

        Scanner numScanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the number-" + (i + 1));
                nums[i] = numScanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("oops..you made a mistake..because of " + error);
        }

        numScanner.close();

        int n = 1;

        try {
            while (n <= 5) {
                System.out.print(nums[n - 1] + ", ");
                n++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Another misatke ...  " + e);
        }

        System.out.println();
        

        Animal cat = new Animal("Tom : The Cat", 4);
        cat.eat();
    }
}

class Animal {
    private String name;
    private int legs;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public int getAge() {
        return legs;
    }

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
}
