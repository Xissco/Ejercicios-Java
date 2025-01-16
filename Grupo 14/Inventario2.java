//
//Inventario 2
//
//


import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon; 
import javax.swing.Icon; 
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.Box;
 
public class Inventario2 extends JFrame 
{   
	//Panel
	private JPanel Panel1 = new JPanel();
	private JPanel Panel2 = new JPanel();  
	//Box 
	private Box Box1 = Box.createHorizontalBox();	
	//Icono
	private Icon JF = new ImageIcon(getClass().getResource("JF.png"));
	//String 
	private String Codigo = "Codigo";
	private String Descripcion="Descripcion";
	private String Precio="Precio";
	private String Existencia="Existencia";
	private String Tabla = String.format(" %-30s%-30s%-30s%-30s",Codigo,Descripcion,Precio,Existencia);  
	//Layout
	private GridLayout Grilla1 = new GridLayout(2,4,5,5);
	private BorderLayout Borde1 = new BorderLayout();     
	//Label
	private JLabel lbl1 = new JLabel("Ingrese los Datos del Inventario",SwingConstants.CENTER);
	private JLabel lblJF = new JLabel ();
	private JLabel lblwhite = new JLabel("  ");
	private JLabel lbaCodigo = new JLabel("Codigo",SwingConstants.CENTER);
	private JLabel lblDescripcion = new JLabel("Descripcion",SwingConstants.CENTER);
	private JLabel lblPrecio = new JLabel("Precio",SwingConstants.CENTER);
	private JLabel lblExistencia = new JLabel("Existencia",SwingConstants.CENTER);
	//TextField
	private JTextField txtCodigo = new JTextField(10); 
	private JTextField txtDescripcion = new JTextField(10); 
	private JTextField txtPrecio = new JTextField(10);
	private JTextField txtExistencia = new JTextField(10);
	//TextArea   
	private JTextArea areaTexto1=new JTextArea(Tabla,10,10);
          
   public Inventario2()
   {
	   super("Inventario");
	   	   
	   //JF
	   lblJF.setIcon(JF);
	   lblJF.setHorizontalAlignment(JLabel.CENTER);
	   //Layout de los Paneles
	   Panel1.setLayout(Grilla1);
	   Panel2.setLayout(Borde1);	   
	   //Componentes Grilla1
	   Panel1.add(lbaCodigo); 
	   Panel1.add(txtCodigo);
	   Panel1.add(lblDescripcion); 
	   Panel1.add(txtDescripcion); 
	   Panel1.add(lblPrecio);
	   Panel1.add(txtPrecio);
	   Panel1.add(lblExistencia);
	   Panel1.add(txtExistencia);
	   //Componentes Borde1	   
	   Panel2.add(lblJF,BorderLayout.NORTH);
	   Panel2.add(lbl1,BorderLayout.CENTER);
	   Panel2.add(lblwhite,BorderLayout.SOUTH);	 
	   //Formato Area texto
	   areaTexto1.setEditable(false);
	   Box1.add(new JScrollPane(areaTexto1));	   
	   //Agregar los Paneles al JFrame
	   add(Panel2, BorderLayout.NORTH);
	   add(Panel1, BorderLayout.CENTER);
	   add(Box1, BorderLayout.SOUTH);   
	         
   }
}
//by: JF
