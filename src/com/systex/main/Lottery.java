package com.systex.main;

import java.util.HashSet;
import java.util.Set;

public class Lottery {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String[] splitNum;
		if (args[1].equals("0")) {
			splitNum = new String[0];
		} else {
			splitNum = args[1].split(" ");
		}
		
		Set<Integer> filterNum = new HashSet<>();
		for (String num : splitNum) {
			filterNum.add(Integer.parseInt(num));
		}
		
		System.out.print("已封鎖號碼: ");
		System.out.println(filterNum);
		System.out.println();
		System.out.println("推薦樂透號:");
		
		for (int i = 0; i<n; i++) {
			Set<Integer> resultLottery = new HashSet<>();
			while(true) {
				int num = (int)(Math.random()*49 + 1);
				if (filterNum.contains(num)) {
					continue;
				}
				resultLottery.add(num);
				if (resultLottery.size() == 6) {
					break;
				}
			}
			System.out.println(resultLottery);
		}
	}
}
