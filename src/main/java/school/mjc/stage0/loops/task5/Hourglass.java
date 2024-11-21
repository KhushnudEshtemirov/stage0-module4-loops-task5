package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if (i == height - 1 && j == height - 1 || i != height - 1 && (j == i || j == 2 * height - i - 2) || i == 0 && j != 2 * height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if (i == 0 && j == height - 1 || i != 0 && (j == height - i - 1 || j == height + i - 1) || i == height - 1 && j != 0 && j != 2 * height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
