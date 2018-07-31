修改课程信息updateCourse

请求方式：POST

样例：https://[host]:[port]/course/updateCourse

传入：

| 字段名         | 描述       | 类型   | 说明 |
| -------------- | ---------- | ------ | ---- |
| id             | id         | String |      |
| startTime      | 开始时间   | String |      |
| endTime        | 结束时间   | String |      |
| num            | 人数       | String |      |
| money          | 费用       | String |      |

返回结果：

```
{
  "status": "0",
  "body": {
    "id": "5",
    "startTime": "2018-07-31 22:22:22",
    "endTime": "2018-07-31 23:23:23",
    "num": "100",
    "money": "999"
  },
  "msg": "修改成功"
}
```

结果说明：

| 字段名       | 描述      | 类型      | 说明                    |
| ----------- | --------- | ------- | ------------------------ |
| msg         |           | String  |                       |
| code        |           | Integer | 0请求成功；非0失败；具体见msgDesc |
| body        |           | Object  |      |
| id          | id        | String  |      |
| startTime   | 开始时间  | String  |      |
| endTime     | 结束时间  | String  |      |
| num         | 人数      | String  |      |
| money       | 费用      | String  |      |
