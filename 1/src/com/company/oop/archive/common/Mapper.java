package com.company.oop.archive.common;

import com.company.oop.archive.Case;
import com.company.oop.archive.User;
import com.company.oop.archive.server.Request;

import java.util.*;

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
        if ("null".equals(str)) {
            return null;
        }
        List<String> params = Mapper.toParams(str);
        return new Case(params.get(0), params.get(1), params.get(2), Integer.parseInt(params.get(3)), params.get(4));
    }

    public static List<Case> toCases(String string) {
        List<String> caseStrList = Arrays.asList(string.split("\t"));
        return toCases(caseStrList);
    }

    public static List<Case> toCases(List<String> caseStrList) {
        List<Case> savesCase = new ArrayList<Case>();
        for (String str : caseStrList) {
            savesCase.add(toCase(str));
        }
        return savesCase;
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

    public static String toString(Case caseItem) {
        if (caseItem == null) {
            return null;
        }
        return String.join(DELIMITER, caseItem.getId(), caseItem.getName(), caseItem.getSurname(),
                String.valueOf(caseItem.getYearOfBirth()), caseItem.getFaculty());
    }

    public static String toString(List<Case> cases) {
        if (cases == null) {
            return null;
        }
        List<String> strings = new ArrayList<>();
        for (Case caseItem : cases) {
            strings.add(toString(caseItem));
        }
        return String.join("\t", strings);
    }
}
