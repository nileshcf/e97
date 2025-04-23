package com.cloudframe.app.db2func.dto;

/**
*  The class ApplicationCodeListGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ApplicationCodeListGroup extends ApplicationCodeListGroupSerialized {
   

						private char[] applicationCodeList = Field.fillLowValue(21);
					private HostAppCodeList hostAppCodeList = new HostAppCodeList();
	
	/**
	* Constructor for ApplicationCodeListGroup
	**/
    public ApplicationCodeListGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			hostAppCodeList.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of applicationCodeList
	 *	@return applicationCodeList
	 */
   public char[] getApplicationCodeList() throws CFException{
     if (isApplicationCodeListModified()) { 
        applicationCodeList = refreshApplicationCodeList();
     }
   		return applicationCodeList;
   }

  
	/**
	*  set variable applicationCodeList
	*  Corresponding COBOL Variable is WS-APPLICATION-CODE-LIST
	*  @param value
	**/
   public void setApplicationCodeList(char[] value) {
      applicationCodeList = checkApplicationCodeListConstraints(value);
      serializeApplicationCodeList(applicationCodeList);
   } 

     /**
	 * 	Update ApplicationCodeList 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplicationCodeList(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplicationCodeList,applicationCodeList.length);
   	
   }
   
   public void setApplicationCodeList(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationCodeList,applicationCodeList.length);
   	
   }
   
     /**
	 * 	Update ApplicationCodeList 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationCodeList(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationCodeList+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplicationCodeList with another Field
	 *	@param value
	 */
   public void setApplicationCodeList(Field source) {
       replace(source,0,source.length(),beginApplicationCodeList,APPLICATION_CODE_LIST_LEN);
   	
   }  
   
     /**
	 * 	Update ApplicationCodeList 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplicationCodeList(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplicationCodeList,APPLICATION_CODE_LIST_LEN);
   	
   }
   
     /**
	 * 	Update ApplicationCodeList 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationCodeList(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationCodeList+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCodeList
	 *	@return hostAppCodeList
	 */   
	 public HostAppCodeList getHostAppCodeList() {
   	return hostAppCodeList;
   }
   /**
	* 	Update HostAppCodeList with the passed value
	*   Corresponding COBOL Variable is WS-HOST-APP-CODE-LIST
	*	@param value
	*/
   public void setHostAppCodeList(char[] value) {
      hostAppCodeList.setString(value); 
   }   
    
     /**
	 * 	Update HostAppCodeList 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeList(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeList.begin,hostAppCodeList.length());
   }
   
     /**
	 * 	Update HostAppCodeList 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeList(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeList.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HostAppCodeList with another Field
	 *	@param value
	 */
   public void setHostAppCodeList(Field source) {
   	replace(source,0,source.length(),hostAppCodeList.begin,hostAppCodeList.length());
   }  
   
     /**
	 * 	Update HostAppCodeList 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeList(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeList.begin,hostAppCodeList.length());
   }
   
     /**
	 * 	Update HostAppCodeList 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeList(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeList.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getApplicationCodeListGroupFieldLength() {
			return APPLICATION_CODE_LIST_GROUP_LENGTH;
		}

}
  
