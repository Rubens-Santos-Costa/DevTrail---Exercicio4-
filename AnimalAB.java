
abstract class AnimalAB implements AnimalIF {
    public int energia = 50;
    public int posicao = 0;
    public int tempo = 0;
    public Boolean vivo = false;
    public int peso;
    public int altura;


    public AnimalAB(){
        this.vivo = true;
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
