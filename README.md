
# JDBC Test Connection with Query to access Oracle Database

This Java application demonstrates how to establish a JDBC connection with an Oracle database, execute a SQL query, and process the result set.




## Purpose
The purpose of this application is to illustrate the basic steps involved in using JDBC to interact with a relational database system. It covers:

- Loading and registering the JDBC driver class.
- Establishing a connection with the database.
- Creating a statement object to execute SQL queries.
- Executing a SELECT query to retrieve data from a table.
- Processing the result set and printing the query results.
## Prerequisites 
Before running this application, ensure the following:

* An Oracle database instance is installed and running on localhost with the default port (1521) and the SID "xe".
* Replace the database username ("system") and password in the connection URL with your database credentials.
## Usage

1. **Compile the Java file**:
   ```bash
   javac TestConnectionwithQuery.java
   ```

2. **Run the Java application**:
   ```bash
   java TestConnectionwithQuery
   ```

3. **Expected Output**:
   The application will establish a connection with the database, execute the SELECT query to retrieve data from the "STUDENT" table, and print the below results to the console.
    ```
    Prayas	A
    Ramesh	C
    David	A
    Binny	C
    Analy	C
    ```
**Actual Database**

    NAME               ROLL_NO SEC
    --------------- ---------- ---
    Prayas                 117 A
    Ramesh                 100 C
    David                  502 A
    Binny                   85 C
    Analy                  405 C

## Notes

- Make sure the Oracle JDBC driver JAR file is included in your classpath. If not, download it from the Oracle website and add it to your project's dependencies.
- This example assumes a basic understanding of JDBC concepts and SQL queries.
