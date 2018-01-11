package adsf;

import java.util.Scanner;

public class GuessGame {
	public GuessGame() {
		super();
		this.scan = new Scanner(System.in);
		realNumber=(int)(Math.random()*100)+1;
		this.count=1;
	}
	private int current;
	private int realNumber;
	private int count;
	private Scanner scan;
	public void start() {
		System.err.println("游戏开始！");
		game();
	}
	private void game() {
		while(true) {
			getScanner();
			boolean success = isSuccess();
			showProcess();
			if(success) {
				break;
			}
		}
	}
	private boolean isSuccess() {
		if (count >= 7||current == realNumber) {
			return true;
		}
		count++;
		return false;
	}
	private void showProcess() {
		if (count >= 7) {
			System.out.println("你太笨了！不和你玩了");
		}
		if (current < realNumber) {
			System.out.println("猜小了！再猜吧");
		} else if (current > realNumber) {
			System.out.println("猜大了！再猜吧");
		} else {
			System.out.println("你猜对了!");
		}		
	}
	private void getScanner() {
		System.err.println("请猜一个1-100的数");
		current=scan.nextInt();
	}
}
