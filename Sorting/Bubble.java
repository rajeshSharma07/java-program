

 package Sorting;
import java.util.Arrays;
public class Bubble {
    public static void main(String args[]){
        int arr[]={3,4,1,2,8,7};
        Array(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Array(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){        // if you have to make it in desceding order then make the symble "">""
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
