package example;

import example.AntMainLibClass;

public class AntMainClass {
  public static void main(String[] args) {
    AntMainClass ma = new AntMainClass();
    ma.firstMethod();

    System.out.println("Hello, World! from ikeda yuki");
  }

  public void firstMethod() {
    int a = 1;
    int b = 2;
    AntMainLibClass lib = new AntMainLibClass();

    int ret = lib.plusCluc(a, b);

    System.out.println("calc: " + ret);
  }
}