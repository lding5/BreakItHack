import java.awt.event.ActionListener;
import javax.swing.*;

public class HoneyView extends JFrame {

	private JLabel label;
	private JTextField honeypot = new JTextField(3);

	
	private JTextField eater1Name = new JTextField(7);
	private JTextField eater1Eating = new JTextField(3);
	private JTextField eater1Napping = new JTextField(5);

	private JButton submit = new JButton("Submit");

	private JTextField result = new JTextField(10);


	public HoneyView(){
		JPanel honeyPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,200);

		// honeyPanel.add(honeyLabel);
		honeyPanel.add(label = new JLabel("Honeypot"));
		honeyPanel.add(honeypot);

		//honeyPanel.add(eater1Label);
		honeyPanel.add(label = new JLabel("Eater1"));
		honeyPanel.add(eater1Name);
		honeyPanel.add(eater1Eating);
		honeyPanel.add(eater1Napping);

		honeyPanel.add(submit);

		honeyPanel.add(label = new JLabel("Last Eater"));
		honeyPanel.add(result);

		this.add(honeyPanel);
	}
	
	public int getHoneypot() { return Integer.parseInt(honeypot.getText()); }
	public String getEater1Name() { return eater1Name.getText(); }
	public int getEater1Eating() { return Integer.parseInt(eater1Eating.getText()); }
	public int getEater1Napping() { return Integer.parseInt(eater1Napping.getText()); }

	public void setResult(String lastEater) {
		result.setText(lastEater); 
	}	

	// directs to the controller
	public void addHoneyListener(ActionListener listenForSubmit){
		submit.addActionListener(listenForSubmit);
	}

	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}



}