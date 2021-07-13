/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulo3;

/**
 *
 * @author jun frncico
 */
public class Estudiante {

    //Private hace que los atributos sean accedidos dentro de la clase
    private String nombre;
    private String carrera;
    private String campus;
    private int edad;
    private String sexo;
    private double promedio;

//Métodos públicos para acceder a los datos
    public String getNombre(){
        return nombre;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getCampus(){
        return campus;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public double getPromedio(){
        return promedio;
    }

    //Métodos públicos para establecer los datos

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setCampus(String campus){
        this.campus = campus;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
}

