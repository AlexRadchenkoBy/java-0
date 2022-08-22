package com.company.oop.archive.server;

import com.company.oop.archive.Archive;
import com.company.oop.archive.User;
import com.company.oop.archive.common.Mapper;

public class DispatcherController {

    private Archive archive;

    public DispatcherController() {
        archive = new Archive();
    }

    public String handle(String requestStr) {
        Request request = Mapper.toRequest(requestStr);
        return switch (request.getRequestType()) {
            case LOGIN -> loginAndPassword(request.getParameters().get(0), request.getParameters().get(1));
        };
    }

    private String loginAndPassword(String login, String password) {
        User user = archive.loginAndPassword(login, password);
        return Mapper.toString(user);
    }

}
