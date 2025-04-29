package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt169Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt169Grp extends Tgt169GrpSerialized {
   
      private List<Long> tgt169; 

	
	/**
	* Constructor for Tgt169Grp
	**/
    public Tgt169Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt169
	 *  Corresponding COBOL Variable is WS-TGT-169
	 *	@return tgt169
	 */
	public List<Long> getTgt169() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_169_SIZE;index++) {
        	list.add( getTgt169( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt169
	 */
	public long getTgt169(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt169(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_169_SIZE) {
             	index = TGT_169_SIZE -1; // can't exceed max array size
             	logger.trace("tgt169 - Array index exceeded max Size {}, resetting it to max allowed",TGT_169_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt169+ index*TGT_169_LEN 
			                ,TGT_169_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt169IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt169
     *  @param index	 
	 *  @return tgt169
	 */
	public char[] getTgt169String(int index) {
	    return toCharArray( (beginTgt169 + index*TGT_169_LEN) , TGT_169_LEN );
	}
	/**
	 *	Update Tgt169 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-169
	 *  @param index
	 *	@param number
	 */
	public void setTgt169(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt169(index,number, true);
	}
	

	/**
	 *  Update Tgt169 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt169(int index,char[] value) {
			setTgt169(index,value, true);
	}
	
	/**
	 *	Update Tgt169 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt169(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt169(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_169_SIZE) {
             	index = TGT_169_SIZE -1; // can't exceed max array size
             	logger.trace("tgt169 - Array index exceeded max Size {}, resetting it to max allowed",TGT_169_SIZE); 
	    }
		if (setModified) {
			serializeTgt169(index,value);
		}
   }

	/**
	 *  Update Tgt169 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt169(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt169 + index*TGT_169_LEN)
			       ,TGT_169_LEN
			       );
		}
   }

	
	
	

		public static int getTgt169GrpFieldLength() {
			return TGT_169_GRP_LENGTH;
		}

}
  
