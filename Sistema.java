import java.lang.Math;
import java.util.regex.*;


public class Sistema implements FuncionalidadesIF 
{


    public boolean validarUsuario(String nome, String senha, String email){

    if(nome == "" || nome == null){
      System.out.println("Nome inválido!");
      return false;
    }
      
    if(senha == "" || senha == null){
      System.out.println("Senha inválida!");
      return false;
    }   
      
    String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
      
    if(matcher.matches())
      return true;
    
      
    System.out.println("Email inválido!");
    return false;

  }
  public Usuario cadastraUsuario(String nome, String email, String senha)
  {

    Usuario usuario = new Usuario(nome,email,senha);
    return usuario;
    
  }
  
  public Raizes calculaFuncaoSegundoGrau(double a, double b, double c){
      if (a == 0)
        return null;
    
      double delta = b*b - 4*a*c;
      double raizQuadradaDelta = Math.sqrt(delta);

      Raizes resultado = new Raizes();

      
    
      double x1 = (-b+raizQuadradaDelta) / (2*a);
      double x2 = (-b-raizQuadradaDelta) / (2*a);
      resultado.setX1(x1);
      resultado.setX2(x2);
      return resultado;
      }
  
  public boolean ehTriangulo(double angulo1, double angulo2, double angulo3){
    if(angulo1 > 0 && angulo2 > 0 && angulo3 > 0 && angulo1 < 180 && angulo2 < 180 && angulo3 < 180 && angulo1 + angulo2 + angulo3 == 180)
      return true;
    return false;
  }
  public boolean ehTrianguloRetangulo(double lado1, double lado2, double lado3)
  {
    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
      return false;
    if(lado1 > lado2 && lado1 > lado3)
    {
      if(Math.pow(lado1,2) == (Math.pow(lado2,2) + Math.pow(lado3,2))) return true;
    }
    else if(lado2 > lado1 && lado2 > lado3)
    {if(Math.pow(lado2,2) == (Math.pow(lado1,2) + Math.pow(lado3,2))) return true;}
    else if(lado3 > lado1 && lado3 > lado2)
    {if(Math.pow(lado3,2) == (Math.pow(lado2,2) + Math.pow(lado1,2))) return true;}
    return false;
  }
  public boolean ehRetangulo(double angulo1, double angulo2, double angulo3, double angulo4)
  {
    int ret = 90;
    if(angulo1 == ret && angulo2 == ret && angulo3 == ret && angulo4 == ret) return true;
    return false;
  }
  public String classificaTriangulo(double angulo1, double angulo2, double angulo3) {
    
    if(ehTriangulo(angulo1,angulo2,angulo3))
    {
      
      if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90)
        return "Triângulo Acutângulo";
      
      int a = 10;
      
      if (angulo1 > angulo2 && angulo1 > angulo3)
        a = 0;
      
      if (angulo2 > angulo1 && angulo2 > angulo3)
        a = 1;
      
      if (angulo3 > angulo1 && angulo3 > angulo2)
        a = 2;
      
      if (a == 0)
      {
        if(angulo1 == 90)
          return "Triângulo Retângulo";
        if(angulo1 > 90)
          return "Triângulo Obtusângulo";
      }
      if (a == 1)
      {
        if(angulo2 == 90)
          return "Triângulo Retângulo";
        if(angulo2 > 90)
          return "Triângulo Obtusângulo"; 
      }
      if (a == 2)
      {
        if(angulo3 == 90)
          return "Triângulo Retângulo";
        if(angulo3 > 90)
          return "Triângulo Obtusângulo";   
      }
      else return "Triângulo Equilátero";
    }
    return "Não é Triângulo";
  }

  
  public double perimetroRetangulo(double lado1, double lado2, double lado3, double lado4)
  {return lado1 + lado2 + lado3 + lado4;}
  
  public double calculadora(String expressao){
    String[] conta = expressao.split(" ");
    try{
    double a = Double.parseDouble(conta[0]);
    double b = Double.parseDouble(conta[2]);
    if (conta[1].equals("/") && b == 0)
    {
      System.out.println("Não é possível dividir por 0");
      return 0;
    }
      
    if (conta[1].equals("+")) {return a + b;}
      
    if (conta[1].equals("-")) {return a - b;}

    if (conta[1].equals("/")) {return a / b;}
      
    if (conta[1].equals("*")) {return a * b;}
      
    if (conta[1].equals("**")) {return Math.pow(a, b);}
    }catch(Exception e){
	    	    System.out.println("Expressão Inválida!");
    }
    return 0;

}  
  
  public double areaRetangulo(double lado1, double lado2){

    double area = lado1 * lado2;
    
    return area;
  }
  
  public double areaCirculo(double raio){
    
    double area = Math.PI * Math.pow(raio, 2);
    
    return area;
  }
  
  public double perimetroCirculo(double raio){
    double perimetro = 2*Math.PI * raio;
    
    return perimetro;
  }
  
  
  public double distanciaEntreDoisPontos(double x1, double y1, double x2, double y2){
    
  double distancia = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
  
  return distancia;
  }

  
}