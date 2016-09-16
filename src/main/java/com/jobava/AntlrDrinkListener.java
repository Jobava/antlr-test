package com.jobava;

import com.jobava.antlr.DrinkBaseListener;
import com.jobava.antlr.DrinkParser.DrinkContext;

public class AntlrDrinkListener extends DrinkBaseListener {
 
    @Override
    public void enterDrink(DrinkContext ctx) {
        System.out.println(ctx.getText());
    }
 
}
