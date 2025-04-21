package com.cloudframe.app.search2.dto;

/**
*  The class SbidGroupTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class SbidGroupTbl extends SbidGroupTblSerialized {
   
			private List<SbidGroupEntries> sbidGroupEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for SbidGroupTbl
	**/
    public SbidGroupTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SBID_GROUP_ENTRIES_SIZE;arrayIndex++) {
						sbidGroupEntries.add(new SbidGroupEntries(this, beginSbidGroupEntries + 
						arrayIndex * SbidGroupEntries.getSbidGroupEntriesFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of sbidGroupEntries
	 *  Corresponding COBOL Variable is WS-SBID-GROUP-ENTRIES
	 *	@return sbidGroupEntries
	 */
   public List<SbidGroupEntries> getSbidGroupEntries() {
       return sbidGroupEntries;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sbidGroupEntries
	 */
	public SbidGroupEntries getSbidGroupEntries(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSbidGroupEntries(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SBID_GROUP_ENTRIES_SIZE) {
             	index = SBID_GROUP_ENTRIES_SIZE -1; // can't exceed max array size
             	logger.trace("sbidGroupEntries - Array index exceeded max Size {}, resetting it to max allowed",SBID_GROUP_ENTRIES_SIZE); 
	    }
		if (index >= sbidGroupEntries.size()) {
       		for (int fillIndex =  sbidGroupEntries.size() -1; fillIndex < index;fillIndex++) {
		       sbidGroupEntries.add(null);
		    }
			sbidGroupEntries.set(index,
			   	   	new SbidGroupEntries(this,beginSbidGroupEntries + index * SbidGroupEntries.getSbidGroupEntriesFieldLength()) 
				                        ); 	
		} 
   	   SbidGroupEntries value = sbidGroupEntries.get(index);
   	   if (value == null) {
   	      sbidGroupEntries.set(index,
			   	   	new SbidGroupEntries(this,beginSbidGroupEntries + index * SbidGroupEntries.getSbidGroupEntriesFieldLength()) 
				                        ); 
		  value = sbidGroupEntries.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SbidGroupEntries at index with the passed value
	 *  Corresponding COBOL Variable is WS-SBID-GROUP-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setSbidGroupEntries(int index,char[] value) {
   	getSbidGroupEntries(index).setString(value);
   }
   
	

	
	
	

		public static int getSbidGroupTblFieldLength() {
			return SBID_GROUP_TBL_LENGTH;
		}

}
  
