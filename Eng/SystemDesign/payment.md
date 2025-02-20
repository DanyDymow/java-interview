![Alt текст](/eng/img/system-design/payment_req.jpg)
![Alt текст](/eng/img/system-design/payment.jpg)

Payment: id, userId, merchantId, amount, currency, paymentMethod, requestTime, status

Account: id, userId, currencycode, balance, updated

Transaction: id, accId, amount, currencyCode, type, status, created

UserDB: id, email, pass, profile, status, created

Fraud: id, transactionId, userId, suspicionType, score, action, timestamp

Notification: id, userId, type, message, delivery, timestamp

![Alt текст](/eng/img/system-design/paymentPattern.jpg)
