package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt199Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt199Grp extends Tgt199GrpSerialized { 
   
      private List<Long> tgt199; 

	
	/**
	* Constructor for Tgt199Grp
	**/
    public Tgt199Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt199
	 *  Corresponding COBOL Variable is WS-TGT-199
	 *	@return tgt199
	 */
	public List<Long> getTgt199() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_199_SIZE;index++) {
        	list.add( getTgt199( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt199
	 */
	public long getTgt199(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt199(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_199_SIZE) {
             	index = TGT_199_SIZE -1; // can't exceed max array size
             	logger.trace("tgt199 - Array index exceeded max Size {}, resetting it to max allowed",TGT_199_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt199+ index*TGT_199_LEN 
			                ,TGT_199_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt199IsNumeric(int index) {
	    return isNumeric(0 + index*5 
	                    ,0 + (index+1)*5 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt199
     *  @param index	 
	 *  @return tgt199
	 */
	public char[] getTgt199String(int index) {
	    return toCharArray( (beginTgt199 + index*TGT_199_LEN) , TGT_199_LEN );
	}
	/**
	 *	Update Tgt199 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-199
	 *  @param index
	 *	@param number
	 */
	public void setTgt199(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt199(index,number, true);
	}
	

	/**
	 *  Update Tgt199 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt199(int index,char[] value) {
			setTgt199(index,value, true);
	}
	
	/**
	 *	Update Tgt199 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt199(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt199(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_199_SIZE) {
             	index = TGT_199_SIZE -1; // can't exceed max array size
             	logger.trace("tgt199 - Array index exceeded max Size {}, resetting it to max allowed",TGT_199_SIZE); 
	    }
		if (setModified) {
			serializeTgt199(index,value);
		}
   }

	/**
	 *  Update Tgt199 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt199(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,false/*isSigned?*/)
			       ,(beginTgt199 + index*TGT_199_LEN)
			       ,TGT_199_LEN
			       );
		}
   }

	
	
	

		public static int getTgt199GrpFieldLength() {
			return TGT_199_GRP_LENGTH;
		}

}
  
