package BinarySearchTrees.bst;

public class Fork<E extends Comparable<E>> implements Bst<E> {

  private final E root;
  private final Bst<E> left, right;

  // The following assertions are that so that it is impossible to
  // construct incorrect trees:
  public Fork(E root,  Bst<E> left, Bst<E> right) {
    assert(left != null);       // Refuse to work with null pointers.
    assert(right != null);

    assert(left.smaller(root)); // Refuse to violate the bst property.
    assert(right.bigger(root)); // So all our objects will really be bst's.

    this.root = root;           // The usual stuff now.
    this.left = left;
    this.right = right;
  }

  public boolean isEmpty() {
   return false;
  }

  public E smallest() {
    if (left.isEmpty())
      return root;
    else
      return left.smallest();

  }

  public E largest() {
    if (right.isEmpty())
      return root;
    else
      return right.largest();
  }

  public boolean smaller(E e) { // Checks whether all nodes smaller than e.
    return root.compareTo(e) < 0 && right.smaller(e);
  }

  public boolean bigger(E e) {
    return root.compareTo(e) > 0 && left.bigger(e);
  }

  public boolean has(E e) {  // Checks whether e occurs in "this".
      // if (e == root) // Wrong! (Why?)
    if (e.compareTo(root) == 0)
       return true;
    else
      if (e.compareTo(root) < 0)  // Only one sub-tree needs to be searched.
	return left.has(e);
      else
	return right.has(e);
  }

  public Bst<E> find(E e) {
      if (e.compareTo(root) == 0)
       return this;
    else
      if (e.compareTo(root) < 0)
	return left.find(e);
      else
	return right.find(e);
  }

  public Bst<E> insert(E e)  { // Returns a copy of this with e inserted.
    if (e.compareTo(root) == 0)// Bst<E>'s can't have duplicates.
      return this;             // Return unchanged.
    else                       // (Another possibility is to trigger an exception or use the Optional type.)
      if (e.compareTo(root) < 0)
	return new Fork<E>(root, left.insert(e), right);
      else
	return new Fork<E>(root, left, right.insert(e));
  }

  public Bst<E> deleteSmallest() {
    if (left.isEmpty())
      return right;
    else
      return new Fork<E> (root, left.deleteSmallest(), right);
  }

  public Bst<E> deleteLargest() {
    if (right.isEmpty())
      return left;
    else
      return new Fork<E>(root, left, right.deleteLargest());
  }

  public Bst<E> delete(E e)  {  // Returns a copy of self with e deleted.
    if (e.compareTo(root) == 0)
      if (left.isEmpty())
	return right;
      else
	if (right.isEmpty())
	  return left;
	else // Both non-empty.
	  return new Fork<E>(left.largest(), left.deleteLargest(), right);
    else // We have to delete from one of the subtrees.
      if (e.compareTo(root) < 0)
	return new Fork<E>(root, left.delete(e), right);
      else
	return new Fork<E>(root, left, right.delete(e));
  }

  public String toString() {
    return "Fork("  +  root + "," + left.toString()  +  ","  +  right.toString()  +  ")";
  }

  public String fancyToString() {
    return "\n\n\n" + fancyToString(0) + "\n\n\n";
  }

  public String fancyToString(int depth) {
    int step = 4;  // depth step
    String l = left.fancyToString(depth+step);
    String r = right.fancyToString(depth+step);
    return r + spaces(depth) + root + "\n" + l;
    }

  private String spaces(int n) { // Helper method for the above:
    String s = "";
    for (int i = 0; i < n; i++)
	s = s + " ";
    return s;
  }

  public Bst<E> getLeft() {
      return left;
  }

  public Bst<E> getRight() {
      return right;
  }
}
