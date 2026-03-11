/**
 * @author:Fcs
 * @className:YangHuiSanJiao
 * @description:
 * @date:2021/7/6 13:01
 * @version:0.1
 * @since:1.8
 */
public class YangHuiSanJiao {
    public static  void main (String[] args){
        int[][] arr = new int[5][];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] =1;
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
