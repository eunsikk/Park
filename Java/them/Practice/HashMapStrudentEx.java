package them.Practice;

import java.util.*;

class Student {
    int id;
    String tel;

    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}


public class HashMapStrudentEx {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        map.put("박성우", new Student(1, "010-6309-9926"));
        map.put("이은서", new Student(2, "010-9236-4751"));
        map.put("박선순", new Student(3, "010-6455-6386"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("검색할 이름?");
            String name = scanner.next();
            if (name.equals("exit")) {
                System.out.println("프로그램 종료한다.");
                break;
            }

            Student student = map.get(name);

            if (student == null) {
                System.out.println(name + "은 없는 사람입니다.");
            } else {
                System.out.println("id" + student.getId() + " / 전화" + student.getTel());
            }
            scanner.close();
        }
    }
}
