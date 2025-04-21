package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt158Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt158Grp extends Tgt158GrpSerialized {
   
      private List<Long> tgt158; 

	
	/**
	* Constructor for Tgt158Grp
	**/
    public Tgt158Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt158
	 *  Corresponding COBOL Variable is WS-TGT-158
	 *	@return tgt158
	 */
	public List<Long> getTgt158() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_158_SIZE;index++) {
        	list.add( getTgt158( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt158
	 */
	public long getTgt158(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt158(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_158_SIZE) {
             	index = TGT_158_SIZE -1; // can't exceed max array size
             	logger.trace("tgt158 - Array index exceeded max Size {}, resetting it to max allowed",TGT_158_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt158+ index*TGT_158_LEN 
			                ,TGT_158_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt158IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt158
     *  @param index	 
	 *  @return tgt158
	 */
	public char[] getTgt158String(int index) {
	    return toCharArray( (beginTgt158 + index*TGT_158_LEN) , TGT_158_LEN );
	}
	/**
	 *	Update Tgt158 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-158
	 *  @param index
	 *	@param number
	 */
	public void setTgt158(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt158(index,number, true);
	}
	

	/**
	 *  Update Tgt158 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt158(int index,char[] value) {
			setTgt158(index,value, true);
	}
	
	/**
	 *	Update Tgt158 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt158(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt158(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_158_SIZE) {
             	index = TGT_158_SIZE -1; // can't exceed max array size
             	logger.trace("tgt158 - Array index exceeded max Size {}, resetting it to max allowed",TGT_158_SIZE); 
	    }
		if (setModified) {
			serializeTgt158(index,value);
		}
   }

	/**
	 *  Update Tgt158 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt158(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt158 + index*TGT_158_LEN)
			       ,TGT_158_LEN
			       );
		}
   }

	
	
	

		public static int getTgt158GrpFieldLength() {
			return TGT_158_GRP_LENGTH;
		}

}
  
