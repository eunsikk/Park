package them.JavaReport.JavaReport07;

import java.util.*;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> list = new ArrayList<Student>();

    private void read() {
        System.out.println("학생의 이름,학과,학번,학점평균을 입력하세요.");
        for (int i = 0; i < 3; i++) {
            String info = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(info, ",");
            if (st.countTokens() != 4) {
                System.out.println("이름,학과,학번,학점평균의 4개 인자를 입력하세요.");
                i--;
                continue;
            }
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            Double grade = Double.parseDouble(st.nextToken().trim());

            Student student = new Student(name, department, id, grade);
            list.add(student);
        }
    }

    private void writeAll() {
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println("-------------------------------");
            System.out.println("이름: " + student.getName());
            System.out.println("학과: " + student.getDepartment());
            System.out.println("학번: " + student.getId());
            System.out.println("이름: " + student.getGrade());
            System.out.println("-------------------------------");
        }
    }

    private void processQuery() {
        while (true) {
            System.out.print("학생의 이름을 입력하세요(종료시 finish 입력)>> ");
            String name = scanner.nextLine();
            if (name.equals("finish")) {
                return;
            }

            boolean focus = false;
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                if (name.equals(student.getName())) {
                    System.out.println("이름: " + student.getName());
                    System.out.println("학과: " + student.getDepartment());
                    System.out.println("학번: " + student.getId());
                    System.out.println("학점: " + student.getGrade());
                    focus = true;
                    break;
                }
            }

            if (!focus) {
                System.out.println("입력한 이름의 학생이 존재하지 않습니다.");
            }
        }
    }

    public void run() {
        read();
        writeAll();
        processQuery();
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.run();
    }
}
