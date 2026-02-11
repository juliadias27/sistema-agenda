import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {

        for (Contato c : contatos) {
            if (c.getId() == contato.getId()) {
                throw new IllegalArgumentException("Contato com ID já existente");
            }

            if (c.getTelefone().equals(contato.getTelefone())) {
                throw new IllegalArgumentException("Contato com telefone já existente");     
            }
        }
        
        contatos.add(contato);
    }

    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public boolean removerContato(int id) {
        return contatos.removeIf(c -> c.getId() == id);
    } 
}


