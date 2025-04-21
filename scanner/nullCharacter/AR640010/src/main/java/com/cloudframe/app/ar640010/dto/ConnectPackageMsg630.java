package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectPackageMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ConnectPackageMsg630 extends ConnectPackageMsg630Serialized {
   


						private char[] connectGftDbpkg630 = new char[18];


						private char[] connectUserDbpkg630 = new char[18];
	
	/**
	* Constructor for ConnectPackageMsg630
	**/
    public ConnectPackageMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3002-GFT PACKAGE SET: ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setConnectGftDbpkg630(fillSpace(18));
       replaceValue( // serialize and save the value
             (" USER PACKAGE SET: ").toCharArray()
             , getStartOffset() + 40
             ,19
             );
								setConnectUserDbpkg630(fillSpace(18));
    }


 

	/**
	 *	Returns the value of connectGftDbpkg630
	 *	@return connectGftDbpkg630
	 */
   public char[] getConnectGftDbpkg630() throws CFException{
     if (isConnectGftDbpkg630Modified()) { 
        connectGftDbpkg630 = refreshConnectGftDbpkg630();
     }
   		return connectGftDbpkg630;
   }

  
	/**
	*  set variable connectGftDbpkg630
	*  Corresponding COBOL Variable is 630-CONNECT-GFT-DBPKG
	*  @param value
	**/
   public void setConnectGftDbpkg630(char[] value) {
      connectGftDbpkg630 = checkConnectGftDbpkg630Constraints(value);
      serializeConnectGftDbpkg630(connectGftDbpkg630);
   } 

     /**
	 * 	Update ConnectGftDbpkg630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConnectGftDbpkg630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConnectGftDbpkg630,connectGftDbpkg630.length);
   	
   }
   
   public void setConnectGftDbpkg630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbpkg630,connectGftDbpkg630.length);
   	
   }
   
     /**
	 * 	Update ConnectGftDbpkg630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConnectGftDbpkg630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbpkg630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConnectGftDbpkg630 with another Field
	 *	@param value
	 */
   public void setConnectGftDbpkg630(Field source) {
       replace(source,0,source.length(),beginConnectGftDbpkg630,CONNECT_GFT_DBPKG_630_LEN);
   	
   }  
   
     /**
	 * 	Update ConnectGftDbpkg630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConnectGftDbpkg630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConnectGftDbpkg630,CONNECT_GFT_DBPKG_630_LEN);
   	
   }
   
     /**
	 * 	Update ConnectGftDbpkg630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConnectGftDbpkg630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectGftDbpkg630+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of connectUserDbpkg630
	 *	@return connectUserDbpkg630
	 */
   public char[] getConnectUserDbpkg630() throws CFException{
     if (isConnectUserDbpkg630Modified()) { 
        connectUserDbpkg630 = refreshConnectUserDbpkg630();
     }
   		return connectUserDbpkg630;
   }

  
	/**
	*  set variable connectUserDbpkg630
	*  Corresponding COBOL Variable is 630-CONNECT-USER-DBPKG
	*  @param value
	**/
   public void setConnectUserDbpkg630(char[] value) {
      connectUserDbpkg630 = checkConnectUserDbpkg630Constraints(value);
      serializeConnectUserDbpkg630(connectUserDbpkg630);
   } 

     /**
	 * 	Update ConnectUserDbpkg630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConnectUserDbpkg630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConnectUserDbpkg630,connectUserDbpkg630.length);
   	
   }
   
   public void setConnectUserDbpkg630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbpkg630,connectUserDbpkg630.length);
   	
   }
   
     /**
	 * 	Update ConnectUserDbpkg630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConnectUserDbpkg630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbpkg630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConnectUserDbpkg630 with another Field
	 *	@param value
	 */
   public void setConnectUserDbpkg630(Field source) {
       replace(source,0,source.length(),beginConnectUserDbpkg630,CONNECT_USER_DBPKG_630_LEN);
   	
   }  
   
     /**
	 * 	Update ConnectUserDbpkg630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConnectUserDbpkg630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConnectUserDbpkg630,CONNECT_USER_DBPKG_630_LEN);
   	
   }
   
     /**
	 * 	Update ConnectUserDbpkg630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConnectUserDbpkg630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConnectUserDbpkg630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getConnectPackageMsg630FieldLength() {
			return CONNECT_PACKAGE_MSG_630_LENGTH;
		}

}
  
