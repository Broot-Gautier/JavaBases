public class DataTypes
{
	public static void main(String[] args)
	{
		boolean bol = true;
		byte bytes = 120; /*desde -128 a 127 default es 0*/
		char caracter = 'a';
		short number = 20; /*16 bits*/
		int numba = 22; /*32 bits*/
		long numbo = 156433; /*64 bits*/
		float flotante = 1.256f; /*32 bits*/
		double doble = 1.23456e300d; /*64 bits*/
		System.out.format("valor de bool: %b bytes: %d character %c float %f\n",bol,bytes,caracter,flotante);
	}
}
