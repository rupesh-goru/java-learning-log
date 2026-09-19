package com.jdbc.dqloperations;

/*In DML(INSERT, UPDATE, DELETE) ops the date is passed to the database
* but in DQL(SELECT) ops we will get data from the database & gets printed in the console.*/

import java.sql.*;

public class SelectOps {
    static void main(String[] args) throws SQLException {

        /*### JDBC DQL Operations — Interview Notes

         * **DQL (Data Query Language)** is mainly used to retrieve data from the database using the **`SELECT`** statement.
         * In JDBC, the **`executeQuery()`** method is used to execute a `SELECT` query, and it returns a **`ResultSet`** object containing the retrieved data.
         * **`ResultSet`** represents the data ***returned by the database*** and maintains a cursor pointing to the rows.
         * There is no need of hasNext(); here like iterator.
         * The **`rs.next()`** method is used to move the cursor to the next row; initially, the cursor is positioned before the first row.
         * Data from a `ResultSet` can be retrieved using getter methods such as **`getInt()`, `getString()`, `getDouble()`, and `getBoolean()`**, either by column name or column index.
         * **`executeQuery()` → `ResultSet`** is mainly used for `SELECT`, whereas **`executeUpdate()` → `int`** is mainly used for `INSERT`, `UPDATE`, and `DELETE`.
         */


        /*# JDBC — DQL Operations (Interview-Centric)

## 1. Which JDBC method is used for DQL?

**Answer:**

`executeQuery()` method is used for executing `SELECT` statements in JDBC.

**Example:**

```java
String query = "SELECT * FROM students";

Statement statement = connection.createStatement();

ResultSet resultSet = statement.executeQuery(query);
```

---

## 2. What does `executeQuery()` return?

**Answer:**

The `executeQuery()` method returns a `ResultSet` object.

**Example:**

```java
ResultSet rs = statement.executeQuery(query);
```

The `ResultSet` contains the data returned by the `SELECT` query.

---

## 3. What is `ResultSet`?

**Answer:**

`ResultSet` is a JDBC object that holds the data returned by a `SELECT` query.

**Example:**

```java
String query = "SELECT * FROM students";

ResultSet rs = statement.executeQuery(query);
```

The returned records are stored in the `ResultSet`, and we can read them using `rs.next()`.

**Flow:**

```text
Database
   ↓
SELECT query
   ↓
executeQuery()
   ↓
ResultSet
   ↓
rs.next()
   ↓
Read data
```

---

## 4. Why do we use `rs.next()`?

**Answer:**

`ResultSet` initially positions the cursor **before the first row**.

The `rs.next()` method moves the cursor to the next row and returns `true` if a row exists.

**Example:**

```java
while (rs.next()) {
    // read row
}
```

Each call to `next()` moves the cursor to the next row.

---

## 5. How do you retrieve a column?

**Answer:**

We can retrieve columns from a `ResultSet` using getter methods such as `getInt()`, `getString()`, `getDouble()`, and `getBoolean()`.

We can retrieve a column using either the **column name** or the **column index**.

**Using column name:**

```java
rs.getInt("id");
rs.getString("name");
rs.getDouble("salary");
rs.getBoolean("status");
```

**Using column index:**

```java
rs.getInt(1);
rs.getString(2);
rs.getInt(3);
```

**Interview Tip:**

Column names are generally more readable than column indexes.

---

## 6. What is the difference between `executeQuery()` and `executeUpdate()`?

| Method            | Mainly used for              | Return type |
| ----------------- | ---------------------------- | ----------- |
| `executeQuery()`  | `SELECT`                     | `ResultSet` |
| `executeUpdate()` | `INSERT`, `UPDATE`, `DELETE` | `int` and that integer tells you how many rows were affected.|
| `execute()`       | Any SQL statement            | `boolean`   |

**Example:**

```java
// DQL
ResultSet rs = statement.executeQuery("SELECT * FROM students");

// DML
int rows = statement.executeUpdate(
    "DELETE FROM students WHERE id = 3"
);
```

### ⭐ Remember this for interviews

```text
SELECT  → executeQuery()  → ResultSet
INSERT  → executeUpdate() → int
UPDATE  → executeUpdate() → int
DELETE  → executeUpdate() → int
```
*/

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc",
                "root",
                "root");

        String query = "select * from students";
        Statement statement = connection.createStatement();

        /*DQL ops so we have to use ResultSet.*/
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {

            /** Data from a `ResultSet` can be retrieved using getter methods such as **`getInt()`, `getString()`, `getDouble()`, and `getBoolean()`**,
                either by column name or column index.*/

            /*by column index.*/
           /* int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int marks = resultSet.getInt(3);*/

            /*by column name.*/
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int marks = resultSet.getInt("marks");

            System.out.print(id + "  " + name + "  " + marks);
            System.out.println();
        }

        connection.close();
        statement.close();

    }
}
