package com.cloudframe.app.s918test.dto;

/**
*  The class Src170Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.math.RoundingMode;


public class Src170Grp extends Src170GrpSerialized {
   
      private List<BigDecimal> src170; 

	
	/**
	* Constructor for Src170Grp
	**/
    public Src170Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


    /**
	 *	Returns the value of src170
	 *  Corresponding COBOL Variable is WS-SRC-170
	 *	@return src170
	 */
	public List<BigDecimal> getSrc170() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < SRC_170_SIZE;index++) {
        	list.add( getSrc170( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src170
	 */
	public BigDecimal getSrc170(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc170(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_170_SIZE) {
             	index = SRC_170_SIZE -1; // can't exceed max array size
             	logger.trace("src170 - Array index exceeded max Size "+SRC_170_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginSrc170+ index*SRC_170_LEN ,
		SRC_170_LEN, SRC_170_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("src170", beginSrc170+ index*SRC_170_LEN,SRC_170_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean src170IsNumeric(int index) {
	    return decimalIsNumeric( beginSrc170+ index*SRC_170_LEN ,SRC_170_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-SRC-170
	 *  @param index
	 *	@param number
	 */
	public void setSrc170(int index,BigDecimal number) {	
		setSrc170(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc170(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc170(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= SRC_170_SIZE) {
             	index = SRC_170_SIZE -1; // can't exceed max array size
             	logger.trace("src170 - Array index exceeded max Size {}, resetting it to max allowed",SRC_170_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeSrc170(index,value);
		}
   }


	
	
	

		public static int getSrc170GrpFieldLength() {
			return SRC_170_GRP_LENGTH;
		}

}
  
