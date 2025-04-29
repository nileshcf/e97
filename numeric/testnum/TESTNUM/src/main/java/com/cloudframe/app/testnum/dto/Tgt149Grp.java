package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt149Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt149Grp extends Tgt149GrpSerialized {
   
      private List<Long> tgt149; 

	
	/**
	* Constructor for Tgt149Grp
	**/
    public Tgt149Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt149
	 *  Corresponding COBOL Variable is WS-TGT-149
	 *	@return tgt149
	 */
	public List<Long> getTgt149() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_149_SIZE;index++) {
        	list.add( getTgt149( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt149
	 */
	public long getTgt149(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt149(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_149_SIZE) {
             	index = TGT_149_SIZE -1; // can't exceed max array size
             	logger.trace("tgt149 - Array index exceeded max Size {}, resetting it to max allowed",TGT_149_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt149+ index*TGT_149_LEN 
			                ,TGT_149_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt149IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt149
     *  @param index	 
	 *  @return tgt149
	 */
	public char[] getTgt149String(int index) {
	    return toCharArray( (beginTgt149 + index*TGT_149_LEN) , TGT_149_LEN );
	}
	/**
	 *	Update Tgt149 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-149
	 *  @param index
	 *	@param number
	 */
	public void setTgt149(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt149(index,number, true);
	}
	

	/**
	 *  Update Tgt149 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt149(int index,char[] value) {
			setTgt149(index,value, true);
	}
	
	/**
	 *	Update Tgt149 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt149(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt149(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_149_SIZE) {
             	index = TGT_149_SIZE -1; // can't exceed max array size
             	logger.trace("tgt149 - Array index exceeded max Size {}, resetting it to max allowed",TGT_149_SIZE); 
	    }
		if (setModified) {
			serializeTgt149(index,value);
		}
   }

	/**
	 *  Update Tgt149 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt149(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt149 + index*TGT_149_LEN)
			       ,TGT_149_LEN
			       );
		}
   }

	
	
	

		public static int getTgt149GrpFieldLength() {
			return TGT_149_GRP_LENGTH;
		}

}
  
