package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt161Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Tgt161Grp extends Tgt161GrpSerialized {
   
      private List<Long> tgt161; 

	
	/**
	* Constructor for Tgt161Grp
	**/
    public Tgt161Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tgt161
	 *  Corresponding COBOL Variable is WS-TGT-161
	 *	@return tgt161
	 */
	public List<Long> getTgt161() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < TGT_161_SIZE;index++) {
        	list.add( getTgt161( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return tgt161
	 */
	public long getTgt161(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTgt161(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TGT_161_SIZE) {
             	index = TGT_161_SIZE -1; // can't exceed max array size
             	logger.trace("tgt161 - Array index exceeded max Size {}, resetting it to max allowed",TGT_161_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginTgt161+ index*TGT_161_LEN 
			                ,TGT_161_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean tgt161IsNumeric(int index) {
	    return isNumeric(0 + index*10 
	                    ,0 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of tgt161
     *  @param index	 
	 *  @return tgt161
	 */
	public char[] getTgt161String(int index) {
	    return toCharArray( (beginTgt161 + index*TGT_161_LEN) , TGT_161_LEN );
	}
	/**
	 *	Update Tgt161 at index with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-161
	 *  @param index
	 *	@param number
	 */
	public void setTgt161(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setTgt161(index,number, true);
	}
	

	/**
	 *  Update Tgt161 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setTgt161(int index,char[] value) {
			setTgt161(index,value, true);
	}
	
	/**
	 *	Update Tgt161 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt161(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTgt161(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= TGT_161_SIZE) {
             	index = TGT_161_SIZE -1; // can't exceed max array size
             	logger.trace("tgt161 - Array index exceeded max Size {}, resetting it to max allowed",TGT_161_SIZE); 
	    }
		if (setModified) {
			serializeTgt161(index,value);
		}
   }

	/**
	 *  Update Tgt161 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setTgt161(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginTgt161 + index*TGT_161_LEN)
			       ,TGT_161_LEN
			       );
		}
   }

	
	
	

		public static int getTgt161GrpFieldLength() {
			return TGT_161_GRP_LENGTH;
		}

}
  
