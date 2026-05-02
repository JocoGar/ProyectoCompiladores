/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;



import lexerparser.GramaticaLexer;
import lexerparser.GramaticaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ServicioCompilador{

    public ResultadoCompilacion compilar(String codigoFuente) {
        ResultadoCompilacion resultado = new ResultadoCompilacion();

        try {
            CharStream input = CharStreams.fromString(codigoFuente);

            GramaticaLexer lexer = new GramaticaLexer(input);
            ErrorCollector errorCollector = new ErrorCollector();

            lexer.removeErrorListeners();
            lexer.addErrorListener(errorCollector);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            recolectarTokens(tokens, resultado);

            GramaticaParser parser = new GramaticaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorCollector);

            parser.programa();

            recolectarErrores(errorCollector, resultado);

            generarReportes(resultado);

        } catch (Exception e) {
            resultado.agregarError(new ErrorInfo(
                    "Crítico",
                    0,
                    0,
                    "",
                    e.getMessage()
            ));
        }

        return resultado;
    }

    private void recolectarTokens(CommonTokenStream tokens, ResultadoCompilacion resultado) {
        for (Token t : tokens.getTokens()) {
            if (t.getType() != Token.EOF) {
                String nombreToken = GramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
                String categoria = CategoriaToken.identificarCategoria(nombreToken);

                resultado.agregarToken(new TokenInfo(
                        t.getText(),
                        nombreToken,
                        categoria,
                        t.getLine(),
                        t.getCharPositionInLine()
                ));
            }
        }
    }

private void recolectarErrores(ErrorCollector errorCollector, ResultadoCompilacion resultado) {
    for (ErrorInfo error : errorCollector.getErroresInfo()) {
        resultado.agregarError(error);
    }
}



    private void generarReportes(ResultadoCompilacion resultado) {
        if (resultado.tieneErrores()) {
            generarReporteErrores(resultado);
            generarReporteTokensVacio();
        } else {
            generarReporteTokens(resultado);
            generarReporteErroresVacio();
        }
    }

    private void generarReporteTokens(ResultadoCompilacion resultado) {
        ArrayList<String> filas = new ArrayList<>();

        for (TokenInfo token : resultado.getTokens()) {
            filas.add(token.toHtmlRow());
        }

        ReporteGenerator.generarHTML(
                "BitacoraTokens",
                "Reporte de Tokens",
                "<th>Lexema</th><th>Token</th><th>Categoría</th><th>Línea</th><th>Columna</th>",
                filas
        );
    }

    private void generarReporteErrores(ResultadoCompilacion resultado) {
        ArrayList<String> filas = new ArrayList<>();

        for (ErrorInfo error : resultado.getErrores()) {
            filas.add(error.toHtmlRow());
        }

        ReporteGenerator.generarHTML(
                "BitacoraErrores",
                "Reporte de Errores",
                "<th>Tipo</th><th>Línea</th><th>Columna</th><th>Lexema</th><th>Mensaje</th>",
                filas
        );
    }

    private void generarReporteTokensVacio() {
        ReporteGenerator.generarHTML(
                "BitacoraTokens",
                "Reporte de Tokens",
                "<th>Lexema</th><th>Token</th><th>Categoría</th><th>Línea</th><th>Columna</th>",
                new ArrayList<>()
        );
    }

    private void generarReporteErroresVacio() {
        ReporteGenerator.generarHTML(
                "BitacoraErrores",
                "Reporte de Errores",
                "<th>Tipo</th><th>Línea</th><th>Columna</th><th>Lexema</th><th>Mensaje</th>",
                new ArrayList<>()
        );
    }
}