package com.funcprog.major01

object major01ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(330); 
	
	

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
		};System.out.println("""fizzString: (fizzString: String)Unit""");$skip(24); 
		
		fizzString("fig");$skip(21); ;
		fizzString("dib");$skip(21); ;
		fizzString("fob");$skip(21); ;
		fizzString("big");$skip(175); ;
		
	/*3rd item*/
	def fact(n:Int): Unit ={
		
		val ans = (n*(n-1));
		
		
			if(n!= 0){
						if(ans == 0){
						println(1);
					}else
							println(ans);
					}
				
	 };System.out.println("""fact: (n: Int)Unit""");$skip(15); 
	 
	 	fact(1);$skip(11); ;
		fact(2);$skip(11); ;
		fact(3);}
		
	 
}
