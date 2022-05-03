public class HW4 {

    public static void main(String[] args) {

        /**
         * Задача №1
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести сумму всех значений массива.
         */

        System.out.println("Задача №1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        /**
         * Задача №2
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести максимальное значение массива.
         */

        System.out.println("Задача №2");

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array1[0];
        for (int i = 1; i < array1.length; i++)
            max = Math.max(max, array[i]);

        System.out.println(" максимальное значение = "+ max);

        /**
         * Задача №3
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести минимальное значение массива.
         */

        System.out.println("Задача №3");
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        for (int i = 0; i < array2.length; i++)
            min = Math.min(min, array2[1]);
        System.out.println("минимальное значение = " + min);

        /**
         * Задача №4
         *
         * Дан массив:
         * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         * необходимо вывести среднее арифметическое всех значений массива.
         */

        System.out.println("Задача №4");
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum1 = 0;
        for (int i = 0; i < array3.length; i++)
            sum1 = sum1 + array3[i];
            double srednee = sum1 / array3.length;
        System.out.println("среднее арифметическое = " + srednee);

        /**
        * Задача №5
        *
        * Дан массив:
        * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        * необходимо вывести сумму элементов массива.
        */
        System.out.println("Задача №5");

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++){
                sum4 = sum4 + array4[i][j];
            }
        }
        System.out.println(sum4);


        /**
        * Задача №6
        *
        * Дан массив:
        * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        * необходимо вывести максимальное значение массива.
        */

        System.out.println("Задача №6");
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = array6[0][0];
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++){
                max6 = Math.max(max6, array6[i][j]);
            }
        }
        System.out.println("максимальное значение = " + max6);


        /** Задача №7
        *
        * Дан массив:
        * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        * необходимо вывести количество элементов в массиве.
        */

        System.out.println("Задача №7");
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int counter = 0;
        for (int i = 0; i < array7.length; i++){
            for (int j = 0; j < array7[i].length; j++){
                if (array7[i] != null) {
                    counter++;

                }
            }
        }System.out.println(counter);

        /**
        * Задача №1
        *
        * Дана строка:
        * String s = “Перестановочный алгоритм быстрого действия”;
        * необходимо вывести все буквы “о” из этой строки.
        * Для указанной строки ответ будет “ооооо” (или в столбик)
        */
        System.out.println("Задача №1");
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }

       /**
        * Задача №2
        *
        * Дана строка:
        * String s = “Перевыборы выбранного президента”;
        * необходимо подсчитать количество букв “е” в строке.
        * Для указанной строки ответ будет 4.
        */

        System.out.println("Задача №2");
        String s1 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("количество букв “е” в строке = " + count);

        /**
//        * Задача №3
//        *
//        * Дана строка:
//        * String s = “Посмотрите как Рите нравится ритм”;
//        * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        * Для указанной строки ответ будет 6, 15, 29.
//        */
          System.out.println("Задача №3");
          String s3 = "Посмотрите как Рите нравится ритм";
          s3 = s3.toLowerCase();
          int index = s3.indexOf("рит");
          while (index != -1) {
              System.out.println(index);
              index = s3.indexOf("рит", index + 1);
          }



        /**
        * Экстра задача
        *
        * Дан массив:
        * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        */

        System.out.println("Экстра задач");
        String[][] array8 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter1 = 0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                if (!array8[i][j].contains("е")){
                    counter++;
                }
            }
        }
        System.out.println(counter1);
    }
}
