package com.cloudframe.app.s918test.dto;

/**
*  The class Src164Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src164Grp extends Src164GrpSerialized { 
   
      private List<Integer> src164; 

	
	/**
	* Constructor for Src164Grp
	**/
    public Src164Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src164
	 *  Corresponding COBOL Variable is WS-SRC-164
	 *	@return src164
	 */
	public List<Integer> getSrc164() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SRC_164_SIZE;index++) {
        	list.add( getSrc164( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return src164
	 */
	public int getSrc164(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc164(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_164_SIZE) {
             	index = SRC_164_SIZE -1; // can't exceed max array size
             	logger.trace("src164 - Array index exceeded max Size {}, resetting it to max allowed",SRC_164_SIZE); 
	    }   
		return getInt(beginSrc164+ index*SRC_164_LEN);
   }
	
	/**
	 *	Update Src164 at index with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-164
	 *  @param index
	 *	@param number
	 */
	public void setSrc164(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setSrc164(index,number, true);
	}
	
	public void setSrc164(int index,long number) {
			setSrc164(index,(int)number, true);
	}
	
	/**
	 *	Update  Src164 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSrc164(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc164(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_164_SIZE) {
             	index = SRC_164_SIZE -1; // can't exceed max array size
             	logger.trace("src164 - Array index exceeded max Size "+SRC_164_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSrc164(index,value);
		}
   }

	
	
	

		public static int getSrc164GrpFieldLength() {
			return SRC_164_GRP_LENGTH;
		}

}
  
