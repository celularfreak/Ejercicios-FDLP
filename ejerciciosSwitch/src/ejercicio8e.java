import java.util.Scanner;

public class ejercicio8e{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Indica una data a continuació.");
		
		System.out.print("\nDia: ");
		int dia = sc.nextInt();
		System.out.print("Mes: ");
		int mes = sc.nextInt();
		System.out.print("Any: ");
		int any = sc.nextInt();
		
		if ((dia > 31 || mes > 12 || any < 1900) || ((mes == 4 || mes == 6 || mes == 9 || mes ==11) && dia >30)) {System.out.print("La data que has introduit no es correcta");
		} else 
			if (any % 4 == 0) {
					
						switch (mes) {
							case 1: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/gener/"+any+" han transcorregut "+(dia-1)+" dies"); break;
							case 2: if (dia>29) {System.out.print("La data que has introduit no es correcta");
										} else {System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/febrer/"+any+" han transcorregut "+(dia+30)+" dies");} break;				
							case 3: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/marc/"+any+" han transcorregut "+(dia+59)+" dies"); break;
							case 4: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/abril/"+any+" han transcorregut "+(dia+90)+" dies"); break;
							case 5: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/maig/"+any+" han transcorregut "+(dia+120)+" dies"); break;
							case 6: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/juny/"+any+" han transcorregut "+(dia+151)+" dies"); break;
							case 7: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/juliol/"+any+" han transcorregut "+(dia+181)+" dies"); break;
							case 8: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/agost/"+any+" han transcorregut "+(dia+212)+" dies"); break;
							case 9: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/septembre/"+any+" han transcorregut "+(dia+243)+" dies"); break;
							case 10: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/octubre/"+any+" han transcorregut "+(dia+274)+" dies"); break;
							case 11: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/novembre/"+any+" han transcorregut "+(dia+305)+" dies"); break;
							case 12: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/decembre/"+any+" han transcorregut "+(dia+335)+" dies"); break;}
					
					
					} else {
					
					switch (mes) {
						case 1: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/gener/"+any+" han transcorregut "+(dia-1)+" dies"); break;
						case 2:  if (dia>28) {System.out.print("La data que has introduit no es correcta");
										} else {System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/febrer/"+any+" han transcorregut "+(dia+30)+" dies");} break;
						case 3: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/marc/"+any+" han transcorregut "+(dia+58)+" dies"); break;
						case 4: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/abril/"+any+" han transcorregut "+(dia+89)+" dies"); break;
						case 5: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/maig/"+any+" han transcorregut "+(dia+119)+" dies"); break;
						case 6: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/juny/"+any+" han transcorregut "+(dia+150)+" dies"); break;
						case 7: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/juliol/"+any+" han transcorregut "+(dia+180)+" dies"); break;
						case 8: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/agost/"+any+" han transcorregut "+(dia+211)+" dies"); break;
						case 9: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/septembre/"+any+" han transcorregut "+(dia+242)+" dies"); break;
						case 10: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/octubre/"+any+" han transcorregut "+(dia+273)+" dies"); break;
						case 11: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/novembre/"+any+" han transcorregut "+(dia+304)+" dies"); break;
						case 12: System.out.print("«Entre el 01/gener/"+any+" i el "+dia+"/decembre/"+any+" han transcorregut "+(dia+334)+" dies"); break;}
					}
					
			sc.close();
		
	}	
					
	}


