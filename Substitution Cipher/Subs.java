import java.io.*;
class Subs
{

public static String decrypt(String cipher, int k)
    {
    String s="abcdefghijklmnopqrstuvwxyz";
    String p = "";
    for (int i = 0; i < cipher.length(); i++)
        {
            int val= s.indexOf(cipher.charAt(i));
            int res = (val-k) % 26;
            if (res < 0)
            {
                res = s.length() + res;
            }
            char reval = s.charAt(res);
            p += reval;
        }
        return p;
    }
    
public static void main(String args[]) throws IOException
    {
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  input string:");
    String a=br.readLine();

    System.out.println("Enter the key:");
    int k=Integer.parseInt(br.readLine());

    String b=a.toLowerCase();
    String s="abcdefghijklmnopqrstuvwxyz";
    String cipher="";
    for(int i=0;i<b.length();i++)
        {
         int val=s.indexOf(b.charAt(i));
         int res=(k+val)%26;
         char reval=s.charAt(res);
         cipher +=reval;
         } 
     System.out.println("Enrypted message is:"+cipher);
     System.out.println("Decrypted message is:"+decrypt(cipher,k));
    }

}
