 class LinearSearch {
   public static void main(String args[]){
  int  nums[] ={23,45,1,2,8,19,-3,16,28 };
  int target =-11;
  boolean ans=lsearch(nums,target);
  System.out.println(ans);
   }
    static boolean lsearch(int arr[], int target) {
    if(arr.length==0){
        return false;
    }
    //for(int index =0; index<=arr.length-1;index++){
       // if(arr[index]== target){
      //      return true;
      //  }
      for (int element: arr){
        if(element==target){
            return true;
        }
      }
    //}
    return false;
   }
}
