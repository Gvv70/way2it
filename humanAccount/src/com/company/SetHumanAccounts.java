package com.company;

import java.util.HashMap;
import java.util.Map;

public class SetHumanAccounts  {
    private Map<Human, AccountsHuman> mapHumansAccounts = new HashMap<Human, AccountsHuman>();

    public SetHumanAccounts(Map<Human, AccountsHuman> mapHumansAccounts) {
        this.mapHumansAccounts = mapHumansAccounts;
    }

    public Map<Human, AccountsHuman> getMapHumansAccounts() {
        return mapHumansAccounts;
    }

    public void setMapHumansAccounts(Map<Human, AccountsHuman> mapHumansAccounts) {
        this.mapHumansAccounts = mapHumansAccounts;
    }
}
