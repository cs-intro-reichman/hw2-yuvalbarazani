// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer=args[0];
            int times = Integer.parseInt(args[1]);

            cheer = cheer.toUpperCase();
            String anLetters = "AEFHILMNORSX";
            char temp;

            for(int i=0;i<cheer.length();i++)
            {
                temp=cheer.charAt(i);
                if(anLetters.indexOf(temp)==-1)
                        System.out.println("Give me a  "+ temp+": "+temp+"!");
                else
                        System.out.println("Give me an "+ temp+": "+temp+"!");

            }
            System.out.println("What does that spell?");
            for(int i=0;i<times;i++)
                System.out.println(cheer+"!!!");
            
        }
}
