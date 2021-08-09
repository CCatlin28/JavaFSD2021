package com.christycatlin.try2;

public class SystemAccessFactory {
    private static ISystemAccess systemAccess;
    private SystemAccessFactory(){}
    public static ISystemAccess getISystemAccess(){
        if (systemAccess==null)
            systemAccess = new SystemAccessImplement();
        return systemAccess;
    }
}
