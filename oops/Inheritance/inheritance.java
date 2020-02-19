import java.util.*;
public class Main {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
   System.out.println("Name");
   String name=sc.next();
    System.out.println("Age");
   int age=sc.nextInt();
    System.out.println("Gender");
    char gender=sc.next().charAt(0);
    System.out.println("ID Number");
   Long idNum=sc.nextLong();
    System.out.println("Major");
    String major=sc.next();
    System.out.println("CGPA");
   Double cgpa=sc.nextDouble();
    System.out.println("Year");
     int year=sc.nextInt();
   CollegeStudent cs=new CollegeStudent(name,age,gender,idNum,major,cgpa,year);
   System.out.println("The Student details is");
   System.out.println("ID : "+cs.getIdNum());
   System.out.println("Name : "+cs.getName());
   System.out.println("Age : "+cs.getAge());
   System.out.println("Gender : "+cs.getGender());
   System.out.println("Major : "+cs.getMajor());
   System.out.println("CGPA : "+cs.getCgpa());
   System.out.println("Year : "+cs.getYear());

}

}
 class CollegeStudent extends Main {
String name;
int age;
char gender;
Long idNum;
String major;
Double cgpa;
int year;

public CollegeStudent(String name, int age, char gender, Long idNum, String major, Double cgpa, int year) {
super();
this.name = name;
this.age = age;
this.gender = gender;
this.idNum = idNum;
this.major = major;
this.cgpa = cgpa;
this.year = year;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public char getGender() {
return gender;
}
public void setGender(char gender) {
this.gender = gender;
}
public Long getIdNum() {
return idNum;
}
public void setIdNum(Long idNum) {
this.idNum = idNum;
}
public String getMajor() {
return major;
}
public void setMajor(String major) {
this.major = major;
}
public Double getCgpa() {
return cgpa;
}
public void setCgpa(Double cgpa) {
this.cgpa = cgpa;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}

}
