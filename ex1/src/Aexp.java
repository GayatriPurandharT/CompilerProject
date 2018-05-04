package src;

public class Aexp {

    String getexp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum AexpType {
        INTEGER,
        FLOAT,
        CHAR,
        EXP,
        BOOL
    }
    
    private final AexpType eType;
    private Integer inum;
    private Float fnum;
    private Args operands;
    private String ch;
    private boolean bl;  
    private int operator;

    Aexp(Integer i) {
        eType = AexpType.INTEGER;
        inum = i;        
        System.out.println("new int createad: "+inum);
    }
    
    Aexp(Float f) {
        eType = AexpType.FLOAT;
        fnum = f;        
        System.out.println("An expression with new float createad: "+fnum);
    }
    
    Aexp(String j) {
        eType = AexpType.CHAR;
        ch = j;        
        System.out.println("An expression with new char createad: "+ch);
    }

    Aexp(Boolean b) {
        eType = AexpType.BOOL;
        bl = b;        
        System.out.println("BOOLEAN EXPRESSION FOUND: "+bl);
    }

    Aexp(Args x, int op) {
        eType = AexpType.EXP;
        operands = x;
        operator = op;
        System.out.println("An expressio with two arguments, "+operands+" and op: "+operator);
    
    }

    public int getOperator() {
        return this.operator;
    }
    
    public AexpType getAexpType() {
        return this.eType;
    } 
    
    public String getInfixExp() {

        String s = "";
        switch (this.eType) {
            case INTEGER: s = inum.toString(); break;
            case FLOAT: s = fnum.toString(); break;
//            case EXP:
//                Aexp fi = operands.getfi(), se = operands.getse();
//                int fiOp = fi.getOperator(), seOp = se.getOperator();
//                boolean isFiExp = fi.getAexpType().equals(AexpType.EXP), isSeExp = se.getAexpType().equals(AexpType.EXP);
//                boolean isFiPM = (fiOp == sym.PLUS || fiOp == sym.MINUS), isSePM = (seOp == sym.PLUS || seOp == sym.MINUS);
//                switch (operator) {
//                    case sym.PLUS:
//                        s = fi.getInfixExp() + " + " + se.getInfixExp();
//                        break;
//                    case sym.MINUS:
//                        //s = fi.getInfixExp() + " - " + se.getInfixExp();
//                        s = (isFiExp && isFiPM ? "("+fi.getInfixExp()+")" : fi.getInfixExp()) + " - " + 
//                            (isSeExp && isSePM ? "("+se.getInfixExp()+")" : se.getInfixExp());
//                        System.out.println("Returning S: "+s+ " with Fi : "+fi.getInfixExp()+" Se: "+se.getInfixExp());
//                        break;
//                    case sym.TIMES:
//                        s = (isFiExp && isFiPM ? "("+fi.getInfixExp()+")" : fi.getInfixExp()) + " * " + 
//                            (isSeExp && isSePM ? "("+se.getInfixExp()+")" : se.getInfixExp());
//                        break;
//                    case sym.DIVIDE:
//                        s = (isFiExp ? "("+fi.getInfixExp()+")" : fi.getInfixExp()) + " / " + 
//                            (isSeExp ? "("+se.getInfixExp()+")" : se.getInfixExp());
//                        break;
//                    default: break;
//                } break;
            default: break;
        }

        return s;
    }

    public float getValue() {
        float val = 0.0f;
        switch (this.eType) {
            case INTEGER:
                val = (float)(inum); break;
            case FLOAT:
                val = fnum; break;
            case CHAR:
                System.out.println("Arithmetic expression not possible on characters");
                return 0;
            case EXP:
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        val = operands.getfi().getValue() + operands.getse().getValue();
                        break;
                    case sym.MINUS:
                        val = operands.getfi().getValue() - operands.getse().getValue();
                        break;
                    case sym.TIMES:
                        val = operands.getfi().getValue() * operands.getse().getValue();
                        break;
                    case sym.DIVIDE:
                        val = operands.getfi().getValue() / operands.getse().getValue();
                        break;
                    default:
                        break;
                } break;
            default: break;
        }
        return val;
    }
}
