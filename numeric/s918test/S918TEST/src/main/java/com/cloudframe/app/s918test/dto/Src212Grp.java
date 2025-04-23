package com.cloudframe.app.s918test.dto;

/**
*  The class Src212Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src212Grp extends Src212GrpSerialized {
   
      private List<Short> src212; 

	
	/**
	* Constructor for Src212Grp
	**/
    public Src212Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src212
	 *  Corresponding COBOL Variable is WS-SRC-212
	 *	@return src212
	 */
	public List<Short> getSrc212() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_212_SIZE;index++) {
        	list.add( getSrc212( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src212
	 */
	public short getSrc212(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc212(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_212_SIZE) {
             	index = SRC_212_SIZE -1; // can't exceed max array size
             	logger.trace("src212 - Array index exceeded max Size {}, resetting it to max allowed",SRC_212_SIZE); 
	    }   
         return getShort(beginSrc212+ index*SRC_212_LEN);
   }
	
	/**
	 *	Update Src212 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-212
	 *  @param index
	 *	@param number
	 */
	public void setSrc212(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc212(index,number, true);
	}
	
	public void setSrc212(int index,int number) {
		setSrc212(index,(short)number, true);
	}
	public void setSrc212(int index,long number) {
			setSrc212(index,(short)number, true);
	}
	
	/**
	 *	Update  Src212 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc212(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc212(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_212_SIZE) {
             	index = SRC_212_SIZE -1; // can't exceed max array size
             	logger.trace("src212 - Array index exceeded max Size "+SRC_212_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc212(index,value);
		}
   }

	
	
	

		public static int getSrc212GrpFieldLength() {
			return SRC_212_GRP_LENGTH;
		}

}
  
