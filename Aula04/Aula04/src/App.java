import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDateTime dateTime = LocalDateTime.now();   

        DateTimeFormatter dateFormat =  DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm: ss");
        System.out.println(dateFormat.format(dateTime));

if (dateTime.getHour() <12 ){
    System.out.println("Bom dia!");
} else if (dateTime.getHour() < 18) {
    System.out.println("Boa tarde!");
} else {
    System.out.println("Boa noite!");
}

    }


}
