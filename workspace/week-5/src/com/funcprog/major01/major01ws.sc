package com.funcprog.major01

object major01ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	

	/*2nd item*/
		def fizzString(fizzString:String): Unit = {
			
			val con1 = fizzString.startsWith("f");
			val con2 = fizzString.endsWith("b");
			
			
			if(con1){
				println("Fizz");
			}else if(con2){
				println("Buzz");
			}else if(con1 && con2){
				println("FizzBuzz");
			}else {
				println("Mali ka!");
			}
		}                                 //> fizzString: (fizzString: String)Unit
		
		fizzString("fig");                //> Fizz
		fizzString("dib");                //> Buzz
		fizzString("fob");                //> Fizz
		fizzString("big");                //> Mali ka!
		
	/*3rd item*/
	def fact(n:Int): Unit ={
		
		val ans = (n*(n-1));
		
		
			if(n!= 0){
						if(ans == 0){
						println(1);
					}else
							println(ans);
					}
				
	 }                                        //> fact: (n: Int)Unit
	 
	 	fact(1);                          //> 1
		fact(2);                          //> 2
		fact(3);                          //> 6
		
	 
}