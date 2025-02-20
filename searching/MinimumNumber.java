 class MinimumNumber {
    public static void main(String args[]){
     int arr[] = {18, 12, -7, 3, 14, 29, };
     System.out.println(min(arr));
    }
    public static int min(int arr[]){
        int number= arr[0];
      for( int index =0; index<arr.length;index++){
         if(arr[index]<number){
             number=arr[index];
         }
      }
      return number;
    }
}
