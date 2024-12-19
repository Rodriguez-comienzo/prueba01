import java.util.Random;
import java.util.StringTokenizer;
import java.util.StringJoiner;
import java.util.TimeZone;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.OffsetDateTime;
import java.time.Instant;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class EjemplosClases {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar un menú con opciones para el usuario
        System.out.println("Selecciona una opción para ver un ejemplo:");
        System.out.println("1. Ejemplo de String");
        System.out.println("2. Ejemplo de Math");
        System.out.println("3. Ejemplo de Integer");
        System.out.println("4. Ejemplo de System");
        System.out.println("5. Ejemplo de Scanner");
        System.out.println("6. Ejemplo de Métodos adicionales de String");
        System.out.println("7. Ejemplo de StringBuilder");
        System.out.println("8. Ejemplo de constantes y métodos de Math");
        System.out.println("9. Ejemplo de Integer y Float");
        System.out.println("10. Ejemplo de Scanner (nextInt, nextFloat, etc.)");
        System.out.println("11. Ejemplo de Random");
        System.out.println("12. Ejemplo de StringTokenizer");
        System.out.println("13. Ejemplo de StringJoiner");
        System.out.println("14. Ejemplo de TimeZone");
        System.out.println("15. Ejemplo de LocalDate");
        System.out.println("16. Ejemplo de LocalTime");
        System.out.println("17. Ejemplo de LocalDateTime");
        System.out.println("18. Ejemplo de ZoneId");
        System.out.println("19. Ejemplo de ZonedDateTime");
        System.out.println("20. Ejemplo de ZoneOffset");
        System.out.println("21. Ejemplo de OffsetDateTime");
        System.out.println("22. Ejemplo de Instant");
        System.out.println("23. Ejemplo de Period");
        System.out.println("24. Ejemplo de Duration");

        // Leer la opción seleccionada por el usuario
        int opcion = scanner.nextInt();

        // Usar un switch para decidir qué ejemplo ejecutar según la opción seleccionada
        switch (opcion) {
            case 1:
                // Ejemplo de String
                String mensaje = "Hola, Mundo!";
                System.out.println("Mensaje original: " + mensaje);
                System.out.println("Longitud del mensaje: " + mensaje.length());
                
            case 2:
                // Ejemplo de Math
                double raiz = Math.sqrt(25);
                System.out.println("Raíz cuadrada de 25: " + raiz);
                
            case 3:
                // Ejemplo de Integer
                int num = Integer.parseInt("100");
                System.out.println("Número convertido: " + num);
                
            case 4:
                // Ejemplo de System
                System.out.println("Sistema operativo: " + System.getProperty("os.name"));
                
            case 5:
                // Ejemplo de Scanner
                System.out.println("Introduce tu nombre:");
                String nombre = scanner.next();
                System.out.println("Hola, " + nombre + "!");
                
            case 6:
                // Ejemplo de Métodos adicionales de String
                String frase = "   Java es genial!   ";
                System.out.println("Trim: " + frase.trim());
                
            case 7:
                // Ejemplo de StringBuilder
                StringBuilder sb = new StringBuilder();
                sb.append("Hola, ").append("Mundo!");
                System.out.println(sb.toString());
                
            case 8:
                // Ejemplo de constantes y métodos de Math
                System.out.println("PI: " + Math.PI);
                
            case 9:
                // Ejemplo de Integer y Float
                Integer numEntero = Integer.valueOf("42");
                System.out.println("Integer: " + numEntero);
                Float numFloat = Float.valueOf("3.14f");
                System.out.println("Float: " + numFloat);
                
            case 10:
                // Ejemplo de Scanner (nextInt, nextFloat, etc.)
                System.out.println("Introduce un número entero:");
                int entero = scanner.nextInt();
                System.out.println("Introduce un número flotante:");
                float flotante = scanner.nextFloat();
                System.out.println("Número entero: " + entero + ", Número flotante: " + flotante);
                
            case 11:
                // Ejemplo de Random
                Random random = new Random();
                System.out.println("Número aleatorio entre 0 y 100: " + random.nextInt(100));
                
            case 12:
                // Ejemplo de StringTokenizer
                StringTokenizer tokenizer = new StringTokenizer("Hola, cómo estás?");
                while (tokenizer.hasMoreTokens()) {
                    System.out.println("Token: " + tokenizer.nextToken());
                }
                
            case 13:
                // Ejemplo de StringJoiner
                StringJoiner joiner = new StringJoiner(", ");
                joiner.add("Manzana").add("Banana").add("Cereza");
                System.out.println("Frutas: " + joiner.toString());
                
            case 14:
                // Ejemplo de TimeZone
                TimeZone zone = TimeZone.getDefault();
                System.out.println("Zona horaria predeterminada: " + zone.getID());
                
            case 15:
                // Ejemplo de LocalDate
                LocalDate fecha = LocalDate.now();
                System.out.println("Fecha actual: " + fecha);
                
            case 16:
                // Ejemplo de LocalTime
                LocalTime hora = LocalTime.now();
                System.out.println("Hora actual: " + hora);
                
            case 17:
                // Ejemplo de LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.now();
                System.out.println("Fecha y hora actual: " + fechaHora);
                
            case 18:
                // Ejemplo de ZoneId
                ZoneId zoneId = ZoneId.systemDefault();
                System.out.println("Zona horaria predeterminada: " + zoneId);
                
            case 19:
                // Ejemplo de ZonedDateTime
                ZonedDateTime zonedDateTime = ZonedDateTime.now();
                System.out.println("Fecha y hora con zona horaria: " + zonedDateTime);
                
            case 20:
                // Ejemplo de ZoneOffset
                ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
                System.out.println("Zona horaria con desplazamiento: " + zoneOffset);
                
            case 21:
                // Ejemplo de OffsetDateTime
                OffsetDateTime offsetDateTime = OffsetDateTime.now();
                System.out.println("Fecha y hora con desplazamiento: " + offsetDateTime);
                
            case 22:
                // Ejemplo de Instant
                Instant instant = Instant.now();
                System.out.println("Instant actual: " + instant);
                
            case 23:
                // Ejemplo de Period
                LocalDate start = LocalDate.of(2020, 1, 1);
                LocalDate end = LocalDate.of(2023, 1, 1);
                Period period = Period.between(start, end);
                System.out.println("Periodo: " + period);
                
            case 24:
                // Ejemplo de Duration
                LocalTime startTime = LocalTime.of(10, 0);
                LocalTime endTime = LocalTime.of(12, 0);
                Duration duration = Duration.between(startTime, endTime);
                System.out.println("Duración: " + duration);
        }
    }
}

//hola github!!soy tu primer push/comit