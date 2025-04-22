package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ErrPayloadMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921ErrPayloadMsg extends Ip82921ErrPayloadMsgSerialized { 
   

								private short ip82921PayloadQueryNo;

						private char[] ip82921PayloadGftDsn = Field.fillLowValue(44);

								private int ip82921PayloadLogicalSeq;

								private int ip82921PayloadTxnNum;

								private short ip82921PayloadFacCount;

						private char[] ip82921PayloadFaaPanStat = Field.fillLowValue(1);

						private char[] ip82921PayloadFaaCloseDt = Field.fillLowValue(10);
				private Ip82921FnsDataFields ip82921FnsDataFields = new Ip82921FnsDataFields();
	
	/**
	* Constructor for Ip82921ErrPayloadMsg
	**/
    public Ip82921ErrPayloadMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921ErrPayloadMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ErrPayloadMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip82921FnsDataFields.setParent(this,getStartOffset() + 68);
    } 

	/**
	 *	Returns the value of ip82921PayloadQueryNo
	 *	@return ip82921PayloadQueryNo
	 */
	public short getIp82921PayloadQueryNo() throws CFException {
        if (isIp82921PayloadQueryNoModified()) { 
           ip82921PayloadQueryNo = refreshIp82921PayloadQueryNo();
        }
   		return ip82921PayloadQueryNo;
	}
	
	/**
	 * 	Update Ip82921PayloadQueryNo with the passed value
	 *  Corresponding COBOL Variable is IP82921-PAYLOAD-QUERY-NO
	 *	@param number
	 */
	public void setIp82921PayloadQueryNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip82921PayloadQueryNo = checkIp82921PayloadQueryNoMaxLimit(number); 
		serializeIp82921PayloadQueryNo(ip82921PayloadQueryNo);
	}

	public void setIp82921PayloadQueryNo(int number) {
	    number = checkIp82921PayloadQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadQueryNo((short)number);
	}
	public void setIp82921PayloadQueryNo(long number) {
	    number = checkIp82921PayloadQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadQueryNo((short)number);
	}
	

	/**
	 *	Returns the value of ip82921PayloadGftDsn
	 *	@return ip82921PayloadGftDsn
	 */
   public char[] getIp82921PayloadGftDsn() throws CFException{
     if (isIp82921PayloadGftDsnModified()) { 
        ip82921PayloadGftDsn = refreshIp82921PayloadGftDsn();
     }
   		return ip82921PayloadGftDsn;
   }

  
	/**
	*  set variable ip82921PayloadGftDsn
	*  Corresponding COBOL Variable is IP82921-PAYLOAD-GFT-DSN
	*  @param value
	**/
   public void setIp82921PayloadGftDsn(char[] value) {
      ip82921PayloadGftDsn = checkIp82921PayloadGftDsnConstraints(value);
      serializeIp82921PayloadGftDsn(ip82921PayloadGftDsn);
   } 

     /**
	 * 	Update Ip82921PayloadGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921PayloadGftDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921PayloadGftDsn,ip82921PayloadGftDsn.length);
   	
   }
   
   public void setIp82921PayloadGftDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadGftDsn,ip82921PayloadGftDsn.length);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadGftDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921PayloadGftDsn with another Field
	 *	@param value
	 */
   public void setIp82921PayloadGftDsn(Field source) {
       replace(source,0,source.length(),beginIp82921PayloadGftDsn,IP_82921_PAYLOAD_GFT_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921PayloadGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921PayloadGftDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921PayloadGftDsn,IP_82921_PAYLOAD_GFT_DSN_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadGftDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921PayloadLogicalSeq
	 *	@return ip82921PayloadLogicalSeq
	 */
	public int getIp82921PayloadLogicalSeq() throws CFException {
        if (isIp82921PayloadLogicalSeqModified()) { 
           ip82921PayloadLogicalSeq = refreshIp82921PayloadLogicalSeq();
        }
   		return ip82921PayloadLogicalSeq;
	}
	
	/**
	 * 	Update Ip82921PayloadLogicalSeq with the passed value
	 *  Corresponding COBOL Variable is IP82921-PAYLOAD-LOGICAL-SEQ
	 *	@param number
	 */
	public void setIp82921PayloadLogicalSeq(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip82921PayloadLogicalSeq = checkIp82921PayloadLogicalSeqMaxLimit(number); 
		serializeIp82921PayloadLogicalSeq(ip82921PayloadLogicalSeq);
	}


	public void setIp82921PayloadLogicalSeq(long number) {
	    number = checkIp82921PayloadLogicalSeqMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadLogicalSeq((int)number);
	}
	
	public int getIp82921PayloadTxnNum() throws CFException {
        if (isIp82921PayloadTxnNumModified()) { 
           ip82921PayloadTxnNum = refreshIp82921PayloadTxnNum();
        }
   		return ip82921PayloadTxnNum;
	}
	
	/**
	 * 	Update Ip82921PayloadTxnNum with the passed value
	 *  Corresponding COBOL Variable is IP82921-PAYLOAD-TXN-NUM
	 *	@param number
	 */
	public void setIp82921PayloadTxnNum(int number) {
			ip82921PayloadTxnNum = checkIp82921PayloadTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp82921PayloadTxnNum(ip82921PayloadTxnNum);
	}


	public void setIp82921PayloadTxnNum(long number) {
	    number = checkIp82921PayloadTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadTxnNum((int)number);
	}
	
	/**
	 *	Returns the value of ip82921PayloadFacCount
	 *	@return ip82921PayloadFacCount
	 */
	public short getIp82921PayloadFacCount() throws CFException {
        if (isIp82921PayloadFacCountModified()) { 
           ip82921PayloadFacCount = refreshIp82921PayloadFacCount();
        }
   		return ip82921PayloadFacCount;
	}
	
	/**
	 * 	Update Ip82921PayloadFacCount with the passed value
	 *  Corresponding COBOL Variable is IP82921-PAYLOAD-FAC-COUNT
	 *	@param number
	 */
	public void setIp82921PayloadFacCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip82921PayloadFacCount = checkIp82921PayloadFacCountMaxLimit(number); 
		serializeIp82921PayloadFacCount(ip82921PayloadFacCount);
	}

	public void setIp82921PayloadFacCount(int number) {
	    number = checkIp82921PayloadFacCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadFacCount((short)number);
	}
	public void setIp82921PayloadFacCount(long number) {
	    number = checkIp82921PayloadFacCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921PayloadFacCount((short)number);
	}
	

	/**
	 *	Returns the value of ip82921PayloadFaaPanStat
	 *	@return ip82921PayloadFaaPanStat
	 */
   public char[] getIp82921PayloadFaaPanStat() throws CFException{
     if (isIp82921PayloadFaaPanStatModified()) { 
        ip82921PayloadFaaPanStat = refreshIp82921PayloadFaaPanStat();
     }
   		return ip82921PayloadFaaPanStat;
   }

  
	/**
	*  set variable ip82921PayloadFaaPanStat
	*  Corresponding COBOL Variable is IP82921-PAYLOAD-FAA-PAN-STAT
	*  @param value
	**/
   public void setIp82921PayloadFaaPanStat(char[] value) {
      ip82921PayloadFaaPanStat = checkIp82921PayloadFaaPanStatConstraints(value);
      serializeIp82921PayloadFaaPanStat(ip82921PayloadFaaPanStat);
   } 

     /**
	 * 	Update Ip82921PayloadFaaPanStat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921PayloadFaaPanStat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921PayloadFaaPanStat,ip82921PayloadFaaPanStat.length);
   	
   }
   
   public void setIp82921PayloadFaaPanStat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaPanStat,ip82921PayloadFaaPanStat.length);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadFaaPanStat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadFaaPanStat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaPanStat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921PayloadFaaPanStat with another Field
	 *	@param value
	 */
   public void setIp82921PayloadFaaPanStat(Field source) {
       replace(source,0,source.length(),beginIp82921PayloadFaaPanStat,IP_82921_PAYLOAD_FAA_PAN_STAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921PayloadFaaPanStat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921PayloadFaaPanStat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaPanStat,IP_82921_PAYLOAD_FAA_PAN_STAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadFaaPanStat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadFaaPanStat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaPanStat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921PayloadFaaCloseDt
	 *	@return ip82921PayloadFaaCloseDt
	 */
   public char[] getIp82921PayloadFaaCloseDt() throws CFException{
     if (isIp82921PayloadFaaCloseDtModified()) { 
        ip82921PayloadFaaCloseDt = refreshIp82921PayloadFaaCloseDt();
     }
   		return ip82921PayloadFaaCloseDt;
   }

  
	/**
	*  set variable ip82921PayloadFaaCloseDt
	*  Corresponding COBOL Variable is IP82921-PAYLOAD-FAA-CLOSE-DT
	*  @param value
	**/
   public void setIp82921PayloadFaaCloseDt(char[] value) {
      ip82921PayloadFaaCloseDt = checkIp82921PayloadFaaCloseDtConstraints(value);
      serializeIp82921PayloadFaaCloseDt(ip82921PayloadFaaCloseDt);
   } 

     /**
	 * 	Update Ip82921PayloadFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921PayloadFaaCloseDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921PayloadFaaCloseDt,ip82921PayloadFaaCloseDt.length);
   	
   }
   
   public void setIp82921PayloadFaaCloseDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaCloseDt,ip82921PayloadFaaCloseDt.length);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaCloseDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921PayloadFaaCloseDt with another Field
	 *	@param value
	 */
   public void setIp82921PayloadFaaCloseDt(Field source) {
       replace(source,0,source.length(),beginIp82921PayloadFaaCloseDt,IP_82921_PAYLOAD_FAA_CLOSE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921PayloadFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921PayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaCloseDt,IP_82921_PAYLOAD_FAA_CLOSE_DT_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921PayloadFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PayloadFaaCloseDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921FnsDataFields
	 *	@return ip82921FnsDataFields
	 */   
	 public Ip82921FnsDataFields getIp82921FnsDataFields() {
   	return ip82921FnsDataFields;
   }
   /**
	* 	Update Ip82921FnsDataFields with the passed value
	*   Corresponding COBOL Variable is IP82921-FNS-DATA-FIELDS
	*	@param value
	*/
   public void setIp82921FnsDataFields(char[] value) {
      ip82921FnsDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921FnsDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921FnsDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FnsDataFields.begin,ip82921FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip82921FnsDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FnsDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FnsDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921FnsDataFields with another Field
	 *	@param value
	 */
   public void setIp82921FnsDataFields(Field source) {
   	replace(source,0,source.length(),ip82921FnsDataFields.begin,ip82921FnsDataFields.length());
   }  
   
     /**
	 * 	Update Ip82921FnsDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921FnsDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FnsDataFields.begin,ip82921FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip82921FnsDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FnsDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FnsDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip82921ErrPayloadMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp82921PayloadQueryNo((short)0);
         setIp82921PayloadGftDsn(CONSTANTS.SPACE_44);
                     setIp82921PayloadLogicalSeq(0);
                     setIp82921PayloadTxnNum(0);
         	setIp82921PayloadFacCount((short)0);
         setIp82921PayloadFaaPanStat(CONSTANTS.SPACE);
         setIp82921PayloadFaaCloseDt(CONSTANTS.SPACE_10);
          ip82921FnsDataFields.initialize();
     
   }

		public static int getIp82921ErrPayloadMsgFieldLength() {
			return IP_82921_ERR_PAYLOAD_MSG_LENGTH;
		}

}
  
