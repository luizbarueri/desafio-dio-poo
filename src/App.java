import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Curso curso = new Curso();
        //set Curso
        curso.setTitulo("Java");
        curso.setDescricao("Curso de java");
        curso.setCargaHorarria(340);
        //get Curso
        System.out.println("Titulo: " + curso.getTitulo());
        System.out.println("Descrição: " + curso.getDescricao());
        System.out.println("Caraga Horária: " + curso.getCargaHorarria());
        System.out.println("==============================================");
        //set Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setData("26/04/2023");
        //get mentoria
        System.out.println("Titulo:"  + mentoria.getTitulo());
        System.out.println("Descrição: " + mentoria.getDescricao());
        System.out.println("Data: " + mentoria.getData());
        System.out.println("=======================================");
        System.out.println("Pontos de XP: " + mentoria.calcularXp());
        //Inicializa conteudo Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developr");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        //Inicializar os Dev
        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz: " + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        System.out.println("Conteúdos Concluídos Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());
        System.out.println("====================================================================");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluídos Luiz: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
