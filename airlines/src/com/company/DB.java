package com.company;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final String URL="jdbc:mysql://localhost/airlinesDB?serverTimezone=UTC";
    final String USERNAME="kroot";
    final String PASSWORD="1234";
    final String AIRLINE_TABLE="airlines";
    final String TOWN_TABLE="towns";
    final String TIMETABLE="timetable";
    final String AI_NAME="name";
    final String AI_AVGSPEED="avg_speed";
    final String AI_SITPLACE="sit_place";
    final String TO_NAME="name";
    final String TO_POPULATIN="population";
    final String TI_DEPARTURE="fromm";
    final String TI_ARRIVE="too";
    final String TI_DISTANCE="distance";
    final String TI_AIRLINEID="al_id";
    final String T_ID="id";
    Connection conn       =null ;
    Statement st=null;
    DatabaseMetaData dbmd=null;
//
//    ResultSetMetaData rsmd=null;
    public DB(){
        try {
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
//            System.out.println("Connection is ready!!!!");
        } catch (SQLException e) {
            System.err.println(e);
            System.out.println("We have problem with connection!!!");;
        }

        try {
            st= conn.createStatement();
//            System.out.println("The statement is work");
        } catch (SQLException e) {
            System.err.println(e);
        }

        try {
            dbmd= conn.getMetaData();
        } catch (SQLException e) {
            System.err.println(e);
        }

        try {
            String sql=
                    "CREATE TABLE airlines(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, name varchar (200) not null, avg_speed int (10) not null, sit_place int (3) not null);" +
                    "CREATE TABLE towns( id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, name varchar (200) not null, population int (11) not null);" +
                    "CREATE TABLE timetable( id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, fromm varchar (200), too varchar (200), distance int (10), al_id int(11) )";



            ResultSet rs= dbmd.getColumns(null, "APP", "airlines", null);

//            if (!rs.next()){
//                st.execute(sql);
//                st.close();
//            System.out.println("The table was created!!!");
//                System.out.println("if loop!!!!");
//            }
        } catch (SQLException e) {

            System.err.println(e);
        }
    }


    //this method can add new airline to DB with name average speed and sit places
    public void addAirline(Airline airlines){
//        String sql="insert into"+ "'AIRLINE_TABLE'" +"(name,avg_speed,sit_place) values (?,?,?)";
                String sql="insert into airlines (name,avg_speed,sit_place) values (?,?,?)";

        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,airlines.getName());
            ps.setInt(2,airlines.getAvg_speed());
            ps.setInt(3,airlines.getSit_place());
            ps.execute();
        } catch (SQLException exception) {
            System.err.println(exception);
        }

    }

    //this method list from as all airlines from DB table like array list object
    public ArrayList<Airline> getAllAirlines(){
        ResultSet rs=null;
//        String sql="select * from"+ AIRLINE_TABLE;
                String sql="select * from airlines";

        ArrayList<Airline> airlines = null;
        try {
           rs=st.executeQuery(sql);
           airlines=new ArrayList<>();
           while(rs.next()){
               Airline actualairline=new Airline(rs.getString(AI_NAME),rs.getInt(AI_AVGSPEED),rs.getInt(AI_SITPLACE),rs.getInt(T_ID));
               airlines.add(actualairline);
           }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return airlines;
    }


    //this method give as all airline  where name is an option for searching
    public ArrayList<Airline> getwhereAirline(String airlineName){
        ResultSet rs=null;
//        String sql="select * from"+ AIRLINE_TABLE;
        String sql="select * from airlines where name='" + airlineName + "'";

        ArrayList<Airline> airline = null;
        try {
            rs=st.executeQuery(sql);
            airline=new ArrayList<>();
            while(rs.next()){
                Airline actualairline=new Airline(rs.getString(AI_NAME),rs.getInt(AI_AVGSPEED),rs.getInt(AI_SITPLACE),rs.getInt(T_ID));
                airline.add(actualairline);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return airline;
    }

    //this method give as an airline where airline id is a search option
    public ArrayList<Airline> getwhereAirlineID(int ID){
        ResultSet rs=null;
//        String sql="select * from"+ AIRLINE_TABLE;
        String sql="select * from airlines where id='" + ID + "'";

        ArrayList<Airline> airline = null;
        try {
            rs=st.executeQuery(sql);
            airline=new ArrayList<>();
            while(rs.next()){
                Airline actualairline=new Airline(rs.getString(AI_NAME),rs.getInt(AI_AVGSPEED),rs.getInt(AI_SITPLACE),rs.getInt(T_ID));
                airline.add(actualairline);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return airline;
    }


    //with this method we can add a town with name and population to DB like an object
    public void addTown(Town town){
//        String sql="insert into "+ TOWN_TABLE +" (name,population) values (?,?)";
                String sql="insert into towns (name,population) values (?,?)";

        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,town.getName());
            ps.setInt(2,town.getPopulation());
            ps.execute();
        } catch (SQLException exception) {
            System.err.println(exception);
        }

    }

    //with this method we can get all town from DB table
    public ArrayList<Town> getAllTowns(){
        ResultSet rs=null;
//        String sql="select * from "+TOWN_TABLE;
        String sql="select * from towns";

        ArrayList<Town> towns = null;
        try {
            rs=st.executeQuery(sql);
            towns=new ArrayList<>();
            while(rs.next()){
                Town actualtown=new Town(rs.getString(TO_NAME),rs.getInt(TO_POPULATIN),rs.getInt(T_ID));
                towns.add(actualtown);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return towns;
    }

    //with this method we can get all towns where a town name is an option
    public ArrayList<Town> getAllTownsWhere(String town_name){
        ResultSet rs=null;
//        String sql="select * from "+TOWN_TABLE;
        String sql="select * from towns where name='" + town_name + "'";

        ArrayList<Town> town = null;
        try {
            rs=st.executeQuery(sql);
            town=new ArrayList<>();
            while(rs.next()){
                Town actualtown=new Town(rs.getString(TO_NAME),rs.getInt(TO_POPULATIN),rs.getInt(T_ID));
                town.add(actualtown);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return town;
    }


    //with this method we can add new rotes to timetable object with departure arrive distance 
    public void addTimeTable(Timetable timetable){
//        String sql="insert into "+ TIMETABLE +" (fromm,too,distance,al_id) values (?,?,?,?)";
        String sql="insert into timetable (fromm,too,distance,al_id) values (?,?,?,?)";

        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,timetable.getFrom());
            ps.setString(2,timetable.getTo());
            ps.setInt(3,timetable.getDistance());
            ps.setInt(4,timetable.getId());
            ps.execute();
        } catch (SQLException exception) {
            System.err.println(exception);
        }

    }

    //this method give as all routes 
    public ArrayList<Timetable> getAllTimeTable(){
        ResultSet rs=null;
//        String sql="select * from "+TIMETABLE;
        String sql="select * from timetable";

        ArrayList<Timetable> timetables = null;
        try {
            rs=st.executeQuery(sql);
            timetables=new ArrayList<>();
            while(rs.next()){
                Timetable actualtimetable=new Timetable(rs.getString(TI_DEPARTURE),rs.getString(TI_ARRIVE),rs.getInt(TI_DISTANCE),rs.getInt(T_ID),rs.getInt(TI_AIRLINEID));
                timetables.add(actualtimetable);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return timetables;
    }


//this method give as all routes where airline id is an option for search
    public ArrayList<Timetable> getwhereAllTimeTable(int ID){
        ResultSet rs=null;
//        String sql="select * from "+TIMETABLE;
        String sql="select * from timetable where al_id='" + ID + "'";

        ArrayList<Timetable> timetables = null;
        try {
            rs=st.executeQuery(sql);
            timetables=new ArrayList<>();
            while(rs.next()){
                Timetable actualtimetable=new Timetable(rs.getString(TI_DEPARTURE),rs.getString(TI_ARRIVE),rs.getInt(TI_DISTANCE),rs.getInt(T_ID),rs.getInt(TI_AIRLINEID));
                timetables.add(actualtimetable);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return timetables;
    }


    //this method give as all routes where departure an option for searching
    public ArrayList<Timetable> getwhereTimeTable(String departure){
        ResultSet rs=null;
//        String sql="select * from "+TIMETABLE;
        String sql="select * from timetable where fromm='" + departure + "'";

        ArrayList<Timetable> timetables = null;
        try {
            rs=st.executeQuery(sql);
            timetables=new ArrayList<>();
            while(rs.next()){
                Timetable actualtimetable=new Timetable(rs.getString(TI_DEPARTURE),rs.getString(TI_ARRIVE),rs.getInt(TI_DISTANCE),rs.getInt(T_ID),rs.getInt(TI_AIRLINEID));
                timetables.add(actualtimetable);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return timetables;
    }


     //this method give as all routes where departure and arrive is  options for searching

    public ArrayList<Timetable> getwhereTimeTableFromTo(String departure,String arrive){
        ResultSet rs=null;
//        String sql="select * from "+TIMETABLE;
        String sql="select * from timetable where fromm='" + departure + "' AND too= '" + arrive + "'  ";

        ArrayList<Timetable> timetables = null;
        try {
            rs=st.executeQuery(sql);
            timetables=new ArrayList<>();
            while(rs.next()){
                Timetable actualtimetable=new Timetable(rs.getString(TI_DEPARTURE),rs.getString(TI_ARRIVE),rs.getInt(TI_DISTANCE),rs.getInt(T_ID),rs.getInt(TI_AIRLINEID));
                timetables.add(actualtimetable);
            }
        } catch (SQLException exception) {
            System.err.println(exception);
        }


        return timetables;
    }

}


