package com.cloudframe.app.search0.dto;

/**
*  The class WtFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WtFields extends WtFieldsSerialized {
   
			private List<WtCodeCtrl> wtCodeCtrl = new ArrayList<>();
    	
	
	/**
	* Constructor for WtFields
	**/
    public WtFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WT_CODE_CTRL_SIZE;arrayIndex++) {
						wtCodeCtrl.add(new WtCodeCtrl(this, beginWtCodeCtrl + 
						arrayIndex * WtCodeCtrl.getWtCodeCtrlFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of wtCodeCtrl
	 *  Corresponding COBOL Variable is WT-CODE-CTRL
	 *	@return wtCodeCtrl
	 */
   public List<WtCodeCtrl> getWtCodeCtrl() {
       return wtCodeCtrl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wtCodeCtrl
	 */
	public WtCodeCtrl getWtCodeCtrl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWtCodeCtrl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WT_CODE_CTRL_SIZE) {
             	index = WT_CODE_CTRL_SIZE -1; // can't exceed max array size
             	logger.trace("wtCodeCtrl - Array index exceeded max Size {}, resetting it to max allowed",WT_CODE_CTRL_SIZE); 
	    }
		if (index >= wtCodeCtrl.size()) {
       		for (int fillIndex =  wtCodeCtrl.size() -1; fillIndex < index;fillIndex++) {
		       wtCodeCtrl.add(null);
		    }
			wtCodeCtrl.set(index,
			   	   	new WtCodeCtrl(this,beginWtCodeCtrl + index * WtCodeCtrl.getWtCodeCtrlFieldLength()) 
				                        ); 	
		} 
   	   WtCodeCtrl value = wtCodeCtrl.get(index);
   	   if (value == null) {
   	      wtCodeCtrl.set(index,
			   	   	new WtCodeCtrl(this,beginWtCodeCtrl + index * WtCodeCtrl.getWtCodeCtrlFieldLength()) 
				                        ); 
		  value = wtCodeCtrl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WtCodeCtrl at index with the passed value
	 *  Corresponding COBOL Variable is WT-CODE-CTRL
	 *  @param index
	 *	@param value
	 */
  public void setWtCodeCtrl(int index,char[] value) {
   	getWtCodeCtrl(index).setString(value);
   }
   
	

	
	
	

		public static int getWtFieldsFieldLength() {
			return WT_FIELDS_LENGTH;
		}

}
  
