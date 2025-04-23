package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt166Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt166Grp extends Tgt166GrpSerialized {
   
      private List<Long> tgt166; 

	
	/**
	* Constructor for Tgt166Grp
	**/
    public Tgt166Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt166
	 *  Corresponding COBOL Variable is WS-TGT-166
	 *	@return tgt166
	 */
	public List<Long> getTgt166() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_166_SIZE;index++) {
        	list.add( getTgt166( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt166
	 */
	public long getTgt166(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt166(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_166_SIZE) {
             	index = TGT_166_SIZE -1; // can't exceed max array size
             	logger.trace("tgt166 - Array index exceeded max Size {}, resetting it to max allowed",TGT_166_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt166+ index*TGT_166_LEN 
			                ,TGT_166_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt166IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt166
     *  @param index	 
	 *  @return tgt166
	 */
	public char[] getTgt166String(int index) {
	    return toCharArray( (beginTgt166 + index*TGT_166_LEN) , TGT_166_LEN );
	}
	/**
	 *	Update Tgt166 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-166
	 *  @param index
	 *	@param number
	 */
	public void setTgt166(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt166(index,number, true);
	}
	

	/**
	 *  Update Tgt166 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt166(int index,char[] value) {
			setTgt166(index,value, true);
	}
	
	/**
	 *	Update Tgt166 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt166(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt166(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_166_SIZE) {
             	index = TGT_166_SIZE -1; // can't exceed max array size
             	logger.trace("tgt166 - Array index exceeded max Size {}, resetting it to max allowed",TGT_166_SIZE); 
	    }
		if (setModified) {
			serializeTgt166(index,value);
		}
   }

	/**
	 *  Update Tgt166 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt166(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt166 + index*TGT_166_LEN)
			       ,TGT_166_LEN
			       );
		}
   }

	
	
	

		public static int getTgt166GrpFieldLength() {
			return TGT_166_GRP_LENGTH;
		}

}
  
