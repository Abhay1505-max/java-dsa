import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int[] arr={1,3,5,7,8}; 
        buble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void buble(int [] arr,int r,int c){
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            buble(arr,r,c+1);
        }
        else{
            buble(arr,r-1,0);
        }
    }
