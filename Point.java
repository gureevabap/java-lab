class Point {
    int x;
    int y;
    
    Point() {
     this(0, 0);
    }
 
    Point(int x, int y) {
     this.x = x;
     this.y = y;
    }

    void printPoint() {
      System.out.println("(" + x + "," + y + ")");
    }
 
    Point center(Point other) {
      return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    void scale(){
      this.x = x+((0-x)/2);
      this.y = y+((0-y)/2);
      System.out.println("(" + x + "," + y + ")");
    }
}