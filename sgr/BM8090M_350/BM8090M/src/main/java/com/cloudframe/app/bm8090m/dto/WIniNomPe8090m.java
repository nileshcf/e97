package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WIniNomPe8090m extends WIniNomPe8090mSerialized { 
   

						private char[] wIniPe8090m = Field.fillLowValue(1);

	
	/**
	* Constructor for WIniNomPe8090m
	**/
    public WIniNomPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WIniNomPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wIniPe8090m
	 *	@return wIniPe8090m
	 */
   public char[] getWIniPe8090m() throws CFException{
     if (isWIniPe8090mModified()) { 
        wIniPe8090m = refreshWIniPe8090m();
     }
   		return wIniPe8090m;
   }

  
	/**
	*  set variable wIniPe8090m
	*  Corresponding COBOL Variable is W-INI-PE8090M
	*  @param value
	**/
   public void setWIniPe8090m(char[] value) {
      wIniPe8090m = checkWIniPe8090mConstraints(value);
      serializeWIniPe8090m(wIniPe8090m);
   } 

     /**
	 * 	Update WIniPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIniPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWIniPe8090m,wIniPe8090m.length);
   	
   }
   
   public void setWIniPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWIniPe8090m,wIniPe8090m.length);
   	
   }
   
     /**
	 * 	Update WIniPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIniPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIniPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WIniPe8090m with another Field
	 *	@param value
	 */
   public void setWIniPe8090m(Field source) {
       replace(source,0,source.length(),beginWIniPe8090m,W_INI_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WIniPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIniPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWIniPe8090m,W_INI_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WIniPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIniPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIniPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WIniNomPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWIniPe8090m(CONSTANTS.SPACE);
   }

		public static int getWIniNomPe8090mFieldLength() {
			return W_INI_NOM_PE_8090M_LENGTH;
		}

}
  
