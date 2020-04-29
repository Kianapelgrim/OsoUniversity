package edu.ujcv.progra1;


//pojo
//plain old java object
//encapsula un objeto

import java.util.ArrayList;
import java.util.List;
public class Alumnos {
    List<String> alumnos;
    private List<Integer> años;

    public Alumnos(String name) {
    }
// CRUD


    public void agregarAlumno(String name[], int x, int año) {
        alumnos = new ArrayList<String>();
        años = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            alumnos.add(name[i]);
            años.add(año);

        }
    }

    public String retorno(int x) {
        return alumnos.get(x);
    }

    public void agregarclase(String name[], int x) {
        alumnos = new ArrayList<String>();
        for (int i = 0; i < x; i++) {
            alumnos.add(name[i]);
        }
    }


    public void mostrarAlumnos(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(alumnos.get(i) + "  ");

        }
    }

    public int size() {

        return alumnos.size();

    }


    public void mostrarAlumno(int x) {
        System.out.println(alumnos.get(x));

    }


    public void borrarAlumno(int idx) {
        alumnos.remove(idx);
    }

    public Alumnos() {
    }

}