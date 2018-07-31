添加用户订单记录addUserOrder

请求方式：POST

样例：https://[host]:[port]/userOrder/addUserOrder

传入：

| 字段名         | 描述                     | 类型   | 说明 |
| -------------- | ------------------------ | ------ | ---- |
| uid            | 用户id                   | String |      |
| cid            | 课程id                   | String |      |
| createTime     | 创建时间                 | String |      |
| payResult      | 支付结果                 | String |      |
| status         | 报名状态(0-否,1-是)      | String |      |

成功返回结果：

```
{
    "status": "0",
    "body": {
        "uid": "123",
        "cid": "321",
        "createTime": "2018-07-30 23:23:23",
        "payResult": "1",
        "status": "1"
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
| uid            | 用户id                   | String |      |
| cid            | 课程id                   | String |      |
| createTime     | 创建时间                 | String |      |
| payResult      | 支付结果                 | String |      |
| status         | 报名状态(0-否,1-是)      | String |      |
