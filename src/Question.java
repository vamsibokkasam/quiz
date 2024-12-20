
import java.util.*;

class Question {
	int f = 0, ap = 0;
	//Lifeline l = new Lifeline();
	int ans, count = 0;

	void question1() {
		Scanner sc = new Scanner(System.in);
		String q1 = "1.Who invented Java Programming?\n";

		String op1[] = { "1.Guido van Rossum\n", "2.James Gosling\n", "3.Dennis Ritchie\n", "4.none\n" };
		System.out.println(q1);
		for (String o : op1) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("\n6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
			int l = sc.nextInt();
			if (l == 1) {
				f += 1;
				System.out.println(op1[1] + "\n" + op1[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			} else if (l == 2) {
				ap += 1;
				System.out.println("Audiance poll is as folllows");
				System.out.println(op1[0] + "->5%");
				System.out.println(op1[1] + "->70%");
				System.out.println(op1[2] + "->12%");
				System.out.println(op1[3] + "->13%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			} else {
				System.out.println("Enter valid Number");
			}
		} else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	

	void question2() {
		Scanner sc = new Scanner(System.in);
		String q2 = "2.Which component is used to compile, debug and execute the java programs?\n";

		String op2[] = { "1) JRE\r\n", "2) JIT\r\n", "3) JDK\r\n", "4) JVM" };
		System.out.println(q2);
		for (String o : op2) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("\n6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 4) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			if (f == 1) {
				ap+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op2[0] + "->8%");
				System.out.println(op2[1] + "->2%");
				System.out.println(op2[2] + "->10%");
				System.out.println(op2[3] + "->80%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			else if (ap == 1) {
				f+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op2[1] + "\n" + op2[3]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			
			else {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			f+=1;
			System.out.println(op2[1] + "\n" + op2[3]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 4) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		
		else if (l == 2) {
			ap+=1;
			System.out.println("Audiance poll is as folllows");
			System.out.println(op2[0] + "->8%");
			System.out.println(op2[1] + "->2%");
			System.out.println(op2[2] + "->10%");
			System.out.println(op2[3] + "->80%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 4) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}}}}
	

	
	
	
	
	
	
	
	
	
	void question3() {
		Scanner sc = new Scanner(System.in);
		String op3[] = { "1) identifier & keyword\r\n"
				, "2) identifier\r\n"
				, "3) keyword\r\n"
				, "4) none of the mentioned" };
		if((f==1)&&(ap==1)) {
			System.out.println( "3.Which of these cannot be used for a variable name in Java??\n");

			System.out.println("1) identifier & keyword\r\n2) identifier\r\n3) keyword\r\n4) none of the mentioned\n5) Quit");
			
			}
	    		
	    
		else {
			System.out.println( "3.Which of these cannot be used for a variable name in Java??\n");

		System.out.println("1) identifier & keyword\r\n2) identifier\r\n3) keyword\r\n4) none of the mentioned\n5) Quit");

		

		
		
		
		System.out.println("5.Lifeline");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 3) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 3) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op3[0] + "->8%");
				System.out.println(op3[1] + "->2%");
				System.out.println(op3[2] + "->80%");
				System.out.println(op3[3] + "->10%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}
			else if ((ap == 1)&&(f == 0)) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op3[1] + "\n" + op3[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
						
			else if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
			else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op3[1] + "\n" + op3[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 4) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op3[0] + "->8%");
			System.out.println(op3[1] + "->2%");
			System.out.println(op3[2] + "->80%");
			System.out.println(op3[3] + "->10%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 3) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		else if (ans > 4) {
			System.out.println("Enter valid Number");
		}}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void question4() {
		Scanner sc = new Scanner(System.in);
		String op5[] = { "1)  MAVEN_Path\r\n"
				, "2)  JavaPATH\r\n"
				, "3) JAVA\r\n"
				, "4) JAVA_HOME\n" };
		if((f==1)&&(ap==1)) {
			System.out.println( "4.Which environment variable is used to set the java path?\n");

			System.out.println("1) MAVEN_Path\r\n2)  JavaPATH\r\n3) JAVA\r\n4) JAVA_HOME\n5) Quit\n");
			
			}
	    		
	    
		else {
			System.out.println( "4.Which environment variable is used to set the java path?\n");

		System.out.println("1) MAVEN_Path\r\n2) JavaPATH\r\n3) JAVA\r\n4) JAVA_HOME\n");
		System.out.println("\n5.Lifeline\n");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
					ap+=1;
				System.out.println("Audiance poll is as folllows");
				System.out.println(op5[0] + "->8%");
				System.out.println(op5[1] + "->82%");
				System.out.println(op5[2] + "->8%");
				System.out.println(op5[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} 
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}
			else if ((ap == 1)&&(f == 0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int f=sc.nextInt();
				f+=1;
				System.out.println("1) 50-50");
				System.out.println(op5[1] + "\n" + op5[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} }
						
			else if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
		else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op5[1] + "\n" + op5[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op5[0] + "->8%");
			System.out.println(op5[1] + "->82%");
			System.out.println(op5[2] + "->8%");
			System.out.println(op5[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 3) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}
		}
		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	void question5() {
		Scanner sc = new Scanner(System.in);
		String op5[] = { "1)  Multiple polymorphism\r\n"
				, "2)  Compile time polymorphism\r\n"
				, "3) Multilevel polymorphism\r\n"
				, "4) JAVA_HOME\n" };
		if((f==1)&&(ap==1)) {
			System.out.println( "5.Which of the following is a type of polymorphism in Java Programming?\n");

			System.out.println("1) Multiple polymorphism\r\n2) Compile time polymorphism\r\n3) Multilevel polymorphism\r\n4) Execution time polymorphism\n5) Quit\n");
			
			}
	    		
	    
		else {
			System.out.println( "5.Which of the following is a type of polymorphism in Java Programming?\n");

		System.out.println("1) Multiple polymorphism\r\n2)Compile time polymorphism\r\n3)Multilevel polymorphism\r\n4) Execution time polymorphism\n");
		System.out.println("\n5.Lifeline\n");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op5[0] + "->8%");
				System.out.println(op5[1] + "->82%");
				System.out.println(op5[2] + "->8%");
				System.out.println(op5[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} 
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}}
			else if ((ap == 1)&&(f == 0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op5[1] + "\n" + op5[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} }
						
			else if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
		else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op5[1] + "\n" + op5[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op5[0] + "->8%");
			System.out.println(op5[1] + "->82%");
			System.out.println(op5[2] + "->8%");
			System.out.println(op5[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	void question6() {
		Scanner sc = new Scanner(System.in);
		String op6[] = { "1)   .txt\r\n"
				, "2)  .class\r\n"
				, "3) .js\r\n"
				, "4) .java\n" };
		if((f==1)&&(ap==1)) {
			System.out.println( "6.What is the extension of compiled java classes?\n");

			System.out.println("1)  .txt\r\n2).class\r\n3)  .js\r\n4) .java\n5) Quit\n");
			
			}
	    		
	    
		else {
			System.out.println( "6.What is the extension of compiled java classes?\n");

		System.out.println("1)  .txt\r\n2).class\r\n3) .js\r\n4) .java\n");
		System.out.println("\n5.Lifeline\n");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op6[0] + "->8%");
				System.out.println(op6[1] + "->82%");
				System.out.println(op6[2] + "->8%");
				System.out.println(op6[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} 
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}}
			else if ((ap == 1)&&(f == 0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op6[1] + "\n" + op6[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} }
						
			else if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
		else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op6[1] + "\n" + op6[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op6[0] + "->8%");
			System.out.println(op6[1] + "->82%");
			System.out.println(op6[2] + "->8%");
			System.out.println(op6[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	void question7() {
		Scanner sc = new Scanner(System.in);
		String op7[] = { "1)   MemoryError\r\n"
				, "2)  OutOfMemoryError\r\n"
				, "3)  MemoryOutOfBoundsException\r\n"
				, "4)  MemoryFullException\n" };
		if((f==1)&&(ap==1)) {
			System.out.println( "7.Which exception is thrown when java is out of memory??\n");

			System.out.println("1)  MemoryError\r\n2) OutOfMemoryError\r\n3) MemoryOutOfBoundsException\r\n4) MemoryFullException\n5) Quit\n");
			
			}
	    		
	    
		else {
			System.out.println( "7.Which exception is thrown when java is out of memory?\n");

		System.out.println("1)  MemoryError\r\n2) OutOfMemoryError\r\n3) MemoryOutOfBoundsException\r\n4) MemoryFullException\n");
		System.out.println("\n5.Lifeline\n");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op7[0] + "->8%");
				System.out.println(op7[1] + "->82%");
				System.out.println(op7[2] + "->8%");
				System.out.println(op7[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} 
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}}
			else if ((ap == 1)&&(f == 0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op7[1] + "\n" + op7[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} }
						
			else if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
		else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op7[1] + "\n" + op7[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op7[0] + "->8%");
			System.out.println(op7[1] + "->82%");
			System.out.println(op7[2] + "->8%");
			System.out.println(op7[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	void question8() {
		Scanner sc = new Scanner(System.in);
		String op8[] = { "1)   break\r\n"
				, "2)  if()\r\n"
				, "3)  continue\r\n"
				, "4)  for()\n" };
		if((f==1)&&(ap==1)) {
			System.out.println( "8.Which of these are selection statements in Java?\n");

			System.out.println("1)  break\r\n2) if()\r\n3) continue\r\n4)  for()\n5) Quit\n");
			
			}
	    		
	    
		else {
			System.out.println( "8.Which of these are selection statements in Java?\n");

		System.out.println("1)  break\r\n2) if()\r\n3) continue\r\n4)  for()\n");
		System.out.println("\n5.Lifeline\n");
		System.out.println("\n6.Quit");
		}
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		
		else  if((f==1)&&(ap==1)) {
			if (ans == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
				else if(ans==5) {
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			}
			else if ((f == 1)&&(ap==0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op8[0] + "->8%");
				System.out.println(op8[1] + "->82%");
				System.out.println(op8[2] + "->8%");
				System.out.println(op8[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} 
				else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			}}
			else if ((ap == 1)&&(f == 0)) {
				if(ans==2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				}
				else if(ans==5) {
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op8[1] + "\n" + op8[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} }
						
			else if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
		else if(ans==5) {
				System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(op8[1] + "\n" + op8[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (l == 2) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op8[0] + "->8%");
			System.out.println(op8[1] + "->82%");
			System.out.println(op8[2] + "->8%");
			System.out.println(op8[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
void question9(){

	Scanner sc = new Scanner(System.in);
	String op9[] = { "1)   check\r\n"
			, "2)  try\r\n"
			, "3)  throw\r\n"
			, "4)  catch\n" };
	if((f==1)&&(ap==1)) {
		System.out.println( "9. Which of these keywords are used for the block to be examined for exceptions?\n");

		System.out.println("1)  check\r\n2) try\r\n3) throw\r\n4)  catch\n5) Quit\n");
		
		}
    		
    
	else {
		System.out.println( "9. Which of these keywords are used for the block to be examined for exceptions?\n");

	System.out.println("1)  check\r\n2) try\r\n3) throw\r\n4)  catch\n");
	System.out.println("\n5.Lifeline\n");
	System.out.println("\n6.Quit");
	}
	System.out.println("Choose Your Option");
	ans = sc.nextInt();
	if (ans == 2) {
		System.out.println("Correct answer..!");
		count += 1;
		System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
	} 
	
	else  if((f==1)&&(ap==1)) {
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
			else if(ans==5) {
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
			else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		else if ((f == 1)&&(ap==0)) {
			if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
			else if(ans==5) {
			System.out.println("you left with only one lifeline");
			System.out.println("1) Audiance poll\n enter 1 to continue");
			int au_p=sc.nextInt();
			if(au_p==1) {
			System.out.println("Audiance poll is as folllows");
			System.out.println(op9[0] + "->8%");
			System.out.println(op9[1] + "->82%");
			System.out.println(op9[2] + "->8%");
			System.out.println(op9[3] + "->2%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} 
			else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}}
			else {
				System.out.println("Your option is invalid");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}

		}}
		else if ((ap == 1)&&(f == 0)) {
			if(ans==2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			}
			else if(ans==5) {
			System.out.println("you left with only one lifeline");
			System.out.println("1)50-50\n enter 1 to continue");
			int ff=sc.nextInt();
			
			System.out.println("1) 50-50");
			System.out.println(op9[1] + "\n" + op9[2]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}

		} }
					
		else if(ans==2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		}
	else if(ans==5) {
			System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");
	
	int l = sc.nextInt();
	if (l == 1) {
		System.out.println(op9[1] + "\n" + op9[2]);
		System.out.println("Now,choose among this two");
		int a = sc.nextInt();
		if (a == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else {
			System.out.println("wrong answer...");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}
	} else if (l == 2) {
		System.out.println("Audiance poll is as folllows");
		System.out.println(op9[0] + "->8%");
		System.out.println(op9[1] + "->82%");
		System.out.println(op9[2] + "->8%");
		System.out.println(op9[3] + "->2%");
		System.out.println("Now,choose your option according to audiance poll");
		int a = sc.nextInt();
		if (a == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else {
			System.out.println("wrong answer...");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}
	} else if (ans > 4) {
		System.out.println("Enter valid Number");
	}}

	else {
		System.out.println("wrong answer...you are not eligible to continue the quiz");
		System.exit(0);
	}

}
	
	













void question10(){

Scanner sc = new Scanner(System.in);
String op10[] = { "1)   Protected\r\n"
		, "2)  Void\r\n"
		, "3)  Public\r\n"
		, "4)  Public\n" };
if((f==1)&&(ap==1)) {
	System.out.println( "10. Which one of the following is not an access modifier?\n");

	System.out.println("1)  Protected\r\n2) Void\r\n3) Public\r\n4)  Public\n5) Quit\n");
	
	}
		

else {
	System.out.println( "9. Which of these keywords are used for the block to be examined for exceptions?\n");

System.out.println("1)  Protected\r\n2) Void\r\n3) Public\r\n4)  Public\n");
System.out.println("\n5.Lifeline\n");
System.out.println("\n6.Quit");
}
System.out.println("Choose Your Option");
ans = sc.nextInt();
if (ans == 2) {
	System.out.println("Correct answer..!");
	count += 1;
	System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
} 

else  if((f==1)&&(ap==1)) {
	if (ans == 2) {
		System.out.println("Correct answer..!");
		count += 1;
		System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);}
		else if(ans==5) {
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}
		else {
			System.out.println("wrong answer...");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}
	}
	else if ((f == 1)&&(ap==0)) {
		if(ans==2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		}
		else if(ans==5) {
		System.out.println("you left with only one lifeline");
		System.out.println("1) Audiance poll\n enter 1 to continue");
		int au_p=sc.nextInt();
		if(au_p==1) {
		System.out.println("Audiance poll is as folllows");
		System.out.println(op10[0] + "->8%");
		System.out.println(op10[1] + "->82%");
		System.out.println(op10[2] + "->8%");
		System.out.println(op10[3] + "->2%");
		System.out.println("Now,choose your option according to audiance poll");
		int a = sc.nextInt();
		if (a == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} 
		else {
			System.out.println("wrong answer...");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}}
		else {
			System.out.println("Your option is invalid");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}

	}}
	else if ((ap == 1)&&(f == 0)) {
		if(ans==2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		}
		else if(ans==5) {
		System.out.println("you left with only one lifeline");
		System.out.println("1)50-50\n enter 1 to continue");
		int ff=sc.nextInt();
		
		System.out.println("1) 50-50");
		System.out.println(op10[1] + "\n" + op10[2]);
		System.out.println("Now,choose among this two");
		int a = sc.nextInt();
		if (a == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else {
			System.out.println("wrong answer...");
			System.out.println("You'r game has quit with score " + count);
			System.exit(0);
		}

	} }
				
	else if(ans==2) {
		System.out.println("Correct answer..!");
		count += 1;
		System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
	}
else if(ans==5) {
		System.out.println("Choose any one of the lifeline\n1.50-50\n2.Audiance poll");

int l = sc.nextInt();
if (l == 1) {
	System.out.println(op10[1] + "\n" + op10[2]);
	System.out.println("Now,choose among this two");
	int a = sc.nextInt();
	if (a == 2) {
		System.out.println("Correct answer..!");
		count += 1;
		System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
	} else {
		System.out.println("wrong answer...");
		System.out.println("You'r game has quit with score " + count);
		System.exit(0);
	}
} else if (l == 2) {
	System.out.println("Audiance poll is as folllows");
	System.out.println(op10[0] + "->8%");
	System.out.println(op10[1] + "->82%");
	System.out.println(op10[2] + "->8%");
	System.out.println(op10[3] + "->2%");
	System.out.println("Now,choose your option according to audiance poll");
	int a = sc.nextInt();
	if (a == 2) {
		System.out.println("Correct answer..!");
		count += 1;
		System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
	} else {
		System.out.println("wrong answer...");
		System.out.println("You'r game has quit with score " + count);
		System.exit(0);
	}
} else if (ans > 4) {
	System.out.println("Enter valid Number");
}}

else {
	System.out.println("wrong answer...you are not eligible to continue the quiz");
	System.exit(0);
}
System.out.println("-------------------QUIZ COMPLETED SUCCESFULLY---------------------------");
}
}
