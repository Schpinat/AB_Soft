package Solution;

public class Quadratic {
    private int a;
    private int b;
    private int c;
    private double D;
    Solution solution;


    public Solution resultDis (int a, int b, int c)
    {
    solution = new Solution();
        this.D = b * b - 4 * a * c;
        this.a = a;
        this.b = b;
        this.c = c;

       if (D > 0 || D == 0) {
            solution.setX1((-b + Math.sqrt(D)) / (2 * a)) ;
            solution.setX2((-b - Math.sqrt(D)) / (2 * a)) ;
        } else  {
            solution = null;
        }
        return solution;
    }




// Проверка программы, черновик
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        quadratic.resultDis(1,-4,-5);
        System.out.println("Найденные корни уравнения: " +  quadratic.solution + ", Дискриминант=" + quadratic.D);
        quadratic.resultDis(3,-4,2);
        System.out.println("Найденные корни уравнения: " + quadratic.solution + ", Дискриминант=" + quadratic.D);
        quadratic.resultDis(3,-18,27);
        System.out.println("Найденные корни уравнения: " + quadratic.solution + ", Дискриминант=" + quadratic.D);

    }
}

