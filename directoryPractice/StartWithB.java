package directoryPractice;

import java.io.File;
import java.io.FilenameFilter;

public class StartWithB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/zhanghui/test");
		FilenameFilter startWith = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith("1");
			}
		};
		String[] children = file.list(startWith);
		if (children == null) {
			System.out.println("File is not directory or file starting with 'b' not in it!");
		} else {
			for (String x : children) {
				System.out.println(x);
			}
		}

	}

}
