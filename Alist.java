import java.util.*;
import java.io.*;
import java.math.*;
public class Alist{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>(5);
        for(int i=0;i<5;i++){
            int temp=(int)(Math.random()*10);
            arr.add(temp);
        }
        System.out.print(arr);
        Collections.sort(arr);
        System.out.print(arr);
    }
}
