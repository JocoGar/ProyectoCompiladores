/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador.TablaSimbolos;

// ¡IMPORTANTE! Importamos las clases del paquete principal
import proyectocompilador.ErrorCollector;
import proyectocompilador.GramaticaParser;
import proyectocompilador.GramaticaParserBaseListener;

public class AnalizadorSemantico extends GramaticaParserBaseListener {
    public TablaSimbolos tablaSimbolos = new TablaSimbolos();
    private ErrorCollector errorCollector;
    private String ambitoActual = "Global";

    public AnalizadorSemantico(ErrorCollector errorCollector) {
        this.errorCollector = errorCollector;
    }

    @Override
    public void enterDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx) {
        String tipo = ctx.tipoVariable().getText();
        String nombre = ctx.IDENTIFICADOR().getText();
        int linea = ctx.IDENTIFICADOR().getSymbol().getLine();
        int columna = ctx.IDENTIFICADOR().getSymbol().getCharPositionInLine();

        boolean insertado = tablaSimbolos.agregarSimbolo(nombre, tipo, ambitoActual, linea, columna);
        
        if (!insertado) {
            errorCollector.errores.add(
                "<tr>" +
                "<td>Semántico</td>" +
                "<td>" + linea + "</td>" +
                "<td>" + columna + "</td>" +
                "<td>" + nombre + "</td>" +
                "<td>La variable ya ha sido declarada anteriormente.</td>" +
                "</tr>"
            );
        }
    }

    @Override
    public void enterDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx) {
        ambitoActual = ctx.IDENTIFICADOR().getText(); 
    }

    @Override
    public void exitDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx) {
        ambitoActual = "Global";
    }
}