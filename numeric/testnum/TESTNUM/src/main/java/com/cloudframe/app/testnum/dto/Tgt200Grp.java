package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt200Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt200Grp extends Tgt200GrpSerialized {
   
      private List<Long> tgt200; 

	
	/**
	* Constructor for Tgt200Grp
	**/
    public Tgt200Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt200
	 *  Corresponding COBOL Variable is WS-TGT-200
	 *	@return tgt200
	 */
	public List<Long> getTgt200() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_200_SIZE;index++) {
        	list.add( getTgt200( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt200
	 */
	public long getTgt200(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt200(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_200_SIZE) {
             	index = TGT_200_SIZE -1; // can't exceed max array size
             	logger.trace("tgt200 - Array index exceeded max Size {}, resetting it to max allowed",TGT_200_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt200+ index*TGT_200_LEN 
			                ,TGT_200_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt200IsNumeric(int index) {
	    return isNumeric(0 + index*5 
	                    ,0 + (index+1)*5 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt200
     *  @param index	 
	 *  @return tgt200
	 */
	public char[] getTgt200String(int index) {
	    return toCharArray( (beginTgt200 + index*TGT_200_LEN) , TGT_200_LEN );
	}
	/**
	 *	Update Tgt200 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-200
	 *  @param index
	 *	@param number
	 */
	public void setTgt200(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt200(index,number, true);
	}
	

	/**
	 *  Update Tgt200 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt200(int index,char[] value) {
			setTgt200(index,value, true);
	}
	
	/**
	 *	Update Tgt200 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt200(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt200(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_200_SIZE) {
             	index = TGT_200_SIZE -1; // can't exceed max array size
             	logger.trace("tgt200 - Array index exceeded max Size {}, resetting it to max allowed",TGT_200_SIZE); 
	    }
		if (setModified) {
			serializeTgt200(index,value);
		}
   }

	/**
	 *  Update Tgt200 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt200(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,false/*isSigned?*/)
			       ,(beginTgt200 + index*TGT_200_LEN)
			       ,TGT_200_LEN
			       );
		}
   }

	
	
	

		public static int getTgt200GrpFieldLength() {
			return TGT_200_GRP_LENGTH;
		}

}
  
