package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSecTypeCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsdSecTypeCodes extends MsdSecTypeCodesSerialized { 
   

						private char[] msdSecTypePos2 = Field.fillLowValue(1);

						private char[] msdSecTypePos3 = Field.fillLowValue(1);

						private char[] msdSecTypePos4 = Field.fillLowValue(1);

						private char[] msdSecTypePos5 = Field.fillLowValue(1);

						private char[] msdSecTypePos6 = Field.fillLowValue(1);

						private char[] msdSecTypePos7 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdSecTypeCodes
	**/
    public MsdSecTypeCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSecTypeCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecTypeCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSecTypePos2
	 *	@return msdSecTypePos2
	 */
   public char[] getMsdSecTypePos2() throws CFException{
     if (isMsdSecTypePos2Modified()) { 
        msdSecTypePos2 = refreshMsdSecTypePos2();
     }
   		return msdSecTypePos2;
   }

  
	/**
	*  set variable msdSecTypePos2
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS2
	*  @param value
	**/
   public void setMsdSecTypePos2(char[] value) {
      msdSecTypePos2 = checkMsdSecTypePos2Constraints(value);
      serializeMsdSecTypePos2(msdSecTypePos2);
   } 

     /**
	 * 	Update MsdSecTypePos2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos2,msdSecTypePos2.length);
   	
   }
   
   public void setMsdSecTypePos2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos2,msdSecTypePos2.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos2 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos2(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos2,MSD_SEC_TYPE_POS_2_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos2,MSD_SEC_TYPE_POS_2_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecTypePos3
	 *	@return msdSecTypePos3
	 */
   public char[] getMsdSecTypePos3() throws CFException{
     if (isMsdSecTypePos3Modified()) { 
        msdSecTypePos3 = refreshMsdSecTypePos3();
     }
   		return msdSecTypePos3;
   }

  
	/**
	*  set variable msdSecTypePos3
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS3
	*  @param value
	**/
   public void setMsdSecTypePos3(char[] value) {
      msdSecTypePos3 = checkMsdSecTypePos3Constraints(value);
      serializeMsdSecTypePos3(msdSecTypePos3);
   } 

     /**
	 * 	Update MsdSecTypePos3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos3,msdSecTypePos3.length);
   	
   }
   
   public void setMsdSecTypePos3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos3,msdSecTypePos3.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos3 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos3(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos3,MSD_SEC_TYPE_POS_3_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos3,MSD_SEC_TYPE_POS_3_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecTypePos4
	 *	@return msdSecTypePos4
	 */
   public char[] getMsdSecTypePos4() throws CFException{
     if (isMsdSecTypePos4Modified()) { 
        msdSecTypePos4 = refreshMsdSecTypePos4();
     }
   		return msdSecTypePos4;
   }

  
	/**
	*  set variable msdSecTypePos4
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS4
	*  @param value
	**/
   public void setMsdSecTypePos4(char[] value) {
      msdSecTypePos4 = checkMsdSecTypePos4Constraints(value);
      serializeMsdSecTypePos4(msdSecTypePos4);
   } 

     /**
	 * 	Update MsdSecTypePos4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos4,msdSecTypePos4.length);
   	
   }
   
   public void setMsdSecTypePos4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos4,msdSecTypePos4.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos4 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos4(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos4,MSD_SEC_TYPE_POS_4_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos4,MSD_SEC_TYPE_POS_4_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecTypePos5
	 *	@return msdSecTypePos5
	 */
   public char[] getMsdSecTypePos5() throws CFException{
     if (isMsdSecTypePos5Modified()) { 
        msdSecTypePos5 = refreshMsdSecTypePos5();
     }
   		return msdSecTypePos5;
   }

  
	/**
	*  set variable msdSecTypePos5
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS5
	*  @param value
	**/
   public void setMsdSecTypePos5(char[] value) {
      msdSecTypePos5 = checkMsdSecTypePos5Constraints(value);
      serializeMsdSecTypePos5(msdSecTypePos5);
   } 

     /**
	 * 	Update MsdSecTypePos5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos5,msdSecTypePos5.length);
   	
   }
   
   public void setMsdSecTypePos5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos5,msdSecTypePos5.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos5 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos5(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos5,MSD_SEC_TYPE_POS_5_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos5,MSD_SEC_TYPE_POS_5_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecTypePos6
	 *	@return msdSecTypePos6
	 */
   public char[] getMsdSecTypePos6() throws CFException{
     if (isMsdSecTypePos6Modified()) { 
        msdSecTypePos6 = refreshMsdSecTypePos6();
     }
   		return msdSecTypePos6;
   }

  
	/**
	*  set variable msdSecTypePos6
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS6
	*  @param value
	**/
   public void setMsdSecTypePos6(char[] value) {
      msdSecTypePos6 = checkMsdSecTypePos6Constraints(value);
      serializeMsdSecTypePos6(msdSecTypePos6);
   } 

     /**
	 * 	Update MsdSecTypePos6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos6,msdSecTypePos6.length);
   	
   }
   
   public void setMsdSecTypePos6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos6,msdSecTypePos6.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos6 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos6(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos6,MSD_SEC_TYPE_POS_6_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos6,MSD_SEC_TYPE_POS_6_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecTypePos7
	 *	@return msdSecTypePos7
	 */
   public char[] getMsdSecTypePos7() throws CFException{
     if (isMsdSecTypePos7Modified()) { 
        msdSecTypePos7 = refreshMsdSecTypePos7();
     }
   		return msdSecTypePos7;
   }

  
	/**
	*  set variable msdSecTypePos7
	*  Corresponding COBOL Variable is MSD-SEC-TYPE-POS7
	*  @param value
	**/
   public void setMsdSecTypePos7(char[] value) {
      msdSecTypePos7 = checkMsdSecTypePos7Constraints(value);
      serializeMsdSecTypePos7(msdSecTypePos7);
   } 

     /**
	 * 	Update MsdSecTypePos7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypePos7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecTypePos7,msdSecTypePos7.length);
   	
   }
   
   public void setMsdSecTypePos7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos7,msdSecTypePos7.length);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecTypePos7 with another Field
	 *	@param value
	 */
   public void setMsdSecTypePos7(Field source) {
       replace(source,0,source.length(),beginMsdSecTypePos7,MSD_SEC_TYPE_POS_7_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecTypePos7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecTypePos7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecTypePos7,MSD_SEC_TYPE_POS_7_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecTypePos7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypePos7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecTypePos7+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MsdSecTypeCodes
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdSecTypePos2(CONSTANTS.SPACE);
         setMsdSecTypePos3(CONSTANTS.SPACE);
         setMsdSecTypePos4(CONSTANTS.SPACE);
         setMsdSecTypePos5(CONSTANTS.SPACE);
         setMsdSecTypePos6(CONSTANTS.SPACE);
         setMsdSecTypePos7(CONSTANTS.SPACE);
   }

		public static int getMsdSecTypeCodesFieldLength() {
			return MSD_SEC_TYPE_CODES_LENGTH;
		}

}
  
