public class Produtos {

    //ATRIBUTOS

    private int codigo;
    private String nome;
    private int qtd;


    //CONSTRUTOR

    public Produtos(String nome, int codigo, int qtd) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtd = qtd;
    }

    //METODO PARA ADICIONAR QUANTIDADE AO PRODUTO


    public void AddQuantidade(int codigo, int quantidade) {
        if (this.codigo == codigo) {  // compara o código
            this.qtd += quantidade;   // soma só no produto certo
            System.out.println("Quantidade adicionada: " + quantidade );
            System.out.println("Novo estoque: " + this.qtd);
        } else {
            System.out.println("Produto não encontrado");
        }
    }


    //METODO PARA EXIBIR INFORMAÇÃO


    public void mostrarinfo() {
        System.out.println("Qunatidade: " + qtd);
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);

    }


    public static void main(String[] args) {
        Produtos p1 = new Produtos("Notebook", 101, 5);

        System.out.println("====PROTUDTO_1====");
        System.out.println();//pulalinha
        p1.mostrarinfo();
        System.out.println(); //pula linha
        p1.AddQuantidade(101, 5);
        System.out.println();//pula linha
        p1.mostrarinfo();

        System.out.println(); //pula linha


        Produtos p2 =new Produtos("Mouse",203,7);
        System.out.println("====PROTUDO_2====");
        System.out.println();//pula linha
        p2.mostrarinfo();
        System.out.println();//pulinha
        p2.AddQuantidade(202, 3);
        System.out.println();//pula linha
        p2.mostrarinfo();
    }




}
