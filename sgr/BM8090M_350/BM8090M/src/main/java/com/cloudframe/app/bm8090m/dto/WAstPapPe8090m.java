package com.cloudframe.app.bm8090m.dto;

/**
*  The class WAstPapPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WAstPapPe8090m extends WAstPapPe8090mSerialized { 
   

						private char[] wAstPe8090m = Field.fillLowValue(1);

						private char[] wPapPe8090m = Field.fillLowValue(19);
	
	/**
	* Constructor for WAstPapPe8090m
	**/
    public WAstPapPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WAstPapPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstPapPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wAstPe8090m
	 *	@return wAstPe8090m
	 */
   public char[] getWAstPe8090m() throws CFException{
     if (isWAstPe8090mModified()) { 
        wAstPe8090m = refreshWAstPe8090m();
     }
   		return wAstPe8090m;
   }

  
	/**
	*  set variable wAstPe8090m
	*  Corresponding COBOL Variable is W-AST-PE8090M
	*  @param value
	**/
   public void setWAstPe8090m(char[] value) {
      wAstPe8090m = checkWAstPe8090mConstraints(value);
      serializeWAstPe8090m(wAstPe8090m);
   } 

     /**
	 * 	Update WAstPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWAstPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWAstPe8090m,wAstPe8090m.length);
   	
   }
   
   public void setWAstPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWAstPe8090m,wAstPe8090m.length);
   	
   }
   
     /**
	 * 	Update WAstPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWAstPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWAstPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WAstPe8090m with another Field
	 *	@param value
	 */
   public void setWAstPe8090m(Field source) {
       replace(source,0,source.length(),beginWAstPe8090m,W_AST_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WAstPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWAstPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWAstPe8090m,W_AST_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WAstPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWAstPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWAstPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wPapPe8090m
	 *	@return wPapPe8090m
	 */
   public char[] getWPapPe8090m() throws CFException{
     if (isWPapPe8090mModified()) { 
        wPapPe8090m = refreshWPapPe8090m();
     }
   		return wPapPe8090m;
   }

  
	/**
	*  set variable wPapPe8090m
	*  Corresponding COBOL Variable is W-PAP-PE8090M
	*  @param value
	**/
   public void setWPapPe8090m(char[] value) {
      wPapPe8090m = checkWPapPe8090mConstraints(value);
      serializeWPapPe8090m(wPapPe8090m);
   } 

     /**
	 * 	Update WPapPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPapPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPapPe8090m,wPapPe8090m.length);
   	
   }
   
   public void setWPapPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPapPe8090m,wPapPe8090m.length);
   	
   }
   
     /**
	 * 	Update WPapPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPapPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPapPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPapPe8090m with another Field
	 *	@param value
	 */
   public void setWPapPe8090m(Field source) {
       replace(source,0,source.length(),beginWPapPe8090m,W_PAP_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WPapPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPapPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPapPe8090m,W_PAP_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WPapPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPapPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPapPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WAstPapPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWAstPe8090m(CONSTANTS.SPACE);
         setWPapPe8090m(CONSTANTS.SPACE_19);
   }

		public static int getWAstPapPe8090mFieldLength() {
			return W_AST_PAP_PE_8090M_LENGTH;
		}

}
  
