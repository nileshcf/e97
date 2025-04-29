package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMessageRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMessageRec extends RlcbmBillMessageRecSerialized { 
   

								private long rlcbmInvoiceNo;

						private char[] rlcbmCustTypCd = Field.fillLowValue(2);

								private int rlcbmEcpdProfileId;

								private int rlcbmActiveMtnsQty;
	
	/**
	* Constructor for RlcbmBillMessageRec
	**/
    public RlcbmBillMessageRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlcbmBillMessageRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMessageRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlcbmInvoiceNo
	 *	@return rlcbmInvoiceNo
	 */
	public long getRlcbmInvoiceNo() throws CFException {
        if (isRlcbmInvoiceNoModified()) { 
           rlcbmInvoiceNo = refreshRlcbmInvoiceNo();
        }
   		return rlcbmInvoiceNo;
	}
	
	/**
	 * 	Update RlcbmInvoiceNo with the passed value
	 *  Corresponding COBOL Variable is RLCBM-INVOICE-NO
	 *	@param number
	 */
	public void setRlcbmInvoiceNo(long number) {
	     // Truncate if the number is beyond +/- Max range
	    rlcbmInvoiceNo = checkRlcbmInvoiceNoMaxLimit(number); 
		serializeRlcbmInvoiceNo(rlcbmInvoiceNo);
	}


	/**
	 *	Returns the value of rlcbmCustTypCd
	 *	@return rlcbmCustTypCd
	 */
   public char[] getRlcbmCustTypCd() throws CFException{
     if (isRlcbmCustTypCdModified()) { 
        rlcbmCustTypCd = refreshRlcbmCustTypCd();
     }
   		return rlcbmCustTypCd;
   }

  
	/**
	*  set variable rlcbmCustTypCd
	*  Corresponding COBOL Variable is RLCBM-CUST-TYP-CD
	*  @param value
	**/
   public void setRlcbmCustTypCd(char[] value) {
      rlcbmCustTypCd = checkRlcbmCustTypCdConstraints(value);
      serializeRlcbmCustTypCd(rlcbmCustTypCd);
   } 

     /**
	 * 	Update RlcbmCustTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmCustTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlcbmCustTypCd,rlcbmCustTypCd.length);
   	
   }
   
   public void setRlcbmCustTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustTypCd,rlcbmCustTypCd.length);
   	
   }
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlcbmCustTypCd with another Field
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source) {
       replace(source,0,source.length(),beginRlcbmCustTypCd,RLCBM_CUST_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlcbmCustTypCd,RLCBM_CUST_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmCustTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlcbmEcpdProfileId
	 *	@return rlcbmEcpdProfileId
	 */
	public int getRlcbmEcpdProfileId() throws CFException {
        if (isRlcbmEcpdProfileIdModified()) { 
           rlcbmEcpdProfileId = refreshRlcbmEcpdProfileId();
        }
   		return rlcbmEcpdProfileId;
	}
	
	/**
	 * 	Update RlcbmEcpdProfileId with the passed value
	 *  Corresponding COBOL Variable is RLCBM-ECPD-PROFILE-ID
	 *	@param number
	 */
	public void setRlcbmEcpdProfileId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlcbmEcpdProfileId = checkRlcbmEcpdProfileIdMaxLimit(number); 
		serializeRlcbmEcpdProfileId(rlcbmEcpdProfileId);
	}


	public void setRlcbmEcpdProfileId(long number) {
	    number = checkRlcbmEcpdProfileIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlcbmEcpdProfileId((int)number);
	}
	
	/**
	 *	Returns the value of rlcbmActiveMtnsQty
	 *	@return rlcbmActiveMtnsQty
	 */
	public int getRlcbmActiveMtnsQty() throws CFException {
        if (isRlcbmActiveMtnsQtyModified()) { 
           rlcbmActiveMtnsQty = refreshRlcbmActiveMtnsQty();
        }
   		return rlcbmActiveMtnsQty;
	}
	
	/**
	 * 	Update RlcbmActiveMtnsQty with the passed value
	 *  Corresponding COBOL Variable is RLCBM-ACTIVE-MTNS-QTY
	 *	@param number
	 */
	public void setRlcbmActiveMtnsQty(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlcbmActiveMtnsQty = checkRlcbmActiveMtnsQtyMaxLimit(number); 
		serializeRlcbmActiveMtnsQty(rlcbmActiveMtnsQty);
	}


	public void setRlcbmActiveMtnsQty(long number) {
	    number = checkRlcbmActiveMtnsQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlcbmActiveMtnsQty((int)number);
	}
	

	
	
	

		public static int getRlcbmBillMessageRecFieldLength() {
			return RLCBM_BILL_MESSAGE_REC_LENGTH;
		}

}
  
