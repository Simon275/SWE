package View;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controller.Controller;

public class View extends JFrame{

	private JTextField b = new JTextField("Name",15);

	private JTextField o = new JTextField("Ort",15);

String comboBoxListe[] = {"Suche"," Rückwärtsuche"};
private JPanel top2 = new JPanel(new FlowLayout());
	private JTextArea ausgabe = new JTextArea("Testplan:\nEingabe links ist Nachname , rechts ist der Ort:\n"
			
	+ "Folgende Daten sind möglich : \n Wenn man nicht den Ort weiß kann man sich alle mit dem gleichem Namen anzeigen lassen, indem man nur den Namen eingibt\n"
	+ "Namen sind: Müller, Fischer,Heinz,Huber,Fuchs\n"
	+ "Städte sind :München,Berlin\n"
			+ "");
	private JComboBox c = new JComboBox(comboBoxListe);

	private JButton f = new JButton("Finden");
	private JPanel flow = new JPanel(new FlowLayout());
	private JPanel flow2 = new JPanel(new FlowLayout());
	private JPanel flow3 = new JPanel(new FlowLayout());
	private JPanel flow4= new JPanel(new FlowLayout());
	private JPanel grund = new JPanel();
	private JPanel bot = new JPanel(new GridLayout(1,4));
	private JPanel top = new JPanel(new GridLayout(2,1));
	
	public View() {
	
		Container cp = getContentPane();

		setVisible(true);
		setSize(new Dimension(680,300));
setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	ausgabe.setEditable(false);
	flow.add(c);
	flow2.add(b);
	flow3.add(o);
	flow4.add(f);
		bot.add(flow);
		bot.add(flow2);	
	
		bot.add(flow3);
		bot.add(flow4);
	
	

		top.add(bot);
		top2.add(ausgabe);
		top.add(top2);
		
	
		f.setActionCommand("Finden");
	
grund.add(top);
cp.add(grund);


c.addActionListener(new ActionListener() {	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(c.getSelectedIndex()== 0) {
			System.out.println(c.getSelectedItem());
			
			b.setVisible(true);
			
		}
		if(c.getSelectedIndex()== 1) {
			System.out.println(c.getSelectedItem());
			
		b.setVisible(false);
		}
			
		}
				
	
	

	});
}

	public JComboBox getC() {
		return c;
	}

	public void setC(JComboBox c) {
		this.c = c;
	}

	public JTextField getO() {
		return o;
	}

	public JTextField getB() {
		return b;
	}

	public void setActionListener(ActionListener e) {
		f.addActionListener(e);
		
	}

	public void setListListener(ActionListener e) {
		
		
	}
}


	




