package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt212Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt212Grp extends Tgt212GrpSerialized {
   
      private List<Long> tgt212; 

	
	/**
	* Constructor for Tgt212Grp
	**/
    public Tgt212Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt212
	 *  Corresponding COBOL Variable is WS-TGT-212
	 *	@return tgt212
	 */
	public List<Long> getTgt212() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_212_SIZE;index++) {
        	list.add( getTgt212( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt212
	 */
	public long getTgt212(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt212(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_212_SIZE) {
             	index = TGT_212_SIZE -1; // can't exceed max array size
             	logger.trace("tgt212 - Array index exceeded max Size {}, resetting it to max allowed",TGT_212_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt212+ index*TGT_212_LEN 
			                ,TGT_212_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt212IsNumeric(int index) {
	    return isNumeric(0 + index*5 
	                    ,0 + (index+1)*5 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt212
     *  @param index	 
	 *  @return tgt212
	 */
	public char[] getTgt212String(int index) {
	    return toCharArray( (beginTgt212 + index*TGT_212_LEN) , TGT_212_LEN );
	}
	/**
	 *	Update Tgt212 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-212
	 *  @param index
	 *	@param number
	 */
	public void setTgt212(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt212(index,number, true);
	}
	

	/**
	 *  Update Tgt212 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt212(int index,char[] value) {
			setTgt212(index,value, true);
	}
	
	/**
	 *	Update Tgt212 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt212(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt212(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_212_SIZE) {
             	index = TGT_212_SIZE -1; // can't exceed max array size
             	logger.trace("tgt212 - Array index exceeded max Size {}, resetting it to max allowed",TGT_212_SIZE); 
	    }
		if (setModified) {
			serializeTgt212(index,value);
		}
   }

	/**
	 *  Update Tgt212 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt212(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,false/*isSigned?*/)
			       ,(beginTgt212 + index*TGT_212_LEN)
			       ,TGT_212_LEN
			       );
		}
   }

	
	
	

		public static int getTgt212GrpFieldLength() {
			return TGT_212_GRP_LENGTH;
		}

}
  
