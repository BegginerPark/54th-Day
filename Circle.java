import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("실수값: ");
        double x = sc.nextDouble();

        System.out.println("절대값: " + Math.abs(x));
        System.out.println("제곱근: " + Math.sqrt(x));
        System.out.println("면 적: " + Math.PI * x * x);

    }
}

// class Cal {
// double abs;
// double squr;
// double area;

// public Cal(double abs, double squr, double area) {
// this.abs = abs;
// this.squr = squr;
// this.area = area;
// }

// }