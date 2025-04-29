package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt177Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt177Grp extends Tgt177GrpSerialized {
   
      private List<Long> tgt177; 

	
	/**
	* Constructor for Tgt177Grp
	**/
    public Tgt177Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt177
	 *  Corresponding COBOL Variable is WS-TGT-177
	 *	@return tgt177
	 */
	public List<Long> getTgt177() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_177_SIZE;index++) {
        	list.add( getTgt177( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt177
	 */
	public long getTgt177(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt177(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_177_SIZE) {
             	index = TGT_177_SIZE -1; // can't exceed max array size
             	logger.trace("tgt177 - Array index exceeded max Size {}, resetting it to max allowed",TGT_177_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt177+ index*TGT_177_LEN 
			                ,TGT_177_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt177IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt177
     *  @param index	 
	 *  @return tgt177
	 */
	public char[] getTgt177String(int index) {
	    return toCharArray( (beginTgt177 + index*TGT_177_LEN) , TGT_177_LEN );
	}
	/**
	 *	Update Tgt177 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-177
	 *  @param index
	 *	@param number
	 */
	public void setTgt177(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt177(index,number, true);
	}
	

	/**
	 *  Update Tgt177 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt177(int index,char[] value) {
			setTgt177(index,value, true);
	}
	
	/**
	 *	Update Tgt177 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt177(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt177(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_177_SIZE) {
             	index = TGT_177_SIZE -1; // can't exceed max array size
             	logger.trace("tgt177 - Array index exceeded max Size {}, resetting it to max allowed",TGT_177_SIZE); 
	    }
		if (setModified) {
			serializeTgt177(index,value);
		}
   }

	/**
	 *  Update Tgt177 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt177(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt177 + index*TGT_177_LEN)
			       ,TGT_177_LEN
			       );
		}
   }

	
	
	

		public static int getTgt177GrpFieldLength() {
			return TGT_177_GRP_LENGTH;
		}

}
  
