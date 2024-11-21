package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < 2 * cathetusLength; j++) {
                if (i == 0 && j == cathetusLength - 1 || i != 0 && (j == cathetusLength - i - 1 || j == cathetusLength + i - 1) || i == cathetusLength - 1 && j != 0 && j != 2 * cathetusLength - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
