package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt153Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt153Grp extends Tgt153GrpSerialized {
   
      private List<Long> tgt153; 

	
	/**
	* Constructor for Tgt153Grp
	**/
    public Tgt153Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt153
	 *  Corresponding COBOL Variable is WS-TGT-153
	 *	@return tgt153
	 */
	public List<Long> getTgt153() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_153_SIZE;index++) {
        	list.add( getTgt153( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt153
	 */
	public long getTgt153(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt153(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_153_SIZE) {
             	index = TGT_153_SIZE -1; // can't exceed max array size
             	logger.trace("tgt153 - Array index exceeded max Size {}, resetting it to max allowed",TGT_153_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt153+ index*TGT_153_LEN 
			                ,TGT_153_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt153IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt153
     *  @param index	 
	 *  @return tgt153
	 */
	public char[] getTgt153String(int index) {
	    return toCharArray( (beginTgt153 + index*TGT_153_LEN) , TGT_153_LEN );
	}
	/**
	 *	Update Tgt153 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-153
	 *  @param index
	 *	@param number
	 */
	public void setTgt153(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt153(index,number, true);
	}
	

	/**
	 *  Update Tgt153 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt153(int index,char[] value) {
			setTgt153(index,value, true);
	}
	
	/**
	 *	Update Tgt153 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt153(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt153(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_153_SIZE) {
             	index = TGT_153_SIZE -1; // can't exceed max array size
             	logger.trace("tgt153 - Array index exceeded max Size {}, resetting it to max allowed",TGT_153_SIZE); 
	    }
		if (setModified) {
			serializeTgt153(index,value);
		}
   }

	/**
	 *  Update Tgt153 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt153(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt153 + index*TGT_153_LEN)
			       ,TGT_153_LEN
			       );
		}
   }

	
	
	

		public static int getTgt153GrpFieldLength() {
			return TGT_153_GRP_LENGTH;
		}

}
  
