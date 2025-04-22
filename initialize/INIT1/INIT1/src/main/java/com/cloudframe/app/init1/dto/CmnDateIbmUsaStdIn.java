package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateIbmUsaStdIn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateIbmUsaStdIn extends CmnDateIbmUsaStdInSerialized { 
   

						private char[] cmnDateIbmUsaStdInMm = Field.fillLowValue(2);

						private char[] cmnDateIbmUsaStdInSep1 = Field.fillLowValue(1);

						private char[] cmnDateIbmUsaStdInDd = Field.fillLowValue(2);

						private char[] cmnDateIbmUsaStdInSep101 = Field.fillLowValue(1);

						private char[] cmnDateIbmUsaStdInCcyy = Field.fillLowValue(4);
	
	/**
	* Constructor for CmnDateIbmUsaStdIn
	**/
    public CmnDateIbmUsaStdIn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateIbmUsaStdIn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateIbmUsaStdIn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateIbmUsaStdInMm
	 *	@return cmnDateIbmUsaStdInMm
	 */
   public char[] getCmnDateIbmUsaStdInMm() throws CFException{
     if (isCmnDateIbmUsaStdInMmModified()) { 
        cmnDateIbmUsaStdInMm = refreshCmnDateIbmUsaStdInMm();
     }
   		return cmnDateIbmUsaStdInMm;
   }

  
	/**
	*  set variable cmnDateIbmUsaStdInMm
	*  Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN-MM
	*  @param value
	**/
   public void setCmnDateIbmUsaStdInMm(char[] value) {
      cmnDateIbmUsaStdInMm = checkCmnDateIbmUsaStdInMmConstraints(value);
      serializeCmnDateIbmUsaStdInMm(cmnDateIbmUsaStdInMm);
   } 

     /**
	 * 	Update CmnDateIbmUsaStdInMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateIbmUsaStdInMm,cmnDateIbmUsaStdInMm.length);
   	
   }
   
   public void setCmnDateIbmUsaStdInMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInMm,cmnDateIbmUsaStdInMm.length);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdInMm with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInMm(Field source) {
       replace(source,0,source.length(),beginCmnDateIbmUsaStdInMm,CMN_DATE_IBM_USA_STD_IN_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdInMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInMm,CMN_DATE_IBM_USA_STD_IN_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateIbmUsaStdInSep1
	 *	@return cmnDateIbmUsaStdInSep1
	 */
   public char[] getCmnDateIbmUsaStdInSep1() throws CFException{
     if (isCmnDateIbmUsaStdInSep1Modified()) { 
        cmnDateIbmUsaStdInSep1 = refreshCmnDateIbmUsaStdInSep1();
     }
   		return cmnDateIbmUsaStdInSep1;
   }

  
	/**
	*  set variable cmnDateIbmUsaStdInSep1
	*  Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN-SEP1
	*  @param value
	**/
   public void setCmnDateIbmUsaStdInSep1(char[] value) {
      cmnDateIbmUsaStdInSep1 = checkCmnDateIbmUsaStdInSep1Constraints(value);
      serializeCmnDateIbmUsaStdInSep1(cmnDateIbmUsaStdInSep1);
   } 

     /**
	 * 	Update CmnDateIbmUsaStdInSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateIbmUsaStdInSep1,cmnDateIbmUsaStdInSep1.length);
   	
   }
   
   public void setCmnDateIbmUsaStdInSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep1,cmnDateIbmUsaStdInSep1.length);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdInSep1 with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep1(Field source) {
       replace(source,0,source.length(),beginCmnDateIbmUsaStdInSep1,CMN_DATE_IBM_USA_STD_IN_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep1,CMN_DATE_IBM_USA_STD_IN_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateIbmUsaStdInDd
	 *	@return cmnDateIbmUsaStdInDd
	 */
   public char[] getCmnDateIbmUsaStdInDd() throws CFException{
     if (isCmnDateIbmUsaStdInDdModified()) { 
        cmnDateIbmUsaStdInDd = refreshCmnDateIbmUsaStdInDd();
     }
   		return cmnDateIbmUsaStdInDd;
   }

  
	/**
	*  set variable cmnDateIbmUsaStdInDd
	*  Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN-DD
	*  @param value
	**/
   public void setCmnDateIbmUsaStdInDd(char[] value) {
      cmnDateIbmUsaStdInDd = checkCmnDateIbmUsaStdInDdConstraints(value);
      serializeCmnDateIbmUsaStdInDd(cmnDateIbmUsaStdInDd);
   } 

     /**
	 * 	Update CmnDateIbmUsaStdInDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateIbmUsaStdInDd,cmnDateIbmUsaStdInDd.length);
   	
   }
   
   public void setCmnDateIbmUsaStdInDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInDd,cmnDateIbmUsaStdInDd.length);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdInDd with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInDd(Field source) {
       replace(source,0,source.length(),beginCmnDateIbmUsaStdInDd,CMN_DATE_IBM_USA_STD_IN_DD_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdInDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInDd,CMN_DATE_IBM_USA_STD_IN_DD_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateIbmUsaStdInSep101
	 *	@return cmnDateIbmUsaStdInSep101
	 */
   public char[] getCmnDateIbmUsaStdInSep101() throws CFException{
     if (isCmnDateIbmUsaStdInSep101Modified()) { 
        cmnDateIbmUsaStdInSep101 = refreshCmnDateIbmUsaStdInSep101();
     }
   		return cmnDateIbmUsaStdInSep101;
   }

  
	/**
	*  set variable cmnDateIbmUsaStdInSep101
	*  Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN-SEP1
	*  @param value
	**/
   public void setCmnDateIbmUsaStdInSep101(char[] value) {
      cmnDateIbmUsaStdInSep101 = checkCmnDateIbmUsaStdInSep101Constraints(value);
      serializeCmnDateIbmUsaStdInSep101(cmnDateIbmUsaStdInSep101);
   } 

     /**
	 * 	Update CmnDateIbmUsaStdInSep101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep101(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateIbmUsaStdInSep101,cmnDateIbmUsaStdInSep101.length);
   	
   }
   
   public void setCmnDateIbmUsaStdInSep101(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep101,cmnDateIbmUsaStdInSep101.length);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep101+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdInSep101 with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep101(Field source) {
       replace(source,0,source.length(),beginCmnDateIbmUsaStdInSep101,CMN_DATE_IBM_USA_STD_IN_SEP_101_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep101(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep101,CMN_DATE_IBM_USA_STD_IN_SEP_101_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInSep101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInSep101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInSep101+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateIbmUsaStdInCcyy
	 *	@return cmnDateIbmUsaStdInCcyy
	 */
   public char[] getCmnDateIbmUsaStdInCcyy() throws CFException{
     if (isCmnDateIbmUsaStdInCcyyModified()) { 
        cmnDateIbmUsaStdInCcyy = refreshCmnDateIbmUsaStdInCcyy();
     }
   		return cmnDateIbmUsaStdInCcyy;
   }

  
	/**
	*  set variable cmnDateIbmUsaStdInCcyy
	*  Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN-CCYY
	*  @param value
	**/
   public void setCmnDateIbmUsaStdInCcyy(char[] value) {
      cmnDateIbmUsaStdInCcyy = checkCmnDateIbmUsaStdInCcyyConstraints(value);
      serializeCmnDateIbmUsaStdInCcyy(cmnDateIbmUsaStdInCcyy);
   } 

     /**
	 * 	Update CmnDateIbmUsaStdInCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateIbmUsaStdInCcyy,cmnDateIbmUsaStdInCcyy.length);
   	
   }
   
   public void setCmnDateIbmUsaStdInCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInCcyy,cmnDateIbmUsaStdInCcyy.length);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdInCcyy with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInCcyy(Field source) {
       replace(source,0,source.length(),beginCmnDateIbmUsaStdInCcyy,CMN_DATE_IBM_USA_STD_IN_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdInCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInCcyy,CMN_DATE_IBM_USA_STD_IN_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdInCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdInCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateIbmUsaStdInCcyy+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateIbmUsaStdInFieldLength() {
			return CMN_DATE_IBM_USA_STD_IN_LENGTH;
		}

}
  
