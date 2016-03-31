package com.PR.g_calculator;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Editable;
import android.text.Selection;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
	
	
	EditText op1,op2,op3,op4,op5,op6,op7,op8;
	TextView r1,r2,r3,r4;
	int u1,u2,u3,u4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 op1=(EditText)findViewById(R.id.editText1);
	     op2=(EditText)findViewById(R.id.editText2);
	     op3=(EditText)findViewById(R.id.editText3);
	     op4=(EditText)findViewById(R.id.editText4);
	     op5=(EditText)findViewById(R.id.editText5);
	     op6=(EditText)findViewById(R.id.editText6);
	     op7=(EditText)findViewById(R.id.editText7);
	     op8=(EditText)findViewById(R.id.editText8);
	     r1= (TextView)findViewById(R.id.textView1);
	     r2= (TextView)findViewById(R.id.textView2);
	     r3 = (TextView)findViewById(R.id.textView3);
	     r4 = (TextView)findViewById(R.id.textView4);  
	     op1.setTextIsSelectable(true);
	     op2.setTextIsSelectable(true);
	     op3.setTextIsSelectable(true);
	     op4.setTextIsSelectable(true);
	     op5.setTextIsSelectable(true);
	     op6.setTextIsSelectable(true);
	     op7.setTextIsSelectable(true);
	     op8.setTextIsSelectable(true);
	}
     
	public void add(View v){
		String op1str=op1.getText().toString();
    	String op2str=op2.getText().toString();
    	String op3str=op3.getText().toString();
    	String op4str=op4.getText().toString();
    	String op5str=op5.getText().toString();
    	String op6str=op6.getText().toString();
    	String op7str=op7.getText().toString();
    	String op8str=op8.getText().toString();
    	
    	if(!op1str.equals("")&& !op2str.equals("") && !op3str.equals("")&& !op4str.equals("")&& !op5str.equals("")&&!op6str.equals("")&&!op7str.equals("")&&!op8str.equals("")){
    		int operend1=Integer.parseInt(op1str);
    		int operend2=Integer.parseInt(op2str);
    		int operend3=Integer.parseInt(op3str);
    		int operend4=Integer.parseInt(op4str);
    		int operend5=Integer.parseInt(op5str);
    		int operend6=Integer.parseInt(op6str);
    		int operend7=Integer.parseInt(op7str);
    		int operend8=Integer.parseInt(op8str);
    		if(operend2<16 && operend6<16 && operend3<6 && operend7<6 && operend4<10 && operend8<10){
    		int a1=operend4+operend8;
    		int a2=a1/10;
    		int a3=a1%10;
    		r4.setText(""+a3);
    		u4=a3;
    		int b1=operend3+operend7+a2;
    		int b2=b1/6;
    		int b3=b1%6;
    		r3.setText(""+b3);
    		u3=b3;
    		int c1=operend2+operend6+b2;
    		int c2=c1/16;
    		int c3=c1%16;
    		r2.setText(""+c3);
    		u2=c3;
    		int d1=operend1+operend5+c2;
    		r1.setText(""+d1);
    		u1=d1;
    		}else{
    			r1.setText("PIC");
        		r2.setText("PIC");
        		r3.setText("PIC");
        		r4.setText("PIC");
    		}
    	}else{
    		r1.setText("PI");
    		r2.setText("PI");
    		r3.setText("PI");
    		r4.setText("PI");
    	}
    	
	}
    public void minus(View v){
    	String op1str=op1.getText().toString();
    	String op2str=op2.getText().toString();
    	String op3str=op3.getText().toString();
    	String op4str=op4.getText().toString();
    	String op5str=op5.getText().toString();
    	String op6str=op6.getText().toString();
    	String op7str=op7.getText().toString();
    	String op8str=op8.getText().toString();
    	if(!op1str.equals("")&& !op2str.equals("") && !op3str.equals("")&& !op4str.equals("")&& !op5str.equals("")&&!op6str.equals("")&&!op7str.equals("")&&!op8str.equals("")){
    		int operend1=Integer.parseInt(op1str);
    		int operend2=Integer.parseInt(op2str);
    		int operend3=Integer.parseInt(op3str);
    		int operend4=Integer.parseInt(op4str);
    		int operend5=Integer.parseInt(op5str);
    		int operend6=Integer.parseInt(op6str);
    		int operend7=Integer.parseInt(op7str);
    		int operend8=Integer.parseInt(op8str);
    		int p,r,t;
    		if(operend2<16 && operend6<16 && operend3<6 && operend7<6 && operend4<10 && operend8<10){
    		if(operend4<operend8){
    		     int a1=operend4+10;
    		     int a2=a1-operend8;
    		     r4.setText(""+a2);
    		     p=1;
    		     u4=a2;
    		}else{
    			int a1=operend4-operend8;
    			r4.setText(""+a1);
    			p=0;
    			u4=a1;
    		}
    	   if(operend3<=operend7){
    		   int b1=operend3+6;
    		   int b2=operend7+p;
    		   int b3=b1-b2;
    		   r3.setText(""+b3);
    		   r=1;
    		   u3=b3;
    	   }else{
    		   int b1=operend7+p;
    		   int b2=operend3-b1;
    		   r3.setText(""+b2);
    		   r=0;
    		   u3=b2;
    	   }
    	   if(operend2<=operend6){
    		   int c1=operend2+16;
    		   int c2=operend6+r;
    		   int c3=c1-c2;
    		   r2.setText(""+c3);
    		   t=1;
    		   u2=c3;
    	   }else{
    		   int c1=operend6+r;
    		   int c2=operend2-c1;
    		   r2.setText(""+c2);
    		   t=0;
    		   u2=c2;
    	   }
    	   int d1=operend5+t;
    	   int d2=operend1-d1;
    	   r1.setText(""+d2);
    	   u1=d2;
    		}else{
    			r1.setText("PIC");
        		r2.setText("PIC");
        		r3.setText("PIC");
        		r4.setText("PIC");
    		}
    	}else{
    		r1.setText("PI");
    		r2.setText("PI");
    		r3.setText("PI");
    		r4.setText("PI");
    	}
    	
	}
    public void mult(View v){
    	String op1str=op1.getText().toString();
    	String op2str=op2.getText().toString();
    	String op3str=op3.getText().toString();
    	String op4str=op4.getText().toString();
    	String op5str=op5.getText().toString();
    	
    	if(!op1str.equals("")&& !op2str.equals("") && !op3str.equals("")&& !op4str.equals("")&& !op5str.equals("")){
    		int operend1=Integer.parseInt(op1str);
    		int operend2=Integer.parseInt(op2str);
    		int operend3=Integer.parseInt(op3str);
    		int operend4=Integer.parseInt(op4str);
    		int operend5=Integer.parseInt(op5str);
    		
    		if(operend2<16 &&  operend3<6 &&  operend4<10 ){
    			int a1=operend4*operend5;
        		int a2=a1/10;
        		int a3=a1%10;
        		r4.setText(""+a3);
        		u4=a3;	
        		int b1=(operend3*operend5)+a2;
        		int b2=b1/6;
        		int b3=b1%6;
        		r3.setText(""+b3);
        		u3=b3;
        		int c1=(operend2*operend5)+b2;
        		int c2=c1/16;
        		int c3=c1%16;
        		r2.setText(""+c3);
        		u2=c3;
        		int d1=(operend1*operend5)+c2;
        		r1.setText(""+d1);
        		u1=d1;
        		op6.setText("");
        		op7.setText("");
        		op8.setText("");
        		
    		}else{
    			r1.setText("PIC");
        		r2.setText("PIC");
        		r3.setText("PIC");
        		r4.setText("PIC");
    		}
    	}else{
    		r1.setText("PI");
    		r2.setText("PI");
    		r3.setText("PI");
    		r4.setText("PI");
    	}
    	
		
	}
    public void div(View v){
    	String op1str=op1.getText().toString();
    	String op2str=op2.getText().toString();
    	String op3str=op3.getText().toString();
    	String op4str=op4.getText().toString();
    	String op5str=op5.getText().toString();
    	if(!op1str.equals("")&& !op2str.equals("") && !op3str.equals("")&& !op4str.equals("")&& !op5str.equals("")){
    		int operend1=Integer.parseInt(op1str);
    		int operend2=Integer.parseInt(op2str);
    		int operend3=Integer.parseInt(op3str);
    		int operend4=Integer.parseInt(op4str);
    		int operend5=Integer.parseInt(op5str);
    		if(operend2<16 &&  operend3<6 &&  operend4<10 ){
    			int a1=operend1/operend5;
    			int a2=operend1%operend5;
    			r1.setText(""+a1);
    			u1=a1;
    			int b1=a2*16;
    			int b2=b1+operend2;
    			int b3=b2/operend5;
    			int b4=b2%operend5;
    			r2.setText(""+b3);
    			u2=b3;
    			int c1=b4*6;
    			int c2=c1+operend3;
    			int c3=c2/operend5;
    			int c4=c2%operend5;
    			r3.setText(""+c3);
    			u3=c3;
    			int d1=c4*10;
    			int d2=d1+operend4;
    			double opdiv=Double.parseDouble(op5str);
    			double d3=d2/opdiv;
    			r4.setText(""+d3);
    			u4=(int)d3;
    			
    			op6.setText("");
        		op7.setText("");
        		op8.setText("");
    		}else{
    			r1.setText("PIC");
        		r2.setText("PIC");
        		r3.setText("PIC");
        		r4.setText("PIC");
    		}
    	}else{
    		r1.setText("Please Input");
    		r2.setText("Please Input");
    		r3.setText("Please Input");
    		r4.setText("Please Input");
    	}
		
	}
    public void new1(View v){
    	op4.setText(""+u4);
    	op3.setText(""+u3);
    	op2.setText(""+u2);
    	op1.setText(""+u1);
    	op5.setText("");
    	op6.setText("");
    	op7.setText("");
    	op8.setText("");
    	
    }
    public void zero(View v){
    	op1.setText("");
    	op2.setText("");
    	op3.setText("");
    	op4.setText("");
    	op5.setText("");
    	op6.setText("");
    	op7.setText("");
    	op8.setText("");
    	r1.setText("");
    	r2.setText("");
    	r3.setText("");
    	r4.setText("");
    	
    }
    public void next(View v){
    	String op1str=op1.getText().toString();
    	String op2str=op2.getText().toString();
    	String op3str=op3.getText().toString();
    	String op4str=op4.getText().toString();
    	String op5str=op5.getText().toString();
    	String op6str=op6.getText().toString();
    	String op7str=op7.getText().toString();
    	String op8str=op8.getText().toString();//<requestFocus />
    	
    	if(!op1str.equals("")){
    		op2.requestFocus();	
    		
    		if(!op2str.equals("")){
        		op3.requestFocus();	
        		
        		if(!op3str.equals("")){
            		op4.requestFocus();
            		
            		if(!op4str.equals("")){
                		op5.requestFocus();	
                		if(!op5str.equals("")){
                    		op6.requestFocus();	
                    		if(!op6str.equals("")){
                        		op7.requestFocus();	
                        		if(!op7str.equals("")){
                            		op8.requestFocus();	
                            	}else{
                            		op7.requestFocus();
                            	}
                        	}else{
                        		op6.requestFocus();
                        	}
                    	}else{
                    		op5.requestFocus();
                    	}
                	}else{
                		op4.requestFocus();
                	}
            	}else{
            		op3.requestFocus();
            	}
        	}else{
        		op2.requestFocus();
        	}
    		
    	}else{
    		op1.requestFocus();
    	}
    	   }
    
    public void getKeyboard(String str){
      	if(op1.isFocused()){
      	String scrCurrent=op1.getText().toString();
      	scrCurrent =str;
      
      	//op1.setText(scrCurrent);
      	op1.append(scrCurrent);      	
      	}
      	
      	if(op2.isFocused()){
          	String scrCurrent=op2.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op2.append(scrCurrent);         	
          	}
      	if(op3.isFocused()){
          	String scrCurrent=op3.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op3.append(scrCurrent);         	
          	}
      	if(op4.isFocused()){
          	String scrCurrent=op4.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op4.append(scrCurrent);         	
          	}
      	if(op5.isFocused()){
          	String scrCurrent=op5.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op5.append(scrCurrent);         	
          	}
      	if(op6.isFocused()){
          	String scrCurrent=op6.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op6.append(scrCurrent);         	
          	}
      	if(op7.isFocused()){
          	String scrCurrent=op7.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op7.append(scrCurrent);         	
          	}
      	if(op8.isFocused()){
          	String scrCurrent=op8.getText().toString();
          	scrCurrent =str;
          	//op2.setText(scrCurrent);
          	op8.append(scrCurrent);         	
          	}
      	
          	
      }
      	    
    public void one(View v){
    	String numb=((Button) v).getText().toString();
		getKeyboard(numb);
    }
  
   public void cross(View v){
	   if(op1.isFocused()){
		   String str = op1.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op1.setText(str);
		   	}
		   }
	   if(op2.isFocused()){
		   String str = op2.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op2.setText(str);
		   	}
		   }
	   if(op3.isFocused()){
		   String str = op3.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op3.setText(str);
		   	}
		   }
	   if(op4.isFocused()){
		   String str = op4.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op4.setText(str);
		   	}
		   }
	   if(op5.isFocused()){
		   String str = op5.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op5.setText(str);
		   	}
		   }
	   if(op6.isFocused()){
		   String str = op6.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op6.setText(str);
		   	}
		   }
	   if(op7.isFocused()){
		   String str = op7.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op7.setText(str);
		   	}
		   }
	   if(op8.isFocused()){
		   String str = op8.getText().toString();
		   if(str.length()!=0){
		    str  = str.substring( 0, str.length() - 1 ); 
		    op8.setText(str);
		   	}
		   }
   } 
    
    
    
    
    
    
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
