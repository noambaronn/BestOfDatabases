package workspace.bestDb.DataStructure;

import java.util.HashMap;

public class Schema {
    private String SchemaName;
    private int numberOfFields;
    private HashMap<String, Table> allTables;

    public Schema(String schemaName, int numberOfFields, HashMap<String, Table> allTables) {
        SchemaName = schemaName;
        this.numberOfFields = numberOfFields;
        this.allTables = allTables;
    }

    public String getSchemaName() {
        return SchemaName;
    }

    public void setSchemaName(String schemaName) {
        SchemaName = schemaName;
    }

    public int getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public HashMap<String, Table> getAllTables() {
        return allTables;
    }

    public void setAllTables(HashMap<String, Table> allTables) {
        this.allTables = allTables;
    }
}
