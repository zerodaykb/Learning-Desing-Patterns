package model;

import java.util.Scanner;

public class AlarmScheduler extends Thread {
    private Alarm alarm;

    public AlarmScheduler(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void run() {
        System.out.println("Wpisz pin. Wpisanie \"koniec\" zamyka");

        while(true) {
            Scanner odczyt = new Scanner(System.in);
            String input = odczyt.nextLine();

            if(input.equals("koniec")) break;
            alarm.enterPin(input);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Blad podczas usypiania watku");
            }
        }
    }
}
