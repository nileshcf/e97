package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectErrorMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ConnectErrorMsg630 extends ConnectErrorMsg630Serialized {
   



						private char[] connectResponse630 = new char[4];
	
	/**
	* Constructor for ConnectErrorMsg630
	**/
    public ConnectErrorMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3000-CANNOT CONNECT TO GFT DATABASE").toCharArray()
             , getStartOffset() + 0
             ,35
             );
       replaceValue( // serialize and save the value
             (", RESPONSE CODE: ").toCharArray()
             , getStartOffset() + 35
             ,17
             );
								setConnectResponse630(String.join("", java.util.Collections.nCopies(4, "?")).toCharArray());
    }


 

	/**
	 *	Returns the value of connectResponse630
	 *	@return connectResponse630
	 */
   public char[] getConnectResponse630() throws CFException{
     if (isConnectResponse630Modified()) { 
        connectResponse630 = refreshConnectResponse630();
     }
   		return connectResponse630;
   }

  
	/**
	*  set variable connectResponse630
	*  Corresponding COBOL Variable is 630-CONNECT-RESPONSE
	*  @param value
	**/
   public void setConnectResponse630(char[] value) {
      connectResponse630 = checkConnectResponse630Constraints(value);
      serializeConnectResponse630(connectResponse630);
   } 

     /**
	 * 	Update ConnectResponse630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConnectResponse630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConnectResponse630,connectResponse630.length);
   	
   }
   
   public void setConnectResponse630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConnectResponse630,connectResponse630.length);
   	
   }
   
     /**
	 * 	Update ConnectResponse630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConnectResponse630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectResponse630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConnectResponse630 with another Field
	 *	@param value
	 */
   public void setConnectResponse630(Field source) {
       replace(source,0,source.length(),beginConnectResponse630,CONNECT_RESPONSE_630_LEN);
   	
   }  
   
     /**
	 * 	Update ConnectResponse630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConnectResponse630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConnectResponse630,CONNECT_RESPONSE_630_LEN);
   	
   }
   
     /**
	 * 	Update ConnectResponse630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConnectResponse630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectResponse630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getConnectErrorMsg630FieldLength() {
			return CONNECT_ERROR_MSG_630_LENGTH;
		}

}
  
