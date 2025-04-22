package com.cloudframe.app.testnum.dto;

/**
*  The class Src158Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.math.RoundingMode;


public class Src158Grp extends Src158GrpSerialized {
   
      private List<BigDecimal> src158; 

	
	/**
	* Constructor for Src158Grp
	**/
    public Src158Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


    /**
	 *	Returns the value of src158
	 *  Corresponding COBOL Variable is WS-SRC-158
	 *	@return src158
	 */
	public List<BigDecimal> getSrc158() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < SRC_158_SIZE;index++) {
        	list.add( getSrc158( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src158
	 */
	public BigDecimal getSrc158(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc158(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_158_SIZE) {
             	index = SRC_158_SIZE -1; // can't exceed max array size
             	logger.trace("src158 - Array index exceeded max Size "+SRC_158_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginSrc158+ index*SRC_158_LEN ,
		SRC_158_LEN, SRC_158_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("src158", beginSrc158+ index*SRC_158_LEN,SRC_158_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean src158IsNumeric(int index) {
	    return decimalIsNumeric( beginSrc158+ index*SRC_158_LEN ,SRC_158_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-SRC-158
	 *  @param index
	 *	@param number
	 */
	public void setSrc158(int index,BigDecimal number) {	
		setSrc158(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc158(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc158(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= SRC_158_SIZE) {
             	index = SRC_158_SIZE -1; // can't exceed max array size
             	logger.trace("src158 - Array index exceeded max Size {}, resetting it to max allowed",SRC_158_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeSrc158(index,value);
		}
   }


	
	
	

		public static int getSrc158GrpFieldLength() {
			return SRC_158_GRP_LENGTH;
		}

}
  
