package com.cloudframe.app.s918test.dto;

/**
*  The class Src210Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src210Grp extends Src210GrpSerialized {
   
      private List<Short> src210; 

	
	/**
	* Constructor for Src210Grp
	**/
    public Src210Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src210
	 *  Corresponding COBOL Variable is WS-SRC-210
	 *	@return src210
	 */
	public List<Short> getSrc210() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_210_SIZE;index++) {
        	list.add( getSrc210( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src210
	 */
	public short getSrc210(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc210(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_210_SIZE) {
             	index = SRC_210_SIZE -1; // can't exceed max array size
             	logger.trace("src210 - Array index exceeded max Size {}, resetting it to max allowed",SRC_210_SIZE); 
	    }   
         return getShort(beginSrc210+ index*SRC_210_LEN);
   }
	
	/**
	 *	Update Src210 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-210
	 *  @param index
	 *	@param number
	 */
	public void setSrc210(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc210(index,number, true);
	}
	
	public void setSrc210(int index,int number) {
		setSrc210(index,(short)number, true);
	}
	public void setSrc210(int index,long number) {
			setSrc210(index,(short)number, true);
	}
	
	/**
	 *	Update  Src210 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc210(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc210(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_210_SIZE) {
             	index = SRC_210_SIZE -1; // can't exceed max array size
             	logger.trace("src210 - Array index exceeded max Size "+SRC_210_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc210(index,value);
		}
   }

	
	
	

		public static int getSrc210GrpFieldLength() {
			return SRC_210_GRP_LENGTH;
		}

}
  
