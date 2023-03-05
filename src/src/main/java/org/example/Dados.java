package org.example;

public class Dados {

    //Crea una clase modelizando un dado para jugar. Esta clase tiene:

    //dos atributos de instancia: uno que permite conocer el número de caras que tiene el dado y otro para almacenar la última cara que se extrajo;

    //dos constructores: uno que recibe como argumento el número de caras para el dado a crear y el otro, sin argumentos, que crea un clásico dado de seis caras;

    //métodos getter para los dos atributos;

    //un método setter, solo para cambiar el número de caras;

    //un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.

    //Escribir un algoritmo principal usando esta clase para crear tres dados: uno tiene seis caras, otro tiene diez caras y el último tiene doce caras. Los tres dados se lanzan hasta que la suma de los dados sea mayor o igual a veinte.


    private int caras;
    private int ultimaCara;

    public Dados(int caras){
        this.caras = caras;
    }

    public Dados(){
        this.caras = 6;
    }

    public int getCaras(){
        return this.caras;
    }

    public int getUltimaCara(){
        return this.ultimaCara;
    }

    public void setCaras(int caras){
        this.caras = caras;
    }

    public int tirarDado(){
        this.ultimaCara = (int) (Math.random() * this.caras + 1);
        return this.ultimaCara;
    }

    public static void main(String[] args) {
        Dados dado1 = new Dados();
        Dados dado2 = new Dados(10);
        Dados dado3 = new Dados(12);

        int suma = 0;

        while(suma < 20){
            suma = dado1.tirarDado() + dado2.tirarDado() + dado3.tirarDado();
            System.out.println("Suma: " + suma);
        }
    }


}
