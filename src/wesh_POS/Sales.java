package wesh_POS;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class Sales extends Main_POS {
	private JTable Salestable;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Sales();
	}

	/**
	 * Create the frame.
	 */
	public Sales() {
		JInternalFrame FrameSales = new JInternalFrame("Sales");
		FrameSales.getContentPane().setBackground(Color.CYAN);
		FrameSales.getContentPane().setLayout(null);
		FrameSales.setBounds(0, 0, 1055, 645);
		FrameSales.setVisible(true);
		desktopPos.add(FrameSales);


		dashboard_panel.setVisible(false);
		btnSales.setBackground(Color.CYAN);
		btnDashboard.setBackground(UIManager.getColor("Button.background"));
		btnStock.setBackground(UIManager.getColor("Button.background"));
		btnAbout.setBackground(UIManager.getColor("Button.background"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(513, 11, 516, 519);
		FrameSales.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBag = new JButton("BAG");
		btnBag.setForeground(Color.BLACK);
		btnBag.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBag.setBackground(Color.MAGENTA);
		btnBag.setBounds(25, 11, 109, 50);
		panel.add(btnBag);
		
		JButton btnBallons = new JButton("BALLONS");
		btnBallons.setForeground(Color.WHITE);
		btnBallons.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBallons.setBackground(Color.BLUE);
		btnBallons.setBounds(144, 11, 109, 50);
		panel.add(btnBallons);
		
		JButton btnBangles = new JButton("BANGLES");
		btnBangles.setForeground(Color.WHITE);
		btnBangles.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBangles.setBackground(Color.RED);
		btnBangles.setBounds(263, 11, 109, 50);
		panel.add(btnBangles);
		
		JButton btnBanquet = new JButton("BANQUET");
		btnBanquet.setForeground(Color.BLACK);
		btnBanquet.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBanquet.setBackground(Color.GREEN);
		btnBanquet.setBounds(382, 11, 109, 50);
		panel.add(btnBanquet);
		
		JButton btnNecklace = new JButton("NECKLACE");
		btnNecklace.setForeground(Color.BLACK);
		btnNecklace.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnNecklace.setBackground(Color.YELLOW);
		btnNecklace.setBounds(382, 75, 109, 50);
		panel.add(btnNecklace);
		
		JButton btnBridalAccessory = new JButton("BRIDAL");
		btnBridalAccessory.setForeground(Color.BLACK);
		btnBridalAccessory.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBridalAccessory.setBackground(Color.CYAN);
		btnBridalAccessory.setBounds(263, 75, 109, 50);
		panel.add(btnBridalAccessory);
		
		JButton btnBasket = new JButton("BASKET");
		btnBasket.setForeground(Color.BLACK);
		btnBasket.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBasket.setBackground(Color.ORANGE);
		btnBasket.setBounds(144, 75, 109, 50);
		panel.add(btnBasket);
		
		JButton btnBanner = new JButton("BANNER");
		btnBanner.setForeground(Color.WHITE);
		btnBanner.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBanner.setBackground(Color.BLACK);
		btnBanner.setBounds(25, 75, 109, 50);
		panel.add(btnBanner);
		
		JButton btnFlower = new JButton("FLOWER");
		btnFlower.setForeground(Color.WHITE);
		btnFlower.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnFlower.setBackground(Color.BLACK);
		btnFlower.setBounds(25, 200, 109, 50);
		panel.add(btnFlower);
		
		JButton btnHeadGear = new JButton("HEAD GEAR");
		btnHeadGear.setForeground(Color.BLACK);
		btnHeadGear.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnHeadGear.setBackground(Color.MAGENTA);
		btnHeadGear.setBounds(25, 136, 109, 50);
		panel.add(btnHeadGear);
		
		JButton btnChocker = new JButton("CHOCKER");
		btnChocker.setForeground(Color.WHITE);
		btnChocker.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnChocker.setBackground(Color.BLUE);
		btnChocker.setBounds(144, 136, 109, 50);
		panel.add(btnChocker);
		
		JButton btnMask = new JButton("MASK");
		btnMask.setForeground(Color.BLACK);
		btnMask.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnMask.setBackground(Color.ORANGE);
		btnMask.setBounds(144, 200, 109, 50);
		panel.add(btnMask);
		
		JButton btnHanging = new JButton("HANGING");
		btnHanging.setForeground(Color.BLACK);
		btnHanging.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnHanging.setBackground(Color.CYAN);
		btnHanging.setBounds(263, 200, 109, 50);
		panel.add(btnHanging);
		
		JButton btnBronch = new JButton("BRONCH");
		btnBronch.setForeground(Color.WHITE);
		btnBronch.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnBronch.setBackground(Color.RED);
		btnBronch.setBounds(263, 136, 109, 50);
		panel.add(btnBronch);
		
		JButton btnEarring = new JButton("EARRING");
		btnEarring.setForeground(Color.BLACK);
		btnEarring.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnEarring.setBackground(Color.GREEN);
		btnEarring.setBounds(382, 136, 109, 50);
		panel.add(btnEarring);
		
		JButton btnMirrors = new JButton("MIRRORS");
		btnMirrors.setForeground(Color.BLACK);
		btnMirrors.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnMirrors.setBackground(Color.YELLOW);
		btnMirrors.setBounds(382, 200, 109, 50);
		panel.add(btnMirrors);
		
		JButton btnRing = new JButton("RING");
		btnRing.setForeground(Color.WHITE);
		btnRing.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnRing.setBackground(Color.BLACK);
		btnRing.setBounds(25, 325, 109, 50);
		panel.add(btnRing);
		
		JButton btnNail = new JButton("NAIL");
		btnNail.setForeground(Color.BLACK);
		btnNail.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNail.setBackground(Color.MAGENTA);
		btnNail.setBounds(25, 261, 109, 50);
		panel.add(btnNail);
		
		JButton btnProps = new JButton("PROPS");
		btnProps.setForeground(Color.WHITE);
		btnProps.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnProps.setBackground(Color.BLUE);
		btnProps.setBounds(144, 261, 109, 50);
		panel.add(btnProps);
		
		JButton btnSach = new JButton("SACH");
		btnSach.setForeground(Color.BLACK);
		btnSach.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSach.setBackground(Color.ORANGE);
		btnSach.setBounds(144, 325, 109, 50);
		panel.add(btnSach);
		
		JButton btnSand = new JButton("SAND");
		btnSand.setForeground(Color.BLACK);
		btnSand.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSand.setBackground(Color.CYAN);
		btnSand.setBounds(263, 325, 109, 50);
		panel.add(btnSand);
		
		JButton btnPin = new JButton("PIN");
		btnPin.setForeground(Color.WHITE);
		btnPin.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnPin.setBackground(Color.RED);
		btnPin.setBounds(263, 261, 109, 50);
		panel.add(btnPin);
		
		JButton btnPonsh = new JButton("PONSH");
		btnPonsh.setForeground(Color.BLACK);
		btnPonsh.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnPonsh.setBackground(Color.GREEN);
		btnPonsh.setBounds(382, 261, 109, 50);
		panel.add(btnPonsh);
		
		JButton btnScarf = new JButton("SCARF");
		btnScarf.setForeground(Color.BLACK);
		btnScarf.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnScarf.setBackground(Color.YELLOW);
		btnScarf.setBounds(382, 325, 109, 50);
		panel.add(btnScarf);
		
		JButton btnSpinner = new JButton("SPINNER");
		btnSpinner.setForeground(Color.WHITE);
		btnSpinner.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSpinner.setBackground(Color.BLACK);
		btnSpinner.setBounds(25, 450, 109, 50);
		panel.add(btnSpinner);
		
		JButton btnSharpener = new JButton("SHARPENER");
		btnSharpener.setForeground(Color.BLACK);
		btnSharpener.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnSharpener.setBackground(Color.MAGENTA);
		btnSharpener.setBounds(25, 386, 109, 50);
		panel.add(btnSharpener);
		
		JButton btnWipes = new JButton("WIPES");
		btnWipes.setForeground(Color.WHITE);
		btnWipes.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnWipes.setBackground(Color.BLUE);
		btnWipes.setBounds(144, 386, 109, 50);
		panel.add(btnWipes);
		
		JButton btnLipstick = new JButton("LIPSTICK");
		btnLipstick.setForeground(Color.BLACK);
		btnLipstick.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnLipstick.setBackground(Color.ORANGE);
		btnLipstick.setBounds(144, 450, 109, 50);
		panel.add(btnLipstick);
		
		JButton btnUmbrella = new JButton("UMBRELLA");
		btnUmbrella.setForeground(Color.BLACK);
		btnUmbrella.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnUmbrella.setBackground(Color.CYAN);
		btnUmbrella.setBounds(263, 450, 109, 50);
		panel.add(btnUmbrella);
		
		JButton btnDearBody = new JButton("DEAR BODY");
		btnDearBody.setForeground(Color.WHITE);
		btnDearBody.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnDearBody.setBackground(Color.RED);
		btnDearBody.setBounds(263, 386, 109, 50);
		panel.add(btnDearBody);
		
		JButton btnMassage = new JButton("MASSAGE");
		btnMassage.setForeground(Color.BLACK);
		btnMassage.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnMassage.setBackground(Color.GREEN);
		btnMassage.setBounds(382, 386, 109, 50);
		panel.add(btnMassage);
		
		JButton btnSandGlass = new JButton("SAND GLASS");
		btnSandGlass.setForeground(Color.BLACK);
		btnSandGlass.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnSandGlass.setBackground(Color.YELLOW);
		btnSandGlass.setBounds(382, 450, 109, 50);
		panel.add(btnSandGlass);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		scrollPane.setBounds(10, 27, 493, 412);
		FrameSales.getContentPane().add(scrollPane);
		
		Salestable = new JTable();
		Salestable.setBackground(Color.BLUE);
		Salestable.setRowHeight(30);
		Salestable.setBounds(123, 174, 249, 124);
		scrollPane.setViewportView(Salestable);

		DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Item Name");
        model.addColumn("Qty");
        model.addColumn("Each");
        model.addColumn("Total");
        model.addRow(new Object[]{"Pearl"});
		model.addRow(new Object[]{"Puff Ball"});
		model.addRow(new Object[]{"Carrier shoe"});
		model.setValueAt("2",0, 1);
		model.setValueAt("400",0, 2);
		model.setValueAt("800",0, 3);
		model.setValueAt("5",1, 1);
		model.setValueAt("600",1, 2);
		model.setValueAt("3,000",1, 3);
		model.setValueAt("4",2, 1);
		model.setValueAt("500",2, 2);
		model.setValueAt("2,000",2, 3);
		
		Salestable.setModel(model);
		Salestable.setShowVerticalLines(true);
		Salestable.setCellSelectionEnabled(true);
		Salestable.setColumnSelectionAllowed(true);
		Salestable.setBackground(Color.WHITE);
		Salestable.setForeground(Color.BLACK);
		Salestable.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));

		JTableHeader header = Salestable.getTableHeader();
		header.setForeground(Color.BLUE);
		header.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		TableColumn column = Salestable.getColumnModel().getColumn(0);
        column.setPreferredWidth(110);	
        
		JButton btnCash = new JButton("CASH");
		btnCash.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCash.setIcon(new ImageIcon(Sales.class.getResource("/images/outline_monetization_on_black_18dp.png")));
		btnCash.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnCash.setForeground(Color.WHITE);
		btnCash.setBackground(Color.BLUE);
		btnCash.setBounds(20, 529, 90, 43);
		FrameSales.getContentPane().add(btnCash);
		
		JButton btnMpesa = new JButton("M-PESA");
		btnMpesa.setHorizontalTextPosition(SwingConstants.LEADING);
		btnMpesa.setIcon(new ImageIcon(Sales.class.getResource("/images/baseline_mobile_screen_share_black_18dp.png")));
		btnMpesa.setForeground(Color.WHITE);
		btnMpesa.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnMpesa.setBackground(Color.BLUE);
		btnMpesa.setBounds(120, 529, 102, 43);
		FrameSales.getContentPane().add(btnMpesa);
		
		JButton btnCreditCard = new JButton("CREDIT CARD");
		btnCreditCard.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCreditCard.setIcon(new ImageIcon(Sales.class.getResource("/images/baseline_local_atm_black_18dp.png")));
		btnCreditCard.setForeground(Color.WHITE);
		btnCreditCard.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnCreditCard.setBackground(Color.BLUE);
		btnCreditCard.setBounds(244, 529, 145, 43);
		FrameSales.getContentPane().add(btnCreditCard);
		
		JLabel lblTotal = new JLabel("5,800");
		lblTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setBackground(Color.WHITE);
		lblTotal.setBounds(213, 460, 145, 43);
		FrameSales.getContentPane().add(lblTotal);
		
		JLabel lblKsh = new JLabel("Ksh:");
		lblKsh.setHorizontalTextPosition(SwingConstants.LEADING);
		lblKsh.setForeground(Color.BLACK);
		lblKsh.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblKsh.setBackground(Color.WHITE);
		lblKsh.setBounds(156, 460, 47, 43);
		FrameSales.getContentPane().add(lblKsh);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCancel.setIcon(new ImageIcon(Sales.class.getResource("/images/ic_remove_shopping_cart_black_18dp_1x.png")));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(399, 529, 96, 43);
		FrameSales.getContentPane().add(btnCancel);
		       

	}
}
