import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        House house1 = new House();

        house1.setFloorNumbers(scanner.nextInt());
        scanner.nextLine();
        house1.setAddress(scanner.nextLine());
        house1.setResidentsNames(scanner.nextLine());

        String house1Details = String.format("House1Details: floors: %d, address: %s, residents: %s",
                house1.getFloorNumbers(), house1.getAddress(), house1.getResidentsNames());

        System.out.println(house1Details);
    }
}
