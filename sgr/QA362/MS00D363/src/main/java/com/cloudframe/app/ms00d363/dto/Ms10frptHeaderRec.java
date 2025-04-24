package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptHeaderRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ms10frptHeaderRec extends Ms10frptHeaderRecSerialized { 
   

						private char[] ms10frptHdrRecType = Field.fillLowValue(2);

								private long ms10frptHdrEndpt;

								private long ms10frptHdrEntIca;

								private long ms10frptHdrProc;

								private int ms10frptHdrHier;

						private char[] ms10frptHdrRptId = Field.fillLowValue(12);

								private long ms10frptHdrWrkofYmd;

								private int ms10frptHdrCutoffHhmm;

								private long ms10frptHdrLineSeqN0;

								private long ms10frptHdrProc2;

						private char[] ms10frptFill1 = new char[20];

								private long ms10frptHdrSysDte;

								private long ms10frptHdrSysTime;

						private char[] ms10frptFill2 = new char[14];

								private long ms10frptHdrMbrIca;

						private char[] ms10frptHdrEservFlag = Field.fillLowValue(1);

						private char[] ms10frptFill3 = new char[144];
	
	/**
	* Constructor for Ms10frptHeaderRec
	**/
    public Ms10frptHeaderRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ms10frptHeaderRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptHeaderRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMs10frptHdrEndpt(0L);
								setMs10frptHdrEntIca(0L);
								setMs10frptHdrProc(0L);
								setMs10frptHdrLineSeqN0(0L);
								setMs10frptHdrProc2(0L);
								setMs10frptFill1(fillSpace(20));
								setMs10frptFill2(fillSpace(14));
								setMs10frptHdrMbrIca(0L);
								setMs10frptFill3(pad(144," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of ms10frptHdrRecType
	 *	@return ms10frptHdrRecType
	 */
   public char[] getMs10frptHdrRecType() throws CFException{
     if (isMs10frptHdrRecTypeModified()) { 
        ms10frptHdrRecType = refreshMs10frptHdrRecType();
     }
   		return ms10frptHdrRecType;
   }

  
	/**
	*  set variable ms10frptHdrRecType
	*  Corresponding COBOL Variable is MS10FRPT-HDR-REC-TYPE
	*  @param value
	**/
   public void setMs10frptHdrRecType(char[] value) {
      ms10frptHdrRecType = checkMs10frptHdrRecTypeConstraints(value);
      serializeMs10frptHdrRecType(ms10frptHdrRecType);
   } 

     /**
	 * 	Update Ms10frptHdrRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptHdrRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptHdrRecType,ms10frptHdrRecType.length);
   	
   }
   
   public void setMs10frptHdrRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRecType,ms10frptHdrRecType.length);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptHdrRecType with another Field
	 *	@param value
	 */
   public void setMs10frptHdrRecType(Field source) {
       replace(source,0,source.length(),beginMs10frptHdrRecType,MS_10FRPT_HDR_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptHdrRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptHdrRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptHdrRecType,MS_10FRPT_HDR_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRecType+targetIndex,targetLen);
    
   }
	char[] ms10frptFileHdr88Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isMs10frptFileHdr()
	 *	@return  Returns true if isMs10frptFileHdr() is "00"
	 */
   public boolean isMs10frptFileHdr() throws CFException {
      return (  compareChars( getMs10frptHdrRecType() , ms10frptFileHdr88Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setMs10frptFileHdrTrue() {  			
    	setMs10frptHdrRecType( ms10frptFileHdr88Value);
   	}
	char[] ms10frptReptHdr88Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isMs10frptReptHdr()
	 *	@return  Returns true if isMs10frptReptHdr() is "01"
	 */
   public boolean isMs10frptReptHdr() throws CFException {
      return (  compareChars( getMs10frptHdrRecType() , ms10frptReptHdr88Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setMs10frptReptHdrTrue() {  			
    	setMs10frptHdrRecType( ms10frptReptHdr88Value);
   	}
	char[] ms10frptDetRec88Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isMs10frptDetRec()
	 *	@return  Returns true if isMs10frptDetRec() is "10"
	 */
   public boolean isMs10frptDetRec() throws CFException {
      return (  compareChars( getMs10frptHdrRecType() , ms10frptDetRec88Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setMs10frptDetRecTrue() {  			
    	setMs10frptHdrRecType( ms10frptDetRec88Value);
   	}
	char[] ms10frptTlrRec88Value = "90".toCharArray();
	/**
	 *	Test condition "90" for isMs10frptTlrRec()
	 *	@return  Returns true if isMs10frptTlrRec() is "90"
	 */
   public boolean isMs10frptTlrRec() throws CFException {
      return (  compareChars( getMs10frptHdrRecType() , ms10frptTlrRec88Value)  == 0  );
   }


	/**
	*  set values "90"
	*/
   	public void setMs10frptTlrRecTrue() {  			
    	setMs10frptHdrRecType( ms10frptTlrRec88Value);
   	}
	/**
	 *	Returns the value of ms10frptHdrEndpt
	 *	@return ms10frptHdrEndpt
	 */
	public long getMs10frptHdrEndpt() throws CFException {
       if (isMs10frptHdrEndptModified()) { 
           ms10frptHdrEndpt = refreshMs10frptHdrEndpt();
        }
   		return ms10frptHdrEndpt;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrEndpt with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-ENDPT
	 *	@param number
	 */
	public void setMs10frptHdrEndpt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrEndpt = checkMs10frptHdrEndptMaxLimit(number); 
		serializeMs10frptHdrEndpt(ms10frptHdrEndpt);
	}
	

	/**
	 * 	Update Ms10frptHdrEndpt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrEndpt(char[] value) throws CFException {
		 ms10frptHdrEndpt = serializeMs10frptHdrEndpt(value);
	}
	/**
	 * 	Update Ms10frptHdrEndpt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrEndptString(char[] value) throws CFException {
		 setMs10frptHdrEndpt(value);
	}
	/**
	 *	Returns the value of ms10frptHdrEntIca
	 *	@return ms10frptHdrEntIca
	 */
	public long getMs10frptHdrEntIca() throws CFException {
       if (isMs10frptHdrEntIcaModified()) { 
           ms10frptHdrEntIca = refreshMs10frptHdrEntIca();
        }
   		return ms10frptHdrEntIca;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrEntIca with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-ENT-ICA
	 *	@param number
	 */
	public void setMs10frptHdrEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrEntIca = checkMs10frptHdrEntIcaMaxLimit(number); 
		serializeMs10frptHdrEntIca(ms10frptHdrEntIca);
	}
	

	/**
	 * 	Update Ms10frptHdrEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrEntIca(char[] value) throws CFException {
		 ms10frptHdrEntIca = serializeMs10frptHdrEntIca(value);
	}
	/**
	 * 	Update Ms10frptHdrEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrEntIcaString(char[] value) throws CFException {
		 setMs10frptHdrEntIca(value);
	}
	/**
	 *	Returns the value of ms10frptHdrProc
	 *	@return ms10frptHdrProc
	 */
	public long getMs10frptHdrProc() throws CFException {
       if (isMs10frptHdrProcModified()) { 
           ms10frptHdrProc = refreshMs10frptHdrProc();
        }
   		return ms10frptHdrProc;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrProc with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-PROC
	 *	@param number
	 */
	public void setMs10frptHdrProc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrProc = checkMs10frptHdrProcMaxLimit(number); 
		serializeMs10frptHdrProc(ms10frptHdrProc);
	}
	

	/**
	 * 	Update Ms10frptHdrProc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrProc(char[] value) throws CFException {
		 ms10frptHdrProc = serializeMs10frptHdrProc(value);
	}
	/**
	 * 	Update Ms10frptHdrProc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrProcString(char[] value) throws CFException {
		 setMs10frptHdrProc(value);
	}
	/**
	 *	Returns the value of ms10frptHdrHier
	 *	@return ms10frptHdrHier
	 */
	public int getMs10frptHdrHier() throws CFException {
       if (isMs10frptHdrHierModified()) { 
           ms10frptHdrHier = refreshMs10frptHdrHier();
        }
   		return ms10frptHdrHier;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrHier with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-HIER
	 *	@param number
	 */
	public void setMs10frptHdrHier(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrHier = checkMs10frptHdrHierMaxLimit(number); 
		serializeMs10frptHdrHier(ms10frptHdrHier);
	}
	

	public void setMs10frptHdrHier(long number) {
	    number = checkMs10frptHdrHierMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMs10frptHdrHier((int)number);
	}
	
	/**
	 * 	Update Ms10frptHdrHier with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrHier(char[] value) throws CFException {
		 ms10frptHdrHier = serializeMs10frptHdrHier(value);
	}
	/**
	 * 	Update Ms10frptHdrHier with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrHierString(char[] value) throws CFException {
		 setMs10frptHdrHier(value);
	}
	/**
	 *	Returns the value of ms10frptHdrRptId
	 *	@return ms10frptHdrRptId
	 */
   public char[] getMs10frptHdrRptId() throws CFException{
     if (isMs10frptHdrRptIdModified()) { 
        ms10frptHdrRptId = refreshMs10frptHdrRptId();
     }
   		return ms10frptHdrRptId;
   }

  
	/**
	*  set variable ms10frptHdrRptId
	*  Corresponding COBOL Variable is MS10FRPT-HDR-RPT-ID
	*  @param value
	**/
   public void setMs10frptHdrRptId(char[] value) {
      ms10frptHdrRptId = checkMs10frptHdrRptIdConstraints(value);
      serializeMs10frptHdrRptId(ms10frptHdrRptId);
   } 

     /**
	 * 	Update Ms10frptHdrRptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptHdrRptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptHdrRptId,ms10frptHdrRptId.length);
   	
   }
   
   public void setMs10frptHdrRptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRptId,ms10frptHdrRptId.length);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrRptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrRptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptHdrRptId with another Field
	 *	@param value
	 */
   public void setMs10frptHdrRptId(Field source) {
       replace(source,0,source.length(),beginMs10frptHdrRptId,MS_10FRPT_HDR_RPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptHdrRptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptHdrRptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptHdrRptId,MS_10FRPT_HDR_RPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrRptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrRptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrRptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptHdrWrkofYmd
	 *	@return ms10frptHdrWrkofYmd
	 */
	public long getMs10frptHdrWrkofYmd() throws CFException {
       if (isMs10frptHdrWrkofYmdModified()) { 
           ms10frptHdrWrkofYmd = refreshMs10frptHdrWrkofYmd();
        }
   		return ms10frptHdrWrkofYmd;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrWrkofYmd with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-WRKOF-YMD
	 *	@param number
	 */
	public void setMs10frptHdrWrkofYmd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrWrkofYmd = checkMs10frptHdrWrkofYmdMaxLimit(number); 
		serializeMs10frptHdrWrkofYmd(ms10frptHdrWrkofYmd);
	}
	

	/**
	 * 	Update Ms10frptHdrWrkofYmd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrWrkofYmd(char[] value) throws CFException {
		 ms10frptHdrWrkofYmd = serializeMs10frptHdrWrkofYmd(value);
	}
	/**
	 * 	Update Ms10frptHdrWrkofYmd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrWrkofYmdString(char[] value) throws CFException {
		 setMs10frptHdrWrkofYmd(value);
	}
	/**
	 *	Returns the value of ms10frptHdrCutoffHhmm
	 *	@return ms10frptHdrCutoffHhmm
	 */
	public int getMs10frptHdrCutoffHhmm() throws CFException {
       if (isMs10frptHdrCutoffHhmmModified()) { 
           ms10frptHdrCutoffHhmm = refreshMs10frptHdrCutoffHhmm();
        }
   		return ms10frptHdrCutoffHhmm;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrCutoffHhmm with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-CUTOFF-HHMM
	 *	@param number
	 */
	public void setMs10frptHdrCutoffHhmm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrCutoffHhmm = checkMs10frptHdrCutoffHhmmMaxLimit(number); 
		serializeMs10frptHdrCutoffHhmm(ms10frptHdrCutoffHhmm);
	}
	

	public void setMs10frptHdrCutoffHhmm(long number) {
	    number = checkMs10frptHdrCutoffHhmmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMs10frptHdrCutoffHhmm((int)number);
	}
	
	/**
	 * 	Update Ms10frptHdrCutoffHhmm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrCutoffHhmm(char[] value) throws CFException {
		 ms10frptHdrCutoffHhmm = serializeMs10frptHdrCutoffHhmm(value);
	}
	/**
	 * 	Update Ms10frptHdrCutoffHhmm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrCutoffHhmmString(char[] value) throws CFException {
		 setMs10frptHdrCutoffHhmm(value);
	}
	/**
	 *	Returns the value of ms10frptHdrLineSeqN0
	 *	@return ms10frptHdrLineSeqN0
	 */
	public long getMs10frptHdrLineSeqN0() throws CFException {
       if (isMs10frptHdrLineSeqN0Modified()) { 
           ms10frptHdrLineSeqN0 = refreshMs10frptHdrLineSeqN0();
        }
   		return ms10frptHdrLineSeqN0;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrLineSeqN0 with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-LINE-SEQ-N0
	 *	@param number
	 */
	public void setMs10frptHdrLineSeqN0(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrLineSeqN0 = checkMs10frptHdrLineSeqN0MaxLimit(number); 
		serializeMs10frptHdrLineSeqN0(ms10frptHdrLineSeqN0);
	}
	

	/**
	 * 	Update Ms10frptHdrLineSeqN0 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrLineSeqN0(char[] value) throws CFException {
		 ms10frptHdrLineSeqN0 = serializeMs10frptHdrLineSeqN0(value);
	}
	/**
	 * 	Update Ms10frptHdrLineSeqN0 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrLineSeqN0String(char[] value) throws CFException {
		 setMs10frptHdrLineSeqN0(value);
	}
	/**
	 *	Returns the value of ms10frptHdrProc2
	 *	@return ms10frptHdrProc2
	 */
	public long getMs10frptHdrProc2() throws CFException {
       if (isMs10frptHdrProc2Modified()) { 
           ms10frptHdrProc2 = refreshMs10frptHdrProc2();
        }
   		return ms10frptHdrProc2;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrProc2 with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-PROC-2
	 *	@param number
	 */
	public void setMs10frptHdrProc2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrProc2 = checkMs10frptHdrProc2MaxLimit(number); 
		serializeMs10frptHdrProc2(ms10frptHdrProc2);
	}
	

	/**
	 * 	Update Ms10frptHdrProc2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrProc2(char[] value) throws CFException {
		 ms10frptHdrProc2 = serializeMs10frptHdrProc2(value);
	}
	/**
	 * 	Update Ms10frptHdrProc2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrProc2String(char[] value) throws CFException {
		 setMs10frptHdrProc2(value);
	}
	/**
	 *	Returns the value of ms10frptFill1
	 *	@return ms10frptFill1
	 */
   public char[] getMs10frptFill1() throws CFException{
     if (isMs10frptFill1Modified()) { 
        ms10frptFill1 = refreshMs10frptFill1();
     }
   		return ms10frptFill1;
   }

  
	/**
	*  set variable ms10frptFill1
	*  Corresponding COBOL Variable is MS10FRPT-FILL-1
	*  @param value
	**/
   public void setMs10frptFill1(char[] value) {
      ms10frptFill1 = checkMs10frptFill1Constraints(value);
      serializeMs10frptFill1(ms10frptFill1);
   } 

     /**
	 * 	Update Ms10frptFill1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill1,ms10frptFill1.length);
   	
   }
   
   public void setMs10frptFill1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill1,ms10frptFill1.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill1 with another Field
	 *	@param value
	 */
   public void setMs10frptFill1(Field source) {
       replace(source,0,source.length(),beginMs10frptFill1,MS_10FRPT_FILL_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill1,MS_10FRPT_FILL_1_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptHdrSysDte
	 *	@return ms10frptHdrSysDte
	 */
	public long getMs10frptHdrSysDte() throws CFException {
       if (isMs10frptHdrSysDteModified()) { 
           ms10frptHdrSysDte = refreshMs10frptHdrSysDte();
        }
   		return ms10frptHdrSysDte;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrSysDte with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-SYS-DTE
	 *	@param number
	 */
	public void setMs10frptHdrSysDte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrSysDte = checkMs10frptHdrSysDteMaxLimit(number); 
		serializeMs10frptHdrSysDte(ms10frptHdrSysDte);
	}
	

	/**
	 * 	Update Ms10frptHdrSysDte with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrSysDte(char[] value) throws CFException {
		 ms10frptHdrSysDte = serializeMs10frptHdrSysDte(value);
	}
	/**
	 * 	Update Ms10frptHdrSysDte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrSysDteString(char[] value) throws CFException {
		 setMs10frptHdrSysDte(value);
	}
	/**
	 *	Returns the value of ms10frptHdrSysTime
	 *	@return ms10frptHdrSysTime
	 */
	public long getMs10frptHdrSysTime() throws CFException {
       if (isMs10frptHdrSysTimeModified()) { 
           ms10frptHdrSysTime = refreshMs10frptHdrSysTime();
        }
   		return ms10frptHdrSysTime;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrSysTime with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-SYS-TIME
	 *	@param number
	 */
	public void setMs10frptHdrSysTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrSysTime = checkMs10frptHdrSysTimeMaxLimit(number); 
		serializeMs10frptHdrSysTime(ms10frptHdrSysTime);
	}
	

	/**
	 * 	Update Ms10frptHdrSysTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrSysTime(char[] value) throws CFException {
		 ms10frptHdrSysTime = serializeMs10frptHdrSysTime(value);
	}
	/**
	 * 	Update Ms10frptHdrSysTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrSysTimeString(char[] value) throws CFException {
		 setMs10frptHdrSysTime(value);
	}
	/**
	 *	Returns the value of ms10frptFill2
	 *	@return ms10frptFill2
	 */
   public char[] getMs10frptFill2() throws CFException{
     if (isMs10frptFill2Modified()) { 
        ms10frptFill2 = refreshMs10frptFill2();
     }
   		return ms10frptFill2;
   }

  
	/**
	*  set variable ms10frptFill2
	*  Corresponding COBOL Variable is MS10FRPT-FILL-2
	*  @param value
	**/
   public void setMs10frptFill2(char[] value) {
      ms10frptFill2 = checkMs10frptFill2Constraints(value);
      serializeMs10frptFill2(ms10frptFill2);
   } 

     /**
	 * 	Update Ms10frptFill2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill2,ms10frptFill2.length);
   	
   }
   
   public void setMs10frptFill2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill2,ms10frptFill2.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill2 with another Field
	 *	@param value
	 */
   public void setMs10frptFill2(Field source) {
       replace(source,0,source.length(),beginMs10frptFill2,MS_10FRPT_FILL_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill2,MS_10FRPT_FILL_2_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptHdrMbrIca
	 *	@return ms10frptHdrMbrIca
	 */
	public long getMs10frptHdrMbrIca() throws CFException {
       if (isMs10frptHdrMbrIcaModified()) { 
           ms10frptHdrMbrIca = refreshMs10frptHdrMbrIca();
        }
   		return ms10frptHdrMbrIca;
	}
	

	
	   
	/**
	 * 	Update Ms10frptHdrMbrIca with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-HDR-MBR-ICA
	 *	@param number
	 */
	public void setMs10frptHdrMbrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptHdrMbrIca = checkMs10frptHdrMbrIcaMaxLimit(number); 
		serializeMs10frptHdrMbrIca(ms10frptHdrMbrIca);
	}
	

	/**
	 * 	Update Ms10frptHdrMbrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrMbrIca(char[] value) throws CFException {
		 ms10frptHdrMbrIca = serializeMs10frptHdrMbrIca(value);
	}
	/**
	 * 	Update Ms10frptHdrMbrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptHdrMbrIcaString(char[] value) throws CFException {
		 setMs10frptHdrMbrIca(value);
	}
	/**
	 *	Returns the value of ms10frptHdrEservFlag
	 *	@return ms10frptHdrEservFlag
	 */
   public char[] getMs10frptHdrEservFlag() throws CFException{
     if (isMs10frptHdrEservFlagModified()) { 
        ms10frptHdrEservFlag = refreshMs10frptHdrEservFlag();
     }
   		return ms10frptHdrEservFlag;
   }

  
	/**
	*  set variable ms10frptHdrEservFlag
	*  Corresponding COBOL Variable is MS10FRPT-HDR-ESERV-FLAG
	*  @param value
	**/
   public void setMs10frptHdrEservFlag(char[] value) {
      ms10frptHdrEservFlag = checkMs10frptHdrEservFlagConstraints(value);
      serializeMs10frptHdrEservFlag(ms10frptHdrEservFlag);
   } 

     /**
	 * 	Update Ms10frptHdrEservFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptHdrEservFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptHdrEservFlag,ms10frptHdrEservFlag.length);
   	
   }
   
   public void setMs10frptHdrEservFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrEservFlag,ms10frptHdrEservFlag.length);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrEservFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrEservFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrEservFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptHdrEservFlag with another Field
	 *	@param value
	 */
   public void setMs10frptHdrEservFlag(Field source) {
       replace(source,0,source.length(),beginMs10frptHdrEservFlag,MS_10FRPT_HDR_ESERV_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptHdrEservFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptHdrEservFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptHdrEservFlag,MS_10FRPT_HDR_ESERV_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptHdrEservFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHdrEservFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptHdrEservFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptFill3
	 *	@return ms10frptFill3
	 */
   public char[] getMs10frptFill3() throws CFException{
     if (isMs10frptFill3Modified()) { 
        ms10frptFill3 = refreshMs10frptFill3();
     }
   		return ms10frptFill3;
   }

  
	/**
	*  set variable ms10frptFill3
	*  Corresponding COBOL Variable is MS10FRPT-FILL-3
	*  @param value
	**/
   public void setMs10frptFill3(char[] value) {
      ms10frptFill3 = checkMs10frptFill3Constraints(value);
      serializeMs10frptFill3(ms10frptFill3);
   } 

     /**
	 * 	Update Ms10frptFill3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill3,ms10frptFill3.length);
   	
   }
   
   public void setMs10frptFill3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill3,ms10frptFill3.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill3 with another Field
	 *	@param value
	 */
   public void setMs10frptFill3(Field source) {
       replace(source,0,source.length(),beginMs10frptFill3,MS_10FRPT_FILL_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill3,MS_10FRPT_FILL_3_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMs10frptHeaderRecFieldLength() {
			return MS_10FRPT_HEADER_REC_LENGTH;
		}

}
  
