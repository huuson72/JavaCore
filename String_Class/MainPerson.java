package String_Class;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPerson {
  public static void main(String[] args) {
     String p = "101|Nguyen|Nam|2000|Hue|0|Hue";
     Person person = Person.parse(p);
     System.out.println(person.toString());
     String s1 = "a";
     String s2 = "b";
     ArrayList<String> ls = new ArrayList<String>();
     ls.add(s1);
     ls.add(s2);
//    try {
//      // Doc file
//      File file = new File("D:\\sinhvien.txt.txt");
//      Scanner scanner;
//      scanner = new Scanner(file);
//      ArrayList<String> lsStr = new ArrayList<String>();
//
//      while (scanner.hasNext()) {
//        String s = scanner.nextLine();
//        lsStr.add(s);
//
//        // System.out.println(s);
//      }
//      ArrayList<Person> lsPerson = Person.parse(lsStr);
//      for (Person person : lsPerson) {
//        System.out.println(person.toString());
//      }
//      StaticticsPerson s = new StaticticsPerson(lsPerson);
//      System.out.println("So luong nam la: " + s.getGender('m'));
//      StaticticsPerson d = new StaticticsPerson(lsPerson);
//      System.out.println("So luong nguoi o Hue : " + d.getPob("Hue"));
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }

  }

}
