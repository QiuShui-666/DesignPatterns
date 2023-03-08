package com.atguigu.factory_pattern.abstract_factory_pattern.dahua;

public class AccessFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }

}
