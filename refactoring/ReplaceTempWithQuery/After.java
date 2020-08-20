class Calculator() {

  int quantity;
  double itemPrice;

  public static void main(String[] args){
    System.out.println(new Calculator(10, 100d));
  }

  Calculadora(int quantity, double itemPrice){
    this.quantity = quantity;
    this.itemPrice = itemPrice;
  }

  double calculaTotal() {
    if (basePrice() > 1000) {
      return basePrice() * 0.95;
    }
    else {
      return basePrice() * 0.98;
    }
  }
  
  double basePrice(){
    return quantity * itemPrice;
  }
}
