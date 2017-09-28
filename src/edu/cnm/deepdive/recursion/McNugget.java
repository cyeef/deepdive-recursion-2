package edu.cnm.deepdive.recursion;

public class McNugget {

  private static final int[] PACK_SIZES = {20, 9, 6};

  public static boolean test(int n) {
    if (n < 0) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    return test(n, PACK_SIZES, 0);
  }

  private static boolean test(int n, int[] packSizes, int offset) {
    if (n < 0) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    boolean trial = false;
    for (int i = 0; i < packSizes.length; i++) {
      trial = test(n - packSizes[i], packSizes, i);
      if (trial) {
        break;
      }
    }


    return trial;
  }

  public static void main(String[] args) {
  System.out.println(test(43));
    //int[] packSizes = {5, 7, 13, 15};
    //int[]packSizes;
    //packSizes = new int[] {5, 7, 13, 15};
   // packSizes = new int [4];
    //packSizes[0] = 5;
   // packSizes[1] = 8;
   // packSizes[3] = 10;
   // packSizes[4] = 12;
   // System.out.println(test(95, new int[] {15, 12, 8}, 0));

  }


}

