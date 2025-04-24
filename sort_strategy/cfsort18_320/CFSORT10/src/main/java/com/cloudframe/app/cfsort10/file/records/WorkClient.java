package com.cloudframe.app.cfsort10.file.records;

/**
*  The class WorkClient is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:33. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort10.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkClient extends WorkClientSerialized { 
   

						private char[] clientNameWk = Field.fillLowValue(20);

						private char[] clientNumberWk = Field.fillLowValue(7);

						private char[] clientPhNoWk = Field.fillLowValue(14);
	
	/**
	* Constructor for WorkClient
	**/
    public WorkClient() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of clientNameWk
	 *	@return clientNameWk
	 */
   public char[] getClientNameWk() throws CFException{
     if (isClientNameWkModified()) { 
        clientNameWk = refreshClientNameWk();
     }
   		return clientNameWk;
   }

  
	/**
	*  set variable clientNameWk
	*  Corresponding COBOL Variable is CLIENT-NAME-WK
	*  @param value
	**/
   public void setClientNameWk(char[] value) {
      clientNameWk = checkClientNameWkConstraints(value);
      serializeClientNameWk(clientNameWk);
   } 

     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClientNameWk,clientNameWk.length);
   	
   }
   
   public void setClientNameWk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClientNameWk,clientNameWk.length);
   	
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNameWk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClientNameWk with another Field
	 *	@param value
	 */
   public void setClientNameWk(Field source) {
       replace(source,0,source.length(),beginClientNameWk,CLIENT_NAME_WK_LEN);
   	
   }  
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClientNameWk,CLIENT_NAME_WK_LEN);
   	
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNameWk+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clientNumberWk
	 *	@return clientNumberWk
	 */
   public char[] getClientNumberWk() throws CFException{
     if (isClientNumberWkModified()) { 
        clientNumberWk = refreshClientNumberWk();
     }
   		return clientNumberWk;
   }

  
	/**
	*  set variable clientNumberWk
	*  Corresponding COBOL Variable is CLIENT-NUMBER-WK
	*  @param value
	**/
   public void setClientNumberWk(char[] value) {
      clientNumberWk = checkClientNumberWkConstraints(value);
      serializeClientNumberWk(clientNumberWk);
   } 

     /**
	 * 	Update ClientNumberWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNumberWk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClientNumberWk,clientNumberWk.length);
   	
   }
   
   public void setClientNumberWk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClientNumberWk,clientNumberWk.length);
   	
   }
   
     /**
	 * 	Update ClientNumberWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNumberWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNumberWk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClientNumberWk with another Field
	 *	@param value
	 */
   public void setClientNumberWk(Field source) {
       replace(source,0,source.length(),beginClientNumberWk,CLIENT_NUMBER_WK_LEN);
   	
   }  
   
     /**
	 * 	Update ClientNumberWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNumberWk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClientNumberWk,CLIENT_NUMBER_WK_LEN);
   	
   }
   
     /**
	 * 	Update ClientNumberWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNumberWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNumberWk+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clientPhNoWk
	 *	@return clientPhNoWk
	 */
   public char[] getClientPhNoWk() throws CFException{
     if (isClientPhNoWkModified()) { 
        clientPhNoWk = refreshClientPhNoWk();
     }
   		return clientPhNoWk;
   }

  
	/**
	*  set variable clientPhNoWk
	*  Corresponding COBOL Variable is CLIENT-PH-NO-WK
	*  @param value
	**/
   public void setClientPhNoWk(char[] value) {
      clientPhNoWk = checkClientPhNoWkConstraints(value);
      serializeClientPhNoWk(clientPhNoWk);
   } 

     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClientPhNoWk,clientPhNoWk.length);
   	
   }
   
   public void setClientPhNoWk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClientPhNoWk,clientPhNoWk.length);
   	
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientPhNoWk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClientPhNoWk with another Field
	 *	@param value
	 */
   public void setClientPhNoWk(Field source) {
       replace(source,0,source.length(),beginClientPhNoWk,CLIENT_PH_NO_WK_LEN);
   	
   }  
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClientPhNoWk,CLIENT_PH_NO_WK_LEN);
   	
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientPhNoWk+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkClientFieldLength() {
			return WORK_CLIENT_LENGTH;
		}

}
  
