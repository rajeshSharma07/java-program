
    class NegativeAmountException extends Exception {
        public NegativeAmountException(String message) {
            super(message);
        }
    }
    
    public class Experiment5 {
        public static void main(String[] args) {
            try {
                double amount = -100; 
                if (amount < 0) {
                    throw new NegativeAmountException("Negative amount entered: " + amount);
                }
            
            } catch (NegativeAmountException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }
    

