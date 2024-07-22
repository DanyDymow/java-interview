## Indexes

Cluster:

faster
less memory
index is part of the data
one table
arranging

Non Cluster
more memory
index is a copy of data
can have many non-clustered indexes


Indexes in a database are special data structures that speed up searching, sorting, and filtering operations. They play an important role in improving query performance. Here are the main aspects of indexes in databases:

Types of Indexes

- B-Tree indexes

The most common type of index.
The B-Tree (balanced tree) structure allows you to quickly find, insert, and delete data.
Supports range queries.

- Hash indexes

Use hash tables to index data.
Faster than B-Tree for exact matches (e.g. key lookups), but does not support range queries.
Limited to certain types of transactions.

- GiST (Generalized Search Tree) indexes

A generalized search framework that can be used to index many types of data, including geometric data.
Supports complex query types such as range and nearest neighbors.

- GIN (Generalized Inverted Index) indexes

Used to index data that may have multiple values ​​for a single attribute, such as arrays or text data.
Effective for full-text search.

- SP-GiST (Space-partitioned Generalized Search Tree) indexes

Optimized for skewed data.
Used for spatial data and other data types where traditional B-Tree indexes are ineffective.