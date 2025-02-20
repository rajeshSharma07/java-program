public class SearchinRange {
    public static void main(String args[]){
    int  nums[] = {23,45,1,2,8,19,-3,16,28 };
    int target= 16;
     System.out.println(search(nums,target,1,7));
    }
    static int search(int arr[], int target, int start ,int end){
      if(target ==0){
        return -1;
      }
      for(int index=start;index<=end; index++){
        if(target== arr[index]){
            return index;

        }
      }
      return -1;
    }
}
