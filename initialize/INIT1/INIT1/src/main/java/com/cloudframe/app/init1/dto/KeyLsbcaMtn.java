package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyLsbcaMtn extends KeyLsbcaMtnSerialized { 
   

						private char[] lsbcaNpa = Field.fillLowValue(3);

						private char[] lsbcaNxx = Field.fillLowValue(3);

						private char[] lsbcaTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyLsbcaMtn
	**/
    public KeyLsbcaMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyLsbcaMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of lsbcaNpa
	 *	@return lsbcaNpa
	 */
   public char[] getLsbcaNpa() throws CFException{
     if (isLsbcaNpaModified()) { 
        lsbcaNpa = refreshLsbcaNpa();
     }
   		return lsbcaNpa;
   }

  
	/**
	*  set variable lsbcaNpa
	*  Corresponding COBOL Variable is WS-LSBCA-NPA
	*  @param value
	**/
   public void setLsbcaNpa(char[] value) {
      lsbcaNpa = checkLsbcaNpaConstraints(value);
      serializeLsbcaNpa(lsbcaNpa);
   } 

     /**
	 * 	Update LsbcaNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaNpa,lsbcaNpa.length);
   	
   }
   
   public void setLsbcaNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNpa,lsbcaNpa.length);
   	
   }
   
     /**
	 * 	Update LsbcaNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaNpa with another Field
	 *	@param value
	 */
   public void setLsbcaNpa(Field source) {
       replace(source,0,source.length(),beginLsbcaNpa,LSBCA_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaNpa,LSBCA_NPA_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaNxx
	 *	@return lsbcaNxx
	 */
   public char[] getLsbcaNxx() throws CFException{
     if (isLsbcaNxxModified()) { 
        lsbcaNxx = refreshLsbcaNxx();
     }
   		return lsbcaNxx;
   }

  
	/**
	*  set variable lsbcaNxx
	*  Corresponding COBOL Variable is WS-LSBCA-NXX
	*  @param value
	**/
   public void setLsbcaNxx(char[] value) {
      lsbcaNxx = checkLsbcaNxxConstraints(value);
      serializeLsbcaNxx(lsbcaNxx);
   } 

     /**
	 * 	Update LsbcaNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaNxx,lsbcaNxx.length);
   	
   }
   
   public void setLsbcaNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNxx,lsbcaNxx.length);
   	
   }
   
     /**
	 * 	Update LsbcaNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaNxx with another Field
	 *	@param value
	 */
   public void setLsbcaNxx(Field source) {
       replace(source,0,source.length(),beginLsbcaNxx,LSBCA_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaNxx,LSBCA_NXX_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaTln
	 *	@return lsbcaTln
	 */
   public char[] getLsbcaTln() throws CFException{
     if (isLsbcaTlnModified()) { 
        lsbcaTln = refreshLsbcaTln();
     }
   		return lsbcaTln;
   }

  
	/**
	*  set variable lsbcaTln
	*  Corresponding COBOL Variable is WS-LSBCA-TLN
	*  @param value
	**/
   public void setLsbcaTln(char[] value) {
      lsbcaTln = checkLsbcaTlnConstraints(value);
      serializeLsbcaTln(lsbcaTln);
   } 

     /**
	 * 	Update LsbcaTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaTln,lsbcaTln.length);
   	
   }
   
   public void setLsbcaTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaTln,lsbcaTln.length);
   	
   }
   
     /**
	 * 	Update LsbcaTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaTln with another Field
	 *	@param value
	 */
   public void setLsbcaTln(Field source) {
       replace(source,0,source.length(),beginLsbcaTln,LSBCA_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaTln,LSBCA_TLN_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes KeyLsbcaMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLsbcaNpa(CONSTANTS.SPACE_3);
         setLsbcaNxx(CONSTANTS.SPACE_3);
         setLsbcaTln(CONSTANTS.SPACE_4);
   }

		public static int getKeyLsbcaMtnFieldLength() {
			return KEY_LSBCA_MTN_LENGTH;
		}

}
  
