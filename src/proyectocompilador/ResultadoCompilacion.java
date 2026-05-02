/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;


import java.util.ArrayList;
import java.util.List;

public class ResultadoCompilacion{

    private final List<TokenInfo> tokens;
    private final List<ErrorInfo> errores;

    public ResultadoCompilacion() {
        this.tokens = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public void agregarToken(TokenInfo token) {
        tokens.add(token);
    }

    public void agregarError(ErrorInfo error) {
        errores.add(error);
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
}