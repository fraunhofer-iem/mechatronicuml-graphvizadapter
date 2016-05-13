/*
 * generated by Xtext
 */
package org.muml.graphviz.plain.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.graphviz.plain.xtext.services.GraphvizPlainGrammarAccess;

public class GraphvizPlainParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GraphvizPlainGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.graphviz.plain.xtext.parser.antlr.internal.InternalGraphvizPlainParser createParser(XtextTokenStream stream) {
		return new org.muml.graphviz.plain.xtext.parser.antlr.internal.InternalGraphvizPlainParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Graph";
	}
	
	public GraphvizPlainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GraphvizPlainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
