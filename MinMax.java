import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값: ");
        int x = sc.nextInt();
        System.out.print("y값: ");
        int y = sc.nextInt();
        System.out.print("z값: ");
        int z = sc.nextInt();

        System.out.println("x,y의 최솟값은" + Min(x, y) + " 입니다. ");
        System.out.println("x,y의 최댓값은" + Max(x, y) + " 입니다. ");
        System.out.println("x,y,z의 최솟값은" + Min(x, y, z) + " 입니다. ");
        System.out.println("x,y,z의 최댓값은" + Max(x, y, z) + " 입니다. ");

        System.out.print("배열 a의 요소 수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        int xmin[] = MinIndexArr(a);
        int xmax[] = MaxIndexArr(a);
        System.out.println("배열 a의 최솟값은 " + min(a) + " 입니다.");
        System.out.print("인덱스는 { ");
        for (int i = 0; i < xmin.length; i++)
            System.out.print(xmin[i] + " ");
        System.out.println("} 입니다.");
        System.out.println("배열 a의 최댓값은" + max(a) + " 입니다.");
        System.out.print("인덱스는 { ");
        for (int i = 0; i < xmax.length; i++)
            System.out.print(xmax[i] + " ");
        System.out.println("} 입니다.");

    }

    public static int Min(int x, int y) {
        // if (x < y) {
        // return x;
        // } else {
        // return y;
        // }
        return x < y ? x : y;
    }

    public static int Max(int x, int y) {
        // if (x > y) {
        // return x;
        // } else {
        // return y;
        // }
        return x < y ? y : x;

    }

    public static int Min(int x, int y, int z) {
        // if (x < y && x < z) {
        // return x;
        // } else if (y < x && y < z) {
        // return y;
        // } else {
        // return z;
        // }
        int min = x;
        if (y < x)
            min = y;
        if (z < min)
            min = z;
        return min;

    }

    public static int Max(int x, int y, int z) {
        // if (x > y && x > z) {
        // return x;
        // } else if (y > x && y > z) {
        // return y;
        // } else {
        // return z;
        // }
        int max = x;
        if (y > x)
            max = y;
        if (z > max)
            max = z;
        return max;

    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static int[] MinIndexArr(int[] a) {
        int min = min(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                count++;
            }
        }
        int[] c = new int[count--];
        for (int i = a.length - 1; count >= 0; i--) {
            if (a[i] == min) {
                c[count--] = i;
            }
        }
        return c;
    }

    public static int[] MaxIndexArr(int[] a) {
        int max = max(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                count++;
            }
        }
        int[] c = new int[count--];
        for (int i = a.length - 1; count >= 0; i--) {
            if (a[i] == max) {
                c[count--] = i;
            }
        }
        return c;
    }
}
