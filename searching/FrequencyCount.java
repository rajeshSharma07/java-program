import java.util.HashMap;
import java.util.HashSet;
public class FrequencyCount {
    public static void main(String[] args){
        int [] arr={1,2,2,1,1,3};
        boolean ans= UniqueElement(arr);
        System.out.println(ans);
    }
    public static boolean UniqueElement(int[] arr){
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num :arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        HashSet<Integer>count = new HashSet<>();
        for(int countValues:freq.values()){
            count.add(countValues);
        }
        if(freq.size()!=count.size()){
            return false;
        }
        return true;
}
}
