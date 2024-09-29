import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,1,6,3,4,8,2,9,0};
        System.out.println("数组已初始化，请输入想查找的值: ");
        int num = sc.nextInt();
        if(findNumIndexOf(arr,num) == -1){
            System.out.println("未能在数组中找到对应值");
        }
        else{
            System.out.println("在数组{5,7,1,6,3,4,8,2,9,0}中找到对应值下标为："+findNumIndexOf(arr,num));
        }
    }

    static int findNumIndexOf(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
