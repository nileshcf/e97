package com.cloudframe.app.cfsort03.file.records;

/**
*  The class ClientsOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort03.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClientsOut extends ClientsOutSerialized {
   

						private char[] clientsOutString = Field.fillLowValue(80);
	
	/**
	* Constructor for ClientsOut
	**/
    public ClientsOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of clientsOutString
	 *	@return clientsOutString
	 */
   public char[] getClientsOutString() throws CFException{
     if (isClientsOutStringModified()) { 
        clientsOutString = refreshClientsOutString();
     }
   		return clientsOutString;
   }

  
	/**
	*  set variable clientsOutString
	*  Corresponding COBOL Variable is CLIENTS-OUT-STRING
	*  @param value
	**/
   public void setClientsOutString(char[] value) {
      clientsOutString = checkClientsOutStringConstraints(value);
      serializeClientsOutString(clientsOutString);
   } 

     /**
	 * 	Update ClientsOutString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientsOutString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClientsOutString,clientsOutString.length);
   	
   }
   
   public void setClientsOutString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClientsOutString,clientsOutString.length);
   	
   }
   
     /**
	 * 	Update ClientsOutString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientsOutString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientsOutString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClientsOutString with another Field
	 *	@param value
	 */
   public void setClientsOutString(Field source) {
       replace(source,0,source.length(),beginClientsOutString,CLIENTS_OUT_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ClientsOutString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientsOutString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClientsOutString,CLIENTS_OUT_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ClientsOutString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientsOutString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientsOutString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getClientsOutFieldLength() {
			return CLIENTS_OUT_LENGTH;
		}

}
  
