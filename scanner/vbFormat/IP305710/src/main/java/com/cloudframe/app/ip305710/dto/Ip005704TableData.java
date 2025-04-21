package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005704TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip005704TableData extends Ip005704TableDataSerialized {
   
				private Ip005704Tbl57Data ip005704Tbl57Data = new Ip005704Tbl57Data();
	
	/**
	* Constructor for Ip005704TableData
	**/
    public Ip005704TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip005704Tbl57Data.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip005704Tbl57Data
	 *	@return ip005704Tbl57Data
	 */   
	 public Ip005704Tbl57Data getIp005704Tbl57Data() {
   	return ip005704Tbl57Data;
   }
   /**
	* 	Update Ip005704Tbl57Data with the passed value
	*   Corresponding COBOL Variable is IP005704-TBL57-DATA
	*	@param value
	*/
   public void setIp005704Tbl57Data(char[] value) {
      ip005704Tbl57Data.setString(value); 
   }   
    
     /**
	 * 	Update Ip005704Tbl57Data 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp005704Tbl57Data(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005704Tbl57Data.begin,ip005704Tbl57Data.length());
   }
   
     /**
	 * 	Update Ip005704Tbl57Data 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704Tbl57Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005704Tbl57Data.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip005704Tbl57Data with another Field
	 *	@param value
	 */
   public void setIp005704Tbl57Data(Field source) {
   	replace(source,0,source.length(),ip005704Tbl57Data.begin,ip005704Tbl57Data.length());
   }  
   
     /**
	 * 	Update Ip005704Tbl57Data 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp005704Tbl57Data(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005704Tbl57Data.begin,ip005704Tbl57Data.length());
   }
   
     /**
	 * 	Update Ip005704Tbl57Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704Tbl57Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005704Tbl57Data.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp005704TableDataFieldLength() {
			return IP_005704_TABLE_DATA_LENGTH;
		}

}
  
