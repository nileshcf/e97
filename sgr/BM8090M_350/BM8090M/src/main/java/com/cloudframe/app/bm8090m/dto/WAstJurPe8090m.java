package com.cloudframe.app.bm8090m.dto;

/**
*  The class WAstJurPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WAstJurPe8090m extends WAstJurPe8090mSerialized { 
   

						private char[] wEstPe8090m = Field.fillLowValue(1);

						private char[] wJurPe8090m = Field.fillLowValue(59);
	
	/**
	* Constructor for WAstJurPe8090m
	**/
    public WAstJurPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WAstJurPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstJurPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wEstPe8090m
	 *	@return wEstPe8090m
	 */
   public char[] getWEstPe8090m() throws CFException{
     if (isWEstPe8090mModified()) { 
        wEstPe8090m = refreshWEstPe8090m();
     }
   		return wEstPe8090m;
   }

  
	/**
	*  set variable wEstPe8090m
	*  Corresponding COBOL Variable is W-EST-PE8090M
	*  @param value
	**/
   public void setWEstPe8090m(char[] value) {
      wEstPe8090m = checkWEstPe8090mConstraints(value);
      serializeWEstPe8090m(wEstPe8090m);
   } 

     /**
	 * 	Update WEstPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWEstPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWEstPe8090m,wEstPe8090m.length);
   	
   }
   
   public void setWEstPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWEstPe8090m,wEstPe8090m.length);
   	
   }
   
     /**
	 * 	Update WEstPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWEstPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWEstPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WEstPe8090m with another Field
	 *	@param value
	 */
   public void setWEstPe8090m(Field source) {
       replace(source,0,source.length(),beginWEstPe8090m,W_EST_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WEstPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWEstPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWEstPe8090m,W_EST_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WEstPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWEstPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWEstPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wJurPe8090m
	 *	@return wJurPe8090m
	 */
   public char[] getWJurPe8090m() throws CFException{
     if (isWJurPe8090mModified()) { 
        wJurPe8090m = refreshWJurPe8090m();
     }
   		return wJurPe8090m;
   }

  
	/**
	*  set variable wJurPe8090m
	*  Corresponding COBOL Variable is W-JUR-PE8090M
	*  @param value
	**/
   public void setWJurPe8090m(char[] value) {
      wJurPe8090m = checkWJurPe8090mConstraints(value);
      serializeWJurPe8090m(wJurPe8090m);
   } 

     /**
	 * 	Update WJurPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWJurPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWJurPe8090m,wJurPe8090m.length);
   	
   }
   
   public void setWJurPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWJurPe8090m,wJurPe8090m.length);
   	
   }
   
     /**
	 * 	Update WJurPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWJurPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWJurPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WJurPe8090m with another Field
	 *	@param value
	 */
   public void setWJurPe8090m(Field source) {
       replace(source,0,source.length(),beginWJurPe8090m,W_JUR_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WJurPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWJurPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWJurPe8090m,W_JUR_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WJurPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWJurPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWJurPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WAstJurPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWEstPe8090m(CONSTANTS.SPACE);
         setWJurPe8090m(CONSTANTS.SPACE_59);
   }

		public static int getWAstJurPe8090mFieldLength() {
			return W_AST_JUR_PE_8090M_LENGTH;
		}

}
  
