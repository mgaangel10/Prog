package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception, ExceptionS, NumDinero, Operar,Codigo {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Caja c = null;
		double dineroCaja = 0;
		int numVentas = 0, numTickets = 0, numOperRealizadas = 0;
		int op = 0;
		do {
			try {
				System.out.println("Indique su codigo de trabajador");
				String codigoEmpleado = scan.nextLine();
				System.out.println("indique el dinero en caja");
				dineroCaja = scan.nextDouble();
				System.out.println("indique numero de ventas ");

				numVentas = scan.nextInt();
				System.out.println("indique numero de tickets");
				numTickets = scan.nextInt();

				System.out.println("indique el numero de operaciones realizadas");
				numOperRealizadas = scan.nextInt();
				System.out.println("deseas salir del programa?");

				c = new Caja(numVentas, numTickets, numOperRealizadas, dineroCaja,codigoEmpleado);
				System.out.println("pulse 0: para ver resultados ");
				op = scan.nextInt();
				c.hacerCaja();
				c.numVentas();
				c.codigoEmpl();
				c.numDineroYTickets();
				c.operaciones();
			}catch(Codigo co) {
				System.err.println("el codigo debe contener una letra y 4 numeros");
			}
			catch (ArithmeticException a) {
				System.err.println("has puesto un int");
				
			} catch (Operar o) {
				System.err.println("el numero de operaciones no coincide");
				System.out.println(o.getMessage());
			} catch (NumDinero d) {
				System.err.println("el dinero de la caja no coincide con el  numero de tickets");
			} catch (ExceptionS e2) {

			} catch (Exception e) {
				System.err.println("El dinero que hay en la caja no coincide con el numero de ventas"+e.getMessage());

			} finally {
				System.out.println("nose");
			}

		} while (dineroCaja != numVentas || dineroCaja != numTickets || numVentas != numTickets || op == 0);

	}

}
