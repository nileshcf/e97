package com.cloudframe.app.cobpgmor.dto;

/**
*  The class Ibook is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.cobpgmor.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Ibook extends IbookSerialized { 
   
      private List<Short> indstruc; 

	
	/**
	* Constructor for Ibook
	**/
    public Ibook() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of indstruc
	 *  Corresponding COBOL Variable is INDSTRUC
	 *	@return indstruc
	 */
	public List<Short> getIndstruc() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < INDSTRUC_SIZE;index++) {
        	list.add( getIndstruc( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return indstruc
	 */
	public short getIndstruc(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIndstruc(), resetting it to 0",index);
		    index = 0;
        } else if (index >= INDSTRUC_SIZE) {
             	index = INDSTRUC_SIZE -1; // can't exceed max array size
             	logger.trace("indstruc - Array index exceeded max Size {}, resetting it to max allowed",INDSTRUC_SIZE); 
	    }   
         return getShort(beginIndstruc+ index*INDSTRUC_LEN);
   }
	
	/**
	 *	Update Indstruc at index with the passed value
	 *  Corresponding COBOL Variable is INDSTRUC
	 *  @param index
	 *	@param number
	 */
	public void setIndstruc(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setIndstruc(index,number, true);
	}
	
	public void setIndstruc(int index,int number) {
		setIndstruc(index,(short)number, true);
	}
	public void setIndstruc(int index,long number) {
			setIndstruc(index,(short)number, true);
	}
	
	/**
	 *	Update  Indstruc at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setIndstruc(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIndstruc(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= INDSTRUC_SIZE) {
             	index = INDSTRUC_SIZE -1; // can't exceed max array size
             	logger.trace("indstruc - Array index exceeded max Size "+INDSTRUC_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeIndstruc(index,value);
		}
   }

	
	
	

		public static int getIbookFieldLength() {
			return IBOOK_LENGTH;
		}

}
  
