//2)scrivere una classe chiamata Tabellina il cui costruttore prendere in ingresso un int, la classe ha un metodo chiamato stampa che non prende in ingresso niente e quando invocato stampa a video tutta la tabellina del numero con cui la classe e' stata costruita


public class Tabellina {
    private int number;

    public Tabellina (int number){
        this.number =  number;
    }

    public void stampa(){
         for(int i= 1; i<= 10; i++){
            int total = (number * i);
            System.out.println(total);
         }
    }
}
