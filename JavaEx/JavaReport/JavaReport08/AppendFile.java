package JavaEx.JavaReport.JavaReport08;

import java.io.*;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fReader = null;
        FileWriter fWriter = null;

        System.out.println("전체 경로를 포함한 첫 번째 파일 이름을 입력하세요. 파일을 읽은 후 두 번째 파일 뒤에 붙입니다.");
        System.out.print("첫 번째 파일 이름을 입력하세요>>");
        String s1 = scanner.nextLine();

        System.out.print("두 번째 파일 이름을 입력하세요>>");
        String s2 = scanner.nextLine();

        try {
            fReader = new FileReader(s1);
            fWriter = new FileWriter("appended.txt", true);
            writeToFile(fReader, fWriter);
            fReader.close();

            fReader = new FileReader(s2);
            writeToFile(fReader, fWriter);

            fReader.close();
            fWriter.close();
            System.out.println("두 파일을 성공적으로 병합하여 appended.txt 파일에 저장하였습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
        scanner.close();
    }

    private static void writeToFile(FileReader in, FileWriter out) throws IOException {
        char[] buf = new char[50];
        int count = 0;
        while (true) {
            count = in.read(buf, 0, buf.length);
            if (count == -1)
                break;
            if (count > 0) {
                out.write(buf, 0, count);
            }
        }
    }
}
