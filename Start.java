import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class Start extends UserInfoWriter
{
    void showInfo()
    {
        System.out.println("\n\t\t\t------>>>>Welcome To Online Super Market<<<<------");
        Scanner sc = new Scanner(System.in);
        int ii10 = 1;
        while (ii10 > 0)
        {
            System.out.println("\n\t\t\tAdmin");
            System.out.println("\t\t\tUser");
            System.out.println("\n\t\t\tPress 1 if you are Admin: ");
            System.out.println("\t\t\tPress 2 if you are User: ");
            int numb = 1;
            while (numb > 0)
            {
                System.out.print("\n\t\t\tEnter number to check = ");
                int ii = sc.nextInt();
                numb = ii;
                if (numb == 1)
                {
                    System.out.print("\t\t\tEnter ID: ");
                    Scanner ad = new Scanner(System.in);
                    String ID = ad.nextLine();
                    System.out.print("\t\t\tEnter Password: ");
                    Scanner ad1 = new Scanner(System.in);
                    int Pass = ad1.nextInt();
                    if (ID.equals("Anny") && Pass == 2468) {
                        System.out.println("\t\t\tWelcome");
                        System.out.println("\t\t\tUser\n");
                        ReadUserInfo.UserInfo();
                    }
                    else {
                        System.out.print("\t\t\tWrong ID or Password");
                    }
                  
                }
                else if (numb == 2)
                {
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("\t\t\tEnter your Name: ");
                    String name = input2.nextLine();
                    System.out.print("\t\t\tEnter your voter ID: ");
                    String nid = input2.nextLine();
                    System.out.print("\t\t\tEnter your age: ");
                    String age = input2.nextLine();
                    System.out.print("\t\t\tEnter your Gender: ");
                    String gender = input2.nextLine();
                    UserInfoWriter.WriteUserInfo(name, age, nid, gender);
                    int num = 1;
                    while (num > 0) {
                        Scanner input = new Scanner(System.in);
                        System.out.print("\n\t\t\t0. Login Interface");
                        System.out.println("\n\t\t\t1. Electroniesitems");
                        System.out.println("\t\t\t2. Groceriesitems");
                            System.out.print("\n\t\t\tEnter number to check = ");
                            int i = input.nextInt();
                            num = i;
                            if (num == 1) {
                                System.out.println("\t\t\tElectroniesitems :");
								Item b3 = new Item("Light",200);
								Item b4 = new Item("Fan",600);
								Item b5 = new Item("Switch",250);
								b3.ShowDetails();
								b4.ShowDetails();
								b5.ShowDetails();
                                //System.out.print("\n\t\t\tEnter 0 for Login Interface");
                            }
							else if (num == 2) {
                                System.out.println("\t\t\t2. Groceriesitems");
                                //System.out.print("\n\t\t\tEnter 0 for Login Interface");
							}
                            while (num > 0) 
							{
                        Scanner input12 = new Scanner(System.in);
                 
                        System.out.println("\n\t\t\t1. Veg Items");
                        System.out.println("\t\t\t2. Non-Veg-Items");
						
						
                            System.out.print("\n\t\t\tEnter number to check = ");
                            int i12 = input12.nextInt();
                            num = i12;
                            if (num == 1) {
                                System.out.print("\t\t\tVeg Items :");
								Item b1 = new Item("Tomato 1kg",150 );
								Item b2 = new Item("Potato 1kg",60 );
								Item b3 = new Item("Green chilli 1kg",40 );
								Item b4 = new Item("Onion 1kg",100 );
								Item b5 = new Item("Rice 1kg",150 );
								b1.ShowDetails();
								b2.ShowDetails();
								b3.ShowDetails();
								b4.ShowDetails();
								b5.ShowDetails();
								
                                   
                                
                            } 
							else if (num == 2) {
                                System.out.println("\t\t\t2. Non-Veg-Items :");
                                Item b2 = new Item("Chicken",300 );
								Item b3 = new Item("Mutton",350 );
								Item b4 = new Item("Beef",450 );
								b2.ShowDetails();
								b3.ShowDetails();
								b4.ShowDetails();
								
							}
							
 
                }
            }
        }
			}
		}
	}
}