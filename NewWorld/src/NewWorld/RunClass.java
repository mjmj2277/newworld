package NewWorld;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

//service
public class RunClass {

	public void runData(OrderList orderData) {
		runAge(orderData);
		runPriceAgeApply(orderData);
		runBenefitPrice(orderData);
	}

	public void runAge(OrderList orderData) {

		SimpleDateFormat todayDate = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		orderData.setOrderDate(todayDate.format(cal.getTime()));
		int currentYear = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONDAY) + 1;
		int currentDay = cal.get(Calendar.DATE);

		int year = Integer.parseInt(orderData.getResidentRegistrationNumber().substring(0, 2));
		int month = Integer.parseInt(orderData.getResidentRegistrationNumber().substring(2, 4));
		int day = Integer.parseInt(orderData.getResidentRegistrationNumber().substring(4, 6));
		int gender = Integer.parseInt(orderData.getResidentRegistrationNumber().substring(6, 7));

		if (gender == 1 || gender == 2) {
			if (currentMonth > month || currentMonth == month && currentDay < day) {
				orderData.setAge(currentYear - (1900 + year));
			} else {
				orderData.setAge(currentYear - (1900 + year) - 1);
			}
		}
		if (gender == 3 || gender == 4) {
			if (currentMonth > month || (currentMonth == month && currentDay < day)) {
				orderData.setAge(currentYear - (2000 + year));
			} else {
				orderData.setAge(currentYear - (2000 + year) - 1);
			}
		}
	}


	public void runPriceAgeApply(OrderList orderData) {
		int age = orderData.getAge();
		if (orderData.getTicketType() == FinalValue.DAY_TICKET) {
			if (age >= FinalValue.MIN_OLD_AGE) {
				orderData.setBasicPrice(FinalValue.OLD_DAY_PRICE);
				orderData.setBasicPriceType(FinalValue.OLD_CUSTOMER);
			} else if (FinalValue.MIN_ADULT_AGE <= age && age <= FinalValue.MAX_ADULT_AGE) {
				orderData.setBasicPrice(FinalValue.ADULT_DAY_PRICE);
				orderData.setBasicPriceType(FinalValue.ADULT_CUSTOMER);
			} else if (FinalValue.MIN_TEEN_AGE <= age && age <= FinalValue.MAX_TEEN_AGE ) {
				orderData.setBasicPrice(FinalValue.TEEN_DAY_PRICE);
				orderData.setBasicPriceType(FinalValue.TEEN_CUSTOMER);
			} else if (FinalValue.MIN_CHILD_AGE <= age && age <= FinalValue.MAX_CHILD_AGE ) {
				orderData.setBasicPrice(FinalValue.CHILD_DAY_PRICE);
				orderData.setBasicPriceType(FinalValue.CHILD_CUSTOMER);
			} else {
				orderData.setBasicPrice(FinalValue.BABY_PRICE);
				orderData.setBasicPriceType(FinalValue.BABY_CUSTOMER);
			}
		} else if (orderData.getTicketType() == FinalValue.NIGHT_TICKET) {
			if (age >= FinalValue.MIN_OLD_AGE) {
				orderData.setBasicPrice(FinalValue.OLD_NIGHT_PRICE);
				orderData.setBasicPriceType(FinalValue.OLD_CUSTOMER);
			} else if (FinalValue.MIN_ADULT_AGE <= age && age <= FinalValue.MAX_ADULT_AGE) {
				orderData.setBasicPrice(FinalValue.ADULT_NIGHT_PRICE);
				orderData.setBasicPriceType(FinalValue.ADULT_CUSTOMER);
			} else if (FinalValue.MIN_TEEN_AGE <= age && age <= FinalValue.MAX_TEEN_AGE ) {
				orderData.setBasicPrice(FinalValue.TEEN_NIGHT_PRICE);
				orderData.setBasicPriceType(FinalValue.TEEN_CUSTOMER);
			} else if (FinalValue.MIN_CHILD_AGE <= age && age <= FinalValue.MAX_CHILD_AGE ) {
				orderData.setBasicPrice(FinalValue.CHILD_NIGHT_PRICE);
				orderData.setBasicPriceType(FinalValue.CHILD_CUSTOMER);
			} else {
				orderData.setBasicPrice(FinalValue.BABY_PRICE);
				orderData.setBasicPriceType(FinalValue.BABY_CUSTOMER);
			}
		}
	}

	public void runBenefitPrice(OrderList orderData) {
	    int ticketCount = orderData.getTicketCount();
	    int basicPrice = orderData.getBasicPrice();
	    double discount = 1.0;
	    double benefitPricePerTicket;

	    switch (orderData.getBenefitType()) {
	        case FinalValue.NO_DISCOUNT_BENEFIT:
	            discount = 1.0;
	            break;
	        case FinalValue.DISABLED_DISCOUNT_BENEFIT:
	            discount = FinalValue.DISABLE_DISCOUNT_RATE;
	            break;
	        case FinalValue.NATIONALMERIT_DISCOUNT_BENEFIT:
	            discount = FinalValue.NATIONALMERIT_DISCOUNT_RATE;
	            break;
	        case FinalValue.MULTIPLE_CHILDREN_DISCOUNT_BENEFIT:
	            discount = FinalValue.MULTICHILD_DISCOUNT_RATE;
	            break;
	        case FinalValue.PREGNANT_DISCOUNT_BENEFIT:
	            discount = FinalValue.PREGNANT_DISCOUNT_RATE;
	            break;
	        default:
	            throw new IllegalArgumentException("Invalid benefit type");
	    }
	    benefitPricePerTicket = basicPrice * discount;
	    orderData.setFinalPrice((int)Math.round(benefitPricePerTicket * ticketCount));
	}
	
	public int totalTicketPrice(ArrayList<OrderList> orderList) {
		int finalPrice = 0;
		for (int index = 0; index < orderList.size(); index++) {
			finalPrice += orderList.get(index).getFinalPrice();
		}
		return finalPrice;
	}
}
