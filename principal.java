package Ejercicios.U9.Tarea3;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        //Creamos el objeto conexión
        Connection connection = null;

        Scanner sc = new Scanner(System.in);

    System.out.println("¿Que deseas hacer? \n 1. Insertar cliente \n 2. Asignar empleado a cliente \n " +
            "3. Añadir producto a pedido \n 4. Mostrar con detalles un pedido \n 5. Salir de la aplicacion");
    int respuesta = sc.nextInt();

    switch (respuesta) {
        case 1:
            try{
                connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");

                System.out.println("Introduzca el número del cliente");
                int cn = sc.nextInt();
                System.out.println("Introduzca el nombre del cliente");
                String nombre =sc.next();
                System.out.println("Introduzca la direccion del cliente");
                String direccion = sc.next();
                System.out.println("Introduzca el pais del cliente");
                String pais = sc.next();

                String sql = "insert into customers (customerNumber, customerName, addressLine1, country) values (?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

               statement.setInt(1, cn);
               statement.setString(2, nombre);
               statement.setString(3, direccion);
               statement.setString(4, pais);

                statement.executeQuery();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

            break;
        case 2:
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }
            break;
        case 6:
            try{
                connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");

                System.out.println("Introduzca el numero del cliente");
                int nc = sc.nextInt();

                String sql = "select * from customers where customerNumber= ?";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setInt(1, nc);

                System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

                ResultSet rs = statement.executeQuery();

                //Recorremos el conjunto de resultados
                while (rs.next()) {
                    String number = rs.getString("customerNumber");
                    String name = rs.getString("customerName");
                    String address = rs.getString("addressLine1");
                    String country = rs.getString("country");

                    System.out.println("-------------------------");
                    System.out.println("CustomerNumber: " + number);
                    System.out.println("CustomerName: " + name);
                    System.out.println("Address: " + address);
                    System.out.println("Country: " + country);
                    System.out.println("-------------------------");
                }

            } catch (SQLException e3) {
                System.out.println(e3.getMessage());
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e3) {
                    System.out.println(e3.getMessage());
                }
            }
            break;
        case 7:
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
                Statement statement = connection.createStatement();
                statement.setQueryTimeout(30);

                ResultSet rs = statement.executeQuery("Select * from customers");
                while (rs.next()) {
                    String number = rs.getString("customerNumber");
                    String name = rs.getString("customerName");
                    String address = rs.getString("addressLine1");
                    String country = rs.getString("country");

                    System.out.println("-------------------------");
                    System.out.println("CustomerNumber: " + number);
                    System.out.println("CustomerName: " + name);
                    System.out.println("Address: " + address);
                    System.out.println("Country: " + country);
                    System.out.println("-------------------------");
                }

            }catch (SQLException e4) {
                System.out.println(e4.getMessage());
        } finally {
          try {
            if (connection != null) {
              connection.close();
            }
          } catch (SQLException e4) {
            System.out.println(e4.getMessage());
          }
                }
    }
    }
}
