package com.cloudframe.app.s918test.dto;

/**
*  The class Src162Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src162Grp extends Src162GrpSerialized {
   
      private List<Short> src162; 

	
	/**
	* Constructor for Src162Grp
	**/
    public Src162Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src162
	 *  Corresponding COBOL Variable is WS-SRC-162
	 *	@return src162
	 */
	public List<Short> getSrc162() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_162_SIZE;index++) {
        	list.add( getSrc162( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src162
	 */
	public short getSrc162(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc162(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_162_SIZE) {
             	index = SRC_162_SIZE -1; // can't exceed max array size
             	logger.trace("src162 - Array index exceeded max Size {}, resetting it to max allowed",SRC_162_SIZE); 
	    }   
         return getShort(beginSrc162+ index*SRC_162_LEN);
   }
	
	/**
	 *	Update Src162 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-162
	 *  @param index
	 *	@param number
	 */
	public void setSrc162(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc162(index,number, true);
	}
	
	public void setSrc162(int index,int number) {
		setSrc162(index,(short)number, true);
	}
	public void setSrc162(int index,long number) {
			setSrc162(index,(short)number, true);
	}
	
	/**
	 *	Update  Src162 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc162(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc162(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_162_SIZE) {
             	index = SRC_162_SIZE -1; // can't exceed max array size
             	logger.trace("src162 - Array index exceeded max Size "+SRC_162_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc162(index,value);
		}
   }

	
	
	

		public static int getSrc162GrpFieldLength() {
			return SRC_162_GRP_LENGTH;
		}

}
  
