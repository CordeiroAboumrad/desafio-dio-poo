package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso de Java.");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Banco de Dados");
        curso2.setDescricao("Descrição do curso de Banco de Dados.");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria Java.");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

//        Conteudo conteudo = new Curso();
//        Conteudo conteudo2 = new Mentoria();

        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Java Developer");
        bc.setDescricao("Descrição Java Developer");
        bc.getConteudos().add(curso1);
        bc.getConteudos().add(curso2);
        bc.getConteudos().add(mentoria1);

        Dev jean = new Dev();
        jean.setNome("Jean");
        jean.inscreverBootcamp(bc);
        jean.progredir();
        System.out.println(jean.getNome());
        System.out.println("Conteúdos Inscritos: " + jean.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + jean.getConteudosConcluidos());
        System.out.println("Total de XP: " + jean.calcularTotalXp());

        System.out.println("-------------------------------------------------------------");
        Dev camila = new Dev();
        camila.setNome("Camila");
        System.out.println(camila.getNome());
        System.out.println("Conteúdos Inscritos: " + camila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + camila.getConteudosConcluidos());
        System.out.println("Total de XP: " + camila.calcularTotalXp());




    }
}
