package wesh_POS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class Main_POS implements InternalFrameListener{

	private JFrame frame;
	public JButton btnDashboard,btnStock,btnAbout,btnSales;
	public JDesktopPane desktopPos = new JDesktopPane();
	public JPanel dashboard_panel;
	private JButton btnBags;
	private JButton btnBallons;
	private JButton btnBangles;
	private JButton btnBanquet;
	private JButton btnBasket;
	private JButton btnBelt;
	private JButton btnBridalAccessory;
	private JButton btnBanners;
	private JButton btnNecklace;
	private JButton btnBronch;
	private JButton btnChocker;
	private JButton btnHeadGear;
	private JButton btnEarring;
	private JButton btnRing;
	private JButton btnSandGlass;
	private JButton btnProps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main_POS();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_POS() {try {
        //here you can put the selected theme class name in JTattoo
        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 1000, 500);
		frame.setTitle("WESH SPARES");
		frame.setVisible(true);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setSize(screenSize.width, screenSize.height);
		frame.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1340, 718);
		panel.setBackground(SystemColor.textHighlight);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel button_panel = new JPanel();
		button_panel.setBackground(Color.BLACK);
		button_panel.setBounds(30, 119, 217, 404);
		panel.add(button_panel);
		button_panel.setLayout(null);
		
		btnDashboard = new JButton("DASHBOARD");
		btnDashboard.setIcon(new ImageIcon(Main_POS.class.getResource("/images/ic_storage_black_18dp_1x.png")));
		btnDashboard.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnDashboard.setForeground(Color.BLACK);
		btnDashboard.setBackground(Color.CYAN);
		btnDashboard.setBounds(10, 31, 186, 58);
		btnDashboard.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnDashboard.setBackground(Color.CYAN);
				btnSales.setBackground(UIManager.getColor("Button.background"));
				btnStock.setBackground(UIManager.getColor("Button.background"));
				btnAbout.setBackground(UIManager.getColor("Button.background"));
				dashboard_panel.setVisible(true);
			}
			
		});
		button_panel.add(btnDashboard);
		
		btnSales = new JButton("SALES");
		btnSales.setIcon(new ImageIcon(Main_POS.class.getResource("/images/ic_shopping_cart_black_24dp_1x.png")));
		btnSales.setForeground(Color.BLACK);
		btnSales.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSales.setBounds(10, 127, 186, 58);
		btnSales.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Sales();
				frame.setVisible(false);
			}
			
		});
		button_panel.add(btnSales);
		
		btnStock = new JButton("STOCK");
		btnStock.setIcon(new ImageIcon(Main_POS.class.getResource("/images/ic_shopping_basket_black_24dp_1x.png")));
		btnStock.setForeground(Color.BLACK);
		btnStock.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnStock.setBounds(10, 222, 186, 58);
		btnStock.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Stocks();
				frame.setVisible(false);
			}
			
		});
		button_panel.add(btnStock);
		
		btnAbout = new JButton("ABOUT");
		btnAbout.setIcon(new ImageIcon(Main_POS.class.getResource("/images/ic_info_black_18dp_1x.png")));
		btnAbout.setForeground(Color.BLACK);
		btnAbout.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnAbout.setBounds(10, 316, 186, 58);
		btnAbout.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new About();
				frame.setVisible(false);
			}
			
		});
		button_panel.add(btnAbout);
		
		desktopPos = new JDesktopPane();
		desktopPos.setBounds(257, 48, 1054, 645);
		panel.add(desktopPos);
		
		dashboard_panel = new JPanel();
		dashboard_panel.setBackground(Color.CYAN);
		dashboard_panel.setBounds(0, 0, 1055, 645);
		desktopPos.add(dashboard_panel);
		dashboard_panel.setLayout(null);
		
		btnBags = new JButton("BAGS");
		btnBags.setBackground(Color.RED);
		btnBags.setForeground(Color.WHITE);
		btnBags.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBags.setBounds(31, 35, 208, 109);
		btnBags.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		});
		dashboard_panel.add(btnBags);
		
		btnBallons = new JButton("BALLONS");
		btnBallons.setBackground(Color.GREEN);
		btnBallons.setForeground(Color.BLACK);
		btnBallons.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBallons.setBounds(31, 190, 208, 109);
		dashboard_panel.add(btnBallons);
		
		btnBangles = new JButton("BANGLES");
		btnBangles.setBackground(Color.ORANGE);
		btnBangles.setForeground(Color.BLACK);
		btnBangles.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBangles.setBounds(31, 345, 208, 109);
		dashboard_panel.add(btnBangles);
		
		btnBanquet = new JButton("BANQUET");
		btnBanquet.setBackground(Color.LIGHT_GRAY);
		btnBanquet.setForeground(Color.BLACK);
		btnBanquet.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBanquet.setBounds(31, 493, 208, 109);
		dashboard_panel.add(btnBanquet);
		
		btnBasket = new JButton("BASKET");
		btnBasket.setBackground(Color.BLACK);
		btnBasket.setForeground(Color.WHITE);
		btnBasket.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBasket.setBounds(284, 190, 208, 109);
		dashboard_panel.add(btnBasket);
		
		btnBelt = new JButton("BELT");
		btnBelt.setBackground(Color.PINK);
		btnBelt.setForeground(Color.BLACK);
		btnBelt.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBelt.setBounds(284, 345, 208, 109);
		dashboard_panel.add(btnBelt);
		
		btnBridalAccessory = new JButton("BRIDAL ACCESSORY");
		btnBridalAccessory.setBackground(Color.MAGENTA);
		btnBridalAccessory.setForeground(Color.BLACK);
		btnBridalAccessory.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBridalAccessory.setBounds(284, 493, 208, 109);
		dashboard_panel.add(btnBridalAccessory);
		
		btnBanners = new JButton("BANNERS");
		btnBanners.setBackground(Color.YELLOW);
		btnBanners.setForeground(Color.BLACK);
		btnBanners.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBanners.setBounds(284, 35, 208, 109);
		dashboard_panel.add(btnBanners);
		
		btnNecklace = new JButton("NECKLACE");
		btnNecklace.setBackground(Color.GRAY);
		btnNecklace.setForeground(Color.WHITE);
		btnNecklace.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNecklace.setBounds(543, 35, 208, 109);
		dashboard_panel.add(btnNecklace);
		
		btnBronch = new JButton("BRONCH");
		btnBronch.setBackground(Color.MAGENTA);
		btnBronch.setForeground(Color.BLACK);
		btnBronch.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBronch.setBounds(543, 190, 208, 109);
		dashboard_panel.add(btnBronch);
		
		btnChocker = new JButton("CHOCKER");
		btnChocker.setBackground(Color.GREEN);
		btnChocker.setForeground(Color.BLACK);
		btnChocker.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnChocker.setBounds(543, 345, 208, 109);
		dashboard_panel.add(btnChocker);
		
		btnHeadGear = new JButton("HEAD GEAR");
		btnHeadGear.setBackground(Color.ORANGE);
		btnHeadGear.setForeground(Color.BLACK);
		btnHeadGear.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnHeadGear.setBounds(543, 493, 208, 109);
		dashboard_panel.add(btnHeadGear);
		
		btnEarring = new JButton("EARRING");
		btnEarring.setBackground(Color.YELLOW);
		btnEarring.setForeground(Color.BLACK);
		btnEarring.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnEarring.setBounds(805, 35, 208, 109);
		dashboard_panel.add(btnEarring);
		
		btnRing = new JButton("RING");
		btnRing.setBackground(Color.PINK);
		btnRing.setForeground(Color.BLACK);
		btnRing.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnRing.setBounds(805, 190, 208, 109);
		dashboard_panel.add(btnRing);
		
		btnSandGlass = new JButton("SAND GLASS");
		btnSandGlass.setBackground(Color.RED);
		btnSandGlass.setForeground(Color.WHITE);
		btnSandGlass.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSandGlass.setBounds(805, 345, 208, 109);
		dashboard_panel.add(btnSandGlass);
		
		btnProps = new JButton("PROPS");
		btnProps.setBackground(Color.BLUE);
		btnProps.setForeground(Color.WHITE);
		btnProps.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnProps.setBounds(805, 493, 208, 109);
		dashboard_panel.add(btnProps);
	}

	@Override
	public void internalFrameActivated(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameClosed(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameClosing(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameDeactivated(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameDeiconified(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameIconified(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameOpened(InternalFrameEvent e) {
	}
}
