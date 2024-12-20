
import java.util.*;
public class quizMain {
public static void main(String args[]) throws InterruptedException {
	try {
	Question q=new Question();
	System.out.println("--------------------------------QUIZZ APPLICATION------------------------------------");
	Scanner sc=new Scanner(System.in);
	guest d=new guest();
	System.out.println("Welcome to the Quiz Game!");
	System.out.println("FILL YOUR DETAILS.....");
	System.out.println("Please Enter Your Name: ");
	d.setName(sc.next());
	System.out.println("Please select the gender : ");
	d.setGender(sc.next());
	System.out.println("Please Enter Your age : ");
	d.setAge(sc.nextInt());
	System.out.println("Please Enter Your Address : ");
	d.setAddress(sc.next());
	System.out.println("Please Enter Your Mobile no : ");
	d.setPhoneno(sc.nextLong());
	System.out.println("Please Enter Your Email : ");
	d.setEmail(sc.next());
	System.out.println("----------YOUR DETAILS-------------");
	System.out.println("Name: "+d.getName());
	System.out.println("gender : "+d.getGender());
	System.out.println("age : "+d.getAge());
	System.out.println("Address : "+d.getAddress());
	System.out.println("Mobile no : "+d.getPhoneno());
	System.out.println("Email : "+d.getEmail());
	
	//QUIZ STARTTING
	System.out.println("----->>RULES TO BE FOLLOWED<<-----");

	System.out.println("1:- FOR EVREY QUESTION THERE WILL BE 4 OPTIONS");
	System.out.println("2:- FOR EVERY CORRECT ANSWER AMOUNT WILL BE REWARDED");
	System.out.println("3:- YOU WILL BE PROVIDED WITH 2 LIFELINES-> 50-50 AND ->AUDIANCE POLL");
	System.out.println("4:- EACH LIFELINE CAN BE USED ONLY ONCE");
	System.out.println("5:- QUIZ WILL GET QUIT IF YOU CHOOSE WRONG ANSWER");
	System.out.println("IF YOU AGREE WITH ABOVE RULES ENTER ' 1' TO CONTINUE ELSE '0' TO QUIT");
   
    System.out.println("ARE YOU READY FOR THE QUIZZ....??");
	System.out.println(" '1' for YES  ::::  '0' for NO ");
	 int b=sc.nextInt();
	if(b==0) {
		System.out.println("YOU EXIT SUCCESFULLY");
		System.exit(0);
	}
	else {
    q.question1();
    q.question2();
    
    
   
    q.question3();
    
    q.question4();
    
    /* q.question5();
    q.question6();
    q.question7();
    q.question8();
    q.question9();
    q.question10();*/
    
}}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic exception was found");
	}
	
}

}
