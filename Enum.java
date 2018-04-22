import java.util.Scanner;

enum Day
{
	LUNES,MARTES,MIERCOLES,JUEVES,
	VIERNES,SABADO,DOMINGO;
}

class Enum
{
	Day day;
	public Enum(Day day)
	{
		this.day = day;
	}
	public void dayIsLike()
	{
		switch (day)
		{
			case LUNES:
				System.out.println("Lunes apestan");
				break;
			case MARTES:
				System.out.println("Martes mejor");
				break;
			case MIERCOLES:
				System.out.println("Miercoles aun mejor");
				break;
			case JUEVES:
				System.out.println("Falta un dia");
			default:
				System.out.println("Los findes son mejores");
				break;
		}
	}
	public static void main(String[] args)
	{
		String str = "VIERNES";
		Enum t1 = new Enum(Day.valueOf(str));
		t1.dayIsLike();
	}
}
