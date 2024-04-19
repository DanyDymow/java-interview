### (INNER) JOIN: Returns records that have matching values in both tables
```roomsql
SELECT ProductID, ProductName, CategoryName
FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;
```
![Alt текст](/img/inner_join.jpg)
### LEFT (OUTER) JOIN: Returns all records from the left table, and the matched records from the right table
```roomsql
SELECT ProductID, ProductName, CategoryName
FROM Products
LEFT JOIN Categories ON Products.CategoryID = Categories.CategoryID;
```
![Alt текст](/img/right_join.jpg)
### RIGHT (OUTER) JOIN: Returns all records from the right table, and the matched records from the left table
```roomsql
SELECT ProductID, ProductName, CategoryName
FROM Products
RIGHT JOIN Categories ON Products.CategoryID = Categories.CategoryID;
```
![Alt текст](/img/right_join.jpg)
### FULL (OUTER) JOIN: Returns all records when there is a match in either left or right table
```roomsql
SELECT ProductID, ProductName, CategoryName
FROM Products
FULL JOIN Categories ON Products.CategoryID = Categories.CategoryID;
```
![Alt текст](/img/full_join.jpg)