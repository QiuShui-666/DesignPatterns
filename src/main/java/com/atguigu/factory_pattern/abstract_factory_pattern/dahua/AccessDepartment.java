package com.atguigu.factory_pattern.abstract_factory_pattern.dahua;

public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表中添加一条记录。");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("在 Access 中根据 id 得到 Department 表中的一条记录。");
        return null;
    }

}
