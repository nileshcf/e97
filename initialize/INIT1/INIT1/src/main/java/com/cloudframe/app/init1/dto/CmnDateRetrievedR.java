package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateRetrievedR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateRetrievedR extends CmnDateRetrievedRSerialized { 
   

						private char[] cmnDateRetMm = Field.fillLowValue(2);

						private char[] cmnDateRetSep1 = Field.fillLowValue(1);

						private char[] cmnDateRetDd = Field.fillLowValue(2);

						private char[] cmnDateRetSep2 = Field.fillLowValue(1);
				private CmnDateRetYyyy cmnDateRetYyyy = new CmnDateRetYyyy();
	
	/**
	* Constructor for CmnDateRetrievedR
	**/
    public CmnDateRetrievedR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateRetrievedR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateRetrievedR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateRetYyyy.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of cmnDateRetMm
	 *	@return cmnDateRetMm
	 */
   public char[] getCmnDateRetMm() throws CFException{
     if (isCmnDateRetMmModified()) { 
        cmnDateRetMm = refreshCmnDateRetMm();
     }
   		return cmnDateRetMm;
   }

  
	/**
	*  set variable cmnDateRetMm
	*  Corresponding COBOL Variable is CMN-DATE-RET-MM
	*  @param value
	**/
   public void setCmnDateRetMm(char[] value) {
      cmnDateRetMm = checkCmnDateRetMmConstraints(value);
      serializeCmnDateRetMm(cmnDateRetMm);
   } 

     /**
	 * 	Update CmnDateRetMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetMm,cmnDateRetMm.length);
   	
   }
   
   public void setCmnDateRetMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetMm,cmnDateRetMm.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetMm with another Field
	 *	@param value
	 */
   public void setCmnDateRetMm(Field source) {
       replace(source,0,source.length(),beginCmnDateRetMm,CMN_DATE_RET_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetMm,CMN_DATE_RET_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetSep1
	 *	@return cmnDateRetSep1
	 */
   public char[] getCmnDateRetSep1() throws CFException{
     if (isCmnDateRetSep1Modified()) { 
        cmnDateRetSep1 = refreshCmnDateRetSep1();
     }
   		return cmnDateRetSep1;
   }

  
	/**
	*  set variable cmnDateRetSep1
	*  Corresponding COBOL Variable is CMN-DATE-RET-SEP-1
	*  @param value
	**/
   public void setCmnDateRetSep1(char[] value) {
      cmnDateRetSep1 = checkCmnDateRetSep1Constraints(value);
      serializeCmnDateRetSep1(cmnDateRetSep1);
   } 

     /**
	 * 	Update CmnDateRetSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetSep1,cmnDateRetSep1.length);
   	
   }
   
   public void setCmnDateRetSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep1,cmnDateRetSep1.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetSep1 with another Field
	 *	@param value
	 */
   public void setCmnDateRetSep1(Field source) {
       replace(source,0,source.length(),beginCmnDateRetSep1,CMN_DATE_RET_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetSep1,CMN_DATE_RET_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetDd
	 *	@return cmnDateRetDd
	 */
   public char[] getCmnDateRetDd() throws CFException{
     if (isCmnDateRetDdModified()) { 
        cmnDateRetDd = refreshCmnDateRetDd();
     }
   		return cmnDateRetDd;
   }

  
	/**
	*  set variable cmnDateRetDd
	*  Corresponding COBOL Variable is CMN-DATE-RET-DD
	*  @param value
	**/
   public void setCmnDateRetDd(char[] value) {
      cmnDateRetDd = checkCmnDateRetDdConstraints(value);
      serializeCmnDateRetDd(cmnDateRetDd);
   } 

     /**
	 * 	Update CmnDateRetDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetDd,cmnDateRetDd.length);
   	
   }
   
   public void setCmnDateRetDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetDd,cmnDateRetDd.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetDd with another Field
	 *	@param value
	 */
   public void setCmnDateRetDd(Field source) {
       replace(source,0,source.length(),beginCmnDateRetDd,CMN_DATE_RET_DD_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetDd,CMN_DATE_RET_DD_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetSep2
	 *	@return cmnDateRetSep2
	 */
   public char[] getCmnDateRetSep2() throws CFException{
     if (isCmnDateRetSep2Modified()) { 
        cmnDateRetSep2 = refreshCmnDateRetSep2();
     }
   		return cmnDateRetSep2;
   }

  
	/**
	*  set variable cmnDateRetSep2
	*  Corresponding COBOL Variable is CMN-DATE-RET-SEP-2
	*  @param value
	**/
   public void setCmnDateRetSep2(char[] value) {
      cmnDateRetSep2 = checkCmnDateRetSep2Constraints(value);
      serializeCmnDateRetSep2(cmnDateRetSep2);
   } 

     /**
	 * 	Update CmnDateRetSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetSep2,cmnDateRetSep2.length);
   	
   }
   
   public void setCmnDateRetSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep2,cmnDateRetSep2.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetSep2 with another Field
	 *	@param value
	 */
   public void setCmnDateRetSep2(Field source) {
       replace(source,0,source.length(),beginCmnDateRetSep2,CMN_DATE_RET_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetSep2,CMN_DATE_RET_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetSep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetYyyy
	 *	@return cmnDateRetYyyy
	 */   
	 public CmnDateRetYyyy getCmnDateRetYyyy() {
   	return cmnDateRetYyyy;
   }
   /**
	* 	Update CmnDateRetYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-RET-YYYY
	*	@param value
	*/
   public void setCmnDateRetYyyy(char[] value) {
      cmnDateRetYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateRetYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetYyyy.begin,cmnDateRetYyyy.length());
   }
   
     /**
	 * 	Update CmnDateRetYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateRetYyyy with another Field
	 *	@param value
	 */
   public void setCmnDateRetYyyy(Field source) {
   	replace(source,0,source.length(),cmnDateRetYyyy.begin,cmnDateRetYyyy.length());
   }  
   
     /**
	 * 	Update CmnDateRetYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetYyyy.begin,cmnDateRetYyyy.length());
   }
   
     /**
	 * 	Update CmnDateRetYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetYyyy.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateRetrievedRFieldLength() {
			return CMN_DATE_RETRIEVED_R_LENGTH;
		}

}
  
