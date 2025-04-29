package com.cloudframe.app.ip989010.dto;

/**
*  The class RegistrationFileData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RegistrationFileData500 extends RegistrationFileData500Serialized { 
   

						private char[] panAlias500 = Field.fillLowValue(36);
	
	/**
	* Constructor for RegistrationFileData500
	**/
    public RegistrationFileData500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RegistrationFileData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RegistrationFileData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of panAlias500
	 *	@return panAlias500
	 */
   public char[] getPanAlias500() throws CFException{
     if (isPanAlias500Modified()) { 
        panAlias500 = refreshPanAlias500();
     }
   		return panAlias500;
   }

  
	/**
	*  set variable panAlias500
	*  Corresponding COBOL Variable is 500-PAN-ALIAS
	*  @param value
	**/
   public void setPanAlias500(char[] value) {
      panAlias500 = checkPanAlias500Constraints(value);
      serializePanAlias500(panAlias500);
   } 

     /**
	 * 	Update PanAlias500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanAlias500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanAlias500,panAlias500.length);
   	
   }
   
   public void setPanAlias500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias500,panAlias500.length);
   	
   }
   
     /**
	 * 	Update PanAlias500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanAlias500 with another Field
	 *	@param value
	 */
   public void setPanAlias500(Field source) {
       replace(source,0,source.length(),beginPanAlias500,PAN_ALIAS_500_LEN);
   	
   }  
   
     /**
	 * 	Update PanAlias500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanAlias500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanAlias500,PAN_ALIAS_500_LEN);
   	
   }
   
     /**
	 * 	Update PanAlias500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRegistrationFileData500FieldLength() {
			return REGISTRATION_FILE_DATA_500_LENGTH;
		}

}
  
