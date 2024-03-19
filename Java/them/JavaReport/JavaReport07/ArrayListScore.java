package them.JavaReport.JavaReport07;

import java.util.*;

public class ArrayListScore {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("A~F까지의 학점만을 입력하세요 >>");

        for (int i = 0; i < 6; i++) {
            String s = scanner.nextLine();
            if (s.length() > 1) {
                System.out.println("학점을 1개만 입력하세요.");
                scanner.close();
                return;
            }

            char ch = s.charAt(0);
            if (ch >= 'A' && ch <= 'E' || ch == 'F') {
                list.add(ch);
            } else {
                System.out.println("A,B,C,D,E,F까지의 학점만 입력이 가능합니다");
                scanner.close();
                return;
            }
        }

        Double score = 0.0;
        for (int i = 0; i < list.size(); i++) {
            char s = list.get(i);
            switch (s) {
                case 'A':
                    score += 4.0;
                    break;
                case 'B':
                    score += 3.0;
                    break;
                case 'C':
                    score += 2.0;
                    break;
                case 'D':
                    score += 1.0;
                    break;
                case 'F':
                    score += 0.0;
                    break;
            }
        }
        System.out.println(score / list.size());
        scanner.close();
    }
}
