package Vending_Machine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CVM {

	//protected static final AbstractButton frappe_RB = null;
	//protected static final AbstractButton mocha_RB = null;
	protected static final Component rootPane = null;
	private JFrame frmCoffeeVendingMachin;
	private JTextField moneyTF;
	private JTextField changeTF;
	private JRadioButton espresso_RB;
	private JRadioButton double_espressoRB;
	private JRadioButton americano_RB;
	private JRadioButton americano_with_milkRB;
	private JRadioButton cappuccino_RB;
	private JRadioButton latte_RB;
	private JRadioButton mocha_RB;
	private JRadioButton frappe_RB;
	//public AbstractButton double_espressoRB;
	//public AbstractButton americano_RB;
	//public AbstractButton americano_with_milkRB;
	//public AbstractButton cappuccino_RB;
	//public AbstractButton latteRB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CVM window = new CVM();
					window.frmCoffeeVendingMachin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CVM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoffeeVendingMachin = new JFrame();
		frmCoffeeVendingMachin.setTitle("Coffee Vending Machine");
		frmCoffeeVendingMachin.setBounds(100, 100, 431, 376);
		frmCoffeeVendingMachin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoffeeVendingMachin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffee Vending Machine");
		lblNewLabel.setBounds(0, 0, 434, 25);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmCoffeeVendingMachin.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Select item", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(59, 103, 306, 140);
		frmCoffeeVendingMachin.getContentPane().add(panel);
		panel.setLayout(null);
		
		espresso_RB = new JRadioButton("Espresso 6z\u0142");
		espresso_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				{
					if(espresso_RB.isSelected()) {
						
						double_espressoRB.setSelected(false);
						americano_RB.setSelected(false);
						americano_with_milkRB.setSelected(false);
						cappuccino_RB.setSelected(false);
						latte_RB.setSelected(false);
						frappe_RB.setSelected(false);
						mocha_RB.setSelected(false);
					}
				}
			}
		});
		espresso_RB.setBounds(10, 16, 118, 23);
		panel.add(espresso_RB);
		
		
		double_espressoRB = new JRadioButton("Double Espresso 8z\u0142");	
		double_espressoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(double_espressoRB.isSelected()) {
					
					espresso_RB.setSelected(false);
					americano_RB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					cappuccino_RB.setSelected(false);
					latte_RB.setSelected(false);
					frappe_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}
			}
		});
		double_espressoRB.setBounds(130, 16, 170, 23);
		panel.add(double_espressoRB);
		
		
		americano_RB = new JRadioButton("Americano 9z\u0142");
		americano_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(americano_RB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					cappuccino_RB.setSelected(false);
					latte_RB.setSelected(false);
					frappe_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}
			}
		});
		americano_RB.setBounds(10, 44, 118, 23);
		panel.add(americano_RB);
		
		americano_with_milkRB = new JRadioButton("Americano with milk 10z\u0142");
		americano_with_milkRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(americano_with_milkRB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_RB.setSelected(false);
					cappuccino_RB.setSelected(false);
					latte_RB.setSelected(false);
					frappe_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}
			}
		});
		americano_with_milkRB.setBounds(130, 44, 170, 23);
		panel.add(americano_with_milkRB);
		
		cappuccino_RB = new JRadioButton("Cappuccino 11z\u0142");
		cappuccino_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cappuccino_RB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_RB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					latte_RB.setSelected(false);
					frappe_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}		
			}
		});
		cappuccino_RB.setBounds(10, 70, 118, 23);
		panel.add(cappuccino_RB);
		
		latte_RB = new JRadioButton("Latte 12z\u0142");
		latte_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(latte_RB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_RB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					cappuccino_RB.setSelected(false);
					frappe_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}		
			}
		});
		latte_RB.setBounds(130, 70, 170, 23);
		panel.add(latte_RB);
		
		frappe_RB = new JRadioButton("Frappe 13z\u0142");
		frappe_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(frappe_RB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_RB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					cappuccino_RB.setSelected(false);
					latte_RB.setSelected(false);
					mocha_RB.setSelected(false);
				}	
			}
		});
		frappe_RB.setBounds(10, 96, 118, 23);
		panel.add(frappe_RB);
		
		mocha_RB = new JRadioButton("Mocha 14z\u0142");
		mocha_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(mocha_RB.isSelected()) {
					
					espresso_RB.setSelected(false);
					double_espressoRB.setSelected(false);
					americano_RB.setSelected(false);
					americano_with_milkRB.setSelected(false);
					cappuccino_RB.setSelected(false);
					latte_RB.setSelected(false);
					frappe_RB.setSelected(false);
				}	
			}
		});
		mocha_RB.setBounds(130, 96, 170, 23);
		panel.add(mocha_RB);
		
		JButton purchaseBtn = new JButton("Purchase");
		purchaseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double money = 0;
				
				money = Double.parseDouble(moneyTF.getText());
				
				if (espresso_RB.isSelected()) {
					money = money - 6;
				}else if (double_espressoRB.isSelected()) {
					money = money - 8;
				}else if (americano_RB.isSelected()) {
					money = money - 9;
				}else if (americano_with_milkRB.isSelected()) {
					money = money - 10;
				}else if (cappuccino_RB.isSelected()) {
					money = money - 11;
				}else if (latte_RB.isSelected()) {
					money = money - 12;
				}else if (frappe_RB.isSelected()) {
					money = money - 13;
				}else if (mocha_RB.isSelected()) {
					money = money - 14;
				}
				
				
				if (money < 0) {
					JOptionPane.showMessageDialog(rootPane, "Sorry You Do Not Have Enough Money");
				}else {
					changeTF.setText(Double.toString(money));
				}
				
			}
		});
		purchaseBtn.setBounds(59, 266, 89, 23);
		frmCoffeeVendingMachin.getContentPane().add(purchaseBtn);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				espresso_RB.setSelected(false);
				double_espressoRB.setSelected(false);
				americano_RB.setSelected(false);
				americano_with_milkRB.setSelected(false);
				cappuccino_RB.setSelected(false);
				latte_RB.setSelected(false);
				frappe_RB.setSelected(false);
				mocha_RB.setSelected(false);
				moneyTF.setText("");
				changeTF.setText("");
			}
		});
		clearBtn.setBounds(158, 266, 89, 23);
		frmCoffeeVendingMachin.getContentPane().add(clearBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		cancelBtn.setBounds(257, 266, 89, 23);
		frmCoffeeVendingMachin.getContentPane().add(cancelBtn);
		
		JLabel lblNewLabel_1 = new JLabel("Insert Money:");
		lblNewLabel_1.setBounds(81, 36, 89, 20);
		frmCoffeeVendingMachin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Change:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(59, 61, 89, 14);
		frmCoffeeVendingMachin.getContentPane().add(lblNewLabel_2);
		
		moneyTF = new JTextField();
		moneyTF.setBounds(180, 36, 86, 20);
		frmCoffeeVendingMachin.getContentPane().add(moneyTF);
		moneyTF.setColumns(10);
		
		changeTF = new JTextField();
		changeTF.setEditable(false);
		changeTF.setBounds(180, 58, 86, 20);
		frmCoffeeVendingMachin.getContentPane().add(changeTF);
		changeTF.setColumns(10);
	}

}
