public class HeapPriorityQueue implements MaxPriorityQueue 
{
  // instance variables (you may use whatever name you wish for the variables)
  private Comparable[] heaparray; // array holding the Comparable heap objects

  private int count; // contains the current number of objects in the heap
  private int maxSize; /*
                        * holds the maximum number of objects that can be stored in the heap – it is
                        * determined when the heap is constructed
                        */

  // public methods
  // constructor is passed the max allowable size
  // of the heap – precondition: max > 0
  public HeapPriorityQueue(int max)
  {
    maxSize = max;
    heaparray = new Comparable[maxSize+1];
    count = 0;
  }

  /*
   * inserts the Comparable object val into the heap in the correct location.
   * Returns false and displays error message if attempting to add to a heap with
   * no space remaining
   */
  public boolean add(Comparable val) 
  {
    if(this.isFull())//Can't add anymore to the heap
    {
      System.out.println("Error: The heap is full");
      return false;
    }
    else
    {
      //checks to see if this is empty
      if(this.isEmpty())
      {
        heaparray[1] = val;//in which case it adds it to index 1
        count++;
        return true;
      }
      else{
        int current = count+1;//adds to count
        while(current/2 != 0 && val.compareTo(heaparray[current/2]) > 0)//checks the limit as well as the current/2 less than val
        {
          heaparray[current] = heaparray[current/2];//basically puts parent val into current val
          current = current/2;// changes current to parent
        }
        heaparray[current] = val;//switched the current in heaparray to val
        count++;//count is incremented
        return true;//returns true
      }
    }
  }
  // returns true if there are 0 objects in the array
  public boolean isEmpty() {
    return count == 0;
  }
  // removes and returns the top (highest) object in the heap.
  // Returns a null and displays an error message if
  // attempting to remove from empty heap
  public Comparable removeMax() 
  {
    //The swap method was OP. granted it fixed basically everything and made the code fresh looking
    int currentVal = 1;//Important variable
    if(this.isEmpty())//always the number 1 test case to do
    {
      System.out.println("ERROR: Cannot remove from empty heap");
      return null;
    }
    else
    {
      //initalize variable 
      Comparable maxVal = heaparray[1];
      heaparray[1] = heaparray[count];
      count--;
      while(currentVal*2 <= count)//So I can't really use a for loop so here I go with a current val 
      {
        if(currentVal*2+1 <= count)//Two children checker
        {
          if(heaparray[currentVal].compareTo(heaparray[currentVal*2])>=0 && heaparray[currentVal].compareTo(heaparray[currentVal*2+1])>=0)//Checks to see whether it has already found it's place
          {
            //found the place fr
            return maxVal;
          }
          else if(heaparray[currentVal*2].compareTo(heaparray[currentVal*2+1])>0)//checks to see whether it should move left or move right
          {
            swap(currentVal, currentVal*2);//Swap method OP
            //logic to move to the children(left)
            currentVal = currentVal*2;
          }
          else//if none met, it goes here
          {
            swap(currentVal, currentVal*2+1);//Sawp method OP
            //So this is the logic to move ot the children.(right)
            currentVal *= 2;
            currentVal += 1;
          }
        }
        else//one child checker
        {
          //finds it place when it goes through to the left or right
          if(heaparray[currentVal].compareTo(heaparray[currentVal*2])>=0)
          {
            return maxVal;
          }
          else{
            swap(currentVal, currentVal*2);//sawp method OP again
            currentVal *= 2;//multiplies onwards
          }
        }
      }
      return maxVal;
    }
  }

  // returns a pointer to the top object in the heap (or null)
  public Comparable peekMax() 
  {
    if(this.isEmpty()){
      System.out.println("ERROR: Empty heap");
      return null;
    }
    return heaparray[1];
  }

  // returns a String containing the values displayed in level
  // order, separated by commas
  public String toString() //To string is fairly simple, I decided to make sure it doesn't print with commas when it goes to the end. Very chill
  {
    if(this.isEmpty())
    {
      return "[]";
    }
    //this has caused me so much pain.........
    String heapString = "[";
    for (int i = 1; i < count+1; i++) 
    {
      if(i == count)
      {
        heapString += heaparray[count];//makes it so that there is no comma at the end
      } 
      else{
        heapString += heaparray[i] + ", ";//puts comma when needed
      }  
    }
    heapString += "]";
    return heapString;//returns
  }

  // returns true if the array can not store any more objects
  public boolean isFull() {
    if (count >= maxSize) {
      return true;
    } else {
      return false;
    }
  }

  // returns count
  public int getCount() {
    return count;
  }
  //Swap swap method
  private void swap(int a, int b){
    Comparable tempStore = heaparray[a];//stores a in tempstore
    heaparray[a] = heaparray[b];//a becomes b
    heaparray[b] = tempStore;//b becomes tempStore
  }
}
