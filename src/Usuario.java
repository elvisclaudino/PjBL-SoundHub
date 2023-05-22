public abstract class Usuario implements Add {
    private String nome;
    private int idade;
    private String genero;
    private String nacionalidade;

    public Usuario(String nome, int idade, String genero, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String getNome() {
        return nome;
    }
}