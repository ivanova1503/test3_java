import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n= scanner.nextInt();
        while (n<=0) {
            System.out.println("Количество строк должно быть больше 0");
            System.out.println("Введите количество строк:");
            n= scanner.nextInt();
        }

        //массив строк
        String[] array = new String[n];

        //заполнение массива построчно
        Scanner scannerStrok = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            System.out.println("Введите сроку: ");
            array[i]=scannerStrok.nextLine();

        }

        char[] stroka;

        int count;//количество разных букв

        int[] array1 = new int[n];

        for (int i=0; i<array.length;i++) {

            stroka = array[i].toCharArray();
            count=0;
            boolean povtoreniya = false;
            for (int j=0; j< stroka.length; j++) { //берем каждую букву и сравниваем с остальными, есть ли совпадения
                for (int k=0; k< stroka.length;k++) { //если одна буква не равна всем остальным, то увеличить счетчик
                    if ((stroka[j]!=stroka[k]) && (j!=k))  {
                        continue;
                    }
                    else if ((stroka[j]==stroka[k]) && (j!=k)) {
                        povtoreniya=true;
                    }
                }
                if (povtoreniya==false) {
                    count++;
                }

            }
            //System.out.println(count);
            array1[i]=count;
        }

        //найти большее число в массиве array1
        int result=0; // номер строки, в которйо находится значение max
        int max=array1[0];
        for (int i=1; i< array1.length; i++) {
            if (array1[i]>max) {
                max = array1[i];
                result=i;
            }
        }
        System.out.println("Максимальное число неповторяющихся букв находится в строке с индексом:"+result);
        System.out.println("Результат: " + array[result]);
    }
}
