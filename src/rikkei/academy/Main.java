package rikkei.academy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //  kiem thu comparable
        ComparableCircle[] circles =new ComparableCircle[3];
        circles[0] =new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] =new ComparableCircle("red",true,4);

        System.out.println("Pre-sorted: " );
        for (ComparableCircle comparableCircle: circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println(" After-sorted: ");
        for (ComparableCircle comparableCircle: circles) {
            System.out.println(comparableCircle);
        }
    }
}

