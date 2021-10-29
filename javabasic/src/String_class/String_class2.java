package String_class;

public class String_class2 {

	public static void main(String[] args) {
		String s1="corejavabasic";
		
		//return the number of character in the string
		System.out.println("string length"+s1.length()); //14-->0-13
		
		//Return the  character in the index
		System.out.println("string concatination is: "+s1.charAt(2)); //14-->0-13
	
		//Return the sub string from the index character
		System.out.println("substring form index is: "+s1.substring(3)); //
			
		//Return the sub string from i to j 1 index 
		System.out.println("substring form 2 to 5: "+s1.substring(2,5)); //
		System.out.println("substring form 4 to 8: "+s1.substring(4,8)); //
				
	//Concatenation string 2 to the end of the string 1
	String s2 = "Core";
	String s3 = "JavaBasic";
	System.out.println("First value of  s2"+s2);
	System.out.println("First value of  s3"+s3);
	System.out.println("concatinaton string : "+s2.concat(s3));  //corejavabasic
	System.out.println("after concatinaton value of s2 : "+s2); //core 
	System.out.println("after concatinaton value of s3 : "+s3); //core 
	
	//return the index within the string 
	
	String s5 ="Learn Share Learn share";
	System.out.println("Index of 'share' starts from:"+s5.indexOf("Share"));
	
	//return the index within the string of the
	//first occurrence of the string of the 
	//starting at the specified index
	System.out.println("Index of a= :"+s5.indexOf('a',3));
	System.out.println("Index of e= :"+s5.indexOf('e',11));
	
	System.out.println("Last Index of 'learn' :"+s5.lastIndexOf("Learn",18));
	System.out.println("Index of e = :"+s5.lastIndexOf('e',11));
	
	//checking equality of string 
	String  s6="Selenium";
	String  s7="selenium";
	String  s8="Selenium";
	System.out.println("Checking equality of s6 & s7= "+ s6.equals(s7));
	System.out.println("Checking equality of s6 & s8= "+ s6.equals(s8));
	System.out.println("Checking equality of s6 & s7 with ignore case= "+ s6.equalsIgnoreCase(s7));
	
	//converting cases lowecare
	String word1 = "CoreJava";
	System.out.println("Changing to lower case= "+word1.toLowerCase());// lower case print 
	
	//converting cases upper case
	String word2 = "CoreJava";
	System.out.println("Changing to upper case= "+word2.toUpperCase());// upper case print
		
	//trimming the word
	String word4 = "Learn Shaare Learn";
	System.out.println("Trim the word= "+word4.trim());
	
	//Replacing character
	//converting cases upper case
	String str1 = "CoreJavaBasic";
	System.out.println("Original string= "+str1);// CoreJavaBasic
	String str2 = str1.replace('a', 'x');
	System.out.println(" Replace with x->= "+str2);  //CorejxvxBasic
	
	String str3 = str1.replace("Java","Net");
	System.out.println(" Replace 'java' with 'net'= "+str3);  
	
	String str4 = str1.replaceFirst("a", "W");
    System.out.println("replace first 'a' with 'W'= "+str4);
	String str5="";
	System.out.println("str5 is empty or not= "+str5.isEmpty());
	
	}

}
