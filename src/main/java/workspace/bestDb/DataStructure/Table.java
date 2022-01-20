package workspace.bestDb.DataStructure;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    private int index;
    private String tablesName;
    private ArrayList<Record> records;
    private int numberOfFields;
    private HashMap<String, ArrayList<Record>> createTable;

    public Table(String tablesName, ArrayList<Record> records, int numberOfFields) {
        this.tablesName = tablesName;
        this.records = records;
        this.numberOfFields = numberOfFields;
        this.createTable = new HashMap<>();
        this.createTable.put(this.tablesName, this.records);
    }

    public String getTablesName() {
        return tablesName;
    }

    public void setTablesName(String tablesName) {
        this.tablesName = tablesName;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }

    public int getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public HashMap<String, ArrayList<Record>> getCreateTable() {
        return createTable;
    }

    public void setCreateTable(HashMap<String, ArrayList<Record>> createTable) {
        this.createTable = createTable;
    }
}
