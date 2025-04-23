package com.cloudframe.app.ar640010.dto;

/**
*  The class FailedDescMsg699 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FailedDescMsg699 extends FailedDescMsg699Serialized {
   


						private char[] failedResponse699 = new char[4];

	
	/**
	* Constructor for FailedDescMsg699
	**/
    public FailedDescMsg699() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("9999-FAILED DESC: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setFailedResponse699(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
    }


 

	/**
	 *	Returns the value of failedResponse699
	 *	@return failedResponse699
	 */
   public char[] getFailedResponse699() throws CFException{
     if (isFailedResponse699Modified()) { 
        failedResponse699 = refreshFailedResponse699();
     }
   		return failedResponse699;
   }

  
	/**
	*  set variable failedResponse699
	*  Corresponding COBOL Variable is 699-FAILED-RESPONSE
	*  @param value
	**/
   public void setFailedResponse699(char[] value) {
      failedResponse699 = checkFailedResponse699Constraints(value);
      serializeFailedResponse699(failedResponse699);
   } 

     /**
	 * 	Update FailedResponse699 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailedResponse699(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFailedResponse699,failedResponse699.length);
   	
   }
   
   public void setFailedResponse699(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFailedResponse699,failedResponse699.length);
   	
   }
   
     /**
	 * 	Update FailedResponse699 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailedResponse699(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailedResponse699+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FailedResponse699 with another Field
	 *	@param value
	 */
   public void setFailedResponse699(Field source) {
       replace(source,0,source.length(),beginFailedResponse699,FAILED_RESPONSE_699_LEN);
   	
   }  
   
     /**
	 * 	Update FailedResponse699 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailedResponse699(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFailedResponse699,FAILED_RESPONSE_699_LEN);
   	
   }
   
     /**
	 * 	Update FailedResponse699 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailedResponse699(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailedResponse699+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFailedDescMsg699FieldLength() {
			return FAILED_DESC_MSG_699_LENGTH;
		}

}
  
