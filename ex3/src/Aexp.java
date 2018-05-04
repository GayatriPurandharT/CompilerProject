package src;

public class Aexp {

    private enum AexpType {
        INTEGER,
        FLOAT,
        str,
        ID,
        bool,
        EXP 
    }
    
    private final AexpType eType;
    private Integer inum;
    private float Fnum;
    private String st; 
    private boolean boolVal;    
    private String id;
    private Args operands;
    private int operator;

    Aexp(Integer x) {
        eType = AexpType.INTEGER;
        inum = x;        
    }
    
    Aexp(float x) {
        eType = AexpType.FLOAT;
        Fnum = x;        
    }
    
    Aexp(Object c) {
        eType = AexpType.str;
//        Fnum = x;   
        st = (String)c;
    }
    
//    Aexp(String x, String s) {
//        eType = AexpType.str;
//        st = x;        
//    }
    
    
    Aexp(String x) {
        eType = AexpType.ID;
        id = x;        
    }
    Aexp(Boolean x) {
        eType = AexpType.bool;
        boolVal = x;        
    }
    Aexp(Args x, int op) {
        eType = AexpType.EXP;
        operands = x;
        operator = op;
    }

    public String getexp() {

        String s = "";
        switch (this.eType) {
            case INTEGER: s = "" + inum; break;
            case FLOAT:
                // expression is a number
                s = "" + Fnum; break;
            case str:
                // expression is a number
                s = st; break;
            
            case ID: s = id; break;
            case EXP:
                switch (operator) {
                    case sym.PLUS:
                        s = "PLUS(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.MINUS:
                        s = "MINUS(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.TIMES:
                        s = "TIMES(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.DIVIDE:
                        s = "DIVIDE(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
//                    case sym.EE:
//                        s = "EE(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
//                        break;
//                    case sym.DIVIDE:
//                        s = "DIVIDE(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
//                        break;
                                
                    default: break;
                } break;
            default: break;
        }

        return s;
    }

    public Object getValue() {
//        Info returnObj = new Info();
//        Integer val = 0;
//        float valf = 0;
//        String vals = null;
        Object obj = new Object();
        AexpType type = this.eType;
        
        switch (this.eType) {
            case INTEGER:
                // expression is a number
                obj = inum; break;
            case FLOAT:
                // expression is a number
                obj = Fnum; break;
           case bool:
                // expression is a number
                obj = boolVal; break;
           case str:
                // expression is a number
                obj = st; break;
            case ID:
                //expression is a variable
//                obj = ;
                Info k = (Info)SymbolTable.globalTable.get(id);
//                if (k.defined == false) {
//                    System.out.print(id + " was not declared");
//                    System.exit(0);
//                }
                    break;
            case EXP:
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        switch (type) {
                            case INTEGER:
                                obj = (int)operands.getfi().getValue() + (int)operands.getse().getValue();
                                break;
                            case FLOAT:
                                obj= (float)operands.getfi().getValue() + (float)operands.getse().getValue();
                                break; 
                            case str:
                                System.out.println("Arithematic operations not possible on strings!");
                                break;
                            default:
                                 break;
                        }
                        break;
                    case sym.MINUS:
                        switch (type) {
                            case INTEGER:
                                obj = (int)operands.getfi().getValue() - (int)operands.getse().getValue();
                                break;
                            case FLOAT:
                                obj= (float)operands.getfi().getValue() - (float)operands.getse().getValue();
                                break; 
                            case str:
                                System.out.println("Arithematic operations not possible on strings!");
                                break;
                            default:
                                 break;
                        }
                    case sym.TIMES:
                        switch (type) {
                            case INTEGER:
                                obj = (int)operands.getfi().getValue() * (int)operands.getse().getValue();
                                break;
                            case FLOAT:
                                obj= (float)operands.getfi().getValue() * (float)operands.getse().getValue();
                                break; 
                            case str:
                                System.out.println("Arithematic operations not possible on strings!");
                                break;
                            default:
                                 break;
                        }
                    case sym.DIVIDE:
                      if(checkNotZero(operands.getse().getValue()) == true){  
                        switch (type) {
                            case INTEGER:
                                obj = (int)operands.getfi().getValue() / (int)operands.getse().getValue();
                                break;
                            case FLOAT:
                                obj= (float)operands.getfi().getValue() / (float)operands.getse().getValue();
                                break; 
                            case str:
                                System.out.println("Arithematic operations not possible on strings!");
                                break;
                            default:
                                 break;
                        }
                      } else {
                          System.out.println("Division by 0 not possible.");
                          break;
                      }  
//                    case sym.EE:
//                        val = boolExpression(operands.getfi(), operands.getse());
                    default:
                        break;
                } break;
            default: break;
        }
        return obj;
    }
    
    boolean checkNotZero(Object obj){
        if(obj instanceof Integer || obj instanceof Float){
            return (int)obj != 0;
        } else {
            System.out.println("Not a number! Division not possible");
            return false;
        }
            
    }        
    public int booleanExpression(Aexp a, Aexp b){
    
        return 1;
    }
    
    
}
