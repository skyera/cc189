public class ReverseArray
{
    static public void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }

    static public void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
