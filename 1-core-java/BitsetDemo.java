import java.util.BitSet;

public class BitsetDemo
{
  private static BitSet bitSet;
  private static byte[] bytes;
  public static void main(String[] args)
  {
    int length = 10;
    bitSet = new BitSet(length);
    for (int i = 3; i < length; i++)
    {
      bitSet.set(i);
    }
//    bytes = new byte[bitSet.length() / 8 + 1];
    System.out.println(bitSet.get(1));
    System.out.println(bitSet.length()); // the index of the highest set bit in
                                         // the {@code BitSet} plus one
    System.out.println(bitSet.size());
    System.out.println(bitSet.cardinality());
  }
}
