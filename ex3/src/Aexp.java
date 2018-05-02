package src;

public class Aexp {

    private enum AexpType {
        INTEGER,
        FLOAT,
        str,
        ID,
        EXP 
    }
    
    private final AexpType eType;
    private Integer inum;
    private float Fnum;
    private String st;    
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
    
    Aexp(String x, String s) {
        eType = AexpType.str;
        st = x;        
    }
    
    
    Aexp(String x) {
        eType = AexpType.ID;
        id = x;        
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

    public float getValue() {
        Integer val = 0;
        float valf = 0;
        String vals = null;
        AexpType type = this.eType;
        
        switch (this.eType) {
            case INTEGER:
                // expression is a number
                val = inum; break;
            case FLOAT:
                // expression is a number
                valf = Fnum; break;
            case str:
                // expression is a number
                vals = st; break;
            case ID:
                //expression is a variable
                val = SymbolTable.getValue(id);
                if (val == null) {
                    System.out.print(id + " was not declared");
                    System.exit(0);
                }   break;
            case EXP:
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        if(type.equals(AexpType.INTEGER)){
                            val = (int)operands.getfi().getValue() + (int)operands.getse().getValue();
                        } else if(type.equals(AexpType.FLOAT)) {
                            valf = operands.getfi().getValue() + operands.getse().getValue();
                        } else if(type.equals(AexpType.str)) {
                            System.out.println("Arithematic operations not possible on strings!");
                        } 
                        break;
                    case sym.MINUS:
                        if(type.equals(AexpType.INTEGER)){
                            val = (int)operands.getfi().getValue() - (int)operands.getse().getValue();
                        } else if(type.equals(AexpType.FLOAT)) {
                            valf = operands.getfi().getValue() - operands.getse().getValue();
                        }  else if(type.equals(AexpType.str)) {
                            System.out.println("Arithematic operations not possible on strings!");
                        } break;
                    case sym.TIMES:
                        if(type.equals(AexpType.INTEGER)){
                            val = (int)operands.getfi().getValue() * (int)operands.getse().getValue();
                        } else if(type.equals(AexpType.FLOAT)) {
                            valf = operands.getfi().getValue() * operands.getse().getValue();
                        }  else if(type.equals(AexpType.str)) {
                            System.out.println("Arithematic operations not possible on strings!");
                        } break;
                    case sym.DIVIDE:
                      if(operands.getse().getValue() != 0.0){  
                        if(type.equals(AexpType.INTEGER)){
                            val = (int)operands.getfi().getValue() / (int)operands.getse().getValue();
                        } else if(type.equals(AexpType.FLOAT)) {
                            valf = operands.getfi().getValue() / operands.getse().getValue();
                        } else if(type.equals(AexpType.str)) {
                            System.out.println("Arithematic operations not possible on strings!");
                        } break;
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
        return val;
    }
    
    public int booleanExpression(Aexp a, Aexp b){
    
        return 1;
    }
    
    
}
