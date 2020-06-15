import java.io.*;

class railfence
{
	public static String encrypt(String plainText,int key)
	{
		int r = key; 
		int len = plainText.length();
		int c;
		if(len%2 == 0)
		{
			c = (len/key);
		}
		else
		{
			c = (len/key) + 1;
		}
		char mat[][] = new char[r][c];
		int k = 0;   
		String cipherText = "";
   
		for(int i = 0;i < c;i++)
		{
			for(int j = 0;j < r;j++)
			{
			if(k!=len)
				mat[j][i] = plainText.charAt(k++);
			else
				mat[j][i] = ' ';
			}
		}
		
		for(int i = 0;i < r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				cipherText += mat[i][j];
			}
		}
		return cipherText;
	}
  
  
	public static String decrypt(String cipherText,int depth)
	{
		int r=depth,len=cipherText.length();
		int c=len/depth;
		char mat[][]=new char[r][c];
		int k=0;
		String plainText="";	
		   
		for(int i = 0;i < r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				mat[i][j] = cipherText.charAt(k++);
			}
		}
		
		for(int i=0;i < c;i++)
		{
			for(int j=0;j < r;j++)
			{
				plainText+=mat[j][i];
			}
		}   
		
		return plainText;
	}
		
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String text,text2;
		int key = 2;
		
		System.out.println("Enter string to encrpyt: ");
		text = br.readLine();
		 
        System.out.println("\nText : " + text); 
        System.out.println("Key: " + key); 
        System.out.println("Cipher: " + encrypt(text, key)); 
		
		System.out.println("Original string: " + decrypt(encrypt(text, key), key)); 
	}
}
