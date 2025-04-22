package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98151RecordPart1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip98151RecordPart1 extends Ip98151RecordPart1Serialized { 
   

						private char[] ip98151TjfMrchAddr = Field.fillLowValue(25);

						private char[] ip98151TjfDe48se32 = Field.fillLowValue(6);

						private char[] ip98151TjfTlrMrchId = Field.fillLowValue(6);

						private char[] ip98151TjfTlrP176Id = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip98151RecordPart1
	**/
    public Ip98151RecordPart1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip98151RecordPart1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98151RecordPart1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip98151TjfMrchAddr
	 *	@return ip98151TjfMrchAddr
	 */
   public char[] getIp98151TjfMrchAddr() throws CFException{
     if (isIp98151TjfMrchAddrModified()) { 
        ip98151TjfMrchAddr = refreshIp98151TjfMrchAddr();
     }
   		return ip98151TjfMrchAddr;
   }

  
	/**
	*  set variable ip98151TjfMrchAddr
	*  Corresponding COBOL Variable is IP98151-TJF-MRCH-ADDR
	*  @param value
	**/
   public void setIp98151TjfMrchAddr(char[] value) {
      ip98151TjfMrchAddr = checkIp98151TjfMrchAddrConstraints(value);
      serializeIp98151TjfMrchAddr(ip98151TjfMrchAddr);
   } 

     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98151TjfMrchAddr,ip98151TjfMrchAddr.length);
   	
   }
   
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfMrchAddr,ip98151TjfMrchAddr.length);
   	
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfMrchAddr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98151TjfMrchAddr with another Field
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source) {
       replace(source,0,source.length(),beginIp98151TjfMrchAddr,IP_98151_TJF_MRCH_ADDR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98151TjfMrchAddr,IP_98151_TJF_MRCH_ADDR_LEN);
   	
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfMrchAddr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98151TjfDe48se32
	 *	@return ip98151TjfDe48se32
	 */
   public char[] getIp98151TjfDe48se32() throws CFException{
     if (isIp98151TjfDe48se32Modified()) { 
        ip98151TjfDe48se32 = refreshIp98151TjfDe48se32();
     }
   		return ip98151TjfDe48se32;
   }

  
	/**
	*  set variable ip98151TjfDe48se32
	*  Corresponding COBOL Variable is IP98151-TJF-DE48SE32
	*  @param value
	**/
   public void setIp98151TjfDe48se32(char[] value) {
      ip98151TjfDe48se32 = checkIp98151TjfDe48se32Constraints(value);
      serializeIp98151TjfDe48se32(ip98151TjfDe48se32);
   } 

     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98151TjfDe48se32,ip98151TjfDe48se32.length);
   	
   }
   
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfDe48se32,ip98151TjfDe48se32.length);
   	
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfDe48se32+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98151TjfDe48se32 with another Field
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source) {
       replace(source,0,source.length(),beginIp98151TjfDe48se32,IP_98151_TJF_DE_48SE_32_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98151TjfDe48se32,IP_98151_TJF_DE_48SE_32_LEN);
   	
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfDe48se32+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98151TjfTlrMrchId
	 *	@return ip98151TjfTlrMrchId
	 */
   public char[] getIp98151TjfTlrMrchId() throws CFException{
     if (isIp98151TjfTlrMrchIdModified()) { 
        ip98151TjfTlrMrchId = refreshIp98151TjfTlrMrchId();
     }
   		return ip98151TjfTlrMrchId;
   }

  
	/**
	*  set variable ip98151TjfTlrMrchId
	*  Corresponding COBOL Variable is IP98151-TJF-TLR-MRCH-ID
	*  @param value
	**/
   public void setIp98151TjfTlrMrchId(char[] value) {
      ip98151TjfTlrMrchId = checkIp98151TjfTlrMrchIdConstraints(value);
      serializeIp98151TjfTlrMrchId(ip98151TjfTlrMrchId);
   } 

     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98151TjfTlrMrchId,ip98151TjfTlrMrchId.length);
   	
   }
   
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrMrchId,ip98151TjfTlrMrchId.length);
   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrMrchId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98151TjfTlrMrchId with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source) {
       replace(source,0,source.length(),beginIp98151TjfTlrMrchId,IP_98151_TJF_TLR_MRCH_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrMrchId,IP_98151_TJF_TLR_MRCH_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrMrchId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98151TjfTlrP176Id
	 *	@return ip98151TjfTlrP176Id
	 */
   public char[] getIp98151TjfTlrP176Id() throws CFException{
     if (isIp98151TjfTlrP176IdModified()) { 
        ip98151TjfTlrP176Id = refreshIp98151TjfTlrP176Id();
     }
   		return ip98151TjfTlrP176Id;
   }

  
	/**
	*  set variable ip98151TjfTlrP176Id
	*  Corresponding COBOL Variable is IP98151-TJF-TLR-P176-ID
	*  @param value
	**/
   public void setIp98151TjfTlrP176Id(char[] value) {
      ip98151TjfTlrP176Id = checkIp98151TjfTlrP176IdConstraints(value);
      serializeIp98151TjfTlrP176Id(ip98151TjfTlrP176Id);
   } 

     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98151TjfTlrP176Id,ip98151TjfTlrP176Id.length);
   	
   }
   
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrP176Id,ip98151TjfTlrP176Id.length);
   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrP176Id+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98151TjfTlrP176Id with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source) {
       replace(source,0,source.length(),beginIp98151TjfTlrP176Id,IP_98151_TJF_TLR_P_176_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrP176Id,IP_98151_TJF_TLR_P_176_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98151TjfTlrP176Id+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp98151RecordPart1FieldLength() {
			return IP_98151_RECORD_PART_1_LENGTH;
		}

}
  
