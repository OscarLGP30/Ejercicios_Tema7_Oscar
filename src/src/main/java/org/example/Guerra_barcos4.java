package org.example;

public class Guerra_barcos4 {


    //En esta última versión de la micro guerra de barcos, el usuario juega contra la computadora. Los dos jugadores tienen cada uno una cuadrícula de barcos de guerra y esconden el barco. El jugador humano elige la posición del barco. La computadora genera coordenadas al azar para posicionar su barco. Los jugadores disparan por turnos.

    //La computadora dispara sucesivamente en cada celda.


    private static final int TAMANO = 10;
    private static final int AGUA = 0;
    private static final int BARCO = 1;
    private static final int TOCADO = 2;
    private static final int HUNDIDO = 3;

    private int[][] tablero;

    public Guerra_barcos4(){
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
        Guerra_barcos4 juego = new Guerra_barcos4();
        juego.depositarBarco(5, 5);
        juego.visualizacion();
        System.out.println(juego.disparar(5, 5));
        juego.visualizacion();
    }


}
