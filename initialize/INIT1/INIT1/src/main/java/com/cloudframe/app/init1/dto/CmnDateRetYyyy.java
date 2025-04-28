package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateRetYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateRetYyyy extends CmnDateRetYyyySerialized { 
   

						private char[] cmnDateRetCc = Field.fillLowValue(2);

						private char[] cmnDateRetYy = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnDateRetYyyy
	**/
    public CmnDateRetYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateRetYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateRetYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateRetCc
	 *	@return cmnDateRetCc
	 */
   public char[] getCmnDateRetCc() throws CFException{
     if (isCmnDateRetCcModified()) { 
        cmnDateRetCc = refreshCmnDateRetCc();
     }
   		return cmnDateRetCc;
   }

  
	/**
	*  set variable cmnDateRetCc
	*  Corresponding COBOL Variable is CMN-DATE-RET-CC
	*  @param value
	**/
   public void setCmnDateRetCc(char[] value) {
      cmnDateRetCc = checkCmnDateRetCcConstraints(value);
      serializeCmnDateRetCc(cmnDateRetCc);
   } 

     /**
	 * 	Update CmnDateRetCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetCc,cmnDateRetCc.length);
   	
   }
   
   public void setCmnDateRetCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetCc,cmnDateRetCc.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetCc with another Field
	 *	@param value
	 */
   public void setCmnDateRetCc(Field source) {
       replace(source,0,source.length(),beginCmnDateRetCc,CMN_DATE_RET_CC_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetCc,CMN_DATE_RET_CC_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetYy
	 *	@return cmnDateRetYy
	 */
   public char[] getCmnDateRetYy() throws CFException{
     if (isCmnDateRetYyModified()) { 
        cmnDateRetYy = refreshCmnDateRetYy();
     }
   		return cmnDateRetYy;
   }

  
	/**
	*  set variable cmnDateRetYy
	*  Corresponding COBOL Variable is CMN-DATE-RET-YY
	*  @param value
	**/
   public void setCmnDateRetYy(char[] value) {
      cmnDateRetYy = checkCmnDateRetYyConstraints(value);
      serializeCmnDateRetYy(cmnDateRetYy);
   } 

     /**
	 * 	Update CmnDateRetYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetYy,cmnDateRetYy.length);
   	
   }
   
   public void setCmnDateRetYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetYy,cmnDateRetYy.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetYy with another Field
	 *	@param value
	 */
   public void setCmnDateRetYy(Field source) {
       replace(source,0,source.length(),beginCmnDateRetYy,CMN_DATE_RET_YY_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetYy,CMN_DATE_RET_YY_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetYy+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateRetYyyyFieldLength() {
			return CMN_DATE_RET_YYYY_LENGTH;
		}

}
  
