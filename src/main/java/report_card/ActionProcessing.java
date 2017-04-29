package report_card;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by pomortsew on 27.04.17.
 */
public class ActionProcessing {
    Connection connection;
    Statement statement;
    Calendar calendar;
    ResultSet resultSet;

    //    конструктор создает подключение к базе данных
    public ActionProcessing() {
//        создание подключения к базе данных
        try {
            this.connection = DriverManager.getConnection(StringQueries.URLDB, StringQueries.USERNAMEDB, StringQueries.PASSWORDDB);
            this.statement = connection.createStatement();


        } catch (SQLException e) {
            StringQueries.ERROR = "Не возможно установить соединение с БАЗОЙ ДАННЫХ";
            System.out.println(StringQueries.ERROR);
        }


    }

    //    создание новой таблицы по шаблону на текущий месяц и год
    public void createTable(String tableName) {

        String sql = "CREATE TABLE " + tableName + StringQueries.currentDataMonth + StringQueries.CREATETABLE;
        System.out.println(sql);
        try {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    создание новой таблицы по шаблону на следующий месяц  месяц и год
    public void createTableNextMonth(String tableName) {
        String sql = "CREATE TABLE " + tableName + StringQueries.currentDataMonthNext + StringQueries.CREATETABLE;
        System.out.println(sql);
        try {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //    поиск в табцицах по фамилии на текущий месяц
    public ResultSet searh(String surname) {

        ArrayList<String> nameTable =allTableName();


        try {
            resultSet = statement.executeQuery(
                    "SELECT * from Таренков_4_2017 WHERE surname='" + surname + "'");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("surname") + " " +
                        resultSet.getString("personell_number") + " " +
                        resultSet.getString("day") + " " +
                        resultSet.getString("worcing_shift") + " " +
                        resultSet.getString("location"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    //    заполнение таблицы
    public void additionTable() {
        System.out.println("Введите фамилию ");
        String surname= inputDataString();


    }

    //    чтение строковых данных с консоли
    public String inputDataString() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = null;
        try {
            inputText = bufferedReader.readLine();
        } catch (IOException e) {
            StringQueries.ERROR = "Не возможно считать символы !";
            System.out.println(StringQueries.ERROR);
        }
        return inputText;
    }

    //    чтение целочислинных данных с консоли
    public int inputDataInteger() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputText = 0;
        try {
            inputText = Integer.valueOf(bufferedReader.readLine());
        } catch (IOException e) {
            StringQueries.ERROR = "Не возможно считать символы !";
            System.out.println(StringQueries.ERROR);
        }
        return inputText;
    }


    //    получение списка всех таблиц из базы данных и помещение их в ArrayList
    public ArrayList<String> allTableName() {
        ArrayList<String> txt = new ArrayList<String>();
        try {
            resultSet = statement.executeQuery(StringQueries.SHOWTABLEDB);
            while (resultSet.next()) {
                txt.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return txt;
    }
}
