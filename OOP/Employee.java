package OOP;


public class Employee {
  int id;
  String firstName;
  String lastName;
  int salary;
 public int getId() {
   return id;
 }
 public void setId(int id) {
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
 public int getSalary() {
   return salary;
 }
 public void setSalary(int salary) {
   this.salary = salary;
 }
 
 public Employee(int id, String firstName, String lastName, int salary) {
   this.id = id;
   this.firstName = firstName;
   this.lastName = lastName;
   this.salary = salary;
 }
 public String getname() {
   return String.format("%s %s", firstName,lastName);
 }
 public  int getAnnualSalary() {
   return salary * 12;
 }
 public int raiseSalary(int percent) {
     return salary + salary * percent/100;
 }
 @Override
   public String toString() {
     return String.format("employee[id =%d,name = %s %s, salary=%d]", id,firstName,lastName,salary);
   }
   
 
 }
 