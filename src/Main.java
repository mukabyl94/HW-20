import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String days = scan.nextLine();
        Days day = Days.valueOf(days.toUpperCase());

        switch (day){
            case DUISHOMBU -> System.out.println("Duishombu kunu JAVA okuim");
            case SHEISHEMBI -> System.out.println("Sheishembi kunu anglis tili sabagyn okuim");
            case SHARSHEMBI -> System.out.println("Sharshembi kunu JAVA okuim");
            case BEISHEMBI -> System.out.println("Beishembi kunu practikalyk sabagyn okuim");
            case JUMA -> System.out.println("Juma kunu JAVA okuim");
            case ISHEMBI -> System.out.println("Ishembi kunu practikalyk sabagyn okuim");
            case JEKSHEMBI -> System.out.println("Jekshembi kunu sabak bolboit");
        }
    }
}