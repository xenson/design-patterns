package com.urancode.design.patterns.delegate;

/**
 * Created by Enson on 2023/12/8.
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
