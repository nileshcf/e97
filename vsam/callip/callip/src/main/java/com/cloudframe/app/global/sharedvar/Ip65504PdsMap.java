package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip65504PdsMap extends Ip65504PdsMapSerialized { 
   
			private List<Ip65504PdsMapEntry> ip65504PdsMapEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504PdsMap
	**/
    public Ip65504PdsMap() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip65504PdsMapEntry
	 *  Corresponding COBOL Variable is IP65504-PDS-MAP-ENTRY
	 *	@return ip65504PdsMapEntry
	 */
   public List<Ip65504PdsMapEntry> getIp65504PdsMapEntry() {
       return ip65504PdsMapEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip65504PdsMapEntry
	 */
	public Ip65504PdsMapEntry getIp65504PdsMapEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp65504PdsMapEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_65504_PDS_MAP_ENTRY_SIZE) {
             	index = IP_65504_PDS_MAP_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip65504PdsMapEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_65504_PDS_MAP_ENTRY_SIZE); 
	    }
		if (index >= ip65504PdsMapEntry.size()) {
       		for (int fillIndex =  ip65504PdsMapEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip65504PdsMapEntry.add(null);
		    }
			ip65504PdsMapEntry.set(index,
			   	   	new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip65504PdsMapEntry value = ip65504PdsMapEntry.get(index);
   	   if (value == null) {
   	      ip65504PdsMapEntry.set(index,
			   	   	new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength()) 
				                        ); 
		  value = ip65504PdsMapEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip65504PdsMapEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP65504-PDS-MAP-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp65504PdsMapEntry(int index,char[] value) {
   	getIp65504PdsMapEntry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip65504PdsMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504PdsMapEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
              Ip65504PdsMapEntry  newElement = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
              newElement.initialize();
               ip65504PdsMapEntry.add(newElement);
          }
     } else {
        if (ip65504PdsMapEntry.size() < IP_65504_PDS_MAP_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip65504PdsMapEntry.size();index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
              Ip65504PdsMapEntry  newElement = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
               ip65504PdsMapEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_PDS_MAP_ENTRY_SIZE;index++) {
     		Ip65504PdsMapEntry ip65504PdsMapEntryVar = ip65504PdsMapEntry.get(index);
 			if (ip65504PdsMapEntryVar == null) {
                ip65504PdsMapEntryVar = new Ip65504PdsMapEntry(this,beginIp65504PdsMapEntry + index * Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength());
                  ip65504PdsMapEntry.set(index, ip65504PdsMapEntryVar);
			} 
			ip65504PdsMapEntryVar.initialize();
		}
     }
   }

		public static int getIp65504PdsMapFieldLength() {
			return IP_65504_PDS_MAP_LENGTH;
		}

}
  
