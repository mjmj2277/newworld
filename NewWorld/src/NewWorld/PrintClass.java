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
		System.out.println("����� �Ѿ��� " + finalPrice + "�� �Դϴ�.");
		System.out.println("");
		System.out.println("=====================================================\n");
		System.out.println("�����մϴ�. ��� �����Ͻðڽ��ϱ�?");
		System.out.println("1. ���ο� �ֹ�");
		System.out.println("2. ���α׷� ����");
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