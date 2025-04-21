package com.cloudframe.app.s918test.dto;

/**
*  The class Src160Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src160Grp extends Src160GrpSerialized {
   
      private List<Short> src160; 

	
	/**
	* Constructor for Src160Grp
	**/
    public Src160Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src160
	 *  Corresponding COBOL Variable is WS-SRC-160
	 *	@return src160
	 */
	public List<Short> getSrc160() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_160_SIZE;index++) {
        	list.add( getSrc160( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src160
	 */
	public short getSrc160(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc160(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_160_SIZE) {
             	index = SRC_160_SIZE -1; // can't exceed max array size
             	logger.trace("src160 - Array index exceeded max Size {}, resetting it to max allowed",SRC_160_SIZE); 
	    }   
         return getShort(beginSrc160+ index*SRC_160_LEN);
   }
	
	/**
	 *	Update Src160 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-160
	 *  @param index
	 *	@param number
	 */
	public void setSrc160(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc160(index,number, true);
	}
	
	public void setSrc160(int index,int number) {
		setSrc160(index,(short)number, true);
	}
	public void setSrc160(int index,long number) {
			setSrc160(index,(short)number, true);
	}
	
	/**
	 *	Update  Src160 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc160(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc160(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_160_SIZE) {
             	index = SRC_160_SIZE -1; // can't exceed max array size
             	logger.trace("src160 - Array index exceeded max Size "+SRC_160_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc160(index,value);
		}
   }

	
	
	

		public static int getSrc160GrpFieldLength() {
			return SRC_160_GRP_LENGTH;
		}

}
  
