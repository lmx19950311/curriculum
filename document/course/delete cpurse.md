删除课程信息deleteCourse

请求方式：POST

样例：https://[host]:[port]/course/deleteCourse

传入：

| 字段名         | 描述                  | 类型   | 说明 |
| -------------- | --------------------- | ------ | ---- |
| id             | id                    | String |      |
| isDelete       | 是否删除(0-否,1-是)   | String |      |

注册成功返回结果：

```
{
  "status": "0",
  "body": "{\"isDelete\" : \"1\"}",
  "msg": "删除成功"
}
```

结果说明：

| 字段名      | 描述                  | 类型    | 说明                    |
| ----------- | --------------------- | ------- | ------------------------ |
| msg         |                       | String  |                       |
| code        |                       | Integer | 0请求成功；非0失败；具体见msgDesc |
| body        |                       | Object  |      |
| isDelete    | 是否删除(0-否,1-是)   | String  |      |
