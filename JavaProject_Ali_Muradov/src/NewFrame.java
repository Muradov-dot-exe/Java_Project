import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class NewFrame extends JFrame{
	
	JPanel clientP=new JPanel();
	JPanel jivotniP=new JPanel();
	JPanel prodajbaP=new JPanel();
	JPanel spravkaP=new JPanel();
	
	
	JTabbedPane tab=new JTabbedPane();
	Connection conn=null;
	PreparedStatement state=null;
	ResultSet result=null;
	int id=-1;
	int idpr= -1;
	int idmash=-1;
	
	
		
		JTextField prNameTF=new JTextField();
              
		
		JPanel prPanel=new JPanel();
	
		JPanel prPanel1=new JPanel();
		JPanel prPanel2=new JPanel();
		JPanel prPanel3=new JPanel();
		
		JPanel jivPanell=new JPanel();
		
		JPanel jivPanel2=new JPanel();
		JPanel jivPanel3=new JPanel();
		JPanel jivPanel4=new JPanel();

        JPanel prodPanell=new JPanel();
		
		JPanel prodPanel2=new JPanel();
		JPanel prodPanel3=new JPanel();
		JPanel prodPanel4=new JPanel();
		
        JPanel sprPanell=new JPanel();
		
		JPanel sprPanel2=new JPanel();
		JPanel sprPanel3=new JPanel();
		JPanel sprPanel4=new JPanel();
	
		JButton PrAdd=new JButton("Добави");
		JButton PrDel=new JButton("Изтрий");
		JButton PrEdit=new JButton("Промени");
		
		JButton jivAdd=new JButton("Добави");
		JButton jivDel=new JButton("Изтрий");
		JButton jivEdit=new JButton("Промени");
		
		JButton prodAdd=new JButton("Добави");
		JButton prodDel=new JButton("Изтрий");
		JButton prodEdit=new JButton("Промени");
		
		JButton sprSearch=new JButton("Търси");
		JButton sprSearchJiv=new JButton("Търси чрез животно");
		
		JTable prTable=new JTable();
		JScrollPane prScroll=new JScrollPane(prTable);
		
		JTable jivTable=new JTable();
		JScrollPane jivScroll=new JScrollPane(jivTable);
		
		JTable prodTable=new JTable();
		JScrollPane prodScroll=new JScrollPane(prodTable);
		
		JTable sprTable=new JTable();
		JScrollPane sprScroll=new JScrollPane(sprTable);
		
	JPanel upPanelCL=new JPanel();
	JPanel midPanelCL=new JPanel();
	JPanel downPanelCL=new JPanel();
	
	JPanel upPanelJIV=new JPanel();
	JPanel midPanelJIV=new JPanel();
	JPanel downPanelJIV=new JPanel();
	
	JPanel upPanelProd=new JPanel();
	JPanel midPanelProd=new JPanel();
	JPanel downPanelProd=new JPanel();
	
	JPanel upPanelSpr=new JPanel();
	JPanel midPanelSpr=new JPanel();
	JPanel downPanelSpr=new JPanel();
	
	JLabel fnameL=new JLabel("Име:");
	JLabel phoneL=new JLabel("Телефон:");
	JLabel ageL=new JLabel("Години:");
	 
	JLabel vidJivL=new JLabel("Вид:");
	JLabel imeJivL=new JLabel("Име:");
	JLabel godiniJivL=new JLabel("Години:");
	
	JLabel spravkaL=new JLabel("Име на собственик:");
	JLabel spravkaLJ=new JLabel("Име на животно:");
	
	
	
	JLabel prodClientIDL=new JLabel("ID Клиент:");
	JLabel prodJivotnoIDL=new JLabel("ID Животно:");
	JLabel prodDenL=new JLabel("Ден на покупка:");
	JLabel prodCenaL=new JLabel("Цена на покупка:"); 
	
	JComboBox<String> prodClientIDCombo=new JComboBox<String>();
	JComboBox<String> prodJivotnoIDCombo=new JComboBox<String>();
	
	JTextField vidJivTF=new JTextField();
	JTextField imeJivTF=new JTextField();
	JTextField godiniJivTF=new JTextField();
	
	JTextField prodCenaTF=new JTextField();
	JTextField prodDenTF=new JTextField();
	
	JTextField fnameTF=new JTextField();
	JTextField ageTF=new JTextField();
	JTextField phoneTF=new JTextField();
	
	JTextField spravkaTF=new JTextField();
	JTextField spravkaTFJiv=new JTextField();
	
	
	JComboBox<String> personCombo=new JComboBox<String>();
	JComboBox<String> JivotnoCombo=new JComboBox<String>(); 
	JComboBox<String> prodCombo=new JComboBox<String>(); 
	JComboBox<String>sprCombo=new JComboBox<String>(); 
	
	//----------Butoni Client
	JButton addBt=new JButton("Добавяне");
	JButton deleteBt=new JButton("Изтриване");
	JButton editBt=new JButton("Редактиране");
	JButton searchBt=new JButton("Търсене по години");
	JButton refreshBt=new JButton("Обнови");
	//-----------Butoni jivotno
	JButton addBtjiv=new JButton("Добавяне");
	JButton deleteBtjiv=new JButton("Изтриване");
	JButton editBtjiv=new JButton("Редактиране");
	JButton searchBtjiv=new JButton("Търсене по години");
	JButton refreshBtjiv=new JButton("Обнови");
	//---------Butoni Prodajba
	JButton addBtprod=new JButton("Добавяне");
	JButton deleteBtprod=new JButton("Изтриване");
	JButton editBtprod=new JButton("Редактиране");
	JButton refreshBtprod=new JButton("Обнови");
	JButton searchBtprod=new JButton("Търсене");
	//-----------------------Butoni spravka
	
	JButton searchBtspr=new JButton("Търсене");
	JButton searchBtsprJiv=new JButton("Търсене чрез животно");
	
	JTable table=new JTable();
	JScrollPane myScroll=new JScrollPane(table);
	
	
	public NewFrame() {
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tab.add(clientP,"Клиенти");
		tab.add(jivotniP,"Животни");
		tab.add(prodajbaP,"Продажба");
		tab.add(spravkaP,"Справка");
		this.add(tab);
	
		clientP.setLayout(new GridLayout(3,1));
	         
upPanelCL.setLayout(new GridLayout(5, 2));

		//-------------- UPPANEL
		upPanelCL.add(fnameL);
		upPanelCL.add(fnameTF);
		upPanelCL.add(phoneL);
		upPanelCL.add(phoneTF);
		upPanelCL.add(ageL);
		upPanelCL.add(ageTF);
		
		clientP.add(upPanelCL);
		
		//----------------MIDPANEL
		midPanelCL.add(addBt);
		midPanelCL.add(deleteBt);
		midPanelCL.add(editBt);
		midPanelCL.add(searchBt);
		midPanelCL.add(refreshBt);
		
		clientP.add(midPanelCL);
		//----- DOWNPANEL
		myScroll.setPreferredSize(new Dimension(350, 150));
		downPanelCL.add(myScroll);
	      
	      clientP.add(downPanelCL);
	
		addBt.addActionListener(new AddActionCL());
		deleteBt.addActionListener(new DeleteActionCL());
		searchBt.addActionListener(new SearchActionCL());
		refreshBt.addActionListener(new RefreshActionCL());
		editBt.addActionListener(new EditCL());
		table.addMouseListener(new MouseAction());
				
		
		refreshTableCL();
		refreshComboPersonCL();
		//------------------------------- JIVOTNI panel
		
		 jivotniP.setLayout(new GridLayout(3,1));
		
         
			upPanelJIV.setLayout(new GridLayout(5, 2));
			//-------------- UPPANEL
			upPanelJIV.add(vidJivL);
			upPanelJIV.add(vidJivTF);
			upPanelJIV.add(imeJivL);
			upPanelJIV.add(imeJivTF);
			upPanelJIV.add(godiniJivL);
			upPanelJIV.add(godiniJivTF);
			
			jivotniP.add(upPanelJIV);
			
			//----------------MIDPANEL
			midPanelJIV.add(addBtjiv);
			midPanelJIV.add(deleteBtjiv);
			midPanelJIV.add(editBtjiv);
			midPanelJIV.add(searchBtjiv);
			midPanelJIV.add(refreshBtjiv);
			
			jivotniP.add(midPanelJIV);
			//----- DOWNPANEL
			jivScroll.setPreferredSize(new Dimension(350, 150));
			downPanelJIV.add(jivScroll);
		      jivotniP.add(downPanelJIV);
		      
		      
		      addBtjiv.addActionListener(new AddActionJiv());
				deleteBtjiv.addActionListener(new DeleteActionJiv());
				searchBtjiv.addActionListener(new SearchActionJiv());
				refreshBtjiv.addActionListener(new RefreshActionJiv());
				editBtjiv.addActionListener(new EditJiv());
				
				jivTable.addMouseListener(new MouseActionJiv());
				
				//-----------------------------ProdajbaPanel
				 prodajbaP.setLayout(new GridLayout(3,1));
					
		         
					upPanelProd.setLayout(new GridLayout(5, 3));
					//-------------- UPPANEL
					upPanelProd.add(prodClientIDL);
					upPanelProd.add(prodClientIDCombo);
					upPanelProd.add(prodJivotnoIDL);
					upPanelProd.add(prodJivotnoIDCombo);
					upPanelProd.add(prodDenL);
					upPanelProd.add(prodDenTF);
					upPanelProd.add(prodDenL);
					upPanelProd.add(prodDenTF);
					upPanelProd.add(prodCenaL);
					upPanelProd.add(prodCenaTF);
					
					
					prodajbaP.add(upPanelProd);
					
					//----------------MIDPANEL
					midPanelProd.add(addBtprod);
					midPanelProd.add(deleteBtprod);
					midPanelProd.add(editBtprod);
					midPanelProd.add(refreshBtprod);
					
					
					prodajbaP.add(midPanelProd);
					//----- DOWNPANEL
					prodScroll.setPreferredSize(new Dimension(350, 150));
					downPanelProd.add(prodScroll);
				      prodajbaP.add(downPanelProd);
				      
				      
				      addBtprod.addActionListener(new AddActionProd());
						deleteBtprod.addActionListener(new DeleteActionProd());
						//searchBtprod.addActionListener(new SearchActionProd());
						refreshBtprod.addActionListener(new RefreshActionProd());
						editBtprod.addActionListener(new EditProd());
						
						prodTable.addMouseListener(new MouseActionProd());
						refreshComboClient();
						refreshComboJivotno();
						refreshTableProd();
						
						//--------------------------SPRAVKA
								
						spravkaP.setLayout(new GridLayout(3,1));
				         
						upPanelSpr.setLayout(new GridLayout(5, 2));
						
						
						upPanelSpr.add(spravkaL);
						upPanelSpr.add(spravkaTF);
						upPanelSpr.add(spravkaLJ);
						upPanelSpr.add(spravkaTFJiv);
						spravkaP.add(upPanelSpr);
						//------Midpanel
						midPanelSpr.add(searchBtspr);
						midPanelSpr.add(searchBtsprJiv);
						spravkaP.add(midPanelSpr);
						//------Downpanel
						sprScroll.setPreferredSize(new Dimension(350,150));
						downPanelSpr.add(sprScroll);
						spravkaP.add(downPanelSpr);
						
						//searchBtspr.addActionListener(new RefreshActionSrt());
						sprTable.addMouseListener(new MouseActionProd());
						
						
				
				
			this.setVisible(true);
	}
	public void refreshTableCL() {
		conn=DBConnection.getConnection();
		
		try {
			state=conn.prepareStatement("select * from client");
			result=state.executeQuery();
			table.setModel(new MyModel(result));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	class DeleteActionProd implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="delete from prodajba where id=?";
			
			try {
				state=conn.prepareStatement(sql);
				state.setInt(1, id);
				state.execute();
				refreshTableProd();
				refreshComboPersonProd();
				clearFormProd();
				id=-1;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

		}

	class MouseActionProd implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			int row=prodTable.getSelectedRow();
			id=Integer.parseInt(prodTable.getValueAt(row, 0).toString());
			prodDenTF.setText(prodTable.getValueAt(row, 1).toString());
			prodCenaTF.setText(prodTable.getValueAt(row, 2).toString());
			
		
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	/*class SearchActionSpr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="select from ime, jivotnoid from Jivotno R join Person P on R.clientid=P.id";
			
			try {
				state=conn.prepareStatement(sql);
				state.setString(1, fnameTF.getText());
				state.setString(2, lnameTF.getText());
				state.setString(3, sexCombo.getSelectedItem().toString());
				state.setInt(4, Integer.parseInt(ageTF.getText()));
				state.setFloat(5, Float.parseFloat(salaryTF.getText()));
				
				state.execute();
				refreshTable();
				refreshComboPerson();
				clearForm();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}*/
		
public void refreshComboPersonCL() {
		
		String sql="select id, ime, godini , telefon from client";
		conn=DBConnection.getConnection();
		String item="";
		
		try {
			state=conn.prepareStatement(sql);
			result=state.executeQuery();
			personCombo.removeAllItems();
			while(result.next()) {
				item=result.getObject(1).toString()+"."+
						result.getObject(2).toString()+" "+
						result.getObject(3).toString();
				personCombo.addItem(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public void clearForm() {
	fnameTF.setText("");
	ageTF.setText("");
	phoneTF.setText("");
}
//-----REFRESH PRODAJBA
public void refreshComboClient() {
	
	String sql="select id, ime from client";
	conn=DBConnection.getConnection();
	String item="";
	
	try {
		state=conn.prepareStatement(sql);
		result=state.executeQuery();
		prodClientIDCombo.removeAllItems();
		while(result.next()) {
			item=result.getObject(1).toString()+"."+
					result.getObject(2).toString()+" ";
					 
			prodClientIDCombo.addItem(item);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
//------REFRESH JIVOTNO
public void refreshComboJivotno() {
	
	String sql="select id, ime from jivotno";
	conn=DBConnection.getConnection();
	String item="";
	
	try {
		state=conn.prepareStatement(sql);
		result=state.executeQuery();
		prodJivotnoIDCombo.removeAllItems();
		while(result.next()) {
			item=result.getObject(1).toString()+"."+
					result.getObject(2).toString()+" ";
					 
			prodJivotnoIDCombo.addItem(item);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

class AddActionCL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		conn=DBConnection.getConnection();
		String sql="insert into client(ime,telefon,godini) values(?,?,?)";
		
		try {
			state=conn.prepareStatement(sql);
			state.setString(1, fnameTF.getText());
			state.setInt(2, Integer.parseInt(phoneTF.getText()));
			state.setInt(3, Integer.parseInt(ageTF.getText()));
			
			state.execute();
			refreshTableCL();
			refreshComboPersonCL();
			clearForm();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}

class MouseAction implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		int row=table.getSelectedRow();
		id=Integer.parseInt(table.getValueAt(row, 0).toString());
		fnameTF.setText(table.getValueAt(row, 1).toString());
		phoneTF.setText(table.getValueAt(row, 2).toString());
		ageTF.setText(table.getValueAt(row, 3).toString());
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class DeleteActionCL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		conn=DBConnection.getConnection();
		String sql="delete from client where id=?";
		
		try {
			state=conn.prepareStatement(sql);
			state.setInt(1, id);
			state.execute();
			refreshTableCL();
			refreshComboPersonCL();
			clearForm();
			id=-1;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}

class SearchActionCL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		conn=DBConnection.getConnection();
		String sql="select * from client where godini=?";
		
		try {
			state=conn.prepareStatement(sql);
			state.setInt(1, Integer.parseInt(ageTF.getText()));
			result=state.executeQuery();
			table.setModel(new MyModel(result));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
class EditCL implements ActionListener {
	public void actionPerformed (ActionEvent arg0) {
//		conn=DBConnection.getConnection();
		if(id>0) {
			String sql="update client set ime=?,telefon=?,godini=? where id=?";
		
			try {
				state=conn.prepareStatement(sql);
				
				state.setString(1, fnameTF.getText());
				state.setString(2, phoneTF.getText());
				state.setInt(3, Integer.parseInt(ageTF.getText()));
				state.setInt(4, id);
				state.execute();
				
				refreshTableCL();
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			fnameTF.setText("");
			phoneTF.setText("");
			ageTF.setText("");
		}
		
	}
}

class RefreshActionCL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		refreshTableCL();
		
	}
	
}
/*class SearchDB implements ActionListener {
	public void actionPerformed (ActionEvent arg0) {
//		conn=DBConnection.getConnection();
		// if проверяват и отхвърлят празно текстово поле
		if(!sprCarPriceTF.getText().isEmpty()) {
			if(Double.parseDouble(sprCarPriceTF.getText())>0) {
		
				String str="select ARTTABLE.id, name, PRTABLE.proizvoditel,ARTTABLE.idproizvoditel, MTABLE.mashtab,ARTTABLE.idmashtab, opis, kol,cena,datein,year from ARTTABLE,MTABLE,PRTABLE where ARTTABLE.idmashtab=MTABLE.id and ARTTABLE.idproizvoditel=PRTABLE.id and ARTTABLE.cena<="+Double.parseDouble(sprCarPriceTF.getText());
				try {
					state=conn.prepareStatement(str);
					result=state.executeQuery();
					sprTable.setModel(new MyTModel(result));
			
					sprTable.getColumnModel().getColumn(3).setMinWidth(0);
					sprTable.getColumnModel().getColumn(3).setMaxWidth(0);
					sprTable.getColumnModel().getColumn(3).setWidth(0);

					sprTable.getColumnModel().getColumn(5).setMinWidth(0);
					sprTable.getColumnModel().getColumn(5).setMaxWidth(0);
					sprTable.getColumnModel().getColumn(5).setWidth(0);
		
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sprCarPriceTF.setText("");
			}
		}
	}

}*/


//-----------------------LOGIKA ZA JIVOTNO
public void refreshTableJiv() {
	conn=DBConnection.getConnection();
	
	try {
		state=conn.prepareStatement("select * from jivotno");
		result=state.executeQuery();
		jivTable.setModel(new MyModel(result));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void refreshComboPersonJiv() {
	
	String sql="select id, vid, ime , godini from jivotno";
	conn=DBConnection.getConnection();
	String item="";
	
	try {
		state=conn.prepareStatement(sql);
		result=state.executeQuery();
		JivotnoCombo.removeAllItems();
		while(result.next()) {
			item=result.getObject(1).toString()+"."+
					result.getObject(2).toString()+" "+
					result.getObject(3).toString();
			JivotnoCombo.addItem(item);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void clearFormJiv() {
imeJivTF.setText("");
godiniJivTF.setText("");
vidJivTF.setText("");
}

class AddActionJiv implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	conn=DBConnection.getConnection();
	String sql="insert into jivotno(ime,vid,godini) values(?,?,?)";
	
	try {
		state=conn.prepareStatement(sql);
		state.setString(1, imeJivTF.getText());
		state.setString(2, vidJivTF.getText());
		state.setInt(3, Integer.parseInt(godiniJivTF.getText()));
		
		state.execute();
		refreshTableJiv();
		refreshComboPersonJiv();
		clearFormJiv();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}

class MouseActionJiv implements MouseListener{

@Override
public void mouseClicked(MouseEvent e) {
	int row=jivTable.getSelectedRow();
	id=Integer.parseInt(jivTable.getValueAt(row, 0).toString());
	imeJivTF.setText(jivTable.getValueAt(row, 1).toString());
	vidJivTF.setText(jivTable.getValueAt(row, 2).toString());
	godiniJivTF.setText(jivTable.getValueAt(row, 3).toString());
	
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}

class DeleteActionJiv implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	conn=DBConnection.getConnection();
	String sql="delete from jivotno where id=?";
	
	try {
		state=conn.prepareStatement(sql);
		state.setInt(1, id);
		state.execute();
		refreshTableJiv();
		refreshComboPersonJiv();
		clearFormJiv();
		id=-1;
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}

class SearchActionJiv implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	conn=DBConnection.getConnection();
	String sql="select * from jivotno where godini=?";
	
	try {
		state=conn.prepareStatement(sql);
		state.setInt(1, Integer.parseInt(godiniJivTF.getText()));
		result=state.executeQuery();
		jivTable.setModel(new MyModel(result));
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}
class RefreshActionJiv implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	refreshTableJiv();
	
}

}
class EditJiv implements ActionListener {
	public void actionPerformed (ActionEvent arg0) {
//		conn=DBConnection.getConnection();
		if(id>0) {
			String sql="update jivotno set ime=?,vid=?,godini=? where id=?";
		
			try {
				state=conn.prepareStatement(sql);
				
				state.setString(1, imeJivTF.getText());
				state.setString(2, vidJivTF.getText());
				state.setInt(3, Integer.parseInt(godiniJivTF.getText()));
				state.setInt(4, id);
				state.execute();
				
				refreshTableJiv();
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			imeJivTF.setText("");
			vidJivTF.setText("");
			godiniJivTF.setText("");
		}
		
	}
}


//--------Logika Prodajba
public void refreshTableProd() {
	conn=DBConnection.getConnection();
	
	try {
		state=conn.prepareStatement("select * from prodajba");
		result=state.executeQuery();
		prodTable.setModel(new MyModel(result));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void refreshComboPersonProd() {
	
	String sql="select id, clientid, jivotnoid , den,cena from prodajba";
	conn=DBConnection.getConnection();
	String item="";
	
	try {
		state=conn.prepareStatement(sql);
		result=state.executeQuery();
		prodCombo.removeAllItems();
		while(result.next()) {
			item=result.getObject(1).toString()+"."+
					result.getObject(2).toString()+" "+
					result.getObject(3).toString();
			prodCombo.addItem(item);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void clearFormProd() {         
prodClientIDCombo.setToolTipText("");
prodJivotnoIDCombo.setToolTipText("");
prodDenTF.setText("");
prodCenaTF.setText("");
}

class AddActionProd implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	conn=DBConnection.getConnection();
	String sql="insert into prodajba(clientid,jivotnoid,den,cena) values(?,?,?,?)";
	String itemPersonCombo=prodClientIDCombo.getSelectedItem().toString();
	String prodJivotnoCombo=prodJivotnoIDCombo.getSelectedItem().toString();
	
	try {
		state=conn.prepareStatement(sql);
		state.setInt(1, Integer.parseInt( itemPersonCombo.substring(0, itemPersonCombo.indexOf('.'))));
		state.setInt(2,Integer.parseInt(prodJivotnoCombo.substring(0, prodJivotnoCombo.indexOf('.'))));
		state.setString(3, prodDenTF.getText());
		state.setInt(4, Integer.parseInt(prodCenaTF.getText()));
		
		state.execute();
		refreshTableProd();
		refreshComboPersonProd();
		refreshComboJivotno();
		clearFormProd();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

class AddComboProd implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	conn=DBConnection.getConnection();
	String sql="select * from prodajba where clientid='";
	
	try {
		state=conn.prepareStatement(sql);
		result=state.executeQuery();
		while(result.next()) {
			String name = result.getString("clientid");
			prodClientIDCombo.addItem("clientid");
			prodJivotnoIDCombo.addItem("jivotnoid");
		}
		
		state.execute();
		refreshTableProd();
		refreshComboPersonProd();
		clearFormProd();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}



class DeleteActionProd implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	conn=DBConnection.getConnection();
	String sql="delete from prodajba where id=?";
	
	try {
		state=conn.prepareStatement(sql);
		state.setInt(1, id);
		state.execute();
		refreshTableProd();
		refreshComboPersonProd();
		clearFormProd();
		id=-1;
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}



}

class EditProd implements ActionListener {
	public void actionPerformed (ActionEvent arg0) {
//		conn=DBConnection.getConnection();
		if(id>0) {
			String sql="update prodajba set clientid=?,jivotnoid=?,den=? ,cena=? where id=?";
			String itemPersonCombo=prodClientIDCombo.getSelectedItem().toString();
			String prodJivotnoCombo=prodJivotnoIDCombo.getSelectedItem().toString();
		
			try {
				state=conn.prepareStatement(sql);
				
				state.setInt(1, Integer.parseInt( itemPersonCombo.substring(0, itemPersonCombo.indexOf('.'))));
				state.setInt(2,Integer.parseInt(prodJivotnoCombo.substring(0, prodJivotnoCombo.indexOf('.'))));
				state.setString(3, prodDenTF.toString());
				state.setInt(4, Integer.parseInt(prodCenaTF.getText()));
				state.setInt(5, id);
				state.execute();
				
				refreshTableProd();
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			prodCenaTF.setText("");
			prodDenTF.setText("");
			
		}
		
	}
}


class RefreshActionProd implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	refreshTableProd();
	
}

}}


