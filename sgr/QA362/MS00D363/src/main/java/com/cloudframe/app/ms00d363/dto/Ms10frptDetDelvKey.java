package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptDetDelvKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ms10frptDetDelvKey extends Ms10frptDetDelvKeySerialized { 
   

						private char[] ms10frptDkeyRecType = Field.fillLowValue(2);

								private long ms10frptDkeyEndpt;

								private long ms10frptDkeyEntIca;

								private long ms10frptDkeyProc;

								private int ms10frptDkeyHier;

						private char[] ms10frptDkeyRptId = Field.fillLowValue(12);

								private long ms10frptDkeyWrkofYmd;

								private int ms10frptDkeyCutoffHhmm;

								private long ms10frptDkeyLnSeqno;

						private char[] ms10frptInhProcFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Ms10frptDetDelvKey
	**/
    public Ms10frptDetDelvKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ms10frptDetDelvKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ms10frptDkeyRecType
	 *	@return ms10frptDkeyRecType
	 */
   public char[] getMs10frptDkeyRecType() throws CFException{
     if (isMs10frptDkeyRecTypeModified()) { 
        ms10frptDkeyRecType = refreshMs10frptDkeyRecType();
     }
   		return ms10frptDkeyRecType;
   }

  
	/**
	*  set variable ms10frptDkeyRecType
	*  Corresponding COBOL Variable is MS10FRPT-DKEY-REC-TYPE
	*  @param value
	**/
   public void setMs10frptDkeyRecType(char[] value) {
      ms10frptDkeyRecType = checkMs10frptDkeyRecTypeConstraints(value);
      serializeMs10frptDkeyRecType(ms10frptDkeyRecType);
   } 

     /**
	 * 	Update Ms10frptDkeyRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDkeyRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptDkeyRecType,ms10frptDkeyRecType.length);
   	
   }
   
   public void setMs10frptDkeyRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRecType,ms10frptDkeyRecType.length);
   	
   }
   
     /**
	 * 	Update Ms10frptDkeyRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDkeyRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptDkeyRecType with another Field
	 *	@param value
	 */
   public void setMs10frptDkeyRecType(Field source) {
       replace(source,0,source.length(),beginMs10frptDkeyRecType,MS_10FRPT_DKEY_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptDkeyRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptDkeyRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRecType,MS_10FRPT_DKEY_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptDkeyRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDkeyRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRecType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptDkeyEndpt
	 *	@return ms10frptDkeyEndpt
	 */
	public long getMs10frptDkeyEndpt() throws CFException {
       if (isMs10frptDkeyEndptModified()) { 
           ms10frptDkeyEndpt = refreshMs10frptDkeyEndpt();
        }
   		return ms10frptDkeyEndpt;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyEndpt with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-ENDPT
	 *	@param number
	 */
	public void setMs10frptDkeyEndpt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyEndpt = checkMs10frptDkeyEndptMaxLimit(number); 
		serializeMs10frptDkeyEndpt(ms10frptDkeyEndpt);
	}
	

	/**
	 * 	Update Ms10frptDkeyEndpt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyEndpt(char[] value) throws CFException {
		 ms10frptDkeyEndpt = serializeMs10frptDkeyEndpt(value);
	}
	/**
	 * 	Update Ms10frptDkeyEndpt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyEndptString(char[] value) throws CFException {
		 setMs10frptDkeyEndpt(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyEntIca
	 *	@return ms10frptDkeyEntIca
	 */
	public long getMs10frptDkeyEntIca() throws CFException {
       if (isMs10frptDkeyEntIcaModified()) { 
           ms10frptDkeyEntIca = refreshMs10frptDkeyEntIca();
        }
   		return ms10frptDkeyEntIca;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyEntIca with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-ENT-ICA
	 *	@param number
	 */
	public void setMs10frptDkeyEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyEntIca = checkMs10frptDkeyEntIcaMaxLimit(number); 
		serializeMs10frptDkeyEntIca(ms10frptDkeyEntIca);
	}
	

	/**
	 * 	Update Ms10frptDkeyEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyEntIca(char[] value) throws CFException {
		 ms10frptDkeyEntIca = serializeMs10frptDkeyEntIca(value);
	}
	/**
	 * 	Update Ms10frptDkeyEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyEntIcaString(char[] value) throws CFException {
		 setMs10frptDkeyEntIca(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyProc
	 *	@return ms10frptDkeyProc
	 */
	public long getMs10frptDkeyProc() throws CFException {
       if (isMs10frptDkeyProcModified()) { 
           ms10frptDkeyProc = refreshMs10frptDkeyProc();
        }
   		return ms10frptDkeyProc;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyProc with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-PROC
	 *	@param number
	 */
	public void setMs10frptDkeyProc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyProc = checkMs10frptDkeyProcMaxLimit(number); 
		serializeMs10frptDkeyProc(ms10frptDkeyProc);
	}
	

	/**
	 * 	Update Ms10frptDkeyProc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyProc(char[] value) throws CFException {
		 ms10frptDkeyProc = serializeMs10frptDkeyProc(value);
	}
	/**
	 * 	Update Ms10frptDkeyProc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyProcString(char[] value) throws CFException {
		 setMs10frptDkeyProc(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyHier
	 *	@return ms10frptDkeyHier
	 */
	public int getMs10frptDkeyHier() throws CFException {
       if (isMs10frptDkeyHierModified()) { 
           ms10frptDkeyHier = refreshMs10frptDkeyHier();
        }
   		return ms10frptDkeyHier;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyHier with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-HIER
	 *	@param number
	 */
	public void setMs10frptDkeyHier(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyHier = checkMs10frptDkeyHierMaxLimit(number); 
		serializeMs10frptDkeyHier(ms10frptDkeyHier);
	}
	

	public void setMs10frptDkeyHier(long number) {
	    number = checkMs10frptDkeyHierMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMs10frptDkeyHier((int)number);
	}
	
	/**
	 * 	Update Ms10frptDkeyHier with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyHier(char[] value) throws CFException {
		 ms10frptDkeyHier = serializeMs10frptDkeyHier(value);
	}
	/**
	 * 	Update Ms10frptDkeyHier with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyHierString(char[] value) throws CFException {
		 setMs10frptDkeyHier(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyRptId
	 *	@return ms10frptDkeyRptId
	 */
   public char[] getMs10frptDkeyRptId() throws CFException{
     if (isMs10frptDkeyRptIdModified()) { 
        ms10frptDkeyRptId = refreshMs10frptDkeyRptId();
     }
   		return ms10frptDkeyRptId;
   }

  
	/**
	*  set variable ms10frptDkeyRptId
	*  Corresponding COBOL Variable is MS10FRPT-DKEY-RPT-ID
	*  @param value
	**/
   public void setMs10frptDkeyRptId(char[] value) {
      ms10frptDkeyRptId = checkMs10frptDkeyRptIdConstraints(value);
      serializeMs10frptDkeyRptId(ms10frptDkeyRptId);
   } 

     /**
	 * 	Update Ms10frptDkeyRptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDkeyRptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptDkeyRptId,ms10frptDkeyRptId.length);
   	
   }
   
   public void setMs10frptDkeyRptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRptId,ms10frptDkeyRptId.length);
   	
   }
   
     /**
	 * 	Update Ms10frptDkeyRptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDkeyRptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptDkeyRptId with another Field
	 *	@param value
	 */
   public void setMs10frptDkeyRptId(Field source) {
       replace(source,0,source.length(),beginMs10frptDkeyRptId,MS_10FRPT_DKEY_RPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptDkeyRptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptDkeyRptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRptId,MS_10FRPT_DKEY_RPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptDkeyRptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDkeyRptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDkeyRptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptDkeyWrkofYmd
	 *	@return ms10frptDkeyWrkofYmd
	 */
	public long getMs10frptDkeyWrkofYmd() throws CFException {
       if (isMs10frptDkeyWrkofYmdModified()) { 
           ms10frptDkeyWrkofYmd = refreshMs10frptDkeyWrkofYmd();
        }
   		return ms10frptDkeyWrkofYmd;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyWrkofYmd with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-WRKOF-YMD
	 *	@param number
	 */
	public void setMs10frptDkeyWrkofYmd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyWrkofYmd = checkMs10frptDkeyWrkofYmdMaxLimit(number); 
		serializeMs10frptDkeyWrkofYmd(ms10frptDkeyWrkofYmd);
	}
	

	/**
	 * 	Update Ms10frptDkeyWrkofYmd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyWrkofYmd(char[] value) throws CFException {
		 ms10frptDkeyWrkofYmd = serializeMs10frptDkeyWrkofYmd(value);
	}
	/**
	 * 	Update Ms10frptDkeyWrkofYmd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyWrkofYmdString(char[] value) throws CFException {
		 setMs10frptDkeyWrkofYmd(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyCutoffHhmm
	 *	@return ms10frptDkeyCutoffHhmm
	 */
	public int getMs10frptDkeyCutoffHhmm() throws CFException {
       if (isMs10frptDkeyCutoffHhmmModified()) { 
           ms10frptDkeyCutoffHhmm = refreshMs10frptDkeyCutoffHhmm();
        }
   		return ms10frptDkeyCutoffHhmm;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyCutoffHhmm with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-CUTOFF-HHMM
	 *	@param number
	 */
	public void setMs10frptDkeyCutoffHhmm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyCutoffHhmm = checkMs10frptDkeyCutoffHhmmMaxLimit(number); 
		serializeMs10frptDkeyCutoffHhmm(ms10frptDkeyCutoffHhmm);
	}
	

	public void setMs10frptDkeyCutoffHhmm(long number) {
	    number = checkMs10frptDkeyCutoffHhmmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMs10frptDkeyCutoffHhmm((int)number);
	}
	
	/**
	 * 	Update Ms10frptDkeyCutoffHhmm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyCutoffHhmm(char[] value) throws CFException {
		 ms10frptDkeyCutoffHhmm = serializeMs10frptDkeyCutoffHhmm(value);
	}
	/**
	 * 	Update Ms10frptDkeyCutoffHhmm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyCutoffHhmmString(char[] value) throws CFException {
		 setMs10frptDkeyCutoffHhmm(value);
	}
	/**
	 *	Returns the value of ms10frptDkeyLnSeqno
	 *	@return ms10frptDkeyLnSeqno
	 */
	public long getMs10frptDkeyLnSeqno() throws CFException {
       if (isMs10frptDkeyLnSeqnoModified()) { 
           ms10frptDkeyLnSeqno = refreshMs10frptDkeyLnSeqno();
        }
   		return ms10frptDkeyLnSeqno;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDkeyLnSeqno with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DKEY-LN-SEQNO
	 *	@param number
	 */
	public void setMs10frptDkeyLnSeqno(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDkeyLnSeqno = checkMs10frptDkeyLnSeqnoMaxLimit(number); 
		serializeMs10frptDkeyLnSeqno(ms10frptDkeyLnSeqno);
	}
	

	/**
	 * 	Update Ms10frptDkeyLnSeqno with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyLnSeqno(char[] value) throws CFException {
		 ms10frptDkeyLnSeqno = serializeMs10frptDkeyLnSeqno(value);
	}
	/**
	 * 	Update Ms10frptDkeyLnSeqno with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDkeyLnSeqnoString(char[] value) throws CFException {
		 setMs10frptDkeyLnSeqno(value);
	}
	/**
	 *	Returns the value of ms10frptInhProcFlag
	 *	@return ms10frptInhProcFlag
	 */
   public char[] getMs10frptInhProcFlag() throws CFException{
     if (isMs10frptInhProcFlagModified()) { 
        ms10frptInhProcFlag = refreshMs10frptInhProcFlag();
     }
   		return ms10frptInhProcFlag;
   }

  
	/**
	*  set variable ms10frptInhProcFlag
	*  Corresponding COBOL Variable is MS10FRPT-INH-PROC-FLAG
	*  @param value
	**/
   public void setMs10frptInhProcFlag(char[] value) {
      ms10frptInhProcFlag = checkMs10frptInhProcFlagConstraints(value);
      serializeMs10frptInhProcFlag(ms10frptInhProcFlag);
   } 

     /**
	 * 	Update Ms10frptInhProcFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptInhProcFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptInhProcFlag,ms10frptInhProcFlag.length);
   	
   }
   
   public void setMs10frptInhProcFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptInhProcFlag,ms10frptInhProcFlag.length);
   	
   }
   
     /**
	 * 	Update Ms10frptInhProcFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptInhProcFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptInhProcFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptInhProcFlag with another Field
	 *	@param value
	 */
   public void setMs10frptInhProcFlag(Field source) {
       replace(source,0,source.length(),beginMs10frptInhProcFlag,MS_10FRPT_INH_PROC_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptInhProcFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptInhProcFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptInhProcFlag,MS_10FRPT_INH_PROC_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptInhProcFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptInhProcFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptInhProcFlag+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMs10frptDetDelvKeyFieldLength() {
			return MS_10FRPT_DET_DELV_KEY_LENGTH;
		}

}
  
