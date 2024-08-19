import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia em que você nasceu: ");
        int dias = sc.nextInt();
        System.out.println("Digite o mês em que você nasceu, com a primeira letra maiúscula: ");
        String mes = sc.next();
        if (dias <= 21 && dias >= 1 && mes.equals("Janeiro") || dias > 21 && dias <= 31 && mes.equals("Dezembro")){
            System.out.println("Seu signo é: Capricórnio.\nMarcado pela seriedade e pela responsabilidade. Buscam ser respeitados pelo que fizeram ou construíram.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Fevereiro") || dias > 21 && dias <= 31 && mes.equals("Janeiro")){
            System.out.println("Seu signo é: Aquário.\nCaracterizado pela originalidade, pela independência, pela criatividade, pela sociabilidade e pela racionalidade.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Março") || dias > 21 &&  dias <= 29 && mes.equals("Fevereiro")){
            System.out.println("Seu signo é: Peixes.\nSuas principais características são a empatia, a receptividade e o altruísmo. Tem muita capacidade de se adaptar a diversos ambientes e pessoas, bem como de se sensibilizar com a dor do outro");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Abril") || dias > 21 && dias <= 31 && mes.equals("Março")){
            System.out.println("Seu signo é: Áries.\nTem como palavras-chave empreendedorismo, dinamismo, competitividade, instinto, rapidez e agilidade.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Maio") || dias > 21 && dias <= 30 && mes.equals("Abril")){
            System.out.println("Seu signo é: Touro.\nSimboliza a praticidade, o pensamento realista, a materialidade e a persistência.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Junho") || dias > 21 && dias <= 31 && mes.equals("Maio")){
            System.out.println("Seu signo é: Gêmeos.\nSimboliza a curiosidade e a comunicação. É marcado pela grande variedade de interesses, pela sociabilidade, pela lógica, pela adaptabilidade e pela versatilidade.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Julho") || dias > 21 && dias <= 30 && mes.equals("Junho")){
            System.out.println("Seu signo é: Câncer.\nÉ marcado pela habilidade de criar conexões e laços emocionais, pela forte intuição, pela empatia, pela boa memória e pela ligação com o passado.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Agosto") || dias > 21 && dias <= 31 && mes.equals("Julho")){
            System.out.println("Seu signo é: Leão.\nÉ um signo marcado pelo entusiasmo, pelo otimismo e pela grande generosidade.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Setembro") || dias > 21 && dias <= 31 && mes.equals("Agosto")){
            System.out.println("Seu signo é: Virgem.\nSua praticidade, eficiência e capacidade de notar os minuciosos detalhes são notáveis.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Outubro") || dias > 21 && dias <= 30 && mes.equals("Setembro")){
            System.out.println("Seu signo é: Libra.\nVoltado para a sociabilidade, as parcerias e o cultivo de diversas amizades, contatos e grupos.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Novembro") || dias > 21 && dias <= 31 && mes.equals("Outubro")){
            System.out.println("Seu signo é: Escorpião.\nMarcado pela intensidade e profundidade das emoções. Também é associado à instrospecção, à capacidade de observaçõa, à forte intuição e sensibilidade.");
        }
        else if (dias <= 21 && dias >= 1 && mes.equals("Dezembro") || dias > 21 && dias <= 30 && mes.equals("Novembro")){
            System.out.println("Seu signo é: Sagitário.\nSe motiva pela busca de conhecimento e sabedoria, além de adorar descobrir coisas e experiências novas.");
        } else{
            System.out.println("Opa..acho que ocorreu um erro");
        }
        }

        }




