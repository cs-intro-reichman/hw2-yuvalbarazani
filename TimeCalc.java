public class TimeCalc {
    public static void main(String[] args) {
       String time= args[0];
       int timeToAdd= Integer.parseInt(args[1]);
       int hours= Integer.parseInt(time.substring(0,2));
       int minutes= Integer.parseInt(time.substring(3,5));
       int totalMinutes= hours*60+minutes + timeToAdd;

       hours= (totalMinutes/60)%24;
       minutes= totalMinutes%60;

       if(hours<10)
            System.out.print("0" + hours + ":");
       else
            System.out.print(hours+":");
        
        if(minutes<10)
            System.out.print("0"+minutes);
        else 
            System.out.print(minutes);
        



       


    }
}
