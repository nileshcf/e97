package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocRefBlHdr extends RldusInEocRefBlHdrSerialized { 
   

						private char[] rldusCustomerHeaderRec = Field.fillLowValue(141);
	
	/**
	* Constructor for RldusInEocRefBlHdr
	**/
    public RldusInEocRefBlHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RldusInEocRefBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rldusCustomerHeaderRec
	 *	@return rldusCustomerHeaderRec
	 */
   public char[] getRldusCustomerHeaderRec() throws CFException{
     if (isRldusCustomerHeaderRecModified()) { 
        rldusCustomerHeaderRec = refreshRldusCustomerHeaderRec();
     }
   		return rldusCustomerHeaderRec;
   }

  
	/**
	*  set variable rldusCustomerHeaderRec
	*  Corresponding COBOL Variable is RLDUS-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRldusCustomerHeaderRec(char[] value) {
      rldusCustomerHeaderRec = checkRldusCustomerHeaderRecConstraints(value);
      serializeRldusCustomerHeaderRec(rldusCustomerHeaderRec);
   } 

     /**
	 * 	Update RldusCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRldusCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRldusCustomerHeaderRec,rldusCustomerHeaderRec.length);
   	
   }
   
   public void setRldusCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCustomerHeaderRec,rldusCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update RldusCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RldusCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRldusCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRldusCustomerHeaderRec,RLDUS_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RldusCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRldusCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRldusCustomerHeaderRec,RLDUS_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update RldusCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRldusInEocRefBlHdrFieldLength() {
			return RLDUS_IN_EOC_REF_BL_HDR_LENGTH;
		}

}
  
