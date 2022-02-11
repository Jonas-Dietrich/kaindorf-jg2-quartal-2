package bl;

import gui.MinMaxGUI;

import java.util.Random;

public class MinMaxBL {

    int[] feld = new int[100];
    int min = 1001;
    int max = -1;

    public MinMaxBL() {
        Random random = new Random();
        for (int i = 0; i < feld.length; i++) {
            feld[i] = random.nextInt(999) + 1;
        }
    }

    public void berechneMinMax() {

        for (int i = 0; i < feld.length; i++) {
            if (feld[i] < min ) {
                min = feld[i];
            }

            if (feld[i] > max) {
                max = feld[i];
            }
        }
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public int[] getFeld() {
        return this.feld;
    }

}
