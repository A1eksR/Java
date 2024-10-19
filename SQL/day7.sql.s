CREATE TABLE Sales(
    sale_id INTEGER PRIMARY KEY,
    product_id INTEGER,
    quantity_sold INTEGER,
    sale_date TEXT(100),
    total_price INTEGER
);

INSERT INTO Sales(sale_id, product_id, quantity_sold, sale_date, total_price)
VALUES(1, 101, 5, "2024-01-01", 2500),
(2, 102, 3, "2024-01-02", 900),
(3, 103, 2, "2024-01-02", 60),
(4, 104, 4, "2024-01-03", 80),
(5, 105, 6, "2024-01-03", 90);

SELECT * FROM Sales;

SELECT * FROM Sales
WHERE Sales.total_price > 85;

CREATE TABLE Products(
    product_id INTEGER PRIMARY KEY,
    product_name TEXT(150),
    category TEXT(150),
    unit_price INTEGER
);

INSERT INTO Products(product_id, product_name, category, unit_price)
VALUES(101, "laptop", "Electronics", 500),
(102, "smartphone", "Electronics", 300),
(103, "headphones", "Electronics", 30),
(104, "keyboard", "Electronics", 20),
(105, "mosue", "Electronics", 15);

SELECT Products.product_name, Sales.quantity_sold
FROM Products, Sales
WHERE Products.product_id = Sales.product_id
