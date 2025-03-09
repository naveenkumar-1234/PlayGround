package tricky;
import java.util.concurrent.TimeUnit;
public class Demo {
    public static void main(String[] args) {
        while(true){
            long startTime = System.nanoTime();
//            long a = 10E9;
            System.out.println(startTime);
            System.out.println(System.currentTimeMillis());
            System.out.println(startTime/1000000000);
            if(startTime / 1_000_000_000 <= 10){
                System.out.println(startTime / 1_000_000_000.0);
            }else{
                System.out.println("exited");
                break;
            }

        }
    }
}
