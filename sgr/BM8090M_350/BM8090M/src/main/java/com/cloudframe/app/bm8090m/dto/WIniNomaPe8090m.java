package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomaPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WIniNomaPe8090m extends WIniNomaPe8090mSerialized { 
   

						private char[] wIni1NomPe8090m = Field.fillLowValue(1);

	
	/**
	* Constructor for WIniNomaPe8090m
	**/
    public WIniNomaPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WIniNomaPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomaPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wIni1NomPe8090m
	 *	@return wIni1NomPe8090m
	 */
   public char[] getWIni1NomPe8090m() throws CFException{
     if (isWIni1NomPe8090mModified()) { 
        wIni1NomPe8090m = refreshWIni1NomPe8090m();
     }
   		return wIni1NomPe8090m;
   }

  
	/**
	*  set variable wIni1NomPe8090m
	*  Corresponding COBOL Variable is W-INI1-NOM-PE8090M
	*  @param value
	**/
   public void setWIni1NomPe8090m(char[] value) {
      wIni1NomPe8090m = checkWIni1NomPe8090mConstraints(value);
      serializeWIni1NomPe8090m(wIni1NomPe8090m);
   } 

     /**
	 * 	Update WIni1NomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIni1NomPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWIni1NomPe8090m,wIni1NomPe8090m.length);
   	
   }
   
   public void setWIni1NomPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWIni1NomPe8090m,wIni1NomPe8090m.length);
   	
   }
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIni1NomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIni1NomPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WIni1NomPe8090m with another Field
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source) {
       replace(source,0,source.length(),beginWIni1NomPe8090m,W_INI_1_NOM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWIni1NomPe8090m,W_INI_1_NOM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIni1NomPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WIniNomaPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWIni1NomPe8090m(CONSTANTS.SPACE);
   }

		public static int getWIniNomaPe8090mFieldLength() {
			return W_INI_NOMA_PE_8090M_LENGTH;
		}

}
  
