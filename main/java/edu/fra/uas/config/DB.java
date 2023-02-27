package edu.fra.uas.config;
import java.util.LinkedHashMap;
import java.util.Map;

public class DB {
	 private Map<String, Integer> data = new LinkedHashMap<String, Integer>();
	 
	 public void inputValue (String name, Integer value) {
		 this.data.put(name, value);
	 }
	 
	 public Map<String, Integer>getAll(){
		 return this.data;
	 }
}
