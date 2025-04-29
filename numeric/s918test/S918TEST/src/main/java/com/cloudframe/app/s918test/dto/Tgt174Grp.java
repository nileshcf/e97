package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt174Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt174Grp extends Tgt174GrpSerialized {
   
      private List<Long> tgt174; 

	
	/**
	* Constructor for Tgt174Grp
	**/
    public Tgt174Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt174
	 *  Corresponding COBOL Variable is WS-TGT-174
	 *	@return tgt174
	 */
	public List<Long> getTgt174() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_174_SIZE;index++) {
        	list.add( getTgt174( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt174
	 */
	public long getTgt174(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt174(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_174_SIZE) {
             	index = TGT_174_SIZE -1; // can't exceed max array size
             	logger.trace("tgt174 - Array index exceeded max Size {}, resetting it to max allowed",TGT_174_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt174+ index*TGT_174_LEN 
			                ,TGT_174_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt174IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt174
     *  @param index	 
	 *  @return tgt174
	 */
	public char[] getTgt174String(int index) {
	    return toCharArray( (beginTgt174 + index*TGT_174_LEN) , TGT_174_LEN );
	}
	/**
	 *	Update Tgt174 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-174
	 *  @param index
	 *	@param number
	 */
	public void setTgt174(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt174(index,number, true);
	}
	

	/**
	 *  Update Tgt174 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt174(int index,char[] value) {
			setTgt174(index,value, true);
	}
	
	/**
	 *	Update Tgt174 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt174(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt174(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_174_SIZE) {
             	index = TGT_174_SIZE -1; // can't exceed max array size
             	logger.trace("tgt174 - Array index exceeded max Size {}, resetting it to max allowed",TGT_174_SIZE); 
	    }
		if (setModified) {
			serializeTgt174(index,value);
		}
   }

	/**
	 *  Update Tgt174 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt174(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt174 + index*TGT_174_LEN)
			       ,TGT_174_LEN
			       );
		}
   }

	
	
	

		public static int getTgt174GrpFieldLength() {
			return TGT_174_GRP_LENGTH;
		}

}
  
