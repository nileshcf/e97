package com.cloudframe.app.varlen.dto;

/**
*  The class RevoDetailRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RevoDetailRecord extends RevoDetailRecordSerialized { 
   

						private char[] revoEmailAddr = Field.fillLowValue(60);
	
	/**
	* Constructor for RevoDetailRecord
	**/
    public RevoDetailRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RevoDetailRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoDetailRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of revoEmailAddr
	 *	@return revoEmailAddr
	 */
   public char[] getRevoEmailAddr() throws CFException{
     if (isRevoEmailAddrModified()) { 
        revoEmailAddr = refreshRevoEmailAddr();
     }
   		return revoEmailAddr;
   }

  
	/**
	*  set variable revoEmailAddr
	*  Corresponding COBOL Variable is REVO-EMAIL-ADDR
	*  @param value
	**/
   public void setRevoEmailAddr(char[] value) {
      revoEmailAddr = checkRevoEmailAddrConstraints(value);
      serializeRevoEmailAddr(revoEmailAddr);
   } 

     /**
	 * 	Update RevoEmailAddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRevoEmailAddr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRevoEmailAddr,revoEmailAddr.length);
   	
   }
   
   public void setRevoEmailAddr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRevoEmailAddr,revoEmailAddr.length);
   	
   }
   
     /**
	 * 	Update RevoEmailAddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevoEmailAddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevoEmailAddr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RevoEmailAddr with another Field
	 *	@param value
	 */
   public void setRevoEmailAddr(Field source) {
       replace(source,0,source.length(),beginRevoEmailAddr,REVO_EMAIL_ADDR_LEN);
   	
   }  
   
     /**
	 * 	Update RevoEmailAddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRevoEmailAddr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRevoEmailAddr,REVO_EMAIL_ADDR_LEN);
   	
   }
   
     /**
	 * 	Update RevoEmailAddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevoEmailAddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevoEmailAddr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRevoDetailRecordFieldLength() {
			return REVO_DETAIL_RECORD_LENGTH;
		}

}
  
