package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int nst = height;
        int nsp = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < nst; k++) {
                System.out.print("8");
            }
            System.out.println(" ");

            if (i < height / 2) {
                nsp += 1;
                nst -= 2;
            } else {
                nsp -= 1;
                nst += 2;
            }
        }
    }
}