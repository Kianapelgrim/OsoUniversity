package edu.ujcv.progra1;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] arg) {
        List<String> queue;
        List<String> queueA;
        List<String> queuec;
        List<String> queueD;
        List<String> queueE;
        List<String> queueF;
        List<String> queueG;
        int sizeC=0;
        int sizeD=0;
        int sizeE=0;
        int sizeF=0;
        int sizeG=0;
        int cantAlumnos = 0;
        int año = 2008;
        int parcial = 1;
        int sizeA = 0;
        int sizeB = 0;
        int k[];
        k = new int[1000000];
        int aluRepro=0;
        ListaDeNom nom = new ListaDeNom();
        ClasesCancel cc = new ClasesCancel();
        Alumnos claseA = new Alumnos();
        Alumnos claseB = new Alumnos();
        Alumnos claseD = new Alumnos();
        Alumnos claseC = new Alumnos();
        Alumnos claseE = new Alumnos();
        Alumnos claseF = new Alumnos();
        Alumnos claseG = new Alumnos();
        Alumnos Todos = new Alumnos();
        Random rdm = new Random();
        String[] name;
        String[] nameb;
        String[] namec;
        String[] nameD;
        String[] nameE;
        String[] nameF;
        String[] nameG;
        name = new String[1];
        int resp=0;
        boolean[][] approved;
        int periodo = 1;
        queue = new ArrayList<String>();
        queuec = new ArrayList<String>();
        queueA = new ArrayList<String>();
        queueD = new ArrayList<String>();
        queueE = new ArrayList<String>();
        queueG = new ArrayList<String>();
        queueF = new ArrayList<String>();
        String nameA[];
        nameA = new String[20];
        nameb = new String[11];
        namec = new String[11];
        nameD = new String[11];
        nameE = new String[11];
        nameF = new String[11];
        nameG = new String[11];
        int clas[][];
        clas = new int[8][1000000];
        int app[][];
        app = new int[8][1000000];
        int szA = 0;
        name = new String[10000];
        int[][][] cancelled = new int[8][4][3000];
        do {
            do {
                System.out.println("PARCIAL= " + parcial + " DEL PERIODO " + periodo + " DEL AÑO " + año);
                if (parcial == 1) {
                    for (int i = 1; i < 8 ; i++) {
                        cancelled [i][periodo][año]= 0;
                    }

                    if (queueD.size()>0){
                        int per = periodo-1;
                        int yr = año;
                        if (periodo == 1) {
                            per = 3;
                            yr = año-1;
                        }
                        if (cancelled[4][per][yr] == 0) {
                            for (int i = 0; i < claseD.size(); i++) {
                                queueD.remove(0);
                            }}}

                    if (queueG.size()>0){
                        int per = periodo-1;
                        int yr = año;
                        if (periodo == 1) {
                            per = 3;
                            yr = año-1;
                        }
                        if (cancelled[3][per][yr] == 0) {
                            for (int i = 0; i < claseG.size(); i++) {
                                queueG.remove(0);
                            }}}
                    if (periodo > 1 || año > 2008) {
                        //AL FINALIZAR EL PRIMER PERIODO, SE REVISAN LOS ALUMNOS QUE APRUEBAN LA CLASE A Y B
                        app = new int[8][cantAlumnos];

                        for (int i = 0; i < szA; i++) {
                            queueA.remove(0);
                        }
                        do {
                            int o = -1;
                            int l = 0;
                            while (l < cantAlumnos) {


                                if (name[l].equals(claseA.retorno(0)) == true) {
                                    o++;
                                    int des = rdm.nextInt(2);
                                    int apr = rdm.nextInt(2);
                                    if (des == 0)
                                        des = des + apr;
                                    if (des == 1) {
                                        claseA.borrarAlumno(0);
                                        clas[1][l] = 1;
                                        app[1][o] = 1;
                                    }
                                    //  queueB.add(name[i]);}
                                    if (des == 0) {
                                        claseA.borrarAlumno(0);
                                        clas[1][l] = 0;
                                        app[1][o] = 0;
                                    }
                                    if (claseA.size() == 0) {
                                        l = name.length;
                                    }
                                }
                                l++;
                            }
                        } while (claseA.size() != 0);
                        for (int i = 0; i < szA; i++) {
                            if (app[1][i] == 0) {
                                queueA.add(nameA[i]);
                            }
                        }

                        //REVISIÓN DE ALUMNOS QUE APRUEBAN CLASE B

                        for (int i = 0; i < claseB.size(); i++) {
                            queue.remove(0);
                        }
                        do {
                            int o = -1;
                            int l = 0;
                            while (l < cantAlumnos) {


                                if (name[l].equals(claseB.retorno(0)) == true) {
                                    o++;
                                    int desB = rdm.nextInt(2);
                                    int aprB = rdm.nextInt(2);
                                    if (desB == 0)
                                        desB = desB + aprB;
                                    if (desB == 1) {
                                        claseB.borrarAlumno(0);
                                        clas[2][l] = 1;
                                        app[2][o] = 1;
                                    }
                                    //  queueB.add(name[i]);}
                                    if (desB == 0) {
                                        claseB.borrarAlumno(0);
                                        clas[2][l] = 0;
                                        app[2][o] = 0;
                                    }
                                }
                                if (claseB.size() == 0) {
                                    l = name.length;
                                }
                                l++;
                            }
                            for (int i = 0; i < sizeB; i++) {
                                if (app[2][i] == 0) {
                                    queue.add(nameb[i]);
                                }
                            }
                        }while (claseB.size()!=0);
                    }
                    //REVISIÓN DE CLASE C
                    if (periodo > 2 || año > 2008) {
                        int per = periodo-1;
                        int yr = año;
                        if (periodo == 1) {
                            per = 3;
                            yr = año-1;
                        }
                        if (cancelled[3][per][yr] == 0) {
                            for (int i = 0; i < claseC.size(); i++) {
                                queuec.remove(0);
                            }
                            do {
                                int o = -1;
                                int l = 0;
                                while (l < cantAlumnos) {


                                    if (name[l].equals(claseC.retorno(0)) == true) {
                                        o++;
                                        int desC = rdm.nextInt(2);
                                        int aprC = rdm.nextInt(2);
                                        if (desC == 0)
                                            desC = desC + aprC;
                                        if (desC == 1) {
                                            claseC.borrarAlumno(0);
                                            clas[3][l] = 1;
                                            app[3][o] = 1;
                                        }
                                        //  queueB.add(name[i]);}
                                        if (desC == 0) {
                                            claseC.borrarAlumno(0);
                                            clas[3][l] = 0;
                                            app[3][o] = 0;
                                        }
                                        if (claseC.size() == 0) {
                                            l = name.length;
                                        }
                                    }
                                    l++;
                                }


                                for (int i = 0; i < sizeC; i++) {
                                    if (app[3][i] == 0) {
                                        queuec.add(namec[i]);
                                    }

                                }
                            }while (claseC.size()!=0);
                        }
                    }
                    //REVISIÓN DE CLASE E
                    if (año > 2008) {
                        int per = periodo-1;
                        int yr = año;
                        if (periodo ==1) {
                            per = 3;
                            yr = año-1;
                        }
                        if (cancelled[5][per][yr] == 0) {

                            for (int i = 0; i < claseE.size(); i++) {
                                queueE.remove(0);
                            }
                            do {
                                int o = -1;
                                int l = 0;
                                while (l < cantAlumnos) {

                                    if (name[l].equals(claseE.retorno(0)) == true) {
                                        o++;
                                        int desE = rdm.nextInt(2);
                                        int aprE = rdm.nextInt(2);
                                        if (desE == 0)
                                            desE = desE + aprE;
                                        if (desE == 1) {
                                            claseE.borrarAlumno(0);
                                            clas[5][l] = 1;
                                            app[5][o] = 1;
                                        }
                                        //  queueB.add(name[i]);}
                                        if (desE == 0) {
                                            claseE.borrarAlumno(0);
                                            clas[5][l] = 0;
                                            app[5][o] = 0;
                                        }

                                        if (claseE.size() == 0) {
                                            l = name.length;
                                        }
                                    }
                                    l++;
                                }
                                for (int i = 0; i < sizeE; i++) {
                                    if (app[5][i] == 0) {
                                        queueE.add(nameE[i]);
                                    }
                                    //for (int i = 0; i < 10; i++) {
                                    // nameb[i] = queueB.poll();
                                }
                            }while(claseE.size()!=0);
                        }
                    }

                    //REVISIÓN DE CLASE F
                    if (año > 2008) {
                        int per = periodo-1;
                        int yr = año;
                        if (periodo ==1) {
                            per = 3;
                            yr = año-1;
                        }
                        if (cancelled[6][per][yr] == 0) {

                            for (int i = 0; i < claseF.size(); i++) {
                                queueF.remove(0);
                            }
                            do {
                                int o = -1;
                                int l = 0;
                                while (l < cantAlumnos) {


                                    if (name[l].equals(claseF.retorno(0)) == true) {
                                        o++;
                                        int desF = rdm.nextInt(2);
                                        int aprF = rdm.nextInt(2);
                                        if (desF == 0)
                                            desF = desF + aprF;
                                        if (desF == 1) {
                                            claseF.borrarAlumno(0);
                                            clas[6][l] = 1;
                                            app[6][o] = 1;
                                        }
                                        //  queueB.add(name[i]);}
                                        if (desF == 0) {
                                            claseF.borrarAlumno(0);
                                            clas[6][l] = 0;
                                            app[6][o] = 0;
                                        }
                                        if (claseF.size() == 0) {
                                            l = name.length;
                                        }
                                    }
                                    l++;
                                }

                                for (int i = 0; i < sizeF; i++) {
                                    if (app[6][i] == 0) {
                                        queueF.add(nameF[i]);
                                    }
                                    //for (int i = 0; i < 10; i++) {
                                    // nameb[i] = queueB.poll();
                                }
                            }while (claseF.size()!=0);
                        }
                    }




                    if (
                            año > 2008 && parcial == 1) {
                        if (cancelled[5][periodo][año] == 0) {
                            for (int i = 0; i < nameF.length; i++) {
                                if (app[5][i] == 1 && app[6][i] == 1) {
                                    queueF.add(nameE[i]);
                                }
                            }

                            if (queueG.size() > 3) {
                                if (queueG.size()<10){sizeG=queueG.size();}else {sizeG=10;}
                                nameG = new String[sizeG];
                                for (int i = 0; i < sizeG; i++) {
                                    nameG[i] = queueG.get(i);
                                }
                                claseG.agregarclase(nameG, sizeG);
                            } else {
                                cancelled[7][periodo][año]++;
                                cc.cancelada("ClaseG", periodo, año);
                            }
                        }else{cancelled[7][periodo][año]++;
                            cc.cancelada("ClaseG", periodo, año); }
                    }
                    if (periodo > 2 && parcial == 1 || año > 2009 && parcial == 1) {
                        if (cancelled[4][periodo][año] == 0) {
                            for (int i = 0; i < nameD.length; i++) {
                                if (app[4][i] == 1) {
                                    queueF.add(nameD[i]);
                                }
                            }
                            if (queueF.size() > 3) {
                                if(queueF.size()<10){sizeF=queueF.size();}else {sizeF=10;}
                                nameF = new String[sizeD];
                                for (int i = 0; i < sizeE; i++) {
                                    nameF[i] = queueF.get(i);
                                }

                                claseF.agregarclase(nameF, sizeF);

                            } else {
                                cancelled[6][periodo][año]++;
                                cc.cancelada("ClaseF", periodo, año);
                            }
                        }else {  cancelled[6][periodo][año]++;
                            cc.cancelada("ClaseF", periodo, año);}
                    }
                    if (periodo > 1 || año > 2008) {
                        if (cancelled[3][periodo][año] == 0) {
                            for (int i = 0; i < nameb.length; i++) {
                                if (app[2][i] == 1 && app[1][i] == 1) {
                                    queueD.add(nameb[i]);
                                }
                            }
                            if (queueD.size() > 3) {
                                if (queueD.size()<10){sizeD=queueD.size();}else {sizeD=10;}
                                nameD = new String[sizeD];
                                for (int i = 0; i < sizeD; i++) {
                                    nameD[i] = queueD.get(i);
                                }

                                claseD.agregarclase(nameD, sizeD);
                            } else {
                                cancelled[4][periodo][año]++;
                                cc.cancelada("ClaseD", periodo, año);
                            }
                        }else{  cancelled[4][periodo][año]++;
                            cc.cancelada("ClaseD", periodo, año);}
                    }

                    if (periodo > 2 && parcial == 1 || año > 2008 && parcial == 1) {
                        if (cancelled[3][periodo][año] == 0) {
                            for (int i = 0; i < namec.length; i++) {
                                if (app[3][i] == 1) {
                                    queueE.add(namec[i]);
                                }
                            }
                            if (queueE.size() > 3) {
                                if (queueE.size()<10){sizeE=queueE.size();}else{sizeE=10;}
                                nameE = new String[sizeE];
                                for (int i = 0; i < sizeE; i++) {
                                    nameE[i] = queueE.get(i);
                                }
                                claseE.agregarclase(nameE, sizeE);
                            } else {
                                cancelled[5][periodo][año]++;
                                cc.cancelada("ClaseE", periodo, año);
                            }
                        } else{  cancelled[5][periodo][año]++;
                            cc.cancelada("ClaseE", periodo, año);}
                    }
                    if (periodo > 1 || año > 2008) {
                        if (cancelled[2][periodo][año] == 0) {
                            //Seguido de revisar quienes aprueban clase A, al iniciar periodo 2 ingresamos al queue esos estudiantes a claseC

                            for (int i = 0; i < nameA.length; i++) {
                                if (app[1][i] == 1)
                                    queuec.add(nameA[i]);
                            }
                            if (queuec.size() > 3) {
                                if (queuec.size()<10){
                                    sizeC= queuec.size();} else {sizeC=10;}
                                namec = new String[sizeC];
                                if (sizeC > queuec.size())
                                    sizeC = queuec.size();
                                for (int i = 0; i < sizeC; i++) {
                                    namec[i] = queuec.get(i);
                                }
                                claseC.agregarclase(namec, sizeC);
                            } else {
                                cancelled[3][periodo][año]++;
                                cc.cancelada("ClaseC", periodo, año);
                            }
                        }else{ cancelled[3][periodo][año]++;
                            cc.cancelada("ClaseC", periodo, año);}
                    }

                    //RANDOM DE CANTIDAD DE ALUMNOS QUE INGRESARÁN A LA CLASE A
                    sizeA = rdm.nextInt(18) + 3;
                    //RANDOM DE LOS ALUMNOS QUE ENTRAN A QUEUE DE CLASE A
                    for (int i = cantAlumnos; i < sizeA + cantAlumnos; i++) {
                        int x = rdm.nextInt(70) + 1;
                        name[i] = nom.select(x);
                        queueA.add(name[i]);
                        queue.add(name[i]);
                    }
                    Todos.agregarAlumno(name,sizeA,año);

                    if (queueA.size()<20){ szA=queueA.size();}else { szA=20;}
                    nameA = new String[szA];
                    //ALUMNOS DE QUEUE A INGRESAN A CLASE
                    for (int i = 0; i < szA; i++) {
                        nameA[i] = queueA.get(i);
                    }
                    //ALUMNOS QUE ENTRARON A LA CLASE SON ELIMINADOS DEL QUEUE


                    //SE ENVIAN LOS DATOS DEL ALUMNO A LA LISTA
                    claseA.agregarclase(nameA, szA);


                    //TAMAÑO DE B E INGRESO DE ALUMNOS
                    if (queue.size()<10){
                        sizeB=queue.size();}else {
                        sizeB=10;
                    }
                    nameb = new String[sizeB];
                    for (int i = 0; i < sizeB; i++) {
                        nameb[i] = queue.get(i);
                    }

                    claseB.agregarclase(nameb, sizeB);


                    //Random alumnos entran a clase D
                }

                if (parcial == 1) {
                    cantAlumnos = sizeA+cantAlumnos;}
                do {
                    do {int b = 0;
                        do{if (queueD.size()==0||parcial!=3){
                            b=1;
                        }

                            String msj = "Intente de nuevo con un valor valido";
                            System.out.println("Bienvenido a la Universidad José Cecilio Del Valle\n\n\n" +
                                    "¿Qué desea consultar?\n" +
                                    "1= Continuar al proximo parcial\n" +
                                    "2= Alumnos egresados\n" +
                                    "3= Alumnos actuales\n" +
                                    "4= Lista de alumnos inactivos\n" +
                                    "5= Lista de alumnos expulsados\n" +
                                    "6= Lista de clases\n" +
                                    "7= Evaluar ternas\n" +
                                    "8= Salir\n"+
                                    "9= Lista de clases canceladas");
                            LectorDeTeclado lc = new LectorDeTeclado();
                            resp = lc.getInteger(msj);
                            switch (resp) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    System.out.println("Clase A");
                                    claseA.mostrarAlumnos(szA);
                                    System.out.println("Clase B");
                                    claseB.mostrarAlumnos(sizeB);
                                    if (periodo > 1 || año > 2008) {
                                        System.out.println("Clase C");
                                        claseC.mostrarAlumnos(sizeC);
                                    }
                                    if (periodo > 1 || año > 2008) {
                                        if (queueD.size()>3){
                                            System.out.println("Clase D");
                                            claseD.mostrarAlumnos(sizeD);
                                        }}
                                    if (periodo > 2 || año > 2008) {
                                        if (queueE.size()>3){
                                            System.out.println("Clase E");
                                            claseE.mostrarAlumnos(sizeE);
                                        }}
                                    if (periodo > 2 || año > 2008) {
                                        if (queueF.size()>3){
                                            System.out.println("Clase F");
                                            claseF.mostrarAlumnos(sizeF);
                                        }}
                                    if (periodo > 3 || año > 2008) {
                                        if (queueG.size()>3){
                                            System.out.println("Clase g");
                                            claseG.mostrarAlumnos(sizeG);
                                        }}


                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 7:
                                    if (periodo > 1 && parcial == 3 || año > 2008 && parcial == 3) {
                                        b = 1;
                                        if (cancelled[4][periodo][año]==0) {
                                            do{
                                                int i=-1;
                                                for (int l = 0; l < cantAlumnos; l++) {
                                                    if (name[l].equals(claseD.retorno(0))) {
                                                        i++;
                                                        System.out.println("CLASE D \n Desea que el alumno " + name[l] + "\n 1:Apruebe \n 0:No apruebe");
                                                        int desD = lc.getInteger(msj);
                                                        if (desD == 1) {
                                                            claseD.borrarAlumno(0);
                                                            clas[4][l] = 1;
                                                            app[4][i] = 1;}
                                                        //  queueB.add(name[i]);}
                                                        if (desD == 0) {
                                                            claseD.borrarAlumno(0);
                                                            clas[4][l] = 0;
                                                            app[4][i] = 0;
                                                        }
                                                    }
                                                    if(claseD.size()==0)
                                                        l=cantAlumnos;
                                                    b=1;
                                                }

                                            }while(claseD.size()!=0);

                                            for (int i = 0; i < sizeD; i++) {
                                                if (app[4][i] == 0) {
                                                    queueD.add(nameD[i]);
                                                }
                                            }
                                        }else {System.out.println("Clase fue cancelada"); b=1;}
                                    } else {
                                        System.out.println("Porfavor revisar ternas hasta el parcial 3.");}
                                    if (año > 2009 && parcial == 3) {
                                        if (cancelled[7][periodo][año] == 0) {
                                            b = 1;
                                            do {
                                                int i = -1;
                                                for (int l = 0; l < cantAlumnos; l++) {
                                                    if (name[l].equals(claseG.retorno(0))) {
                                                        i++;
                                                        System.out.println("CLASE D \n Desea que el alumno " + name[l] + "\n 1:Apruebe \n 0:No apruebe");
                                                        int desG = lc.getInteger(msj);
                                                        if (desG == 1) {
                                                            claseG.borrarAlumno(0);
                                                            clas[7][l] = 1;
                                                            app[7][i] = 1;}
                                                        //  queueB.add(name[i]);}
                                                        if (desG == 0) {
                                                            claseG.borrarAlumno(0);
                                                            clas[7][l] = 0;
                                                            app[7][i] = 0;
                                                        }
                                                    }
                                                    if(claseG.size()==0)
                                                        l=cantAlumnos;
                                                    b=1;
                                                }

                                            }while(claseG.size()!=0);
                                            for (int i = 0; i < sizeG; i++) {
                                                if (app[7][i] == 0) {
                                                    queueG.add(nameG[i]);
                                                }
                                            }
                                        }else{
                                            System.out.println("Clase G fue cancelada"); b=1;
                                        }}

                                    break;
                                case 6:
                                    System.out.println("Clase A      Clase B\n" +
                                            "   |        |\n" +
                                            "Clase C   -  Clase D\n" +
                                            "   |        |\n" +
                                            "Clase E      Clase F" +
                                            "         |   \n" +
                                            "      Clase G");
                                    break;
                                case 8:
                                    break;
                                case 9: if (cancelled[1][periodo][año]==1||cancelled[2][periodo][año]==1||cancelled[3][periodo][año]==1||cancelled[4][periodo][año]==1||cancelled[5][periodo][año]==1||cancelled[6][periodo][año]==1||cancelled[7][periodo][año]==1){
                                    cc.mostrarAlumnos();}else{
                                    System.out.println("No hubieron clases canceladas.");}
                            }


                            if (b==0){
                                System.out.println("Porfavor revisar ternas pendientes.");
                            }
                        } while (b!=1);
                    } while (resp != 1 && resp != 8&& resp!=7);
                }while (resp>9);
            } while (resp!=1&&resp!=8&&resp!=7);
            parcial++;
            if (parcial == 4) {
                parcial = 1;
                periodo++;
                if (periodo == 4) {
                    periodo = 1;
                    año++;

                }
            }
        } while(resp!=8);


    }
}
