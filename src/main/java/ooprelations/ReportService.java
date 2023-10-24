package ooprelations;

import java.util.HashSet;
import java.util.Set;

public class ReportService {
    private final ExtrenalService extrenalService;
    private Set<Person> personSet = new HashSet<>();

    public ReportService(ExtrenalService extrenalService) {
        this.extrenalService = extrenalService;
    }
}
