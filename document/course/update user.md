修改用户记录updateUser

请求方式：POST

样例：https://[host]:[port]/user/updateUser

传入：

| 字段名         | 描述                     | 类型   | 说明 |
| -------------- | ------------------------ | ------ | ---- |
| id             | id                       | String |      |
| nickHame       | 姓名                     | String |      |
| gender         | 性别                     | String |      |
| grade          | 年龄                     | String |      |
| phone          | 电话                     | String |      |

成功返回结果：

```
{
  "status": "0",
  "body": {
    "id": "4",
    "nickHame": "limingxin",
    "gender": "2",
    "grade": "三年级",
    "phone": "110",
    "createTime": "null",
    "status": "null"
  },
  "msg": "修改成功"
}
```

结果说明：

| 字段名         | 描述                     | 类型   | 说明   |
| -----------    | ------------------------ | -------| ------------------------ |
| msg            |                          | String |                       |
| code           |                          | Integer| 0请求成功；非0失败；具体见msgDesc |
| body           |                          | Object |      |
| id             | id                       | String |      |
| nickHame       | 姓名                     | String |      |
| gender         | 性别                     | String |      |
| grade          | 年龄                     | String |      |
| phone          | 电话                     | String |      |
