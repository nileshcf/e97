package com.cloudframe.app.global.sharedvar;

/**
*  The class CutoffCkpData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_cutoffCkpData800")

public class CutoffCkpData800 extends CutoffCkpData800Serialized  implements InitializingBean {
   

						private char[] cutoffPmtCkp800 = Field.fillLowValue(26);

						private char[] cutoffPmaCkp800 = Field.fillLowValue(26);

						private char[] cutoffPalCkp800 = Field.fillLowValue(26);

						private char[] cutoffTmtCkp800 = Field.fillLowValue(26);

						private char[] cutoffPmiCkp800 = Field.fillLowValue(26);

						private char[] cutoffPmapCkp800 = Field.fillLowValue(26);

						private char[] cutoffPimCkp800 = Field.fillLowValue(26);
	
	/**
	* Constructor for CutoffCkpData800
	**/
    public CutoffCkpData800() {
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
	 *	Returns the value of cutoffPmtCkp800
	 *	@return cutoffPmtCkp800
	 */
   public char[] getCutoffPmtCkp800() throws CFException{
     if (isCutoffPmtCkp800Modified()) { 
        cutoffPmtCkp800 = refreshCutoffPmtCkp800();
     }
   		return cutoffPmtCkp800;
   }

  
	/**
	*  set variable cutoffPmtCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMT-CKP
	*  @param value
	**/
   public void setCutoffPmtCkp800(char[] value) {
      cutoffPmtCkp800 = checkCutoffPmtCkp800Constraints(value);
      serializeCutoffPmtCkp800(cutoffPmtCkp800);
   } 

     /**
	 * 	Update CutoffPmtCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmtCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmtCkp800,cutoffPmtCkp800.length);
   	
   }
   
   public void setCutoffPmtCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtCkp800,cutoffPmtCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmtCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmtCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmtCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPmtCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPmtCkp800,CUTOFF_PMT_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmtCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmtCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmtCkp800,CUTOFF_PMT_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmtCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmtCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmaCkp800
	 *	@return cutoffPmaCkp800
	 */
   public char[] getCutoffPmaCkp800() throws CFException{
     if (isCutoffPmaCkp800Modified()) { 
        cutoffPmaCkp800 = refreshCutoffPmaCkp800();
     }
   		return cutoffPmaCkp800;
   }

  
	/**
	*  set variable cutoffPmaCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMA-CKP
	*  @param value
	**/
   public void setCutoffPmaCkp800(char[] value) {
      cutoffPmaCkp800 = checkCutoffPmaCkp800Constraints(value);
      serializeCutoffPmaCkp800(cutoffPmaCkp800);
   } 

     /**
	 * 	Update CutoffPmaCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmaCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmaCkp800,cutoffPmaCkp800.length);
   	
   }
   
   public void setCutoffPmaCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaCkp800,cutoffPmaCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmaCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmaCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmaCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPmaCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPmaCkp800,CUTOFF_PMA_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmaCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmaCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmaCkp800,CUTOFF_PMA_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmaCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmaCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPalCkp800
	 *	@return cutoffPalCkp800
	 */
   public char[] getCutoffPalCkp800() throws CFException{
     if (isCutoffPalCkp800Modified()) { 
        cutoffPalCkp800 = refreshCutoffPalCkp800();
     }
   		return cutoffPalCkp800;
   }

  
	/**
	*  set variable cutoffPalCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PAL-CKP
	*  @param value
	**/
   public void setCutoffPalCkp800(char[] value) {
      cutoffPalCkp800 = checkCutoffPalCkp800Constraints(value);
      serializeCutoffPalCkp800(cutoffPalCkp800);
   } 

     /**
	 * 	Update CutoffPalCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPalCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPalCkp800,cutoffPalCkp800.length);
   	
   }
   
   public void setCutoffPalCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalCkp800,cutoffPalCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPalCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPalCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPalCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPalCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPalCkp800,CUTOFF_PAL_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPalCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPalCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPalCkp800,CUTOFF_PAL_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPalCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPalCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffTmtCkp800
	 *	@return cutoffTmtCkp800
	 */
   public char[] getCutoffTmtCkp800() throws CFException{
     if (isCutoffTmtCkp800Modified()) { 
        cutoffTmtCkp800 = refreshCutoffTmtCkp800();
     }
   		return cutoffTmtCkp800;
   }

  
	/**
	*  set variable cutoffTmtCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-TMT-CKP
	*  @param value
	**/
   public void setCutoffTmtCkp800(char[] value) {
      cutoffTmtCkp800 = checkCutoffTmtCkp800Constraints(value);
      serializeCutoffTmtCkp800(cutoffTmtCkp800);
   } 

     /**
	 * 	Update CutoffTmtCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffTmtCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffTmtCkp800,cutoffTmtCkp800.length);
   	
   }
   
   public void setCutoffTmtCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtCkp800,cutoffTmtCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffTmtCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffTmtCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffTmtCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffTmtCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffTmtCkp800,CUTOFF_TMT_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffTmtCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffTmtCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffTmtCkp800,CUTOFF_TMT_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffTmtCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffTmtCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmiCkp800
	 *	@return cutoffPmiCkp800
	 */
   public char[] getCutoffPmiCkp800() throws CFException{
     if (isCutoffPmiCkp800Modified()) { 
        cutoffPmiCkp800 = refreshCutoffPmiCkp800();
     }
   		return cutoffPmiCkp800;
   }

  
	/**
	*  set variable cutoffPmiCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMI-CKP
	*  @param value
	**/
   public void setCutoffPmiCkp800(char[] value) {
      cutoffPmiCkp800 = checkCutoffPmiCkp800Constraints(value);
      serializeCutoffPmiCkp800(cutoffPmiCkp800);
   } 

     /**
	 * 	Update CutoffPmiCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmiCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmiCkp800,cutoffPmiCkp800.length);
   	
   }
   
   public void setCutoffPmiCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiCkp800,cutoffPmiCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmiCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmiCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmiCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPmiCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPmiCkp800,CUTOFF_PMI_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmiCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmiCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmiCkp800,CUTOFF_PMI_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmiCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmiCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmapCkp800
	 *	@return cutoffPmapCkp800
	 */
   public char[] getCutoffPmapCkp800() throws CFException{
     if (isCutoffPmapCkp800Modified()) { 
        cutoffPmapCkp800 = refreshCutoffPmapCkp800();
     }
   		return cutoffPmapCkp800;
   }

  
	/**
	*  set variable cutoffPmapCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMAP-CKP
	*  @param value
	**/
   public void setCutoffPmapCkp800(char[] value) {
      cutoffPmapCkp800 = checkCutoffPmapCkp800Constraints(value);
      serializeCutoffPmapCkp800(cutoffPmapCkp800);
   } 

     /**
	 * 	Update CutoffPmapCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmapCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmapCkp800,cutoffPmapCkp800.length);
   	
   }
   
   public void setCutoffPmapCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapCkp800,cutoffPmapCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmapCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmapCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmapCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPmapCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPmapCkp800,CUTOFF_PMAP_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmapCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmapCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmapCkp800,CUTOFF_PMAP_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmapCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmapCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapCkp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPimCkp800
	 *	@return cutoffPimCkp800
	 */
   public char[] getCutoffPimCkp800() throws CFException{
     if (isCutoffPimCkp800Modified()) { 
        cutoffPimCkp800 = refreshCutoffPimCkp800();
     }
   		return cutoffPimCkp800;
   }

  
	/**
	*  set variable cutoffPimCkp800
	*  Corresponding COBOL Variable is 800-CUTOFF-PIM-CKP
	*  @param value
	**/
   public void setCutoffPimCkp800(char[] value) {
      cutoffPimCkp800 = checkCutoffPimCkp800Constraints(value);
      serializeCutoffPimCkp800(cutoffPimCkp800);
   } 

     /**
	 * 	Update CutoffPimCkp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPimCkp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPimCkp800,cutoffPimCkp800.length);
   	
   }
   
   public void setCutoffPimCkp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimCkp800,cutoffPimCkp800.length);
   	
   }
   
     /**
	 * 	Update CutoffPimCkp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPimCkp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimCkp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPimCkp800 with another Field
	 *	@param value
	 */
   public void setCutoffPimCkp800(Field source) {
       replace(source,0,source.length(),beginCutoffPimCkp800,CUTOFF_PIM_CKP_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPimCkp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPimCkp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPimCkp800,CUTOFF_PIM_CKP_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPimCkp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPimCkp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimCkp800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes CutoffCkpData800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCutoffPmtCkp800(CONSTANTS.SPACE_26);
         setCutoffPmaCkp800(CONSTANTS.SPACE_26);
         setCutoffPalCkp800(CONSTANTS.SPACE_26);
         setCutoffTmtCkp800(CONSTANTS.SPACE_26);
         setCutoffPmiCkp800(CONSTANTS.SPACE_26);
         setCutoffPmapCkp800(CONSTANTS.SPACE_26);
         setCutoffPimCkp800(CONSTANTS.SPACE_26);
   }

		public static int getCutoffCkpData800FieldLength() {
			return CUTOFF_CKP_DATA_800_LENGTH;
		}

}
  
