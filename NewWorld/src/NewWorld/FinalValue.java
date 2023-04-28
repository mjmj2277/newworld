package NewWorld;

//domain
public class FinalValue {

	// Discount rates
	public static final double DISABLE_DISCOUNT_RATE = 0.5;
	public static final double NATIONALMERIT_DISCOUNT_RATE = 0.5;
	public static final double MULTICHILD_DISCOUNT_RATE = 0.7;
	public static final double PREGNANT_DISCOUNT_RATE = 0.5;

	// Ticket types
	public static final int DAY_TICKET = 1;
	public static final int NIGHT_TICKET = 2;

	// Ticket prices
	public static final int BABY_PRICE = 15000;
	public static final int CHILD_DAY_PRICE = 46000;
	public static final int CHILD_NIGHT_PRICE = 35000;
	public static final int TEEN_DAY_PRICE = 52000;
	public static final int TEEN_NIGHT_PRICE = 41000;
	public static final int ADULT_DAY_PRICE = 59000;
	public static final int ADULT_NIGHT_PRICE = 47000;
	public static final int OLD_DAY_PRICE = 46000;
	public static final int OLD_NIGHT_PRICE = 35000;

	// Age limits
	public static final int MAX_BABY_AGE = 2;
	public static final int MIN_CHILD_AGE = 3;
	public static final int MAX_CHILD_AGE = 12;
	public static final int MIN_TEEN_AGE = 13;
	public static final int MAX_TEEN_AGE = 18;
	public static final int MIN_ADULT_AGE = 19;
	public static final int MAX_ADULT_AGE = 64;
	public static final int MIN_OLD_AGE = 65;

	// Count limits
	public static final int MAX_TICKET_COUNT = 10;
	public static final int MIN_TICKET_COUNT = 1;

	// Customer types
	public static final int BABY_CUSTOMER = 1;
	public static final int CHILD_CUSTOMER = 2;
	public static final int TEEN_CUSTOMER = 3;
	public static final int ADULT_CUSTOMER = 4;
	public static final int OLD_CUSTOMER = 5;

	// Discount benefit types
	public static final int NO_DISCOUNT_BENEFIT = 1;
	public static final int DISABLED_DISCOUNT_BENEFIT = 2;
	public static final int NATIONALMERIT_DISCOUNT_BENEFIT = 3;
	public static final int MULTIPLE_CHILDREN_DISCOUNT_BENEFIT = 4;
	public static final int PREGNANT_DISCOUNT_BENEFIT = 5;

	// Program modes
	public static final int CONTINUE_PROGRAM = 1;
	public static final int NEW_PROGRAM = 2;

	// next step - csv & change languagae
	//	public static int LANGUAGE_KOREAN = 0, LANGUAGE_ENGLISH = 1;
	//	public static String TICKET_TYPE_QUESTION;
	//	public static void startlanguage() {
	//		if (LANGUAGE_KOREAN == 0) {
	//			TICKET_TYPE_QUESTION = "권종을 입력하세요";
	//		} else {
	//			TICKET_TYPE_QUESTION = "input ticket type";
	//		}
	//	}

}