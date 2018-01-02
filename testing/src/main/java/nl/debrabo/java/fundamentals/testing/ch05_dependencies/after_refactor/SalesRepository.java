package nl.debrabo.java.fundamentals.testing.ch05_dependencies.after_refactor;

import java.util.List;

public interface SalesRepository {

    List<Sale> loadSales();

}
