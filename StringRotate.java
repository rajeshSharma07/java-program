public class StringRotate {
    public static void main(String args[]){
        StringBuilder sb =new StringBuilder("Hello");
        for(int i=0; i<sb.length()/2;i++){
            int front=i;
            int back =sb.length() - 1-i;
           

            char frontn=sb.charAt(front);
            char backn=sb.charAt(back);

            sb.setCharAt(front,backn);
            sb.setCharAt(back, frontn);
        }
        System.out.println(sb);
    }
}
 