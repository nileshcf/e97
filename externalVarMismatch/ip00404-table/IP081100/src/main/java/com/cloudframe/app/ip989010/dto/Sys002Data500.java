package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys002Data500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys002Data500 extends Sys002Data500Serialized { 
   
				private RegistrationFileData500 registrationFileData500 = new RegistrationFileData500();
	
	/**
	* Constructor for Sys002Data500
	**/
    public Sys002Data500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys002Data500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys002Data500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			registrationFileData500.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of registrationFileData500
	 *	@return registrationFileData500
	 */   
	 public RegistrationFileData500 getRegistrationFileData500() {
   	return registrationFileData500;
   }
   /**
	* 	Update RegistrationFileData500 with the passed value
	*   Corresponding COBOL Variable is 500-REGISTRATION-FILE-DATA
	*	@param value
	*/
   public void setRegistrationFileData500(char[] value) {
      registrationFileData500.setString(value); 
   }   
    
     /**
	 * 	Update RegistrationFileData500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRegistrationFileData500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,registrationFileData500.begin,registrationFileData500.length());
   }
   
     /**
	 * 	Update RegistrationFileData500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRegistrationFileData500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,registrationFileData500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RegistrationFileData500 with another Field
	 *	@param value
	 */
   public void setRegistrationFileData500(Field source) {
   	replace(source,0,source.length(),registrationFileData500.begin,registrationFileData500.length());
   }  
   
     /**
	 * 	Update RegistrationFileData500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRegistrationFileData500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,registrationFileData500.begin,registrationFileData500.length());
   }
   
     /**
	 * 	Update RegistrationFileData500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRegistrationFileData500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,registrationFileData500.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys002Data500FieldLength() {
			return SYS_002_DATA_500_LENGTH;
		}

}
  
