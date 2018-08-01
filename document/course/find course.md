查询课程信息findCourse

请求方式：POST

样例：https://[host]:[port]/course/findCourse

传入：

| 字段名            | 描述   | 类型     | 说明   |
| -------------- | ---- | ------ | ---- |

返回结果：

```
{
  "status": "0",
  "body": [
    {
      "id": 3,
      "course_begin_time": "2018-02-28 14:00:00",
      "course_end_time": "2018-02-28 16:00:00",
      "course_money": 1.22,
      "create_time": "2018-07-29 21:49:16",
      "num": 30,
      "is_delete": 0
    },
    {
      "id": 4,
      "course_begin_time": "2018-02-28 14:00:00",
      "course_end_time": "2018-02-28 16:00:00",
      "course_money": 111.22,
      "create_time": "2018-07-29 21:49:32",
      "num": 30,
      "is_delete": 1
    },
    {
      "id": 5,
      "course_begin_time": "2018-07-31 22:22:22",
      "course_end_time": "2018-07-31 23:23:23",
      "course_money": 999,
      "create_time": "2018-07-29 21:49:56",
      "num": 100,
      "is_delete": 0
    },
    {
      "id": 6,
      "course_begin_time": "2018-07-31 22:22:22",
      "course_end_time": "2018-07-31 23:23:23",
      "course_money": 999,
      "create_time": "2018-07-29 21:51:30",
      "num": 100,
      "is_delete": 0
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
| course_money        | 费用      | String  |      |
| create_time         | 创建时间  | String  |      |
| num                 | 人数      | String  |      |
| is_delete           | 受否删除  | String  |      |
