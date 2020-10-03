import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sort(arr);
        sc.close();
    }
    public static void sort(int[] arr) {
        int zero=0;
        int one=0;
        // int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == zero)
                zero++;
            if(arr[i]==one)
                one++;
            // if(arr[i]==two)
            //     two++;
        }
        for(int i=0;i<zero;i++)
            arr[i] = 0;
        
        for(int i=zero;i<(zero+one);i++)
            arr[i] = 1;

        for(int i=(zero+one);i<arr.length;i++)
            arr[i] = 2;

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
