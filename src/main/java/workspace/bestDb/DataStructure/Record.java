package workspace.bestDb.DataStructure;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * every record has a index, so i can find the
 * table fast and the column fast. this way i will get the data very fast
 */
public class Record {
    private int index;
    private String recordsName;
    private ArrayList<Value> values;
    private int numberOfFields;
    private HashMap<String, ArrayList<Value>> createRecord;

    public Record(String recordsName, ArrayList<Value> values, int numberOfFields) {
        this.recordsName = recordsName;
        this.values = values;
        this.numberOfFields = numberOfFields;
        this.createRecord = new HashMap<>();
        this.createRecord.put(this.recordsName, this.values);
    }

    public String getRecordsName() {
        return recordsName;
    }

    public void setRecordsName(String recordsName) {
        this.recordsName = recordsName;
    }

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    public int getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public HashMap<String, ArrayList<Value>> getCreateRecord() {
        return createRecord;
    }

    public void setCreateRecord(HashMap<String, ArrayList<Value>> createRecord) {
        this.createRecord = createRecord;
    }
}
