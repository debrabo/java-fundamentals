package nl.debrabo.java.fundamentals.testing.ch05_dependencies.before_refactor;

import java.util.List;

public interface SalesRepository {

    public List<Sale> loadSales();

}
