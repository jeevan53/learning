package java_Basics;

public class ratesArray {
	
			
		double[] exchangeRates =new double[]{63.0,3.0,3.0,595.5,18.0,107.0,2.0};
		
		void setExchangeRates(double[] rates)
		{
			exchangeRates = rates;
		}
		void updateExchangeRates(int arrayIndex, double newVal)
		{
			exchangeRates[arrayIndex] = newVal;
		}
		double getExchangeRate(int arrayIndex)
		{
			return exchangeRates[arrayIndex];
		}
		double currencyTransfer(int arrayIndex, double amount) {
			return getExchangeRate(arrayIndex)*amount;
		}
		void printCurrency() {
			
		System.out.println("rupee: "+ exchangeRates[0]);
		System.out.println("dirham: "+ exchangeRates[1]);
		System.out.println("real: "+ exchangeRates[2]);
		System.out.println("chilean_peso: "+ exchangeRates[3]);
		System.out.println("mexican_peso: "+ exchangeRates[4]);
		System.out.println("_yen: "+ exchangeRates[5]);
		System.out.println("$australian: "+ exchangeRates[exchangeRates.length-1]);
		System.out.println();
	}
	/*public static void main (String[] args) {
		ratesArray ra = new ratesArray();
		double[] rates = {63.0,3.0,3.0,595.5,18.0,107.0,2.0};
		ra.setExchangeRates(rates);
		ra.printCurrency();
		//rates(); 
		
		rates = new double[]{63.0,3.0,3.0,595.5,18.0,107.0,2.0};
		ra.setExchangeRates(rates);
		ra.printCurrency();
		
		ra.updateExchangeRates(0, 65.5);
		ra.printCurrency();
		
		double value = ra.getExchangeRate(2);
		System.out.println("value: "+value);
		
		double money = ra.currencyTransfer(0, 1000);
		System.out.println(money);
	}*/
	}
