public class Main {
    public static void main(String[] args) {
       short[][] dioganalsTask = {
               {1, 2},
               {2, 3}
       };
        short[][] geometricTask = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        short[][] popularMatrixTask = {
                {1, -25, 3},
                {4, 25, 6},
                {7, 9, -25}
        };
        double[][] dioDubTask = {
                {1, 2},
                {2, 3}
        };
        double[][] geoDubTask = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String text = "I hate programing";

        double resDioDub = Matrix.dioSum(dioDubTask);
        double resMultDub = Matrix.geoMult(geoDubTask);
        int resDio = Matrix.dioSum(dioganalsTask);
        int resMult = Matrix.geoMult(geometricTask);
        int resPop = Matrix.matrixPop(popularMatrixTask);
        String resText = Text.solutionText(text);

        System.out.println("Обработанный текст:");
        System.out.println(resText);
        System.out.println("Сумма диагоналей:");
        System.out.println(resDio);
        System.out.println("Сумма диагоналей(double version):");
        System.out.println(resDioDub);
        System.out.println("Среднее геометрическое значение:");
        System.out.println(resMult);
        System.out.println("Среднее геометрическое значение(double version):");
        System.out.println(resMultDub);
        System.out.println("Самое часто встречаемое значение матрицы:");
        System.out.println(resPop);
    }
}