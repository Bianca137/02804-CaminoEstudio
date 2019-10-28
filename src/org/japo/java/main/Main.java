/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        // Promedio diario en Kilómetros que recorre al isntituto, ida y vuelta.
        //Distancia entre Sagunto y Santiago son 980Km.
        // Calcular y mostrar el numero de días de clase, en los que la distancia acumulada en sus desplazamientos bastaría para recorrer el camino Santiago.
        final double ida;
        final double vuelta;
        final double distanciasS = 980;

        //jornadas = CAMINO / traslado;
        try {
            System.out.print("Introduce los kilómetros de ida al instituto: ");
            ida = SCN.nextInt();

            System.out.print("Introduce los kilómetros de vuleta al instituto: ");
            vuelta = SCN.nextInt();

            double total = ida + vuelta;

            System.out.println("Desplazamiento diario (Km).....: " + total);

            double dias = distanciasS / total;

            System.out.printf("Días de Clases/camino........: %d%n",
                    (int) dias < dias ? (int) dias + 1 : (int) dias);

        } catch (Exception e) {
            System.out.println("Error de entrada");

        } finally {
            SCN.nextLine();
        }
    }

}
