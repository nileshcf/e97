package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt170Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt170Grp extends Tgt170GrpSerialized {
   
      private List<Long> tgt170; 

	
	/**
	* Constructor for Tgt170Grp
	**/
    public Tgt170Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt170
	 *  Corresponding COBOL Variable is WS-TGT-170
	 *	@return tgt170
	 */
	public List<Long> getTgt170() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_170_SIZE;index++) {
        	list.add( getTgt170( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt170
	 */
	public long getTgt170(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt170(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_170_SIZE) {
             	index = TGT_170_SIZE -1; // can't exceed max array size
             	logger.trace("tgt170 - Array index exceeded max Size {}, resetting it to max allowed",TGT_170_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt170+ index*TGT_170_LEN 
			                ,TGT_170_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt170IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt170
     *  @param index	 
	 *  @return tgt170
	 */
	public char[] getTgt170String(int index) {
	    return toCharArray( (beginTgt170 + index*TGT_170_LEN) , TGT_170_LEN );
	}
	/**
	 *	Update Tgt170 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-170
	 *  @param index
	 *	@param number
	 */
	public void setTgt170(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt170(index,number, true);
	}
	

	/**
	 *  Update Tgt170 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt170(int index,char[] value) {
			setTgt170(index,value, true);
	}
	
	/**
	 *	Update Tgt170 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt170(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt170(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_170_SIZE) {
             	index = TGT_170_SIZE -1; // can't exceed max array size
             	logger.trace("tgt170 - Array index exceeded max Size {}, resetting it to max allowed",TGT_170_SIZE); 
	    }
		if (setModified) {
			serializeTgt170(index,value);
		}
   }

	/**
	 *  Update Tgt170 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt170(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt170 + index*TGT_170_LEN)
			       ,TGT_170_LEN
			       );
		}
   }

	
	
	

		public static int getTgt170GrpFieldLength() {
			return TGT_170_GRP_LENGTH;
		}

}
  
