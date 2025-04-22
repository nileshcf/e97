package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip65504DeMap extends Ip65504DeMapSerialized { 
   
			private List<Ip65504DeMapEntry> ip65504DeMapEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504DeMap
	**/
    public Ip65504DeMap() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip65504DeMapEntry
	 *  Corresponding COBOL Variable is IP65504-DE-MAP-ENTRY
	 *	@return ip65504DeMapEntry
	 */
   public List<Ip65504DeMapEntry> getIp65504DeMapEntry() {
       return ip65504DeMapEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip65504DeMapEntry
	 */
	public Ip65504DeMapEntry getIp65504DeMapEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp65504DeMapEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_65504_DE_MAP_ENTRY_SIZE) {
             	index = IP_65504_DE_MAP_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip65504DeMapEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_65504_DE_MAP_ENTRY_SIZE); 
	    }
		if (index >= ip65504DeMapEntry.size()) {
       		for (int fillIndex =  ip65504DeMapEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip65504DeMapEntry.add(null);
		    }
			ip65504DeMapEntry.set(index,
			   	   	new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip65504DeMapEntry value = ip65504DeMapEntry.get(index);
   	   if (value == null) {
   	      ip65504DeMapEntry.set(index,
			   	   	new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength()) 
				                        ); 
		  value = ip65504DeMapEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip65504DeMapEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP65504-DE-MAP-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp65504DeMapEntry(int index,char[] value) {
   	getIp65504DeMapEntry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip65504DeMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504DeMapEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
              Ip65504DeMapEntry  newElement = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
              newElement.initialize();
               ip65504DeMapEntry.add(newElement);
          }
     } else {
        if (ip65504DeMapEntry.size() < IP_65504_DE_MAP_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip65504DeMapEntry.size();index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
              Ip65504DeMapEntry  newElement = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
               ip65504DeMapEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_DE_MAP_ENTRY_SIZE;index++) {
     		Ip65504DeMapEntry ip65504DeMapEntryVar = ip65504DeMapEntry.get(index);
 			if (ip65504DeMapEntryVar == null) {
                ip65504DeMapEntryVar = new Ip65504DeMapEntry(this,beginIp65504DeMapEntry + index * Ip65504DeMapEntry.getIp65504DeMapEntryFieldLength());
                  ip65504DeMapEntry.set(index, ip65504DeMapEntryVar);
			} 
			ip65504DeMapEntryVar.initialize();
		}
     }
   }

		public static int getIp65504DeMapFieldLength() {
			return IP_65504_DE_MAP_LENGTH;
		}

}
  
