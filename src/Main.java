public class Main {
    public static void main(String[] args) {
        System.out.println(siuuuuu(23, 5));
        System.out.println(siuuuuu(-34, 100));
        System.out.println(siuuuuu(35, 67));
        System.out.println(siuuuuu(10, 34));
        System.out.println(siuuuuu(0, 20));
    }

    public static String siuuuuu(int temperature, int age){
        if (age > 20&& age<45 && temperature> -20&&temperature<30){
            return "Можно идти гулять";
        }else if (age<20&&temperature>0&&temperature<28){
         return "Можно идти гулять";
        }else {
            return "Нельзя идти гулять";
        }
    }
}