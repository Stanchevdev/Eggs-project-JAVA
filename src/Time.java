import java.util.Timer;
import java.util.TimerTask;

public class Time {
    public void checkTime(double answer) {
        String additionalMsg = "";
        if (answer > 0.1 && answer < 3.0) {
            additionalMsg = "яйцата са все още рохки";
        } else if (answer > 3.0 && answer < 5.0) {
            additionalMsg = "белтъка е твърд, но жълтъка е течен";
        } else if (answer > 5.0 && answer < 8.0) {
            additionalMsg = "белтъка и жълтъка са твърди";
        } else if (answer > 8.0) {
            additionalMsg = "по-твърди няма да станат";
        }
        System.out.println("При " + answer + " мин. варене, " + additionalMsg + "!");
    }
}

