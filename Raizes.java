public class Raizes{
  private double x1, x2;

  public Raizes(){}
  
  public double getX1() {
    return x1;
  }

  public void setX1(double x1) {
    this.x1 = x1;
  }

  public double getX2() {
    return x2;
  }

  public void setX2(double x2) {
    this.x2 = x2;
  }

  public void exibirDados(){
    System.out.format("X1: %.2f, X2: %.2f\n", x1, x2);
  }
}