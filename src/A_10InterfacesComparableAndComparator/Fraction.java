package A_10InterfacesComparableAndComparator;

public class Fraction implements Comparable<Fraction>{
		private final int numerator;
		private final int denominator;

		public Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}

		/**
		 *
		 * @return the numerator
		 */
		public int getNumerator() {
			return numerator;
		}

		/**
		 *
		 * @return the denominator
		 */
		public int getDenominator() {
			return denominator;
		}

		/**
		 *
		 * @param o rational to compare to
		 * @return positive number if the original fraction is bigger than the other
		 * negative number if the other is bigger than the original
		 * 0 if they are equal
		 */
		@Override
		public int compareTo(Fraction o) {
			if (this.getDenominator() == o.getDenominator()) { //if the denominators are equal we can simply compare the numerators
				return this.getNumerator() - o.getNumerator();
			} else {
				int length = Math.max(this.getNumerator(),o.getNumerator());
				// we get the higher numerator cause it doesn't make sense to iterate numbers bigger than the numerator
				for (int i = 2; i <= length; i++){
					if (this.getDenominator() / i == 0 && o.getDenominator() / i == 0) {
						return this.getNumerator() - o.getNumerator();
					}
					//When all of this manual checking has a plot hole give up and realize you can cross multiply to resolve the problem
				}
			}
			return (this.numerator*o.denominator)-(o.numerator*this.denominator); //cross multiply
		}

		/**
		 *
		 * @return the information of the fraction
		 */
		@Override
		public String toString() {
			return numerator + "/" + denominator;
		}
		//test
		public static void main(String[] args){
			int denominator = (int) (Math.random()*10);
			int denominator2 = (int) (Math.random()*10);
			if (denominator == 0){ //cant divide by 0
				denominator = 1;
			}
			if (denominator2 == 0){ //cant divide by 0
				denominator = 1;
			}
			Fraction r1 = new Fraction((int) (Math.random()*10),denominator);
			Fraction r2 = new Fraction((int) (Math.random()*10),denominator2);
			if(r1.compareTo(r2) > 0){
				System.out.println(r1 + " is bigger than "+r2);
			}else{
				System.out.println(r1 + " is not bigger than "+ r2);
			}
		}
}
