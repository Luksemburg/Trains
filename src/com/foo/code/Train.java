package com.foo.code;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Train {
	private String destination;
	private String numb;
	private String time;
	
	public Train(){
		destination = Towns.pickTown().toString();
		numb = Letters.someLetter().toString() + "-" + new Random().nextInt(1000);
		
		Formatter ft = new Formatter(); 
		ft.format("%02d : %02d", new Random().nextInt(24), new Random().nextInt(60));
		time = ft.toString();
		ft.close();
	}
	
	
	public static void main(String...args) {
		Train[] tr = new Train[5];
		 				
		for(int i = 0; i < tr.length; i++){
			tr[i] = new Train();
		}
		
		for(Train t : tr){
			System.out.println(t.numb + '\n' + t.destination + '\n' + t.time + '\n');
		}
		
		System.out.println("---------------------------------");
	
		Scanner cons;
		String search;
				
		label1 :
		
		for(;;){
			
			cons = new Scanner(System.in);
			System.out.println("Input number of the train: ");
			search = cons.nextLine();
			
			boolean flag = false;
			
			try{

				
				for(Train t : tr){
					if(search.equalsIgnoreCase(t.numb)){
						System.out.println(t.numb + '\n' + t.destination + '\n' + t.time + '\n');
						flag = true;
					}
				}
				
				if(!flag){
					throw new RuntimeException();					
				}
								
			}
			catch(RuntimeException re){
				System.err.println("No such train!");
				System.out.println("Exit? Y/N");
				search = cons.nextLine();
				if(search.equalsIgnoreCase("Y")){
					cons.close();
					System.exit(1);
				}else{
					continue label1;
				}
			}
		}
				
	}
}
