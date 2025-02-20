package Binarysearch;
public class BinarySearchDessending {
    public static void main(String args[]){
    int nums [] = {9,8,7,6,5,4,3,2,1};
    int target = 8;
    int ans = binarySearchDessending(nums, target);
    System.out.println(ans);
  }  
  static int binarySearchDessending(int nums[], int target){
    int start = 0;
     int end = nums.length-1;
     while(start<=end){
        int mid = start + (end - start)/2;
        if (target>nums[mid]){
            end =mid -1;
        }
        else if(target<nums[mid]){
            start = mid +1;
        }
        else{
            return mid;
        }
     }
     return -1;
  }
}
