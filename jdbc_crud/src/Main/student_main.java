package Main;

import java.sql.SQLException;
import java.util.Scanner;
import java.lang.ClassNotFoundException;
import crud.student_crud;
import Bean.student_bean;

public class student_main {
	static Scanner sc=new Scanner(System.in);
	@SuppressWarnings("static-access")
	public static void main(String args[]) throws ClassNotFoundException, SQLException {		
		student_bean stb=new student_bean();
		student_crud sti=new student_crud();
		while(true) {
			System.out.println("Enter option for crud operations");
			System.out.println("1.INSERTION\n");
			System.out.println("2.DELETION\n");
			System.out.println("3.UPDATION\n");
			System.out.println("4.DISPLAY\n");
			int option=sc.nextInt();
			
			switch(option) 
			{
			     case 1:
			    	 System.out.println("Values for insertion\n");
			    	 System.out.println("Enter Id");
			    	 int id=sc.nextInt();
			    	 System.out.println("Enter Name");
			    	 String name=sc.next();
			    	 System.out.println("Enter Mailid");
			    	 String email=sc.next();
						stb.setRegno(id);
						stb.setName(name);
						stb.setEmail(email);
						
						int a=sti.StudentInsert(stb);
						if(a>0) {
							System.out.println("Insertion sucessful !!!");
						}
						else {
							System.out.println("Insertion failed !!!");
						}
						break;
					
			     case 2:System.out.println("Enter Id for deletion");
					    	 int regno=sc.nextInt();
					    	 stb.setRegno(regno);
					    int b=sti.StudentDeletion(stb);
					    if(b>0) {
					    	System.out.println("Deletion sucessful !!!");
					    }
					    else {
							System.out.println("Deletion failed !!!");
						}

					    
			     			break;
			     case 3:System.out.println("Enter Id for updation");
		    	 			int id1=sc.nextInt();
		    	 			stb.setRegno(id1);
		    	 		System.out.println("Enter Name for updation");
					    	 String name_update=sc.next();
					    	 stb.setName(name_update);
					    	 int a1=sti.Studentupdation(stb);
								if(a1>0) {
									System.out.println("updation sucessful !!!");
								}
								else {
									System.out.println("updation failed !!!");
								}
			                 break;
			     case 4:sti.Studentdisplay(stb);
			     			break;
			}
			
			
		}
	}
}