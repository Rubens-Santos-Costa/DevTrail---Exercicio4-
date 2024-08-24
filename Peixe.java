
public class Peixe extends AnimalMarinhoAB {
    
    public Peixe(String nome, int idade, int peso, int altura){
        System.out.printf("%n**************************%n");
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        System.out.println("Nome...............:" + this.nome);
        System.out.println("Idade..............:" + this.idade);
        System.out.println("Tipo do animal.....:" + this.tipoAnimal);
        System.out.println("Habitat Natural....:" + this.habitatNatural);

    }


    public void comer(int massa){
        energia += massa;

        System.out.printf("O Peixe obteve %d de energia, agora sua energia total é  %d%n",massa, energia);
    };
    public void moverse(int distancia, String unidadeDeMedidaDistancia){
        posicao = distancia;
        System.out.printf("O Peixe nadou %d %s de distancia%n", posicao, unidadeDeMedidaDistancia);
    };
    public void dormir(){
        System.out.println("Peixe nao dormi, so repousa");
    };

}
