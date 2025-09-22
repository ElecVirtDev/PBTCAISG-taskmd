import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ch14FinalTask {

  public static void main(String[] args) throws Exception {
    int x = 0;
    boolean run = true;
    Scanner scanner = new Scanner(System.in);

    writeList();
    List<Board> list = readList();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println();

    while (run) {
      try {
        System.out.println(
          "--------------------------------------------------------------------------------"
        );
        System.out.println(
          "1. 목록보기 | 2. 상세보기 | 3. 수정하기 | 4. 삭제하기 | 5. 파일저장 | 6. 종료"
        );
        System.out.println(
          "--------------------------------------------------------------------------------"
        );
        System.out.print("선택: ");

        x = Integer.parseInt(scanner.nextLine());
        if (x < 1 || x > 6) {
          System.out.println("올바른 숫자를 입력하십시오!");
          continue;
        }

        switch (x) {
          case 1:
            for (Board board : list) {
              System.out.println(board.getBno() + "\t" + board.getTitle());
            }
            break;
          case 2:
            for (Board board : list) {
              System.out.println(
                board.getBno() +
                "\t" +
                board.getTitle() +
                "\t" +
                board.getContent() +
                "\t" +
                board.getWriter() +
                "\t" +
                sdf.format(board.getDate())
              );
            }
            break;
          case 3:
            System.out.print("수정하려는 게시글 번호: ");
            x = Integer.parseInt(scanner.nextLine());

            System.out.print("제목 수정: ");
            String str1 = scanner.nextLine();

            System.out.print("내용 수정: ");
            String str2 = scanner.nextLine();

            System.out.print("글쓴이 수정: ");
            String str3 = scanner.nextLine();
            list.set(x, new Board(x, str1, str2, str3, new Date()));
            System.out.println("수정이 완료되었습니다.");
            break;
          case 4:
            System.out.print("삭제하려는 게시글 번호: ");
            x = Integer.parseInt(scanner.nextLine());
            list.remove(x);
            System.out.println("삭제되었습니다.");
            break;
          case 5:
            FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
            System.out.println("저장이 완료되었습니다.");
            break;
          case 6:
            run = false;
            break;
          default:
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println(
          "유효하지 않은 숫자가 입력되었습니다. 다시 시도하세요."
        );
      } catch (IndexOutOfBoundsException e) {
        System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
      } catch (Exception e) {
        System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
      }
      System.out.println();
    }
    System.out.println("프로그램 종료");
  }

  public static void writeList() throws Exception {
    List<Board> list = new ArrayList<>();

    try {
      FileInputStream fis = new FileInputStream("C:/Temp/board.db");
    } catch (FileNotFoundException e) {
      list.add(new Board(0, "제목1", "내용1", "글쓴이1", new Date()));
      list.add(new Board(1, "제목2", "내용2", "글쓴이2", new Date()));
      list.add(new Board(2, "제목3", "내용3", "글쓴이3", new Date()));

      FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(list);
      oos.flush();
      oos.close();
    }
  }

  public static List<Board> readList() throws Exception {
    FileInputStream fis = new FileInputStream("C:/Temp/board.db");
    ObjectInputStream ois = new ObjectInputStream(fis);
    List<Board> list = (List<Board>) ois.readObject();
    return list;
  }
}
