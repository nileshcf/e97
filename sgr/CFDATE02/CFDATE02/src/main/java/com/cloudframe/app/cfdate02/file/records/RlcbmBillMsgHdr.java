package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlcbmBillMsgHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgHdr extends RlcbmBillMsgHdrSerialized { 
   

						private char[] rlcbmCustomerHeaderRec = Field.fillLowValue(141);
	
	/**
	* Constructor for RlcbmBillMsgHdr
	**/
    public RlcbmBillMsgHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlcbmBillMsgHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlcbmCustomerHeaderRec
	 *	@return rlcbmCustomerHeaderRec
	 */
   public char[] getRlcbmCustomerHeaderRec() throws CFException{
     if (isRlcbmCustomerHeaderRecModified()) { 
        rlcbmCustomerHeaderRec = refreshRlcbmCustomerHeaderRec();
     }
   		return rlcbmCustomerHeaderRec;
   }

  
	/**
	*  set variable rlcbmCustomerHeaderRec
	*  Corresponding COBOL Variable is RLCBM-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRlcbmCustomerHeaderRec(char[] value) {
      rlcbmCustomerHeaderRec = checkRlcbmCustomerHeaderRecConstraints(value);
      serializeRlcbmCustomerHeaderRec(rlcbmCustomerHeaderRec);
   } 

     /**
	 * 	Update RlcbmCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlcbmCustomerHeaderRec,rlcbmCustomerHeaderRec.length);
   	
   }
   
   public void setRlcbmCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustomerHeaderRec,rlcbmCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update RlcbmCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlcbmCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRlcbmCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRlcbmCustomerHeaderRec,RLCBM_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RlcbmCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlcbmCustomerHeaderRec,RLCBM_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update RlcbmCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlcbmBillMsgHdrFieldLength() {
			return RLCBM_BILL_MSG_HDR_LENGTH;
		}

}
  
