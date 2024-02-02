import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();

    Lock lockForJ = new ReentrantLock();

    public void incrementI() {

       lockForI.lock(); //Get Lock i

        i++;

        lockForI.unlock();//Release Lock j

    }

    public int getI() {
        return i;
    }

   public void incrementJ() {

        lockForJ.lock();//Get Lock J

        j++;

        lockForJ.unlock();//Release Lock J

    }

    public int getJ() {
        return j;
    }
}
