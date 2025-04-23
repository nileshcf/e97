package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomrPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WIniNomrPe8090m extends WIniNomrPe8090mSerialized { 
   

						private char[] wIni2NomPe8090m = Field.fillLowValue(2);

	
	/**
	* Constructor for WIniNomrPe8090m
	**/
    public WIniNomrPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WIniNomrPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomrPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wIni2NomPe8090m
	 *	@return wIni2NomPe8090m
	 */
   public char[] getWIni2NomPe8090m() throws CFException{
     if (isWIni2NomPe8090mModified()) { 
        wIni2NomPe8090m = refreshWIni2NomPe8090m();
     }
   		return wIni2NomPe8090m;
   }

  
	/**
	*  set variable wIni2NomPe8090m
	*  Corresponding COBOL Variable is W-INI2-NOM-PE8090M
	*  @param value
	**/
   public void setWIni2NomPe8090m(char[] value) {
      wIni2NomPe8090m = checkWIni2NomPe8090mConstraints(value);
      serializeWIni2NomPe8090m(wIni2NomPe8090m);
   } 

     /**
	 * 	Update WIni2NomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIni2NomPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWIni2NomPe8090m,wIni2NomPe8090m.length);
   	
   }
   
   public void setWIni2NomPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWIni2NomPe8090m,wIni2NomPe8090m.length);
   	
   }
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIni2NomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIni2NomPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WIni2NomPe8090m with another Field
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source) {
       replace(source,0,source.length(),beginWIni2NomPe8090m,W_INI_2_NOM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWIni2NomPe8090m,W_INI_2_NOM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIni2NomPe8090m+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWIniNomrPe8090mFieldLength() {
			return W_INI_NOMR_PE_8090M_LENGTH;
		}

}
  
