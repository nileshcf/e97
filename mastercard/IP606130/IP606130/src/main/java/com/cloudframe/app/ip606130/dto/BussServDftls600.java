package com.cloudframe.app.ip606130.dto;

/**
*  The class BussServDftls600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class BussServDftls600 extends BussServDftls600Serialized {
   
			private List<Table36Bsl600> table36Bsl600 = new ArrayList<>();
    	
	
	/**
	* Constructor for BussServDftls600
	**/
    public BussServDftls600() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TABLE_36_BSL_600_SIZE;arrayIndex++) {
						table36Bsl600.add(new Table36Bsl600(this, beginTable36Bsl600 + 
						arrayIndex * Table36Bsl600.getTable36Bsl600FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of table36Bsl600
	 *  Corresponding COBOL Variable is 600-TABLE36-BSL
	 *	@return table36Bsl600
	 */
   public List<Table36Bsl600> getTable36Bsl600() {
       return table36Bsl600;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return table36Bsl600
	 */
	public Table36Bsl600 getTable36Bsl600(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTable36Bsl600(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TABLE_36_BSL_600_SIZE) {
             	index = TABLE_36_BSL_600_SIZE -1; // can't exceed max array size
             	logger.trace("table36Bsl600 - Array index exceeded max Size {}, resetting it to max allowed",TABLE_36_BSL_600_SIZE); 
	    }
		if (index >= table36Bsl600.size()) {
       		for (int fillIndex =  table36Bsl600.size() -1; fillIndex < index;fillIndex++) {
		       table36Bsl600.add(null);
		    }
			table36Bsl600.set(index,
			   	   	new Table36Bsl600(this,beginTable36Bsl600 + index * Table36Bsl600.getTable36Bsl600FieldLength()) 
				                        ); 	
		} 
   	   Table36Bsl600 value = table36Bsl600.get(index);
   	   if (value == null) {
   	      table36Bsl600.set(index,
			   	   	new Table36Bsl600(this,beginTable36Bsl600 + index * Table36Bsl600.getTable36Bsl600FieldLength()) 
				                        ); 
		  value = table36Bsl600.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Table36Bsl600 at index with the passed value
	 *  Corresponding COBOL Variable is 600-TABLE36-BSL
	 *  @param index
	 *	@param value
	 */
  public void setTable36Bsl600(int index,char[] value) {
   	getTable36Bsl600(index).setString(value);
   }
   
	

	
	
	

		public static int getBussServDftls600FieldLength() {
			return BUSS_SERV_DFTLS_600_LENGTH;
		}

}
  
