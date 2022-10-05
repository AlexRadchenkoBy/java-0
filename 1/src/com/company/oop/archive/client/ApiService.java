package com.company.oop.archive.client;

import com.company.oop.archive.Archive;
import com.company.oop.archive.Case;
import com.company.oop.archive.User;
import com.company.oop.archive.common.Mapper;
import com.company.oop.archive.common.RequestType;

public class ApiService {

    public static User login(Client client, String login, String password) {
        String response = client.sendMessage(Mapper.toString(RequestType.LOGIN.toString(), login, password));
        return Mapper.toUser(response);
    }

    public static User user(Client client, String emailUser, String passwordHashUser) {
        String response = client.sendMessage(Mapper.toString(RequestType.ADDUSER.toString(), emailUser, passwordHashUser));
        return Mapper.toUser(response);
    }

    public static Case aCase(Client client, String nameCase, String surnameCase, String yearOfBirthCase, String facultyCase) {
        String response = client.sendMessage(Mapper.toString(RequestType.ADDCASE.toString(), nameCase, surnameCase,
                String.valueOf(yearOfBirthCase), facultyCase));
        return Mapper.toCase(response);
    }

}
