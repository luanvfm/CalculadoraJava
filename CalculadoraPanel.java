package calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CalculadoraPanel extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private boolean primeiroCampoSelecionado = true;
	private int valorAtual = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CalculadoraPanel dialog = new CalculadoraPanel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CalculadoraPanel() {
		setBounds(100, 100, 376, 553);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(78, 11, 63, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setBounds(26, 43, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampoSelecionado = true;
			}
		});
		textField.setEditable(false);
		textField.setBounds(26, 68, 189, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setBounds(26, 110, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampoSelecionado = false;
			}
		});
		textField_1.setEditable(false);
		textField_1.setBounds(26, 135, 189, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(26, 180, 85, 14);
		contentPanel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(26, 205, 189, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "9");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "9");
				}
			}
		});
		btnNewButton.setBounds(26, 253, 55, 38);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "8");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "8");
				}
			}
		});
		btnNewButton_2.setBounds(91, 253, 55, 38);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "7");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "7");
				}
			}
		});
		btnNewButton_1.setBounds(160, 253, 55, 38);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "6");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "6");
				}
			}
		});
		btnNewButton_3.setBounds(26, 302, 55, 38);
		contentPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "5");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "5");
				}
			}
		});
		btnNewButton_4.setBounds(91, 302, 55, 38);
		contentPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "4");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "4");
				}
			}
		});
		btnNewButton_5.setBounds(160, 302, 55, 38);
		contentPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "3");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "3");
				}
			}
		});
		btnNewButton_6.setBounds(26, 351, 55, 38);
		contentPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "2");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "2");
				}
			}
		});
		btnNewButton_7.setBounds(91, 351, 55, 38);
		contentPanel.add(btnNewButton_7);
		
		
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "1");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "1");
				}
		 }
		}
			
		);
		btnNewButton_8.setBounds(160, 351, 55, 38);
		contentPanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("/");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valorText1 = Integer.parseInt(textField.getText());
				int valorText2 = Integer.parseInt(textField_1.getText());
				int divisao = valorText1 / valorText2;
				valorAtual = valorAtual + divisao;
				
				
				
			}
		});
		btnNewButton_9.setBounds(225, 253, 55, 38);
		contentPanel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorText1 = Integer.parseInt(textField.getText());
				int valorText2 = Integer.parseInt(textField_1.getText());
				int multiplica = valorText1 * valorText2;
				valorAtual = valorAtual + multiplica;
			
			}
		});
		btnNewButton_10.setBounds(225, 302, 55, 38);
		contentPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorText1 = Integer.parseInt(textField.getText());
				int valorText2 = Integer.parseInt(textField_1.getText());
				int soma = valorText1 + valorText2;
				valorAtual = valorAtual + soma;
			}
		});
		btnNewButton_11.setBounds(225, 351, 55, 38);
		contentPanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorText1 = Integer.parseInt(textField.getText());
				int valorText2 = Integer.parseInt(textField_1.getText());
				int subtrair = valorText1 - valorText2;
				valorAtual = valorAtual + subtrair;
				
			}
		});
		btnNewButton_12.setBounds(225, 400, 55, 38);
		contentPanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = String.valueOf(valorAtual);
				textField_2.setText(resultado);
			}
		});
		btnNewButton_13.setBounds(160, 400, 55, 38);
		contentPanel.add(btnNewButton_13);
		
		JButton btnNewButton_8_1 = new JButton("0");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorAtual = "";
				if (primeiroCampoSelecionado == true) {
					if (textField.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField.getText());
						ValorAtual = textField.getText();
					
					textField.setText(String.valueOf(ValorAtual) + "0");
				} else if (primeiroCampoSelecionado == false){
					if (textField_1.getText().isEmpty() == false)
						// ValorAtual = Integer.parseInt(textField_1.getText());
					ValorAtual = textField_1.getText();
					textField_1.setText(String.valueOf(ValorAtual) + "0");
				}
			}
		});
		btnNewButton_8_1.setBounds(91, 400, 55, 38);
		contentPanel.add(btnNewButton_8_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
