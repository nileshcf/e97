package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTableGroup580 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WarningTableGroup580 extends WarningTableGroup580Serialized {
   

						private char[] warningTable580 = new char[648];
					private WarningTable580Redefined warningTable580Redefined = new WarningTable580Redefined();
	
	/**
	* Constructor for WarningTableGroup580
	**/
    public WarningTableGroup580() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			warningTable580Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWarningTable580("0001TRANSFER STATUS FTSS ROW BULK FILE NAME REPETITION0020NO ELIGIBLE ENDPOINTS FOUND FOR BULK BROADCAST    0021SOME ENDPOINT(S) WILL NOT RECEIVE BULK BROADCAST  0022SOME ENDPOINT(S) DUPLICATED WITHIN BULK BROADCAST 0023BULK BROADCAST FOUND NO ENDPOINT FOR BULK ID/TYPE 0040NO ELIGIBLE ENDPOINTS FOUND FOR LIST BROADCAST    0041SOME ENDPOINT(S) COULD NOT RECEIVE LIST BROADCAST 0042SOME ENDPOINT(S) DUPLICATED WITHIN LIST BROADCAST 0043LIST BROADCAST ENDPOINT FILE CONTAINS NO DATA     0050NO ELIGIBLE INBOUND FILE FOUND READY TO RETRIEVE  0070SPECIFIED FILE DOES NOT NEED TO BE RESET          ....*** UNDOCUMENTED WARNING -- NOTIFY GFT SYSTEMS ***".toCharArray());
    }


 

	/**
	 *	Returns the value of warningTable580
	 *	@return warningTable580
	 */
   public char[] getWarningTable580() throws CFException{
     if (isWarningTable580Modified()) { 
        warningTable580 = refreshWarningTable580();
     }
   		return warningTable580;
   }

  
	/**
	*  set variable warningTable580
	*  Corresponding COBOL Variable is 580-WARNING-TABLE
	*  @param value
	**/
   public void setWarningTable580(char[] value) {
      warningTable580 = checkWarningTable580Constraints(value);
      serializeWarningTable580(warningTable580);
   } 

     /**
	 * 	Update WarningTable580 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWarningTable580(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWarningTable580,warningTable580.length);
   	
   }
   
   public void setWarningTable580(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWarningTable580,warningTable580.length);
   	
   }
   
     /**
	 * 	Update WarningTable580 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningTable580(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningTable580+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WarningTable580 with another Field
	 *	@param value
	 */
   public void setWarningTable580(Field source) {
       replace(source,0,source.length(),beginWarningTable580,WARNING_TABLE_580_LEN);
   	
   }  
   
     /**
	 * 	Update WarningTable580 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWarningTable580(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWarningTable580,WARNING_TABLE_580_LEN);
   	
   }
   
     /**
	 * 	Update WarningTable580 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningTable580(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningTable580+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of warningTable580Redefined
	 *	@return warningTable580Redefined
	 */   
	 public WarningTable580Redefined getWarningTable580Redefined() {
   	return warningTable580Redefined;
   }
   /**
	* 	Update WarningTable580Redefined with the passed value
	*   Corresponding COBOL Variable is 580-WARNING-TABLE-REDEFINED
	*	@param value
	*/
   public void setWarningTable580Redefined(char[] value) {
      warningTable580Redefined.setString(value); 
   }   
    
     /**
	 * 	Update WarningTable580Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWarningTable580Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,warningTable580Redefined.begin,warningTable580Redefined.length());
   }
   
     /**
	 * 	Update WarningTable580Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningTable580Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,warningTable580Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WarningTable580Redefined with another Field
	 *	@param value
	 */
   public void setWarningTable580Redefined(Field source) {
   	replace(source,0,source.length(),warningTable580Redefined.begin,warningTable580Redefined.length());
   }  
   
     /**
	 * 	Update WarningTable580Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWarningTable580Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,warningTable580Redefined.begin,warningTable580Redefined.length());
   }
   
     /**
	 * 	Update WarningTable580Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningTable580Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,warningTable580Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWarningTableGroup580FieldLength() {
			return WARNING_TABLE_GROUP_580_LENGTH;
		}

}
  
