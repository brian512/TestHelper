package com.brian.lotteryhelper.group;

import java.util.List;

import com.brian.lotteryhelper.data.Lottery;

public class Data1_3456Group extends DataGroup {
	
	public Data1_3456Group() {
		super(40, 98);
	}

	public static boolean shouldStop(List<Lottery> lotteries) {
		int count = 0;
		for (int i = 0; i < lotteries.size(); i++) {
			Lottery lottery = lotteries.get(i);
			if (lottery.data1 < 3) {
				count++;
			}
			if (lottery.data2 < 3) {
				count++;
			}
			if (lottery.data3 < 3) {
				count++;
			}
			if (lottery.data4 < 3) {
				count++;
			}
			if (i >= 4) {
				break;
			}
		}
//		return false;
		return count >= 16;
	}
	
	@Override
	public boolean checkLucky(Lottery lottery) {
		return lottery.data1 >= 3 && lottery.data1 <= 6
				;
	}
}
