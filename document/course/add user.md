添加用户记录addUser

请求方式：POST

样例：https://[host]:[port]/user/addUser

传入：

| 字段名         | 描述                     | 类型   | 说明 |
| -------------- | ------------------------ | ------ | ---- |
| nickHame       | 姓名                     | String |      |
| gender         | 性别                     | String |      |
| grade          | 年龄                     | String |      |
| phone          | 电话                     | String |      |
| createTime     | 创建时间                 | String |      |
| status         | 用户状态(0-否,1-是)      | String |      |

成功返回结果：

```
{
    "status": "0",
    "body": {
        "uid": "111",
        "cid": "222",
        "createTime": "2018-07-30 21:33:33",
        "payType": "1",
        "payTime": "2018-07-30 22:22:22",
        "payAccount": "1235432",
        "payResult": "1",
        "payMony": "123",
        "orderNo": "123456789"
    },
    "msg": "添加成功"
}
```

结果说明：

| 字段名         | 描述                     | 类型   | 说明   |
| -----------    | ------------------------ | -------| ------------------------ |
| msg            |                          | String |                       |
| code           |                          | Integer| 0请求成功；非0失败；具体见msgDesc |
| body           |                          | Object |      |
| nickHame       | 姓名                     | String |      |
| gender         | 性别                     | String |      |
| grade          | 年龄                     | String |      |
| phone          | 电话                     | String |      |
| createTime     | 创建时间                 | String |      |
| status         | 用户状态(0-否,1-是)      | String |      |
