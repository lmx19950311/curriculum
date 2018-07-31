添加用户记录addUser

请求方式：POST

样例：https://[host]:[port]/user/addUser

传入：

| 字段名         | 描述                       | 类型   | 说明   |
| -------------- | -------------------------- | ------ | ----   |
| nickHame            | 用户id                     | String |      |
| gender            | 课程id                     | String |      |
| grade     | 创建时间                   | String |      |
| phone        | 支付类型(1-支付宝,2-微信)  | String |      |
| createTime        | 支付时间                   | String |      |
| payAccount     | 支付账号                   | String |      |
| payResult      | 支付结果                   | String |      |
| payMony        | 支付金额                   | String |      |
| orderNo        | 订单号                     | String |      |

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

| 字段名         | 描述                       | 类型   | 说明   |
| -----------    | -------------------------- | -------| ------------------------ |
| msg            |                            | String |                       |
| code           |                            | Integer| 0请求成功；非0失败；具体见msgDesc |
| body           |                            | Object |      |
| uid            | 用户id                     | String |      |
| cid            | 课程id                     | String |      |
| createTime     | 创建时间                   | String |      |
| payType        | 支付类型(1-支付宝,2-微信)  | String |      |
| payTime        | 支付时间                   | String |      |
| payAccount     | 支付账号                   | String |      |
| payResult      | 支付结果                   | String |      |
| payMony        | 支付金额                   | String |      |
| orderNo        | 订单号                     | String |      |
