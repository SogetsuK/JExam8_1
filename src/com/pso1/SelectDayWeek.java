package com.pso1;

public class SelectDayWeek {

	public static void main(String[] args) {
		String[] week ={
				"日曜日",
				"月曜日",
				"火曜日",
				"水曜日",
				"木曜日",
				"金曜日",
				"土曜日"
		};
		int i = 0;

		if(args.length == 0) {
			System.out.println("指定する引数は1つです");

		}else{
			try {
				i = Integer.parseInt(args[0]);
				System.out.println(week[i]);

			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.print("指定要素はありません:");
				StackTraceElement[] cc = e.getStackTrace();
				System.out.println(cc[0]);

			}catch(NumberFormatException e) {
				System.out.print("数値を入力してください:");
				StackTraceElement[] cc = e.getStackTrace();
				System.out.println(cc[0]);

			}finally {
				System.out.println("プログラムを終了します");
			}
		}
	}
}
