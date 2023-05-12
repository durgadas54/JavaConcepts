package concepts;

public class FunctionInterfaceConcept {

    public static void main(String[] args) {

      /*  Old way */

      Foo fooByIC = new Foo() {
            @Override
            public String method(String string) {
                return string + " from Foo";
            }
        };
      fooByIC.method("test");

        Foo foo = parameter -> parameter + " from lambda";
        String result = add("Message ", foo);
    }



    public static String add(String string, Foo foo) {
        return foo.method(string);
    }


    @FunctionalInterface
    interface Foo {
        String method(String string);
    }
}
