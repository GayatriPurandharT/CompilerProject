
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri May 04 23:36:29 ICT 2018
//----------------------------------------------------

package src;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri May 04 23:36:29 ICT 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\003\000\002\002\004\000\002\011" +
    "\004\000\002\011\003\000\002\015\002\000\002\010\005" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\005\000\002\007\006\000\002" +
    "\006\004\000\002\005\006\000\002\004\005\000\002\012" +
    "\005\000\002\012\005\000\002\012\003\000\002\014\005" +
    "\000\002\014\005\000\002\014\003\000\002\013\005\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\013\003\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\014\014\012\016\015\017\005\021\020\026" +
    "\013\001\002\000\004\004\ufff9\001\002\000\016\011\032" +
    "\023\024\024\033\025\034\026\027\027\025\001\002\000" +
    "\004\004\ufffb\001\002\000\020\002\ufffe\014\ufffe\016\ufffe" +
    "\017\ufffe\021\ufffe\022\ufffe\026\ufffe\001\002\000\004\004" +
    "\ufff8\001\002\000\004\002\056\001\002\000\016\011\032" +
    "\023\024\024\033\025\034\026\027\027\025\001\002\000" +
    "\004\013\051\001\002\000\004\004\ufffd\001\002\000\016" +
    "\011\032\023\024\024\033\025\034\026\027\027\025\001" +
    "\002\000\004\004\ufffa\001\002\000\016\002\001\014\012" +
    "\016\015\017\005\021\020\026\013\001\002\000\014\014" +
    "\012\016\015\017\005\021\020\026\013\001\002\000\016" +
    "\014\012\016\015\017\005\021\020\022\023\026\013\001" +
    "\002\000\020\002\uffff\014\uffff\016\uffff\017\uffff\021\uffff" +
    "\022\uffff\026\uffff\001\002\000\004\004\ufff7\001\002\000" +
    "\022\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb" +
    "\015\uffeb\020\uffeb\001\002\000\022\004\uffe8\005\uffe8\006" +
    "\uffe8\007\uffe8\010\uffe8\012\uffe8\015\uffe8\020\uffe8\001\002" +
    "\000\022\004\ufff0\005\ufff0\006\ufff0\007\043\010\042\012" +
    "\ufff0\015\ufff0\020\ufff0\001\002\000\022\004\uffe7\005\uffe7" +
    "\006\uffe7\007\uffe7\010\uffe7\012\uffe7\015\uffe7\020\uffe7\001" +
    "\002\000\022\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed" +
    "\012\uffed\015\uffed\020\uffed\001\002\000\010\004\ufff5\005" +
    "\037\006\040\001\002\000\016\011\032\023\024\024\033" +
    "\025\034\026\027\027\025\001\002\000\022\004\uffea\005" +
    "\uffea\006\uffea\007\uffea\010\uffea\012\uffea\015\uffea\020\uffea" +
    "\001\002\000\022\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010" +
    "\uffe9\012\uffe9\015\uffe9\020\uffe9\001\002\000\010\005\037" +
    "\006\040\012\036\001\002\000\022\004\uffec\005\uffec\006" +
    "\uffec\007\uffec\010\uffec\012\uffec\015\uffec\020\uffec\001\002" +
    "\000\016\011\032\023\024\024\033\025\034\026\027\027" +
    "\025\001\002\000\016\011\032\023\024\024\033\025\034" +
    "\026\027\027\025\001\002\000\022\004\ufff1\005\ufff1\006" +
    "\ufff1\007\043\010\042\012\ufff1\015\ufff1\020\ufff1\001\002" +
    "\000\016\011\032\023\024\024\033\025\034\026\027\027" +
    "\025\001\002\000\016\011\032\023\024\024\033\025\034" +
    "\026\027\027\025\001\002\000\022\004\uffef\005\uffef\006" +
    "\uffef\007\uffef\010\uffef\012\uffef\015\uffef\020\uffef\001\002" +
    "\000\022\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\012" +
    "\uffee\015\uffee\020\uffee\001\002\000\022\004\ufff2\005\ufff2" +
    "\006\ufff2\007\043\010\042\012\ufff2\015\ufff2\020\ufff2\001" +
    "\002\000\004\004\050\001\002\000\020\002\ufffc\014\ufffc" +
    "\016\ufffc\017\ufffc\021\ufffc\022\ufffc\026\ufffc\001\002\000" +
    "\016\011\032\023\024\024\033\025\034\026\027\027\025" +
    "\001\002\000\010\004\ufff3\005\037\006\040\001\002\000" +
    "\010\005\037\006\040\015\054\001\002\000\014\014\012" +
    "\016\015\017\005\021\020\026\013\001\002\000\004\004" +
    "\ufff4\001\002\000\004\002\000\001\002\000\010\005\037" +
    "\006\040\020\060\001\002\000\014\014\012\016\015\017" +
    "\005\021\020\026\013\001\002\000\004\004\ufff6\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\022\002\010\003\013\004\005\005\015\006" +
    "\003\007\007\010\006\011\016\001\001\000\002\001\001" +
    "\000\010\012\056\013\027\014\025\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\012\052\013\027\014\025\001\001\000\002\001" +
    "\001\000\004\015\046\001\001\000\010\012\030\013\027" +
    "\014\025\001\001\000\002\001\001\000\016\003\013\004" +
    "\005\005\015\006\003\007\007\010\021\001\001\000\020" +
    "\003\013\004\005\005\015\006\003\007\007\010\006\011" +
    "\020\001\001\000\016\003\013\004\005\005\015\006\003" +
    "\007\007\010\021\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\012\034\013\027\014\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\013\027\014\045\001\001\000\006\013\027\014\040" +
    "\001\001\000\002\001\001\000\004\013\044\001\001\000" +
    "\004\013\043\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\012\051\013\027\014\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\003\054\004\005\005\015\006" +
    "\003\007\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\003\060\004\005\005\015\006" +
    "\003\007\007\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // factor ::= ID 
            {
              Aexp RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // factor ::= BOOL 
            {
              Aexp RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // factor ::= CHAR 
            {
              Aexp RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  c = c.substring(1, c.length() - 1);
                         Object a = c; 
                        RESULT = new Aexp(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // factor ::= FLOAT 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Float f = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // factor ::= INT 
            {
              Aexp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // factor ::= LPAREN expr RPAREN 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // term ::= factor 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // term ::= term DIVIDE factor 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(t,f), sym.DIVIDE); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // term ::= term TIMES factor 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(t,f), sym.TIMES); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= term 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = t; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr MINUS term 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,t), sym.MINUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr PLUS term 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,t), sym.PLUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // assignment ::= ID EQ expr 
            {
              Astat RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.assignment(i,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ifthen ::= IF expr THEN statement 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.ifthen(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifthen",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // print ::= PRINT expr 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.print(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // while ::= WHILE expr DO statement 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.whileloop(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // statement ::= BEGIN statement_list END 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Lstat s = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = Astat.block(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // statement ::= while 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // statement ::= print 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= ifthen 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= assignment 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement_part ::= statement NT$0 SEMI 
            {
              Astat RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Astat) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_part",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$0 ::= 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement_list ::= statement_part 
            {
              Lstat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Lstat(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_list ::= statement_list statement_part 
            {
              Lstat RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Lstat l = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Lstat(l,s) ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= statement_list 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Lstat s = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 s.execute(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
