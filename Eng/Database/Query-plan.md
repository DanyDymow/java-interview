## Query plan -

 It is the plan or strategy for executing a query in a database that determines how the database will receive data, process it, and return query results. The Query plan is created by the database query optimizer based on data structure, indexes, statistics, and other factors to execute the query in the most efficient way.

The main components and characteristics of a query plan include:

Selecting Tables and Indexes: The query optimizer selects the tables and indexes that will be used to execute the query. This includes selecting tables, scanning and joining tables, and selecting indexes to filter data.
Join Types: Query plan defines the join types that will be used when executing the query, such as INNER JOIN, LEFT JOIN, RIGHT JOIN, etc.
Order of operations: The query optimizer determines the order of operations, such as which WHERE conditions will be applied first and which ones after that.
Using aggregate functions: If a query contains aggregate functions (for example, SUM, COUNT, AVG), the query plan determines how these functions will be calculated, for example using index scans or full tables.
Data access optimization: Query plan includes data access optimization, such as minimizing disk accesses, data caching, parallel execution of operations, and other techniques to speed up query execution.
Estimating the cost of executing operations: The query optimizer estimates the cost of executing each operation in the query plan and selects the most efficient paths to execute the query to minimize execution time and resource usage.