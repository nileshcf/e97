package com.cloudframe.app.testnum.dto;

/**
*  The class Src148Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src148Grp extends Src148GrpSerialized {
   
      private List<Short> src148; 

	
	/**
	* Constructor for Src148Grp
	**/
    public Src148Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src148
	 *  Corresponding COBOL Variable is WS-SRC-148
	 *	@return src148
	 */
	public List<Short> getSrc148() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SRC_148_SIZE;index++) {
        	list.add( getSrc148( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src148
	 */
	public short getSrc148(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc148(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_148_SIZE) {
             	index = SRC_148_SIZE -1; // can't exceed max array size
             	logger.trace("src148 - Array index exceeded max Size {}, resetting it to max allowed",SRC_148_SIZE); 
	    }   
         return getShort(beginSrc148+ index*SRC_148_LEN);
   }
	
	/**
	 *	Update Src148 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-148
	 *  @param index
	 *	@param number
	 */
	public void setSrc148(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSrc148(index,number, true);
	}
	
	public void setSrc148(int index,int number) {
		setSrc148(index,(short)number, true);
	}
	public void setSrc148(int index,long number) {
			setSrc148(index,(short)number, true);
	}
	
	/**
	 *	Update  Src148 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc148(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc148(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_148_SIZE) {
             	index = SRC_148_SIZE -1; // can't exceed max array size
             	logger.trace("src148 - Array index exceeded max Size "+SRC_148_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc148(index,value);
		}
   }

	
	
	

		public static int getSrc148GrpFieldLength() {
			return SRC_148_GRP_LENGTH;
		}

}
  
