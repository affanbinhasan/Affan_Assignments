package LambdaAssignments;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Thread has started running");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        MyThread mythread = new MyThread();

        mythread.start();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Consumer<List<Integer>> displayList = test_list -> {
            for(int i = 0 ;i<list.size();i++){
                System.out.println(list.get(i));
            }
        };

        

        displayList.accept(list);
    }
}
