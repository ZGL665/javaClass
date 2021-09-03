package Day8_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test3 {
	
	public static void main(String[] args) throws Exception {
		
		
		File file=new File("D:/myfiles/user.txt");
		
		InputStream in=new FileInputStream(file);
		
		ObjectInputStream oin  =new ObjectInputStream(in);
		
		Object obj=oin.readObject();
		
		
		System.out.println(obj);
		

		User user=(User)obj;
	    System.out.println(user.getId());
	    System.out.println(user.getName());
		
		
		
	}

}
