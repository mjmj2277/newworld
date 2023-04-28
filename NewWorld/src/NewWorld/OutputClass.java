package NewWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputClass {
	ArrayList<OrderList> order = new ArrayList<OrderList>();
	OrderList orderData = null;
	InputClass input = new InputClass();
	RunClass run = new RunClass();
	PrintClass print = new PrintClass();
	Scanner scanner = new Scanner(System.in);

	public void playContinuePrint() {
		resetTicketSystem();
		do {
			orderData = new OrderList();
			input.inputData(orderData);
			run.runData(orderData);
			inputDatainArrayList();
			orderData.setOrderCount(orderData.getOrderCount() + 1);

			System.out.println("��� �߱��Ͻðڽ��ϱ�?");
			System.out.println("1. �ٸ� Ƽ�� �߱�");
			System.out.println("2. ����");
			orderData.setPlayContinue(scanner.nextInt());
			System.out.println();
		} while (orderData.getPlayContinue() == FinalValue.CONTINUE_PROGRAM);
		print.printOut(order, run.totalTicketPrice(order));
		orderData.setPlayNew(scanner.nextInt());
	}

	public void startSystem() {
		resetTicketSystem();
		do {
			playContinuePrint();
		} while (orderData.getPlayNew() == FinalValue.CONTINUE_PROGRAM);
		System.out.println("Ƽ�� �߱��� ������ �����մϴ�. �����մϴ�.\n");
	}

	public void resetTicketSystem() {
		order = new ArrayList<OrderList>();
		input = new InputClass();
		run = new RunClass();
		orderData = new OrderList();
		print = new PrintClass();
	}

	public void inputDatainArrayList() {
		order.add(orderData);
	}
}
