package src;

/**
 * @author:Fcs
 * @className:test
 * @description:
 * @date:2022/8/29 15:00
 * @version:0.1
 * @since:1.8
 */
public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        arr = copy(arr);
        System.out.println(arr);
        System.out.println(arr.toString());
    }
    public static int[] copy(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
            arr2[i] = arr[i];
        return arr2;
    }
}
