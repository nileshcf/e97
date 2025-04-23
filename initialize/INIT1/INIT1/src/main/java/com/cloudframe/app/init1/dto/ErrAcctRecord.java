package com.cloudframe.app.init1.dto;

/**
*  The class ErrAcctRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ErrAcctRecord extends ErrAcctRecordSerialized { 
   
				private ErrCustAcct errCustAcct = new ErrCustAcct();
				private ErrCodes errCodes = new ErrCodes();

						private char[] errRejectCd = new char[3];

						private char[] errRejectReason = new char[40];
	
	/**
	* Constructor for ErrAcctRecord
	**/
    public ErrAcctRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrAcctRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrAcctRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			errCustAcct.setParent(this,getStartOffset() + 0);
	       			errCodes.setParent(this,getStartOffset() + 8);
								setErrRejectCd(fillSpace(3));
								setErrRejectReason(fillSpace(40));
    } 

	/**
	 *	Returns the value of errCustAcct
	 *	@return errCustAcct
	 */   
	 public ErrCustAcct getErrCustAcct() {
   	return errCustAcct;
   }
   /**
	* 	Update ErrCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-ERR-CUST-ACCT
	*	@param value
	*/
   public void setErrCustAcct(char[] value) {
      errCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update ErrCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errCustAcct.begin,errCustAcct.length());
   }
   
     /**
	 * 	Update ErrCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrCustAcct with another Field
	 *	@param value
	 */
   public void setErrCustAcct(Field source) {
   	replace(source,0,source.length(),errCustAcct.begin,errCustAcct.length());
   }  
   
     /**
	 * 	Update ErrCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errCustAcct.begin,errCustAcct.length());
   }
   
     /**
	 * 	Update ErrCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of errCodes
	 *	@return errCodes
	 */   
	 public ErrCodes getErrCodes() {
   	return errCodes;
   }
   /**
	* 	Update ErrCodes with the passed value
	*   Corresponding COBOL Variable is WS-ERR-CODES
	*	@param value
	*/
   public void setErrCodes(char[] value) {
      errCodes.setString(value); 
   }   
    
     /**
	 * 	Update ErrCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errCodes.begin,errCodes.length());
   }
   
     /**
	 * 	Update ErrCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrCodes with another Field
	 *	@param value
	 */
   public void setErrCodes(Field source) {
   	replace(source,0,source.length(),errCodes.begin,errCodes.length());
   }  
   
     /**
	 * 	Update ErrCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errCodes.begin,errCodes.length());
   }
   
     /**
	 * 	Update ErrCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errCodes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of errRejectCd
	 *	@return errRejectCd
	 */
   public char[] getErrRejectCd() throws CFException{
     if (isErrRejectCdModified()) { 
        errRejectCd = refreshErrRejectCd();
     }
   		return errRejectCd;
   }

  
	/**
	*  set variable errRejectCd
	*  Corresponding COBOL Variable is WS-ERR-REJECT-CD
	*  @param value
	**/
   public void setErrRejectCd(char[] value) {
      errRejectCd = checkErrRejectCdConstraints(value);
      serializeErrRejectCd(errRejectCd);
   } 

     /**
	 * 	Update ErrRejectCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrRejectCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrRejectCd,errRejectCd.length);
   	
   }
   
   public void setErrRejectCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectCd,errRejectCd.length);
   	
   }
   
     /**
	 * 	Update ErrRejectCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrRejectCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrRejectCd with another Field
	 *	@param value
	 */
   public void setErrRejectCd(Field source) {
       replace(source,0,source.length(),beginErrRejectCd,ERR_REJECT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrRejectCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrRejectCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrRejectCd,ERR_REJECT_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrRejectCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrRejectCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errRejectReason
	 *	@return errRejectReason
	 */
   public char[] getErrRejectReason() throws CFException{
     if (isErrRejectReasonModified()) { 
        errRejectReason = refreshErrRejectReason();
     }
   		return errRejectReason;
   }

  
	/**
	*  set variable errRejectReason
	*  Corresponding COBOL Variable is WS-ERR-REJECT-REASON
	*  @param value
	**/
   public void setErrRejectReason(char[] value) {
      errRejectReason = checkErrRejectReasonConstraints(value);
      serializeErrRejectReason(errRejectReason);
   } 

     /**
	 * 	Update ErrRejectReason 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrRejectReason(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrRejectReason,errRejectReason.length);
   	
   }
   
   public void setErrRejectReason(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectReason,errRejectReason.length);
   	
   }
   
     /**
	 * 	Update ErrRejectReason 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrRejectReason(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectReason+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrRejectReason with another Field
	 *	@param value
	 */
   public void setErrRejectReason(Field source) {
       replace(source,0,source.length(),beginErrRejectReason,ERR_REJECT_REASON_LEN);
   	
   }  
   
     /**
	 * 	Update ErrRejectReason 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrRejectReason(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrRejectReason,ERR_REJECT_REASON_LEN);
   	
   }
   
     /**
	 * 	Update ErrRejectReason 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrRejectReason(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRejectReason+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ErrAcctRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          errCustAcct.initialize();
     
          errCodes.initialize();
     
         setErrRejectCd(CONSTANTS.SPACE_3);
         setErrRejectReason(CONSTANTS.SPACE_40);
   }

		public static int getErrAcctRecordFieldLength() {
			return ERR_ACCT_RECORD_LENGTH;
		}

}
  
