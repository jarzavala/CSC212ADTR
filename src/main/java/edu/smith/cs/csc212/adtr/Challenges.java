package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

// Wow, this class really needs some comments...
public class Challenges {

	public static SetADT<String> union(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String l: left) {
			output.insert(l);
		}
		for (String r: right) {
			output.insert(r);
		}
		return output;
	}
	
	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String l: left) {
			output.insert(l);
		}
		for (String r: right) {
			output.insert(r);
		}
		for (String o: output) {
			if (!left.contains(o) || !right.contains(o)) {
				output.remove(o);
			}
		}
		return output;
	}
	
	//words -- example
	//keys -- letters; values -- count
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		for (String w: words) {
			Integer x = output.get(w);
			if (x == null) {
				output.put(w, 1);
			}
			else {
				output.put(w, x+1);
			}
		}
		return output;
	}
}
