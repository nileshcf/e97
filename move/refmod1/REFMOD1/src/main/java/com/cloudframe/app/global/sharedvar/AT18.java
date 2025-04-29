package com.cloudframe.app.global.sharedvar;

/**
*  The class AT18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT18 extends AT18Serialized { 
   

						private char[] aTFld118 = Field.fillLowValue(20);

						private char[] aTFld218 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT18
	**/
    public AT18() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld118
	 *	@return aTFld118
	 */
   public char[] getATFld118() throws CFException{
     if (isATFld118Modified()) { 
        aTFld118 = refreshATFld118();
     }
   		return aTFld118;
   }

  
	/**
	*  set variable aTFld118
	*  Corresponding COBOL Variable is WS-18A-T-FLD1
	*  @param value
	**/
   public void setATFld118(char[] value) {
      aTFld118 = checkATFld118Constraints(value);
      serializeATFld118(aTFld118);
   } 

     /**
	 * 	Update ATFld118 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld118(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld118,aTFld118.length);
   	
   }
   
   public void setATFld118(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld118,aTFld118.length);
   	
   }
   
     /**
	 * 	Update ATFld118 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld118(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld118+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld118 with another Field
	 *	@param value
	 */
   public void setATFld118(Field source) {
       replace(source,0,source.length(),beginATFld118,A_TFLD_118_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld118 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld118(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld118,A_TFLD_118_LEN);
   	
   }
   
     /**
	 * 	Update ATFld118 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld118(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld118+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld218
	 *	@return aTFld218
	 */
   public char[] getATFld218() throws CFException{
     if (isATFld218Modified()) { 
        aTFld218 = refreshATFld218();
     }
   		return aTFld218;
   }

  
	/**
	*  set variable aTFld218
	*  Corresponding COBOL Variable is WS-18A-T-FLD2
	*  @param value
	**/
   public void setATFld218(char[] value) {
      aTFld218 = checkATFld218Constraints(value);
      serializeATFld218(aTFld218);
   } 

     /**
	 * 	Update ATFld218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld218,aTFld218.length);
   	
   }
   
   public void setATFld218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld218,aTFld218.length);
   	
   }
   
     /**
	 * 	Update ATFld218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld218 with another Field
	 *	@param value
	 */
   public void setATFld218(Field source) {
       replace(source,0,source.length(),beginATFld218,A_TFLD_218_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld218,A_TFLD_218_LEN);
   	
   }
   
     /**
	 * 	Update ATFld218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld218+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld118(CONSTANTS.SPACE_20);
         setATFld218(CONSTANTS.SPACE_40);
   }

		public static int getAT18FieldLength() {
			return A_T_18_LENGTH;
		}

}
  
