//program to test even and odd thread using thread communication
public class OddEvenPrintMain {
 
    boolean odd;//intialize 
    int count = 1;
    int MAX = 10;
 
    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");
 
                while (!odd) {
                    try // to check thread whther it is odd or even
{
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                      
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }
 
    public void printEven() {
 
        try {
            Thread.sleep(1000);
} catch (InterruptedException e1) {
           
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking even loop");
 
                while (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();
 
            }
        }
    }
 
    public static void main(String[] args) {
OddEvenPrintMain oep = new OddEvenPrintMain();//call function
        oep.odd = true;
        
          Thread t1=new Thread(new Runnable()
{
  
            public void run() {
                oep.printEven();
 
            }
        });
        
         Thread t2=new Thread(new Runnable()
{  
            public void run() {
                oep.printOdd();
 
            
        }
 });
        t1.start();//to start thread excutes
        t2.start();
 
       
 
    }
}
 