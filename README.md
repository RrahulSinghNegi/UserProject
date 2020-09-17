# UserProject


1) POST 
http://localhost:8761/user-service/addUser

{"name":"rahul","email":"abc@gmail.com}


2) POST http://localhost:8761/address-service/createAddress

{"city":"Lucknow","state":"UP", "country":"India"}


3) GET http://localhost:8761/user-service/getUser

{
"id": null,
"name": "rahul",
"email": "abc@gmail.com",
"address": {
"city": "Lucknow",
"state": "UP",
"country": "India"
}
}
