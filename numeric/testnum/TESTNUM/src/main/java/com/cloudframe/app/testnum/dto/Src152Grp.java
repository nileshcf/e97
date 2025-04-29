package com.cloudframe.app.testnum.dto;

/**
*  The class Src152Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src152Grp extends Src152GrpSerialized {
   
      private List<Integer> src152; 

	
	/**
	* Constructor for Src152Grp
	**/
    public Src152Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src152
	 *  Corresponding COBOL Variable is WS-SRC-152
	 *	@return src152
	 */
	public List<Integer> getSrc152() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SRC_152_SIZE;index++) {
        	list.add( getSrc152( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src152
	 */
	public int getSrc152(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc152(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_152_SIZE) {
             	index = SRC_152_SIZE -1; // can't exceed max array size
             	logger.trace("src152 - Array index exceeded max Size {}, resetting it to max allowed",SRC_152_SIZE); 
	    }   
		return getInt(beginSrc152+ index*SRC_152_LEN);
   }
	
	/**
	 *	Update Src152 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-152
	 *  @param index
	 *	@param number
	 */
	public void setSrc152(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setSrc152(index,number, true);
	}
	
	public void setSrc152(int index,long number) {
			setSrc152(index,(int)number, true);
	}
	
	/**
	 *	Update  Src152 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc152(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc152(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_152_SIZE) {
             	index = SRC_152_SIZE -1; // can't exceed max array size
             	logger.trace("src152 - Array index exceeded max Size "+SRC_152_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc152(index,value);
		}
   }

	
	
	

		public static int getSrc152GrpFieldLength() {
			return SRC_152_GRP_LENGTH;
		}

}
  
