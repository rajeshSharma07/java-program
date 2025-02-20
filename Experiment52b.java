
    class A implements Runnable{
        public void run(){
            for(int i=2;i<200;i=i+2){
                System.out.println(i);
                try{
                Thread.sleep(2000);
                }
                catch(Exception e){
                    System.err.println(e);
                }
    
            }
        }
    }
    class B implements Runnable{
        public void run(){
            for(int i=1;i<200;i=i+2){
                System.out.println(i);
                try{
                    Thread.sleep(5000);
                    }
                    catch(Exception e){
                        System.err.println(e);
                    }
            }
        }
    }
    
    public class Experiment52b {
        public static void main(String[] args) {
            Thread t1=new Thread(new A());
            Thread t2=new Thread(new B());
            t1.start();
            t2.start();
        }
    }

