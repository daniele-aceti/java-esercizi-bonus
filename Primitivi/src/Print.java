//3)scrivere una classe con sufficienti metodi tutti chiamati stampa che possono stampare boolean, int, short, double, long

public class Print {
    public static void main(String[] args) {

        PrintClass printResult = new PrintClass();
        printResult.print(true);
        printResult.print(5);
        printResult.print(1.5);
        printResult.print(9223372036854775807L);
        short number = 320;
        printResult.print(number);
    }
}
