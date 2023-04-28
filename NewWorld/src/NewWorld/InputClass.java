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
			System.out.println("권종을 선택하세요.");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
			orderData.setTicketType(scanner.nextInt());
		} while (!(orderData.getTicketType() == FinalValue.DAY_TICKET
				|| orderData.getTicketType() == FinalValue.NIGHT_TICKET));
	}

	public void inputResidentRegistrationNumber(OrderList orderData) {
		String residentRegistrationNumber;
		do {
			System.out.println("주민등록번호 13자리를 입력하세요");
			residentRegistrationNumber = scanner.next();
		} while (residentRegistrationNumber.length() != 13);
		orderData.setResidentRegistrationNumber(residentRegistrationNumber);
	}

	public void inputTicketCount(OrderList orderData) {
		do {
			System.out.println("몇 개를 주문하시겠습니까? (최대 10개)");
			orderData.setTicketCount(scanner.nextInt());
		} while (!(orderData.getTicketCount() <= 10 && orderData.getTicketCount() >= 1));
	}

	public void inputBenefitType(OrderList orderData) {
		do {
			System.out.println("우대사항을 선택하세요.");
			System.out.println("1. 없음 (나이 우대는 자동처리)");
			System.out.println("2. 장애인");
			System.out.println("3. 국가유공자");
			System.out.println("4. 다자녀");
			System.out.println("5. 임산부");
			orderData.setBenefitType(scanner.nextInt());
		} while (!(orderData.getBenefitType() == FinalValue.NO_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.DISABLED_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.NATIONALMERIT_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.MULTIPLE_CHILDREN_DISCOUNT_BENEFIT
				|| orderData.getBenefitType() == FinalValue.PREGNANT_DISCOUNT_BENEFIT));
	}

}