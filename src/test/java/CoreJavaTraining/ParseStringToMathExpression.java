package CoreJavaTraining;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ParseStringToMathExpression {
	
	public static final String EXPRESSION = "2+4/2-6*11";
	
	public static void evaluate(String string) throws ScriptException{
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    System.out.println(engine.eval(string));
	    } 
	
	public static void main(String[] args) throws ScriptException {
		evaluate(EXPRESSION);
	}

}
