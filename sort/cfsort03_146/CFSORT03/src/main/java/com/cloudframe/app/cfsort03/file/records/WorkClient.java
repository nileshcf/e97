package com.cloudframe.app.cfsort03.file.records;

/**
*  The class WorkClient is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort03.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkClient extends WorkClientSerialized {
   

						private char[] clientNumberWk = Field.fillLowValue(7);
	
	/**
	* Constructor for WorkClient
	**/
    public WorkClient() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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

	
	
	

		public static int getWorkClientFieldLength() {
			return WORK_CLIENT_LENGTH;
		}

}
  
