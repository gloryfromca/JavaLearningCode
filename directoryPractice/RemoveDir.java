package directoryPractice;

import java.io.File;
import java.io.IOException;

public class RemoveDir {
	public static void main(String[] args) throws IOException {
		File dir = new File("/home/zhanghui/dir_test");
		// WARNING:it's dangerous to rm directory.
		System.out.println(deleteDir(dir));
	}

	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				return deleteDir(new File(dir, children[i]));
			}
		}
		// empty directory will pass through two 'if', but the first 'if' will do
		// nothing.
		if (dir.delete()) {
			// delete file and empty directory.
			return true;
		} else {
			return false;
		}

	}
}
