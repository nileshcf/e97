package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01DivQualifyData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01DivQualifyData extends Bdms01DivQualifyDataSerialized { 
   

						private char[] msdDividendQualify = Field.fillLowValue(1);

						private char[] msdDividendQualifyOverride = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01DivQualifyData
	**/
    public Bdms01DivQualifyData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01DivQualifyData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DivQualifyData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdDividendQualify
	 *	@return msdDividendQualify
	 */
   public char[] getMsdDividendQualify() throws CFException{
     if (isMsdDividendQualifyModified()) { 
        msdDividendQualify = refreshMsdDividendQualify();
     }
   		return msdDividendQualify;
   }

  
	/**
	*  set variable msdDividendQualify
	*  Corresponding COBOL Variable is MSD-DIVIDEND-QUALIFY
	*  @param value
	**/
   public void setMsdDividendQualify(char[] value) {
      msdDividendQualify = checkMsdDividendQualifyConstraints(value);
      serializeMsdDividendQualify(msdDividendQualify);
   } 

     /**
	 * 	Update MsdDividendQualify 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDividendQualify(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDividendQualify,msdDividendQualify.length);
   	
   }
   
   public void setMsdDividendQualify(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualify,msdDividendQualify.length);
   	
   }
   
     /**
	 * 	Update MsdDividendQualify 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendQualify(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualify+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDividendQualify with another Field
	 *	@param value
	 */
   public void setMsdDividendQualify(Field source) {
       replace(source,0,source.length(),beginMsdDividendQualify,MSD_DIVIDEND_QUALIFY_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDividendQualify 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDividendQualify(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDividendQualify,MSD_DIVIDEND_QUALIFY_LEN);
   	
   }
   
     /**
	 * 	Update MsdDividendQualify 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendQualify(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualify+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdDividendQualifyOverride
	 *	@return msdDividendQualifyOverride
	 */
   public char[] getMsdDividendQualifyOverride() throws CFException{
     if (isMsdDividendQualifyOverrideModified()) { 
        msdDividendQualifyOverride = refreshMsdDividendQualifyOverride();
     }
   		return msdDividendQualifyOverride;
   }

  
	/**
	*  set variable msdDividendQualifyOverride
	*  Corresponding COBOL Variable is MSD-DIVIDEND-QUALIFY-OVERRIDE
	*  @param value
	**/
   public void setMsdDividendQualifyOverride(char[] value) {
      msdDividendQualifyOverride = checkMsdDividendQualifyOverrideConstraints(value);
      serializeMsdDividendQualifyOverride(msdDividendQualifyOverride);
   } 

     /**
	 * 	Update MsdDividendQualifyOverride 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDividendQualifyOverride(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDividendQualifyOverride,msdDividendQualifyOverride.length);
   	
   }
   
   public void setMsdDividendQualifyOverride(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualifyOverride,msdDividendQualifyOverride.length);
   	
   }
   
     /**
	 * 	Update MsdDividendQualifyOverride 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendQualifyOverride(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualifyOverride+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDividendQualifyOverride with another Field
	 *	@param value
	 */
   public void setMsdDividendQualifyOverride(Field source) {
       replace(source,0,source.length(),beginMsdDividendQualifyOverride,MSD_DIVIDEND_QUALIFY_OVERRIDE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDividendQualifyOverride 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDividendQualifyOverride(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDividendQualifyOverride,MSD_DIVIDEND_QUALIFY_OVERRIDE_LEN);
   	
   }
   
     /**
	 * 	Update MsdDividendQualifyOverride 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendQualifyOverride(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendQualifyOverride+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01DivQualifyData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdDividendQualify(CONSTANTS.SPACE);
         setMsdDividendQualifyOverride(CONSTANTS.SPACE);
   }

		public static int getBdms01DivQualifyDataFieldLength() {
			return BDMS_01_DIV_QUALIFY_DATA_LENGTH;
		}

}
  
