/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;

import fase2.TablaSimbolos;
import java.util.ArrayList;
import java.util.List;

public class ResultadoCompilacion {

    private final List<TokenInfo> tokens;
    private final List<ErrorInfo> errores;
    private TablaSimbolos tablaSimbolos;
    private String codigoIntermedio;

    public ResultadoCompilacion() {
        this.tokens = new ArrayList<>();
        this.errores = new ArrayList<>();
        this.codigoIntermedio = "";
    }

    public void agregarToken(TokenInfo token) {
        tokens.add(token);
    }

    public void agregarError(ErrorInfo error) {
        errores.add(error);
    }

    public void agregarErrores(List<ErrorInfo> nuevosErrores) {
        errores.addAll(nuevosErrores);
    }

    public List<TokenInfo> getTokens() {
        return tokens;
    }

    public List<ErrorInfo> getErrores() {
        return errores;
    }

    public boolean tieneErrores() {
        return !errores.isEmpty();
    }

    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }

    public void setTablaSimbolos(TablaSimbolos tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    public String getCodigoIntermedio() {
        return codigoIntermedio;
    }

    public void setCodigoIntermedio(String codigoIntermedio) {
        this.codigoIntermedio = codigoIntermedio;
    }
}