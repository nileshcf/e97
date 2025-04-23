package com.cloudframe.app.testnum.dto;

/**
*  The class Src156Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.math.RoundingMode;


public class Src156Grp extends Src156GrpSerialized {
   
      private List<BigDecimal> src156; 

	
	/**
	* Constructor for Src156Grp
	**/
    public Src156Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


    /**
	 *	Returns the value of src156
	 *  Corresponding COBOL Variable is WS-SRC-156
	 *	@return src156
	 */
	public List<BigDecimal> getSrc156() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < SRC_156_SIZE;index++) {
        	list.add( getSrc156( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src156
	 */
	public BigDecimal getSrc156(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc156(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_156_SIZE) {
             	index = SRC_156_SIZE -1; // can't exceed max array size
             	logger.trace("src156 - Array index exceeded max Size "+SRC_156_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginSrc156+ index*SRC_156_LEN ,
		SRC_156_LEN, SRC_156_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("src156", beginSrc156+ index*SRC_156_LEN,SRC_156_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean src156IsNumeric(int index) {
	    return decimalIsNumeric( beginSrc156+ index*SRC_156_LEN ,SRC_156_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-SRC-156
	 *  @param index
	 *	@param number
	 */
	public void setSrc156(int index,BigDecimal number) {	
		setSrc156(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc156(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc156(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= SRC_156_SIZE) {
             	index = SRC_156_SIZE -1; // can't exceed max array size
             	logger.trace("src156 - Array index exceeded max Size {}, resetting it to max allowed",SRC_156_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeSrc156(index,value);
		}
   }


	
	
	

		public static int getSrc156GrpFieldLength() {
			return SRC_156_GRP_LENGTH;
		}

}
  
