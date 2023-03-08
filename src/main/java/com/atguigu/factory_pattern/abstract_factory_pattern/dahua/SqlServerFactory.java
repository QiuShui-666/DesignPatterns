package com.atguigu.factory_pattern.abstract_factory_pattern.dahua;

public class SqlServerFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }

}
