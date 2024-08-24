

public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, int idade, int peso, int altura, int quantidadeAsas, int envergaduraAsa){
        System.out.printf("%n**************************%n");
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa; 
        System.out.println("Nome..................:" + this.nome);
        System.out.println("Idade.................:" + this.idade);
        System.out.println("Tipo do animal........:" + this.tipoAnimal);
        System.out.println("Habitat Natural.......:" + this.habitatNatural);
        System.out.println("Quantidade de asas....:" + this.quantidadeAsas);
        System.out.println("Envergadura asa.......:" + this.envergaduraAsa);
        //info();
        //System.out.printf("Animal %b%n", this.nome);
    }

    public void comer(int massa){
        energia += massa;

        System.out.printf("O Pombo obteve %d de energia, agora sua energia total é  %d%n",massa, energia);
    };
    public void moverse(int distancia, String unidadeDeMedidaDistancia){
        posicao = distancia;
        System.out.printf("O Pombo voou %d %s de distancia%n", posicao, unidadeDeMedidaDistancia);
    };
    public void dormir(int duracao, String unidadeDeMedidaTempo){
        tempo = duracao;
        System.out.printf("O Pombo dormiu %d %s%n ",tempo,unidadeDeMedidaTempo);
    };

    
}
