package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/


import com.cloudframe.app.sorttbl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Ip00854wTable extends Ip00854wTableSerialized { 
   
			private List<Ip00854wEntry> ip00854wEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00854wTable
	**/
    public Ip00854wTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00854wTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of ip00854wEntry
	 *  Corresponding COBOL Variable is IP00854W-ENTRY
	 *	@return ip00854wEntry
	 */
   public List<Ip00854wEntry> getIp00854wEntry() {
       return ip00854wEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00854wEntry
	 */
	public Ip00854wEntry getIp00854wEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00854wEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00854W_ENTRY_SIZE) {
             	index = IP_00854W_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00854wEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_00854W_ENTRY_SIZE); 
	    }
		if (index >= ip00854wEntry.size()) {
       		for (int fillIndex =  ip00854wEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip00854wEntry.add(null);
		    }
			ip00854wEntry.set(index,
			   	   	new Ip00854wEntry(this,beginIp00854wEntry + index * Ip00854wEntry.getIp00854wEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00854wEntry value = ip00854wEntry.get(index);
   	   if (value == null) {
   	      ip00854wEntry.set(index,
			   	   	new Ip00854wEntry(this,beginIp00854wEntry + index * Ip00854wEntry.getIp00854wEntryFieldLength()) 
				                        ); 
		  value = ip00854wEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00854wEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP00854W-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00854wEntry(int index,char[] value) {
   	getIp00854wEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getIp00854wTableFieldLength() {
			return IP_00854W_TABLE_LENGTH;
		}

}
  
