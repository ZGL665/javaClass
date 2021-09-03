package Day8_27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) throws Exception {


		User u=new User();
		u.setId(97);
		u.setName("bwf");
		
		File file=new File("D:/myfiles/user.txt");
		OutputStream out=new FileOutputStream(file);
		
		ObjectOutputStream oout=new ObjectOutputStream(out);
		
		oout.writeObject(u);
		
		
		

	}

}
