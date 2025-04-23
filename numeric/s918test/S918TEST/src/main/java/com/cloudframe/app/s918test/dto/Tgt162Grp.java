package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt162Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt162Grp extends Tgt162GrpSerialized {
   
      private List<Long> tgt162; 

	
	/**
	* Constructor for Tgt162Grp
	**/
    public Tgt162Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt162
	 *  Corresponding COBOL Variable is WS-TGT-162
	 *	@return tgt162
	 */
	public List<Long> getTgt162() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_162_SIZE;index++) {
        	list.add( getTgt162( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt162
	 */
	public long getTgt162(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt162(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_162_SIZE) {
             	index = TGT_162_SIZE -1; // can't exceed max array size
             	logger.trace("tgt162 - Array index exceeded max Size {}, resetting it to max allowed",TGT_162_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt162+ index*TGT_162_LEN 
			                ,TGT_162_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt162IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt162
     *  @param index	 
	 *  @return tgt162
	 */
	public char[] getTgt162String(int index) {
	    return toCharArray( (beginTgt162 + index*TGT_162_LEN) , TGT_162_LEN );
	}
	/**
	 *	Update Tgt162 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-162
	 *  @param index
	 *	@param number
	 */
	public void setTgt162(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt162(index,number, true);
	}
	

	/**
	 *  Update Tgt162 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt162(int index,char[] value) {
			setTgt162(index,value, true);
	}
	
	/**
	 *	Update Tgt162 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt162(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt162(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_162_SIZE) {
             	index = TGT_162_SIZE -1; // can't exceed max array size
             	logger.trace("tgt162 - Array index exceeded max Size {}, resetting it to max allowed",TGT_162_SIZE); 
	    }
		if (setModified) {
			serializeTgt162(index,value);
		}
   }

	/**
	 *  Update Tgt162 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt162(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt162 + index*TGT_162_LEN)
			       ,TGT_162_LEN
			       );
		}
   }

	
	
	

		public static int getTgt162GrpFieldLength() {
			return TGT_162_GRP_LENGTH;
		}

}
  
