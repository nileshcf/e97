package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RecordCheckTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class RecordCheckTbl extends RecordCheckTblSerialized { 
   
			private List<RctTblEntry> rctTblEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for RecordCheckTbl
	**/
    public RecordCheckTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < RCT_TBL_ENTRY_SIZE;arrayIndex++) {
						rctTblEntry.add(new RctTblEntry(this, beginRctTblEntry + 
						arrayIndex * RctTblEntry.getRctTblEntryFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of rctTblEntry
	 *  Corresponding COBOL Variable is RCT-TBL-ENTRY
	 *	@return rctTblEntry
	 */
   public List<RctTblEntry> getRctTblEntry() {
       return rctTblEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return rctTblEntry
	 */
	public RctTblEntry getRctTblEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRctTblEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RCT_TBL_ENTRY_SIZE) {
             	index = RCT_TBL_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("rctTblEntry - Array index exceeded max Size {}, resetting it to max allowed",RCT_TBL_ENTRY_SIZE); 
	    }
		if (index >= rctTblEntry.size()) {
       		for (int fillIndex =  rctTblEntry.size() -1; fillIndex < index;fillIndex++) {
		       rctTblEntry.add(null);
		    }
			rctTblEntry.set(index,
			   	   	new RctTblEntry(this,beginRctTblEntry + index * RctTblEntry.getRctTblEntryFieldLength()) 
				                        ); 	
		} 
   	   RctTblEntry value = rctTblEntry.get(index);
   	   if (value == null) {
   	      rctTblEntry.set(index,
			   	   	new RctTblEntry(this,beginRctTblEntry + index * RctTblEntry.getRctTblEntryFieldLength()) 
				                        ); 
		  value = rctTblEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update RctTblEntry at index with the passed value
	 *  Corresponding COBOL Variable is RCT-TBL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setRctTblEntry(int index,char[] value) {
   	getRctTblEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getRecordCheckTblFieldLength() {
			return RECORD_CHECK_TBL_LENGTH;
		}

}
  
