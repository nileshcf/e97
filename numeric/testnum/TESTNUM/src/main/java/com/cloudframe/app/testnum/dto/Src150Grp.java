package com.cloudframe.app.testnum.dto;

/**
*  The class Src150Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src150Grp extends Src150GrpSerialized {
   
      private List<Short> src150; 

	
	/**
	* Constructor for Src150Grp
	**/
    public Src150Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src150
	 *  Corresponding COBOL Variable is WS-SRC-150
	 *	@return src150
	 */
	public List<Short> getSrc150() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_150_SIZE;index++) {
        	list.add( getSrc150( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src150
	 */
	public short getSrc150(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc150(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_150_SIZE) {
             	index = SRC_150_SIZE -1; // can't exceed max array size
             	logger.trace("src150 - Array index exceeded max Size {}, resetting it to max allowed",SRC_150_SIZE); 
	    }   
         return getShort(beginSrc150+ index*SRC_150_LEN);
   }
	
	/**
	 *	Update Src150 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-150
	 *  @param index
	 *	@param number
	 */
	public void setSrc150(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc150(index,number, true);
	}
	
	public void setSrc150(int index,int number) {
		setSrc150(index,(short)number, true);
	}
	public void setSrc150(int index,long number) {
			setSrc150(index,(short)number, true);
	}
	
	/**
	 *	Update  Src150 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc150(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc150(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_150_SIZE) {
             	index = SRC_150_SIZE -1; // can't exceed max array size
             	logger.trace("src150 - Array index exceeded max Size "+SRC_150_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc150(index,value);
		}
   }

	
	
	

		public static int getSrc150GrpFieldLength() {
			return SRC_150_GRP_LENGTH;
		}

}
  
