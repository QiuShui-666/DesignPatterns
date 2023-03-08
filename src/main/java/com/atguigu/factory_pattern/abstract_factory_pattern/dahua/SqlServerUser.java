package com.atguigu.factory_pattern.abstract_factory_pattern.dahua;

public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在 SQL Server 中给 User 表中添加一条记录。");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在 SQL Server 中根据 id 得到 User 表中的一条记录。");
        return null;
    }

}