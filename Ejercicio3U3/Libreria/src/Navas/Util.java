package Navas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static java.util.Date.from;

public class Util {

    //private Scanner sc= new Scanner(System.in);
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static String leerStr(String mensaje) throws IOException {
        imprimir(mensaje);
        String r = br.readLine();
        return r;
    }

    public static int leerInt(String mensaje) throws IOException {
        int resultado = 0;
       
        while (true) {
            try {
                imprimir(mensaje); //Mensaje
                String str = br.readLine(); //Lectura
                resultado = Integer.parseInt(str); //Conversión
                break;  //Rompe el bucle Infinito

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static float leerFloat(String mensaje) {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                break;

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }

    public static float leerFloat(String mensaje, float inf, float sup) throws IOException {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                }

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }
    
     public static float leerFloats(String mensaje, float inf ) throws IOException {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                if (resultado  >= inf) {
                    break;
                }

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }

    public static byte leerbyte(String mensaje, byte inf, byte sup) {
        byte resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Byte.parseByte(str);
                if (resultado<= sup && resultado >= inf){
                break;
                }
                else{
                imprimir ("\nValor fuera de rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }
    
    public static boolean leerbool(String mensaje) throws IOException{
        print(mensaje);
        String str= br.readLine();
        return str.equals("S")||str.equals("s");
    
    }

    public static double leerdouble(String mensaje) {
        double resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Double.parseDouble(str);
                break;

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }
    
      public static float leerdouble(String mensaje, double inf, double sup) throws IOException {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                }

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
      }
    

    public static short leershort(String mensaje) {
        short resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Short.parseShort(str);
                break;

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }

    public static long leerlong(String mensaje) {
        long resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Long.parseLong(str);
                break;

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");

            }
        }
        return resultado;
    }

    public static Calendar leerCalendar(String mensaje) {
        Calendar resultado = Calendar.getInstance();
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf.parse(str);
                resultado.setTime(date);
                break;

            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");
            }
        }
        return resultado;
    }

    
    
    public static Calendar StringtoCalendar(String fecha) {
        Calendar resultado = Calendar.getInstance();
        
            try {
                
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf.parse(fecha);
                resultado.setTime(date);
                
            } catch (Exception e) {
                imprimir("ERROR: " + e.toString() + "\n");
            }
        
        return resultado;
    }
    
    
    
    public static int CalcularTiempo(Calendar fecha) {
        Calendar hoy = Calendar.getInstance();
        int anios = (hoy.get(Calendar.YEAR) - fecha.get(Calendar.YEAR));
        int mes = (hoy.get(Calendar.MONTH) - fecha.get(Calendar.MONTH));
        int dia = (hoy.get(Calendar.DAY_OF_MONTH) - fecha.get(Calendar.DAY_OF_MONTH));
        if (mes < 0 || (dia < 0 && mes == 0)) {
            anios--;
        }
        return anios;
    }

    public static int CalcularTiempo(Calendar inicio, Calendar fin) {
        Calendar hoy = Calendar.getInstance();
        int anios = (fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR));
        int mes = (fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH));
        int dia = (fin.get(Calendar.DAY_OF_MONTH) - inicio.get(Calendar.DAY_OF_MONTH));
        if (mes < 0 || (dia < 0 && mes == 0)) {
            anios--;
        }
        return anios;
    }

    public static void imprimirFecha(Calendar fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        String strFecha = sdf.format(fecha.getTime());
        imprimir(strFecha);

    }

    public static void imprimirFecha(String mensaje, Calendar fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = sdf.format(fecha.getTime());
        imprimir(mensaje);
        imprimir(strFecha);

    }
    
     public static String mostrarFecha (Calendar fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha.getTime());
     
     }
     public static Object leerEnum(String titulo,String mensaje,Object[] enums){
        imprimir(titulo);
        int i=1;
        for (Object opcion : enums){
        imprimir(i+"."+opcion.toString() + "\n");
        i++;
        }
        byte posicion = leerbyte(mensaje, (byte) 1, (byte) enums.length);
        return enums[posicion - 1];
     }
   

    public static void print(String mensaje) {

        System.out.print(mensaje);
    }

    public static void imprimir(String mensaje) {
        System.out.print(mensaje);
    }
    
    

  
}
