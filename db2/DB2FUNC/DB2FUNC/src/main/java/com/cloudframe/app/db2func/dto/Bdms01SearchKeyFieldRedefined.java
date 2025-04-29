package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SearchKeyFieldRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01SearchKeyFieldRedefined extends Bdms01SearchKeyFieldRedefinedSerialized { 
   
				private Bdms01SearchOptExpCcyymmdd bdms01SearchOptExpCcyymmdd = new Bdms01SearchOptExpCcyymmdd();

						private char[] bdms01SearchOptPutCallCd = Field.fillLowValue(1);

						private char[] bdms01SearchOptStyleCd = Field.fillLowValue(1);

						private char[] bdms01SearchOptOpenClose = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined
	**/
    public Bdms01SearchKeyFieldRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchKeyFieldRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bdms01SearchOptExpCcyymmdd.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of bdms01SearchOptExpCcyymmdd
	 *	@return bdms01SearchOptExpCcyymmdd
	 */   
	 public Bdms01SearchOptExpCcyymmdd getBdms01SearchOptExpCcyymmdd() {
   	return bdms01SearchOptExpCcyymmdd;
   }
   /**
	* 	Update Bdms01SearchOptExpCcyymmdd with the passed value
	*   Corresponding COBOL Variable is BDMS01-SEARCH-OPT-EXP-CCYYMMDD
	*	@param value
	*/
   public void setBdms01SearchOptExpCcyymmdd(char[] value) {
      bdms01SearchOptExpCcyymmdd.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SearchOptExpCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpCcyymmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchOptExpCcyymmdd.begin,bdms01SearchOptExpCcyymmdd.length());
   }
   
     /**
	 * 	Update Bdms01SearchOptExpCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchOptExpCcyymmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SearchOptExpCcyymmdd with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptExpCcyymmdd(Field source) {
   	replace(source,0,source.length(),bdms01SearchOptExpCcyymmdd.begin,bdms01SearchOptExpCcyymmdd.length());
   }  
   
     /**
	 * 	Update Bdms01SearchOptExpCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchOptExpCcyymmdd.begin,bdms01SearchOptExpCcyymmdd.length());
   }
   
     /**
	 * 	Update Bdms01SearchOptExpCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchOptExpCcyymmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SearchOptPutCallCd
	 *	@return bdms01SearchOptPutCallCd
	 */
   public char[] getBdms01SearchOptPutCallCd() throws CFException{
     if (isBdms01SearchOptPutCallCdModified()) { 
        bdms01SearchOptPutCallCd = refreshBdms01SearchOptPutCallCd();
     }
   		return bdms01SearchOptPutCallCd;
   }

  
	/**
	*  set variable bdms01SearchOptPutCallCd
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-PUT-CALL-CD
	*  @param value
	**/
   public void setBdms01SearchOptPutCallCd(char[] value) {
      bdms01SearchOptPutCallCd = checkBdms01SearchOptPutCallCdConstraints(value);
      serializeBdms01SearchOptPutCallCd(bdms01SearchOptPutCallCd);
   } 

     /**
	 * 	Update Bdms01SearchOptPutCallCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptPutCallCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptPutCallCd,bdms01SearchOptPutCallCd.length);
   	
   }
   
   public void setBdms01SearchOptPutCallCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptPutCallCd,bdms01SearchOptPutCallCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptPutCallCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptPutCallCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptPutCallCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptPutCallCd with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptPutCallCd(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptPutCallCd,BDMS_01_SEARCH_OPT_PUT_CALL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptPutCallCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptPutCallCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptPutCallCd,BDMS_01_SEARCH_OPT_PUT_CALL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptPutCallCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptPutCallCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptPutCallCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptStyleCd
	 *	@return bdms01SearchOptStyleCd
	 */
   public char[] getBdms01SearchOptStyleCd() throws CFException{
     if (isBdms01SearchOptStyleCdModified()) { 
        bdms01SearchOptStyleCd = refreshBdms01SearchOptStyleCd();
     }
   		return bdms01SearchOptStyleCd;
   }

  
	/**
	*  set variable bdms01SearchOptStyleCd
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-STYLE-CD
	*  @param value
	**/
   public void setBdms01SearchOptStyleCd(char[] value) {
      bdms01SearchOptStyleCd = checkBdms01SearchOptStyleCdConstraints(value);
      serializeBdms01SearchOptStyleCd(bdms01SearchOptStyleCd);
   } 

     /**
	 * 	Update Bdms01SearchOptStyleCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptStyleCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptStyleCd,bdms01SearchOptStyleCd.length);
   	
   }
   
   public void setBdms01SearchOptStyleCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStyleCd,bdms01SearchOptStyleCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptStyleCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptStyleCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStyleCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptStyleCd with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptStyleCd(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptStyleCd,BDMS_01_SEARCH_OPT_STYLE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptStyleCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptStyleCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStyleCd,BDMS_01_SEARCH_OPT_STYLE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptStyleCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptStyleCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStyleCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptOpenClose
	 *	@return bdms01SearchOptOpenClose
	 */
   public char[] getBdms01SearchOptOpenClose() throws CFException{
     if (isBdms01SearchOptOpenCloseModified()) { 
        bdms01SearchOptOpenClose = refreshBdms01SearchOptOpenClose();
     }
   		return bdms01SearchOptOpenClose;
   }

  
	/**
	*  set variable bdms01SearchOptOpenClose
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-OPEN-CLOSE
	*  @param value
	**/
   public void setBdms01SearchOptOpenClose(char[] value) {
      bdms01SearchOptOpenClose = checkBdms01SearchOptOpenCloseConstraints(value);
      serializeBdms01SearchOptOpenClose(bdms01SearchOptOpenClose);
   } 

     /**
	 * 	Update Bdms01SearchOptOpenClose 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptOpenClose(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptOpenClose,bdms01SearchOptOpenClose.length);
   	
   }
   
   public void setBdms01SearchOptOpenClose(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptOpenClose,bdms01SearchOptOpenClose.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptOpenClose 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptOpenClose(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptOpenClose+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptOpenClose with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptOpenClose(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptOpenClose,BDMS_01_SEARCH_OPT_OPEN_CLOSE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptOpenClose 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptOpenClose(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptOpenClose,BDMS_01_SEARCH_OPT_OPEN_CLOSE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptOpenClose 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptOpenClose(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptOpenClose+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBdms01SearchKeyFieldRedefinedFieldLength() {
			return BDMS_01_SEARCH_KEY_FIELD_REDEFINED_LENGTH;
		}

}
  
