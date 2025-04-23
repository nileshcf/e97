package com.cloudframe.app.gp004760.dto;

/**
*  The class CabTccArray800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class CabTccArray800 extends CabTccArray800Serialized {
   
      private List<char[]> authTxnCatCd800; 

	
	/**
	* Constructor for CabTccArray800
	**/
    public CabTccArray800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of authTxnCatCd800
	 *  Corresponding COBOL Variable is 800-AUTH-TXN-CAT-CD
	 *	@return authTxnCatCd800
	 */
	public List<char[]> getAuthTxnCatCd800() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < AUTH_TXN_CAT_CD_800_SIZE;index++) {
        	list.add( getAuthTxnCatCd800( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return authTxnCatCd800
	 */
	public char[] getAuthTxnCatCd800(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getAuthTxnCatCd800(), resetting it to 0",index);
		    index = 0;
        } else if (index >= AUTH_TXN_CAT_CD_800_SIZE) {
             	index = AUTH_TXN_CAT_CD_800_SIZE -1; // can't exceed max array size
             	logger.trace("authTxnCatCd800 - Array index exceeded max Size {}, resetting it to max allowed",AUTH_TXN_CAT_CD_800_SIZE); 
	    }
   	      return getCharArray( (beginAuthTxnCatCd800 + index*AUTH_TXN_CAT_CD_800_LEN) , AUTH_TXN_CAT_CD_800_LEN );
    }
    
    
   public int  authTxnCatCd800FieldLength() {
   	return AUTH_TXN_CAT_CD_800_LEN;
   }
   
	

  
  	/**
	 *	Update AuthTxnCatCd800 with the passed value at a given index
	 *  Corresponding COBOL Variable is 800-AUTH-TXN-CAT-CD
	 *  @param index
	 *	@param value
	 */
  public void setAuthTxnCatCd800(int index,char[] value) {
   	setAuthTxnCatCd800(index,value,true);
   }
   
   
   /**
	 *	Update AuthTxnCatCd800 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setAuthTxnCatCd800(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAuthTxnCatCd800(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeAuthTxnCatCd800(index,value);		
       }
   }
   

	
	
	

		public static int getCabTccArray800FieldLength() {
			return CAB_TCC_ARRAY_800_LENGTH;
		}

}
  
