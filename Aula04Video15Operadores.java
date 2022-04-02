package academy.devdojo.maratonajava.introducao;
 /*
 Operadores que temos + - / *
 Outro operador é o resto simbolizado por %

 Outro operador que também utilizamos é < menor > maior  <= menor ou igual >= maior ou igual == comparação != diferença
  esses operadores  sempre irão retornar valores booleanos
  */
public class Aula04Video15Operadores {
        public static void main (String []args)
        {
            // + - / *
            int number01 = 10;
            int number02 = 20;
            double result = number01 / (double) number02;

            System.out.println ("Resultado: " +result);

            // %
            int rest = 21 % 7;
            System.out.println(rest);

            // < > <= >= == !=

            boolean isTenGreaterThanTwenty = 10 > 20;
            boolean isTenLessThanTwenty = 10 < 20;
            boolean isTenEqualsThanDez = 10 == 10;
            boolean isTenEqualsThanTwenty = 10 == 20;
            boolean isTenDifferentThanTwenty = 10 != 20;

            System.out.println( "Is Ten Greater Than Twenty=  " + isTenGreaterThanTwenty);
            System.out.println( "Is Ten Less Than Twenty= "  + isTenLessThanTwenty);
            System.out.println( "Is Ten Equals Than Dez= " + isTenEqualsThanDez);
            System.out.println( "Is Ten Different Than Dez= " + isTenDifferentThanTwenty);

        }

}
