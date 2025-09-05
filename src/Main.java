import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       List<Contato> agenda = new ArrayList<Contato>();

     agenda.add(new Contato("Pessoa 1"));
        agenda.add(new Contato("Pessoa 2"));
        agenda.add(new Contato("Pessoa 3"));

        System.out.println(agenda);


       /*Contato aux = new Contato();
       aux.setNome("Contato 1");
       aux.setTelefone("Telefone 1");
       agenda.add(aux);


        aux.setNome("Contato 2");
        aux.setTelefone("Telefone 2");
        agenda.add(aux);*/





    }
    }
 /*List<String> listinha = new ArrayList<String>();
        listinha.add("Luffy");
        listinha.add("Zoro");
        listinha.add("Nami");
        listinha.add("Sanji");
        listinha.add("Nome Novo");


        System.out.println(listinha);
        System.out.println(listinha.size());
        System.out.println(listinha.get(0));
        listinha.remove("Nome Novo");
        System.out.println(listinha);
        System.out.println(listinha.size());


        for ( String nome: listinha){
            System.out.println(nome);
        }*/