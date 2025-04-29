package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt178Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt178Grp extends Tgt178GrpSerialized {
   
      private List<Long> tgt178; 

	
	/**
	* Constructor for Tgt178Grp
	**/
    public Tgt178Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt178
	 *  Corresponding COBOL Variable is WS-TGT-178
	 *	@return tgt178
	 */
	public List<Long> getTgt178() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_178_SIZE;index++) {
        	list.add( getTgt178( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt178
	 */
	public long getTgt178(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt178(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_178_SIZE) {
             	index = TGT_178_SIZE -1; // can't exceed max array size
             	logger.trace("tgt178 - Array index exceeded max Size {}, resetting it to max allowed",TGT_178_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt178+ index*TGT_178_LEN 
			                ,TGT_178_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt178IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt178
     *  @param index	 
	 *  @return tgt178
	 */
	public char[] getTgt178String(int index) {
	    return toCharArray( (beginTgt178 + index*TGT_178_LEN) , TGT_178_LEN );
	}
	/**
	 *	Update Tgt178 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-178
	 *  @param index
	 *	@param number
	 */
	public void setTgt178(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt178(index,number, true);
	}
	

	/**
	 *  Update Tgt178 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt178(int index,char[] value) {
			setTgt178(index,value, true);
	}
	
	/**
	 *	Update Tgt178 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt178(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt178(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_178_SIZE) {
             	index = TGT_178_SIZE -1; // can't exceed max array size
             	logger.trace("tgt178 - Array index exceeded max Size {}, resetting it to max allowed",TGT_178_SIZE); 
	    }
		if (setModified) {
			serializeTgt178(index,value);
		}
   }

	/**
	 *  Update Tgt178 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt178(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt178 + index*TGT_178_LEN)
			       ,TGT_178_LEN
			       );
		}
   }

	
	
	

		public static int getTgt178GrpFieldLength() {
			return TGT_178_GRP_LENGTH;
		}

}
  
