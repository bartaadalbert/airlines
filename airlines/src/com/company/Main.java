package com.company;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// import jdk.vm.ci.aarch64.AArch64;

public class Main {

    public static void main(String[] args) {
        // long hours;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter departure:");

        // hours = in.nextLong();
        // long minutes = hours * 60;

        // System.out.println(minutes + " Minutes");
	// write your code here
//initialize DB
        DB db=new DB();
        Airline airline1=new Airline("KLM",980,123);
        Airline airline2=new Airline("Wideroe",920,95);
        Airline airline3=new Airline("Virgin Atlantic Airways",995,132);
        Airline airline4=new Airline("AEGEAN",973,112);
        Airline airline5=new Airline("Air Dolomiti",934,117);
        Airline airline6=new Airline("Loganair",994,87);
        Airline airline7=new Airline("Luxair",952,111);
        Airline airline8=new Airline("Sundair",823, 92);
        Airline airline9=new Airline("Lufthansa",841, 93);
        Airline airline10=new Airline("Wizz Air",801, 113);
        Airline airline11=new Airline("Air Canada",803, 119);
        Airline airline12=new Airline("Delta",823, 79);



        ArrayList<Airline> airlines=new ArrayList<>();
        airlines.add(airline1);
        airlines.add(airline2);
        airlines.add(airline3);
        airlines.add(airline4);
        airlines.add(airline5);
        airlines.add(airline6);
        airlines.add(airline7);
        airlines.add(airline8);
        airlines.add(airline9);
        airlines.add(airline10);
        airlines.add(airline11);
        airlines.add(airline12);



//        for (Airline airline: airlines
//             ) {
//            db.addAirline(airline);
//        }


//        db.addAirline(airline12);
        //Get the Airlines with arraylist

        Town town1=new Town("Frankfurt", 753056);
        Town town2=new Town("Toronto", 2930000);
        Town town3=new Town("Vancouver", 675238);
        Town town4=new Town("Kiev", 2884000);
        Town town5=new Town("Budapest", 1752000);
        Town town6=new Town("NewYork", 8399000);
        Town town7=new Town("London", 8982000);
        Town town8=new Town("Lviv", 721301);
        Town town9=new Town("Banglades", 161400000);
        Town town10=new Town("Shenzhen", 12530000);
        Town town11=new Town("Tokyo", 9273000);
        Town town12=new Town("Miami", 470914);
        Town town13=new Town("Las Vegas", 644644);
        Town town14=new Town("Amsterdam", 821752);
        Town town15=new Town("Sydney", 5312000);
        Town town16=new Town("Munich", 1472000);
        Town town17=new Town("Berlin", 3769000);
        Town town18=new Town("Dusseldorf", 612178);
        Town town19=new Town("Istanbul", 15460000);
        Town town20=new Town("Paris", 2187532);


//add all town object to arraylist;
        ArrayList<Town> towns= new ArrayList<>();
            towns.add(town1);
        towns.add(town2);
        towns.add(town3);
        towns.add(town4);
        towns.add(town5);
        towns.add(town6);
        towns.add(town7);
        towns.add(town8);
        towns.add(town9);
        towns.add(town10);
        towns.add(town11);
        towns.add(town12);
        towns.add(town13);
        towns.add(town14);
        towns.add(town15);
        towns.add(town16);
        towns.add(town17);
        towns.add(town18);
        towns.add(town19);
        towns.add(town20);


//        for (Town t: towns
//             ) {
//            db.addTown(t);
//        }

//        Timetable timetable1=new Timetable();


//        addnewTimetable("Air Canada","Toronto","Vancouver",3354);
//        addnewTimetable("Delta","NewYork","Las Vegas",3446);
//        addnewTimetable("Delta","NewYork","Las Vegas",3446);
//        addnewTimetable("KLM","Amsterdam","NewYork",5789);
//        addnewTimetable("Lufthansa","Budapest","Frankfurt",813);
//        addnewTimetable("Lufthansa","Frankfurt","Toronto",6329);
//        addnewTimetable("Delta","NewYork","Las Vegas",3446);
//        addnewTimetable("Wizz Air","Berlin","NewYork",6385);
//        addnewTimetable("Loganair","Paris","Tokyo",9712);
//        addnewTimetable("KLM","Paris","Amsterdam",430);
//        addnewTimetable("KLM","Amsterdam","Tokyo",9288);
//        addnewTimetable("Delta","Tokyo","Las Vegas",8903);
//        addnewTimetable("Wizz Air","Munich","Kiev",1393);
//        addnewTimetable("Wizz Air","Kiev","Shenzhen",7649);
//        addnewTimetable("Air Dolomiti","Shenzhen","Sydney",7403);
//        addnewTimetable("KLM","Dusseldorf","Budapest",981);
//        addnewTimetable("Luxair","London","Kiev",2133);
//        addnewTimetable("Luxair","Banglades","Shenzhen",2460);
//        addnewTimetable("Sundair","Banglades","Sydney",9121);
//        addnewTimetable("Delta","Las Vegas","Miami",3504);
//        addnewTimetable("Sundair","Banglades","Sydney",9121);
//        addnewTimetable("AEGEAN","London","Munich",917);
//        addnewTimetable("Wizz Air","Kiev","Banglades",5835);
//        addnewTimetable("Luxair","Banglades","Tokyo",4713);
//        addnewTimetable("Lufthansa","Lviv","Frankfurt",1096);
//        addnewTimetable("Lufthansa","Kiev","Budapest",898);
//        addnewTimetable("Lufthansa","Kiev","Munich",1394);
//        addnewTimetable("Lufthansa","Kiev","London",2133);
//        addnewTimetable("Lufthansa","Budapest","Paris",1244);
//        addnewTimetable("Sundair","Kiev","Paris",2023);
//        addnewTimetable("KLM","Lviv","Paris",1568);
//        addnewTimetable("Virgin Atlantic Airways","Paris","Toronto",5999);
//        addnewTimetable("KLM","Paris","Toronto",5999);
//        addnewTimetable("Wizz Air","Paris","Toronto",5999);
//        addnewTimetable("wizz Air","Paris","NewYork",5788);
//        addnewTimetable("wizz Air","Budapest","Istanbul",1067);
//        addnewTimetable("Lufthansa","Kiev","Istanbul",1056);
    //    addnewTimetable("Virgin Atlantic Airways","Amsterdam","NewYork",1056);





        // String departure=in.next();
        System.out.println("Please enter arrive:");
        // String arrive=in.next();
        String departure="Budapest";
        String arrive="Las Vegas";

        getallairlines();
        System.out.println(" ");
        getalltowns();
        System.out.println(" ");
        getalltimetables();
        System.out.println(" ");
        getwherealltimetables("KLM");
        System.out.println(" ");
        getEqualsOfftowns(departure,arrive);
        // ArrayList<Timetable> timetables3=getdepartureto(departure,arrive);
        // for (Timetable timetable : timetables3) {
        // ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());

        //     System.out.println(timetable.getFrom() +"---->"+timetable.getTo()+" Arline is "+airline.get(0).getName());
            
        // }
        // ArrayList<Timetable> timetables4= getdepartureto(timetables3.get(0).getTo(), arrive);
        // for (Timetable timetable : timetables4) {
        //     ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());
    
        //         System.out.println(timetable.getFrom() +"---->"+timetable.getTo()+" Arline is "+airline.get(0).getName());
                
        //     }

            List<String> lister=check(departure, arrive);           
            ArrayList<Route> routes=new ArrayList<>();
            
              

                
           
            for (int i=0; i<lister.size()-1; i++) {
                if(lister.size()>0 && i+1!=lister.size()){
                    
                    if(!lister.get(i).equals(arrive) && !lister.get(i+1).equals(departure)){
                Route route=new Route(lister.get(i),lister.get(i+1));
                routes.add( route);
                for (Route route2 : routes) {
                    
                    if(!routes.contains(route2)){
               routes.add( route);

                    }
                }
                    }
                
                }
       
            }

           
            for (Route route : routes) {
                System.out.println(route.getFrom()+"-->"+route.getTo());
            }
            
            // Set<Route> hashSet = new LinkedHashSet<>(routes);
         
            // ArrayList<Route> listWithoutDuplicates = new ArrayList<>(hashSet);
            // for (Route route : listWithoutDuplicates) {
            //     System.out.println(route.getFrom()+"------->"+route.getTo());
            // }

            ArrayList<Route>  newList = removeDuplicates(routes);
            Map<String, String> dataSet = new HashMap<String, String>(); 
            ArrayList<Timetable> finaltimetables=new ArrayList<>();
            for (Route route : newList) {
                // System.out.println(route);
                dataSet.put(route.getFrom(), route.getTo()); 
                System.out.println(route.getFrom()+"------------->"+route.getTo());
                finaltimetables= getdepartureto(route.getFrom(), route.getTo(),"");
                for (Timetable timetable : finaltimetables) {
                    ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());
         float time=(float)timetable.getDistance()/(float)airline.get(0).getAvg_speed();
         int hours = (int) time;
         int minutes = (int) (60 * (time - hours));
     
         System.err.println(timetable.getFrom()+" --> "+timetable.getTo()+" | AirLine is: "+airline.get(0).getName());
         System.out.println("the distance is "+timetable.getDistance()+" km.");
         System.out.println("The avarage speed of this Airline "+airline.get(0).getAvg_speed()+" km/h");
         System.out.println("Time need to fly "+hours+"h "+minutes+"p");
              System.out.println("The airline id is: "+timetable.getAl_id());
          }
            } 

         
            
        
      
  
        printResult(dataSet); 
            int occurrences = Collections.frequency(lister, arrive);
            System.out.println(occurrences);
            System.out.println(lister.size());
          

            ArrayList<Timetable> timing=db.getwhereTimeTableFromTo(departure, arrive);
            for (Timetable timetable : timing) {
                ArrayList<Airline> airline= db.getwhereAirlineID(timetable.getAl_id());
                System.out.println("from "+timetable.getFrom()+" to "+timetable.getTo()+" Airline is "+airline.get(0).getName());
            }

            // ArrayList<Timetable> timer=getdepartureto(departure,arrive,"Sundair");
            // for (Timetable timetable : timer) {
            //     System.out.println(timetable.getAl_id());
            // }
    //    System.out.println( check("Budapest","NewYork"));
    //    System.out.println( check("Dusseldorf","Budapest"));

    //   ArrayList<Timetable> list= check(departure,arrive);
    //    for (Timetable timetable : list) {
    //     ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());
    //        float time=(float)timetable.getDistance()/(float)airline.get(0).getAvg_speed();
    //        int hours = (int) time;
    //        int minutes = (int) (60 * (time - hours));
       
    //        System.err.println(timetable.getFrom()+" --> "+timetable.getTo()+" | AirLine is: "+airline.get(0).getName());
    //        System.out.println("the distance is "+timetable.getDistance()+" km.");
    //        System.out.println("The avarage speed of this Airline "+airline.get(0).getAvg_speed()+" km/h");
    //        System.out.println("Time need to fly "+hours+"h "+minutes+"p");

    //     //    Map<String, String> dataSet = new HashMap<String, String>(); 
    //     //    dataSet.put(timetable.getFrom(), timetable.getTo()); 
    //     //    printResult(dataSet); 
    //    }

       

//        getroute("departure", "arrive","KLM");



//        db.addTown(town20);
    }




//this method we can use for adding new routes with distance for airlines if airline exist
    
    public static  void addnewTimetable(String airlinename, String departure,String arrive ,int distance){
        DB db=new DB();
        ArrayList<Airline> airline= db.getwhereAirline(airlinename);
        if(airline.size()>0) {
            int id = airline.get(0).getId();
            Timetable timetable = new Timetable(departure, arrive, distance, id);
            db.addTimeTable(timetable);
        }else{
            System.err.println("You cant add timetable if airline does not exist!!!");
        }

    }
//this method get all airline from our DB
    public static void getallairlines(){
        DB db=new DB();
        ArrayList<Airline> airlines = db.getAllAirlines();
        System.out.println(" All Airlines: ");
        for (Airline al : airlines
        ) {
            System.out.print(al.getName()+" | ");
        }
    }
//this method get all towns from DB
    public static void getalltowns(){
        DB db=new DB();
        ArrayList<Town> towns = db.getAllTowns();
        System.out.println(" All Towns: ");
        for (Town town : towns
        ) {
            System.out.print(town.getName()+" | ");
        }
    }


    //this method return  towns  which has  more or less pupulation
    public static void getEqualsOfftowns(String departure, String arrive){
        DB db=new DB();
        ArrayList<Town> town_departure = db.getAllTownsWhere(departure);
        ArrayList<Town> town_arrive = db.getAllTownsWhere(arrive);
        if(town_departure.size()>0 && town_arrive.size()>0) {
           int tdp= town_departure.get(0).getPopulation();
           String tdn=town_departure.get(0).getName();
           int tap= town_arrive.get(0).getPopulation();
           String tan=town_arrive.get(0).getName();
           if(tdp > tap){
               System.out.println("A legkissebb varos: "+tan+" a lakossaga "+tap+" fo");
               System.out.println("A legnagyobb varos: "+tdn+" a lakossaga "+tdp+" fo");
           }else{
               System.out.println("A legkissebb varos: "+tdn+" a lakossaga "+tdp+" fo");
               System.out.println("A legnagyobb varos: "+tan+" a lakossaga "+tap+" fo");
           }
        }else{
            System.err.println("tho towns not in aur list please add with population info");
        }

    }
//this method give you all routes from DB
    public static void getalltimetables(){
        DB db=new DB();
        ArrayList<Timetable> timetables= db.getAllTimeTable();
        for (Timetable timetable: timetables
             ) {
            ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());
            System.out.println(timetable.getFrom()+"-->"+timetable.getTo()+" | "+airline.get(0).getName());
        }
    }
//this method can use for get routes where you interested about airline
    public static ArrayList<Timetable> getwherealltimetables(String airline_name){
        DB db=new DB();
        ArrayList<Airline> airline= db.getwhereAirline(airline_name);
        if(airline.size()>0) {
            int airlineID = airline.get(0).getId();
            ArrayList<Timetable> timetables = db.getwhereAllTimeTable(airlineID);
        return timetables;
        }
return null;
        //     for (Timetable timetable: timetables
        //          ) {
        //         System.out.println(timetable.getFrom()+"-->"+timetable.getTo()+" | "+airline.get(0).getName());
        //     }
        // }else{
        //     System.err.println("Not found airline!");
        // }

    }

//this method return for you all passible routes from routes table
    public static List<String> check(String departure, String arrive){
        DB db =new DB();
        List<String> listdep = new ArrayList<String>();
        List<String> listarr = new ArrayList<String>();
        ArrayList<Timetable> list1 = new ArrayList<Timetable>();
        ArrayList<Timetable> list2 = new ArrayList<Timetable>();

        // HashSet<Timetable> list = new HashSet<Timetable>();



       ArrayList<Timetable> timetables= db.getAllTimeTable();
       for (Timetable timetable : timetables) {
        ArrayList<Airline> airline=db.getwhereAirlineID(timetable.getAl_id());
        //    listdep.add(timetable.getFrom());
        //    listarr.add(timetable.getTo());
           if(departure.equals(timetable.getFrom()) ){
              list1.add(timetable);
            
           }else if(arrive.equals(timetable.getTo())){
            list2.add(timetable);
           }
       
       }

       ArrayList<Timetable> list3= new ArrayList<>();
       for (Timetable timetable : list1) {
           if(timetable.getTo().equals(arrive)){
                list3.add(timetable);
                System.out.println("Found one");
                System.out.println(timetable.getFrom() + " --> " + timetable.getTo());
                System.out.println("ready one!!!");
                listdep.add(timetable.getFrom());
                listdep.add(timetable.getTo());
                return listdep;
                // return list3;
           }

           for (Timetable timetable2 : list2) {
               if(timetable2.getFrom().equals(timetable.getTo())){
                //    listdep.clear();
                    System.out.println("Found two");
                    System.out.println(timetable.getFrom() + " --> " + timetable.getTo() + " --> " + timetable2.getTo());
                    System.out.println("ready two!!!");
                    listdep.add(timetable.getFrom());
                    listdep.add(timetable.getTo());
                    listdep.add(timetable2.getTo());

                    list3.add(timetable2);
                    // return listdep;
                    // return list3;
               }
               for (Timetable timetable3 : timetables) {
                   if(timetable3.getFrom().equals(timetable.getTo()) && timetable3.getTo().equals(timetable2.getFrom())){
                        System.out.println("Found three");
                        System.out.println(timetable.getFrom() + " --> " + timetable3.getFrom() + " --> " + timetable3.getTo() + " --> " + timetable2.getTo());
                        System.out.println("ready three!!!");
                        // listdep.clear();
                        list3.add(timetable2);
                        listdep.add(timetable.getFrom());
                        listdep.add(timetable3.getFrom());
                        listdep.add(timetable3.getTo());
                        listdep.add(timetable2.getTo());
                        // return listdep;
                        // return list3;
                   }
               }
           }
       }

  

        return listdep;
 
 
    }


//this method calculate the time what you need for a route and give you the shortest route

public static ArrayList<Timetable> getdepartureto(String departure, String arrive, String defairline){
    DB db=new DB();
    ArrayList<Timetable> timetables= db.getwhereTimeTableFromTo(departure, arrive);
    if(!defairline.trim().isEmpty()){
    timetables= getwherealltimetables(defairline);

    }

    ArrayList<Airline> airline=db.getwhereAirlineID(timetables.get(0).getAl_id());

    float timem=(float)timetables.get(0).getDistance()/(float)airline.get(0).getAvg_speed();
    float min=timem;
    ArrayList<Timetable> list=new ArrayList<>();
        list.add(timetables.get(0));  
             for (Timetable timetable : timetables) {
                 ArrayList<Airline> airline1=db.getwhereAirlineID(timetable.getAl_id());
                  float time=(float)timetable.getDistance()/(float)airline1.get(0).getAvg_speed();
                      if(min>time ){
                           min=time;
                           list.clear();
                           list.add(timetable);

                        }
        
                 }
        

   
    return list;
}


//this method remove duplicates from array list 
public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
{ 

    // Create a new ArrayList 
    ArrayList<T> newList = new ArrayList<T>(); 
    for (T element : list) { 
        if (!newList.contains(element)) { 

            newList.add(element); 
        } 
    } 
    return newList; 
} 

//this method give you an option for a route 
private static void printResult(Map<String, String> dataSet) 
{ 
    // To store reverse of given map 
    Map<String, String> reverseMap = new HashMap<String, String>(); 

    // To fill reverse map, iterate through the given map 
    for (Map.Entry<String,String> entry: dataSet.entrySet()) 
        reverseMap.put(entry.getValue(), entry.getKey()); 

    // Find the starting point of itinerary 
    String start = null; 
    for (Map.Entry<String,String> entry: dataSet.entrySet()) 
    { 
          if (!reverseMap.containsKey(entry.getKey())) 
          { 
               start = entry.getKey(); 
               break; 
          } 
    } 

    // If we could not find a starting point, then something wrong 
    // with input 
    if (start == null) 
    { 
       System.out.println("Invalid Input"); 
       return; 
    } 

    // Once we have starting point, we simple need to go next, next 
    // of next using given hash map 
    String to = dataSet.get(start); 
    while (to != null) 
    { 
        System.out.print(start +  "->" + to + ", "); 
        start = to; 
        to = dataSet.get(to); 
    } 
} 



}
