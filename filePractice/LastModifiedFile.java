package filePractice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class LastModifiedFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileToChange = new File("/home/zhanghui/lastmodified");
		fileToChange.createNewFile();
		Date lastTime = new Date(fileToChange.lastModified());
		System.out.println(lastTime.toString());
		System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
		lastTime = new Date(fileToChange.lastModified());
		System.out.println(lastTime.toString());
		
	}

}
