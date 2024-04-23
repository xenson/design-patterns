package com.urancode.design.patterns.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Enson on 2023/12/8.
 */
public class Leader implements IEmployee {
    private Map<String, IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        targets.put("工作A", new EmployeeA());
        targets.put("工作B", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
