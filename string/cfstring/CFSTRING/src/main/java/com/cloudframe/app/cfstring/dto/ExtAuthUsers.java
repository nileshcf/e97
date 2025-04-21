package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtAuthUsers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtAuthUsers extends ExtAuthUsersSerialized { 
   

						private char[] extAuthUsrLname = Field.fillLowValue(25);

						private char[] extAuthUsrFname = Field.fillLowValue(20);
	
	/**
	* Constructor for ExtAuthUsers
	**/
    public ExtAuthUsers() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtAuthUsers. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtAuthUsers(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of extAuthUsrLname
	 *	@return extAuthUsrLname
	 */
   public char[] getExtAuthUsrLname() throws CFException{
     if (isExtAuthUsrLnameModified()) { 
        extAuthUsrLname = refreshExtAuthUsrLname();
     }
   		return extAuthUsrLname;
   }

  
	/**
	*  set variable extAuthUsrLname
	*  Corresponding COBOL Variable is WS-EXT-AUTH-USR-LNAME
	*  @param value
	**/
   public void setExtAuthUsrLname(char[] value) {
      extAuthUsrLname = checkExtAuthUsrLnameConstraints(value);
      serializeExtAuthUsrLname(extAuthUsrLname);
   } 

     /**
	 * 	Update ExtAuthUsrLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAuthUsrLname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtAuthUsrLname,extAuthUsrLname.length);
   	
   }
   
   public void setExtAuthUsrLname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrLname,extAuthUsrLname.length);
   	
   }
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrLname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrLname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtAuthUsrLname with another Field
	 *	@param value
	 */
   public void setExtAuthUsrLname(Field source) {
       replace(source,0,source.length(),beginExtAuthUsrLname,EXT_AUTH_USR_LNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAuthUsrLname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtAuthUsrLname,EXT_AUTH_USR_LNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrLname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrLname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extAuthUsrFname
	 *	@return extAuthUsrFname
	 */
   public char[] getExtAuthUsrFname() throws CFException{
     if (isExtAuthUsrFnameModified()) { 
        extAuthUsrFname = refreshExtAuthUsrFname();
     }
   		return extAuthUsrFname;
   }

  
	/**
	*  set variable extAuthUsrFname
	*  Corresponding COBOL Variable is WS-EXT-AUTH-USR-FNAME
	*  @param value
	**/
   public void setExtAuthUsrFname(char[] value) {
      extAuthUsrFname = checkExtAuthUsrFnameConstraints(value);
      serializeExtAuthUsrFname(extAuthUsrFname);
   } 

     /**
	 * 	Update ExtAuthUsrFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAuthUsrFname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtAuthUsrFname,extAuthUsrFname.length);
   	
   }
   
   public void setExtAuthUsrFname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrFname,extAuthUsrFname.length);
   	
   }
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrFname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrFname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtAuthUsrFname with another Field
	 *	@param value
	 */
   public void setExtAuthUsrFname(Field source) {
       replace(source,0,source.length(),beginExtAuthUsrFname,EXT_AUTH_USR_FNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAuthUsrFname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtAuthUsrFname,EXT_AUTH_USR_FNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrFname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAuthUsrFname+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtAuthUsersFieldLength() {
			return EXT_AUTH_USERS_LENGTH;
		}

}
  
