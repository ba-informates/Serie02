class FauxCalcul {
  public static void main(String[] args) {
      int a,b;
      a = 1024;
      b = a*a*a-1;
      System.out.println(b);
      System.out.println(a);
      a = 2*b;
      b = a+1;
      System.out.println(b);
      System.out.println(a);
      a = b+1;
      b = 4*b;
      System.out.println(b);
      System.out.println(a);
      a = 2*a;
      b = b/a;
      System.out.println(b);
      System.out.println(a);
  }
}
