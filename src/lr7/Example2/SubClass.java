package lr7.Example2;

public class SubClass extends SuperClass {
    int num;

    SubClass(String strEX, int num) {
        super(strEX);
        this.num = num;
    }

    public void setStr() {
    }

    public void setStr(String str) {
        super.setStr(str);
    }

    public void setStr(int num) {
        this.num = num;
    }

    public void setStr(String str, int num) {
        super.setStr(str);
        this.num = num;
    }
}