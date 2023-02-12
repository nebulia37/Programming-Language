
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package parser;

import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;
import java_cup.runtime.ComplexSymbolFactory;
import interpreter.Interpreter;
import ast.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\004\000\002\004\003\000\002\004\003" +
    "\000\002\005\004\000\002\005\006\000\002\006\006\000" +
    "\002\006\005\000\002\007\004\000\002\007\004\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\005\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\012\004\005\005\015\006\012\016\006\001" +
    "\002\000\006\007\037\012\040\001\002\000\004\016\036" +
    "\001\002\000\004\012\033\001\002\000\014\002\ufffc\004" +
    "\ufffc\005\ufffc\006\ufffc\016\ufffc\001\002\000\004\002\032" +
    "\001\002\000\004\002\000\001\002\000\012\010\023\014" +
    "\020\015\024\016\021\001\002\000\014\002\ufffd\004\ufffd" +
    "\005\ufffd\006\ufffd\016\ufffd\001\002\000\014\002\uffff\004" +
    "\005\005\015\006\012\016\006\001\002\000\004\016\016" +
    "\001\002\000\006\007\ufff6\012\ufff6\001\002\000\004\002" +
    "\ufffe\001\002\000\010\007\ufff5\011\ufff5\013\ufff5\001\002" +
    "\000\010\007\ufff3\011\ufff3\013\ufff3\001\002\000\006\007" +
    "\031\013\027\001\002\000\012\010\023\014\020\015\024" +
    "\016\021\001\002\000\010\007\ufff4\011\ufff4\013\ufff4\001" +
    "\002\000\006\011\026\013\027\001\002\000\010\007\ufff1" +
    "\011\ufff1\013\ufff1\001\002\000\012\010\023\014\020\015" +
    "\024\016\021\001\002\000\010\007\ufff2\011\ufff2\013\ufff2" +
    "\001\002\000\014\002\ufff8\004\ufff8\005\ufff8\006\ufff8\016" +
    "\ufff8\001\002\000\004\002\001\001\002\000\012\010\023" +
    "\014\020\015\024\016\021\001\002\000\006\007\035\013" +
    "\027\001\002\000\014\002\ufff9\004\ufff9\005\ufff9\006\ufff9" +
    "\016\ufff9\001\002\000\006\007\ufff7\012\ufff7\001\002\000" +
    "\014\002\ufffb\004\ufffb\005\ufffb\006\ufffb\016\ufffb\001\002" +
    "\000\012\010\023\014\020\015\024\016\021\001\002\000" +
    "\006\007\042\013\027\001\002\000\014\002\ufffa\004\ufffa" +
    "\005\ufffa\006\ufffa\016\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\016\002\007\003\010\004\013\005\012\006" +
    "\006\007\003\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\021\001\001\000\002\001\001" +
    "\000\014\003\016\004\013\005\012\006\006\007\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\040\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 
  Lexer lexer;
  public Parser(Lexer lex, ComplexSymbolFactory sf) {
    super(lex, sf);
    lexer = lex;
  }
  public void report_fatal_error(String message, Object info) {
    Interpreter.fatalError(message + " (" + info + ")", Interpreter.EXIT_PARSING_ERROR);
  }
  Location loc(int line, int column) {
    return new Location(line, column);
  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= unitList 
            {
              Program RESULT =null;
		int ulleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ulright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		UnitList ul = (UnitList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Program(ul, loc(ulleft, ulright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // unitList ::= unit 
            {
              UnitList RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int uright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Unit u = (Unit)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new UnitList(u,loc(uleft, uright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unitList",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // unitList ::= unit unitList 
            {
              UnitList RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int uright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Unit u = (Unit)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ulleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ulright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		UnitList ul = (UnitList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new UnitList(u, ul, loc(uleft, ulright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unitList",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // unit ::= decl 
            {
              Unit RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Decl d = (Decl)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = d; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unit",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // unit ::= stmt 
            {
              Unit RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Stmt s = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unit",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl ::= varDecl SEMICOLON 
            {
              Decl RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		VarDecl d = (VarDecl)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Decl(d, loc(dleft,dright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // decl ::= varDecl ASSIGN expr SEMICOLON 
            {
              Decl RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		VarDecl d = (VarDecl)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Decl(d, e, loc(dleft,eright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= IDENT ASSIGN expr SEMICOLON 
            {
              Stmt RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new AssignStmt(i, e, loc(ileft,eright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= PRINT expr SEMICOLON 
            {
              Stmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new PrintStmt(e, loc(eleft,eright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // varDecl ::= INT IDENT 
            {
              VarDecl RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new IntVarDecl(i, loc(ileft,iright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("varDecl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // varDecl ::= FLOAT IDENT 
            {
              VarDecl RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new FloatVarDecl(i, loc(ileft,iright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("varDecl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= INTCONST 
            {
              Expr RESULT =null;
		int icleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int icright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Long ic = (Long)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new IntConstExpr(ic, loc(icleft,icright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= FLOATCONST 
            {
              Expr RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double fc = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new FloatConstExpr(fc, loc(fcleft,fcright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= IDENT 
            {
              Expr RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new IdentExpr(i, loc(ileft,iright)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr PLUS expr 
            {
              Expr RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr e1 = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expr e2 = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new PlusExpr(e1, e2, loc(e1left,e2right)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= LPAREN expr RPAREN 
            {
              Expr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}