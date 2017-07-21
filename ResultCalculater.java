import java.awt.*;
import java.awt.event.*;

public class ResultCalculater implements ActionListener
{
	   Frame f=new Frame("Result Calculater");
	   Button result=new Button("Result");
		
		Label sn=new Label("Student Name:");
		Label rollno=new Label("Roll No:");
		Label outof=new Label("Out of:");
		Label mrk=new Label("----------Marks---------");
		Label m1=new Label("Hindi:");
		Label m2=new Label("English Lit:");
		Label m3=new Label("Maths:");
		Label m4=new Label("Science:");
		Label m5=new Label("Computer:");
		Label m6=new Label("SST:");
		Label m7=new Label("G.K:");
		Label m8=new Label("English Lang:");
		Label m9=new Label("Art:");
		Label m10=new Label("Panjabi:");
		Label m11=new Label("Sanskrit:");
		Label clc=new Label("---------Result--------");
		Label tm=new Label("Total Marks:");
		Label per=new Label("Percentage:");
		Label grade=new Label("Grade:");
		
		TextField tsn=new TextField();
		TextField trollno=new TextField();
		TextField toutof=new TextField("Ex: 100, 40");
		TextField tm1=new TextField();
		TextField tm2=new TextField();
		TextField tm3=new TextField();
		TextField tm4=new TextField();
		TextField tm5=new TextField();
		TextField tm6=new TextField();
		TextField tm7=new TextField();
		TextField tm8=new TextField();
		TextField tm9=new TextField();
		TextField tm10=new TextField();
		TextField tm11=new TextField();
		TextField ttm=new TextField();
		TextField tper=new TextField();
		TextField tgrade=new TextField();	
		
	ResultCalculater()
	{	 
      sn.setBounds(100,50,100,30);      
      tsn.setBounds(220,50,340,30); 
                    
		rollno.setBounds(100,90,100,30);  
		trollno.setBounds(220,90,100,30);
		
		outof.setBounds(100,130,100,30);  
		toutof.setBounds(220,130,100,30);
		
		mrk.setBounds(100,180,150,30);
		     
		m1.setBounds(100,220,100,30);     
		tm1.setBounds(220,220,100,30);
		
		m2.setBounds(100,260,100,30);     
		tm2.setBounds(220,260,100,30);
		
		m3.setBounds(100,300,100,30);     
		tm3.setBounds(220,300,100,30);
		
		m4.setBounds(100,340,100,30);     
		tm4.setBounds(220,340,100,30);

		m5.setBounds(100,380,100,30);     
		tm5.setBounds(220,380,100,30);
		
		m6.setBounds(340,220,100,30);     
		tm6.setBounds(460,220,100,30);
		
		m7.setBounds(340,260,100,30);     
		tm7.setBounds(460,260,100,30);
		
		m8.setBounds(340,300,100,30);     
		tm8.setBounds(460,300,100,30);
		
		m9.setBounds(340,340,100,30);     
		tm9.setBounds(460,340,100,30);
		
		m10.setBounds(340,380,100,30);     
		tm10.setBounds(460,380,100,30);
		
		m11.setBounds(100,420,100,30);     
		tm11.setBounds(220,420,100,30);
		
		result.setBounds(220,470,100,30);
		
		clc.setBounds(100,520,150,30);
		
		tm.setBounds(100,560,100,30);     
		ttm.setBounds(220,560,100,30);

		per.setBounds(100,600,100,30);    
		tper.setBounds(220,600,100,30);

		grade.setBounds(100,640,100,30);  
		tgrade.setBounds(220,640,100,30);
		
		f.add(sn);                        
		f.add(rollno); 
		f.add(outof);                   
		f.add(mrk);                      
		f.add(m1);                        
		f.add(m6);
		f.add(m2);                        
		f.add(m7);
		f.add(m3);                        
		f.add(m8);
		f.add(m4);                        
		f.add(m9);
		f.add(m5);
		f.add(m10);
		f.add(m11);
		f.add(clc);                      
		f.add(tm);                        
		f.add(grade);
		f.add(per); 
		                     
		f.add(tsn);
		f.add(trollno);
		f.add(toutof);
		f.add(tm1);
	   f.add(tm6);
		f.add(tm2);
		f.add(tm7);
		f.add(tm3);
		f.add(tm8);
		f.add(tm4);
		f.add(tm9);
		f.add(tm5);
		f.add(tm10);
		f.add(tm11);
		f.add(result);	
		f.add(ttm);
		f.add(tper); 
		f.add(tgrade);
		
		f.setSize(670,700);
		f.setLayout(null); 
		f.setVisible(true);	
		
		result.addActionListener(this);		
		                
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		int getm1=Integer.parseInt(tm1.getText());
		int getm6=Integer.parseInt(tm6.getText());
		int getm2=Integer.parseInt(tm2.getText());
		int getm7=Integer.parseInt(tm7.getText());
		int getm3=Integer.parseInt(tm3.getText());
		int getm8=Integer.parseInt(tm8.getText());
		int getm4=Integer.parseInt(tm4.getText());
		int getm9=Integer.parseInt(tm9.getText());
		int getm5=Integer.parseInt(tm5.getText());
		int getm10=Integer.parseInt(tm10.getText());
		int getm11=Integer.parseInt(tm11.getText());
		int gtoutof=Integer.parseInt(toutof.getText());
		
		
		int total=getm1+getm2+getm3+getm4+getm5+getm6+getm7+getm8+getm9+getm10+getm11;
		double perc=(total*100)/(gtoutof*11);
		 
		
		     if(getm1<=gtoutof && getm2<=gtoutof && getm3<=gtoutof && 
		        getm4<=gtoutof && getm5<=gtoutof)
		     {
		     	   ttm.setText(String.valueOf(total));
		         tper.setText(String.valueOf(perc)+"%");
		     
		     	   if(perc>=90)
		     	   {
		     	   	tgrade.setText("A1");
		     	   }
		     	   else if(perc>=80 && perc<90)
		     	   {
		     	   	tgrade.setText("A2");
		     	   }
		     	   else if(perc>=70 && perc<80)
		     	   {
		     	   	tgrade.setText("B1");
		     	   }
		     	   else if(perc>=60 && perc<70)
		     	   {
		     	   	tgrade.setText("B2");
		     	   }
		     	   else if(perc>=50 && perc<60)
		     	   {
		     	   	tgrade.setText("C1");
		     	   }
               else if(perc>=40 && perc<50)
		     	   {
		     	   	tgrade.setText("C4");
		     	   }
		     	   else if(perc>=30 && perc<40)
		     	   {
		     	   	tgrade.setText("D");
		     	   }
		     	   else
		     	   {
		     	   	tgrade.setText("FAIL");
		     	   }
		     }
		     else
		     {
		     	   ttm.setText("Not valid");
		     	   tper.setText("Not valid");
		     	   tgrade.setText("Not valid");
		     }
		    
	}
	
	
	public static void main (String[] args)
	{
    	new ResultCalculater();
	}	  
}
