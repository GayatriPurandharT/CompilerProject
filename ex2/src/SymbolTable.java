package src;

import java.util.Hashtable;

public class SymbolTable extends Hashtable<String,Object>{

    static SymbolTable globalTable;
    
    static {globalTable = new SymbolTable();}

    static void setValue(String id, int value){
        globalTable.put(id,value);
    }

    static Integer getValue(String id){
        return (Integer) globalTable.get(id);
    }

    static void setValue(String assVariable, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
