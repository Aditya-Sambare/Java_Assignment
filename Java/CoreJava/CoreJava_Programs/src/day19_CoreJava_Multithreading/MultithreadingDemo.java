package day19_CoreJava_Multithreading;
class ThreadDemo extends  Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("current Thread :: " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
}
public class MultithreadingDemo {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();
        ThreadDemo threadDemo3 = new ThreadDemo();
        //threadDemo1.display();
        threadDemo1.setPriority(1);
        threadDemo2.setPriority(10);
        threadDemo3.setPriority(5);
        threadDemo1.start();
        threadDemo1.setName("A");
        threadDemo2.start();
        threadDemo2.setName("B");
        threadDemo3.start();
        threadDemo3.setName("C");
    }
}
