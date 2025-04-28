package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9Grp900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ClearingDtTm9Grp900 extends ClearingDtTm9Grp900Serialized {
   
			private List<ClearingDtTm9Ary900> clearingDtTm9Ary900 = new ArrayList<>();
    	
	
	/**
	* Constructor for ClearingDtTm9Grp900
	**/
    public ClearingDtTm9Grp900() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CLEARING_DT_TM_9_ARY_900_SIZE;arrayIndex++) {
						clearingDtTm9Ary900.add(new ClearingDtTm9Ary900(this, beginClearingDtTm9Ary900 + 
						arrayIndex * ClearingDtTm9Ary900.getClearingDtTm9Ary900FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of clearingDtTm9Ary900
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9-ARY
	 *	@return clearingDtTm9Ary900
	 */
   public List<ClearingDtTm9Ary900> getClearingDtTm9Ary900() {
       return clearingDtTm9Ary900;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return clearingDtTm9Ary900
	 */
	public ClearingDtTm9Ary900 getClearingDtTm9Ary900(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getClearingDtTm9Ary900(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CLEARING_DT_TM_9_ARY_900_SIZE) {
             	index = CLEARING_DT_TM_9_ARY_900_SIZE -1; // can't exceed max array size
             	logger.trace("clearingDtTm9Ary900 - Array index exceeded max Size {}, resetting it to max allowed",CLEARING_DT_TM_9_ARY_900_SIZE); 
	    }
		if (index >= clearingDtTm9Ary900.size()) {
       		for (int fillIndex =  clearingDtTm9Ary900.size() -1; fillIndex < index;fillIndex++) {
		       clearingDtTm9Ary900.add(null);
		    }
			clearingDtTm9Ary900.set(index,
			   	   	new ClearingDtTm9Ary900(this,beginClearingDtTm9Ary900 + index * ClearingDtTm9Ary900.getClearingDtTm9Ary900FieldLength()) 
				                        ); 	
		} 
   	   ClearingDtTm9Ary900 value = clearingDtTm9Ary900.get(index);
   	   if (value == null) {
   	      clearingDtTm9Ary900.set(index,
			   	   	new ClearingDtTm9Ary900(this,beginClearingDtTm9Ary900 + index * ClearingDtTm9Ary900.getClearingDtTm9Ary900FieldLength()) 
				                        ); 
		  value = clearingDtTm9Ary900.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ClearingDtTm9Ary900 at index with the passed value
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9-ARY
	 *  @param index
	 *	@param value
	 */
  public void setClearingDtTm9Ary900(int index,char[] value) {
   	getClearingDtTm9Ary900(index).setString(value);
   }
   
	

	
	
	

		public static int getClearingDtTm9Grp900FieldLength() {
			return CLEARING_DT_TM_9_GRP_900_LENGTH;
		}

}
  
