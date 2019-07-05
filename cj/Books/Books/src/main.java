import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bok=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int bookid;
		String name;
		int price;
		int quanity;
		String ch;
		do
		{
			System.out.println("\n1.add\n2.display\34.SearchByName");
			System.out.println("\nenter choice");
			ch=sc.next();
			int id;
			switch(ch)
			{
			case "1":
				System.out.println("enter id");
                      bookid=sc.nextInt();
                  System.out.println("enter name");
                  name=sc.next();
                  System.out.println("enter price");
                  price=sc.nextInt();
                  System.out.println("enter quanity");
                  quanity=sc.nextInt();
                  
                  Book b=new Book(bookid,name,price,quanity);
                  bok.add(b);
                  break;
			case "2":
				for(Book obj:bok)
				{
					
					System.out.println(obj);
				}
			break;
			case "3":
				
				 Collections.sort(ArrayList<Book>, bok);; 
				 
				break;
			case "4":
				System.out.println("enter the name u want to search");
				name=sc.next();
				for(Book ab:bok)
				{
					if(ab.name.equals(name))
					{
						System.out.println(ab);
					}else
					{
						System.out.println("not found");
					}
					break;
				}
				
				
				
			}
			System.out.println("do you want to...");
			ch=sc.next();
			
			
		}while(ch.equals("y") || ch.equals("Y"));
		
	}
		

	}


