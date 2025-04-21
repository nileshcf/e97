package com.cloudframe.app.testnum.dto;

/**
*  The class Src200Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src200Grp extends Src200GrpSerialized {
   
      private List<Short> src200; 

	
	/**
	* Constructor for Src200Grp
	**/
    public Src200Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src200
	 *  Corresponding COBOL Variable is WS-SRC-200
	 *	@return src200
	 */
	public List<Short> getSrc200() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_200_SIZE;index++) {
        	list.add( getSrc200( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src200
	 */
	public short getSrc200(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc200(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_200_SIZE) {
             	index = SRC_200_SIZE -1; // can't exceed max array size
             	logger.trace("src200 - Array index exceeded max Size {}, resetting it to max allowed",SRC_200_SIZE); 
	    }   
         return getShort(beginSrc200+ index*SRC_200_LEN);
   }
	
	/**
	 *	Update Src200 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-200
	 *  @param index
	 *	@param number
	 */
	public void setSrc200(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc200(index,number, true);
	}
	
	public void setSrc200(int index,int number) {
		setSrc200(index,(short)number, true);
	}
	public void setSrc200(int index,long number) {
			setSrc200(index,(short)number, true);
	}
	
	/**
	 *	Update  Src200 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc200(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc200(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_200_SIZE) {
             	index = SRC_200_SIZE -1; // can't exceed max array size
             	logger.trace("src200 - Array index exceeded max Size "+SRC_200_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc200(index,value);
		}
   }

	
	
	

		public static int getSrc200GrpFieldLength() {
			return SRC_200_GRP_LENGTH;
		}

}
  
