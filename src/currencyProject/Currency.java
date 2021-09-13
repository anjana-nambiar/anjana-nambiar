package currencyProject;


public class Currency {
		private int note; // whole dollarVal amount
		private int coin; // fractional centVal amount
		
		// Default Constructor
		Currency() {
		};

		// Copy Constructor
		Currency(Currency Amount) {
			this(Amount.getNote(), Amount.getCoin());
		};

		Currency(int dollarVal, int centVal) {
			setVal(dollarVal, centVal);
		};

		boolean setVal(int newNote, int newCoin) {
			if (newNote >= 0 && (newCoin < 100 && newCoin >= 0)) {
				note = newNote;
				coin = newCoin;
				return true;
			}
			return false;
		}
		 
			int getNote() {
				return note;
			}

			int getCoin() {
				return coin;
			}

}
