package q1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class favourtieplayer {


	public static void main(String[] args) {

	
		try {
			FileReader fr_1 = new FileReader("D:/Users/Dell/Downloads/CR7.jpeg");
			FileWriter fw_1=new FileWriter("D:/Users/Dell/Downloads/CR7.jpeg");
			int j=0;
			while((j=fr_1.read())!=-1) {
				fw_1.write(j);
			}
			fr_1.close();
			fw_1.close();
			
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException g) {
			g.printStackTrace();
		}	
		System.out.println("file is written");
	}
}