package NewWorld;

//domain
public class OrderList {
	private int ticketType;
	private int ticketCount;
	private int benefitType;
	private int finalPrice;
	private int age;
	private int basicPrice;
	private int benefitPrice;
	private int basicPriceType;
	private int benefitPriceType;
	private int playContinue;
	private int playNew;
	private int orderCount;
	private String orderDate;
	private String residentRegistrationNumber;

	public int getTicketType() {
		return ticketType;
	}
	public String getTicketTypeToString() {
		if (ticketType == FinalValue.DAY_TICKET) {
			return "�ְ���\t";
		} else if (ticketType == FinalValue.NIGHT_TICKET) {
			return "�߰���\t";
		} else {
			return "��������";
		}
	}
	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}

	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public int getBenefitType() {
		return benefitType;
	}
	public void setBenefitType(int benefitType) {
		this.benefitType = benefitType;
	}

	public int getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBasicPrice() {
		return basicPrice;
	}
	public String getBasicPriceTypeToString() {
		if (basicPriceType == FinalValue.BABY_CUSTOMER) {
			return "����\t";
		} else if (basicPriceType == FinalValue.CHILD_CUSTOMER) {
			return "���\t";
		} else if (basicPriceType == FinalValue.TEEN_CUSTOMER) {
			return "û�ҳ�\t";
		} else if (basicPriceType == FinalValue.ADULT_CUSTOMER) {
			return "�\t";
		} else if (basicPriceType == FinalValue.OLD_CUSTOMER) {
			return "���\t";
		} else {
			return "��������\t";
		}
	}
	public void setBasicPrice(int basicPrice) {
		this.basicPrice = basicPrice;
	}
	public int getBenefitPrice() {
		return benefitPrice;
	}
	public void setBenefitPrice(int benefitPrice) {
		this.benefitPrice = benefitPrice;
	}
	public int getBasicPriceType() {
		return basicPriceType;
	}
	public void setBasicPriceType(int basicPriceType) {
		this.basicPriceType = basicPriceType;
	}
	public int getBenefitPriceType() {
		return benefitPriceType;
	}
	public void setBenefitPriceType(int benefitPriceType) {
		this.benefitPriceType = benefitPriceType;
	}
	public String getBenefitPriceTypeToString() {
		if (benefitType == FinalValue.NO_DISCOUNT_BENEFIT) {
			return "*������� ����";
		} else if (benefitType == FinalValue.DISABLED_DISCOUNT_BENEFIT) {
			return "*����� �������";
		} else if (benefitType == FinalValue.NATIONALMERIT_DISCOUNT_BENEFIT) {
			return "*���������� �������";
		} else if (benefitType == FinalValue.MULTIPLE_CHILDREN_DISCOUNT_BENEFIT) {
			return "*���ڳ� �������";
		} else if (benefitType == FinalValue.PREGNANT_DISCOUNT_BENEFIT) {
			return "*�ӻ�� �������";
		} else {
			return "��������";
		}
	}
	public int getPlayContinue() {
		return playContinue;
	}
	public void setPlayContinue(int playContinue) {
		this.playContinue = playContinue;
	}
	public int getPlayNew() {
		return playNew;
	}
	public void setPlayNew(int playNew) {
		this.playNew = playNew;
	}
	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}
	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}