package com.cloudframe.app.testnum.dto;

/**
*  The class Src154Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src154Grp extends Src154GrpSerialized {
   
      private List<Integer> src154; 

	
	/**
	* Constructor for Src154Grp
	**/
    public Src154Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src154
	 *  Corresponding COBOL Variable is WS-SRC-154
	 *	@return src154
	 */
	public List<Integer> getSrc154() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SRC_154_SIZE;index++) {
        	list.add( getSrc154( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src154
	 */
	public int getSrc154(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc154(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_154_SIZE) {
             	index = SRC_154_SIZE -1; // can't exceed max array size
             	logger.trace("src154 - Array index exceeded max Size {}, resetting it to max allowed",SRC_154_SIZE); 
	    }   
		return getInt(beginSrc154+ index*SRC_154_LEN);
   }
	
	/**
	 *	Update Src154 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-154
	 *  @param index
	 *	@param number
	 */
	public void setSrc154(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setSrc154(index,number, true);
	}
	
	public void setSrc154(int index,long number) {
			setSrc154(index,(int)number, true);
	}
	
	/**
	 *	Update  Src154 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc154(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc154(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_154_SIZE) {
             	index = SRC_154_SIZE -1; // can't exceed max array size
             	logger.trace("src154 - Array index exceeded max Size "+SRC_154_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc154(index,value);
		}
   }

	
	
	

		public static int getSrc154GrpFieldLength() {
			return SRC_154_GRP_LENGTH;
		}

}
  
