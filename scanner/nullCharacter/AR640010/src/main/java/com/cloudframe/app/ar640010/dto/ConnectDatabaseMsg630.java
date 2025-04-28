package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectDatabaseMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ConnectDatabaseMsg630 extends ConnectDatabaseMsg630Serialized {
   


						private char[] connectGftDbid630 = new char[8];


						private char[] connectUserDbid630 = new char[16];
	
	/**
	* Constructor for ConnectDatabaseMsg630
	**/
    public ConnectDatabaseMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3001-GFT DATABASE ID: ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setConnectGftDbid630(fillSpace(8));
       replaceValue( // serialize and save the value
             (" USER SERVER: ").toCharArray()
             , getStartOffset() + 30
             ,14
             );
								setConnectUserDbid630(fillSpace(16));
    }


 

	/**
	 *	Returns the value of connectGftDbid630
	 *	@return connectGftDbid630
	 */
   public char[] getConnectGftDbid630() throws CFException{
     if (isConnectGftDbid630Modified()) { 
        connectGftDbid630 = refreshConnectGftDbid630();
     }
   		return connectGftDbid630;
   }

  
	/**
	*  set variable connectGftDbid630
	*  Corresponding COBOL Variable is 630-CONNECT-GFT-DBID
	*  @param value
	**/
   public void setConnectGftDbid630(char[] value) {
      connectGftDbid630 = checkConnectGftDbid630Constraints(value);
      serializeConnectGftDbid630(connectGftDbid630);
   } 

     /**
	 * 	Update ConnectGftDbid630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConnectGftDbid630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConnectGftDbid630,connectGftDbid630.length);
   	
   }
   
   public void setConnectGftDbid630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbid630,connectGftDbid630.length);
   	
   }
   
     /**
	 * 	Update ConnectGftDbid630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConnectGftDbid630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbid630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConnectGftDbid630 with another Field
	 *	@param value
	 */
   public void setConnectGftDbid630(Field source) {
       replace(source,0,source.length(),beginConnectGftDbid630,CONNECT_GFT_DBID_630_LEN);
   	
   }  
   
     /**
	 * 	Update ConnectGftDbid630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConnectGftDbid630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConnectGftDbid630,CONNECT_GFT_DBID_630_LEN);
   	
   }
   
     /**
	 * 	Update ConnectGftDbid630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConnectGftDbid630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbid630+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of connectUserDbid630
	 *	@return connectUserDbid630
	 */
   public char[] getConnectUserDbid630() throws CFException{
     if (isConnectUserDbid630Modified()) { 
        connectUserDbid630 = refreshConnectUserDbid630();
     }
   		return connectUserDbid630;
   }

  
	/**
	*  set variable connectUserDbid630
	*  Corresponding COBOL Variable is 630-CONNECT-USER-DBID
	*  @param value
	**/
   public void setConnectUserDbid630(char[] value) {
      connectUserDbid630 = checkConnectUserDbid630Constraints(value);
      serializeConnectUserDbid630(connectUserDbid630);
   } 

     /**
	 * 	Update ConnectUserDbid630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConnectUserDbid630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConnectUserDbid630,connectUserDbid630.length);
   	
   }
   
   public void setConnectUserDbid630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbid630,connectUserDbid630.length);
   	
   }
   
     /**
	 * 	Update ConnectUserDbid630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConnectUserDbid630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbid630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConnectUserDbid630 with another Field
	 *	@param value
	 */
   public void setConnectUserDbid630(Field source) {
       replace(source,0,source.length(),beginConnectUserDbid630,CONNECT_USER_DBID_630_LEN);
   	
   }  
   
     /**
	 * 	Update ConnectUserDbid630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConnectUserDbid630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConnectUserDbid630,CONNECT_USER_DBID_630_LEN);
   	
   }
   
     /**
	 * 	Update ConnectUserDbid630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConnectUserDbid630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbid630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getConnectDatabaseMsg630FieldLength() {
			return CONNECT_DATABASE_MSG_630_LENGTH;
		}

}
  
