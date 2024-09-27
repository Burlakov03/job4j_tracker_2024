package collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = citizens.containsKey(citizen.getUsername());
        if (!result) {
            citizens.put(citizen.getPassport(), citizen);
        }
        return result;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
