package com.atguigu.factory_pattern.abstract_factory_pattern.dahua;

public class DataAccess {

    private static String DB = "SqlServer";

    public static IUser createUser() {
        IUser result = null;
        switch (DB) {
            case "SqlServer":
                result = new SqlServerUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
            default:
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (DB) {
            case "SqlServer":
                result = new SqlServerDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
            default:
                break;
        }
        return result;
    }

    public static String getDB() {
        return DB;
    }

    public static void setDB(String DB) {
        DataAccess.DB = DB;
    }

}
