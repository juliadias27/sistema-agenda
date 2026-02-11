import java.util.Scanner;

public class SistemaAgenda {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {

            System.out.println("\n=== AGENDA ===");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();


                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();


                   try {
                        Contato contato = new Contato(id, nome, telefone);
                        agenda.adicionarContato(contato);
                        System.out.println("Contato adicionado com sucesso.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao adicionar contato: " + e.getMessage());
                    }
                    break;
                
                case 2:
                    System.out.println("\n--- Lista de Contatos ---");
                    for (Contato c : agenda.listarContatos()) {
                        System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Telefone: " + c.getTelefone());
                    }
                    break;
                
                case 3:
                    System.out.print("Nome do contato a buscar: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: ID: " + contatoEncontrado.getId() + ", Nome: " + contatoEncontrado.getNome() + ", Telefone: " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                
                case 4:
                    System.out.print("ID do contato a remover: ");
                    int idRemover = scanner.nextInt();
                    boolean removido = agenda.removerContato(idRemover);
                    if (removido) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } while (opcao != 0);
    }
}
