/*
 * Empty.java
 *
 * Created on 3 Feb 2014.
 */

package bst;

/**
 * Bst class for empty trees of integers.
 * @author  Martin Escardo
 */

public class Empty<E extends Comparable<E>> implements Bst<E> {
    
  public Empty() { // Nothing to do in the constructor!
  } 

  public boolean isEmpty() { 
    return true; 
  }

  public boolean smaller(E e) { 
    return true; 
  }

  public boolean bigger(E e) { 
    return true; 
  }

  public boolean has(E e) { 
    return false; 
  } 

  public Bst<E> find(E e) { 
    return null;  // We want to improve this. Don't want null.
  }
 
  public Bst<E> insert(E e) { 
    return new Fork<E>(e , new Empty<E>(), new Empty<E>()); 
  }

  public Bst<E> delete(E e)  { 
    return this;  // Nothing to delete. Return unchanged.
  }

  public E smallest() { // Bad. Need to improve. 
    throw new RuntimeException("Attempted to find smallest node of empty tree");
  }

  public E largest() { 
    throw new RuntimeException("Attempted to find largest node of empty tree");
  }

  public Bst<E> deleteSmallest() { 
    throw new RuntimeException("Attempted to delete smallest node of empty tree");
  }

  public Bst<E> deleteLargest() { 
    throw new RuntimeException("Attempted to delete largest node of empty tree");
  }

  public String toString() { 
    return "Empty"; 
  }

  public String fancyToString() { 
    return ""; 
  }

  public String fancyToString(int d) { 
    return fancyToString(); 
  }

  public Bst<E> getLeft() {
      throw new RuntimeException("Attempted to get left subtree of empty tree");
  }

  public Bst<E> getRight() {
      throw new RuntimeException("Attempted to get right subtree of empty tree");
  }
}
