import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Eggs eggsCount = new Eggs();
        Container container = new Container();
        Time timeObj = new Time();
        short maxCountOfEggs = 0;


        System.out.println("В джезве или тенджера ще варим?");
        System.out.println("За тенджера натиснете 1, за джезве натиснете 2");
        Scanner scanner = new Scanner(System.in);
        byte containerAnswer;
        while (true) {
            containerAnswer = scanner.nextByte();
            if (containerAnswer < 1 || containerAnswer > 2) {
                System.out.println("Пробвай пак!");
            }
            else {
                break;
            }
        }
        container.chooseContainer(containerAnswer);
        if (containerAnswer == 1) maxCountOfEggs = 12;
        if (containerAnswer == 2) maxCountOfEggs = 2;
        System.out.println("Колко яйца ще варим?");
        short countAnswer = 0;
        if (maxCountOfEggs > 0) {
            while (true) {
                countAnswer = scanner.nextShort();
                if (countAnswer < 1 || countAnswer > maxCountOfEggs) {
                    System.out.println("Броя на яйцата трябва да е между 1 и/или " + maxCountOfEggs);
                }
                else{
                    break;
                }
            }
        }
        eggsCount.eggsCount = countAnswer;

        System.out.println("Измиваме тези " + countAnswer + " яйца...");
        System.out.println("Време на варене(в минути): ");
        double time;
        while (true) {
            time = scanner.nextByte();
            if (time == 0) {
                System.out.println("Въведи повече време");
            }
            else{
                timeObj.checkTime(time);
                break;
            }
        }
        System.out.println("Поливаме яйцата със студена вода...");
        System.out.println("Готово");



    }
}
