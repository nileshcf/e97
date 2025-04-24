package com.cloudframe.app.s918test.dto;

/**
*  The class Src166Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src166Grp extends Src166GrpSerialized { 
   
      private List<Integer> src166; 

	
	/**
	* Constructor for Src166Grp
	**/
    public Src166Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src166
	 *  Corresponding COBOL Variable is WS-SRC-166
	 *	@return src166
	 */
	public List<Integer> getSrc166() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SRC_166_SIZE;index++) {
        	list.add( getSrc166( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src166
	 */
	public int getSrc166(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc166(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_166_SIZE) {
             	index = SRC_166_SIZE -1; // can't exceed max array size
             	logger.trace("src166 - Array index exceeded max Size {}, resetting it to max allowed",SRC_166_SIZE); 
	    }   
		return getInt(beginSrc166+ index*SRC_166_LEN);
   }
	
	/**
	 *	Update Src166 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-166
	 *  @param index
	 *	@param number
	 */
	public void setSrc166(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setSrc166(index,number, true);
	}
	
	public void setSrc166(int index,long number) {
			setSrc166(index,(int)number, true);
	}
	
	/**
	 *	Update  Src166 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc166(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc166(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_166_SIZE) {
             	index = SRC_166_SIZE -1; // can't exceed max array size
             	logger.trace("src166 - Array index exceeded max Size "+SRC_166_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc166(index,value);
		}
   }

	
	
	

		public static int getSrc166GrpFieldLength() {
			return SRC_166_GRP_LENGTH;
		}

}
  
