public class App {
    
    public static void main(String[] args) throws Exception {
        
        Cachorro cachorro = new Cachorro("Scoob-Doo", 15, 6000, 90, 4);;
        cachorro.comer(14);
        cachorro.moverse(200, "Cm");
        cachorro.dormir(240, "minutos");
        


        Gato gato = new Gato("Garfield", 5, 4000, 40, 4);
        gato.comer(7);
        gato.moverse(33, "metros");
        gato.dormir(2, "horas");

        
        Elefante elefante = new Elefante("Dubo", 20, 60000, 7000, 4);
        elefante.comer(3);
        elefante.moverse(15, "Km");
        elefante.dormir(1, "horas");

        Leao leao = new Leao("Mufasa", 23, 40000, 6000, 4);
        leao.comer(500);
        leao.moverse(1, "Ano-Luz");
        leao.dormir(48, "horas"); 

        
        Pombo pombo = new Pombo("orlando", 7, 400, 15, 2, 30);
        pombo.comer(5);
        pombo.moverse(450, "KM");
        pombo.dormir(3, "horas");

        
        Peixe peixe = new Peixe("nemo", 2, 300, 4);
        peixe.comer(12);
        peixe.moverse(500, "metros");
        peixe.dormir();



        
    }
}
