package com.cloudframe.app.ip299010.dto;

/**
*  The class Ip00054wTable5Key1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00054wTable5Key1 extends Ip00054wTable5Key1Serialized { 
   

						private char[] ip00054wKeyTableId = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip00054wTable5Key1
	**/
    public Ip00054wTable5Key1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00054wTable5Key1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054wTable5Key1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00054wKeyTableId
	 *	@return ip00054wKeyTableId
	 */
   public char[] getIp00054wKeyTableId() throws CFException{
     if (isIp00054wKeyTableIdModified()) { 
        ip00054wKeyTableId = refreshIp00054wKeyTableId();
     }
   		return ip00054wKeyTableId;
   }

  
	/**
	*  set variable ip00054wKeyTableId
	*  Corresponding COBOL Variable is IP00054W-KEY-TABLE-ID
	*  @param value
	**/
   public void setIp00054wKeyTableId(char[] value) {
      ip00054wKeyTableId = checkIp00054wKeyTableIdConstraints(value);
      serializeIp00054wKeyTableId(ip00054wKeyTableId);
   } 

     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054wKeyTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00054wKeyTableId,ip00054wKeyTableId.length);
   	
   }
   
   public void setIp00054wKeyTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wKeyTableId,ip00054wKeyTableId.length);
   	
   }
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wKeyTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wKeyTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00054wKeyTableId with another Field
	 *	@param value
	 */
   public void setIp00054wKeyTableId(Field source) {
       replace(source,0,source.length(),beginIp00054wKeyTableId,IP_00054W_KEY_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054wKeyTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00054wKeyTableId,IP_00054W_KEY_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00054wKeyTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wKeyTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wKeyTableId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00054wTable5Key1FieldLength() {
			return IP_00054W_TABLE_5_KEY_1_LENGTH;
		}

}
  
