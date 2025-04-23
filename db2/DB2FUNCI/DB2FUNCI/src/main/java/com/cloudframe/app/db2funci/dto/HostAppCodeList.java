package com.cloudframe.app.db2funci.dto;

/**
*  The class HostAppCodeList is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HostAppCodeList extends HostAppCodeListSerialized { 
   
				private HostAppCodeTbl hostAppCodeTbl = new HostAppCodeTbl();
	
	/**
	* Constructor for HostAppCodeList
	**/
    public HostAppCodeList() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HostAppCodeList. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeList(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			hostAppCodeTbl.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of hostAppCodeTbl
	 *	@return hostAppCodeTbl
	 */   
	 public HostAppCodeTbl getHostAppCodeTbl() {
   	return hostAppCodeTbl;
   }
   /**
	* 	Update HostAppCodeTbl with the passed value
	*   Corresponding COBOL Variable is WS-HOST-APP-CODE-TBL
	*	@param value
	*/
   public void setHostAppCodeTbl(char[] value) {
      hostAppCodeTbl.setString(value); 
   }   
    
     /**
	 * 	Update HostAppCodeTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeTbl.begin,hostAppCodeTbl.length());
   }
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HostAppCodeTbl with another Field
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source) {
   	replace(source,0,source.length(),hostAppCodeTbl.begin,hostAppCodeTbl.length());
   }  
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeTbl.begin,hostAppCodeTbl.length());
   }
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hostAppCodeTbl.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHostAppCodeListFieldLength() {
			return HOST_APP_CODE_LIST_LENGTH;
		}

}
  
