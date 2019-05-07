package com.zjs.bwcx.jvm.test;

public class JVMDemoTest {
	
	public static void main(String[] args) {
		
		System.out.println("memory info :" + toMemoryInfo());
	}
	
	/**
	 * @Title: toMemoryInfo   
	 * @Description: TODO(这里用一句话描述这个方法的作用) 获取当前jvm 的内存信息  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String toMemoryInfo() {
		Runtime runtime = Runtime.getRuntime();
		int freeMemory = (int) (runtime.freeMemory() / 1024 / 1024);
		int totalMemory = (int) (runtime.totalMemory() / 1024 / 1024);
		return freeMemory + "M/" + totalMemory + "M(free/total)";
	}
}
