package com.num2world;

/**
 * @author npradeep
 *
 */
public class App 
{
	 private static final String[] specialNames = {
		        "",  
		        " thousand",
		        " million",
		        " billion",
		        " trillion",
		        " quadrillion",
		        " quintillion"
		    };
		    
		    private static final String[] tensMultiply = {
		        "",
		        " ten",
		        " twenty",
		        " thirty",
		        " forty",
		        " fifty",
		        " sixty",
		        " seventy",
		        " eighty",
		        " ninety"
		    };
		    
		    private static final String[] numbers = {
		        "",
		        " one",
		        " two",
		        " three",
		        " four",
		        " five",
		        " six",
		        " seven",
		        " eight",
		        " nine",
		        " ten",
		        " eleven",
		        " twelve",
		        " thirteen",
		        " fourteen",
		        " fifteen",
		        " sixteen",
		        " seventeen",
		        " eighteen",
		        " nineteen"
		    };
		    
		    private String convertBelowThousand(int number) {
		        String current;
		        
		        if (number % 100 < 20){
		            current = numbers[number % 100];
		            number /= 100;
		        }
		        else {
		            current = numbers[number % 10];
		            number /= 10;
		            
		            current = tensMultiply[number % 10] + current;
		            number /= 10;
		        }
		        if (number == 0) return current;
		        return numbers[number] + " hundred" + current;
		    }
		    
		    public String convert(int number) {

		        if (number == 0) { return "zero"; }
		        
		        String prefix = "";
		        
		        if (number < 0) {
		            number = -number;
		            prefix = "negative";
		        }
		        
		        String current = "";
		        int place = 0;
		        
		        do {
		            int n = number % 1000;
		            if (n != 0){
		                String s = convertBelowThousand(n);
		                current = s + specialNames[place] + current;
		            }
		            place++;
		            number /= 1000;
		        } while (number > 0);
		        
		        return (prefix + current).trim();
		    }
		    
}
