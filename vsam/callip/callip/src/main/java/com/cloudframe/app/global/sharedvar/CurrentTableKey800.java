package com.cloudframe.app.global.sharedvar;

/**
*  The class CurrentTableKey800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_currentTableKey800")

public class CurrentTableKey800 extends CurrentTableKey800Serialized  implements InitializingBean {
   

						private char[] currentTableId800 = Field.fillLowValue(8);

						private char[] currentEffectiveDate800 = Field.fillLowValue(10);
	
	/**
	* Constructor for CurrentTableKey800
	**/
    public CurrentTableKey800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of currentTableId800
	 *	@return currentTableId800
	 */
   public char[] getCurrentTableId800() throws CFException{
     if (isCurrentTableId800Modified()) { 
        currentTableId800 = refreshCurrentTableId800();
     }
   		return currentTableId800;
   }

  
	/**
	*  set variable currentTableId800
	*  Corresponding COBOL Variable is 800-CURRENT-TABLE-ID
	*  @param value
	**/
   public void setCurrentTableId800(char[] value) {
      currentTableId800 = checkCurrentTableId800Constraints(value);
      serializeCurrentTableId800(currentTableId800);
   } 

     /**
	 * 	Update CurrentTableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentTableId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentTableId800,currentTableId800.length);
   	
   }
   
   public void setCurrentTableId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTableId800,currentTableId800.length);
   	
   }
   
     /**
	 * 	Update CurrentTableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTableId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentTableId800 with another Field
	 *	@param value
	 */
   public void setCurrentTableId800(Field source) {
       replace(source,0,source.length(),beginCurrentTableId800,CURRENT_TABLE_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentTableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentTableId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentTableId800,CURRENT_TABLE_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrentTableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTableId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentEffectiveDate800
	 *	@return currentEffectiveDate800
	 */
   public char[] getCurrentEffectiveDate800() throws CFException{
     if (isCurrentEffectiveDate800Modified()) { 
        currentEffectiveDate800 = refreshCurrentEffectiveDate800();
     }
   		return currentEffectiveDate800;
   }

  
	/**
	*  set variable currentEffectiveDate800
	*  Corresponding COBOL Variable is 800-CURRENT-EFFECTIVE-DATE
	*  @param value
	**/
   public void setCurrentEffectiveDate800(char[] value) {
      currentEffectiveDate800 = checkCurrentEffectiveDate800Constraints(value);
      serializeCurrentEffectiveDate800(currentEffectiveDate800);
   } 

     /**
	 * 	Update CurrentEffectiveDate800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentEffectiveDate800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentEffectiveDate800,currentEffectiveDate800.length);
   	
   }
   
   public void setCurrentEffectiveDate800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentEffectiveDate800,currentEffectiveDate800.length);
   	
   }
   
     /**
	 * 	Update CurrentEffectiveDate800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentEffectiveDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentEffectiveDate800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentEffectiveDate800 with another Field
	 *	@param value
	 */
   public void setCurrentEffectiveDate800(Field source) {
       replace(source,0,source.length(),beginCurrentEffectiveDate800,CURRENT_EFFECTIVE_DATE_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentEffectiveDate800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentEffectiveDate800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentEffectiveDate800,CURRENT_EFFECTIVE_DATE_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrentEffectiveDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentEffectiveDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentEffectiveDate800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes CurrentTableKey800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCurrentTableId800(CONSTANTS.SPACE_8);
         setCurrentEffectiveDate800(CONSTANTS.SPACE_10);
   }

		public static int getCurrentTableKey800FieldLength() {
			return CURRENT_TABLE_KEY_800_LENGTH;
		}

}
  
