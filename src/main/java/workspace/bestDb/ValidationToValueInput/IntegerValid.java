package workspace.bestDb.ValidationToValueInput;

import workspace.bestDb.DataStructure.Value;

import java.util.Date;

public class IntegerValid implements ValidValue{
    @Override
    public boolean approved(Value value) {
        return false;
    }
}
