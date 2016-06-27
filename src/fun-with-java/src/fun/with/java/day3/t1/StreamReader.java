package fun.with.java.day3.t1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamReader extends AbstractFileReader{

	public StreamReader(String fileName) {
		super(fileName);
	}

	@Override
	public String readFile() {
		File file = new File(this.fileName);
		InputStream stream = null;
		try {
			 stream = new FileInputStream(file);
			 byte[] buffer = new byte[1024];
			 String result = "";
			 int readed = 0;
			 while((readed = stream.read(buffer)) > 0){
				 result += new String(buffer, readed);
			 }
			 return result;
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(stream != null)
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return null;
	}

}
