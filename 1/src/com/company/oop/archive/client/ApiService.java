package com.company.oop.archive.client;

import com.company.oop.archive.Archive;
import com.company.oop.archive.Case;
import com.company.oop.archive.User;
import com.company.oop.archive.common.Mapper;
import com.company.oop.archive.common.RequestType;

import java.util.List;

public class ApiService {

    public static User login(Client client, String login, String password) {
        String response = client.sendMessage(Mapper.toString(RequestType.LOGIN.toString(), login, password));
        return Mapper.toUser(response);
    }

    public static User user(Client client, String emailUser, String passwordHashUser) {
        String response = client.sendMessage(Mapper.toString(RequestType.ADDUSER.toString(), emailUser, passwordHashUser));
        return Mapper.toUser(response);
    }

    public static void addCase(Client client, String nameCase, String surnameCase, String yearOfBirthCase, String facultyCase) {
        String response = client.sendMessage(Mapper.toString(RequestType.ADDCASE.toString(), nameCase, surnameCase,
                String.valueOf(yearOfBirthCase), facultyCase));
    }

    public static Case search(Client client, String name, String surname, int yearOfBirth) {
        String response = client.sendMessage(Mapper.toString(RequestType.SEARCHCASE.toString(), name, surname,
                String.valueOf(yearOfBirth)));
        return Mapper.toCase(response);
    }

    public static List<Case> getAllCases(Client client) {
        String response = client.sendMessage(RequestType.GETALLCASE.toString());
        return Mapper.toCases(response);
    }

    public static Case changeTheCase(Client client, String faculty, String id) {
        String response = client.sendMessage(Mapper.toString(RequestType.CHANGETHECASE.toString(), faculty, id));
        return Mapper.toCase(response);
    }
}
