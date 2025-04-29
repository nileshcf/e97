package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumInpArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class WvNumInpArray extends WvNumInpArraySerialized { 
   
			private List<WvNumInpItem> wvNumInpItem = new ArrayList<>();
    	
	
	/**
	* Constructor for WvNumInpArray
	**/
    public WvNumInpArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvNumInpArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of wvNumInpItem
	 *  Corresponding COBOL Variable is WV-NUM-INP-ITEM
	 *	@return wvNumInpItem
	 */
   public List<WvNumInpItem> getWvNumInpItem() {
       return wvNumInpItem;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wvNumInpItem
	 */
	public WvNumInpItem getWvNumInpItem(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWvNumInpItem(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WV_NUM_INP_ITEM_SIZE) {
             	index = WV_NUM_INP_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("wvNumInpItem - Array index exceeded max Size {}, resetting it to max allowed",WV_NUM_INP_ITEM_SIZE); 
	    }
		if (index >= wvNumInpItem.size()) {
       		for (int fillIndex =  wvNumInpItem.size() -1; fillIndex < index;fillIndex++) {
		       wvNumInpItem.add(null);
		    }
			wvNumInpItem.set(index,
			   	   	new WvNumInpItem(this,beginWvNumInpItem + index * WvNumInpItem.getWvNumInpItemFieldLength()) 
				                        ); 	
		} 
   	   WvNumInpItem value = wvNumInpItem.get(index);
   	   if (value == null) {
   	      wvNumInpItem.set(index,
			   	   	new WvNumInpItem(this,beginWvNumInpItem + index * WvNumInpItem.getWvNumInpItemFieldLength()) 
				                        ); 
		  value = wvNumInpItem.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WvNumInpItem at index with the passed value
	 *  Corresponding COBOL Variable is WV-NUM-INP-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setWvNumInpItem(int index,char[] value) {
   	getWvNumInpItem(index).setString(value);
   }
   
	

	
	
	

		public static int getWvNumInpArrayFieldLength() {
			return WV_NUM_INP_ARRAY_LENGTH;
		}

}
  
