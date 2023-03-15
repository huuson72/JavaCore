package String_Class;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;

public class Person {
  private String id;
  private String firstName;
  private String lastName;
  private String dob;
  private String pob;
  private char gender;
  private String homeTown;

  public Person(String id, String firstName, String lastName, String dob, String pob, char gender, String homeTown) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.pob = pob;
    this.gender = gender;
    this.homeTown = homeTown;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getPob() {
    return pob;
  }

  public void setPob(String pob) {
    this.pob = pob;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getHomeTown() {
    return homeTown;
  }

  public void setHomeTown(String homeTown) {
    this.homeTown = homeTown;
  }

  public static Person parse(String str) {
    String[] rs = str.split("\\|");
    char g = rs[5].charAt(0);
    if (g == '0') {
      g = 'm';
    } else if (g == '1') {
      g = 'f';
    } else {
      g = 'n';
    }
    Person p = new Person(
        rs[0], rs[1], rs[2], rs[3], rs[4], g, rs[6]);
    return p;
  }

  @Override
  public String toString() {
    return String.format("P[Id =%s,Full Name = %s %s,dob = %s ,pob= %s ,gender = %s,homeTown = %s]",
        id, firstName, lastName, dob, pob, gender, homeTown);
  }

  public static ArrayList<Person> parse(ArrayList<String> arrayStr) {
    ArrayList<Person> rPersons = new ArrayList<Person>();
    for (String s : arrayStr) {
      Person person = Person.parse(s);
      rPersons.add(person);
    }
    return rPersons;
  }

}
// Bieuthuc chinh quy
// regex101
