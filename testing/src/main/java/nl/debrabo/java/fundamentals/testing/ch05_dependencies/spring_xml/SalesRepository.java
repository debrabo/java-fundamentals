package nl.debrabo.java.fundamentals.testing.ch05_dependencies.spring_xml;

import java.util.List;

public interface SalesRepository {

    public List<Sale> loadSales();

}
