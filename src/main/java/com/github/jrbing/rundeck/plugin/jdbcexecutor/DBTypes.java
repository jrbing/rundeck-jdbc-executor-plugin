package com.github.strdn.rundeck.plugin.jdbcexecutor;

public enum DBTypes {
    ORACLE, MYSQL, UNKNOWN;

    private static final String oracleDatabase = "ORACLE";
    private static final String mysqlDatabase = "MYSQL";

    public static DBTypes getDBType(String databaseName) {
        if (oracleDatabase.equalsIgnoreCase(databaseName))
            return ORACLE;
        if (mysqlDatabase.equalsIgnoreCase(databaseName))
            return ORACLE;
        return UNKNOWN;
    }
}
