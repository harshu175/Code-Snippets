//code snippet for taking an array as input
//save this as *arr_input*
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int size_of_array=scn.nextInt();
        int[] arr=new int[size_of_array];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
     }
}
        
