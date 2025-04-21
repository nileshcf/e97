package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002Table0Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Ip00002Table0Data extends Ip00002Table0DataSerialized {
   
			private List<Ip00002Table0Entry> ip00002Table0Entry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00002Table0Data
	**/
    public Ip00002Table0Data() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00002_TABLE_0_ENTRY_SIZE;arrayIndex++) {
						ip00002Table0Entry.add(new Ip00002Table0Entry(this, beginIp00002Table0Entry + 
						arrayIndex * Ip00002Table0Entry.getIp00002Table0EntryFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of ip00002Table0Entry
	 *  Corresponding COBOL Variable is IP00002-TABLE-0-ENTRY
	 *	@return ip00002Table0Entry
	 */
   public List<Ip00002Table0Entry> getIp00002Table0Entry() {
       return ip00002Table0Entry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00002Table0Entry
	 */
	public Ip00002Table0Entry getIp00002Table0Entry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00002Table0Entry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00002_TABLE_0_ENTRY_SIZE) {
             	index = IP_00002_TABLE_0_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00002Table0Entry - Array index exceeded max Size {}, resetting it to max allowed",IP_00002_TABLE_0_ENTRY_SIZE); 
	    }
		if (index >= ip00002Table0Entry.size()) {
       		for (int fillIndex =  ip00002Table0Entry.size() -1; fillIndex < index;fillIndex++) {
		       ip00002Table0Entry.add(null);
		    }
			ip00002Table0Entry.set(index,
			   	   	new Ip00002Table0Entry(this,beginIp00002Table0Entry + index * Ip00002Table0Entry.getIp00002Table0EntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00002Table0Entry value = ip00002Table0Entry.get(index);
   	   if (value == null) {
   	      ip00002Table0Entry.set(index,
			   	   	new Ip00002Table0Entry(this,beginIp00002Table0Entry + index * Ip00002Table0Entry.getIp00002Table0EntryFieldLength()) 
				                        ); 
		  value = ip00002Table0Entry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00002Table0Entry at index with the passed value
	 *  Corresponding COBOL Variable is IP00002-TABLE-0-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00002Table0Entry(int index,char[] value) {
   	getIp00002Table0Entry(index).setString(value);
   }
   
	

	
	
	

		public static int getIp00002Table0DataFieldLength() {
			return IP_00002_TABLE_0_DATA_LENGTH;
		}

}
  
