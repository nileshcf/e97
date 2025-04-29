package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SearchOptExpCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01SearchOptExpCcyymmdd extends Bdms01SearchOptExpCcyymmddSerialized { 
   

						private char[] bdms01SearchOptExpCc = Field.fillLowValue(2);

						private char[] bdms01SearchOptExpYy = Field.fillLowValue(2);

						private char[] bdms01SearchOptExpMm = Field.fillLowValue(2);

						private char[] bdms01SearchOptExpDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Bdms01SearchOptExpCcyymmdd
	**/
    public Bdms01SearchOptExpCcyymmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SearchOptExpCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchOptExpCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01SearchOptExpCc
	 *	@return bdms01SearchOptExpCc
	 */
   public char[] getBdms01SearchOptExpCc() throws CFException{
     if (isBdms01SearchOptExpCcModified()) { 
        bdms01SearchOptExpCc = refreshBdms01SearchOptExpCc();
     }
   		return bdms01SearchOptExpCc;
   }

  
	/**
	*  set variable bdms01SearchOptExpCc
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-EXP-CC
	*  @param value
	**/
   public void setBdms01SearchOptExpCc(char[] value) {
      bdms01SearchOptExpCc = checkBdms01SearchOptExpCcConstraints(value);
      serializeBdms01SearchOptExpCc(bdms01SearchOptExpCc);
   } 

     /**
	 * 	Update Bdms01SearchOptExpCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptExpCc,bdms01SearchOptExpCc.length);
   	
   }
   
   public void setBdms01SearchOptExpCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpCc,bdms01SearchOptExpCc.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptExpCc with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptExpCc(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptExpCc,BDMS_01_SEARCH_OPT_EXP_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptExpCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptExpCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpCc,BDMS_01_SEARCH_OPT_EXP_CC_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptExpYy
	 *	@return bdms01SearchOptExpYy
	 */
   public char[] getBdms01SearchOptExpYy() throws CFException{
     if (isBdms01SearchOptExpYyModified()) { 
        bdms01SearchOptExpYy = refreshBdms01SearchOptExpYy();
     }
   		return bdms01SearchOptExpYy;
   }

  
	/**
	*  set variable bdms01SearchOptExpYy
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-EXP-YY
	*  @param value
	**/
   public void setBdms01SearchOptExpYy(char[] value) {
      bdms01SearchOptExpYy = checkBdms01SearchOptExpYyConstraints(value);
      serializeBdms01SearchOptExpYy(bdms01SearchOptExpYy);
   } 

     /**
	 * 	Update Bdms01SearchOptExpYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptExpYy,bdms01SearchOptExpYy.length);
   	
   }
   
   public void setBdms01SearchOptExpYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpYy,bdms01SearchOptExpYy.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptExpYy with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptExpYy(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptExpYy,BDMS_01_SEARCH_OPT_EXP_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptExpYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptExpYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpYy,BDMS_01_SEARCH_OPT_EXP_YY_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptExpMm
	 *	@return bdms01SearchOptExpMm
	 */
   public char[] getBdms01SearchOptExpMm() throws CFException{
     if (isBdms01SearchOptExpMmModified()) { 
        bdms01SearchOptExpMm = refreshBdms01SearchOptExpMm();
     }
   		return bdms01SearchOptExpMm;
   }

  
	/**
	*  set variable bdms01SearchOptExpMm
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-EXP-MM
	*  @param value
	**/
   public void setBdms01SearchOptExpMm(char[] value) {
      bdms01SearchOptExpMm = checkBdms01SearchOptExpMmConstraints(value);
      serializeBdms01SearchOptExpMm(bdms01SearchOptExpMm);
   } 

     /**
	 * 	Update Bdms01SearchOptExpMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptExpMm,bdms01SearchOptExpMm.length);
   	
   }
   
   public void setBdms01SearchOptExpMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpMm,bdms01SearchOptExpMm.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptExpMm with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptExpMm(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptExpMm,BDMS_01_SEARCH_OPT_EXP_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptExpMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptExpMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpMm,BDMS_01_SEARCH_OPT_EXP_MM_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptExpDd
	 *	@return bdms01SearchOptExpDd
	 */
   public char[] getBdms01SearchOptExpDd() throws CFException{
     if (isBdms01SearchOptExpDdModified()) { 
        bdms01SearchOptExpDd = refreshBdms01SearchOptExpDd();
     }
   		return bdms01SearchOptExpDd;
   }

  
	/**
	*  set variable bdms01SearchOptExpDd
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-EXP-DD
	*  @param value
	**/
   public void setBdms01SearchOptExpDd(char[] value) {
      bdms01SearchOptExpDd = checkBdms01SearchOptExpDdConstraints(value);
      serializeBdms01SearchOptExpDd(bdms01SearchOptExpDd);
   } 

     /**
	 * 	Update Bdms01SearchOptExpDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptExpDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptExpDd,bdms01SearchOptExpDd.length);
   	
   }
   
   public void setBdms01SearchOptExpDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpDd,bdms01SearchOptExpDd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptExpDd with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptExpDd(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptExpDd,BDMS_01_SEARCH_OPT_EXP_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptExpDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptExpDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpDd,BDMS_01_SEARCH_OPT_EXP_DD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptExpDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptExpDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptExpDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBdms01SearchOptExpCcyymmddFieldLength() {
			return BDMS_01_SEARCH_OPT_EXP_CCYYMMDD_LENGTH;
		}

}
  
