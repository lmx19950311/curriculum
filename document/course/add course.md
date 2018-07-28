添加课程信息addCourse

请求方式：POST

样例：https://[host]:[port]/course/addCourse

传入：

| 字段名            | 描述   | 类型     | 说明   |
| -------------- | ---- | ------ | ---- |
| startTime      | 开始时间   | String |      |
| endTime        | 结束时间   | String |      |
| num            | 人数       | String |      |
| money          | 费用       | String |      |

注册成功返回结果：

```
{
    "status": "0",
    "body": {
        "startTime": "2018-02-28 14:00:00",
        "endTime": "2018-02-28 16:00:00",
        "num": "1",
        "money": "1"
    },
    "msg": "添加成功"
}
```

结果说明：

| 字段名       | 描述      | 类型      | 说明                    |
| ----------- | --------- | ------- | ------------------------ |
| msg         |           | String  |                       |
| code        |           | Integer | 0请求成功；非0失败；具体见msgDesc |
| body        |           | Object  |      |
| startTime   | 开始时间   | String  |      |
| endTime     | 结束时间   | String  |      |
| num         | 人数       | String  |      |
| money       | 费用       | String  |      |
