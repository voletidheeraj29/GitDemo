package DateTime;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
public static void main(String args[]){
 Date date = new Date();
 
  SimpleDateFormat ft =new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
  System.out.println(date);
        System.out.println("Current Date: " + ft.format(date));
}
}
   
