package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WarningMsg609 extends WarningMsg609Serialized {
   


						private char[] warningResponse609 = new char[4];

	
	/**
	* Constructor for WarningMsg609
	**/
    public WarningMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0091-WARNING MSG: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setWarningResponse609(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
    }


 

	/**
	 *	Returns the value of warningResponse609
	 *	@return warningResponse609
	 */
   public char[] getWarningResponse609() throws CFException{
     if (isWarningResponse609Modified()) { 
        warningResponse609 = refreshWarningResponse609();
     }
   		return warningResponse609;
   }

  
	/**
	*  set variable warningResponse609
	*  Corresponding COBOL Variable is 609-WARNING-RESPONSE
	*  @param value
	**/
   public void setWarningResponse609(char[] value) {
      warningResponse609 = checkWarningResponse609Constraints(value);
      serializeWarningResponse609(warningResponse609);
   } 

     /**
	 * 	Update WarningResponse609 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWarningResponse609(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWarningResponse609,warningResponse609.length);
   	
   }
   
   public void setWarningResponse609(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse609,warningResponse609.length);
   	
   }
   
     /**
	 * 	Update WarningResponse609 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningResponse609(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse609+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WarningResponse609 with another Field
	 *	@param value
	 */
   public void setWarningResponse609(Field source) {
       replace(source,0,source.length(),beginWarningResponse609,WARNING_RESPONSE_609_LEN);
   	
   }  
   
     /**
	 * 	Update WarningResponse609 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWarningResponse609(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWarningResponse609,WARNING_RESPONSE_609_LEN);
   	
   }
   
     /**
	 * 	Update WarningResponse609 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningResponse609(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse609+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWarningMsg609FieldLength() {
			return WARNING_MSG_609_LENGTH;
		}

}
  
