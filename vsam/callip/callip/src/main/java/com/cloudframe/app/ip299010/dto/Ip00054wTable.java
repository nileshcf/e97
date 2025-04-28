package com.cloudframe.app.ip299010.dto;

/**
*  The class Ip00054wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Ip00054wTable extends Ip00054wTableSerialized {
   
			private List<Ip00054wEntry> ip00054wEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00054wTable
	**/
    public Ip00054wTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00054W_ENTRY_SIZE;arrayIndex++) {
						ip00054wEntry.add(new Ip00054wEntry(this, beginIp00054wEntry + 
						arrayIndex * Ip00054wEntry.getIp00054wEntryFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of ip00054wEntry
	 *  Corresponding COBOL Variable is IP00054W-ENTRY
	 *	@return ip00054wEntry
	 */
   public List<Ip00054wEntry> getIp00054wEntry() {
       return ip00054wEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00054wEntry
	 */
	public Ip00054wEntry getIp00054wEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00054wEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00054W_ENTRY_SIZE) {
             	index = IP_00054W_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00054wEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_00054W_ENTRY_SIZE); 
	    }
		if (index >= ip00054wEntry.size()) {
       		for (int fillIndex =  ip00054wEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip00054wEntry.add(null);
		    }
			ip00054wEntry.set(index,
			   	   	new Ip00054wEntry(this,beginIp00054wEntry + index * Ip00054wEntry.getIp00054wEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00054wEntry value = ip00054wEntry.get(index);
   	   if (value == null) {
   	      ip00054wEntry.set(index,
			   	   	new Ip00054wEntry(this,beginIp00054wEntry + index * Ip00054wEntry.getIp00054wEntryFieldLength()) 
				                        ); 
		  value = ip00054wEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00054wEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP00054W-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00054wEntry(int index,char[] value) {
   	getIp00054wEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getIp00054wTableFieldLength() {
			return IP_00054W_TABLE_LENGTH;
		}

}
  
