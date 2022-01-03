
class cc
{
    public static String encrypt(String text, int s)
    {
        s = s %26+26;
        StringBuilder encode = new StringBuilder();
        for(char i: text.toCharArray())
        {
            if(Character.isLetter(i))
            {
            if(Character.isUpperCase(i))
            {
             encode.append((char)('A'+(i - 'A'+ s)%26));   
            }
            else
            {
                encode.append((char)('a'+(i -'a'+s)%26));
            }
            }        
            else
            {
             encode.append(i);    
            }

        }
        return encode.toString();
    } 
    public static String decrypt(String text, int s)
    {
        return encrypt(text, 26 - s );
    } 
public static void main(String[] args) throws java.lang.Exception
{
String msg="Anna University";
System.out.println("Simulating Ceaser Cipher \n -----------------");
System.out.println("Input:"+msg);
System.out.println("Encrypted MEssage:");
System.out.println(cc.encrypt(msg, 3));
System.out.println("Decrypt Message");
System.out.println(cc.decrypt(cc.encrypt(msg,3), 3));
}
}