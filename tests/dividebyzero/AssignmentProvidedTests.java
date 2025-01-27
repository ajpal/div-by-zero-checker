import org.checkerframework.checker.dividebyzero.qual.*;

// A simple test case for your divide-by-zero checker.
// The file contains "// ::" comments to indicate expected
// errors and warnings.
//
// Passing this test does not guarantee a perfect grade on this assignment,
// but it is an important start. You should always write your own test cases,
// in addition to using those provided to you.
class AssignmentProvidedTests {

  public static void f() {
    int one = 1;
    int zero = 0;
    // :: error: divide.by.zero
    int x = one / zero;
    int y = zero / one;
    // :: error: divide.by.zero
    int z = x / y;
    String s = "hello";
  }

  public static void g(int y) {
    if (y == 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    } else {
      int x = 1 / y;
    }

    if (y != 0) {
      int x = 1 / y;
    } else {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (!(y == 0)) {
      int x = 1 / y;
    } else {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (!(y != 0)) {
      // :: error: divide.by.zero
      int x = 1 / y;
    } else {
      int x = 1 / y;
    }

    if (y < 0) {
      int x = 1 / y;
    }

    if (y <= 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (y > 0) {
      int x = 1 / y;
    }

    if (y >= 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    }
  }

  public static void h() {
    int zero_the_hard_way = 0 + 0 - 0 * 0;
    // :: error: divide.by.zero
    int x = 1 / zero_the_hard_way;

    int one_the_hard_way = 0 * 1 + 1;
    int y = 1 / one_the_hard_way;
  }

  public static void l() {
    // :: error: divide.by.zero
    int a = 1 / (1 - 1);
    int y = 1;
    // :: error: divide.by.zero
    int x = 1 / (y - y);
    int z = y - y;
    // :: error: divide.by.zero
    int k = 1 / z;
  }

  public static void a() {
    int one = 1;
    int zero = 0;
    // :: error: divide.by.zero
    int a = one / zero;
    // :: error: divide.by.zero
    int b = one % zero;

    int c = 5;
    // :: error: divide.by.zero
    c /= zero;
    int d = 10;
    // :: error: divide.by.zero
    d %= zero;
  }

  public static void b() {
    int a = 2 + 2;
    int b = 0 / a;

    int c = a * 10;
    int d = b / c;

    int e = -2 + -5;
    int f = -4 / e;

    int g = -10 * -1000;
    int h = 8 / g;

    int i = 7 * -4;
    int j = -2 / h;
  }

  public static void c() {
    int a = 2 + 2;
    int b = 0 / a;

    int c = a * 10;
    int d = b % c;

    int e = -2 + -5;
    int f = -4 % e;

    int g = -10 * -1000;
    int h = 8 % g;

    int i = 7 * -4;
    // :: error: divide.by.zero
    int j = -2 % h;
  }

  public static void d() {
    // :: error: divide.by.zero
    int a = (1 + 2 / 3) / (4 - 5);

    int b = (1 + 2 / 3) / (4 - -5);

    int c = 5 % (1 + 3);
    // :: error: divide.by.zero
    int d = 10 / c;

    // :: error: divide.by.zero
    int e = -2 / (1 + 2 * -3);
  }
}
