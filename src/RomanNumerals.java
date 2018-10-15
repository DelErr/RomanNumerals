
public class RomanNumerals {

	private final String MESSAGE_CANNOT_PROCESS = "Cannot process, ";

	private final String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM",	"M"};
	private final int[] numerals =  {	1,	4,		5,    9,  10,   40,  50,   90, 100,  400, 500,  900,	1000};
	private String translation;

	//used in loops
	String coded;
	int codedZero;
	char a;
	int c;


	public void recreateInt(int number){

		coded = Integer.toString(number);
		a = coded.charAt(0);

		codedZero = Integer.parseInt(String.valueOf(a));
		int i;

		do {

			switch (coded.length()) {
				case 4:


					if (codedZero > 3) {
						System.out.println(MESSAGE_CANNOT_PROCESS + "Number higher than 3999");
						break;
					} else {

						for (i = 0; i < codedZero; i++) {
							convertToRoman(1000);
						}
					}

					reset();

				case 3:

					if (isCharOneFourFiveNine(a)) {
						convertToRoman(codedZero * 100);
					} else if (a != '0') {
						loop(100);
					}

					reset();

				case 2:

					if (isCharOneFourFiveNine(a)) {
						convertToRoman(codedZero * 10);
					} else if (a != '0') {

						loop(10);

					}

					reset();

				case 1:

					if (isCharOneFourFiveNine(a)) {
						c = codedZero;
						convertToRoman(c);
					} else if (a != '0') {
						loop(1);
					}

					coded=null;

				default:
					System.out.println(MESSAGE_CANNOT_PROCESS + "Input is zero or less");
					break;
			}
		}while (coded.length()==0);

	}

	public void reset (){
		coded = coded.substring(1);
		a = coded.charAt(0);
		codedZero = Integer.parseInt(String.valueOf(a));
	}

	public void loop (int multiply){

		do {

			if (codedZero>5){
				convertToRoman(codedZero*multiply);
				codedZero -= 5;
			}else {
				convertToRoman(multiply);
				codedZero--;
			}

		}while (codedZero!=0);
	}



	public void convertToRoman(int number) {

		for (int i = 0; i<numerals.length;i++){

			StringBuilder builder;

			if (number == numerals[i]){

				if (translation == null){
					builder = new StringBuilder(romans[i]);
				}else {
					builder = new StringBuilder(translation + romans[i]);
				}

				translation = builder.toString();
			}

		}

	}

	public boolean isCharOneFourFiveNine (char a){

		if (a == '1' || a == '4' || a == '5' || a == '9'){
			return true;
		}

		return false;

	}

	public String getTranslation(){
		return translation;
	}
}
