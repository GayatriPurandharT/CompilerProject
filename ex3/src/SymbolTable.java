package src;

import java.util.Hashtable;

class Info {    
    
    int   value_int;
    float value_float;
    String value_string;
    String type;
    public Info(){};
//    public Book(int id, String name, String author, String publisher, int quantity) {    
//    this.id = id;    
//    this.name = name;    
//    this.author = author;    
//    this.publisher = publisher;    
//    this.quantity = quantity;    
//}    
}   

public class SymbolTable extends Hashtable<String,Info>{

    static SymbolTable globalTable;
    
    static {globalTable = new SymbolTable();}

    static void setValue(String id, int value){
        Info v = new Info();
        v.type="int";
        v.value_int=value;
        globalTable.put(id,v);
    }
    
    static void setValue(String id, float value){
        Info v = new Info();
        v.type="float";
        v.value_float=value;
        globalTable.put(id,v);
    }
    
    static void setValue(String id, String value){
        Info v = new Info();
        v.type="String";
        v.value_string=value;
        globalTable.put(id,v);
    
    }

    static int getValue(String id, int s){
        Info v = new Info();
        v = globalTable.get(id);
        
        return v.value_int;
    }
    
    static float getValue(String id, float s){
        Info v = new Info();
        v = globalTable.get(id);        
        return v.value_float;
    }
    
    static String getValue(String id, String s){
        Info v = new Info();
        v = globalTable.get(id);        
        return v.value_string;
    }   
    
    static String getType(String id){
        Info v = new Info();
        v = globalTable.get(id);        
        return v.type;
    }   
}
