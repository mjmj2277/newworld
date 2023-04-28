package NewWorld;

import java.util.ArrayList;

public class PrintClass {
	OrderList orderData = new OrderList();
	
	public void printOut(ArrayList<OrderList> orderList, int finalPrice) {
		System.out.println("======================NEW WORLD======================");
		System.out.println("");
		for (int index = 0; index < orderList.size(); index++) {
		
			printTicketType(orderList.get(index).getTicketTypeToString());
			printBasicPriceType(orderList.get(index).getBasicPriceTypeToString());
			printOrderListTicketCount(orderList.get(index).getTicketCount());
			printFinalPrice(orderList.get(index).getFinalPrice());
			printBenefitType(orderList.get(index).getBenefitPriceTypeToString());
			System.out.println();
		}
		System.out.println("");
		System.out.println("입장료 총액은 " + finalPrice + "원 입니다.");
		System.out.println("");
		System.out.println("=====================================================\n");
		System.out.println("감사합니다. 계속 진행하시겠습니까?");
		System.out.println("1. 새로운 주문");
		System.out.println("2. 프로그램 종료");
	}

	public void printTicketType (String ticketType) {
		System.out.printf("%s", ticketType);
	}
	
	public void printBasicPriceType (String basicPriceType) {
		System.out.printf("%s", basicPriceType);
	}
	
	public void printOrderListTicketCount (int ticketCount) {
		System.out.printf("X %d\t", ticketCount);
	}
	
	public void printFinalPrice (int finalPrice) {
		System.out.printf("%d\t", finalPrice);
	}
	
	public void printBenefitType (String benefitType) {
		System.out.printf("%s\t", benefitType);
	}
	
}