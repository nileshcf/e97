package com.cloudframe.app.ip829010.dto;

/**
*  The class FraudMqDebugDisp600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FraudMqDebugDisp600 extends FraudMqDebugDisp600Serialized {
   

						private char[] primaryAcctNo600 = new char[19];

						private char[] expirDate600 = new char[6];

						private char[] virtualAcctNo600 = new char[19];

								private int queryNum600;

						private char[] gftDsn600 = new char[44];

								private long logicalSeq600;

								private long txnNo600;

								private long facCount600;

						private char[] faaPanStatCd600 = new char[1];

						private char[] faaClsDt600 = new char[10];
	
	/**
	* Constructor for FraudMqDebugDisp600
	**/
    public FraudMqDebugDisp600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPrimaryAcctNo600(fillSpace(19));
								setExpirDate600(fillSpace(6));
								setVirtualAcctNo600(fillSpace(19));
								setQueryNum600(0);
								setGftDsn600(fillSpace(44));
								setLogicalSeq600(0L);
								setTxnNo600(0L);
								setFacCount600(0L);
								setFaaPanStatCd600("0".toCharArray());
								setFaaClsDt600("0000000000".toCharArray());
    }


 

	/**
	 *	Returns the value of primaryAcctNo600
	 *	@return primaryAcctNo600
	 */
   public char[] getPrimaryAcctNo600() throws CFException{
     if (isPrimaryAcctNo600Modified()) { 
        primaryAcctNo600 = refreshPrimaryAcctNo600();
     }
   		return primaryAcctNo600;
   }

  
	/**
	*  set variable primaryAcctNo600
	*  Corresponding COBOL Variable is 600-PRIMARY-ACCT-NO
	*  @param value
	**/
   public void setPrimaryAcctNo600(char[] value) {
      primaryAcctNo600 = checkPrimaryAcctNo600Constraints(value);
      serializePrimaryAcctNo600(primaryAcctNo600);
   } 

     /**
	 * 	Update PrimaryAcctNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrimaryAcctNo600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrimaryAcctNo600,primaryAcctNo600.length);
   	
   }
   
   public void setPrimaryAcctNo600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrimaryAcctNo600,primaryAcctNo600.length);
   	
   }
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrimaryAcctNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrimaryAcctNo600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrimaryAcctNo600 with another Field
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source) {
       replace(source,0,source.length(),beginPrimaryAcctNo600,PRIMARY_ACCT_NO_600_LEN);
   	
   }  
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrimaryAcctNo600,PRIMARY_ACCT_NO_600_LEN);
   	
   }
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrimaryAcctNo600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of expirDate600
	 *	@return expirDate600
	 */
   public char[] getExpirDate600() throws CFException{
     if (isExpirDate600Modified()) { 
        expirDate600 = refreshExpirDate600();
     }
   		return expirDate600;
   }

  
	/**
	*  set variable expirDate600
	*  Corresponding COBOL Variable is 600-EXPIR-DATE
	*  @param value
	**/
   public void setExpirDate600(char[] value) {
      expirDate600 = checkExpirDate600Constraints(value);
      serializeExpirDate600(expirDate600);
   } 

     /**
	 * 	Update ExpirDate600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExpirDate600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExpirDate600,expirDate600.length);
   	
   }
   
   public void setExpirDate600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExpirDate600,expirDate600.length);
   	
   }
   
     /**
	 * 	Update ExpirDate600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExpirDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExpirDate600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExpirDate600 with another Field
	 *	@param value
	 */
   public void setExpirDate600(Field source) {
       replace(source,0,source.length(),beginExpirDate600,EXPIR_DATE_600_LEN);
   	
   }  
   
     /**
	 * 	Update ExpirDate600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExpirDate600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExpirDate600,EXPIR_DATE_600_LEN);
   	
   }
   
     /**
	 * 	Update ExpirDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExpirDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExpirDate600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of virtualAcctNo600
	 *	@return virtualAcctNo600
	 */
   public char[] getVirtualAcctNo600() throws CFException{
     if (isVirtualAcctNo600Modified()) { 
        virtualAcctNo600 = refreshVirtualAcctNo600();
     }
   		return virtualAcctNo600;
   }

  
	/**
	*  set variable virtualAcctNo600
	*  Corresponding COBOL Variable is 600-VIRTUAL-ACCT-NO
	*  @param value
	**/
   public void setVirtualAcctNo600(char[] value) {
      virtualAcctNo600 = checkVirtualAcctNo600Constraints(value);
      serializeVirtualAcctNo600(virtualAcctNo600);
   } 

     /**
	 * 	Update VirtualAcctNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAcctNo600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVirtualAcctNo600,virtualAcctNo600.length);
   	
   }
   
   public void setVirtualAcctNo600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAcctNo600,virtualAcctNo600.length);
   	
   }
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAcctNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAcctNo600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VirtualAcctNo600 with another Field
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source) {
       replace(source,0,source.length(),beginVirtualAcctNo600,VIRTUAL_ACCT_NO_600_LEN);
   	
   }  
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVirtualAcctNo600,VIRTUAL_ACCT_NO_600_LEN);
   	
   }
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAcctNo600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of queryNum600
	 *	@return queryNum600
	 */
	public int getQueryNum600() throws CFException {
       if (isQueryNum600Modified()) { 
           queryNum600 = refreshQueryNum600();
        }
   		return queryNum600;
	}
	

	
	   
	/**
	 * 	Update QueryNum600 with the passed value
	 *  Corresponding COBOL Variable is 600-QUERY-NUM
	 *	@param number
	 */
	public void setQueryNum600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    queryNum600 = checkQueryNum600MaxLimit(number); 
		serializeQueryNum600(queryNum600);
	}
	

	public void setQueryNum600(long number) {
	    number = checkQueryNum600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setQueryNum600((int)number);
	}
	
	/**
	 * 	Update QueryNum600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setQueryNum600(char[] value) throws CFException {
		 queryNum600 = serializeQueryNum600(value);
	}
	/**
	 * 	Update QueryNum600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setQueryNum600String(char[] value) throws CFException {
		 setQueryNum600(value);
	}
	/**
	 *	Returns the value of gftDsn600
	 *	@return gftDsn600
	 */
   public char[] getGftDsn600() throws CFException{
     if (isGftDsn600Modified()) { 
        gftDsn600 = refreshGftDsn600();
     }
   		return gftDsn600;
   }

  
	/**
	*  set variable gftDsn600
	*  Corresponding COBOL Variable is 600-GFT-DSN
	*  @param value
	**/
   public void setGftDsn600(char[] value) {
      gftDsn600 = checkGftDsn600Constraints(value);
      serializeGftDsn600(gftDsn600);
   } 

     /**
	 * 	Update GftDsn600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftDsn600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftDsn600,gftDsn600.length);
   	
   }
   
   public void setGftDsn600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftDsn600,gftDsn600.length);
   	
   }
   
     /**
	 * 	Update GftDsn600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftDsn600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftDsn600 with another Field
	 *	@param value
	 */
   public void setGftDsn600(Field source) {
       replace(source,0,source.length(),beginGftDsn600,GFT_DSN_600_LEN);
   	
   }  
   
     /**
	 * 	Update GftDsn600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftDsn600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftDsn600,GFT_DSN_600_LEN);
   	
   }
   
     /**
	 * 	Update GftDsn600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftDsn600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logicalSeq600
	 *	@return logicalSeq600
	 */
	public long getLogicalSeq600() throws CFException {
       if (isLogicalSeq600Modified()) { 
           logicalSeq600 = refreshLogicalSeq600();
        }
   		return logicalSeq600;
	}
	

	
	   
	/**
	 * 	Update LogicalSeq600 with the passed value
	 *  Corresponding COBOL Variable is 600-LOGICAL-SEQ
	 *	@param number
	 */
	public void setLogicalSeq600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    logicalSeq600 = checkLogicalSeq600MaxLimit(number); 
		serializeLogicalSeq600(logicalSeq600);
	}
	

	/**
	 * 	Update LogicalSeq600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLogicalSeq600(char[] value) throws CFException {
		 logicalSeq600 = serializeLogicalSeq600(value);
	}
	/**
	 * 	Update LogicalSeq600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLogicalSeq600String(char[] value) throws CFException {
		 setLogicalSeq600(value);
	}
	/**
	 *	Returns the value of txnNo600
	 *	@return txnNo600
	 */
	public long getTxnNo600() throws CFException {
       if (isTxnNo600Modified()) { 
           txnNo600 = refreshTxnNo600();
        }
   		return txnNo600;
	}
	

	
	   
	/**
	 * 	Update TxnNo600 with the passed value
	 *  Corresponding COBOL Variable is 600-TXN-NO
	 *	@param number
	 */
	public void setTxnNo600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    txnNo600 = checkTxnNo600MaxLimit(number); 
		serializeTxnNo600(txnNo600);
	}
	

	/**
	 * 	Update TxnNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnNo600(char[] value) throws CFException {
		 txnNo600 = serializeTxnNo600(value);
	}
	/**
	 * 	Update TxnNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnNo600String(char[] value) throws CFException {
		 setTxnNo600(value);
	}
	/**
	 *	Returns the value of facCount600
	 *	@return facCount600
	 */
	public long getFacCount600() throws CFException {
       if (isFacCount600Modified()) { 
           facCount600 = refreshFacCount600();
        }
   		return facCount600;
	}
	

	
	   
	/**
	 * 	Update FacCount600 with the passed value
	 *  Corresponding COBOL Variable is 600-FAC-COUNT
	 *	@param number
	 */
	public void setFacCount600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    facCount600 = checkFacCount600MaxLimit(number); 
		serializeFacCount600(facCount600);
	}
	

	/**
	 * 	Update FacCount600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFacCount600(char[] value) throws CFException {
		 facCount600 = serializeFacCount600(value);
	}
	/**
	 * 	Update FacCount600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFacCount600String(char[] value) throws CFException {
		 setFacCount600(value);
	}
	/**
	 *	Returns the value of faaPanStatCd600
	 *	@return faaPanStatCd600
	 */
   public char[] getFaaPanStatCd600() throws CFException{
     if (isFaaPanStatCd600Modified()) { 
        faaPanStatCd600 = refreshFaaPanStatCd600();
     }
   		return faaPanStatCd600;
   }

  
	/**
	*  set variable faaPanStatCd600
	*  Corresponding COBOL Variable is 600-FAA-PAN-STAT-CD
	*  @param value
	**/
   public void setFaaPanStatCd600(char[] value) {
      faaPanStatCd600 = checkFaaPanStatCd600Constraints(value);
      serializeFaaPanStatCd600(faaPanStatCd600);
   } 

     /**
	 * 	Update FaaPanStatCd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFaaPanStatCd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFaaPanStatCd600,faaPanStatCd600.length);
   	
   }
   
   public void setFaaPanStatCd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFaaPanStatCd600,faaPanStatCd600.length);
   	
   }
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFaaPanStatCd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFaaPanStatCd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FaaPanStatCd600 with another Field
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source) {
       replace(source,0,source.length(),beginFaaPanStatCd600,FAA_PAN_STAT_CD_600_LEN);
   	
   }  
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFaaPanStatCd600,FAA_PAN_STAT_CD_600_LEN);
   	
   }
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFaaPanStatCd600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of faaClsDt600
	 *	@return faaClsDt600
	 */
   public char[] getFaaClsDt600() throws CFException{
     if (isFaaClsDt600Modified()) { 
        faaClsDt600 = refreshFaaClsDt600();
     }
   		return faaClsDt600;
   }

  
	/**
	*  set variable faaClsDt600
	*  Corresponding COBOL Variable is 600-FAA-CLS-DT
	*  @param value
	**/
   public void setFaaClsDt600(char[] value) {
      faaClsDt600 = checkFaaClsDt600Constraints(value);
      serializeFaaClsDt600(faaClsDt600);
   } 

     /**
	 * 	Update FaaClsDt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFaaClsDt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFaaClsDt600,faaClsDt600.length);
   	
   }
   
   public void setFaaClsDt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFaaClsDt600,faaClsDt600.length);
   	
   }
   
     /**
	 * 	Update FaaClsDt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFaaClsDt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFaaClsDt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FaaClsDt600 with another Field
	 *	@param value
	 */
   public void setFaaClsDt600(Field source) {
       replace(source,0,source.length(),beginFaaClsDt600,FAA_CLS_DT_600_LEN);
   	
   }  
   
     /**
	 * 	Update FaaClsDt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFaaClsDt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFaaClsDt600,FAA_CLS_DT_600_LEN);
   	
   }
   
     /**
	 * 	Update FaaClsDt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFaaClsDt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFaaClsDt600+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FraudMqDebugDisp600
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPrimaryAcctNo600(CONSTANTS.SPACE_19);
         setExpirDate600(CONSTANTS.SPACE_6);
         setVirtualAcctNo600(CONSTANTS.SPACE_19);
                     setQueryNum600(0);
         setGftDsn600(CONSTANTS.SPACE_44);
                     setLogicalSeq600(0);
                     setTxnNo600(0);
                     setFacCount600(0);
         setFaaPanStatCd600(CONSTANTS.SPACE);
         setFaaClsDt600(CONSTANTS.SPACE_10);
   }

		public static int getFraudMqDebugDisp600FieldLength() {
			return FRAUD_MQ_DEBUG_DISP_600_LENGTH;
		}

}
  
