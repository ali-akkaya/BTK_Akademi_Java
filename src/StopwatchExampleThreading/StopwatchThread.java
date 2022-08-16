package StopwatchExampleThreading;

public class StopwatchThread implements Runnable{

    private Thread _thread;
    private String _threadName;

    public StopwatchThread(String threadName){
        _threadName = threadName;
        System.out.println("Thread is creating:"+_threadName);
    }
    @Override
    public void run() {
        System.out.println("Thread is running"+ _threadName);


        try{

            for (int i = 0; i <=10; i++) {
                System.out.println(_threadName +"  "+i );
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException exception){
            System.out.println("Thread broken: "+ _threadName);
            exception.getStackTrace();
        }

        System.out.println("Thread is over:" +_threadName);



    }

    public void start(){
        System.out.println("Thread Object is creating");

        if(_thread==null){
            _thread = new Thread(this,_threadName);
            _thread.start();
        }
    }
}
