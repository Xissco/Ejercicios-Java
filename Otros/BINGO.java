//
//Inventario 2
//
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Random;
 
public class BINGO extends JFrame 
{   
	//Panel
	private JPanel Panel1 = new JPanel();
	private JPanel Panel2 = new JPanel();	
	private JPanel Panel3 = new JPanel();	
	//Layout
	private GridLayout Grilla1 = new GridLayout(21,5,2,2);		
	private BorderLayout Borde1 = new BorderLayout();
	private FlowLayout Flujo1 = new FlowLayout();	
	//Border
	Border bdlbl = new LineBorder(Color.BLACK);
	Border bdlbl2 = new SoftBevelBorder(BevelBorder.RAISED); 
	//Icono
	private Icon JF = new ImageIcon(getClass().getResource("JF.png"));
	//Label
	private JLabel lblJF = new JLabel(JF);	
	private JLabel lblB = new JLabel("B",SwingConstants.CENTER);
	private JLabel lblI = new JLabel("I",SwingConstants.CENTER);
	private JLabel lblN = new JLabel("N",SwingConstants.CENTER);
	private JLabel lblG = new JLabel("G",SwingConstants.CENTER);
	private JLabel lblO = new JLabel("O",SwingConstants.CENTER);	
	private JLabel lblnum = new JLabel("Numero",SwingConstants.CENTER);	
	//Button 
	private JButton btnP1 = new JButton("+1");	
	private JButton btnReset = new JButton("Reset");
	//Array
	JLabel []lbls = new JLabel [100];
	boolean []num = new boolean [100];	
	//Random
	Random rnd1 = new Random ();
	        
   public BINGO()
   {
	   super("B I N G O");  
	   // I N T E R F A C E	   	   
	   //Crear Label 
	   for (int i = 1; i < 101; i++)
	   {
		String num = String.format("%d",i);   
		lbls[i-1] =  new JLabel(num,SwingConstants.CENTER); 
	   }
	   //Layout a los Paneles
	   Panel1.setLayout(Grilla1);
	   Panel2.setLayout(Flujo1);
	   Panel3.setLayout(Borde1);	   
	   //Componentes Panel1(Grid)
	   Panel1.add(lblB);
	   Panel1.add(lblI);
	   Panel1.add(lblN);
	   Panel1.add(lblG);
	   Panel1.add(lblO);	   
	   for (JLabel lbl1 : lbls)
	   {
		   lbl1.setBorder( bdlbl );		   
		   lbl1.setOpaque(true); 
		   lbl1.setBackground(Color.LIGHT_GRAY);
		   Panel1.add(lbl1);		   
	   }
	   //Componentes Panel 2(Flow)
	   Panel2.add(btnP1);
	   Panel2.add(btnReset);
	   //Componentes Panel 3 (Border)
	   Panel3.add(Panel2, BorderLayout.NORTH);
	   lblnum.setBorder( bdlbl2 );
	   Panel3.add(lblnum, BorderLayout.SOUTH);	 	  	      
	   //Agregar los Paneles al JFrame	    
	   add (lblJF, BorderLayout.NORTH);
	   add (Panel1, BorderLayout.CENTER);
	   add (Panel3, BorderLayout.SOUTH);	  
	   //P R O G R M A C I O N (Action Listener)	   	
	   btnP1.addActionListener(
         new ActionListener()
         { 			
            public void actionPerformed(ActionEvent e)
            {   
				int co =0;            		   
			   for(boolean c1 : num)
			   {
				   if (c1 == true)
				   {
					   co = co+1;
				   }
				   if (co == 100)
				   {
					   for (int i = 0; i < 100; i++)
					   {
						   num[i]=false;
						   lbls[i].setBackground(Color.LIGHT_GRAY);						   						   
					   }
					   System.out.println("-----BINGO-----");					    
				   }				   
			   }		   
               
               int n = (rnd1.nextInt(100));  
               
               if (num[n]==true)
			   {
				   while (num[n]==true)
				   {
					 n = (rnd1.nextInt(100));					 					   
				   }				   				   
			   }
			   num[n]=true;			   				   
			   lbls[n].setBackground(Color.BLUE); 
			   String N = String.valueOf(n+1);
			   lblnum.setText(ValidarLetra(N));
			   System.out.printf("%s\n",ValidarLetra(N));   			              
            }
         }
       );
       
       btnReset.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               for (int i = 0; i < 100; i++)
               {
				   num[i]=false;
				   lbls[i].setBackground(Color.LIGHT_GRAY);
				   lblnum.setText("Bingo"); 						   
			   }
			   System.out.println("-----BINGO-----");					    
            }
         }
       );	       
   }
   public String ValidarLetra (String N)
   {	   
	   String nb;
	   	   
	   if (N.matches("\\d(1|6)")||N.matches("(1|6)"))
	   {
		nb = "B"+N;    
	   }
	   else if (N.matches("\\d(2|7)")||N.matches("(2|7)"))
	   {
		nb = "I"+N;   
	   }
	   else if (N.matches("\\d(3|8)")||N.matches("(3|8)"))
	   {
		nb = "N"+N;   
	   } 
	   else if (N.matches("\\d(4|9)")||N.matches("(4|9)"))
	   {
		nb = "G"+N;   
	   } 
	   else
	   {
		 nb = "O"+N;  
	   }
	   return nb;
   }	
}
//by: JF
