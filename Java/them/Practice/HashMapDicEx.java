package them.Practice;

import java.util.*;

public class HashMapDicEx {

    public static void main(String[] args) {
        HashMap<String, String> dct = new HashMap<>();

        dct.put("baby", "아기");
        dct.put("sonny", "손흥민");
        dct.put("chan", "황희찬");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("찾고 싶은 단어가 있나요? (종료시 exit)");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            String kor = dct.get(eng);
            if (kor == null) {
                System.out.println(eng + "는 없는 단어 입니다.");
                System.out.println("계속 진행하시겠습니까? y/n");
                Scanner scanner2 = new Scanner(System.in);
                String judge = scanner.next();
                if (judge.equals("n") || judge.equals("N")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } else {
                System.out.println(kor);
            }
        }
    }
}
