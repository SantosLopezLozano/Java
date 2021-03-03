/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballo;

/**
 *
 * @author alumno
 */
public class Caballo {
  String nombre;
  int altura;
  double peso;
  String raza;
  int energia;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public Caballo(int altura, double peso) {
    this.altura = altura;
    this.peso = peso;
  }

  public Caballo(String nombre, int altura, double peso, String raza) {
    this.nombre = nombre;
    this.altura = altura;
    this.peso = peso;
    this.raza = raza;
  }

  public int getAltura() {
    return altura;
  }

  public double getPeso() {
    return peso;
  }

  public String getRaza() {
    return raza;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private void estableceNivelDeEstamina() {
    this.energia = (int)(Math.random()*11) + 1;
  }

  private void corre() {
    this.estableceNivelDeEstamina();
    switch(this.energia){
      case 1:
        System.out.print("estoy corriendo...");
    }
    
  }
  
  
  
}


