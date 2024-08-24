
abstract class AnimalMarinhoAB extends AnimalAB {

        public int energia = 50;
        public int posicao = 0;
        public int tempo = 0;
        public Boolean vivo = true;
        public String nome = "";
        public final String tipoAnimal = "Animal Marinho";
        public int idade;
        public final String habitatNatural = "Aquatico";


        public AnimalMarinhoAB(){
  
        }
        
        
        public void comer(){
            System.out.println(energia);
        };
        public void moverse(){
            System.out.println(posicao);
        };
        public void dormir(){
            System.out.println(tempo);
        };
    
}
    

