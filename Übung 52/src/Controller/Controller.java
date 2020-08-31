package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Model;
import View.View;

public class Controller implements ActionListener{
	private Model m;
	private View v;
	
	public Controller() {
		
		
		m = new Model();
		v = new View();
		v.setActionListener(this);
	
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Finden")){
			if(v.getC().getSelectedIndex()== 1) {
		
				m.rsuchen(v.getO().getText());
			
				
				
				
			}
			if(e.getActionCommand().equals("Finden")) {
				if(v.getC().getSelectedIndex()== 0) {
				

				m.suchen(v.getB().getText(),v.getO().getText());
				
				
						
						
						
					}
				}
				
			}
			
			
		}
		
	}


