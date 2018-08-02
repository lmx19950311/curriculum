查询课程信息findCourse

请求方式：POST

样例：https://[host]:[port]/course/findCourse

传入：

| 字段名            | 描述   | 类型     | 说明   |
| ----------------- | ------ | -------- | ------ |
| nickHame          | 用户名 | String   |        |
| phone             | 手机号 | String   |        |
| orderNo           | 订单号 | String   |        |

返回结果：

```
{
  "status": "0",
  "body": [
    {
      "id": 4,
      "nick_hame": "asd",
      "gender": 2,
      "grade": "六年级",
      "phone": "6543",
      "create_time": "2018-07-30 21:33:33",
      "pay_result": 1,
      "pay_results": 1,
      "pay_money": 3,
      "order_no": "0",
      "course_begin_time": "2018-07-31 22:22:22",
      "course_end_time": "2018-07-31 23:23:23"
    }
  ],
  "msg": "查询成功"
}
```

结果说明：

| 字段名              | 描述      | 类型      | 说明                    |
| ------------------- | --------- | ------- | ------------------------ |
| msg                 |           | String  |                       |
| code                |           | Integer | 0请求成功；非0失败；具体见msgDesc |
| body                |           | Object  |      |
| id                  | id        | String  |      |
| course_begin_time   | 开始时间  | String  |      |
| course_end_time     | 结束时间  | String  |      |
| nickHame            | 姓名      | String  |      |
| gender              | 性别      | String  |      |
| grade               | 年龄      | String  |      |
| phone               | 电话      | String  |      |
| create_time         | 创建时间  | String  |      |
| pay_result          | 支付结果  | String  |      |
| pay_results         | 支付状态  | String  |      |
| pay_mony            | 支付金额  | String  |      |
| order_no            | 订单号    | String  |      |
