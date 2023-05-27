public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello from the main Thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start(); // this starts the second thread.
//        anotherThread.start();// putting a second start will throw IllegalThreadStateException.

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"Hello from anonymous class");
            }
        }.start(); // this is anonymous start of a thread. it can be replaced with lambda.


        System.out.println("Hello again from the main thread.");
        //Thread as we mentioned before, don't have an execution.
        //We will have to make the thread specifically with orders.
        //Whenever we want to start a subThread, we have to make another instance of that particular thread.

//        Thread anotherThread1 = new AnotherThread();
//        anotherThread1.start(); // here is the example.

    }
}
