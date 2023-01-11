package lr7.Example2;

public class  SuperClass {
    private String str;

    SuperClass(String strEx){
        str = strEx;
    }

    public int getStr1(){
        return str.length();
    }
    public void setStr(String str) {
        this.str = str;
    }

}

