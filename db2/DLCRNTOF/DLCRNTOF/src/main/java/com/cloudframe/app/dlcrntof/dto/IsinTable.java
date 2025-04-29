package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class IsinTable extends IsinTableSerialized { 
   
			private List<IsinEntry> isinEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for IsinTable
	**/
    public IsinTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IsinTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of isinEntry
	 *  Corresponding COBOL Variable is ISIN-ENTRY
	 *	@return isinEntry
	 */
   public List<IsinEntry> getIsinEntry() {
       return isinEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return isinEntry
	 */
	public IsinEntry getIsinEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIsinEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= ISIN_ENTRY_SIZE) {
             	index = ISIN_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("isinEntry - Array index exceeded max Size {}, resetting it to max allowed",ISIN_ENTRY_SIZE); 
	    }
		if (index >= isinEntry.size()) {
       		for (int fillIndex =  isinEntry.size() -1; fillIndex < index;fillIndex++) {
		       isinEntry.add(null);
		    }
			isinEntry.set(index,
			   	   	new IsinEntry(this,beginIsinEntry + index * IsinEntry.getIsinEntryFieldLength()) 
				                        ); 	
		} 
   	   IsinEntry value = isinEntry.get(index);
   	   if (value == null) {
   	      isinEntry.set(index,
			   	   	new IsinEntry(this,beginIsinEntry + index * IsinEntry.getIsinEntryFieldLength()) 
				                        ); 
		  value = isinEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IsinEntry at index with the passed value
	 *  Corresponding COBOL Variable is ISIN-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIsinEntry(int index,char[] value) {
   	getIsinEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getIsinTableFieldLength() {
			return ISIN_TABLE_LENGTH;
		}

}
  
