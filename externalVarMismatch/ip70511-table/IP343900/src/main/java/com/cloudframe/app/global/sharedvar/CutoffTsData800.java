package com.cloudframe.app.global.sharedvar;

/**
*  The class CutoffTsData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_cutoffTsData800")

public class CutoffTsData800 extends CutoffTsData800Serialized  implements InitializingBean {
   

						private char[] cutoffPmtBegin800 = Field.fillLowValue(26);

						private char[] cutoffPmaBegin800 = Field.fillLowValue(26);

						private char[] cutoffPalBegin800 = Field.fillLowValue(26);

						private char[] cutoffTmtBegin800 = Field.fillLowValue(26);

						private char[] cutoffPmiBegin800 = Field.fillLowValue(26);

						private char[] cutoffPmapBegin800 = Field.fillLowValue(26);

						private char[] cutoffPimBegin800 = Field.fillLowValue(26);
	
	/**
	* Constructor for CutoffTsData800
	**/
    public CutoffTsData800() {
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
	 *	Returns the value of cutoffPmtBegin800
	 *	@return cutoffPmtBegin800
	 */
   public char[] getCutoffPmtBegin800() throws CFException{
     if (isCutoffPmtBegin800Modified()) { 
        cutoffPmtBegin800 = refreshCutoffPmtBegin800();
     }
   		return cutoffPmtBegin800;
   }

  
	/**
	*  set variable cutoffPmtBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMT-BEGIN
	*  @param value
	**/
   public void setCutoffPmtBegin800(char[] value) {
      cutoffPmtBegin800 = checkCutoffPmtBegin800Constraints(value);
      serializeCutoffPmtBegin800(cutoffPmtBegin800);
   } 

     /**
	 * 	Update CutoffPmtBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmtBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmtBegin800,cutoffPmtBegin800.length);
   	
   }
   
   public void setCutoffPmtBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtBegin800,cutoffPmtBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmtBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmtBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmtBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPmtBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPmtBegin800,CUTOFF_PMT_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmtBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmtBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmtBegin800,CUTOFF_PMT_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmtBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmtBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmtBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmaBegin800
	 *	@return cutoffPmaBegin800
	 */
   public char[] getCutoffPmaBegin800() throws CFException{
     if (isCutoffPmaBegin800Modified()) { 
        cutoffPmaBegin800 = refreshCutoffPmaBegin800();
     }
   		return cutoffPmaBegin800;
   }

  
	/**
	*  set variable cutoffPmaBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMA-BEGIN
	*  @param value
	**/
   public void setCutoffPmaBegin800(char[] value) {
      cutoffPmaBegin800 = checkCutoffPmaBegin800Constraints(value);
      serializeCutoffPmaBegin800(cutoffPmaBegin800);
   } 

     /**
	 * 	Update CutoffPmaBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmaBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmaBegin800,cutoffPmaBegin800.length);
   	
   }
   
   public void setCutoffPmaBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaBegin800,cutoffPmaBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmaBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmaBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmaBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPmaBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPmaBegin800,CUTOFF_PMA_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmaBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmaBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmaBegin800,CUTOFF_PMA_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmaBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmaBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmaBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPalBegin800
	 *	@return cutoffPalBegin800
	 */
   public char[] getCutoffPalBegin800() throws CFException{
     if (isCutoffPalBegin800Modified()) { 
        cutoffPalBegin800 = refreshCutoffPalBegin800();
     }
   		return cutoffPalBegin800;
   }

  
	/**
	*  set variable cutoffPalBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PAL-BEGIN
	*  @param value
	**/
   public void setCutoffPalBegin800(char[] value) {
      cutoffPalBegin800 = checkCutoffPalBegin800Constraints(value);
      serializeCutoffPalBegin800(cutoffPalBegin800);
   } 

     /**
	 * 	Update CutoffPalBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPalBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPalBegin800,cutoffPalBegin800.length);
   	
   }
   
   public void setCutoffPalBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalBegin800,cutoffPalBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPalBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPalBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPalBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPalBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPalBegin800,CUTOFF_PAL_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPalBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPalBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPalBegin800,CUTOFF_PAL_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPalBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPalBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPalBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffTmtBegin800
	 *	@return cutoffTmtBegin800
	 */
   public char[] getCutoffTmtBegin800() throws CFException{
     if (isCutoffTmtBegin800Modified()) { 
        cutoffTmtBegin800 = refreshCutoffTmtBegin800();
     }
   		return cutoffTmtBegin800;
   }

  
	/**
	*  set variable cutoffTmtBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-TMT-BEGIN
	*  @param value
	**/
   public void setCutoffTmtBegin800(char[] value) {
      cutoffTmtBegin800 = checkCutoffTmtBegin800Constraints(value);
      serializeCutoffTmtBegin800(cutoffTmtBegin800);
   } 

     /**
	 * 	Update CutoffTmtBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffTmtBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffTmtBegin800,cutoffTmtBegin800.length);
   	
   }
   
   public void setCutoffTmtBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtBegin800,cutoffTmtBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffTmtBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffTmtBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffTmtBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffTmtBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffTmtBegin800,CUTOFF_TMT_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffTmtBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffTmtBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffTmtBegin800,CUTOFF_TMT_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffTmtBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffTmtBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffTmtBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmiBegin800
	 *	@return cutoffPmiBegin800
	 */
   public char[] getCutoffPmiBegin800() throws CFException{
     if (isCutoffPmiBegin800Modified()) { 
        cutoffPmiBegin800 = refreshCutoffPmiBegin800();
     }
   		return cutoffPmiBegin800;
   }

  
	/**
	*  set variable cutoffPmiBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMI-BEGIN
	*  @param value
	**/
   public void setCutoffPmiBegin800(char[] value) {
      cutoffPmiBegin800 = checkCutoffPmiBegin800Constraints(value);
      serializeCutoffPmiBegin800(cutoffPmiBegin800);
   } 

     /**
	 * 	Update CutoffPmiBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmiBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmiBegin800,cutoffPmiBegin800.length);
   	
   }
   
   public void setCutoffPmiBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiBegin800,cutoffPmiBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmiBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmiBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmiBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPmiBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPmiBegin800,CUTOFF_PMI_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmiBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmiBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmiBegin800,CUTOFF_PMI_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmiBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmiBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmiBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPmapBegin800
	 *	@return cutoffPmapBegin800
	 */
   public char[] getCutoffPmapBegin800() throws CFException{
     if (isCutoffPmapBegin800Modified()) { 
        cutoffPmapBegin800 = refreshCutoffPmapBegin800();
     }
   		return cutoffPmapBegin800;
   }

  
	/**
	*  set variable cutoffPmapBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PMAP-BEGIN
	*  @param value
	**/
   public void setCutoffPmapBegin800(char[] value) {
      cutoffPmapBegin800 = checkCutoffPmapBegin800Constraints(value);
      serializeCutoffPmapBegin800(cutoffPmapBegin800);
   } 

     /**
	 * 	Update CutoffPmapBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPmapBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPmapBegin800,cutoffPmapBegin800.length);
   	
   }
   
   public void setCutoffPmapBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapBegin800,cutoffPmapBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPmapBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmapBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPmapBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPmapBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPmapBegin800,CUTOFF_PMAP_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPmapBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPmapBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPmapBegin800,CUTOFF_PMAP_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPmapBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPmapBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPmapBegin800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cutoffPimBegin800
	 *	@return cutoffPimBegin800
	 */
   public char[] getCutoffPimBegin800() throws CFException{
     if (isCutoffPimBegin800Modified()) { 
        cutoffPimBegin800 = refreshCutoffPimBegin800();
     }
   		return cutoffPimBegin800;
   }

  
	/**
	*  set variable cutoffPimBegin800
	*  Corresponding COBOL Variable is 800-CUTOFF-PIM-BEGIN
	*  @param value
	**/
   public void setCutoffPimBegin800(char[] value) {
      cutoffPimBegin800 = checkCutoffPimBegin800Constraints(value);
      serializeCutoffPimBegin800(cutoffPimBegin800);
   } 

     /**
	 * 	Update CutoffPimBegin800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffPimBegin800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffPimBegin800,cutoffPimBegin800.length);
   	
   }
   
   public void setCutoffPimBegin800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimBegin800,cutoffPimBegin800.length);
   	
   }
   
     /**
	 * 	Update CutoffPimBegin800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPimBegin800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimBegin800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffPimBegin800 with another Field
	 *	@param value
	 */
   public void setCutoffPimBegin800(Field source) {
       replace(source,0,source.length(),beginCutoffPimBegin800,CUTOFF_PIM_BEGIN_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffPimBegin800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffPimBegin800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffPimBegin800,CUTOFF_PIM_BEGIN_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffPimBegin800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffPimBegin800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffPimBegin800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes CutoffTsData800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCutoffPmtBegin800(CONSTANTS.SPACE_26);
         setCutoffPmaBegin800(CONSTANTS.SPACE_26);
         setCutoffPalBegin800(CONSTANTS.SPACE_26);
         setCutoffTmtBegin800(CONSTANTS.SPACE_26);
         setCutoffPmiBegin800(CONSTANTS.SPACE_26);
         setCutoffPmapBegin800(CONSTANTS.SPACE_26);
         setCutoffPimBegin800(CONSTANTS.SPACE_26);
   }

		public static int getCutoffTsData800FieldLength() {
			return CUTOFF_TS_DATA_800_LENGTH;
		}

}
  
