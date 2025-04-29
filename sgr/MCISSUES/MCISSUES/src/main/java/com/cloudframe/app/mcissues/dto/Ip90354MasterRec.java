package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354MasterRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip90354MasterRec extends Ip90354MasterRecSerialized {
   
				private Ip90354TableData ip90354TableData = new Ip90354TableData();
	
	/**
	* Constructor for Ip90354MasterRec
	**/
    public Ip90354MasterRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip90354TableData.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip90354TableData
	 *	@return ip90354TableData
	 */   
	 public Ip90354TableData getIp90354TableData() {
   	return ip90354TableData;
   }
   /**
	* 	Update Ip90354TableData with the passed value
	*   Corresponding COBOL Variable is IP90354-TABLE-DATA
	*	@param value
	*/
   public void setIp90354TableData(char[] value) {
      ip90354TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip90354TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp90354TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableData.begin,ip90354TableData.length());
   }
   
     /**
	 * 	Update Ip90354TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip90354TableData with another Field
	 *	@param value
	 */
   public void setIp90354TableData(Field source) {
   	replace(source,0,source.length(),ip90354TableData.begin,ip90354TableData.length());
   }  
   
     /**
	 * 	Update Ip90354TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp90354TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableData.begin,ip90354TableData.length());
   }
   
     /**
	 * 	Update Ip90354TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp90354MasterRecFieldLength() {
			return IP_90354_MASTER_REC_LENGTH;
		}

}
  
