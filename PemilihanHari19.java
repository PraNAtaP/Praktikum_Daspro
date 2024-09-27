import java.util.Scanner;

public class PemilihanHari19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.println("Input day name :");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "Monday" :
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
            case "Friday" :
                dayType = "weekday";
                break;
            case "Saturday " :
            case "Sunday" :
                dayType = "weekend";
                break;
            default :
                dayType = "Invalid";
        }
    }
}