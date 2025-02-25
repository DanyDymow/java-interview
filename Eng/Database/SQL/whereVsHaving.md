
### WHERE:

Use for filtering entries before grouping 
``` sql
SELECT name, salary
FROM employees
WHERE salary > 5000;
```

### HAVING:
Use for filtering entries after grouping (if GROUP BY uses)

Use with agregated data (SUM, AVG)

Works with aggregation result

``` sql
SELECT department, AVG(salary) AS avg_salary
FROM employees
GROUP BY department
HAVING AVG(salary) > 5000;
```
