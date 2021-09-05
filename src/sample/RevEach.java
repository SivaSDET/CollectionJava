package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RevEach {

	public static void main(String[] args) throws IOException {
		String str="HI HELLO";
		String rev="";
		rev(str);
		System.out.println("SIva");
		swap();
		countWord();
	}
	public static void rev(String str)
	{
		String rev="";
		String words[]=str.split(" ");
		for(String s:words)
		{
			String revword="";
			for(int i=s.length()-1;i>=0;i--)
			{
				revword=revword+s.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.print(rev);
	}
	public static void swap()
	{
		String str1="AB", str2="CD";
		 //Concatenate both the string str1 and str2 and store it in str1    
        str1 = str1 + str2;  //GoodMorning
        System.out.println(str1);
        //Extract str2 from updated str1    
        str2 = str1.substring(0, (str1.length() - str2.length())); 
        System.out.println(str2);
        //Extract str1 from updated str1    
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings after swapping: " + str1 + " " + str2);  
	}
	public static void countWord() throws IOException
	{
		String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file = new FileReader("C:\\Users\\RAJ\\Downloads\\data.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
	}

}
