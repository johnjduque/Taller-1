package com.taller1.tour.App;

import com.taller1.tour.domain.Corredor;
import com.taller1.tour.domain.Equipo;
import com.taller1.tour.domain.Etapa;
import com.taller1.tour.domain.Tour;

import java.util.concurrent.atomic.AtomicInteger;

public class AppTour {
    public static void main(String[] args) {
        //Se crea tour
        Tour tour = new Tour();

        //Se crean los equipos
        Equipo ineos = new Equipo((byte) 1,"Ineos", "Reino Unido");
        Equipo bora = new Equipo((byte) 2, "Bora", "Alemania");
        Equipo ef = new Equipo((byte) 3, "EF", "Estados Unidos");
        Equipo arkea = new Equipo((byte) 4, "Arkéa", "Francia");
        Equipo astana = new Equipo((byte) 5, "Astana", "Kazajistán");

        //Se crean los corredores
        Corredor edgan = new Corredor((byte) 1, "Edgan", "COL", (byte) 25, ineos);
        Corredor andrey = new Corredor((byte) 2, "Andrey", "CTR", (byte) 30, ineos);
        Corredor richard = new Corredor((byte) 3, "Richard", "ECU", (byte) 28, ineos);
        Corredor jonathan = new Corredor((byte) 4, "Jonathan", "ESP", (byte) 19, ineos);
        Corredor michal = new Corredor((byte) 5, "Michal", "POL", (byte) 32, ineos);
        Corredor luke = new Corredor((byte) 6, "Luke", "GBR", (byte) 18, ineos);
        Corredor pavel = new Corredor((byte) 7, "Pavel", "RUS", (byte) 35, ineos);
        Corredor peter = new Corredor((byte) 8, "Peter", "SVK", (byte) 27, bora);
        Corredor emanuel = new Corredor((byte) 9, "Emanuel", "ALM", (byte) 22, bora);
        Corredor felix = new Corredor((byte) 10, "Felix", "AUS", (byte) 25, bora);
        Corredor lennard = new Corredor((byte) 11, "Lennard", "ALM", (byte) 29, bora);
        Corredor gregor = new Corredor((byte) 12, "Gregor", "AUS", (byte) 32, bora);
        Corredor daniel = new Corredor((byte) 13, "Daniel", "ITA", (byte) 23, bora);
        Corredor lukas = new Corredor((byte) 14, "Lukas", "AUS", (byte) 36, bora);
        Corredor rigoberto = new Corredor((byte) 15, "Rigoberto", "COL", (byte) 35, ef);
        Corredor alberto = new Corredor((byte) 16, "Alberto", "ITA", (byte) 33, ef);
        Corredor hugh = new Corredor((byte) 17, "Hugh", "GBR", (byte) 25, ef);
        Corredor sergio = new Corredor((byte) 18, "Sergio", "COL", (byte) 32, ef);
        Corredor jens = new Corredor((byte) 19, "Jens", "BEL", (byte) 28, ef);
        Corredor danie1 = new Corredor((byte) 20, "Daniel", "COL", (byte) 19, ef);
        Corredor neisol = new Corredor((byte) 21, "Neisol", "USA", (byte) 30, ef);
        Corredor nairo = new Corredor((byte) 22, "Nairo", "COL", (byte) 29, arkea);
        Corredor winner = new Corredor((byte) 23, "Winner", "COL", (byte) 32, arkea);
        Corredor warren = new Corredor((byte) 24, "Warren", "FRA", (byte) 24, arkea);
        Corredor kevin = new Corredor((byte) 25, "Kevin", "FRA", (byte) 26, arkea);
        Corredor dayer = new Corredor((byte) 26, "Dayer", "COL", (byte) 36, arkea);
        Corredor diego = new Corredor((byte) 27, "Diego", "ITA", (byte) 24, arkea);
        Corredor clement = new Corredor((byte) 28, "Clemént", "FRA", (byte) 26, arkea);
        Corredor miguel = new Corredor((byte) 29, "Miguel", "COL", (byte) 28, astana);
        Corredor omar = new Corredor((byte) 30, "Omar", "ESP", (byte) 33, astana);
        Corredor hugo = new Corredor((byte) 31, "Hugo", "CAN", (byte) 19, astana);
        Corredor gorka = new Corredor((byte) 32, "Gorka", "ESP", (byte) 25, astana);
        Corredor ion = new Corredor((byte) 33, "Ion", "ESP", (byte) 18, astana);
        Corredor alexei = new Corredor((byte) 34, "Alexei", "KZ", (byte) 28, astana);
        Corredor harold = new Corredor((byte) 35, "Harold", "COL", (byte) 28, astana);

        //Se crean las etapas
        Etapa etapa1 = new Etapa((byte) 1, "Niza", "Niza", "Niza");
        Etapa etapa2 = new Etapa((byte) 2, "Niza", "Niza", "Niza");
        Etapa etapa3 = new Etapa((byte) 3, "Sisteron", "Niza", "Sisteron");
        Etapa etapa4 = new Etapa((byte) 4, "Sisteron - Ociéres - Merlette", "Sisteron", "Ociéres - Merlette");
        Etapa etapa5 = new Etapa((byte) 5, "Gap - Privas", "Gap", "Privas");
        Etapa etapa6 = new Etapa((byte) 6, "Le Teil - Mont Aigoual", "Le Teil", "Mont Aigoual");
        Etapa etapa7 = new Etapa((byte) 7, "Millau - Lavur", "Millau", "Lavur");
        Etapa etapa8 = new Etapa((byte) 8, "Cazères-sur-Garonne - Loudenvielle", "Cazères-sur-Garonne", "Loudenvielle");
        Etapa etapa9 = new Etapa((byte) 9, "Pau - Laruns", "Pau", "Laruns");
        Etapa etapa10 = new Etapa((byte) 10, "Ile d´Oleron - Ile de Ré", "Ile d´Oleron", "Ile de Ré");
        Etapa etapa11 = new Etapa((byte) 11, "Châtelaillon-Plage - Poitiers", "Châtelaillon-Plage", "Poitiers");
        Etapa etapa12 = new Etapa((byte) 12, "Chauvigny - Sarran", "Chauvigny", "Sarran");
        Etapa etapa13 = new Etapa((byte) 13, "Châtel-Guyon - Puy Mary", "Châtel-Guyon", "Puy Mary");
        Etapa etapa14 = new Etapa((byte) 14, "Clermont Ferrand - Lyon", "Clermont Ferrand", "Lyon");
        Etapa etapa15 = new Etapa((byte) 15, "Lyon - Grand Colombier", "Lyon", "Grand Colombier");
        Etapa etapa16 = new Etapa((byte) 16, "La Tour-du-Pin - Villard-de-Lans", "La Tour-du-Pin", "Villard-de-Lans");
        Etapa etapa17 = new Etapa((byte) 17, "Grenoble - Méribel", "Grenoble", "Méribel");
        Etapa etapa18 = new Etapa((byte) 18, "Méribel - La Roche-sur-Foron", "Méribel", "La Roche-sur-Foron");
        Etapa etapa19 = new Etapa((byte) 19, "Bourg-en-Bresse - Champagnole", "Bourg-en-Bresse", "Champagnole");
        Etapa etapa20 = new Etapa((byte) 20, "Lure - Planche des Belles Filles", "Lure", "Planche des Belles Filles");
        Etapa etapa21 = new Etapa((byte) 21, "Mantes-la-Jolie - París", "Mantes-la-Jolie", "París");

        //Inscribir corredores en equipos
        ineos.inscribirCorredores(edgan, andrey, richard, jonathan, michal, luke, pavel);
        bora.inscribirCorredores(peter, emanuel, felix, lennard, gregor, daniel, lukas);
        ef.inscribirCorredores(rigoberto, alberto, hugh, sergio, jens, danie1, neisol);
        arkea.inscribirCorredores(nairo, winner, warren, kevin, dayer,  diego, clement);
        astana.inscribirCorredores(miguel, omar, hugo, gorka, ion, alexei,harold);

        //Inscribir equipos en el Tour
        tour.inscribirEquiposTour(ineos, bora, ef, arkea, astana);

        //Inscribir equipos en la etapa
        etapa1.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa2.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa3.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa4.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa5.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa6.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa7.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa8.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa9.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa10.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa11.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa12.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa13.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa14.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa15.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa16.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa17.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa18.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa19.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa20.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);
        etapa21.inscribirEquiposEtapa(ineos, bora, ef, arkea, astana);

        //Conocer todos los equipos de Tour
        System.out.println("Equipos que participan del Tour:");
        tour.getEquipos().forEach(equipo -> {
            System.out.println("El equipo " + equipo.getNombre() + " participa del Tour 2020");
        });

        //Corredores de un equipo ordenados
        System.out.println();
        System.out.println("Corredores ordenados: Ineos");
        ineos.getCorredoresOrdenados().forEach(corredor -> {
            System.out.println(corredor.getNombre() + " - " + corredor.getEdad());
        });

        System.out.println();
        System.out.println("Corredores ordenados: Bora");
        bora.getCorredoresOrdenados().forEach(corredor -> {
            System.out.println(corredor.getNombre() + " - " + corredor.getEdad());
        });

        //Resultados de etapa
        System.out.println();
        System.out.println("Resultados de etapa");
        System.out.println("El ganador de la etapa " + etapa1.getNombre() + " es: "+ etapa1.resultadosEtapa().getNombre() + " del Equipo: "+ etapa1.resultadosEtapa().getEquipo().getNombre() + " y de Nacionalidad: "+ etapa1.resultadosEtapa().getPais());

        //Top 10
        System.out.println();
        System.out.println("El top 10 del Tour 2020 es:");
        AtomicInteger i = new AtomicInteger();
        tour.getTop10().forEach(corredor -> {
            System.out.println((i.incrementAndGet()) +" Corredor: "+ corredor.getNombre() +" - Equipo: "+ corredor.getEquipo().getNombre() +" - Nacionalidad: "+ corredor.getPais());
        });

    }
}
