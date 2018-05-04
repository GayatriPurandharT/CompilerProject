package src;

//import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.reflect.Type;
import java.util.Hashtable;

class Info {    
    
//    int   value_int;
//    float value_float;
//    String value_string;
//    String type;
//    boolean defined;
//    public Info(){
//        defined = false;
//    };
//    public Book(int id, String name, String author, String publisher, int quantity) {    
//    this.id = id;    
//    this.name = name;    
//    this.author = author;    
//    this.publisher = publisher;    
//    this.quantity = quantity;    
//}    
    String type;
    Object value;
    boolean defined = false;
    
    Info(Object input)
    {
        // random = bool
        if(input instanceof Boolean){
            this.type = "Bool";
            this.value=input;
            System.out.println(input+"   Boolean value seen");
        
        } else if(input instanceof Integer){
            this.type = "int";  
            System.out.println(input+"   Integer value seen");
        } else if(input instanceof Float){
            this.type = "fl";            
            
        } else if(input instanceof String){
            this.type = "str";
        } else {
            System.out.println(input+ "  Undefined type. Couldnt store.");
            return;
        }
        this.defined = true;
        this.value = input;
    }
    
    public String getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value;
    }

}   

public class SymbolTable extends Hashtable<String,Info>{

    static SymbolTable globalTable;
    static int count;
    static {globalTable = new SymbolTable();}

    static void setValue(String id, Object value){
        //Info v = new Info();
//        obj.defined =true;
//        something =new Info(something) ;
        globalTable.put(id, new Info(value));
        System.out.println("Storing variable: "+id+ " value: "+value);
    }
//    
//    static void setValue(String id, float value){
//        Info v = new Info();
//        v.type="float";
//        v.value_float=value;
//        globalTable.put(id,v);
//    }
//    
//    static void setValue(String id, String value){
//        Info v = new Info();
//        v.type="String";
//        v.value_string=value;
//        globalTable.put(id,v);
//    }

//    static int getValue(String id, int s){
//        Info v = new Info();
//        v = globalTable.get(id);
//        
//        return v.value_int;
//    }
    
//    static float getValue(String id, float s){
//        Info v = new Info();
//        v = globalTable.get(id);        
//        return v.value_float;
//    }
    
    static Info getObj(String id){
//        Info v = new Info();
        Info v = globalTable.get(id);        
        return v;
           
    }   
    
    static String getType(String id){
        Info v = globalTable.get(id);        
        return v.type;
    }   
}
