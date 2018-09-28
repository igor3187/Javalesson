package com.company.lesson23;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAO {
    public static final String SELECT_FROM_PHONES = "SELECT * FROM phones";


    public List<Phone> findAll() {
        List<Phone> result = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection(); Statement statement = ((Connection) connection).createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_PHONES);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int userid = resultSet.getInt("user_id");
                String number = resultSet.getString("phone_number");
                Phone phone = new Phone(id, userid, number);
                result.add(phone);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}