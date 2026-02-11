public class Contato {
    private int id;
    private String nome;
    private String telefone;

    public Contato(int id, String nome, String telefone) {

        if (telefone == null || telefone.length() < 11) {
            throw new IllegalArgumentException("Telefone inválido");
        }

        if (id < 0 ) {
            throw new IllegalArgumentException("ID inválido");  
        }

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
