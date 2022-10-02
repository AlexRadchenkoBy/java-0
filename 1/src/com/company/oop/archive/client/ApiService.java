package com.company.oop.archive.client;

import com.company.oop.archive.User;
import com.company.oop.archive.common.Mapper;
import com.company.oop.archive.common.RequestType;

public class ApiService {

    public static User login(Client client, String login, String password) {
        String response = client.sendMessage(Mapper.toString(RequestType.LOGIN.toString(), login, password));
        return Mapper.toUser(response);
    }

    public static User add(Client client, String emailUser, String passwordHashUser) {
        String response = client.sendMessage(Mapper.toString(RequestType.ADDUSER.toString(), emailUser, passwordHashUser));
        return Mapper.toUser(response);
    }

}
