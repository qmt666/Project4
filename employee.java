Import java.util.Scanner;
abstract class employee {
 private String name;
 private int age;
 private String job;
 private String gender;
 private boolean retirement = false;
 
 protected void setJob(String datJob) {
  job = datJob;
 }
 
 public String getJob() {
  return job;
 }

 protected void setName(String datName) {
  name = datName;
 }

 public String getName() {
  return name;
 }

 protected void setAge(int datAge) {
  age = datAge;
 }

 public int getAge() {
  return age;
 }

 protected void setGender (String datGender) {
  gender = datGender;
 }

 public boolean isRetired() {
 }
}

class sales extends employee {
 public employee(String Sname, int Sage, String Sgender) {
  setJob(“sales”);
  setName(Sname);
  setAge(Sage);
  setGender(Sgender);
 }
 public boolean isRetired() {
  if (age > 60) {
   retirement = true;
   System.out.println(“this employee is retired.”)
}

class management extends employee {
 public employee(String Sname, int Sage, String Sgender) {
  setJob(“management”);
  setName(Sname);
  setAge(Sage);
  setGender(Sgender);
 }
 public boolean isRetired() {
  if (age > 65) {
   retirement = true;
   System.out.println(“this employee is retired.”)
}


public class employees {
 public static void main(String[] args) {
  System.out.println(“adding profile, for sales press 1, for management press2.”);