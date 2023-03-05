package org.example;

public class Guerra_barcos3 {
    //En esta nueva versión de la micro guerra de barcos (un único barco de una sola celda), se usa el paradigma de programación orientada a objetos.

    //Cree una clase Cuadricula que tenga:

    //un atributo de instancia de tipo tabla de 10 × 10 casillas;

    //las constantes que estime necesarias;

    //un constructor sin argumentos, que permite inicializar el tablero del juego con agua por todas partes;

    //un método de instancia depositarBarco(), que toma como argumentos las coordenadas de la caja donde colocar el barco;

    //un método de instancia disparar(), que recibe como argumentos las coordenadas de disparo y devuelve verdadero si se ha hundido el barco;

    //un método de instancia visualizacion(), que muestra el tablero de juego de la guerra de barcos.

    //Escribe un algoritmo usando la clase Cuadricula, que permite a un jugador jugar a la micro guerra de barcos.


    private static final int TAMANO = 10;
    private static final int AGUA = 0;
    private static final int BARCO = 1;
    private static final int TOCADO = 2;
    private static final int HUNDIDO = 3;

    private int[][] tablero;

    public Guerra_barcos3(){
        this.tablero = new int[TAMANO][TAMANO];
        for(int i = 0; i < TAMANO; i++){
            for(int j = 0; j < TAMANO; j++){
                this.tablero[i][j] = AGUA;
            }
        }
    }

    public void depositarBarco(int x, int y){
        this.tablero[x][y] = BARCO;
    }

    public boolean disparar(int x, int y){
        if(this.tablero[x][y] == BARCO){
            this.tablero[x][y] = TOCADO;
            return true;
        }else{
            return false;
        }
    }

    public void visualizacion(){
        for(int i = 0; i < TAMANO; i++){
            for(int j = 0; j < TAMANO; j++){
                if(this.tablero[i][j] == AGUA){
                    System.out.print("A ");
                }else if(this.tablero[i][j] == BARCO){
                    System.out.print("B ");
                }else if(this.tablero[i][j] == TOCADO){
                    System.out.print("T ");
                }else if(this.tablero[i][j] == HUNDIDO){
                    System.out.print("H ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Guerra_barcos3 juego = new Guerra_barcos3();
        juego.depositarBarco(5, 5);
        juego.visualizacion();
        System.out.println(juego.disparar(5, 5));
        juego.visualizacion();
    }
    
}
