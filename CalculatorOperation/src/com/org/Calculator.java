package com.org;

public class Calculator {
  
	public void add(){

		int i=50;
		float y=30.5f;
		 System.out.println(i+y);
		}
		public void sub(){
		int a=50;
		int b=15;
		System.out.println(a-b);

		}

	    public void div(){
		int p,q,r;
		p=25;
		q=5;
		r=p/q;

		System.out.println(r);

		}
   
	    public void mul(){
			 int v=10;
			int w=2;
			System.out.println(v*w);
			}
		
		
		  public static void main(String args[]){
		  
		  Calculator cal = new Calculator(); 
			  cal.add(); 
			  cal.sub(); 
			  cal.mul();
		       cal.div(); }
		 
		
}

