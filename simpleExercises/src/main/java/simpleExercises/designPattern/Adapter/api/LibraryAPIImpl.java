package simpleExercises.designPattern.Adapter.api;

import java.time.LocalDate;

public class LibraryAPIImpl implements LibraryAPI {
    @Override
    public boolean isAviable(String bookTitle) {
        System.out.println("Sprawdzam dostepnosc " + bookTitle);

        return false;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Sprawdzam date zwrotu dla " + bookTitle);

        return null;
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Rezerwuje " + bookTitle);

        return false;
    }
}
