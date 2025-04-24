package com.cloudframe.app.casecb01.dto;

/**
*  The class Getinventory is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;


public class Getinventory extends GetinventorySerialized { 
   
				private Inventoryrequested inventoryrequested = new Inventoryrequested();
	
	/**
	* Constructor for Getinventory
	**/
    public Getinventory() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Getinventory. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Getinventory(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			inventoryrequested.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of inventoryrequested
	 *	@return inventoryrequested
	 */   
	 public Inventoryrequested getInventoryrequested() {
   	return inventoryrequested;
   }
   /**
	* 	Update Inventoryrequested with the passed value
	*   Corresponding COBOL Variable is INVENTORYREQUESTED
	*	@param value
	*/
   public void setInventoryrequested(char[] value) {
      inventoryrequested.setString(value); 
   }   
    
     /**
	 * 	Update Inventoryrequested 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInventoryrequested(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inventoryrequested.begin,inventoryrequested.length());
   }
   
     /**
	 * 	Update Inventoryrequested 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInventoryrequested(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inventoryrequested.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Inventoryrequested with another Field
	 *	@param value
	 */
   public void setInventoryrequested(Field source) {
   	replace(source,0,source.length(),inventoryrequested.begin,inventoryrequested.length());
   }  
   
     /**
	 * 	Update Inventoryrequested 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInventoryrequested(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inventoryrequested.begin,inventoryrequested.length());
   }
   
     /**
	 * 	Update Inventoryrequested 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInventoryrequested(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inventoryrequested.begin+targetIndex,targetLen);
   }

	
	
	

	/**
	 *	Returns the xml format of Getinventory
	 *	@return xml format of Getinventory
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<getInventory>");
					xmlContent.append(inventoryrequested.getXml());
		xmlContent.append("</getInventory>");
		return xmlContent.toString();
	}

		public static int getGetinventoryFieldLength() {
			return GETINVENTORY_LENGTH;
		}

}
  
