package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip500041Rec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip500041Rec extends Ip500041RecSerialized {
   

						private char[] ip500041TableId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip500041Rec
	**/
    public Ip500041Rec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip500041TableId
	 *	@return ip500041TableId
	 */
   public char[] getIp500041TableId() throws CFException{
     if (isIp500041TableIdModified()) { 
        ip500041TableId = refreshIp500041TableId();
     }
   		return ip500041TableId;
   }

  
	/**
	*  set variable ip500041TableId
	*  Corresponding COBOL Variable is IP500041-TABLE-ID
	*  @param value
	**/
   public void setIp500041TableId(char[] value) {
      ip500041TableId = checkIp500041TableIdConstraints(value);
      serializeIp500041TableId(ip500041TableId);
   } 

     /**
	 * 	Update Ip500041TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041TableId,ip500041TableId.length);
   	
   }
   
   public void setIp500041TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableId,ip500041TableId.length);
   	
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041TableId with another Field
	 *	@param value
	 */
   public void setIp500041TableId(Field source) {
       replace(source,0,source.length(),beginIp500041TableId,IP_500041_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041TableId,IP_500041_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip500041Rec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp500041TableId(CONSTANTS.SPACE_11);
   }

		public static int getIp500041RecFieldLength() {
			return IP_500041_REC_LENGTH;
		}

}
  
