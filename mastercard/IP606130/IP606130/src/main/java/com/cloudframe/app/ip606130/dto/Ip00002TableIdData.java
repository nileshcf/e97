package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002TableIdData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00002TableIdData extends Ip00002TableIdDataSerialized { 
   

						private char[] ip00002TableIdInfo = Field.fillLowValue(8);

								private long ip00002TableKeyLngth;

						private char[] ip00002TblSubId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00002TableIdData
	**/
    public Ip00002TableIdData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00002TableIdData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002TableIdData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00002TableIdInfo
	 *	@return ip00002TableIdInfo
	 */
   public char[] getIp00002TableIdInfo() throws CFException{
     if (isIp00002TableIdInfoModified()) { 
        ip00002TableIdInfo = refreshIp00002TableIdInfo();
     }
   		return ip00002TableIdInfo;
   }

  
	/**
	*  set variable ip00002TableIdInfo
	*  Corresponding COBOL Variable is IP00002-TABLE-ID-INFO
	*  @param value
	**/
   public void setIp00002TableIdInfo(char[] value) {
      ip00002TableIdInfo = checkIp00002TableIdInfoConstraints(value);
      serializeIp00002TableIdInfo(ip00002TableIdInfo);
   } 

     /**
	 * 	Update Ip00002TableIdInfo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00002TableIdInfo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00002TableIdInfo,ip00002TableIdInfo.length);
   	
   }
   
   public void setIp00002TableIdInfo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TableIdInfo,ip00002TableIdInfo.length);
   	
   }
   
     /**
	 * 	Update Ip00002TableIdInfo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TableIdInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TableIdInfo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00002TableIdInfo with another Field
	 *	@param value
	 */
   public void setIp00002TableIdInfo(Field source) {
       replace(source,0,source.length(),beginIp00002TableIdInfo,IP_00002_TABLE_ID_INFO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00002TableIdInfo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00002TableIdInfo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00002TableIdInfo,IP_00002_TABLE_ID_INFO_LEN);
   	
   }
   
     /**
	 * 	Update Ip00002TableIdInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TableIdInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TableIdInfo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00002TableKeyLngth
	 *	@return ip00002TableKeyLngth
	 */
	public long getIp00002TableKeyLngth() throws CFException {
       if (isIp00002TableKeyLngthModified()) { 
           ip00002TableKeyLngth = refreshIp00002TableKeyLngth();
        }
   		return ip00002TableKeyLngth;
	}
	

	
	   
	/**
	 * 	Update Ip00002TableKeyLngth with the passed value
	 *  Corresponding COBOL Variable is IP00002-TABLE-KEY-LNGTH
	 *	@param number
	 */
	public void setIp00002TableKeyLngth(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00002TableKeyLngth = checkIp00002TableKeyLngthMaxLimit(number); 
		serializeIp00002TableKeyLngth(ip00002TableKeyLngth);
	}
	

	/**
	 * 	Update Ip00002TableKeyLngth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00002TableKeyLngth(char[] value) throws CFException {
		 ip00002TableKeyLngth = serializeIp00002TableKeyLngth(value);
	}
	/**
	 * 	Update Ip00002TableKeyLngth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00002TableKeyLngthString(char[] value) throws CFException {
		 setIp00002TableKeyLngth(value);
	}
	/**
	 *	Returns the value of ip00002TblSubId
	 *	@return ip00002TblSubId
	 */
   public char[] getIp00002TblSubId() throws CFException{
     if (isIp00002TblSubIdModified()) { 
        ip00002TblSubId = refreshIp00002TblSubId();
     }
   		return ip00002TblSubId;
   }

  
	/**
	*  set variable ip00002TblSubId
	*  Corresponding COBOL Variable is IP00002-TBL-SUB-ID
	*  @param value
	**/
   public void setIp00002TblSubId(char[] value) {
      ip00002TblSubId = checkIp00002TblSubIdConstraints(value);
      serializeIp00002TblSubId(ip00002TblSubId);
   } 

     /**
	 * 	Update Ip00002TblSubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00002TblSubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00002TblSubId,ip00002TblSubId.length);
   	
   }
   
   public void setIp00002TblSubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TblSubId,ip00002TblSubId.length);
   	
   }
   
     /**
	 * 	Update Ip00002TblSubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TblSubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TblSubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00002TblSubId with another Field
	 *	@param value
	 */
   public void setIp00002TblSubId(Field source) {
       replace(source,0,source.length(),beginIp00002TblSubId,IP_00002_TBL_SUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00002TblSubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00002TblSubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00002TblSubId,IP_00002_TBL_SUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00002TblSubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00002TblSubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00002TblSubId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00002TableIdDataFieldLength() {
			return IP_00002_TABLE_ID_DATA_LENGTH;
		}

}
  
