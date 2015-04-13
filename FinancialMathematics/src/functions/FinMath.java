/**
 * Financial Mathematics Calculator
 * 
 * Note: GUI Capability will be added later; backend is being developed now
 * 
 * @author William Pierce
 * 
 * @version Mar 15, 2015
 */
package functions;

//import java.util.Scanner;

public class FinMath {

	// Effective Interest Rate
	static public double calcEIR(double amount1, double amount2) {
		return Math.abs(amount2 - amount1) / amount1;
	}

	// Discount from Interest
	static public double calcDFI(double i) {
		return i / (1 + i);
	}

	// Interest from Discount
	static public double calcIFD(double d) {
		return d / (1 - d);
	}

	//
	/**
	 * Calculate Present Value from Simple Interest
	 * 
	 * @param amount
	 *            - future amount
	 * @param interest
	 *            - simple interest rate per year
	 * @param time
	 *            - time in years
	 */
	static public double calcPVSI(double amount, double interest, double time) {
		return amount / (1 + interest * time);
	}

	/**
	 * Calculate Present Value from Compound Interest
	 * 
	 * @param amount
	 *            - future amount
	 * @param interest
	 *            - interest rate per year
	 * @param time
	 *            - time in years
	 */
	static public double calcPVCI(double amount, double interest, double time) {
		return amount / Math.pow((1 + interest), time);
	}

	/**
	 * Calculate Present Value from Simple Discount
	 * 
	 * @param amount
	 *            - future amount
	 * @param interest
	 *            - simple discount rate per year
	 * @param time
	 *            - time in years TODO: Check that this discount calculation is
	 *            right
	 */
	static public double calcPVSD(double amount, double discount, double time) {
		return amount / (1 - discount * time);
	}

	/**
	 * Calculate Present Value from Compound Discount
	 * 
	 * @param amount
	 *            - future amount
	 * @param interest
	 *            - discount rate per year
	 * @param time
	 *            - time in years TODO: Check that this discount calculation is
	 *            also right
	 */
	static public double calcPVCD(double amount, double discount, double time) {
		return amount / Math.pow((1 - discount), time);
	}

	/**
	 * Calculate Net Present Value from Simple interest
	 * 
	 * @param interest
	 *            - simple interest per year
	 * @param values
	 *            - values of cash flows
	 */
	static public double calcNPVSI(double interest, double[] values) {
		double total = 0;
		for (int time = 0; time < values.length; time++) {
			total += calcPVSI(values[time], interest, time);
		}
		return total;
	}

	/**
	 * Calculate Net Present Value from Compound interest
	 * 
	 * @param interest
	 *            - simple interest per year
	 * @param values
	 *            - values of cash flows
	 */
	static public double calcNPVCI(double interest, double[] values) {
		double total = 0;
		for (int time = 0; time < values.length; time++) {
			total += calcPVCI(values[time], interest, time);
		}
		return total;
	}

	// TODO: Further Implementation for Net present value compound interest?
	// never really use it, sooo
	// TODO: further Implementation to take care of nominal interest

	/**
	 * Calculate Net Inflation
	 * 
	 * @param i
	 *            - nominal interest
	 * @param r
	 *            - rate of inflation TODO: expand capabilities to be able to
	 *            handle compounding
	 */
	static public double calcNI(double i, double r) {
		return (1 + i) / (1 + r);
	}

	// NOTE: From here on, all values are for compound interest, since that is
	// all that
	// is used in the real world
	/**
	 * Calculate Present Value of Annuity Immediate from Compound Interest
	 * 
	 * @param amount
	 *            - amount per payment
	 * @param interest
	 *            - interest rate per year
	 * @param time
	 *            - time in years
	 */
	static public double calcPVAI(double amount, double interest, double time) {
		return ((1 - (1 / Math.pow((1 + interest), time))) / interest);
	}

	/**
	 * Calculate Future Value of Annuity Immediate from Compound Interest
	 * 
	 * @param amount
	 *            - amount per payment
	 * @param interest
	 *            - interest rate per year
	 * @param time
	 *            - time in years Note: uses the cleaner algorithm for
	 *            calculating instead of method I would always use in class
	 */
	static public double calcFVAI(double amount, double interest, double time) {
		return ((Math.pow((1 + interest), time) - 1) / interest);
	}

	/**
	 * Calculate Present Value of Annuity Due from Compound Interest
	 * 
	 * @param amount
	 *            - amount per payment
	 * @param interest
	 *            - interest rate per year
	 * @param time
	 *            - time in years
	 */
	static public double calcPVAD(double amount, double interest, double time) {
		return calcPVAI(amount, interest, time) * (1 + interest);
	}

	/**
	 * Calculate Future Value of Annuity Due from Compound Interest
	 * 
	 * @param amount
	 *            - amount per payment
	 * @param interest
	 *            - interest rate per year
	 * @param time
	 *            - time in years Note: uses the cleaner algorithm for
	 *            calculating instead of method I would always use in class
	 */
	static public double calcFVAD(double amount, double interest, double time) {
		return calcFVAI(amount, interest, time) * (1 + interest);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner s = new Scanner(System.in);
		// System.out.print("Please enter values to be calculated: \n (press done when done)")

		// Add GUI now
		/*
		System.out.println(calcNPVSI(.01, 5, 5, 5, 5, 5, 5, 6, 6, 4, 5, 4, 6,
				4, 6, 4, 6, 4, 5, 4, 6));
		System.out.println(calcNPVSI(.01, 5, 5, 5, 5, 5));
		System.out.println(calcNPVSI(.01, 5, 5, 5, 100, 500, 1000));
		*/
	}

}
