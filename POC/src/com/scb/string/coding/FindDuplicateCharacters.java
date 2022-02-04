package com.scb.string.coding;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	
public Map<Character,Integer> findDuplicate(String word) {
	char[] characters = word.toCharArray();	
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	int count=1;
	for (Character c : characters) {
		
		if(map.containsKey(c)) {
		map.put(c, ++count);
		}else {
			map.put(c, count);
		}
	}
	return map;
}

public static void main(String[] args) {
	
	String word="javaaa";
	FindDuplicateCharacters findDuplicateCharacters=new FindDuplicateCharacters();
	Map<Character,Integer> map=findDuplicateCharacters.findDuplicate(word);
	System.out.println(map);
	}
}
