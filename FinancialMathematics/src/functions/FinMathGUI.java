package functions;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;

public class FinMathGUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static JTextField EIR;
	static JTextField DFI;
	static JTextField IFD;
	static JTextField PVSI;
	static JTextField PVCI;
	static JTextField PVSD;
	static JTextField PVCD;
	static JTextField NPVSI;
	static JTextField NPVCI;
	static JTextField NI;
	static JTextField PVAI;
	static JTextField FVAI;
	static JTextField PVAD;
	static JTextField FVAD;
	
	public FinMathGUI() {
		super(new GridLayout(1, 1));
		// add panes and buttons inside
		JTabbedPane tabbedPane = new JTabbedPane();

		JPanel ch1 = new JPanel(new GridLayout(0, 2));

		EIR = new JTextField("Amount1, Amount2");
		JButton calcEIRButton = new JButton("calcEIR");
		calcEIRButton.addActionListener(new OverallActionListener());
		EIR.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (EIR.getText().equals("Amount1, Amount2"))
				EIR.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (EIR.getText().equals("")) {
					EIR.setText("Amount1, Amount2");
				}
			}
		});
		ch1.add(EIR);
		ch1.add(calcEIRButton);

		
		DFI = new JTextField("Interest");
		JButton calcDFIButton = new JButton("calcDFI");
		calcDFIButton.addActionListener(new OverallActionListener());
		DFI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (DFI.getText().equals("Interest"))
					DFI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (DFI.getText().equals("")) {
					DFI.setText("Interest");
				}
			}
		});
		ch1.add(DFI);
		ch1.add(calcDFIButton);

		IFD = new JTextField("Discount");
		JButton calcIFDButton = new JButton("calcIFD");
		calcIFDButton.addActionListener(new OverallActionListener());
		IFD.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (IFD.getText().equals("Discount"))
				IFD.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (IFD.getText().equals("")) {
					IFD.setText("Discount");
				}
			}
		});
		ch1.add(IFD);
		ch1.add(calcIFDButton);

		PVSI = new JTextField("Amount, Interest, Time");
		JButton calcPVSIButton = new JButton("calcPVSI");
		calcPVSIButton.addActionListener(new OverallActionListener());
		PVSI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PVSI.getText().equals("Amount, Interest, Time"))
				PVSI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (PVSI.getText().equals("")) {
					PVSI.setText("Amount, Interest, Time");
				}
			}
		});
		ch1.add(PVSI);
		ch1.add(calcPVSIButton);

		PVCI = new JTextField("Amount, Interest, Time");
		JButton calcPVCIButton = new JButton("calcPVCI");
		calcPVCIButton.addActionListener(new OverallActionListener());
		PVCI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PVCI.getText().equals("Amount, Interest, Time"))
					PVCI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (PVCI.getText().equals("")) {
					PVCI.setText("Amount, Interest, Time");
				}
			}
		});
		ch1.add(PVCI);
		ch1.add(calcPVCIButton);

		PVSD = new JTextField("Amount, Discount, Time");
		JButton calcPVSDButton = new JButton("calcPVSD");
		calcPVSDButton.addActionListener(new OverallActionListener());
		PVSD.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PVSD.getText().equals("Amount, Discount, Time"))
					PVSD.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (PVSD.getText().equals("")) {
					PVSD.setText("Amount, Discount, Time");
				}
			}
		});
		ch1.add(PVSD);
		ch1.add(calcPVSDButton);

		PVCD = new JTextField("Amount, Discount, Time");
		JButton calcPVCDButton = new JButton("calcPVCD");
		calcPVCDButton.addActionListener(new OverallActionListener());
		PVCD.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PVCD.getText().equals("Amount, Discount, Time"))
					PVCD.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (PVCD.getText().equals("")) {
					PVCD.setText("Amount, Discount, Time");
				}
			}
		});
		ch1.add(PVCD);
		ch1.add(calcPVCDButton);

		NPVSI = new JTextField("Interest, Values...");
		JButton calcNPVSIButton = new JButton("calcNPVSI");
		calcNPVSIButton.addActionListener(new OverallActionListener());
		NPVSI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (NPVSI.getText().equals("Interest, Values..."))
				NPVSI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (NPVSI.getText().equals("")) {
					NPVSI.setText("Interest, Values...");
				}
			}
		});
		ch1.add(NPVSI);
		ch1.add(calcNPVSIButton);
		
		
		NPVCI = new JTextField("Interest, Values...");
		JButton calcNPVCIButton = new JButton("calcNPVCI");
		calcNPVCIButton.addActionListener(new OverallActionListener());
		NPVCI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (NPVCI.getText().equals("Interest, Values..."))
					NPVCI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (NPVCI.getText().equals("")) {
					NPVCI.setText("Interest, Values...");
				}
			}
		});
		ch1.add(NPVCI);
		ch1.add(calcNPVCIButton);
		
		
		NI = new JTextField("i,r");
		JButton calcNIButton = new JButton("calcNI");
		calcNPVSIButton.addActionListener(new OverallActionListener());
		NI.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (NI.getText().equals("i,j"))
				NI.setText("");
				// Empty the text field when it receives focus
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (NI.getText().equals("")) {
					NI.setText("i,r");
				}
			}
		});
		ch1.add(NI);
		ch1.add(calcNIButton);
		
		tabbedPane.addTab("Chapter 1", null, ch1, null);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		JPanel ch2 = new JPanel(new GridLayout(0, 2));
		tabbedPane.addTab("Chapter 2", null, ch2, null);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		JPanel ch3 = new JPanel(new GridLayout(0, 2));
		tabbedPane.addTab("Chapter 3", null, ch3, null);
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		JPanel ch4 = new JPanel(new GridLayout(0, 2));
		ch4.setPreferredSize(new Dimension(500, 0));
		tabbedPane.addTab("Chapter 4", null, ch4, null);
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

		// Add the tabbed pane to this panel.
		add(tabbedPane);

		// The following line enables to use scrolling tabs.
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Financial Mathematics Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add content to the window.
		frame.add(new FinMathGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setLocation(300,50);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}
}
