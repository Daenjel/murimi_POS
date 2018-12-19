package wesh_POS;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;


public class About extends Main_POS {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new About();
	}

	/**
	 * Create the frame.
	 */
	public About() {
		JInternalFrame FrameAbout = new JInternalFrame("About");
		FrameAbout.getContentPane().setBackground(Color.CYAN);
		FrameAbout.getContentPane().setLayout(null);
		FrameAbout.setBounds(0, 0, 1055, 645);
		FrameAbout.setVisible(true);
		desktopPos.add(FrameAbout);

		dashboard_panel.setVisible(false);
		btnDashboard.setBackground(UIManager.getColor("Button.background"));
		btnSales.setBackground(UIManager.getColor("Button.background"));
		btnStock.setBackground(UIManager.getColor("Button.background"));
		btnAbout.setBackground(Color.CYAN);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(92, 49, 853, 492);
		FrameAbout.getContentPane().add(panel);
		panel.setLayout(null);
		
		String about = new String("Wesh Spares"+"\n"+"It is important for any type of business to keep track of stock and profit."
				+"Airtime profits are among the difficult aspects to keep track of."
				+" By developing airtime profit calculator app, it will be easier for business people to have accurate data of their airtime sales. The app"
				+"herein seeks to compute value of daily and periodic airtime purchase so as to help determine period sales, thus computing profits from"
				+"airtime sales both on a daily basis as well as annually. This app will be a great asset as it will help the business people to calculate" 
				+"daily or periodic refills needed from wholesalers. Furthermore it will help to keep track of the fluctuating wholesale prices of the "
				+"different airtime companys. Therefore profits of close of business daily will be effectively isolated."+"\n"
				+"\n"+"DEVELOPERS:"
  
				+"\n"+"Kamau Marvins,"
				+"\n"+"Software developer | IT consultant."
				+"\n"+"Phone: +254 726 615 116"
				+"\n"+"Email: murimi65@gmail.com"
				+"\n"
				+"\n"+"Mbugua Daniel,"
				+"\n"+"Software developer | Speak Java."
				+"\n"+"Phone: +254 733 745 544"
				+"\n"+"Email: daenjelkirigo@gmail.com"
				+"\n"
				+"\n"+"	..going to bed at night saying we've done something wonderfull, that's what matters to me. -Steve Jobs"
				+"\n"
				+"\n"+"		(C) Copyright 2018 by Kamau Marvins, Mbugua Daniel Inc. All Rights Reserved.");
		JTextPane lblNewLabel = new JTextPane();
		lblNewLabel.setEditable(false);
		lblNewLabel.setText(about);;
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		//lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		//lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 833, 470);
		try{
			String one = "";
			String two = "";
			InputStream fileIs = About.class.getResourceAsStream("about.txt");
			BufferedReader rd = null;
			rd = new BufferedReader(new InputStreamReader(fileIs));
			
			while ((one = rd.readLine()) != null) {
			two = two + one +"\n";
			}
			//lblNewLabel.setText(two);;
			rd.close();
			lblNewLabel.requestFocus();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
				e.printStackTrace();
			}
		panel.add(lblNewLabel);

	}
}
