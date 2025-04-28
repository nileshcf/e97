package com.cloudframe.app.bm8090m.dto;

/**
*  The class WPrimLetra is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WPrimLetra extends WPrimLetraSerialized {
   

						private char[] wLetra = new char[1];

	
	/**
	* Constructor for WPrimLetra
	**/
    public WPrimLetra() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWLetra(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(19)
             , getStartOffset() + 1
             ,19
             );
    }


 

	/**
	 *	Returns the value of wLetra
	 *	@return wLetra
	 */
   public char[] getWLetra() throws CFException{
     if (isWLetraModified()) { 
        wLetra = refreshWLetra();
     }
   		return wLetra;
   }

  
	/**
	*  set variable wLetra
	*  Corresponding COBOL Variable is W-LETRA
	*  @param value
	**/
   public void setWLetra(char[] value) {
      wLetra = checkWLetraConstraints(value);
      serializeWLetra(wLetra);
   } 

     /**
	 * 	Update WLetra 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWLetra(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWLetra,wLetra.length);
   	
   }
   
   public void setWLetra(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWLetra,wLetra.length);
   	
   }
   
     /**
	 * 	Update WLetra 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWLetra(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWLetra+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WLetra with another Field
	 *	@param value
	 */
   public void setWLetra(Field source) {
       replace(source,0,source.length(),beginWLetra,W_LETRA_LEN);
   	
   }  
   
     /**
	 * 	Update WLetra 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWLetra(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWLetra,W_LETRA_LEN);
   	
   }
   
     /**
	 * 	Update WLetra 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWLetra(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWLetra+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWPrimLetraFieldLength() {
			return W_PRIM_LETRA_LENGTH;
		}

}
  
