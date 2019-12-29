public static void main(String[] args) {
		//1 使用static完成狗喝水问题
		
		System.out.println("总共有"+Drink.w+"升水");
		Drink d = new Drink();
		d.drink1();
		System.out.println("还剩"+Drink.w+"升水");
		d.drink2();
		System.out.println("还剩"+Drink.w+"升水");
	}