/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

/**
 *
 * @author logongas
 */
public enum Operacion {
    
    Sumar("+"),
    Restar("-"),
    Multiplicar("x"),
    Dividir("÷"),
    RestarNegativos("-");
    
    String simbolo;
    
    Operacion(String simbolo) {
        this.simbolo=simbolo;
    }
    
    public String getSimbolo() {
        return this.simbolo;
    }
    
    public int calcular(int a, int b) {
        switch (this) {
            case Sumar:
                return a+b;
            case Restar:
                return a-b;
            case Multiplicar:
                return a*b;
            case Dividir:
                return a/b; 
            case RestarNegativos:
                return a-b;                 
            default:
                throw new RuntimeException("Operacion desconocida:" + this);
        }
    }
    
    public String getTextPrueba(int a, int b) {    
        switch (this) {
            case Sumar:
                if (b>=0) {
                    return a+simbolo+b;
                } else {
                    return a+simbolo+"("+b+")";
                }
            case Restar:
                if (b>=0) {
                    return a+simbolo+b;
                } else {
                    return a+simbolo+"("+b+")";
                }
            case Multiplicar:
                return a+simbolo+b;
            case Dividir:
                return a+simbolo+b;
            case RestarNegativos:
                if (b>=0) {
                    return a+simbolo+b;
                } else {
                    return a+simbolo+"("+b+")";
                }                 
            default:
                throw new RuntimeException("Operacion desconocida:" + this);
        }
    }
    
    public Prueba getPrueba(int a, int b) {
        int realA;
        int realB;
        switch (this) {
            case Sumar:
                realA=a;
                realB=b;
                break;
            case Restar:
                realA=a+b;
                realB=b;
                break;
            case Multiplicar:
                realA=a;
                realB=b;
                break;
            case Dividir:
                realA=a*b;
                realB=b;
                break; 
            case RestarNegativos:
                realA=a;
                realB=b;
                break;                 
            default:
                throw new RuntimeException("Operacion desconocida:" + this);
        }
        
        return new Prueba(realA, realB, 0);
    }

}
