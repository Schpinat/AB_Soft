package Solution;

import java.util.Arrays;

public class Solution {
    private int a;
    private int b;
    private int c;
    private double D;
    private double[] x = new double[2];
    String answer;



    public Object resultDis (int a, int b, int c)
    {
        final int i = b * b - 4 * a * c;
        this.D = i;
        this.a = a;
        this.b = b;
        this.c = c;

        if (i > 0 || i == 0) {
            this.x [0] = (-b + Math.sqrt(D)) / (2 * a);
            this.x [1] = (-b - Math.sqrt(D)) / (2 * a);
            return this.answer = Arrays.toString(x);
        } else {
            return this.answer = null;
        }
    }


// Проверка программы, черновик
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Найденные корни уровнения: " + solution.resultDis(1,-4,-5) + ", Дискриминант=" + solution.D);
        System.out.println("Найденные корни уровнения: " + solution.resultDis(3,-4,2) + ", Дискриминант=" + solution.D);
        System.out.println("Найденные корни уровнения: " + solution.resultDis(3,-18,27) + ", Дискриминант=" + solution.D);
    }
}

