import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Restaurant {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtBCBurger;
	private JTextField jtxtReceipts;
	private JTextField jtxtCalculator;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;

	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	
	double[] i=new double[5];
	
	double Nigerian_Naira=302.96;
	double US_Dollar=1.52;
	double Kenya_Shilling=156.21;
	double Brazilian_Real=5.86;
	double Canadian_Dollar=2.03;
	double Indian_Rupee=100.68;
	double Phillippine_Peso=71.74;
	double Indonesian_Rupiah=20746.75;
	protected JLabel jlblConvert;
	private JTextField jtxtConversion;
	
	/**
	 * Launch the application.
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1053, 852);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(46, 82, 361, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChiken = new JLabel("Chicken Burger");
		lblChiken.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChiken.setBounds(22, 33, 131, 27);
		panel.add(lblChiken);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBurgerMeal.setBounds(22, 71, 131, 27);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCheeseBurger.setBounds(22, 109, 131, 27);
		panel.add(lblCheeseBurger);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setBounds(163, 37, 122, 20);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setBounds(163, 75, 122, 20);
		panel.add(jtxtChicBurgerMeal);
		jtxtChicBurgerMeal.setColumns(10);
		
		jtxtBCBurger = new JTextField();
		jtxtBCBurger.setBounds(163, 113, 122, 20);
		panel.add(jtxtBCBurger);
		jtxtBCBurger.setColumns(10);
		
		jtxtQty = new JTextField();
		jtxtQty.setBounds(163, 196, 122, 20);
		panel.add(jtxtQty);
		jtxtQty.setColumns(10);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Selec a drink", "Apple Juice", "Tea", "Ice Tea", "Coke", "Cola", "Orange", "Coffee", "Ice Coffee"}));
		jCmbDrink.setBounds(21, 196, 99, 20);
		panel.add(jCmbDrink);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrink.setBounds(22, 173, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQty.setBounds(163, 173, 46, 14);
		panel.add(lblQty);
		
		JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setBounds(22, 223, 122, 23);
		panel.add(jCDelivery);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setBounds(188, 223, 52, 23);
		panel.add(jCTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(417, 82, 275, 269);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "Nigeria", "USA", "Kenya", "Canada", "Brazil", "India", "Philippine", "Indonesia"}));
		jcmbCurrency.setBounds(66, 30, 148, 20);
		panel_1.add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(66, 67, 148, 36);
		panel_1.add(jtxtConvert);
		
		JLabel jtxtConversions = new JLabel("");
		jtxtConversions.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtConversions.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtConversions.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jtxtConversions.setBounds(66, 128, 148, 41);
		panel_1.add(jtxtConversions);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				double British_Pound=Double.parseDouble(jtxtConvert.getText());
				//1
				if(jcmbCurrency.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1=String.format("N %.2f", British_Pound*Nigerian_Naira);
					jtxtConversions.setText(cConvert1);
				}
				//2
				if(jcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1=String.format("$ %.2f", British_Pound*US_Dollar);
					jtxtConversions.setText(cConvert1);
				}
				//3
				if(jcmbCurrency.getSelectedItem().equals("Kenya"))
				{
					String cConvert2=String.format("KS%.2f", British_Pound*Kenya_Shilling);
					jtxtConversions.setText(cConvert2);
				}
				
				//4
				if(jcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert4=String.format("C$ %.2f", British_Pound*Canadian_Dollar);
					jtxtConversions.setText(cConvert4);
				}
				
				//5
				if(jcmbCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert5=String.format("Bra %.2f", British_Pound*Brazilian_Real);
					jtxtConversions.setText(cConvert5);
				}
				
				//6
				if(jcmbCurrency.getSelectedItem().equals("India"))
				{
					String cConvert6=String.format("INR %.2f", British_Pound*Indian_Rupee);
					jtxtConversions.setText(cConvert6);
				}
				
				//7
				if(jcmbCurrency.getSelectedItem().equals("Philippine"))
				{
					String cConvert7=String.format("PHP %.2f", British_Pound*Phillippine_Peso);
					jtxtConversions.setText(cConvert7);
				}
				
				//8
				if(jcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert8=String.format("DNR %.2f", British_Pound*Indonesian_Rupiah);
					jtxtConversions.setText(cConvert8);
				}
				
				//
				if(jcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert8=String.format("DNR %.2f", British_Pound*Indonesian_Rupiah);
					jtxtConversions.setText(cConvert8);
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnConvert.setBounds(21, 213, 97, 23);
		panel_1.add(jbtnConvert);
		
		JButton JbtnClose = new JButton("Close");
		JbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConversions.setText(null);
				jtxtConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One...");
			}
		});
		JbtnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		JbtnClose.setBounds(128, 213, 89, 23);
		panel_1.add(JbtnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(46, 362, 361, 253);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrimnks = new JLabel("Cost of Drinks");
		lblCostOfDrimnks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfDrimnks.setBounds(30, 61, 131, 27);
		panel_2.add(lblCostOfDrimnks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfMeal.setBounds(30, 99, 131, 27);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfDelivery.setBounds(30, 137, 131, 27);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jlblCostofDrinks = new JLabel("");
		jlblCostofDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostofDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblCostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDrinks.setBounds(192, 68, 110, 20);
		panel_2.add(jlblCostofDrinks);
		
		JLabel jlblCostofMeal = new JLabel("");
		jlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostofMeal.setBounds(192, 106, 110, 20);
		panel_2.add(jlblCostofMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(192, 144, 110, 20);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(417, 362, 275, 253);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTax.setBounds(31, 82, 100, 27);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubTotal.setBounds(31, 116, 121, 27);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(31, 147, 100, 27);
		panel_3.add(lblTotal);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(162, 78, 86, 20);
		panel_3.add(jlblTax);
		
		JLabel jlblsubTotal = new JLabel("");
		jlblsubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblsubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblsubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblsubTotal.setBounds(162, 116, 86, 20);
		panel_3.add(jlblsubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(162, 154, 86, 20);
		panel_3.add(jlblTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(704, 82, 288, 533);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 52, 195, 435);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		jtxtReceipts = new JTextField();
		jtxtReceipts.setBounds(10, 11, 170, 368);
		panel_6.add(jtxtReceipts);
		jtxtReceipts.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
         

		
		panel_7.setLayout(null);
		
		jtxtCalculator = new JTextField();
		jtxtCalculator.setBounds(10, 11, 170, 40);
		panel_7.add(jtxtCalculator);
		jtxtCalculator.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 74, 58, 23);
		panel_7.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBounds(69, 74, 58, 23);
		panel_7.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(128, 75, 52, 23);
		panel_7.add(button_1);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBounds(10, 108, 58, 23);
		panel_7.add(btnNewButton_1);
		
		JButton button_2 = new JButton("5");
		button_2.setBounds(69, 108, 58, 23);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setBounds(128, 108, 52, 23);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.setBounds(10, 142, 58, 23);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.setBounds(69, 142, 58, 23);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.setBounds(128, 142, 52, 23);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.setBounds(10, 176, 58, 23);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("+");
		button_8.setBounds(69, 176, 58, 23);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.setBounds(128, 176, 52, 23);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setBounds(10, 210, 58, 23);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setBounds(69, 210, 58, 23);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("%");
		button_12.setBounds(128, 210, 52, 23);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton(".");
		button_13.setBounds(10, 244, 58, 23);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("+/-");
		button_14.setBounds(69, 244, 58, 23);
		panel_7.add(button_14);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(122, 244, 58, 23);
		panel_7.add(btnC);
		
		JButton button_16 = new JButton("=");
		button_16.setBounds(20, 272, 146, 34);
		panel_7.add(button_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(46, 626, 946, 89);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//1
				double ChicBurger=Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurger=2.39;
				double Burger;
				
				Burger=(ChicBurger*iChicBurger);
				String pMeal=String.format("%.2f", Burger);
				jlblCostofMeal.setText(pMeal);
				
				//2
				double ChicBurgerMeal=Double.parseDouble(jtxtChicBurgerMeal.getText());
				double iChicBurgerMeal=4.39;
				double BurgerMeal;
				
				BurgerMeal=(ChicBurgerMeal*iChicBurgerMeal);
				String cbMeal=String.format("%.2f", BurgerMeal+Burger);
				jlblCostofMeal.setText(cbMeal);
				
				//3
				double CheeseBurger=Double.parseDouble(jtxtBCBurger.getText());
				double CheeseBurgerPrice=3.39;
				double CheeseBurgerMeal;
				
				CheeseBurgerMeal=(CheeseBurger*CheeseBurgerPrice);
				String cheese=String.format("%.2f", CheeseBurgerMeal+BurgerMeal+Burger);
				jlblCostofMeal.setText(cheese);
				
				//-----------------------Home Delivery----------------------------
				double iDelivery=3.39;
				if(jCDelivery.isSelected()){
					String pDelivery=String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				else
				{
					jlblCostOfDelivery.setText("0");
				}
				
				
				
				//-----------------------------Drinks-----------------
				double Drinks=Double.parseDouble(jtxtQty.getText());
				double Tea=1.20*Drinks;
				double Ice_Tea=0.90*Drinks;
				double Coffee=2.50*Drinks;
				double Ice_Coffee=1.10*Drinks;
				double Cola=2.10*Drinks;
				double Coke=1.60*Drinks;
				double Orange=1.70*Drinks;
				double Apple_Juice=1.99*Drinks;
				//1
				if(jCmbDrink.getSelectedItem().equals("Apple Juice"))
				{
					
					String cApple_Juice=String.format("%.2f", Apple_Juice);
					jlblCostofDrinks.setText(cApple_Juice);
				}
				//2
				if(jCmbDrink.getSelectedItem().equals("Tea"))
				{
					
					String cTea=String.format("%.2f",Tea);
					jlblCostofDrinks.setText(cTea);
				}
				//3
				if(jCmbDrink.getSelectedItem().equals("Ice Tea"))
				{
					
					String cIce_Tea=String.format("%.2f",Ice_Tea);
					jlblCostofDrinks.setText(cIce_Tea);
				}
				//4
				if(jCmbDrink.getSelectedItem().equals("Coke"))
				{
					
					String cCoke=String.format("%.2f",Coke);
					jlblCostofDrinks.setText(cCoke);
				}
				//5
				if(jCmbDrink.getSelectedItem().equals("Cola"))
				{
					
					String cCola=String.format("%.2f",Cola);
					jlblCostofDrinks.setText(cCola);
				}
				//6
				if(jCmbDrink.getSelectedItem().equals("Orange"))
				{
					
					String cOrange=String.format("%.2f",Orange);
					jlblCostofDrinks.setText(cOrange);
				}
				//7
				if(jCmbDrink.getSelectedItem().equals("Coffee"))
				{
					
					String cCoffee=String.format("%.2f",Coffee);
					jlblCostofDrinks.setText(cCoffee);
				}
				//8
				if(jCmbDrink.getSelectedItem().equals("Ice Coffee"))
				{
					
					String cIceCoffee=String.format("%.2f",Ice_Coffee);
					jlblCostofDrinks.setText(cIceCoffee);
				}
				
				//9
				if(jCmbDrink.getSelectedItem().equals("Selec a drink"))
				{
					
					
					jlblCostofDrinks.setText("0");
				}
				
				
				
				//--------Tax------------------------------------------------
				double cTotal1=Double.parseDouble(jlblCostofDrinks.getText());
				double cTotal2=Double.parseDouble(jlblCostofMeal.getText());
				double cTotal3=Double.parseDouble(jlblCostOfDelivery.getText());
				double AllTotal=(cTotal1+cTotal2+cTotal3)/100;
				
				if(jCTax.isSelected()){
					String iTotal=String.format("%.2f",AllTotal);
					jlblTax.setText(iTotal);
					
				}
				//--------Total------------------------------------------------
				double cTotal4=Double.parseDouble(jlblTax.getText());
				
				double subTotal=(cTotal1+cTotal2+cTotal3);
				String isubTotal=String.format("%.2f", subTotal);
				jlblsubTotal.setText(isubTotal);
				
				double allTotal=(cTotal1+cTotal2+cTotal3+cTotal4);
				String iTotal=String.format("%.2f", allTotal);
				jlblTotal.setText(iTotal);
				
				
				String iTaxTotal=String.format("%.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
				
				
				
				
				
				
			}
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnTotal.setBounds(40, 34, 89, 23);
		panel_5.add(jBtnTotal);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1=Double.parseDouble(jtxtChicBurger.getText());
				double Qty2=Double.parseDouble(jtxtChicBurgerMeal.getText());
				double Qty3=Double.parseDouble(jtxtBCBurger.getText());
				//jtxtReceipts.
				jtxtReceipts.setText("\t\nRestaurant Management System:\n\n"+"Chicken Burger:\t\t"
				+Qty1+"\nChicken Burger Meal:\t\t"+
						Qty2+"\nBacon and Burger:\t\t"
						+Qty3+"\n\nThanks for Job Estimator");
				
			}
		});
		jBtnReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnReceipt.setBounds(198, 34, 110, 23);
		panel_5.add(jBtnReceipt);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*labelCostOfDelivery.setText(null);
				JbtnTotal.setText(null);
				lblSubTotal.setText(null);
				lblTax.setText(null);*/
				//jlblCostOfDelivery.setText(null);
				//jlbl
				
				
				jlblCostOfDelivery.setText(null);
				jlblsubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jbtnConvert.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostofDrinks.setText(null);
				 jlblCostofMeal.setText("0");
				 jlblsubTotal.setText(null);
				 jlblTax.setText(null);
				 jlblTotal.setText(null);
				 jtxtChicBurger.setText(null);
				 jtxtChicBurgerMeal.setText(null);
				 jtxtBCBurger.setText(null);
				 jtxtQty.setText(null);
			     jtxtConvert.setText(null);
			     jCmbDrink.setSelectedItem("Selecy a Drink");
			     jcmbCurrency.setSelectedItem("Choose One...");
			  
			   
			   
			  
			   
			   
			   
				
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnReset.setBounds(425, 34, 89, 23);
		panel_5.add(jBtnReset);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnExit.setBounds(714, 34, 89, 23);
		panel_5.add(jBtnExit);
		
		JLabel label = new JLabel("");
		label.setBounds(208, 26, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblResturent = new JLabel("Loan Management System");
		lblResturent.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblResturent.setBounds(46, 26, 660, 45);
		frame.getContentPane().add(lblResturent);
	}
}
