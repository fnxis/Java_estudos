package estudos.tryCatch;

import estudos.tryCatch.model.entities.Reservation;
import estudos.tryCatch.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number: ");
            int number = input.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkin= sdf.parse(input.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkout= sdf.parse(input.next());

            Reservation reservation = new Reservation(number,checkin, checkout);
            System.out.println("Reservation: "+reservation);

            System.out.println();
            System.out.println("Enter de data  to update the reservation");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin= sdf.parse(input.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout= sdf.parse(input.next());

            reservation.updateDates(checkin,checkout);
            System.out.println("Reservation: "+reservation);



        }catch (ParseException e) {
            System.out.println("Invalid date format");
        }catch (DomainException e) {
            System.out.println("Erro in reservation "+e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

    }
}
