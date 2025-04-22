package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt157Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt157Grp extends Tgt157GrpSerialized {
   
      private List<Long> tgt157; 

	
	/**
	* Constructor for Tgt157Grp
	**/
    public Tgt157Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt157
	 *  Corresponding COBOL Variable is WS-TGT-157
	 *	@return tgt157
	 */
	public List<Long> getTgt157() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_157_SIZE;index++) {
        	list.add( getTgt157( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt157
	 */
	public long getTgt157(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt157(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_157_SIZE) {
             	index = TGT_157_SIZE -1; // can't exceed max array size
             	logger.trace("tgt157 - Array index exceeded max Size {}, resetting it to max allowed",TGT_157_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt157+ index*TGT_157_LEN 
			                ,TGT_157_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt157IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt157
     *  @param index	 
	 *  @return tgt157
	 */
	public char[] getTgt157String(int index) {
	    return toCharArray( (beginTgt157 + index*TGT_157_LEN) , TGT_157_LEN );
	}
	/**
	 *	Update Tgt157 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-157
	 *  @param index
	 *	@param number
	 */
	public void setTgt157(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt157(index,number, true);
	}
	

	/**
	 *  Update Tgt157 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt157(int index,char[] value) {
			setTgt157(index,value, true);
	}
	
	/**
	 *	Update Tgt157 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt157(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt157(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_157_SIZE) {
             	index = TGT_157_SIZE -1; // can't exceed max array size
             	logger.trace("tgt157 - Array index exceeded max Size {}, resetting it to max allowed",TGT_157_SIZE); 
	    }
		if (setModified) {
			serializeTgt157(index,value);
		}
   }

	/**
	 *  Update Tgt157 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt157(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt157 + index*TGT_157_LEN)
			       ,TGT_157_LEN
			       );
		}
   }

	
	
	

		public static int getTgt157GrpFieldLength() {
			return TGT_157_GRP_LENGTH;
		}

}
  
