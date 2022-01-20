package workspace.bestDb.DB;

import workspace.bestDb.DbActions.Action;
import workspace.bestDb.DataStructure.Schema;

import java.util.HashMap;

abstract class DataBase {
    private HashMap<String, Action> setOfTools;
    private HashMap<String, Schema> allSchemas;

}
