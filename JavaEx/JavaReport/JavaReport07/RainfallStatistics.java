package JavaEx.JavaReport.JavaReport07;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class RainfallStatistics {

    private void print(Vector<Double> v) {
        Double sum = 0.0;
        Iterator<Double> it = v.iterator();
        while (it.hasNext()) {
            Double fallRain = it.next();
            sum += fallRain;
        }

        System.out.println();
        System.out.println("현재 강수량의 평균: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Double> v = new Vector<Double>();
        System.out.println("강수량을 입력해주세요.(0.1부터 가능) >> ");
        while (true) {
            Double fallRain = scanner.nextDouble();
            if (!scanner.hasNextDouble()) {
                System.out.println("숫자만을 입력하세요.");
                return;
            } else {
                v.add(fallRain);
            }
        }

        print(v);
    }
}
