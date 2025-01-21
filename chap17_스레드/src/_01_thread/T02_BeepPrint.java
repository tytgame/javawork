package _01_thread;

import java.awt.Toolkit;

public class T02_BeepPrint {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);	// 0.5 초동안 스레드 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	// 0.5 초동안 스레드 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
