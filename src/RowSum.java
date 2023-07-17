import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];
        for(int i=0;i<rowsize;i++){
            int sum=0;
            for (int j=0;j<colsize;j++){
                mat[i][j]=scan.nextInt();
                sum+=mat[i][j];
            }
            System.out.println(sum);
        }
    }
}
