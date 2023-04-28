package NewWorld;

import java.util.Scanner;

public class InputClass {

	Scanner scanner = new Scanner(System.in);

	public void inputData(OrderList orderData) {
		inputTicketType(orderData);
		inputResidentRegistrationNumber(orderData);
		inputTicketCount(orderData);
		inputBenefitType(orderData);
	}

	public void inputLanguageType(OrderList orderData) {

	}

	public void inputTicketType(OrderList orderData) {
		do {
			System.out.println("������ �����ϼ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
			orderData.setTicketType(scanner.nextInt());
		} while (!(orderData.getTicketType() == FinalValue.DAY_TICKET
				|| orderData.getTicketType() == FinalValue.NIGHT_TICKET));
	}

	public void inputResidentRegistrationNumber(OrderList orderData) {
		String residentRegistrationNumber;
		do {
			System.out.println("�ֹε�Ϲ�ȣ 13�ڸ��� �Է��ϼ���");
			residentRegistrationNumber = scanner.next();
		} while (residentRegistrationNumber.length() != 13);
		orderData.setResidentRegistrationNumber(residentRegistrationNumber);
	}

	public void inputTicketCount(OrderList orderData) {
		do {
			System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
			orderData.setTicketCount(scanner.nextInt());
		} while (!(orderData.getTicketCount() <= 10 && orderData.getTicketCount() >= 1));
	}

	public void inputBenefitType(OrderList orderData) {
		do {
			System.out.println("�������� �����ϼ���.");
			System.out.println("1. ���� (���� ���� �ڵ�ó��)");
			System.out.println("2. �����");
			System.out.println("3. ����������");
			System.out.println("4. ���ڳ�");
			System.out.println("5. �ӻ��");
			orderData.setBenefitType(scanner.nextInt());
		} while (!(orderData.getBenefitType() == FinalValue.NO_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.DISABLED_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.NATIONALMERIT_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.MULTIPLE_CHILDREN_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.PREGNANT_DISCOUNT_BENEFIT));
	}

}