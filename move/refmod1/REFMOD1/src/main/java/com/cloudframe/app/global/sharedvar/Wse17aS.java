package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Wse17aS extends Wse17aSSerialized { 
   

						private char[] wse17aSFld1 = Field.fillLowValue(30);

						private char[] wse17aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse17aS
	**/
    public Wse17aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse17aSFld1
	 *	@return wse17aSFld1
	 */
   public char[] getWse17aSFld1() throws CFException{
     if (isWse17aSFld1Modified()) { 
        wse17aSFld1 = refreshWse17aSFld1();
     }
   		return wse17aSFld1;
   }

  
	/**
	*  set variable wse17aSFld1
	*  Corresponding COBOL Variable is WSE-17A-S-FLD1
	*  @param value
	**/
   public void setWse17aSFld1(char[] value) {
      wse17aSFld1 = checkWse17aSFld1Constraints(value);
      serializeWse17aSFld1(wse17aSFld1);
   } 

     /**
	 * 	Update Wse17aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17aSFld1,wse17aSFld1.length);
   	
   }
   
   public void setWse17aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld1,wse17aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse17aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17aSFld1 with another Field
	 *	@param value
	 */
   public void setWse17aSFld1(Field source) {
       replace(source,0,source.length(),beginWse17aSFld1,WSE_17A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17aSFld1,WSE_17A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse17aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17aSFld2
	 *	@return wse17aSFld2
	 */
   public char[] getWse17aSFld2() throws CFException{
     if (isWse17aSFld2Modified()) { 
        wse17aSFld2 = refreshWse17aSFld2();
     }
   		return wse17aSFld2;
   }

  
	/**
	*  set variable wse17aSFld2
	*  Corresponding COBOL Variable is WSE-17A-S-FLD2
	*  @param value
	**/
   public void setWse17aSFld2(char[] value) {
      wse17aSFld2 = checkWse17aSFld2Constraints(value);
      serializeWse17aSFld2(wse17aSFld2);
   } 

     /**
	 * 	Update Wse17aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17aSFld2,wse17aSFld2.length);
   	
   }
   
   public void setWse17aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld2,wse17aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse17aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17aSFld2 with another Field
	 *	@param value
	 */
   public void setWse17aSFld2(Field source) {
       replace(source,0,source.length(),beginWse17aSFld2,WSE_17A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17aSFld2,WSE_17A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse17aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse17aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse17aSFld1(CONSTANTS.SPACE_30);
         setWse17aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse17aSFieldLength() {
			return WSE_17A_S_LENGTH;
		}

}
  
