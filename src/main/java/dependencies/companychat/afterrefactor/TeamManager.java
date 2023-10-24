package dependencies.companychat.afterrefactor;

import java.util.HashMap;
import java.util.Map;

/* klasa Mediatora */
public class TeamManager {

    private Map<String, EmployeeWrapper> empployees  = new HashMap<>();

    public void addEmployee(EmployeeWrapper emp) {
        empployees.put(emp.getId(), emp);
    }

    public void sendMessageToEveryone(String message, Employee fromEmployee) {
        for(Map.Entry<String, EmployeeWrapper> pair : empployees.entrySet()) {
            if(!fromEmployee.getId().equals(pair.getKey())) {
                pair.getValue().receiveMessage(message, fromEmployee.getName());
            }
        }
    }
}
