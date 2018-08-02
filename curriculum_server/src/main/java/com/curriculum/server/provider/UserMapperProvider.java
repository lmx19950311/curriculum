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

    public String findSql(String orderNo, String nickHame, String phone) {
        String sql = "select u.id as 'id'," +
                "       u.nick_hame as 'nick_hame'," +
                "       u.gender as 'gender'," +
                "       u.grade as 'grade'," +
                "       u.phone as 'phone'," +
                "       FROM_UNIXTIME(c.course_begin_time, '%Y-%m-%d %H:%i:%s') as 'course_begin_time'," +
                "       FROM_UNIXTIME(c.course_end_time, '%Y-%m-%d %H:%i:%s') as 'course_end_time'," +
                "       p.pay_money as 'pay_money'," +
                "       FROM_UNIXTIME(p.create_time, '%Y-%m-%d %H:%i:%s') as 'create_time'," +
                "       p.pay_result as 'pay_result'," +
                "       p.order_no as 'order_no'," +
                "       uo.pay_result as 'pay_results'" +
                "  from user u, pay_order p, course c, user_order uo" +
                " where p.uid = u.id" +
                "   and p.cid = c.id" +
                "   and u.id = uo.uid" +
                "   and c.id = uo.cid";
        if(orderNo != null && !"".equals(orderNo)) {
            sql += " and p.order_no like '%" + orderNo + "%'";
        }
        if(nickHame != null && !"".equals(nickHame)) {
            sql += " and u.nick_hame like '%" + nickHame + "%'";
        }
        if(phone != null && !"".equals(phone)) {
            sql += " and u.phone like '%" + phone + "%'";
        }
        return sql;
    }
}
