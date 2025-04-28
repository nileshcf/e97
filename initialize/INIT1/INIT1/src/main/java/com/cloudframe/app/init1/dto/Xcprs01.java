package com.cloudframe.app.init1.dto;

/**
*  The class Xcprs01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Xcprs01 extends Xcprs01Serialized {
   
				private ApplicationVersion applicationVersion = new ApplicationVersion();
				private MessagesX messagesX = new MessagesX();
	
	/**
	* Constructor for Xcprs01
	**/
    public Xcprs01() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			applicationVersion.setParent(this,getStartOffset() + 10);
	       			messagesX.setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of applicationVersion
	 *	@return applicationVersion
	 */   
	 public ApplicationVersion getApplicationVersion() {
   	return applicationVersion;
   }
   /**
	* 	Update ApplicationVersion with the passed value
	*   Corresponding COBOL Variable is APPLICATION-VERSION
	*	@param value
	*/
   public void setApplicationVersion(char[] value) {
      applicationVersion.setString(value); 
   }   
    
     /**
	 * 	Update ApplicationVersion 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setApplicationVersion(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationVersion.begin,applicationVersion.length());
   }
   
     /**
	 * 	Update ApplicationVersion 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationVersion.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ApplicationVersion with another Field
	 *	@param value
	 */
   public void setApplicationVersion(Field source) {
   	replace(source,0,source.length(),applicationVersion.begin,applicationVersion.length());
   }  
   
     /**
	 * 	Update ApplicationVersion 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setApplicationVersion(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applicationVersion.begin,applicationVersion.length());
   }
   
     /**
	 * 	Update ApplicationVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applicationVersion.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of messagesX
	 *	@return messagesX
	 */   
	 public MessagesX getMessagesX() {
   	return messagesX;
   }
   /**
	* 	Update MessagesX with the passed value
	*   Corresponding COBOL Variable is MESSAGES-X
	*	@param value
	*/
   public void setMessagesX(char[] value) {
      messagesX.setString(value); 
   }   
    
     /**
	 * 	Update MessagesX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMessagesX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messagesX.begin,messagesX.length());
   }
   
     /**
	 * 	Update MessagesX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessagesX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messagesX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MessagesX with another Field
	 *	@param value
	 */
   public void setMessagesX(Field source) {
   	replace(source,0,source.length(),messagesX.begin,messagesX.length());
   }  
   
     /**
	 * 	Update MessagesX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMessagesX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messagesX.begin,messagesX.length());
   }
   
     /**
	 * 	Update MessagesX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessagesX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messagesX.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getXcprs01FieldLength() {
			return XCPRS_01_LENGTH;
		}

}
  
