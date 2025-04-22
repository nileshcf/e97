package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonXcdtTskStrtDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:09. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon1.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MonXcdtTskStrtDt extends MonXcdtTskStrtDtSerialized { 
   

						private char[] monXcdtTskStrtDtYyyy = Field.fillLowValue(4);


						private char[] monXcdtTskStrtDtMm = Field.fillLowValue(2);


						private char[] monXcdtTskStrtDtDd = Field.fillLowValue(2);
	
	/**
	* Constructor for MonXcdtTskStrtDt
	**/
    public MonXcdtTskStrtDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MonXcdtTskStrtDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonXcdtTskStrtDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of monXcdtTskStrtDtYyyy
	 *	@return monXcdtTskStrtDtYyyy
	 */
   public char[] getMonXcdtTskStrtDtYyyy() throws CFException{
     if (isMonXcdtTskStrtDtYyyyModified()) { 
        monXcdtTskStrtDtYyyy = refreshMonXcdtTskStrtDtYyyy();
     }
   		return monXcdtTskStrtDtYyyy;
   }

  
	/**
	*  set variable monXcdtTskStrtDtYyyy
	*  Corresponding COBOL Variable is MON-XCDT-TSK-STRT-DT-YYYY
	*  @param value
	**/
   public void setMonXcdtTskStrtDtYyyy(char[] value) {
      monXcdtTskStrtDtYyyy = checkMonXcdtTskStrtDtYyyyConstraints(value);
      serializeMonXcdtTskStrtDtYyyy(monXcdtTskStrtDtYyyy);
   } 

     /**
	 * 	Update MonXcdtTskStrtDtYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtTskStrtDtYyyy,monXcdtTskStrtDtYyyy.length);
   	
   }
   
   public void setMonXcdtTskStrtDtYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtYyyy,monXcdtTskStrtDtYyyy.length);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtTskStrtDtYyyy with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtYyyy(Field source) {
       replace(source,0,source.length(),beginMonXcdtTskStrtDtYyyy,MON_XCDT_TSK_STRT_DT_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDtYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtYyyy,MON_XCDT_TSK_STRT_DT_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtYyyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcdtTskStrtDtMm
	 *	@return monXcdtTskStrtDtMm
	 */
   public char[] getMonXcdtTskStrtDtMm() throws CFException{
     if (isMonXcdtTskStrtDtMmModified()) { 
        monXcdtTskStrtDtMm = refreshMonXcdtTskStrtDtMm();
     }
   		return monXcdtTskStrtDtMm;
   }

  
	/**
	*  set variable monXcdtTskStrtDtMm
	*  Corresponding COBOL Variable is MON-XCDT-TSK-STRT-DT-MM
	*  @param value
	**/
   public void setMonXcdtTskStrtDtMm(char[] value) {
      monXcdtTskStrtDtMm = checkMonXcdtTskStrtDtMmConstraints(value);
      serializeMonXcdtTskStrtDtMm(monXcdtTskStrtDtMm);
   } 

     /**
	 * 	Update MonXcdtTskStrtDtMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtTskStrtDtMm,monXcdtTskStrtDtMm.length);
   	
   }
   
   public void setMonXcdtTskStrtDtMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtMm,monXcdtTskStrtDtMm.length);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtTskStrtDtMm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtMm(Field source) {
       replace(source,0,source.length(),beginMonXcdtTskStrtDtMm,MON_XCDT_TSK_STRT_DT_MM_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDtMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtMm,MON_XCDT_TSK_STRT_DT_MM_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcdtTskStrtDtDd
	 *	@return monXcdtTskStrtDtDd
	 */
   public char[] getMonXcdtTskStrtDtDd() throws CFException{
     if (isMonXcdtTskStrtDtDdModified()) { 
        monXcdtTskStrtDtDd = refreshMonXcdtTskStrtDtDd();
     }
   		return monXcdtTskStrtDtDd;
   }

  
	/**
	*  set variable monXcdtTskStrtDtDd
	*  Corresponding COBOL Variable is MON-XCDT-TSK-STRT-DT-DD
	*  @param value
	**/
   public void setMonXcdtTskStrtDtDd(char[] value) {
      monXcdtTskStrtDtDd = checkMonXcdtTskStrtDtDdConstraints(value);
      serializeMonXcdtTskStrtDtDd(monXcdtTskStrtDtDd);
   } 

     /**
	 * 	Update MonXcdtTskStrtDtDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtTskStrtDtDd,monXcdtTskStrtDtDd.length);
   	
   }
   
   public void setMonXcdtTskStrtDtDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtDd,monXcdtTskStrtDtDd.length);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtTskStrtDtDd with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtDd(Field source) {
       replace(source,0,source.length(),beginMonXcdtTskStrtDtDd,MON_XCDT_TSK_STRT_DT_DD_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDtDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtDd,MON_XCDT_TSK_STRT_DT_DD_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDtDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDtDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtDtDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MonXcdtTskStrtDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMonXcdtTskStrtDtYyyy(CONSTANTS.SPACE_4);
         setMonXcdtTskStrtDtMm(CONSTANTS.SPACE_2);
         setMonXcdtTskStrtDtDd(CONSTANTS.SPACE_2);
   }

		public static int getMonXcdtTskStrtDtFieldLength() {
			return MON_XCDT_TSK_STRT_DT_LENGTH;
		}

}
  
