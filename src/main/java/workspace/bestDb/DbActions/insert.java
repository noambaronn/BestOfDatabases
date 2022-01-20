package workspace.bestDb.AbActions;

import workspace.bestDb.DataStructure.Record;
import workspace.bestDb.DataStructure.Schema;
import workspace.bestDb.DataStructure.Value;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * INSERT INTO table_name (column1, column2, column3, ...)
 *     VALUES (value1, value2, value3, ...);
 */

public class insert implements Action{
    private String tableName;
    private ArrayList<Record> theRecordToBeChanged;
    private ArrayList<Value> theValuesToInsert;
    private HashMap<String, Value> recordNameTheValueToInsert;

    public insert(String tableName, ArrayList<Record> theRecordToBeChanged, ArrayList<Value> theValuesToInsert) {
        this.tableName = tableName;
        this.theRecordToBeChanged = theRecordToBeChanged;
        this.theValuesToInsert = theValuesToInsert;
        this.recordNameTheValueToInsert = new HashMap<>();
        for(int i=0; i<this.theRecordToBeChanged.size(); i++){
            for(int j=0; j<this.theValuesToInsert.size(); j++){
                this.recordNameTheValueToInsert.put(
                        this.theRecordToBeChanged.get(i).getRecordsName(),
                        this.theValuesToInsert.get(j));
            }
        }
    }

    @Override
    public void doDbAction(Schema schema) {
        ArrayList<Record> theExistRecords = schema.getAllTables().get(this.tableName).getRecords();
        for(int i=0; i<this.theRecordToBeChanged.size(); i++){
            if(!theExistRecords.contains(this.theRecordToBeChanged.get(i))){
                ArrayList<Value> addValue = new ArrayList<>();
                addValue.add(this.recordNameTheValueToInsert.get(i));
                int numberOfFields = addValue.size();
                Record addRecord = new Record()
            }
        }
        schema.getAllTables().get(this.tableName).setRecords();
    }
}
