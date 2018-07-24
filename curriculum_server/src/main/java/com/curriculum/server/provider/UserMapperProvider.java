package com.curriculum.server.provider;

import org.apache.commons.lang3.StringUtils;

public class UserMapperProvider {
    public String findByName(String username, String password) {
        StringBuffer sql = new StringBuffer("SELECT username FROM user");
        if (StringUtils.isEmpty(username)) {
            return sql.toString();
        }
        sql.append(" WHERE username = '" + username + "' and password = '" + password + "'");
        return sql.toString();


//        return new SQL() {
//            {
//                SELECT("username");
//                FROM("user");
//                WHERE(" username = '" + username + "' and password = '" + password + "'");
//            }
//        }.toString();


    }
}
