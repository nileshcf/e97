package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Wse7aS extends Wse7aSSerialized { 
   

						private char[] wse7aSFld1 = Field.fillLowValue(30);

						private char[] wse7aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse7aS
	**/
    public Wse7aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse7aSFld1
	 *	@return wse7aSFld1
	 */
   public char[] getWse7aSFld1() throws CFException{
     if (isWse7aSFld1Modified()) { 
        wse7aSFld1 = refreshWse7aSFld1();
     }
   		return wse7aSFld1;
   }

  
	/**
	*  set variable wse7aSFld1
	*  Corresponding COBOL Variable is WSE-7A-S-FLD1
	*  @param value
	**/
   public void setWse7aSFld1(char[] value) {
      wse7aSFld1 = checkWse7aSFld1Constraints(value);
      serializeWse7aSFld1(wse7aSFld1);
   } 

     /**
	 * 	Update Wse7aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7aSFld1,wse7aSFld1.length);
   	
   }
   
   public void setWse7aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld1,wse7aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse7aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7aSFld1 with another Field
	 *	@param value
	 */
   public void setWse7aSFld1(Field source) {
       replace(source,0,source.length(),beginWse7aSFld1,WSE_7A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7aSFld1,WSE_7A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse7aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7aSFld2
	 *	@return wse7aSFld2
	 */
   public char[] getWse7aSFld2() throws CFException{
     if (isWse7aSFld2Modified()) { 
        wse7aSFld2 = refreshWse7aSFld2();
     }
   		return wse7aSFld2;
   }

  
	/**
	*  set variable wse7aSFld2
	*  Corresponding COBOL Variable is WSE-7A-S-FLD2
	*  @param value
	**/
   public void setWse7aSFld2(char[] value) {
      wse7aSFld2 = checkWse7aSFld2Constraints(value);
      serializeWse7aSFld2(wse7aSFld2);
   } 

     /**
	 * 	Update Wse7aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7aSFld2,wse7aSFld2.length);
   	
   }
   
   public void setWse7aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld2,wse7aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse7aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7aSFld2 with another Field
	 *	@param value
	 */
   public void setWse7aSFld2(Field source) {
       replace(source,0,source.length(),beginWse7aSFld2,WSE_7A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7aSFld2,WSE_7A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse7aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse7aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse7aSFld1(CONSTANTS.SPACE_30);
         setWse7aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse7aSFieldLength() {
			return WSE_7A_S_LENGTH;
		}

}
  
