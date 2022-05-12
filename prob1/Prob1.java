package prob1;
import java.util.*;
public class Prob1 {
	private HashMap<String, Integer> h = new HashMap<String, Integer>();
	
	public void frequencies(List<String> input) {
		//use recursion to populate the HashMap h with 
		//the frequency of each string in the input list
		if(input.size() <= 0) return;
		
		createOrUpdateMap(input.get(input.size() - 1));
		
		frequencies(input.subList(0, input.size()-1));
		
	}
	
	public void createOrUpdateMap(String key) {
		if(h.containsKey(key)) {
			int count = h.get(key);
			count ++;
			h.put(key, count);
			return;
		}
		h.put(key, 1);
	}
	
	
	//test your code here
	//Expected output: {feather=2, Tom=3, cat=2, rich=1, dog=2, bull=1}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("Tom");add("cat"); add("Tom"); add("dog");
				add("cat");add("Tom");add("feather"); add("dog");
				add("bull"); add("rich"); add("feather");
			}
		};
	
		Prob1 p = new Prob1();
		p.frequencies(list);
		System.out.println(p.h);
	}
}
