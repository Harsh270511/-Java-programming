package unit3;

public class data_type {
  public static void main(String[] args) {
    boolean isVagetarian = true;
    System.out.println(isVagetarian);
    System.out.println((isVagetarian));

    double isDouble = 5;// here literal is 5
    System.out.println(isDouble);

    double isdouble = 5.090545;// no error will generate as generated in isFloat without f
    System.out.println(isdouble);

    float isfloat = 5;// here literal is 5
    System.out.println(isfloat);

    float isFloat = 5.0f; // float isFloat = 5.0; only this will generate an error as after . it assume
    // that as a double so will not generate an error in case of double
    System.out.println(isFloat);

    long isLong = 5; // here literal is 5
    System.out.println(isLong);

    int isInt = 5; // here literal is 5
    System.out.println(isInt);

    short isShort = 12;// here literal is 12
    System.out.println(isShort);

    byte isByte = 12;// here literal is 12
    System.out.println(isByte);

    int isChar = 'J';// here literal is J
    System.out.println(isChar);

    char ischar = 'B';// we use only single inverted comma in char in case of double inverted comma it
    // will generate an error

    System.out.println(ischar);

    String wishes = "good morning";// in string we use double inverted comma otherwise it generate an error
    System.out.println(wishes);

    int main = 12;
    System.out.println(main);// main is not a keyword we may use it as a identifier but not generally used

    String gm="87";
    System.out.println(gm);

  }

}
