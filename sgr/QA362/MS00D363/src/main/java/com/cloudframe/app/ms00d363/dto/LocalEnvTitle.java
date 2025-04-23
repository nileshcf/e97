package com.cloudframe.app.ms00d363.dto;

/**
*  The class LocalEnvTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LocalEnvTitle extends LocalEnvTitleSerialized {
   

						private char[] localEnviron = Field.fillLowValue(14);

	
	/**
	* Constructor for LocalEnvTitle
	**/
    public LocalEnvTitle() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 14
             ,14
             );
    }


 

	/**
	 *	Returns the value of localEnviron
	 *	@return localEnviron
	 */
   public char[] getLocalEnviron() throws CFException{
     if (isLocalEnvironModified()) { 
        localEnviron = refreshLocalEnviron();
     }
   		return localEnviron;
   }

  
	/**
	*  set variable localEnviron
	*  Corresponding COBOL Variable is LOCAL-ENVIRON
	*  @param value
	**/
   public void setLocalEnviron(char[] value) {
      localEnviron = checkLocalEnvironConstraints(value);
      serializeLocalEnviron(localEnviron);
   } 

     /**
	 * 	Update LocalEnviron 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLocalEnviron(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLocalEnviron,localEnviron.length);
   	
   }
   
   public void setLocalEnviron(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnviron,localEnviron.length);
   	
   }
   
     /**
	 * 	Update LocalEnviron 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLocalEnviron(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnviron+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LocalEnviron with another Field
	 *	@param value
	 */
   public void setLocalEnviron(Field source) {
       replace(source,0,source.length(),beginLocalEnviron,LOCAL_ENVIRON_LEN);
   	
   }  
   
     /**
	 * 	Update LocalEnviron 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLocalEnviron(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLocalEnviron,LOCAL_ENVIRON_LEN);
   	
   }
   
     /**
	 * 	Update LocalEnviron 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLocalEnviron(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnviron+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLocalEnvTitleFieldLength() {
			return LOCAL_ENV_TITLE_LENGTH;
		}

}
  
