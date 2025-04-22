package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningMsg604 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WarningMsg604 extends WarningMsg604Serialized {
   


						private char[] warningResponse604 = new char[4];

	
	/**
	* Constructor for WarningMsg604
	**/
    public WarningMsg604() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0040-WARNING MSG: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setWarningResponse604(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
    }


 

	/**
	 *	Returns the value of warningResponse604
	 *	@return warningResponse604
	 */
   public char[] getWarningResponse604() throws CFException{
     if (isWarningResponse604Modified()) { 
        warningResponse604 = refreshWarningResponse604();
     }
   		return warningResponse604;
   }

  
	/**
	*  set variable warningResponse604
	*  Corresponding COBOL Variable is 604-WARNING-RESPONSE
	*  @param value
	**/
   public void setWarningResponse604(char[] value) {
      warningResponse604 = checkWarningResponse604Constraints(value);
      serializeWarningResponse604(warningResponse604);
   } 

     /**
	 * 	Update WarningResponse604 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWarningResponse604(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWarningResponse604,warningResponse604.length);
   	
   }
   
   public void setWarningResponse604(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse604,warningResponse604.length);
   	
   }
   
     /**
	 * 	Update WarningResponse604 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningResponse604(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse604+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WarningResponse604 with another Field
	 *	@param value
	 */
   public void setWarningResponse604(Field source) {
       replace(source,0,source.length(),beginWarningResponse604,WARNING_RESPONSE_604_LEN);
   	
   }  
   
     /**
	 * 	Update WarningResponse604 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWarningResponse604(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWarningResponse604,WARNING_RESPONSE_604_LEN);
   	
   }
   
     /**
	 * 	Update WarningResponse604 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningResponse604(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningResponse604+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWarningMsg604FieldLength() {
			return WARNING_MSG_604_LENGTH;
		}

}
  
