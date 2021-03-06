package com.company;

import java.util.ArrayList;

public class Route {
    private String from;
    private String to;


    
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public Route(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public Route() {
       
    }


    public void makeroute(String departure, String arrive){
        ArrayList<Route> finalrouts = null;
        Route route=new Route(departure,arrive);
        finalrouts.add(route);
        
        // return finalrouts;
    }

   
    
    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((from == null) ? 0 : from.hashCode());
    result = prime * result + ((to == null) ? 0 : to.hashCode());
    return result;
    }
   
       @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Route other = (Route) obj;
       if (from == null) {
        if (other.from != null)
            return false;
    } else if (!from.equals(other.from))
        return false;
       if (to == null) {
           if (other.to != null)
               return false;
       } else if (!to.equals(other.to))
           return false;
       return true;
   }
    
}
