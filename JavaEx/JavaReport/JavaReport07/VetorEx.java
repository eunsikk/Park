package JavaEx.JavaReport.JavaReport07;

import java.util.*;

public class VetorEx {
    public void printBig(Vector<Integer> v) {
        int big = v.get(0);
        for (int i = 0; i < v.size(); i++) {
            if (big < v.get(i)) {
                big = v.get(i);
            }
        }
    }

    public static void main(String[] args) {
        VetorEx ob = new VetorEx();
        Vector<Integer> v = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요(0을 입력하면 입력을 종료합니다다)");
        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            } else if (x >= 1000) {
                System.out.println("1000미만의 수를 입력하세요");
            } else {
                v.add(x);
            }
            ob.printBig(v);
        }
    }
}



// public class VetorEx {
// public static void printVector(Vector<Integer> v) {
// for (int i = 0; i < v.size(); i++) {
// int n = v.get(i);
// System.out.println(n);
// }
// }

// public static void main(String[] args) {
// Vector<Integer> v = new Vector<Integer>();

// v.add(5);
// v.add(12);
// v.add(15);
// printVector(v);
// }
// }
