package br.univali.lexsyntactics.principal;

public class Semantico implements Constants {

    public void executeAction(int action, Token token) throws SemanticError {
        switch (action) {
            case 1: // Titulo
                LexSyntactics.html += "<h1>" + token.getLexeme() + "</h1>";
                System.out.println("" + token.getLexeme());
                break;
            case 2: // Negrito
                LexSyntactics.html += "<b>" + token.getLexeme() + "</b>";
                System.out.println("" + token.getLexeme());
                break;
            case 3: // Italico
                LexSyntactics.html += "<i>" + token.getLexeme() + "</i>";
                System.out.println("" + token.getLexeme());
                break;
            case 4: // Riscado
                LexSyntactics.html += "<s>" + token.getLexeme() + "</s>";
                System.out.println("" + token.getLexeme());
                break;
            case 5: // Variavel
                LexSyntactics.html += "<font size=\"5\">" + token.getLexeme();
                System.out.println("" + token.getLexeme());
                break;
            case 6: // Pula
                LexSyntactics.html += "<br>";
                System.out.println("" + token.getLexeme());
                break;
            case 7: // Termina
                LexSyntactics.html += ".";
                System.out.println("" + token.getLexeme());
                break;
        }
    }
}
