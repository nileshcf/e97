package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt154Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:12. using version 5.0.0.257
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt154Grp extends Tgt154GrpSerialized {
   
      private List<Long> tgt154; 

	
	/**
	* Constructor for Tgt154Grp
	**/
    public Tgt154Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt154
	 *  Corresponding COBOL Variable is WS-TGT-154
	 *	@return tgt154
	 */
	public List<Long> getTgt154() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_154_SIZE;index++) {
        	list.add( getTgt154( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt154
	 */
	public long getTgt154(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt154(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_154_SIZE) {
             	index = TGT_154_SIZE -1; // can't exceed max array size
             	logger.trace("tgt154 - Array index exceeded max Size {}, resetting it to max allowed",TGT_154_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt154+ index*TGT_154_LEN 
			                ,TGT_154_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt154IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt154
     *  @param index	 
	 *  @return tgt154
	 */
	public char[] getTgt154String(int index) {
	    return toCharArray( (beginTgt154 + index*TGT_154_LEN) , TGT_154_LEN );
	}
	/**
	 *	Update Tgt154 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-154
	 *  @param index
	 *	@param number
	 */
	public void setTgt154(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt154(index,number, true);
	}
	

	/**
	 *  Update Tgt154 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt154(int index,char[] value) {
			setTgt154(index,value, true);
	}
	
	/**
	 *	Update Tgt154 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt154(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt154(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_154_SIZE) {
             	index = TGT_154_SIZE -1; // can't exceed max array size
             	logger.trace("tgt154 - Array index exceeded max Size {}, resetting it to max allowed",TGT_154_SIZE); 
	    }
		if (setModified) {
			serializeTgt154(index,value);
		}
   }

	/**
	 *  Update Tgt154 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt154(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt154 + index*TGT_154_LEN)
			       ,TGT_154_LEN
			       );
		}
   }

	
	
	

		public static int getTgt154GrpFieldLength() {
			return TGT_154_GRP_LENGTH;
		}

}
  
