// 15) Write a program to generate more than two threads.

class ThreadA extends Thread{
    public void run(){
        for(int i=1; i<4; i++){
            System.out.println("Running thread " +i+ " from class ThreadA");
        }
        System.out.println("Exited from class ThreadA");
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int j=1; j<4; j++){
            System.out.println("Running thread " +j+ " from class ThreadB");
        }
        System.out.println("Exited from class ThreadB");
    }
}

class ThreadC extends Thread{
    public void run(){
        for(int k=1; k<4; k++){
            System.out.println("Running thread " +k+ " from class ThreadC");
        }
        System.out.println("Exited from class ThreadC");
    }
}
public class multiThreads {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC cRunnable = new ThreadC();
        Thread c = new Thread(cRunnable);
        a.start();
        b.start();
        c.start();
    }
}
