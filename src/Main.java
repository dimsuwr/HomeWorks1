
//Задание №1
    //Создаем класс, и в нем метод main.
public class Main {
    static public void main(String[] args) {
 //Задание №2
        //Создаю переменные всех типов данных.
        byte a = 10;
        short b = 15;
        int c = 20;
        long d = 1000000;

        float e = 1.87f;
        double f = 1.5;

        char g = '3';
        boolean h = true;


//Задание №3
        //Присваиваем переменным в методе Expression значения, и выводим на экран
        System.out.println("Задание №3\nОтвет: " +Expression( +2,1,10,5) +"\n");

//Задание №4
        //Присваиваем переменным в методе sum значения, и выводим на экран, один из вариантов ответа.
        if (sum(11, 8)){
            System.out.println("Задание №4\nОтвет: true\n");
        } else {
            System.out.println("false");
        }

//Задание №5
        //Присваиваем значение для переменной X, в методе InCheck
        InCheck(5);




//Задание №6
        //Выводим на экран, то что возвращает метод Check.
        System.out.println("Задание №6\nОтвет: " + Check(3) + "\n");





//Задание №7
        //Присваиваем переменной в методе Name текстовое значение.
        Name(" Преподаватель!");



//PS
        System.out.println("Задание №8 не смог осилить, подсмотрел в интернете как оно решается, разобрал его, решил в ДЗ не вставлять, не честно!\n");

    }







//Задание №3
    //Создаем метод для вычисления вырожения, с возвращающим результатом.
    static int Expression(int a, int b, int c, int d){
        return a * (b + (c / d));
    }


//Задание №4
    //Создаем метод проверяющий что сумма двух чисел, лежит в пределах от 10 до 20 включительно.
    // И возвращает результат.
    static boolean sum (int a, int b){
        return a+b>=10 && a+b<=20;
    }


//Задание №5
    //Создаем метод, проверяющий положительное ли число или отрицательно
    //Ответы выводи в консоль.
    static void InCheck(int x){
        if(x >= 0){
            System.out.println("Задание №5\nОтвет: число положительное\n");
        } else {
            System.out.println("Задание №5\nОтвет: число отрицательное\n");
        }
    }


//Задание №6
    //Создаем новый метод и проверяем значение переменной.
    //Результат возвращаем.
     static boolean Check(int a){
        if (a < 0){
            return true;
        } else {
            return false;
        }
    }



//Задание №7
    //Берем значение переменной, подставляем к тексту, и выводим на экран.
    static void Name (String a){
        System.out.println("Задание №7\nЗдравствуйте" + a +"\n");
    }

}
