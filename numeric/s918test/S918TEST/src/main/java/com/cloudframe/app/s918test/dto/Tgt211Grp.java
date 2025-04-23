package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt211Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt211Grp extends Tgt211GrpSerialized {
   
      private List<Long> tgt211; 

	
	/**
	* Constructor for Tgt211Grp
	**/
    public Tgt211Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt211
	 *  Corresponding COBOL Variable is WS-TGT-211
	 *	@return tgt211
	 */
	public List<Long> getTgt211() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_211_SIZE;index++) {
        	list.add( getTgt211( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt211
	 */
	public long getTgt211(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt211(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_211_SIZE) {
             	index = TGT_211_SIZE -1; // can't exceed max array size
             	logger.trace("tgt211 - Array index exceeded max Size {}, resetting it to max allowed",TGT_211_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt211+ index*TGT_211_LEN 
			                ,TGT_211_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt211IsNumeric(int index) {
	    return isNumeric(0 + index*5 
	                    ,0 + (index+1)*5 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt211
     *  @param index	 
	 *  @return tgt211
	 */
	public char[] getTgt211String(int index) {
	    return toCharArray( (beginTgt211 + index*TGT_211_LEN) , TGT_211_LEN );
	}
	/**
	 *	Update Tgt211 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-211
	 *  @param index
	 *	@param number
	 */
	public void setTgt211(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt211(index,number, true);
	}
	

	/**
	 *  Update Tgt211 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt211(int index,char[] value) {
			setTgt211(index,value, true);
	}
	
	/**
	 *	Update Tgt211 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt211(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt211(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_211_SIZE) {
             	index = TGT_211_SIZE -1; // can't exceed max array size
             	logger.trace("tgt211 - Array index exceeded max Size {}, resetting it to max allowed",TGT_211_SIZE); 
	    }
		if (setModified) {
			serializeTgt211(index,value);
		}
   }

	/**
	 *  Update Tgt211 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt211(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,false/*isSigned?*/)
			       ,(beginTgt211 + index*TGT_211_LEN)
			       ,TGT_211_LEN
			       );
		}
   }

	
	
	

		public static int getTgt211GrpFieldLength() {
			return TGT_211_GRP_LENGTH;
		}

}
  
