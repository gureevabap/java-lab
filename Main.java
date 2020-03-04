class Main {
  public static void main(String[] args) {
    int i;
    for (i = 1; i < 237; i++) {
      if (i%2==0) {
        System.out.println(i);
      } 
     if (i%2!=0) {
        System.out.println("нечёт");
      }
      
    }
    Student s = new Student();
    s.setName("Danielle");
    s.setSurname("Black");
    s.setPatronymic("Jr.");
    s.printFullName();
    
    Point p = new Point(4, 2);

    p.scale();
  }
}
