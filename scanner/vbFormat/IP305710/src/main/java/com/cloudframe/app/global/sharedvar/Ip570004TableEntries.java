package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip570004TableEntries extends Ip570004TableEntriesSerialized { 
   
			private List<Ip570004TableEntry> ip570004TableEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip570004TableEntries
	**/
    public Ip570004TableEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip570004TableEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip570004TableEntry
	 *  Corresponding COBOL Variable is IP570004-TABLE-ENTRY
	 *	@return ip570004TableEntry
	 */
   public List<Ip570004TableEntry> getIp570004TableEntry() {
       return ip570004TableEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip570004TableEntry
	 */
	public Ip570004TableEntry getIp570004TableEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp570004TableEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_570004_TABLE_ENTRY_SIZE) {
             	index = IP_570004_TABLE_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip570004TableEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_570004_TABLE_ENTRY_SIZE); 
	    }
		if (index >= ip570004TableEntry.size()) {
       		for (int fillIndex =  ip570004TableEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip570004TableEntry.add(null);
		    }
			ip570004TableEntry.set(index,
			   	   	new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip570004TableEntry value = ip570004TableEntry.get(index);
   	   if (value == null) {
   	      ip570004TableEntry.set(index,
			   	   	new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength()) 
				                        ); 
		  value = ip570004TableEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip570004TableEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP570004-TABLE-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp570004TableEntry(int index,char[] value) {
   	getIp570004TableEntry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip570004TableEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip570004TableEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
              Ip570004TableEntry  newElement = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
              newElement.initialize();
               ip570004TableEntry.add(newElement);
          }
     } else {
        if (ip570004TableEntry.size() < IP_570004_TABLE_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip570004TableEntry.size();index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
              Ip570004TableEntry  newElement = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
               ip570004TableEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_570004_TABLE_ENTRY_SIZE;index++) {
     		Ip570004TableEntry ip570004TableEntryVar = ip570004TableEntry.get(index);
 			if (ip570004TableEntryVar == null) {
                ip570004TableEntryVar = new Ip570004TableEntry(this,beginIp570004TableEntry + index * Ip570004TableEntry.getIp570004TableEntryFieldLength());
                  ip570004TableEntry.set(index, ip570004TableEntryVar);
			} 
			ip570004TableEntryVar.initialize();
		}
     }
   }

		public static int getIp570004TableEntriesFieldLength() {
			return IP_570004_TABLE_ENTRIES_LENGTH;
		}

}
  
