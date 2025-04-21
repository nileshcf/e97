package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404ArRangeEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip00404ArRangeEntries extends Ip00404ArRangeEntriesSerialized { 
   
			private List<Ip00404Entry> ip00404Entry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00404ArRangeEntries
	**/
    public Ip00404ArRangeEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404ArRangeEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404ArRangeEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip00404Entry
	 *  Corresponding COBOL Variable is IP00404-ENTRY
	 *	@return ip00404Entry
	 */
   public List<Ip00404Entry> getIp00404Entry() {
       return ip00404Entry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00404Entry
	 */
	public Ip00404Entry getIp00404Entry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00404Entry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00404_ENTRY_SIZE) {
             	index = IP_00404_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00404Entry - Array index exceeded max Size {}, resetting it to max allowed",IP_00404_ENTRY_SIZE); 
	    }
		if (index >= ip00404Entry.size()) {
       		for (int fillIndex =  ip00404Entry.size() -1; fillIndex < index;fillIndex++) {
		       ip00404Entry.add(null);
		    }
			ip00404Entry.set(index,
			   	   	new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00404Entry value = ip00404Entry.get(index);
   	   if (value == null) {
   	      ip00404Entry.set(index,
			   	   	new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength()) 
				                        ); 
		  value = ip00404Entry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00404Entry at index with the passed value
	 *  Corresponding COBOL Variable is IP00404-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00404Entry(int index,char[] value) {
   	getIp00404Entry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip00404ArRangeEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00404Entry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00404_ENTRY_SIZE;index++) {
              Ip00404Entry  newElement = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
              newElement.initialize();
               ip00404Entry.add(newElement);
          }
     } else {
        if (ip00404Entry.size() < IP_00404_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00404Entry.size();index <  IP_00404_ENTRY_SIZE;index++) {
              Ip00404Entry  newElement = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
               ip00404Entry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00404_ENTRY_SIZE;index++) {
     		Ip00404Entry ip00404EntryVar = ip00404Entry.get(index);
 			if (ip00404EntryVar == null) {
                ip00404EntryVar = new Ip00404Entry(this,beginIp00404Entry + index * Ip00404Entry.getIp00404EntryFieldLength());
                  ip00404Entry.set(index, ip00404EntryVar);
			} 
			ip00404EntryVar.initialize();
		}
     }
   }

		public static int getIp00404ArRangeEntriesFieldLength() {
			return IP_00404_AR_RANGE_ENTRIES_LENGTH;
		}

}
  
