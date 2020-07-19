public class ClassWithStaticInit {
    final static String field;
    
    static {
        //this block could contain undesirable logging setup that doesn't work in a test environment
        field = "abc";
    }

    public String getField(){
        return field;
    }
}
