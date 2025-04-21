package com.cloudframe.app.ip989010.dto;

/**
*  The class DisplayTable501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class DisplayTable501 extends DisplayTable501Serialized {
   
			private List<DisplayData501> displayData501 = new ArrayList<>();
    	
	
	/**
	* Constructor for DisplayTable501
	**/
    public DisplayTable501() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DISPLAY_DATA_501_SIZE;arrayIndex++) {
						displayData501.add(new DisplayData501(this, beginDisplayData501 + 
						arrayIndex * DisplayData501.getDisplayData501FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of displayData501
	 *  Corresponding COBOL Variable is 501-DISPLAY-DATA
	 *	@return displayData501
	 */
   public List<DisplayData501> getDisplayData501() {
       return displayData501;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return displayData501
	 */
	public DisplayData501 getDisplayData501(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDisplayData501(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DISPLAY_DATA_501_SIZE) {
             	index = DISPLAY_DATA_501_SIZE -1; // can't exceed max array size
             	logger.trace("displayData501 - Array index exceeded max Size {}, resetting it to max allowed",DISPLAY_DATA_501_SIZE); 
	    }
		if (index >= displayData501.size()) {
       		for (int fillIndex =  displayData501.size() -1; fillIndex < index;fillIndex++) {
		       displayData501.add(null);
		    }
			displayData501.set(index,
			   	   	new DisplayData501(this,beginDisplayData501 + index * DisplayData501.getDisplayData501FieldLength()) 
				                        ); 	
		} 
   	   DisplayData501 value = displayData501.get(index);
   	   if (value == null) {
   	      displayData501.set(index,
			   	   	new DisplayData501(this,beginDisplayData501 + index * DisplayData501.getDisplayData501FieldLength()) 
				                        ); 
		  value = displayData501.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DisplayData501 at index with the passed value
	 *  Corresponding COBOL Variable is 501-DISPLAY-DATA
	 *  @param index
	 *	@param value
	 */
  public void setDisplayData501(int index,char[] value) {
   	getDisplayData501(index).setString(value);
   }
   
	

	
	
	

		public static int getDisplayTable501FieldLength() {
			return DISPLAY_TABLE_501_LENGTH;
		}

}
  
