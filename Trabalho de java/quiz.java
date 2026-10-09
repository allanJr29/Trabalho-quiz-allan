import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Allan Guilherme");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");

        List<Questao> questoes = new ArrayList<>();
        int acertos = 0;

        questoes.add(new Questao("1) Em qual cidade foi fundado o Vila Nova Futebol Clube?",
                "Anápolis", "Goiânia", "Aparecida de Goiânia", "Rio Verde", 'B'));

        questoes.add(new Questao("2) Em que ano o Vila Nova Futebol Clube foi fundado?",
                "1933", "1943", "1945", "1929", 'A'));

        questoes.add(new Questao("3) Qual é o apelido mais conhecido do Vila Nova?",
                "Dragão", "Esmeraldino", "Tigrão", "Galo", 'C'));

        questoes.add(new Questao("4) Quais são as cores tradicionais do Vila Nova?",
                "Azul e branco", "Vermelho e branco", "Verde e branco", "Preto e vermelho", 'B'));

        questoes.add(new Questao("5) Qual é o nome completo do estádio conhecido como OBA?",
                "Estádio Serra Dourada", "Estádio Olímpico",
                "Estádio Antônio Accioly", "Estádio Onésio Brasileiro Alvarenga", 'D'));

        questoes.add(new Questao("6) Qual é um dos principais rivais do Vila Nova?",
                "Goiás", "Paysandu", "Remo", "Cuiabá", 'A'));

        questoes.add(new Questao("7) Qual campeonato nacional o Vila Nova conquistou em 1996?",
                "Série A", "Copa do Brasil", "Série C", "Série B", 'C'));

        questoes.add(new Questao("8) Qual é o mascote do Vila Nova?",
                "Leão", "Tigre", "Gavião", "Lobo", 'B'));

        questoes.add(new Questao("9) Em qual estado brasileiro está localizado o Vila Nova?",
                "Mato Grosso", "Minas Gerais", "Tocantins", "Goiás", 'D'));

        questoes.add(new Questao("10) Qual é a principal cor do uniforme tradicional do Vila Nova?",
                "Vermelho", "Azul", "Verde", "Amarelo", 'A'));

        questoes.add(new Questao("11) Qual destes clubes também é de Goiás?",
                "Paysandu", "Remo", "Goiás", "Cuiabá", 'C'));

        questoes.add(new Questao("12) Qual é o nome oficial do clube?",
                "Vila Nova Atlético Clube", "Vila Nova Futebol Clube",
                "Vila Nova Esporte Clube", "Associação Esportiva Vila Nova", 'B'));

        questoes.add(new Questao("13) Qual é a sigla popular do estádio do Vila Nova?",
                "BSA", "OSA", "OVA", "OBA", 'D'));

        questoes.add(new Questao("14) Em qual região do Brasil fica Goiânia?",
                "Centro-Oeste", "Sudeste", "Sul", "Nordeste", 'A'));

        questoes.add(new Questao("15) Como é conhecido o torcedor apaixonado pelo Vila Nova?",
                "Peixeiro", "Galo doido", "Colorado", "Tricolor paulista", 'C'));

        for (Questao questao : questoes) {

            questao.exibirQuestao();

            System.out.println("Qual a sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        scanner.close();

        System.out.println("Obrigado por participar do quiz");
    }
}