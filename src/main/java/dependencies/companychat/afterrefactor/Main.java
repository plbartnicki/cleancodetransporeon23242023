package dependencies.companychat.afterrefactor;


public class Main {
    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();
        EmployeeWrapper emp1 = new EmployeeWrapper(new Employee("123", "kasia"), teamManager);
        EmployeeWrapper emp2 = new EmployeeWrapper(new Employee("444", "basia"), teamManager);
        EmployeeWrapper emp3 = new EmployeeWrapper(new Employee("555", "zosia"), teamManager);
        teamManager.addEmployee(emp1);
        teamManager.addEmployee(emp2);
        teamManager.addEmployee(emp3);

        emp1.sendMessageToEveryone("Hello team!");
    }
}
