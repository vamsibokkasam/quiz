import java.util.Scanner;

class Gustclass {
    String name;
    String branch;
    int age;
    String gender;
    String emailId;

    public Gustclass(String name, String branch, int age, String gender, String emailId) {
        this.name = name;
        this.branch = branch;
        this.age = age;
        this.gender = gender;
        this.emailId = emailId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email ID: " + emailId);
    }
}

