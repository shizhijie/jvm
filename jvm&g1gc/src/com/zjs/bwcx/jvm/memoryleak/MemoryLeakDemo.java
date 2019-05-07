package com.zjs.bwcx.jvm.memoryleak;

import java.util.HashMap;
import java.util.Map;


public class MemoryLeakDemo {
	
	static class Key{
		Integer id;

		public Key(Integer id) {
			super();
			this.id = id;
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}
	}
	
	public static void main(String[] args) {
		Map<Key,String> map = new HashMap<>();
		while(true) {
			for (int i = 0; i < 100000; i++) {
				if (!map.containsKey(new Key(i))) {
					map.put(new Key(i), "Number:" +i);
				}
			}
		}
	}
}
