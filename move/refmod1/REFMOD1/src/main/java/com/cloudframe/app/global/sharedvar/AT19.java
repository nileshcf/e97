package com.cloudframe.app.global.sharedvar;

/**
*  The class AT19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT19 extends AT19Serialized { 
   

						private char[] aTFld119 = Field.fillLowValue(20);

						private char[] aTFld219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT19
	**/
    public AT19() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld119
	 *	@return aTFld119
	 */
   public char[] getATFld119() throws CFException{
     if (isATFld119Modified()) { 
        aTFld119 = refreshATFld119();
     }
   		return aTFld119;
   }

  
	/**
	*  set variable aTFld119
	*  Corresponding COBOL Variable is WS-19A-T-FLD1
	*  @param value
	**/
   public void setATFld119(char[] value) {
      aTFld119 = checkATFld119Constraints(value);
      serializeATFld119(aTFld119);
   } 

     /**
	 * 	Update ATFld119 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld119(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld119,aTFld119.length);
   	
   }
   
   public void setATFld119(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld119,aTFld119.length);
   	
   }
   
     /**
	 * 	Update ATFld119 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld119(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld119+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld119 with another Field
	 *	@param value
	 */
   public void setATFld119(Field source) {
       replace(source,0,source.length(),beginATFld119,A_TFLD_119_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld119 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld119(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld119,A_TFLD_119_LEN);
   	
   }
   
     /**
	 * 	Update ATFld119 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld119(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld119+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld219
	 *	@return aTFld219
	 */
   public char[] getATFld219() throws CFException{
     if (isATFld219Modified()) { 
        aTFld219 = refreshATFld219();
     }
   		return aTFld219;
   }

  
	/**
	*  set variable aTFld219
	*  Corresponding COBOL Variable is WS-19A-T-FLD2
	*  @param value
	**/
   public void setATFld219(char[] value) {
      aTFld219 = checkATFld219Constraints(value);
      serializeATFld219(aTFld219);
   } 

     /**
	 * 	Update ATFld219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld219,aTFld219.length);
   	
   }
   
   public void setATFld219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld219,aTFld219.length);
   	
   }
   
     /**
	 * 	Update ATFld219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld219 with another Field
	 *	@param value
	 */
   public void setATFld219(Field source) {
       replace(source,0,source.length(),beginATFld219,A_TFLD_219_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld219,A_TFLD_219_LEN);
   	
   }
   
     /**
	 * 	Update ATFld219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld119(CONSTANTS.SPACE_20);
         setATFld219(CONSTANTS.SPACE_40);
   }

		public static int getAT19FieldLength() {
			return A_T_19_LENGTH;
		}

}
  
