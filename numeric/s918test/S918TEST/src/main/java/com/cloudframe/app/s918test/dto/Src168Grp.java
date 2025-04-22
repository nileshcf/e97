package com.cloudframe.app.s918test.dto;

/**
*  The class Src168Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.math.RoundingMode;


public class Src168Grp extends Src168GrpSerialized {
   
      private List<BigDecimal> src168; 

	
	/**
	* Constructor for Src168Grp
	**/
    public Src168Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


    /**
	 *	Returns the value of src168
	 *  Corresponding COBOL Variable is WS-SRC-168
	 *	@return src168
	 */
	public List<BigDecimal> getSrc168() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < SRC_168_SIZE;index++) {
        	list.add( getSrc168( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src168
	 */
	public BigDecimal getSrc168(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc168(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_168_SIZE) {
             	index = SRC_168_SIZE -1; // can't exceed max array size
             	logger.trace("src168 - Array index exceeded max Size "+SRC_168_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginSrc168+ index*SRC_168_LEN ,
		SRC_168_LEN, SRC_168_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("src168", beginSrc168+ index*SRC_168_LEN,SRC_168_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean src168IsNumeric(int index) {
	    return decimalIsNumeric( beginSrc168+ index*SRC_168_LEN ,SRC_168_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-SRC-168
	 *  @param index
	 *	@param number
	 */
	public void setSrc168(int index,BigDecimal number) {	
		setSrc168(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc168(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc168(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= SRC_168_SIZE) {
             	index = SRC_168_SIZE -1; // can't exceed max array size
             	logger.trace("src168 - Array index exceeded max Size {}, resetting it to max allowed",SRC_168_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeSrc168(index,value);
		}
   }


	
	
	

		public static int getSrc168GrpFieldLength() {
			return SRC_168_GRP_LENGTH;
		}

}
  
