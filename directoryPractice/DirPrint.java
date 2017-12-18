package directoryPractice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/zhanghui/test");
		showFile(file, 0);

	}

	static void showFile(File file, int spaces) {
		if (file.isDirectory()) {
			printMark(spaces, " ");
			printMark(1, "-");
			System.out.println(file.getName());
			File[] dir = file.listFiles();

			// put files at the first of dir list.
			List<File> dirDir = new ArrayList<File>();
			List<File> fileDir = new ArrayList<File>();
			for (int i = 0; i < dir.length; i++) {
				File item = dir[i];
				if (item.isDirectory()) {
					dirDir.add(item);
				} else {
					fileDir.add(item);
				}
			}
			fileDir.addAll(dirDir);
			fileDir.toArray(dir);

			for (int i = 0; i < dir.length; i++) {
				showFile(dir[i], spaces + 1);
			}
		} else {
			printMark(spaces, " ");
			printMark(1, "|");
			System.out.println(file.getName());
		}
	}

	static void printMark(int numMarks, String Mark) {
		for (int i = 0; i < numMarks; i++) {
			System.out.print(Mark);
		}
	}

}
