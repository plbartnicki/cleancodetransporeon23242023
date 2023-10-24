package dependencies.companychat.afterrefactor;


import java.util.Objects;

public class EmployeeWrapper {
    private Employee employee;
    private TeamManager teamManager;

    public EmployeeWrapper(Employee employee, TeamManager teamManager) {
        this.employee = employee;
        this.teamManager = teamManager;
    }

    public void sendMessageToEveryone(String message) {
        teamManager.sendMessageToEveryone(message, employee);
    }

    public void receiveMessage(String message, String fromEmployeeName) {
        System.out.println(String.format("%s has received message %s from %s", employee.getName(), message, fromEmployeeName));
    }

    public String getId() {
        return employee.getId();
    }


    public String getName() {
        return employee.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWrapper that = (EmployeeWrapper) o;
        return Objects.equals(employee, that.employee) && Objects.equals(teamManager, that.teamManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, teamManager);
    }
}
