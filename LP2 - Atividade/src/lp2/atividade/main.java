//FEITO POR VANESSA SILVA, ESTUDANTE DE ANALISE DE SISTEMA, NÃO PEGUEI A MATÉRIA NO SEMESTRE 2020.1, PORÉM APROVEITEI E FIZ ESSA ATIVIDADE AVALIATIVA
// Pode usa-lo caso precise para obter nota.

package lp2.atividade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class main extends dados {

    public static void main(String[] args) {

        System.out.println("==== SISTEMA DE VIAGENS ====\n");
        System.out.println("==== QUEM REGISTROU A PASSAGEM ====");
        //Arraylist de funcionários
        ArrayList<funcionario> f = new ArrayList();
        //cadastro do funcionário
        funcionario func = new funcionario("Matricula:1", "CPF: 858.745.856.50", "Funcionário: João da Silva", "Data de Nascimento: 31-07-1996", "Pis:985.87585.98-00", "jao123", "123");
        f.add(func);
        //chamando a classe funcionário em seguida adicionando e mostrando na tela seus dados cadastrados 
        List<funcionario> funcionario = new ArrayList<>();

        ArrayList<motorista> m = new ArrayList();

        //Cadastro de motoristas, segue a mestra estrutura do cadastro do funcionario, porém com novos atributos.
        motorista mo = new motorista("Matricula:1", "CPF: 857.045.356.10", "Motorista: Marcos dos Santos da Silva", "Nascimento: 20-03-1975", "Pis:202.54870.28-30", "Marcosmotorista", "camila@filhinha", "175885885587", "Salvador/Bahia  x Vitória da Conquista ");
        m.add(mo);
        List<motorista> moto = new ArrayList<>();

        cliente[] Array = new cliente[3];
        ArrayList<cliente> c = new ArrayList();
        Array[0] = new cliente("Matricula:1", "CPF:212.745.142-00", "RG:085.857.857-50", "Cliente: Rebeca Santos da Silva ", "Endereco: Rua das Dores 123 ", "Local de Origem: Salvador", "Local de Destino: São Paulo", 354.50);
        Array[1] = new cliente("Matricula:2", "CPF:252.104.222-15", "RG:200.102.322-0550", "Cliente: Juliao de Freitas dias  ", "Endereco: Rua da São bento de Irece ", "Local de Origem: Irece", "Local de Destino: São Paulo", 542.50);
        Array[2] = new cliente("Matricula:3", "CPF:325.203.888-07", "RG:251.666.154-16", "Cliente: Mateus Santos de Abraão ", "Endereco: Caminho de areia", "Local de Origem: Salvador", "Local de Destino: Rio de Janeiro ", 578.5);

        List<cliente> cli = new ArrayList<>();

        ArrayList<van> v = new ArrayList();
        van transporte = new van("chassi: 9 B2 H15D2D 8 V306585", "R02B352");
        v.add(transporte);

        ///
        try {

            for (funcionario i : f) {
                System.out.println(i.getMatricula());
                System.out.println(i.getNome());
                //Não solicitei todos os getters pois só preciso de algumas informaçoes desse funcionário log

            }
            for (van i : v) {
                System.out.println("");
                System.out.println(" INFORMAÇÃO DA VIAGEM ");
                System.out.println("==== VEÍCULO ====");
                System.out.println("" + i.getChassi());
                System.out.println("" + i.getPlaca());
            }
            System.out.println("==== DADOS DO MOTORISTA ====");
            for (motorista i : m) {
                System.out.println("" + i.getNome());
                System.out.println("Rota:" + i.getRota());
            }
            System.out.println("==== CLIENTES E DESITNOS ====");
            for (int i = 0; i < Array.length; i++) {
                System.out.println(Array[i].matricula);
                System.out.println(Array[i].nome);
                System.out.println(Array[i].origem);
                System.out.println(Array[i].destino);
                System.out.println(Array[i].valorservice);
            }

        } catch (Exception ops) {
            System.out.println("Ops, Gerou um erro: " + ops);
        }

    }

    public main(String cpf, String nome, int DatadeNascimento, int pis, String usuario, String senha) {
        super(cpf, nome, DatadeNascimento, pis, usuario, senha);
    }

}
