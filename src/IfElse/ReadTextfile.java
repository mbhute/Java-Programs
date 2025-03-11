package IfElse;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadTextfile {

	public static void main(String[] args) throws IOException {
FileReader fr= new FileReader("C:\\Users\\mbhut\\OneDrive\\Documents\\readfile.txt");
BufferedReader br= new BufferedReader(fr);
String data=br.readLine();


while(data!=null)
	
{
	System.out.println("The data output from file is:"+data);
	
}
	}

}
