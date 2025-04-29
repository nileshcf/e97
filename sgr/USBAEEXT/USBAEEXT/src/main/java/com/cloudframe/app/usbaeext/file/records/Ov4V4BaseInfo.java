package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4V4BaseInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4V4BaseInfo extends Ov4V4BaseInfoSerialized { 
   

						private char[] ov4ClerkId = Field.fillLowValue(8);

						private char[] ov4AcctCd = Field.fillLowValue(2);

						private char[] ov4SrcReceiptCd = Field.fillLowValue(6);

						private char[] ov4SrcErrorCd = Field.fillLowValue(6);

						private char[] ov4TypeCd = Field.fillLowValue(2);

								private long ov4GlAccountNumber;

						private char[] ov4CurrentDate = new char[10];

	
	/**
	* Constructor for Ov4V4BaseInfo
	**/
    public Ov4V4BaseInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4V4BaseInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4V4BaseInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setOv4CurrentDate(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 52
             ,6
             );
    } 

	/**
	 *	Returns the value of ov4ClerkId
	 *	@return ov4ClerkId
	 */
   public char[] getOv4ClerkId() throws CFException{
     if (isOv4ClerkIdModified()) { 
        ov4ClerkId = refreshOv4ClerkId();
     }
   		return ov4ClerkId;
   }

  
	/**
	*  set variable ov4ClerkId
	*  Corresponding COBOL Variable is OV4-CLERK-ID
	*  @param value
	**/
   public void setOv4ClerkId(char[] value) {
      ov4ClerkId = checkOv4ClerkIdConstraints(value);
      serializeOv4ClerkId(ov4ClerkId);
   } 

     /**
	 * 	Update Ov4ClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4ClerkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4ClerkId,ov4ClerkId.length);
   	
   }
   
   public void setOv4ClerkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4ClerkId,ov4ClerkId.length);
   	
   }
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4ClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4ClerkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4ClerkId with another Field
	 *	@param value
	 */
   public void setOv4ClerkId(Field source) {
       replace(source,0,source.length(),beginOv4ClerkId,OV_4_CLERK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4ClerkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4ClerkId,OV_4_CLERK_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ov4ClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4ClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4ClerkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4AcctCd
	 *	@return ov4AcctCd
	 */
   public char[] getOv4AcctCd() throws CFException{
     if (isOv4AcctCdModified()) { 
        ov4AcctCd = refreshOv4AcctCd();
     }
   		return ov4AcctCd;
   }

  
	/**
	*  set variable ov4AcctCd
	*  Corresponding COBOL Variable is OV4-ACCT-CD
	*  @param value
	**/
   public void setOv4AcctCd(char[] value) {
      ov4AcctCd = checkOv4AcctCdConstraints(value);
      serializeOv4AcctCd(ov4AcctCd);
   } 

     /**
	 * 	Update Ov4AcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AcctCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4AcctCd,ov4AcctCd.length);
   	
   }
   
   public void setOv4AcctCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctCd,ov4AcctCd.length);
   	
   }
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4AcctCd with another Field
	 *	@param value
	 */
   public void setOv4AcctCd(Field source) {
       replace(source,0,source.length(),beginOv4AcctCd,OV_4_ACCT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AcctCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4AcctCd,OV_4_ACCT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ov4AcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4SrcReceiptCd
	 *	@return ov4SrcReceiptCd
	 */
   public char[] getOv4SrcReceiptCd() throws CFException{
     if (isOv4SrcReceiptCdModified()) { 
        ov4SrcReceiptCd = refreshOv4SrcReceiptCd();
     }
   		return ov4SrcReceiptCd;
   }

  
	/**
	*  set variable ov4SrcReceiptCd
	*  Corresponding COBOL Variable is OV4-SRC-RECEIPT-CD
	*  @param value
	**/
   public void setOv4SrcReceiptCd(char[] value) {
      ov4SrcReceiptCd = checkOv4SrcReceiptCdConstraints(value);
      serializeOv4SrcReceiptCd(ov4SrcReceiptCd);
   } 

     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4SrcReceiptCd,ov4SrcReceiptCd.length);
   	
   }
   
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcReceiptCd,ov4SrcReceiptCd.length);
   	
   }
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcReceiptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4SrcReceiptCd with another Field
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source) {
       replace(source,0,source.length(),beginOv4SrcReceiptCd,OV_4_SRC_RECEIPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4SrcReceiptCd,OV_4_SRC_RECEIPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ov4SrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcReceiptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4SrcErrorCd
	 *	@return ov4SrcErrorCd
	 */
   public char[] getOv4SrcErrorCd() throws CFException{
     if (isOv4SrcErrorCdModified()) { 
        ov4SrcErrorCd = refreshOv4SrcErrorCd();
     }
   		return ov4SrcErrorCd;
   }

  
	/**
	*  set variable ov4SrcErrorCd
	*  Corresponding COBOL Variable is OV4-SRC-ERROR-CD
	*  @param value
	**/
   public void setOv4SrcErrorCd(char[] value) {
      ov4SrcErrorCd = checkOv4SrcErrorCdConstraints(value);
      serializeOv4SrcErrorCd(ov4SrcErrorCd);
   } 

     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4SrcErrorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4SrcErrorCd,ov4SrcErrorCd.length);
   	
   }
   
   public void setOv4SrcErrorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcErrorCd,ov4SrcErrorCd.length);
   	
   }
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcErrorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4SrcErrorCd with another Field
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source) {
       replace(source,0,source.length(),beginOv4SrcErrorCd,OV_4_SRC_ERROR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4SrcErrorCd,OV_4_SRC_ERROR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ov4SrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4SrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4SrcErrorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4TypeCd
	 *	@return ov4TypeCd
	 */
   public char[] getOv4TypeCd() throws CFException{
     if (isOv4TypeCdModified()) { 
        ov4TypeCd = refreshOv4TypeCd();
     }
   		return ov4TypeCd;
   }

  
	/**
	*  set variable ov4TypeCd
	*  Corresponding COBOL Variable is OV4-TYPE-CD
	*  @param value
	**/
   public void setOv4TypeCd(char[] value) {
      ov4TypeCd = checkOv4TypeCdConstraints(value);
      serializeOv4TypeCd(ov4TypeCd);
   } 

     /**
	 * 	Update Ov4TypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4TypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4TypeCd,ov4TypeCd.length);
   	
   }
   
   public void setOv4TypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4TypeCd,ov4TypeCd.length);
   	
   }
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4TypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4TypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4TypeCd with another Field
	 *	@param value
	 */
   public void setOv4TypeCd(Field source) {
       replace(source,0,source.length(),beginOv4TypeCd,OV_4_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4TypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4TypeCd,OV_4_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ov4TypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4TypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4TypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4GlAccountNumber
	 *	@return ov4GlAccountNumber
	 */
	public long getOv4GlAccountNumber() throws CFException {
       if (isOv4GlAccountNumberModified()) { 
           ov4GlAccountNumber = refreshOv4GlAccountNumber();
        }
   		return ov4GlAccountNumber;
	}
	

	
	   
	/**
	 * 	Update Ov4GlAccountNumber with the passed value
	 *  Corresponding COBOL Variable is OV4-GL-ACCOUNT-NUMBER
	 *	@param number
	 */
	public void setOv4GlAccountNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4GlAccountNumber = checkOv4GlAccountNumberMaxLimit(number); 
		serializeOv4GlAccountNumber(ov4GlAccountNumber);
	}
	

	/**
	 * 	Update Ov4GlAccountNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4GlAccountNumber(char[] value) throws CFException {
		 ov4GlAccountNumber = serializeOv4GlAccountNumber(value);
	}
	/**
	 * 	Update Ov4GlAccountNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4GlAccountNumberString(char[] value) throws CFException {
		 setOv4GlAccountNumber(value);
	}
	/**
	 *	Returns the value of ov4CurrentDate
	 *	@return ov4CurrentDate
	 */
   public char[] getOv4CurrentDate() throws CFException{
     if (isOv4CurrentDateModified()) { 
        ov4CurrentDate = refreshOv4CurrentDate();
     }
   		return ov4CurrentDate;
   }

  
	/**
	*  set variable ov4CurrentDate
	*  Corresponding COBOL Variable is OV4-CURRENT-DATE
	*  @param value
	**/
   public void setOv4CurrentDate(char[] value) {
      ov4CurrentDate = checkOv4CurrentDateConstraints(value);
      serializeOv4CurrentDate(ov4CurrentDate);
   } 

     /**
	 * 	Update Ov4CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4CurrentDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4CurrentDate,ov4CurrentDate.length);
   	
   }
   
   public void setOv4CurrentDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CurrentDate,ov4CurrentDate.length);
   	
   }
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CurrentDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4CurrentDate with another Field
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source) {
       replace(source,0,source.length(),beginOv4CurrentDate,OV_4_CURRENT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4CurrentDate,OV_4_CURRENT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ov4CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CurrentDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOv4V4BaseInfoFieldLength() {
			return OV_4_V_4_BASE_INFO_LENGTH;
		}

}
  
