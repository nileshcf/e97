package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00054Table5Key1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00054Table5Key1 extends Ip00054Table5Key1Serialized { 
   

						private char[] ip00054KeyTableId = Field.fillLowValue(8);

								private long ip00054KeySeqNo;
	
	/**
	* Constructor for Ip00054Table5Key1
	**/
    public Ip00054Table5Key1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00054Table5Key1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054Table5Key1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00054KeyTableId
	 *	@return ip00054KeyTableId
	 */
   public char[] getIp00054KeyTableId() throws CFException{
     if (isIp00054KeyTableIdModified()) { 
        ip00054KeyTableId = refreshIp00054KeyTableId();
     }
   		return ip00054KeyTableId;
   }

  
	/**
	*  set variable ip00054KeyTableId
	*  Corresponding COBOL Variable is IP00054-KEY-TABLE-ID
	*  @param value
	**/
   public void setIp00054KeyTableId(char[] value) {
      ip00054KeyTableId = checkIp00054KeyTableIdConstraints(value);
      serializeIp00054KeyTableId(ip00054KeyTableId);
   } 

     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00054KeyTableId,ip00054KeyTableId.length);
   	
   }
   
   public void setIp00054KeyTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054KeyTableId,ip00054KeyTableId.length);
   	
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054KeyTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00054KeyTableId with another Field
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source) {
       replace(source,0,source.length(),beginIp00054KeyTableId,IP_00054_KEY_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00054KeyTableId,IP_00054_KEY_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00054KeyTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054KeyTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054KeyTableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00054KeySeqNo
	 *	@return ip00054KeySeqNo
	 */
	public long getIp00054KeySeqNo() throws CFException {
        if (isIp00054KeySeqNoModified()) { 
           ip00054KeySeqNo = refreshIp00054KeySeqNo();
        }
   		return ip00054KeySeqNo;
	}
	
	/**
	 * 	Update Ip00054KeySeqNo with the passed value
	 *  Corresponding COBOL Variable is IP00054-KEY-SEQ-NO
	 *	@param number
	 */
	public void setIp00054KeySeqNo(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00054KeySeqNo = checkIp00054KeySeqNoMaxLimit(number); 
		serializeIp00054KeySeqNo(ip00054KeySeqNo);
	}



	
	
	
	/**
	 * 	initializes Ip00054Table5Key1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00054KeyTableId(CONSTANTS.SPACE_8);
                     setIp00054KeySeqNo(0);
   }

		public static int getIp00054Table5Key1FieldLength() {
			return IP_00054_TABLE_5_KEY_1_LENGTH;
		}

}
  
