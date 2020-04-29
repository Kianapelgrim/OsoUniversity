package edu.ujcv.progra1;
import java.util.ArrayList;
import java.util.List;

public class ClasesCancel {
    List<String> clase;
    List<Integer> periodos;
    List<Integer> años;


    public void cancelada (String name,int periodo, int año) {
        clase = new ArrayList<String>();
        periodos = new ArrayList<Integer>();
        años = new ArrayList<Integer>();
        clase.add(name);
        años.add(año);
        periodos.add(periodo);
    }
    public void mostrarAlumnos() {
        for (int i = 0; i < clase.size(); i++) {
            System.out.println(clase.get(i)+"  Año: "+años.get(i)+"  Periodo: "+periodos.get(i));
        }}
    public int size (){
        return clase.size();
    }
    public String retorn (int idx) {
        return clase.get(idx);
    }
}



