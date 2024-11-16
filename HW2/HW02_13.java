import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入矩阵行数: ");
        int rows = sc.nextInt();
        System.out.println("输入矩阵列数: ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[cols][rows];

        System.out.println("输入矩阵：");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                b[j][i] = a[i][j];
            }
        }
        //转置操作
        System.out.println("矩阵转置后为 ");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}