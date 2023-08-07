import java.util.Arrays;
public class DynamicArray<T> {
    public Object[] nums;
    private int size = 0;
    DynamicArray() {
        this.nums = new Object[3];
    }

    DynamicArray(int highest_length) {
        this.nums = new Object[highest_length];
    }
    public void add(T num) {
        if (size == nums.length){
            resize();
        };
        this.nums[size] = num;
        size++;
    }

    public void show() {
        for (int i=0; i < size; i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }
    }

    public void remove(int index){
        if (index < 0 || index>=size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }

        for (int n=index; n<size; n++){
            if ((n+1)==size){
                break;
            }
            nums[n] = nums[n+1];
        }
        nums[size-1] = null;
        size--;
    }

    public void resize() {
        System.out.println("Size : " + nums.length);
        nums = Arrays.copyOf(nums,size*2);
        System.out.println("resize() executed");
        System.out.println("Now size is : " + nums.length);
    }

    public int getLength(){
        return size;
    }

    public int getBareMetalLength(){
        return nums.length;
    }

}
