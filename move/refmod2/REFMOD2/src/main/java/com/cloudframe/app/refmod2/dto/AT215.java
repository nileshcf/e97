package com.cloudframe.app.refmod2.dto;

/**
*  The class AT215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT215 extends AT215Serialized {
   

						private char[] aTFld1215 = Field.fillLowValue(20);

						private char[] aTFld2215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT215
	**/
    public AT215() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld1215
	 *	@return aTFld1215
	 */
   public char[] getATFld1215() throws CFException{
     if (isATFld1215Modified()) { 
        aTFld1215 = refreshATFld1215();
     }
   		return aTFld1215;
   }

  
	/**
	*  set variable aTFld1215
	*  Corresponding COBOL Variable is WS-2-15A-T-FLD1
	*  @param value
	**/
   public void setATFld1215(char[] value) {
      aTFld1215 = checkATFld1215Constraints(value);
      serializeATFld1215(aTFld1215);
   } 

     /**
	 * 	Update ATFld1215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1215,aTFld1215.length);
   	
   }
   
   public void setATFld1215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1215,aTFld1215.length);
   	
   }
   
     /**
	 * 	Update ATFld1215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1215 with another Field
	 *	@param value
	 */
   public void setATFld1215(Field source) {
       replace(source,0,source.length(),beginATFld1215,A_TFLD_1215_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1215,A_TFLD_1215_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2215
	 *	@return aTFld2215
	 */
   public char[] getATFld2215() throws CFException{
     if (isATFld2215Modified()) { 
        aTFld2215 = refreshATFld2215();
     }
   		return aTFld2215;
   }

  
	/**
	*  set variable aTFld2215
	*  Corresponding COBOL Variable is WS-2-15A-T-FLD2
	*  @param value
	**/
   public void setATFld2215(char[] value) {
      aTFld2215 = checkATFld2215Constraints(value);
      serializeATFld2215(aTFld2215);
   } 

     /**
	 * 	Update ATFld2215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2215,aTFld2215.length);
   	
   }
   
   public void setATFld2215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2215,aTFld2215.length);
   	
   }
   
     /**
	 * 	Update ATFld2215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2215 with another Field
	 *	@param value
	 */
   public void setATFld2215(Field source) {
       replace(source,0,source.length(),beginATFld2215,A_TFLD_2215_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2215,A_TFLD_2215_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT215
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1215(CONSTANTS.SPACE_20);
         setATFld2215(CONSTANTS.SPACE_40);
   }

		public static int getAT215FieldLength() {
			return A_T_215_LENGTH;
		}

}
  
