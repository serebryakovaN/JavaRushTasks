package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
  private ModelData modelData=new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> r=new ArrayList();
        r.add(new User("a",1,1));
        r.add(new User("b",4,5));
        modelData.setUsers(r);
    }


    public void loadDeletedUsers()
    {
        List<User> users = new ArrayList<>();
        users.add(new User("C",3,1));
        users.add(new User("D",4,2));
        modelData.setUsers(users);
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
