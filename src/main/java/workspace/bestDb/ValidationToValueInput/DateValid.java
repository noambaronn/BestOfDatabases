package workspace.bestDb.ValidationToValueInput;

import workspace.bestDb.DataStructure.Value;

import java.util.Date;
import java.util.regex.Pattern;

public class DateValid implements ValidValue{

    @Override
    public boolean approved(Value value) {
        Pattern DATE_PATTERN = Pattern.compile(
                "^\\d{4}-\\d{2}-\\d{2}$");
        String date  = String.valueOf(DATE_PATTERN);
        return DATE_PATTERN.matcher(date).matches();
    }

}

