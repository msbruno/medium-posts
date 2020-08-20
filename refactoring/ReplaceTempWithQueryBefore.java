
class Calculadora() {
    
    public static void main(String[] args){
      System.out.println(new Calculadora(10, 100d));
    }
    
    double calculaTotal(int quantidade, double preco) {
      double precoBase = quantidade * preco;
      
      if (basePrice > 1000) {
        return basePrice * 0.95;
      }
      else {
        return basePrice * 0.98;
      }
  }
}
