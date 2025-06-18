/*import java.util.StringTokenizer;
class StringFunctions
    {
        public static void main(String [] args)
        {
            String str="HEllO my name is Aditya";
            String str2="Hello";
            StringBuilder str1=str;
            StringBuilder str1 = new StringBuilder(str);
            System.out.println(str);
            System.out.println("UPPER CASE:"+str.toUpperCase());
            System.out.println("REVERSE:"+str1.reverse());
            System.out.println(str.compareTo(str2));
            System.out.println("UPPER CASE:"+str.toUpperCase());
            System.out.println("LOWER CASE:"+str.toLowerCase());
            char cha='A';
            int f=0;
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(cha == ch)
                {
                    int f=i;
                    break;
                }    
            }
        

            if(f!=0)
            System.out.println("The Character is present in the String at index"+f);
            else 
            System.out.println("The Character is not in the String");
        
            if (str.equals(str1))
            System.out.println("The String is Palindrome");
            else 
            System.out.println("the String is not a Palindrome");
        
            int c=0,c1=0,c2=0;
            for(int i=0;i<str.length();i++)
            {
            char ch=str.charAt(i);
            if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            c++;
            else
            c1++;
            }
            
                StringTokenizer tokenizer =new StringTokenizer(str," ");
                while(tokenizer.hasMoreTokens())
                { 
                    String token =tokenizer.nextToken();
                    c2++;
                 }
                System.out.println("words:"+c2);
                System.out.println("Vowels:"+c);
                System.out.println("Consonant:"+c1);
        
        
    
    }  
    
    

    */


    import java.util.StringTokenizer;

    public class StringFunctions {
        public static void main(String[] args) {
            String str = "HEllO my name is Aditya";
            String str2 = "Hello";
            StringBuilder str1 = new StringBuilder(str);
            System.out.println(str);
            System.out.println("UPPER CASE:" + str.toUpperCase());
            System.out.println("REVERSE:" + str1.reverse());
            System.out.println("Comparison with str2: " + str.compareTo(str2));
            
        StringBuffer sb = new StringBuffer("A B");
        System.out.println(sb.insert(2, 'C'));
        System.out.println(sb.insert(3, "Hello").insert(8, 5));
            System.out.println("UPPER CASE:" + str.toUpperCase());
            System.out.println("LOWER CASE:" + str.toLowerCase());
            char cha = 'A';
            int f = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (cha == ch) {
                    f = i;
                    break;
                }
            }
    
            if (f != 0) {
                System.out.println("The Character is present in the String at index " + f);
            } else {
                System.out.println("The Character is not in the String");
            }
    
            String reversedStr = str1.reverse().toString().toLowerCase();
            String originalStrWithoutSpaces = str.replaceAll("\\s+", "").toLowerCase();
            if (originalStrWithoutSpaces.equals(reversedStr)) {
                System.out.println("The String is Palindrome");
            } else {
                System.out.println("The String is not a Palindrome");
            }
    
            int c = 0, c1 = 0, c2 = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    c++;
                } else if (Character.isLetter(ch)) {
                    c1++;
                }
            }
    
            StringTokenizer tokenizer = new StringTokenizer(str, " ");
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                c2++;
            }
            System.out.println("Words: " + c2);
            System.out.println("Vowels: " + c);
            System.out.println("Consonants: " + c1);
        }
    }
    