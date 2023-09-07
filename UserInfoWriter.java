import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class UserInfoWriter{

    public UserInfoWriter(){

    }
    public static void WriteUserInfo (String name, String age, String nid, String gender) {
        try {
            FileWriter myWriter = new FileWriter("userLogin.txt");
            BufferedWriter buffer = new BufferedWriter(myWriter);
            //Scanner input = new Scanner(System.in);
            //String name = input.nextLine();
            buffer.write(name);
            buffer.newLine();
            ///String age = input.nextLine();
            buffer.write(age);
            buffer.newLine();
            //String nid = input.nextLine();
            buffer.write(nid);
            buffer.newLine();
            //String gender = input.nextLine();
            buffer.write(gender);

            buffer.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
/*  public static void main(String[]args){
	  UserInfoWriter userInfoWriter = new UserInfoWriter();
	  userInfoWriter.WriteUserInfo();
}*/
}