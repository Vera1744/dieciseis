package TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void TestSearchWithSortPrice() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Ticket[] actual = manager.search("Порту", "Жирона");
        Ticket[] expected = {ticket4, ticket5, ticket1, ticket3};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestSearchWithSortPriceWithoutResult() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Ticket[] actual = manager.search("Барселона", "Жирона");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestSearchWithSortPriceOneResult() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Ticket[] actual = manager.search("Валенсия", "Жирона");
        Ticket[] expected = {ticket2};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestCompareToLess() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        int actual = ticket2.compareTo(ticket1);
        int expected = -1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestCompareToMore() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        int actual = ticket3.compareTo(ticket1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSearchWithSortBy() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Порту",
                "Жирона",
                250,
                11,
                14
        );

        Ticket ticket2 = new Ticket(
                "Валенсия",
                "Жирона",
                50,
                9,
                12
        );
        Ticket ticket3 = new Ticket(
                "Порту",
                "Жирона",
                350,
                13,
                17
        );
        Ticket ticket4 = new Ticket(
                "Порту",
                "Жирона",
                150,
                11,
                14
        );
        Ticket ticket5 = new Ticket(
                "Порту",
                "Жирона",
                200,
                19,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual;
        actual = manager.searchAndSortBy("Порту", "Жирона", comparator);
        Ticket[] expected = {ticket1, ticket4, ticket5, ticket3};
        Assertions.assertArrayEquals(expected, actual);

    }
}