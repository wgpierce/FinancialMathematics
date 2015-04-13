package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

class OverallActionListener implements ActionListener {

	public void actionPerformed(ActionEvent a) {
		JButton b = (JButton) a.getSource();
		// iterate through all possible buttons
		// TODO: implement buttons

		String message = "You Did Something Wrong";
		String ac = b.getActionCommand();
		try {
			if (ac.equals("calcEIR")) {
				String text = FinMathGUI.EIR.getText();
				int commaLocation = text.indexOf(',');
				double amount1 = Double.parseDouble(text.substring(0,
						commaLocation));
				double amount2 = Double.parseDouble(text
						.substring(commaLocation + 1));
				message = String.format("%.4f",
						FinMath.calcEIR(amount1, amount2));
			}

			else if (ac.equals("calcDFI")) {
				String text = FinMathGUI.DFI.getText();
				double interest = Double.parseDouble(text);
				message = String.format("%.4f", FinMath.calcDFI(interest));
			} else if (ac.equals("calcIFD")) {
				String text = FinMathGUI.IFD.getText();
				double discount = Double.parseDouble(text);
				message = String.format("%.4f", FinMath.calcIFD(discount));
			} else if (ac.equals("calcPVSI")) {
				String text = FinMathGUI.PVSI.getText();
				int commaLocation1 = text.indexOf(',');
				int commaLocation2 = text.indexOf(',', commaLocation1 + 1);
				double amount = Double.parseDouble(text.substring(0,
						commaLocation1));
				double interest = Double.parseDouble(text.substring(
						commaLocation1 + 1, commaLocation2));
				double time = Double.parseDouble(text
						.substring(commaLocation2 + 1));
				message = String.format("%.4f",
						FinMath.calcPVSI(amount, interest, time));
			} else if (ac.equals("calcPVCI")) {
				String text = FinMathGUI.PVCI.getText();
				int commaLocation1 = text.indexOf(',');
				int commaLocation2 = text.indexOf(',', commaLocation1 + 1);
				double amount = Double.parseDouble(text.substring(0,
						commaLocation1));
				double interest = Double.parseDouble(text.substring(
						commaLocation1 + 1, commaLocation2));
				double time = Double.parseDouble(text
						.substring(commaLocation2 + 1));
				message = String.format("%.4f",
						FinMath.calcPVCI(amount, interest, time));
			} else if (ac.equals("calcPVSD")) {
				String text = FinMathGUI.PVSD.getText();
				int commaLocation1 = text.indexOf(',');
				int commaLocation2 = text.indexOf(',', commaLocation1 + 1);
				double amount = Double.parseDouble(text.substring(0,
						commaLocation1));
				double discount = Double.parseDouble(text.substring(
						commaLocation1 + 1, commaLocation2));
				double time = Double.parseDouble(text
						.substring(commaLocation2 + 1));
				message = String.format("%.4f",
						FinMath.calcPVSD(amount, discount, time));
			} else if (ac.equals("calcPVCD")) {
				String text = FinMathGUI.PVCD.getText();
				int commaLocation1 = text.indexOf(',');
				int commaLocation2 = text.indexOf(',', commaLocation1 + 1);
				double amount = Double.parseDouble(text.substring(0,
						commaLocation1));
				double discount = Double.parseDouble(text.substring(
						commaLocation1 + 1, commaLocation2));
				double time = Double.parseDouble(text
						.substring(commaLocation2 + 1));
				message = String.format("%.4f",
						FinMath.calcPVCD(amount, discount, time));
			} else if (ac.equals("calcNPVSI")) {
				String text = FinMathGUI.NPVSI.getText();
				int commaLocation1 = text.indexOf(',');
				String textValues = text.substring(commaLocation1 + 1);
				String[] stringValues = textValues.split(",");
				double[] doubleValues = new double[stringValues.length];
				for (int i = 0; i < stringValues.length; i++) {
					doubleValues[i] = Double.parseDouble(stringValues[i]);
				}
				double interest = Double.parseDouble(text.substring(0,
						commaLocation1));
				message = String.format("%.4f",
						FinMath.calcNPVSI(interest, doubleValues));
			} else if (ac.equals("calcNPVCI")) { 
				String text = FinMathGUI.NPVCI.getText();
				int commaLocation1 = text.indexOf(',');
				String textValues = text.substring(commaLocation1 + 1);
				String[] stringValues = textValues.split(",");
				double[] doubleValues = new double[stringValues.length];
				for (int i = 0; i < stringValues.length; i++) {
					doubleValues[i] = Double.parseDouble(stringValues[i]);
				}
				double interest = Double.parseDouble(text.substring(0,
						commaLocation1));
				message = String.format("%.4f",
						FinMath.calcNPVCI(interest, doubleValues));
			} else if (ac.equals("CalcNI")) {
				String text = FinMathGUI.EIR.getText();
				int commaLocation = text.indexOf(',');
				double i = Double.parseDouble(text.substring(0,
						commaLocation));
				double j = Double.parseDouble(text
						.substring(commaLocation + 1));
				message = String.format("%.4f",
						FinMath.calcNI(i, j));
			}
			
			//Chapter 2
					/*
			} else if (ac.equals("calcPVAI")) { 
				FinMath.calcPVAI(); 
			} else if (ac.equals("calcFVAI")) {
				FinMath.calcFVAI(amount, interest,time)
			} else if (ac.equals("calcPVAD")) {
			FinMath.calcPVAD();
			}
			else if (ac.equals("calcFVAD")) {
			FinMath.calcFVAD();
			}
			*/
		} catch (Exception e) {
			message = "You did something wrong";
		}
		printInfo(message);
	}

	private void printInfo(String s) {
		JOptionPane.showMessageDialog(null, s, "Answer",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
