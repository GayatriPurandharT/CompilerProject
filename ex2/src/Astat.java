package src;

public class Astat {

    int statementType;
    public static int assignment = 0;
    public static int print = 1;
    
    String assVariable;
    Aexp assExpr;
    public static Astat assignment(String Variable, Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = assignment;

        statement.assVariable = Variable;
        statement.assExpr = expr;

        return statement;
    }

    Aexp printE;
    public static Astat print(Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = print;
        statement.printE = expr;
        return statement;
    }
    
    public void execute() {
        if (statementType == assignment) {
            SymbolTable.setValue(assVariable, assExpr.getValue());
        } else if (statementType == print) {
            System.out.println(printE.getValue());
        }
    }
}
