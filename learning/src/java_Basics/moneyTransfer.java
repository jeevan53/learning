package java_Basics;

public class moneyTransfer{
	
	ratesArray ra = new ratesArray();
	
	double currencyTransfer(int arrayIndex,double amount) {
		return ra.currencyTransfer(arrayIndex, amount);
	}
	
	double computeTransferFee(int arrayIndex,double amount) {
		return currencyTransfer(arrayIndex, amount)*0.02;
	}
	public static void main(String[] args) {

        moneyTransfer transferService = new moneyTransfer();

        double transferAmount = transferService.currencyTransfer(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

}
}
