package workspace.bestDb.ValidationToValueInput;

import workspace.bestDb.DataStructure.Value;

import java.util.Date;
import java.util.regex.*;
public class StringValid implements ValidValue {
    @Override
    public boolean approved(Value stringValue) {
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
        pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.
        String str = String.valueOf(stringValue);
        result = pattern.matcher(str).matches();
        if (result) {
            System.out.println("\"" + stringValue + "\"" + " is a number");
        } else
            System.out.println("\"" + stringValue + "\"" + " is a String");
        return result;
    }
}
