package workspace.bestDb.DataStructure;

import java.util.Date;

public enum Value {
    Integer(111), String(222), Date(333);

    private int numVal;

    Value(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
