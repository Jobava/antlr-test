package com.jobava;

import org.antlr.v4.runtime.*;
import com.jobava.antlr.*;
import com.jobava.antlr.DrinkParser.DrinkSentenceContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // Get our lexer
        DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream("the cup of mead"));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        DrinkParser parser = new DrinkParser(tokens);

        // Specify our entry point
        DrinkSentenceContext drinkSentenceContext = parser.drinkSentence();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrDrinkListener listener = new AntlrDrinkListener();
        walker.walk(listener, drinkSentenceContext);
        
        //System.out.println("HELLO WORLD!!!!!!!!!");
    }
}
