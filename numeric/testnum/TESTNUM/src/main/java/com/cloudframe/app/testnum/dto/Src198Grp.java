package com.cloudframe.app.testnum.dto;

/**
*  The class Src198Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src198Grp extends Src198GrpSerialized {
   
      private List<Short> src198; 

	
	/**
	* Constructor for Src198Grp
	**/
    public Src198Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src198
	 *  Corresponding COBOL Variable is WS-SRC-198
	 *	@return src198
	 */
	public List<Short> getSrc198() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_198_SIZE;index++) {
        	list.add( getSrc198( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src198
	 */
	public short getSrc198(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc198(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_198_SIZE) {
             	index = SRC_198_SIZE -1; // can't exceed max array size
             	logger.trace("src198 - Array index exceeded max Size {}, resetting it to max allowed",SRC_198_SIZE); 
	    }   
         return getShort(beginSrc198+ index*SRC_198_LEN);
   }
	
	/**
	 *	Update Src198 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-198
	 *  @param index
	 *	@param number
	 */
	public void setSrc198(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc198(index,number, true);
	}
	
	public void setSrc198(int index,int number) {
		setSrc198(index,(short)number, true);
	}
	public void setSrc198(int index,long number) {
			setSrc198(index,(short)number, true);
	}
	
	/**
	 *	Update  Src198 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc198(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc198(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_198_SIZE) {
             	index = SRC_198_SIZE -1; // can't exceed max array size
             	logger.trace("src198 - Array index exceeded max Size "+SRC_198_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc198(index,value);
		}
   }

	
	
	

		public static int getSrc198GrpFieldLength() {
			return SRC_198_GRP_LENGTH;
		}

}
  
