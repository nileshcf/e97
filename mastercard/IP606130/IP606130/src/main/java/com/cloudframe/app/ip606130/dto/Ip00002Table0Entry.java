package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002Table0Entry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00002Table0Entry extends Ip00002Table0EntrySerialized { 
   
				private Ip00002TableIdData ip00002TableIdData = new Ip00002TableIdData();
	
	/**
	* Constructor for Ip00002Table0Entry
	**/
    public Ip00002Table0Entry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00002Table0Entry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002Table0Entry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00002TableIdData.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of ip00002TableIdData
	 *	@return ip00002TableIdData
	 */   
	 public Ip00002TableIdData getIp00002TableIdData() {
   	return ip00002TableIdData;
   }
   /**
	* 	Update Ip00002TableIdData with the passed value
	*   Corresponding COBOL Variable is IP00002-TABLE-ID-DATA
	*	@param value
	*/
   public void setIp00002TableIdData(char[] value) {
      ip00002TableIdData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00002TableIdData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00002TableIdData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00002TableIdData.begin,ip00002TableIdData.length());
   }
   
     /**
	 * 	Update Ip00002TableIdData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TableIdData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00002TableIdData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00002TableIdData with another Field
	 *	@param value
	 */
   public void setIp00002TableIdData(Field source) {
   	replace(source,0,source.length(),ip00002TableIdData.begin,ip00002TableIdData.length());
   }  
   
     /**
	 * 	Update Ip00002TableIdData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00002TableIdData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00002TableIdData.begin,ip00002TableIdData.length());
   }
   
     /**
	 * 	Update Ip00002TableIdData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TableIdData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00002TableIdData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp00002Table0EntryFieldLength() {
			return IP_00002_TABLE_0_ENTRY_LENGTH;
		}

}
  
