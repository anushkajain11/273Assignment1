package com.java.multithreading;

public class Multithreading implements Runnable{
		
		private Caller c;
		private int Name;
		
		Multithreading(Caller obj, int n){
			c=obj;
			Name = n;
		}
		
		public synchronized void run() {
			
			//System.out.println("Running :" + this.Name);
					
			for (int i=0; i<10;i++){
				
				System.out.println("Running:" + this.Name + "  Value : " + c.setValue(i));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


