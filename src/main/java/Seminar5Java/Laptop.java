package Seminar5Java;
import java.util.Scanner;
public class Laptop {
    public static void main(String[] args) {

        Laptop lt1 = new Laptop(101, "HP", "black", "WindowsHome", 4, 256, 30_000, 15.6);
        Laptop lt2 = new Laptop(102, "Digma", "silver", "WindowsHome", 4, 256, 12_600, 14.0);
        Laptop lt3 = new Laptop(103, "Acer", "black", "Linyx", 8, 256, 31_600, 15.6);
        Laptop lt4 = new Laptop(104, "HP", "blue", "WindowsHome", 8, 256, 37_000, 14.0);
        Laptop lt5 = new Laptop(105, "Lenovo", "blue", "WindowsPro", 12, 128, 21_000, 16.0);

        Laptop[] lt = new Laptop[] { lt1, lt2, lt3, lt4, lt5 };

        System.out.println("");
        System.out.println(
                "Введите критерий отбора: \n1 - наименование\n2 - HD\n3 - RAM\n4 - OS \n5 - цвет\n6 - цена\n7 - диагональ экрана\n8 - вывести на экран весь каталог");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Введите наменование: ");
                Scanner sc1 = new Scanner(System.in);
                System.out.println(Laptop.getLaptopByTm(lt, sc1.nextLine()));
                break;
            case 2:
                System.out.println("Введите желаемый размер HD:");
                int hd = sc.nextInt();
                System.out.println("Ноутбуки c жестким диском " + hd + "ГБ :");
                System.out.println(Laptop.getLaptopByHD(lt, hd));
                break;
            case 3:
                System.out.println("Введите желаемый размер RAM:");
                int ram = sc.nextInt();
                System.out.println("Ноутбуки c RAM " + ram + "ГБ :");
                System.out.println(Laptop.getLaptopByRAM(lt, ram));
                break;
            case 4:
                System.out.println("Введите OS: ");
                Scanner sc2 = new Scanner(System.in);
                System.out.println(Laptop.getLaptopByOS(lt, sc2.nextLine()));
                break;
            case 5:
                System.out.println("Введите желаемый цвет: ");
                Scanner sc3 = new Scanner(System.in);
                System.out.println(Laptop.getLaptopByColour(lt, sc3.nextLine()));
                break;
            case 6:
                System.out.println("Введите нижнюю границу цены: ");
                int price_min = sc.nextInt();
                System.out.println("Введите верхнюю границу цены: ");
                int price_max = sc.nextInt();
                System.out.println("Ноутбуки в указанном ценовом диапазоне: ");
                System.out.println(Laptop.getLaptopByPrice(lt, price_min, price_max));
                break;
            case 7:
                System.out.println("Введите размер монитора: ");
                double scr = sc.nextDouble();
                System.out.println("Ноутбуки c диагональю экрана " + scr + "'' :");
                System.out.println(Laptop.getLaptopByScreen(lt, scr));
                break;
            case 8:
                System.out.println("В наличии: ");
                System.out.println(lt1.toString());
                System.out.println(lt2.toString());
                System.out.println(lt3.toString());
                System.out.println(lt4.toString());
                System.out.println(lt5.toString());
                break;
            default:
                System.out.println("Мимо. Введите число от 1 до 8. ");
        }

        sc.close();
    }
}
