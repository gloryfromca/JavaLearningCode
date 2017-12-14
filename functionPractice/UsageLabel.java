package functionPractice;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class UsageLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String father = "I'm your father";
		String wanna = "father";
		boolean found = false; 
		int lengthWanna = wanna.length();
		int numLoop = father.length() - wanna.length(); 
		int searchBeginLocation=0;
		testlabel:
		for(int i=0;i<=numLoop;i++) {
			searchBeginLocation = i;
			for (int s=0;s<lengthWanna;s++) {
				if (father.charAt(searchBeginLocation+s)!=wanna.charAt(s))
					continue testlabel;
			}
			found = true;
			break testlabel;
		}
		
	System.out.println(wanna+" in father's location is "+searchBeginLocation);		

	}

}
