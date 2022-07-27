import br.com.poo.desafio.dominio.Bootcamp;
import br.com.poo.desafio.dominio.Curso;
import br.com.poo.desafio.dominio.Dev;
import br.com.poo.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascrip");
        curso2.setCargahoraria(4);

        Mentoria mentoria1 =  new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIsac = new Dev();
        devIsac.setNome("Isac Lima");
        devIsac.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Isac" + devIsac.getConteudosInscritos());
        devIsac.progredir();
        System.out.println("--------------------------");
        System.out.println("Conteúdos inscritos Isac" + devIsac.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Isac" + devIsac.getConteudosConcluidos());
        System.out.println("XP:" + devIsac.calcularTotalXp());
        System.out.println("--------------------------");
        System.out.println("--------------------------");

        Dev devErick = new Dev();
        devErick.setNome("Erick Lima");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Erick" + devErick.getConteudosInscritos());
        devErick.progredir();
        devErick.progredir();
        System.out.println("--------------------------");
        System.out.println("Conteúdos inscritos Erick" + devErick.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Erick" + devIsac.getConteudosConcluidos());
        System.out.println("XP:" + devErick.calcularTotalXp());
    }
}
