package wesh_POS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class Stocks extends Main_POS {
	private JTextField textQty;
	JScrollPane scrollPane;
	JTable Stockstable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Stocks();
	}

	/**
	 * Create the frame.
	 */
	public Stocks() {
		JInternalFrame FrameStocks = new JInternalFrame("Stocks");
		FrameStocks.getContentPane().setBackground(Color.CYAN);
		FrameStocks.getContentPane().setLayout(null);
		FrameStocks.setBounds(0, 0, 1055, 645);
		FrameStocks.setVisible(true);
		desktopPos.add(FrameStocks);

		dashboard_panel.setVisible(false);
		btnDashboard.setBackground(UIManager.getColor("Button.background"));
		btnSales.setBackground(UIManager.getColor("Button.background"));
		btnStock.setBackground(Color.CYAN);
		btnAbout.setBackground(UIManager.getColor("Button.background"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 1019, 593);
		FrameStocks.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblShortCode = new JLabel("Short Code:");
		lblShortCode.setHorizontalTextPosition(SwingConstants.CENTER);
		lblShortCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblShortCode.setForeground(Color.BLACK);
		lblShortCode.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblShortCode.setBackground(Color.WHITE);
		lblShortCode.setBounds(80, 127, 145, 30);
		panel.add(lblShortCode);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
		lblItemName.setForeground(Color.BLACK);
		lblItemName.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblItemName.setBackground(Color.WHITE);
		lblItemName.setBounds(80, 207, 145, 30);
		panel.add(lblItemName);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setHorizontalTextPosition(SwingConstants.CENTER);
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setForeground(Color.BLACK);
		lblQuantity.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblQuantity.setBackground(Color.WHITE);
		lblQuantity.setBounds(80, 281, 145, 30);
		panel.add(lblQuantity);
		
		String [] code = {"--Select Item--","Bags","Bangles","Banner","Chocker","Rings","Bridal"};
		JComboBox<Object> cmbShortCode = new JComboBox<Object>(code);
		cmbShortCode.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		cmbShortCode.setBounds(253, 127, 212, 30);
		panel.add(cmbShortCode);
		
		String [] item = {"--Select Item--","Bags","Bangles","Banner","Chocker","Rings","Bridal"};
		JComboBox<Object> cmbItemName = new JComboBox<Object>(item);
		cmbItemName.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		cmbItemName.setBounds(253, 207, 212, 30);
		panel.add(cmbItemName);
		
		textQty = new JTextField();
		textQty.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		textQty.setBounds(253, 281, 212, 30);
		textQty.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER){
					try{
						Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
					}catch(Exception e){
						e.printStackTrace();
					}
					textQty.requestFocus();
				}
				
			}

			
		});
		panel.add(textQty);
		textQty.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setHorizontalTextPosition(SwingConstants.LEADING);
		btnAdd.setIcon(new ImageIcon(Stocks.class.getResource("/images/ic_add_shopping_cart_black_18dp_1x.png")));
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnAdd.setBackground(Color.GREEN);
		btnAdd.setBounds(60, 371, 87, 43);
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setHorizontalTextPosition(SwingConstants.LEADING);
		btnEdit.setIcon(new ImageIcon(Stocks.class.getResource("/images/ic_edit_black_24dp_1x.png")));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnEdit.setBackground(Color.ORANGE);
		btnEdit.setBounds(157, 371, 102, 43);
		panel.add(btnEdit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCancel.setIcon(new ImageIcon(Stocks.class.getResource("/images/ic_remove_shopping_cart_black_18dp_1x.png")));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnCancel.setBackground(Color.BLUE);
		btnCancel.setBounds(269, 371, 114, 43);
		panel.add(btnCancel);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setHorizontalTextPosition(SwingConstants.LEADING);
		btnDelete.setIcon(new ImageIcon(Stocks.class.getResource("/images/ic_delete_forever_black_24dp_1x.png")));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(393, 371, 115, 43);
		panel.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.GRAY);
		scrollPane.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		scrollPane.setBounds(518, 37, 493, 473);
		panel.add(scrollPane);
				
		Stockstable = new JTable();
		Stockstable.setBackground(Color.BLUE);
		Stockstable.setRowHeight(30);
		Stockstable.setBounds(123, 174, 249, 124);
		scrollPane.setViewportView(Stockstable);

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
		
		Stockstable.setModel(model);
		Stockstable.setShowVerticalLines(true);
		Stockstable.setCellSelectionEnabled(true);
		Stockstable.setColumnSelectionAllowed(true);
		Stockstable.setBackground(Color.WHITE);
		Stockstable.setForeground(Color.BLACK);
		Stockstable.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));

		JTableHeader header = Stockstable.getTableHeader();
		header.setForeground(Color.BLUE);
		header.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		TableColumn column = Stockstable.getColumnModel().getColumn(0);
        column.setPreferredWidth(110);	

	}
}
