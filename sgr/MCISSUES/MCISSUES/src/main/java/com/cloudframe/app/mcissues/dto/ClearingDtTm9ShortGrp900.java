package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9ShortGrp900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ClearingDtTm9ShortGrp900 extends ClearingDtTm9ShortGrp900Serialized { 
   
			private List<ClearingDtTm9ShortAry900> clearingDtTm9ShortAry900 = new ArrayList<>();
    	
	
	/**
	* Constructor for ClearingDtTm9ShortGrp900
	**/
    public ClearingDtTm9ShortGrp900() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CLEARING_DT_TM_9_SHORT_ARY_900_SIZE;arrayIndex++) {
						clearingDtTm9ShortAry900.add(new ClearingDtTm9ShortAry900(this, beginClearingDtTm9ShortAry900 + 
						arrayIndex * ClearingDtTm9ShortAry900.getClearingDtTm9ShortAry900FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of clearingDtTm9ShortAry900
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9-SHORT-ARY
	 *	@return clearingDtTm9ShortAry900
	 */
   public List<ClearingDtTm9ShortAry900> getClearingDtTm9ShortAry900() {
       return clearingDtTm9ShortAry900;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return clearingDtTm9ShortAry900
	 */
	public ClearingDtTm9ShortAry900 getClearingDtTm9ShortAry900(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getClearingDtTm9ShortAry900(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CLEARING_DT_TM_9_SHORT_ARY_900_SIZE) {
             	index = CLEARING_DT_TM_9_SHORT_ARY_900_SIZE -1; // can't exceed max array size
             	logger.trace("clearingDtTm9ShortAry900 - Array index exceeded max Size {}, resetting it to max allowed",CLEARING_DT_TM_9_SHORT_ARY_900_SIZE); 
	    }
		if (index >= clearingDtTm9ShortAry900.size()) {
       		for (int fillIndex =  clearingDtTm9ShortAry900.size() -1; fillIndex < index;fillIndex++) {
		       clearingDtTm9ShortAry900.add(null);
		    }
			clearingDtTm9ShortAry900.set(index,
			   	   	new ClearingDtTm9ShortAry900(this,beginClearingDtTm9ShortAry900 + index * ClearingDtTm9ShortAry900.getClearingDtTm9ShortAry900FieldLength()) 
				                        ); 	
		} 
   	   ClearingDtTm9ShortAry900 value = clearingDtTm9ShortAry900.get(index);
   	   if (value == null) {
   	      clearingDtTm9ShortAry900.set(index,
			   	   	new ClearingDtTm9ShortAry900(this,beginClearingDtTm9ShortAry900 + index * ClearingDtTm9ShortAry900.getClearingDtTm9ShortAry900FieldLength()) 
				                        ); 
		  value = clearingDtTm9ShortAry900.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ClearingDtTm9ShortAry900 at index with the passed value
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9-SHORT-ARY
	 *  @param index
	 *	@param value
	 */
  public void setClearingDtTm9ShortAry900(int index,char[] value) {
   	getClearingDtTm9ShortAry900(index).setString(value);
   }
   
	

	
	
	

		public static int getClearingDtTm9ShortGrp900FieldLength() {
			return CLEARING_DT_TM_9_SHORT_GRP_900_LENGTH;
		}

}
  
