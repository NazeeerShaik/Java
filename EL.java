import java.lang.*;
import java.util.*;
public class EL{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int item:arr){
            System.out.println(item);
        }

    }
}
