package com.cloudframe.app.sf328010.dto;

/**
*  The class Sf535ZlogServiceTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Sf535ZlogServiceTable extends Sf535ZlogServiceTableSerialized { 
   
			private List<Sf535ZlogServiceEntry> sf535ZlogServiceEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Sf535ZlogServiceTable
	**/
    public Sf535ZlogServiceTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf535ZlogServiceTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of sf535ZlogServiceEntry
	 *  Corresponding COBOL Variable is SF535-ZLOG-SERVICE-ENTRY
	 *	@return sf535ZlogServiceEntry
	 */
   public List<Sf535ZlogServiceEntry> getSf535ZlogServiceEntry() {
       return sf535ZlogServiceEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sf535ZlogServiceEntry
	 */
	public Sf535ZlogServiceEntry getSf535ZlogServiceEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSf535ZlogServiceEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SF_535_ZLOG_SERVICE_ENTRY_SIZE) {
             	index = SF_535_ZLOG_SERVICE_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("sf535ZlogServiceEntry - Array index exceeded max Size {}, resetting it to max allowed",SF_535_ZLOG_SERVICE_ENTRY_SIZE); 
	    }
		if (index >= sf535ZlogServiceEntry.size()) {
       		for (int fillIndex =  sf535ZlogServiceEntry.size() -1; fillIndex < index;fillIndex++) {
		       sf535ZlogServiceEntry.add(null);
		    }
			sf535ZlogServiceEntry.set(index,
			   	   	new Sf535ZlogServiceEntry(this,beginSf535ZlogServiceEntry + index * Sf535ZlogServiceEntry.getSf535ZlogServiceEntryFieldLength()) 
				                        ); 	
		} 
   	   Sf535ZlogServiceEntry value = sf535ZlogServiceEntry.get(index);
   	   if (value == null) {
   	      sf535ZlogServiceEntry.set(index,
			   	   	new Sf535ZlogServiceEntry(this,beginSf535ZlogServiceEntry + index * Sf535ZlogServiceEntry.getSf535ZlogServiceEntryFieldLength()) 
				                        ); 
		  value = sf535ZlogServiceEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Sf535ZlogServiceEntry at index with the passed value
	 *  Corresponding COBOL Variable is SF535-ZLOG-SERVICE-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSf535ZlogServiceEntry(int index,char[] value) {
   	getSf535ZlogServiceEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getSf535ZlogServiceTableFieldLength() {
			return SF_535_ZLOG_SERVICE_TABLE_LENGTH;
		}

}
  
