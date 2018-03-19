package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel{
	
	public String getMessage() {
		File f = new File(Model.class.getResource("./message.txt").getFile());
		FileReader fr;
		String line;
		String res = "";
		try {
			fr = new FileReader(f);
			BufferedReader b = new BufferedReader(fr);
			while((line = b.readLine()) != null) {
                res += line;
            } 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
	}

}
