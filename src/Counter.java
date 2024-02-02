public class Counter {

    int i;

    synchronized public void increment() {  //This Synchronized makes thread safe & Make sure 1 thread runs at a time.

        i++;
        //get i
        //increment
        //set i

        //


    }

    public int getI() {
        return i;
    }

}
