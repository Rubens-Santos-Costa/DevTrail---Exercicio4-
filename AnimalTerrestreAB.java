
abstract class AnimalTerrestreAB extends AnimalAB {

        public int energia = 50;
        public int posicao = 0;
        public int tempo = 0;
        public Boolean vivo = true;
        public String nome = "";
        public final String tipoAnimal = "Animal Terrestre";
        public int idade;
        public final String habitatNatural = "Terrestre";
        public int quantidadePatas;


        public AnimalTerrestreAB(){

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