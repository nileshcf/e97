package com.cloudframe.app.comput5.dto;

/**
*  The class WvAccounts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class WvAccounts extends WvAccountsSerialized { 
   

						private char[] wvAccountMnem = Field.fillLowValue(9);
			private List<WvWeightingType> wvWeightingType = new ArrayList<>();
    	
	
	/**
	* Constructor for WvAccounts
	**/
    public WvAccounts() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvAccounts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvAccounts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvAccountMnem
	 *	@return wvAccountMnem
	 */
   public char[] getWvAccountMnem() throws CFException{
     if (isWvAccountMnemModified()) { 
        wvAccountMnem = refreshWvAccountMnem();
     }
   		return wvAccountMnem;
   }

  
	/**
	*  set variable wvAccountMnem
	*  Corresponding COBOL Variable is WV-ACCOUNT-MNEM
	*  @param value
	**/
   public void setWvAccountMnem(char[] value) {
      wvAccountMnem = checkWvAccountMnemConstraints(value);
      serializeWvAccountMnem(wvAccountMnem);
   } 

     /**
	 * 	Update WvAccountMnem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvAccountMnem(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvAccountMnem,wvAccountMnem.length);
   	
   }
   
   public void setWvAccountMnem(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvAccountMnem,wvAccountMnem.length);
   	
   }
   
     /**
	 * 	Update WvAccountMnem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvAccountMnem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvAccountMnem+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvAccountMnem with another Field
	 *	@param value
	 */
   public void setWvAccountMnem(Field source) {
       replace(source,0,source.length(),beginWvAccountMnem,WV_ACCOUNT_MNEM_LEN);
   	
   }  
   
     /**
	 * 	Update WvAccountMnem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvAccountMnem(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvAccountMnem,WV_ACCOUNT_MNEM_LEN);
   	
   }
   
     /**
	 * 	Update WvAccountMnem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvAccountMnem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvAccountMnem+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of wvWeightingType
	 *  Corresponding COBOL Variable is WV-WEIGHTING-TYPE
	 *	@return wvWeightingType
	 */
   public List<WvWeightingType> getWvWeightingType() {
       return wvWeightingType;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wvWeightingType
	 */
	public WvWeightingType getWvWeightingType(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWvWeightingType(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WV_WEIGHTING_TYPE_SIZE) {
             	index = WV_WEIGHTING_TYPE_SIZE -1; // can't exceed max array size
             	logger.trace("wvWeightingType - Array index exceeded max Size {}, resetting it to max allowed",WV_WEIGHTING_TYPE_SIZE); 
	    }
		if (index >= wvWeightingType.size()) {
       		for (int fillIndex =  wvWeightingType.size() -1; fillIndex < index;fillIndex++) {
		       wvWeightingType.add(null);
		    }
			wvWeightingType.set(index,
			   	   	new WvWeightingType(this,beginWvWeightingType + index * WvWeightingType.getWvWeightingTypeFieldLength()) 
				                        ); 	
		} 
   	   WvWeightingType value = wvWeightingType.get(index);
   	   if (value == null) {
   	      wvWeightingType.set(index,
			   	   	new WvWeightingType(this,beginWvWeightingType + index * WvWeightingType.getWvWeightingTypeFieldLength()) 
				                        ); 
		  value = wvWeightingType.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WvWeightingType at index with the passed value
	 *  Corresponding COBOL Variable is WV-WEIGHTING-TYPE
	 *  @param index
	 *	@param value
	 */
  public void setWvWeightingType(int index,char[] value) {
   	getWvWeightingType(index).setString(value);
   }
   
	

	
	
	

		public static int getWvAccountsFieldLength() {
			return WV_ACCOUNTS_LENGTH;
		}

}
  
