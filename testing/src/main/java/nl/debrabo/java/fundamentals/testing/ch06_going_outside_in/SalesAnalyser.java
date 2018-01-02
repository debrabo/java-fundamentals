package nl.debrabo.java.fundamentals.testing.ch06_going_outside_in;

import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class SalesAnalyser
{
    private final SalesRepository repository;

    public SalesAnalyser(SalesRepository repository)
    {
        this.repository = repository;
    }

    public Map<String, Integer> tallyStoreSales()
    {
        return repository.loadSales()
                         .stream()
                         .collect(
                             groupingBy(Sale::getStore,
                                 summingInt(Sale::getValue)));
    }
}
