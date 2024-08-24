
abstract class AnimalVoadorAB extends AnimalAB {

    public int energia = 50;
    public int posicao = 0;
    public int tempo = 0;
    public Boolean vivo = true;
    public String nome = "";
    public final String tipoAnimal = "Animal Aéreo";
    public int idade;
    public final String habitatNatural = "Terrestre";
    public int quantidadeAsas;
    public int envergaduraAsa;

    public AnimalVoadorAB(){

  
        //System.out.printf("Animal %b%n", this.nome);
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