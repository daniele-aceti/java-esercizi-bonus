public class Class{
    int contatore = 0;


     void a(){
         if(contatore == 10){
            System.out.println(contatore);
            return;
    }else{
        System.out.println(contatore);
        contatore += 1;
        b();
    }
}
     void b(){
        c();
    }
     void c(){
        a();
    }
    
   
}