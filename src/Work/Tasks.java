package Work;
import java.lang.StringBuilder;
public class Tasks {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello java");

        int result = builder.indexOf("java");
        System.out.println(result);

        int result2 = builder.indexOf("l");
        System.out.println(result2);


    }
}