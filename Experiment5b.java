public class Experiment5b {
        public static void main(String[] args) {
            Runnable even = new EvenRunnable();
            Runnable odd = new OddRunnable();
            Thread evenThread = new Thread(even, "Even Thread");
            Thread oddThread = new Thread(odd, "Odd Thread");
            evenThread.start();
            oddThread.start();
        }
    }
    class EvenRunnable implements Runnable {
        public void run() {
            try {
                for (int i = 0; ; i += 2) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    Thread.sleep(2000); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    class OddRunnable implements Runnable {

        public void run() {
            try {
                for (int i = 1; ; i += 2) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    

