

public class Elefante extends AnimalTerrestreAB {
    
    public Elefante(String nome, int idade, int peso, int altura, int quantidadePatas){
        System.out.printf("%n**************************%n");
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.quantidadePatas = quantidadePatas;
        System.out.println("Nome..................:" + this.nome);
        System.out.println("Idade.................:" + this.idade);
        System.out.println("Tipo do animal........:" + this.tipoAnimal);
        System.out.println("Habitat Natural.......:" + this.idade);
        System.out.println("Quantida de patas.....:" + this.quantidadePatas);
    }
    
    public void comer(int massa){
        energia += massa;

        System.out.printf("O Elefante obteve %d de energia, agora sua energia total é  %d%n",massa, energia);
    };
    public void moverse(int distancia, String unidadeDeMedidaDistancia){
        posicao = distancia;
        System.out.printf("O Elefante pecorreu %d %s de distancia%n", posicao, unidadeDeMedidaDistancia);
    };
    public void dormir(int duracao, String unidadeDeMedidaTempo){
        tempo = duracao;
        System.out.printf("O Elefante dormiu %d %s%n ",tempo,unidadeDeMedidaTempo);
    };

    


}
