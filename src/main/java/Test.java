import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {


        IntStream.range(1,101).forEach(System.out::println);

        for(int i = 1; i <= 101; i++){
            System.out.println(i);
        }
    }
}
