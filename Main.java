

class Main {
  public static void main(String[] args) 
  {
    PranavMethod();
    add1();  
    add2();
    remove1();
    McKeenExample();
    example();
    empty();
    removeTillEmpty();
  }
  public static void empty()
  {
    HeapPriorityQueue heap = new HeapPriorityQueue(1);
    heap.add(1);
    heap.add(3);
  }
  public static void example()
  {
    HeapPriorityQueue woo= new HeapPriorityQueue(16);
    woo.add(18);
    woo.add(16);
    woo.add(17);
    woo.add(5);
    woo.add(9);
    woo.add(8);
    woo.add(9);
    woo.add(3);
    woo.add(1);
    woo.add(7);
    woo.add(9);
    woo.add(2);
    woo.add(2);
    woo.add(3);
    woo.add(11);
    System.out.println(woo.toString());
    woo.removeMax();
    System.out.println(woo.toString());
  }
  public static void McKeenExample(){
    HeapPriorityQueue heap = new HeapPriorityQueue(19);
    heap.add("09");
    heap.add("03");
    heap.add("01");
    heap.add("07");
    heap.add("06");
    heap.add("02");
    heap.add("07");
    heap.add("03");
    heap.add("18");
    heap.add("17");
    heap.add("10");
    heap.add("15");
    heap.add("09");
    heap.add("08");
    System.out.println(heap);
  }
  public static void add1()
  {
    System.out.println("Add1 [Numbers]");
    HeapPriorityQueue heap = new HeapPriorityQueue(6);
    heap.add(new Integer(9));
    System.out.println(heap);
    heap.add(new Integer(6));
    System.out.println(heap);
    heap.add(new Integer(7));
    System.out.println(heap);
    heap.add(new Integer(10));
    System.out.println(heap);
    heap.add(new Integer(6));
    System.out.println(heap);

    System.out.println("Is the heap empty? " + heap.isEmpty());
    System.out.println("What's the max? " + heap.peekMax());
    System.out.println("Is it full? " + heap.isFull());
    System.out.println("What's the count? " + heap.getCount());
  }
  public static void add2()
  {
    System.out.println("Add2 [Letters]");
    HeapPriorityQueue heap = new HeapPriorityQueue(6);
    heap.add("A");
    System.out.println(heap);
    heap.add("B");
    System.out.println(heap);
    heap.add("C");
    System.out.println(heap);
    heap.add("D");
    System.out.println(heap);
    heap.add("E");
    System.out.println(heap);
    System.out.println("Is the heap empty? " + heap.isEmpty());
    System.out.println("What's the max? " + heap.peekMax());
    System.out.println("Is it full? " + heap.isFull());
    System.out.println("What's the count? " + heap.getCount());
  }
  public static void remove1()
  {
    System.out.println("Remove1 [Numbers]");
    HeapPriorityQueue heap = new HeapPriorityQueue(6);
    heap.add(new Integer(10));
    System.out.println(heap);
    heap.add(new Integer(7));
    System.out.println(heap);
    heap.add(new Integer(6));
    System.out.println(heap);
    heap.add(new Integer(11));
    System.out.println(heap);
    heap.add(new Integer(3));
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    System.out.println(heap);
    System.out.println("Is the heap empty? " + heap.isEmpty());
    System.out.println("What's the max? " + heap.peekMax());
    System.out.println("Is it full? " + heap.isFull());
    System.out.println("What's the count? " + heap.getCount());
  }
  public static void PranavMethod()
  {
    KeyboardReader reader = new KeyboardReader();
    HeapPriorityQueue q = new HeapPriorityQueue(15);
    q.add("a");
    q.add("b");
    q.add("c");
    q.add("d");
    q.add("d");
    q.add("d");
    System.out.println(q.toString());
    q.removeMax();
    System.out.println(q.toString());
    q.add("w");
    System.out.println(q.toString());
    while(!q.isEmpty()){
      System.out.println(q.removeMax()+ " ");
    }
    HeapPriorityQueue q1 = new HeapPriorityQueue(3);
    q1.add(3);
    q1.add(10);
    q1.add(-69);
    System.out.println(q1.isEmpty());
    System.out.println(q1.toString());
    while(!q1.isEmpty()){
      System.out.println(q1.removeMax()+ " ");
    }
    System.out.println(q1.isEmpty());
    HeapPriorityQueue a = new HeapPriorityQueue(25);
    a.add(18);
    a.add(17);
    a.add(10);
    a.add(5);
    a.add(9);
    a.add(8);
    a.add(9);
    a.add(3);
    a.add(1);
    a.add(7);
    a.add(9);
    a.add(2);
    a.add(2);
    a.add(3);
    System.out.println(a.peekMax());
    System.out.println(a.toString());
    System.out.println(a.isFull());
    System.out.println(a.getCount());
    while(!a.isEmpty()){
      System.out.println(a.removeMax()+ " ");
    }

    String input = "start";
    while(!input.equals("exit")){
      System.out.println("Add:1");
      System.out.println("DeleteMax:2"); 
      System.out.println("Delete All: 3"); 
      System.out.println("peekMax: 4"); 
      System.out.println("peekMax: 4"); 
      input = reader.readLine();
      if(input.equals("1")){
        q.add(reader.readLine("Enter value to add: "));
        System.out.println(q.toString());
        System.out.println("count: " + q.getCount());
      }
      if(input.equals("2")){
        System.out.println("removed Value: " + q.removeMax());
        System.out.println("Items: " + q.toString());
        System.out.println("count: " + q.getCount());
      }
      if(input.equals("3")){
        while(!q.isEmpty()){
          System.out.println(q.removeMax()+ " ");
        }
        System.out.println("count: " + q.getCount());
      }
    }
  }
  public static void removeTillEmpty(){
    HeapPriorityQueue heap = new HeapPriorityQueue(5);
    heap.add(1);
    heap.add(1);
    heap.add(1);
    heap.add(1);
    heap.add(1);
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
    heap.removeMax();
    System.out.println(heap);
  }
}
