package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_fnsPldRd")

public class FnsPldRd extends FnsPldRdSerialized  implements InitializingBean {
   

								private short fnsPldRdQueryNo;

						private char[] fnsPldRdGftDsn = Field.fillLowValue(44);

								private int fnsPldRdLogicalSeq;

								private int fnsPldRdTxnNum;

								private short fnsPldRdCount;

						private char[] fnsPldRdFaaPanStatCd = Field.fillLowValue(1);

						private char[] fnsPldRdFaaCloseDt = Field.fillLowValue(10);
				private FnsPldRdFnsDataFields fnsPldRdFnsDataFields = new FnsPldRdFnsDataFields();
	
	/**
	* Constructor for FnsPldRd
	**/
    public FnsPldRd() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			fnsPldRdFnsDataFields.setParent(this,getStartOffset() + 68);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fnsPldRdQueryNo
	 *	@return fnsPldRdQueryNo
	 */
	public short getFnsPldRdQueryNo() throws CFException {
        if (isFnsPldRdQueryNoModified()) { 
           fnsPldRdQueryNo = refreshFnsPldRdQueryNo();
        }
   		return fnsPldRdQueryNo;
	}
	
	/**
	 * 	Update FnsPldRdQueryNo with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-QUERY-NO
	 *	@param number
	 */
	public void setFnsPldRdQueryNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPldRdQueryNo = checkFnsPldRdQueryNoMaxLimit(number); 
		serializeFnsPldRdQueryNo(fnsPldRdQueryNo);
	}

	public void setFnsPldRdQueryNo(int number) {
	    number = checkFnsPldRdQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdQueryNo((short)number);
	}
	public void setFnsPldRdQueryNo(long number) {
	    number = checkFnsPldRdQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdQueryNo((short)number);
	}
	

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException{
     if (isFnsPldRdGftDsnModified()) { 
        fnsPldRdGftDsn = refreshFnsPldRdGftDsn();
     }
   		return fnsPldRdGftDsn;
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  Corresponding COBOL Variable is FNS-PLD-RD-GFT-DSN
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) {
      fnsPldRdGftDsn = checkFnsPldRdGftDsnConstraints(value);
      serializeFnsPldRdGftDsn(fnsPldRdGftDsn);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdGftDsn,fnsPldRdGftDsn.length);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdGftDsn,fnsPldRdGftDsn.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdGftDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
       replace(source,0,source.length(),beginFnsPldRdGftDsn,FNS_PLD_RD_GFT_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdGftDsn,FNS_PLD_RD_GFT_DSN_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdGftDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {
        if (isFnsPldRdLogicalSeqModified()) { 
           fnsPldRdLogicalSeq = refreshFnsPldRdLogicalSeq();
        }
   		return fnsPldRdLogicalSeq;
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-LOGICAL-SEQ
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPldRdLogicalSeq = checkFnsPldRdLogicalSeqMaxLimit(number); 
		serializeFnsPldRdLogicalSeq(fnsPldRdLogicalSeq);
	}


	public void setFnsPldRdLogicalSeq(long number) {
	    number = checkFnsPldRdLogicalSeqMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdLogicalSeq((int)number);
	}
	
	public int getFnsPldRdTxnNum() throws CFException {
        if (isFnsPldRdTxnNumModified()) { 
           fnsPldRdTxnNum = refreshFnsPldRdTxnNum();
        }
   		return fnsPldRdTxnNum;
	}
	
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-TXN-NUM
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number) {
			fnsPldRdTxnNum = checkFnsPldRdTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFnsPldRdTxnNum(fnsPldRdTxnNum);
	}


	public void setFnsPldRdTxnNum(long number) {
	    number = checkFnsPldRdTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdTxnNum((int)number);
	}
	
	/**
	 *	Returns the value of fnsPldRdCount
	 *	@return fnsPldRdCount
	 */
	public short getFnsPldRdCount() throws CFException {
        if (isFnsPldRdCountModified()) { 
           fnsPldRdCount = refreshFnsPldRdCount();
        }
   		return fnsPldRdCount;
	}
	
	/**
	 * 	Update FnsPldRdCount with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-COUNT
	 *	@param number
	 */
	public void setFnsPldRdCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPldRdCount = checkFnsPldRdCountMaxLimit(number); 
		serializeFnsPldRdCount(fnsPldRdCount);
	}

	public void setFnsPldRdCount(int number) {
	    number = checkFnsPldRdCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdCount((short)number);
	}
	public void setFnsPldRdCount(long number) {
	    number = checkFnsPldRdCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdCount((short)number);
	}
	

	/**
	 *	Returns the value of fnsPldRdFaaPanStatCd
	 *	@return fnsPldRdFaaPanStatCd
	 */
   public char[] getFnsPldRdFaaPanStatCd() throws CFException{
     if (isFnsPldRdFaaPanStatCdModified()) { 
        fnsPldRdFaaPanStatCd = refreshFnsPldRdFaaPanStatCd();
     }
   		return fnsPldRdFaaPanStatCd;
   }

  
	/**
	*  set variable fnsPldRdFaaPanStatCd
	*  Corresponding COBOL Variable is FNS-PLD-RD-FAA-PAN-STAT-CD
	*  @param value
	**/
   public void setFnsPldRdFaaPanStatCd(char[] value) {
      fnsPldRdFaaPanStatCd = checkFnsPldRdFaaPanStatCdConstraints(value);
      serializeFnsPldRdFaaPanStatCd(fnsPldRdFaaPanStatCd);
   } 

     /**
	 * 	Update FnsPldRdFaaPanStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFaaPanStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdFaaPanStatCd,fnsPldRdFaaPanStatCd.length);
   	
   }
   
   public void setFnsPldRdFaaPanStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaPanStatCd,fnsPldRdFaaPanStatCd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdFaaPanStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFaaPanStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaPanStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdFaaPanStatCd with another Field
	 *	@param value
	 */
   public void setFnsPldRdFaaPanStatCd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdFaaPanStatCd,FNS_PLD_RD_FAA_PAN_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdFaaPanStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdFaaPanStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaPanStatCd,FNS_PLD_RD_FAA_PAN_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdFaaPanStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFaaPanStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaPanStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdFaaCloseDt
	 *	@return fnsPldRdFaaCloseDt
	 */
   public char[] getFnsPldRdFaaCloseDt() throws CFException{
     if (isFnsPldRdFaaCloseDtModified()) { 
        fnsPldRdFaaCloseDt = refreshFnsPldRdFaaCloseDt();
     }
   		return fnsPldRdFaaCloseDt;
   }

  
	/**
	*  set variable fnsPldRdFaaCloseDt
	*  Corresponding COBOL Variable is FNS-PLD-RD-FAA-CLOSE-DT
	*  @param value
	**/
   public void setFnsPldRdFaaCloseDt(char[] value) {
      fnsPldRdFaaCloseDt = checkFnsPldRdFaaCloseDtConstraints(value);
      serializeFnsPldRdFaaCloseDt(fnsPldRdFaaCloseDt);
   } 

     /**
	 * 	Update FnsPldRdFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFaaCloseDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdFaaCloseDt,fnsPldRdFaaCloseDt.length);
   	
   }
   
   public void setFnsPldRdFaaCloseDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaCloseDt,fnsPldRdFaaCloseDt.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaCloseDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdFaaCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPldRdFaaCloseDt(Field source) {
       replace(source,0,source.length(),beginFnsPldRdFaaCloseDt,FNS_PLD_RD_FAA_CLOSE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaCloseDt,FNS_PLD_RD_FAA_CLOSE_DT_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdFaaCloseDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdFnsDataFields
	 *	@return fnsPldRdFnsDataFields
	 */   
	 public FnsPldRdFnsDataFields getFnsPldRdFnsDataFields() {
   	return fnsPldRdFnsDataFields;
   }
   /**
	* 	Update FnsPldRdFnsDataFields with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-FNS-DATA-FIELDS
	*	@param value
	*/
   public void setFnsPldRdFnsDataFields(char[] value) {
      fnsPldRdFnsDataFields.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdFnsDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFnsDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFnsDataFields.begin,fnsPldRdFnsDataFields.length());
   }
   
     /**
	 * 	Update FnsPldRdFnsDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFnsDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFnsDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdFnsDataFields with another Field
	 *	@param value
	 */
   public void setFnsPldRdFnsDataFields(Field source) {
   	replace(source,0,source.length(),fnsPldRdFnsDataFields.begin,fnsPldRdFnsDataFields.length());
   }  
   
     /**
	 * 	Update FnsPldRdFnsDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFnsDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFnsDataFields.begin,fnsPldRdFnsDataFields.length());
   }
   
     /**
	 * 	Update FnsPldRdFnsDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFnsDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFnsDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPldRd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setFnsPldRdQueryNo((short)0);
         setFnsPldRdGftDsn(CONSTANTS.SPACE_44);
                     setFnsPldRdLogicalSeq(0);
                     setFnsPldRdTxnNum(0);
         	setFnsPldRdCount((short)0);
         setFnsPldRdFaaPanStatCd(CONSTANTS.SPACE);
         setFnsPldRdFaaCloseDt(CONSTANTS.SPACE_10);
          fnsPldRdFnsDataFields.initialize();
     
   }

		public static int getFnsPldRdFieldLength() {
			return FNS_PLD_RD_LENGTH;
		}

}
  
