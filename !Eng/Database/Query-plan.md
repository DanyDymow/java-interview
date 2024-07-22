 ## Query plan (план запроса) - 
 
 это план или стратегия выполнения запроса в базе данных, которая определяет, как база данных будет получать данные, обрабатывать их и возвращать результаты запроса. Query plan создается оптимизатором запросов базы данных на основе структуры данных, индексов, статистики и других факторов, чтобы выполнить запрос наиболее эффективным способом.

Основные компоненты и характеристики query plan включают:

Выбор таблиц и индексов: Оптимизатор запросов выбирает таблицы и индексы, которые будут использоваться для выполнения запроса. Это включает в себя выбор таблиц, сканирование и присоединение таблиц, а также выбор индексов для фильтрации данных.
Типы соединений: Query plan определяет типы соединений, которые будут использоваться при выполнении запроса, такие как INNER JOIN, LEFT JOIN, RIGHT JOIN и т. д.
Порядок операций: Оптимизатор запросов определяет порядок выполнения операций, например, какие условия WHERE будут применены первыми, а какие после этого.
Использование агрегатных функций: Если запрос содержит агрегатные функции (например, SUM, COUNT, AVG), query plan определяет, как эти функции будут вычисляться, например, с использованием сканирования индексов или полных таблиц.
Оптимизация доступа к данным: Query plan включает в себя оптимизацию доступа к данным, например, минимизацию обращений к диску, кэширование данных, параллельное выполнение операций и другие техники для ускорения выполнения запроса.
Оценка стоимости выполнения операций: Оптимизатор запросов оценивает стоимость выполнения каждой операции в query plan и выбирает наиболее эффективные пути выполнения запроса, чтобы минимизировать время выполнения и использование ресурсов.