package com.roubsite.smarty4j.statement.function;

import com.roubsite.smarty4j.MethodVisitorProxy;
import com.roubsite.smarty4j.VariableManager;
import com.roubsite.smarty4j.statement.Function;
import com.roubsite.smarty4j.statement.ParentType;

/**
 * @see com.roubsite.smarty4j.statement.function.$for
 * 
 * @version 1.1.0, 2015/05/16
 * @author Rick Jone
 * @soubSite Smarty1.0
 */
@ParentType(name = "for")
public class $forelse extends Function {

	@Override
	public void parse(MethodVisitorProxy mv, int local, VariableManager vm) {
	}
}
