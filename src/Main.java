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

        int l=0;
        char[] stroka;
        String nomeraStrok=""; //записывает номера строк, в которых нет совпадений
        for (int i=0; i<array.length;i++) {
            //получить длину строки каждого элемента массива
            l=array[i].length();
            //заполнить новый массив символами из строки элемента
            stroka = array[i].toCharArray();
            boolean sovpadeniya = false; //записывает, есть ли совпадения в строке

            for (int j=0; j< stroka.length; j++) { //берем каждую букву и сравниваем с остальными, есть ли совпадения
                for (int k=0; k< stroka.length;k++) {
                    if ((stroka[j]==stroka[k])&&(j!=k))  {
                       sovpadeniya=true;
                       break;
                    }
                    else {
                        continue;
                    }
                }
            }
            if (sovpadeniya==false) {
                nomeraStrok+= Integer.toString(i);
            }

        }

        //получили несколько строк где нет совпадений и их номера
        //System.out.println("Номера строк где нет совпадений: "+ nomeraStrok);

        if (nomeraStrok.length()==0) {
            System.out.println("Нет строк, удовлетворяющих запросу");
        }
        //вывести первую строку из полученных
        else if (nomeraStrok.length()>0) {
            String result = "";
            int nomerStroki = Integer.parseInt(nomeraStrok.substring(0,1));

            result= array[nomerStroki];
            System.out.println("Ответ: " + result);
        }


    }
}
