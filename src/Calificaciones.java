import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {


        public static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] arg) throws IOException {
            System.out.println("Introduce nombre del participante: ");
            String participante = scan.readLine();
            int [] cal = new int[5];
            for( int c =0; c<cal.length; c++){
                int n=c+1;
                System.out.println("Introduce la calificacion "+n+" : ");
                cal[c]= Integer.parseInt(scan.readLine());

            }
            double promedio = promediar(cal);
            char caliF = calificacion(promedio);
            mostrarData(participante, cal, promedio, caliF);

        }

        private static void mostrarData(String participante, int[] cal, double promedio, char caliF) {
            System.out.println("Nombre del participante: "+ participante);
            for(int c=0;c<cal.length;c++){
                int n=c+1;
                System.out.println("Calificación "+n+": "+cal[c]);
            }
            System.out.println("Promedio: "+promedio);
            System.out.println("Calificación: "+caliF);
        }

        public static double promediar(int rang[]){
            int sum=0;
            for(int c=0;c<rang.length;c++){
                sum= sum+rang[c];
            }
            double promediar=sum/rang.length;
            return promediar;
        }
        public static char calificacion(double promedio){
            if(promedio>90)
                return 'A';
            else if (promedio>80)
                return 'B';
            else if (promedio>70)
                return 'C';
            else if (promedio>60)
                return 'D';
            else if (promedio>50)
                return 'E';
            else return 'F';
        }


}

