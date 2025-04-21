package com.cloudframe.app.refmod3.dto;

/**
*  The class AT26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT26 extends AT26Serialized {
   

						private char[] aTFld126 = Field.fillLowValue(20);

						private char[] aTFld226 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT26
	**/
    public AT26() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld126
	 *	@return aTFld126
	 */
   public char[] getATFld126() throws CFException{
     if (isATFld126Modified()) { 
        aTFld126 = refreshATFld126();
     }
   		return aTFld126;
   }

  
	/**
	*  set variable aTFld126
	*  Corresponding COBOL Variable is WS-2-6A-T-FLD1
	*  @param value
	**/
   public void setATFld126(char[] value) {
      aTFld126 = checkATFld126Constraints(value);
      serializeATFld126(aTFld126);
   } 

     /**
	 * 	Update ATFld126 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld126(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld126,aTFld126.length);
   	
   }
   
   public void setATFld126(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld126,aTFld126.length);
   	
   }
   
     /**
	 * 	Update ATFld126 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld126(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld126+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld126 with another Field
	 *	@param value
	 */
   public void setATFld126(Field source) {
       replace(source,0,source.length(),beginATFld126,A_TFLD_126_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld126 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld126(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld126,A_TFLD_126_LEN);
   	
   }
   
     /**
	 * 	Update ATFld126 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld126(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld126+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld226
	 *	@return aTFld226
	 */
   public char[] getATFld226() throws CFException{
     if (isATFld226Modified()) { 
        aTFld226 = refreshATFld226();
     }
   		return aTFld226;
   }

  
	/**
	*  set variable aTFld226
	*  Corresponding COBOL Variable is WS-2-6A-T-FLD2
	*  @param value
	**/
   public void setATFld226(char[] value) {
      aTFld226 = checkATFld226Constraints(value);
      serializeATFld226(aTFld226);
   } 

     /**
	 * 	Update ATFld226 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld226(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld226,aTFld226.length);
   	
   }
   
   public void setATFld226(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld226,aTFld226.length);
   	
   }
   
     /**
	 * 	Update ATFld226 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld226(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld226+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld226 with another Field
	 *	@param value
	 */
   public void setATFld226(Field source) {
       replace(source,0,source.length(),beginATFld226,A_TFLD_226_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld226 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld226(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld226,A_TFLD_226_LEN);
   	
   }
   
     /**
	 * 	Update ATFld226 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld226(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld226+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT26
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld126(CONSTANTS.SPACE_20);
         setATFld226(CONSTANTS.SPACE_40);
   }

		public static int getAT26FieldLength() {
			return A_T_26_LENGTH;
		}

}
  
