import java.util.*;  

public class Main {
  public static void main(String[] args) {
    Sistema novoSistema = new Sistema();
    Scanner scan = new Scanner(System.in);
    Scanner expressao = new Scanner(System.in);
    
    System.out.println("____________________________\n");
    System.out.println("ESTE É O MENU DO SEU SISTEMA");
    System.out.println("PARA INICIAR CRIE UM USUÁRIO");
    while(true){
      System.out.print("Por favor, digite seu nome: ");
      String nome = scan.nextLine();  
      System.out.print("Por favor, digite uma senha: ");  
      String senha = scan.nextLine();
      System.out.print("Por ultimo, digite um email que você usa: ");
      String email = scan.nextLine();
    
      if(novoSistema.validarUsuario(nome, senha, email)){
        novoSistema.cadastraUsuario(nome,senha,email);
        break;
      }
    }
    
    System.out.println("Agora você tem acesso a todas as funcionalidades do sistema!");
    System.out.println("Vou te mostrar as opções e você decide o que quer fazer");
    System.out.println("1 - Verificar se é um triangulo (ângulos)");
    System.out.println("2 - Verificar se é um triangulo retângulo (lados)");
    System.out.println("3 - Verificar se é um retângulo (ângulos)");
    System.out.println("4 - Classificar um triângulo (ângulos)");
    System.out.println("5 - Calcular o perímetro de um retângulo (lados)");
    System.out.println("6 - Calcular a área de um retângulo (lados)");
    System.out.println("7 - Calcular a área de um circulo (raio)");
    System.out.println("8 - Calcular o perímetro de um circulo (raio)");
    System.out.println("9 - Calcular a distância entre dois pontos (coordenadas x e y)");
    System.out.println("10 - Utilizar a calculadora");
    System.out.println("11 - Calcular Raizes");
    System.out.println("____________________________");
    while(true)
    {
      System.out.print("\nDigite o número da operação que você deseja realizar(Digite -1 para sair): ");
      
      int opcao = scan.nextInt();
      if (opcao == -1) break;
      switch(opcao)
      {
        case 1:
        System.out.println("Você escolheu a opção 1!");
        System.out.print("Agora escreva os ângulos separados por espaço (3): ");
        if (novoSistema.ehTriangulo(scan.nextInt(), scan.nextInt(), scan.nextInt())) System.out.println("É triângulo");
        else System.out.println("Não é triângulo");
        break;
        
        
        case 2:
        System.out.println("Você escolheu a opção 2!");
        System.out.print("Agora escreva os lados separados por espaço (3): ");
        if (novoSistema.ehTrianguloRetangulo(scan.nextDouble(), scan.nextDouble(), scan.nextDouble())) System.out.println("É triângulo retângulo");
        else System.out.println("Não é triângulo retângulo");
        break;
        
        
        case 3:
        System.out.println("Você escolheu a opção 3!");
        System.out.print("Agora escreva os ângulos separados por espaço (4): ");
        if(novoSistema.ehRetangulo(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt())) System.out.println("É retângulo");
        else System.out.println("Não é retângulo");
        break;
        case 4:
        System.out.println("Você escolheu a opção 4!");
        System.out.print("Agora escreva os ângulos separados por espaço (3): ");
        System.out.println(novoSistema.classificaTriangulo(scan.nextInt(),scan.nextInt(),scan.nextInt()));
        break;
        
        
        case 5:
        System.out.println("Você escolheu a opção 5!");
        System.out.print("Agora escreva os lados separados por espaço (4): ");
        System.out.println("O perímetro é: " + novoSistema.perimetroRetangulo(scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble()));
        break;
        
        
        case 6:
        System.out.println("Você escolheu a opção 6!");
        System.out.print("Agora escreva os lados separados por espaço (2): ");
        System.out.println("A área é: " + novoSistema.areaRetangulo(scan.nextDouble(),scan.nextDouble()));
        break;
        
        
        case 7:
        System.out.println("Você escolheu a opção 7!");
        System.out.print("Agora escreva o raio: ");
        System.out.println("A área é: " + novoSistema.areaCirculo(scan.nextDouble()));
        break;
        
        
        case 8:
        System.out.println("Você escolheu a opção 8!");
        System.out.print("Agora escreva o raio: ");
        System.out.println("O perímetro é: " + novoSistema.perimetroCirculo(scan.nextDouble()));
        break;
        
        
        case 9:
        System.out.println("Você escolheu a opção 9!");
        System.out.print("Agora escreva as coordenadas x e y de ambos os pontos separadas por espaço: ");
        System.out.println("A distância entre esses dois pontos é: " + novoSistema.distanciaEntreDoisPontos(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        break;
        
        
        case 10:
        System.out.println("Você escolheu a opção 10!");
        System.out.println("Agora escreva a operação que você deseja calcular: ");
        System.out.println("O resultado da sua expressão foi: " + novoSistema.calculadora(expressao.nextLine()));
        break;
        
        case 11:
          System.out.println("Você escolheu a opção 10!");
          System.out.print("Agora escreva a, b e c ax^2 + bx + c: ");
        Raizes teste = novoSistema.calculaFuncaoSegundoGrau(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        if (teste == null)
          System.out.println("Você digitou a = 0");
        else teste.exibirDados();
        break;
        
        default:
        System.out.println("Operação inválida, tente novamente");
        break;
      }
    }
  }
}
