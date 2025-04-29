package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatdHdr extends RlatdHdrSerialized { 
   

						private char[] rlatdCustomerHeaderRec = Field.fillLowValue(129);
	
	/**
	* Constructor for RlatdHdr
	**/
    public RlatdHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatdHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlatdCustomerHeaderRec
	 *	@return rlatdCustomerHeaderRec
	 */
   public char[] getRlatdCustomerHeaderRec() throws CFException{
     if (isRlatdCustomerHeaderRecModified()) { 
        rlatdCustomerHeaderRec = refreshRlatdCustomerHeaderRec();
     }
   		return rlatdCustomerHeaderRec;
   }

  
	/**
	*  set variable rlatdCustomerHeaderRec
	*  Corresponding COBOL Variable is RLATD-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRlatdCustomerHeaderRec(char[] value) {
      rlatdCustomerHeaderRec = checkRlatdCustomerHeaderRecConstraints(value);
      serializeRlatdCustomerHeaderRec(rlatdCustomerHeaderRec);
   } 

     /**
	 * 	Update RlatdCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlatdCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlatdCustomerHeaderRec,rlatdCustomerHeaderRec.length);
   	
   }
   
   public void setRlatdCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdCustomerHeaderRec,rlatdCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update RlatdCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatdCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlatdCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRlatdCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRlatdCustomerHeaderRec,RLATD_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RlatdCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlatdCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlatdCustomerHeaderRec,RLATD_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update RlatdCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatdCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlatdHdrFieldLength() {
			return RLATD_HDR_LENGTH;
		}

}
  
