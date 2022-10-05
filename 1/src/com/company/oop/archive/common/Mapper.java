package com.company.oop.archive.common;

import com.company.oop.archive.Case;
import com.company.oop.archive.User;
import com.company.oop.archive.server.Request;

import java.util.Arrays;
import java.util.List;

public class Mapper {

    public static final String DELIMITER = " ";

    public static String toString(String... str) {
        return String.join(DELIMITER, str);
    }

    public static User toUser(String str) {
        if ("null".equals(str)) {
            return null;
        }
        List<String> params = Mapper.toParams(str);
        return new User(params.get(0), Boolean.parseBoolean(params.get(1)));
    }

    public static Case toCase(String str) {
        if("null".equals(str)) {
            return null;
        }
        List<String> params = Mapper.toParams(str);
        return new Case(params.get(0), params.get(1), Integer.parseInt(params.get(2)), params.get(3));
    }

    public static String toString(User user) {
        if (user == null) {
            return null;
        }
        return String.join(DELIMITER, user.getId(), String.valueOf(user.getIsAdmin()));
    }

    public static Request toRequest(String str) {
        List<String> strings = Mapper.toParams(str);
        return new Request(RequestType.valueOf(strings.get(0)), strings.subList(1, strings.size()));
    }

    private static List<String> toParams(String str) {
        return Arrays.asList(str.split(DELIMITER));
    }

}
