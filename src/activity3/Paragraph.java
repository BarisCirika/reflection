package activity3;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	private List<String> words;
	public Paragraph() {
		words = new ArrayList<String>();
	}	
	public void add(String word){
		words.add(word);
	}	
	public void show(){
		for (String w: words) {
			System.out.print(w + " ");
		}
	}
	public int getWordCount(String word){
		int count = 0;
		for (String w: words) {
			if(w.equals(word))
				count++;
		}
		return count;
	}
}


