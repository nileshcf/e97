package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyLsbcaPrev extends KeyLsbcaPrevSerialized { 
   

								private short lsbcaPrvBlSegregateNo;

						private char[] lsbcaPrvBlStreamCd = Field.fillLowValue(1);

								private short lsbcaPrvJobIterationNo;

								private int lsbcaPrvCustIdNo;

								private int lsbcaPrvAcctNo;

						private char[] lsbcaPrvBlCycEndDt = Field.fillLowValue(10);

						private char[] lsbcaPrvShrGrpCompTyp = Field.fillLowValue(1);

						private char[] lsbcaPrvNpa = Field.fillLowValue(3);

						private char[] lsbcaPrvNxx = Field.fillLowValue(3);

						private char[] lsbcaPrvTln = Field.fillLowValue(4);

						private char[] lsbcaPrvBlPerFromDt = Field.fillLowValue(10);

						private char[] lsbcaPrvBlPerToDt = Field.fillLowValue(10);

								private int lsbcaPrvLnShrGrpNo;

								private int lsbcaPrvShrActvSeqNo;
	
	/**
	* Constructor for KeyLsbcaPrev
	**/
    public KeyLsbcaPrev() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyLsbcaPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of lsbcaPrvBlSegregateNo
	 *	@return lsbcaPrvBlSegregateNo
	 */
	public short getLsbcaPrvBlSegregateNo() throws CFException {
        if (isLsbcaPrvBlSegregateNoModified()) { 
           lsbcaPrvBlSegregateNo = refreshLsbcaPrvBlSegregateNo();
        }
   		return lsbcaPrvBlSegregateNo;
	}
	
	/**
	 * 	Update LsbcaPrvBlSegregateNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-BL-SEGREGATE-NO
	 *	@param number
	 */
	public void setLsbcaPrvBlSegregateNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvBlSegregateNo = checkLsbcaPrvBlSegregateNoMaxLimit(number); 
		serializeLsbcaPrvBlSegregateNo(lsbcaPrvBlSegregateNo);
	}

	public void setLsbcaPrvBlSegregateNo(int number) {
	    number = checkLsbcaPrvBlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvBlSegregateNo((short)number);
	}
	public void setLsbcaPrvBlSegregateNo(long number) {
	    number = checkLsbcaPrvBlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvBlSegregateNo((short)number);
	}
	

	/**
	 *	Returns the value of lsbcaPrvBlStreamCd
	 *	@return lsbcaPrvBlStreamCd
	 */
   public char[] getLsbcaPrvBlStreamCd() throws CFException{
     if (isLsbcaPrvBlStreamCdModified()) { 
        lsbcaPrvBlStreamCd = refreshLsbcaPrvBlStreamCd();
     }
   		return lsbcaPrvBlStreamCd;
   }

  
	/**
	*  set variable lsbcaPrvBlStreamCd
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-BL-STREAM-CD
	*  @param value
	**/
   public void setLsbcaPrvBlStreamCd(char[] value) {
      lsbcaPrvBlStreamCd = checkLsbcaPrvBlStreamCdConstraints(value);
      serializeLsbcaPrvBlStreamCd(lsbcaPrvBlStreamCd);
   } 

     /**
	 * 	Update LsbcaPrvBlStreamCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvBlStreamCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvBlStreamCd,lsbcaPrvBlStreamCd.length);
   	
   }
   
   public void setLsbcaPrvBlStreamCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlStreamCd,lsbcaPrvBlStreamCd.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlStreamCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlStreamCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlStreamCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvBlStreamCd with another Field
	 *	@param value
	 */
   public void setLsbcaPrvBlStreamCd(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvBlStreamCd,LSBCA_PRV_BL_STREAM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvBlStreamCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvBlStreamCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlStreamCd,LSBCA_PRV_BL_STREAM_CD_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlStreamCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlStreamCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlStreamCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvJobIterationNo
	 *	@return lsbcaPrvJobIterationNo
	 */
	public short getLsbcaPrvJobIterationNo() throws CFException {
        if (isLsbcaPrvJobIterationNoModified()) { 
           lsbcaPrvJobIterationNo = refreshLsbcaPrvJobIterationNo();
        }
   		return lsbcaPrvJobIterationNo;
	}
	
	/**
	 * 	Update LsbcaPrvJobIterationNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-JOB-ITERATION-NO
	 *	@param number
	 */
	public void setLsbcaPrvJobIterationNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvJobIterationNo = checkLsbcaPrvJobIterationNoMaxLimit(number); 
		serializeLsbcaPrvJobIterationNo(lsbcaPrvJobIterationNo);
	}

	public void setLsbcaPrvJobIterationNo(int number) {
	    number = checkLsbcaPrvJobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvJobIterationNo((short)number);
	}
	public void setLsbcaPrvJobIterationNo(long number) {
	    number = checkLsbcaPrvJobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvJobIterationNo((short)number);
	}
	

	/**
	 *	Returns the value of lsbcaPrvCustIdNo
	 *	@return lsbcaPrvCustIdNo
	 */
	public int getLsbcaPrvCustIdNo() throws CFException {
        if (isLsbcaPrvCustIdNoModified()) { 
           lsbcaPrvCustIdNo = refreshLsbcaPrvCustIdNo();
        }
   		return lsbcaPrvCustIdNo;
	}
	
	/**
	 * 	Update LsbcaPrvCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-CUST-ID-NO
	 *	@param number
	 */
	public void setLsbcaPrvCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvCustIdNo = checkLsbcaPrvCustIdNoMaxLimit(number); 
		serializeLsbcaPrvCustIdNo(lsbcaPrvCustIdNo);
	}


	public void setLsbcaPrvCustIdNo(long number) {
	    number = checkLsbcaPrvCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of lsbcaPrvAcctNo
	 *	@return lsbcaPrvAcctNo
	 */
	public int getLsbcaPrvAcctNo() throws CFException {
        if (isLsbcaPrvAcctNoModified()) { 
           lsbcaPrvAcctNo = refreshLsbcaPrvAcctNo();
        }
   		return lsbcaPrvAcctNo;
	}
	
	/**
	 * 	Update LsbcaPrvAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-ACCT-NO
	 *	@param number
	 */
	public void setLsbcaPrvAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvAcctNo = checkLsbcaPrvAcctNoMaxLimit(number); 
		serializeLsbcaPrvAcctNo(lsbcaPrvAcctNo);
	}


	public void setLsbcaPrvAcctNo(long number) {
	    number = checkLsbcaPrvAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvAcctNo((int)number);
	}
	
	/**
	 *	Returns the value of lsbcaPrvBlCycEndDt
	 *	@return lsbcaPrvBlCycEndDt
	 */
   public char[] getLsbcaPrvBlCycEndDt() throws CFException{
     if (isLsbcaPrvBlCycEndDtModified()) { 
        lsbcaPrvBlCycEndDt = refreshLsbcaPrvBlCycEndDt();
     }
   		return lsbcaPrvBlCycEndDt;
   }

  
	/**
	*  set variable lsbcaPrvBlCycEndDt
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-BL-CYC-END-DT
	*  @param value
	**/
   public void setLsbcaPrvBlCycEndDt(char[] value) {
      lsbcaPrvBlCycEndDt = checkLsbcaPrvBlCycEndDtConstraints(value);
      serializeLsbcaPrvBlCycEndDt(lsbcaPrvBlCycEndDt);
   } 

     /**
	 * 	Update LsbcaPrvBlCycEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvBlCycEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvBlCycEndDt,lsbcaPrvBlCycEndDt.length);
   	
   }
   
   public void setLsbcaPrvBlCycEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlCycEndDt,lsbcaPrvBlCycEndDt.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlCycEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlCycEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlCycEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvBlCycEndDt with another Field
	 *	@param value
	 */
   public void setLsbcaPrvBlCycEndDt(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvBlCycEndDt,LSBCA_PRV_BL_CYC_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvBlCycEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvBlCycEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlCycEndDt,LSBCA_PRV_BL_CYC_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlCycEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlCycEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlCycEndDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvShrGrpCompTyp
	 *	@return lsbcaPrvShrGrpCompTyp
	 */
   public char[] getLsbcaPrvShrGrpCompTyp() throws CFException{
     if (isLsbcaPrvShrGrpCompTypModified()) { 
        lsbcaPrvShrGrpCompTyp = refreshLsbcaPrvShrGrpCompTyp();
     }
   		return lsbcaPrvShrGrpCompTyp;
   }

  
	/**
	*  set variable lsbcaPrvShrGrpCompTyp
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-SHR-GRP-COMP-TYP
	*  @param value
	**/
   public void setLsbcaPrvShrGrpCompTyp(char[] value) {
      lsbcaPrvShrGrpCompTyp = checkLsbcaPrvShrGrpCompTypConstraints(value);
      serializeLsbcaPrvShrGrpCompTyp(lsbcaPrvShrGrpCompTyp);
   } 

     /**
	 * 	Update LsbcaPrvShrGrpCompTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvShrGrpCompTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvShrGrpCompTyp,lsbcaPrvShrGrpCompTyp.length);
   	
   }
   
   public void setLsbcaPrvShrGrpCompTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvShrGrpCompTyp,lsbcaPrvShrGrpCompTyp.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvShrGrpCompTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvShrGrpCompTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvShrGrpCompTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvShrGrpCompTyp with another Field
	 *	@param value
	 */
   public void setLsbcaPrvShrGrpCompTyp(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvShrGrpCompTyp,LSBCA_PRV_SHR_GRP_COMP_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvShrGrpCompTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvShrGrpCompTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvShrGrpCompTyp,LSBCA_PRV_SHR_GRP_COMP_TYP_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvShrGrpCompTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvShrGrpCompTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvShrGrpCompTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvNpa
	 *	@return lsbcaPrvNpa
	 */
   public char[] getLsbcaPrvNpa() throws CFException{
     if (isLsbcaPrvNpaModified()) { 
        lsbcaPrvNpa = refreshLsbcaPrvNpa();
     }
   		return lsbcaPrvNpa;
   }

  
	/**
	*  set variable lsbcaPrvNpa
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-NPA
	*  @param value
	**/
   public void setLsbcaPrvNpa(char[] value) {
      lsbcaPrvNpa = checkLsbcaPrvNpaConstraints(value);
      serializeLsbcaPrvNpa(lsbcaPrvNpa);
   } 

     /**
	 * 	Update LsbcaPrvNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvNpa,lsbcaPrvNpa.length);
   	
   }
   
   public void setLsbcaPrvNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNpa,lsbcaPrvNpa.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvNpa with another Field
	 *	@param value
	 */
   public void setLsbcaPrvNpa(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvNpa,LSBCA_PRV_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvNpa,LSBCA_PRV_NPA_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvNxx
	 *	@return lsbcaPrvNxx
	 */
   public char[] getLsbcaPrvNxx() throws CFException{
     if (isLsbcaPrvNxxModified()) { 
        lsbcaPrvNxx = refreshLsbcaPrvNxx();
     }
   		return lsbcaPrvNxx;
   }

  
	/**
	*  set variable lsbcaPrvNxx
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-NXX
	*  @param value
	**/
   public void setLsbcaPrvNxx(char[] value) {
      lsbcaPrvNxx = checkLsbcaPrvNxxConstraints(value);
      serializeLsbcaPrvNxx(lsbcaPrvNxx);
   } 

     /**
	 * 	Update LsbcaPrvNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvNxx,lsbcaPrvNxx.length);
   	
   }
   
   public void setLsbcaPrvNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNxx,lsbcaPrvNxx.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvNxx with another Field
	 *	@param value
	 */
   public void setLsbcaPrvNxx(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvNxx,LSBCA_PRV_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvNxx,LSBCA_PRV_NXX_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvTln
	 *	@return lsbcaPrvTln
	 */
   public char[] getLsbcaPrvTln() throws CFException{
     if (isLsbcaPrvTlnModified()) { 
        lsbcaPrvTln = refreshLsbcaPrvTln();
     }
   		return lsbcaPrvTln;
   }

  
	/**
	*  set variable lsbcaPrvTln
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-TLN
	*  @param value
	**/
   public void setLsbcaPrvTln(char[] value) {
      lsbcaPrvTln = checkLsbcaPrvTlnConstraints(value);
      serializeLsbcaPrvTln(lsbcaPrvTln);
   } 

     /**
	 * 	Update LsbcaPrvTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvTln,lsbcaPrvTln.length);
   	
   }
   
   public void setLsbcaPrvTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvTln,lsbcaPrvTln.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvTln with another Field
	 *	@param value
	 */
   public void setLsbcaPrvTln(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvTln,LSBCA_PRV_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvTln,LSBCA_PRV_TLN_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvTln+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvBlPerFromDt
	 *	@return lsbcaPrvBlPerFromDt
	 */
   public char[] getLsbcaPrvBlPerFromDt() throws CFException{
     if (isLsbcaPrvBlPerFromDtModified()) { 
        lsbcaPrvBlPerFromDt = refreshLsbcaPrvBlPerFromDt();
     }
   		return lsbcaPrvBlPerFromDt;
   }

  
	/**
	*  set variable lsbcaPrvBlPerFromDt
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-BL-PER-FROM-DT
	*  @param value
	**/
   public void setLsbcaPrvBlPerFromDt(char[] value) {
      lsbcaPrvBlPerFromDt = checkLsbcaPrvBlPerFromDtConstraints(value);
      serializeLsbcaPrvBlPerFromDt(lsbcaPrvBlPerFromDt);
   } 

     /**
	 * 	Update LsbcaPrvBlPerFromDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvBlPerFromDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvBlPerFromDt,lsbcaPrvBlPerFromDt.length);
   	
   }
   
   public void setLsbcaPrvBlPerFromDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerFromDt,lsbcaPrvBlPerFromDt.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlPerFromDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlPerFromDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerFromDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvBlPerFromDt with another Field
	 *	@param value
	 */
   public void setLsbcaPrvBlPerFromDt(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvBlPerFromDt,LSBCA_PRV_BL_PER_FROM_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvBlPerFromDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvBlPerFromDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerFromDt,LSBCA_PRV_BL_PER_FROM_DT_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlPerFromDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlPerFromDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerFromDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvBlPerToDt
	 *	@return lsbcaPrvBlPerToDt
	 */
   public char[] getLsbcaPrvBlPerToDt() throws CFException{
     if (isLsbcaPrvBlPerToDtModified()) { 
        lsbcaPrvBlPerToDt = refreshLsbcaPrvBlPerToDt();
     }
   		return lsbcaPrvBlPerToDt;
   }

  
	/**
	*  set variable lsbcaPrvBlPerToDt
	*  Corresponding COBOL Variable is WS-LSBCA-PRV-BL-PER-TO-DT
	*  @param value
	**/
   public void setLsbcaPrvBlPerToDt(char[] value) {
      lsbcaPrvBlPerToDt = checkLsbcaPrvBlPerToDtConstraints(value);
      serializeLsbcaPrvBlPerToDt(lsbcaPrvBlPerToDt);
   } 

     /**
	 * 	Update LsbcaPrvBlPerToDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsbcaPrvBlPerToDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsbcaPrvBlPerToDt,lsbcaPrvBlPerToDt.length);
   	
   }
   
   public void setLsbcaPrvBlPerToDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerToDt,lsbcaPrvBlPerToDt.length);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlPerToDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlPerToDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerToDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsbcaPrvBlPerToDt with another Field
	 *	@param value
	 */
   public void setLsbcaPrvBlPerToDt(Field source) {
       replace(source,0,source.length(),beginLsbcaPrvBlPerToDt,LSBCA_PRV_BL_PER_TO_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LsbcaPrvBlPerToDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsbcaPrvBlPerToDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerToDt,LSBCA_PRV_BL_PER_TO_DT_LEN);
   	
   }
   
     /**
	 * 	Update LsbcaPrvBlPerToDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsbcaPrvBlPerToDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsbcaPrvBlPerToDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsbcaPrvLnShrGrpNo
	 *	@return lsbcaPrvLnShrGrpNo
	 */
	public int getLsbcaPrvLnShrGrpNo() throws CFException {
        if (isLsbcaPrvLnShrGrpNoModified()) { 
           lsbcaPrvLnShrGrpNo = refreshLsbcaPrvLnShrGrpNo();
        }
   		return lsbcaPrvLnShrGrpNo;
	}
	
	/**
	 * 	Update LsbcaPrvLnShrGrpNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-LN-SHR-GRP-NO
	 *	@param number
	 */
	public void setLsbcaPrvLnShrGrpNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvLnShrGrpNo = checkLsbcaPrvLnShrGrpNoMaxLimit(number); 
		serializeLsbcaPrvLnShrGrpNo(lsbcaPrvLnShrGrpNo);
	}


	public void setLsbcaPrvLnShrGrpNo(long number) {
	    number = checkLsbcaPrvLnShrGrpNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvLnShrGrpNo((int)number);
	}
	
	/**
	 *	Returns the value of lsbcaPrvShrActvSeqNo
	 *	@return lsbcaPrvShrActvSeqNo
	 */
	public int getLsbcaPrvShrActvSeqNo() throws CFException {
        if (isLsbcaPrvShrActvSeqNoModified()) { 
           lsbcaPrvShrActvSeqNo = refreshLsbcaPrvShrActvSeqNo();
        }
   		return lsbcaPrvShrActvSeqNo;
	}
	
	/**
	 * 	Update LsbcaPrvShrActvSeqNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-PRV-SHR-ACTV-SEQ-NO
	 *	@param number
	 */
	public void setLsbcaPrvShrActvSeqNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaPrvShrActvSeqNo = checkLsbcaPrvShrActvSeqNoMaxLimit(number); 
		serializeLsbcaPrvShrActvSeqNo(lsbcaPrvShrActvSeqNo);
	}


	public void setLsbcaPrvShrActvSeqNo(long number) {
	    number = checkLsbcaPrvShrActvSeqNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaPrvShrActvSeqNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyLsbcaPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setLsbcaPrvBlSegregateNo((short)0);
         setLsbcaPrvBlStreamCd(CONSTANTS.SPACE);
         	setLsbcaPrvJobIterationNo((short)0);
                     setLsbcaPrvCustIdNo(0);
                     setLsbcaPrvAcctNo(0);
         setLsbcaPrvBlCycEndDt(CONSTANTS.SPACE_10);
         setLsbcaPrvShrGrpCompTyp(CONSTANTS.SPACE);
         setLsbcaPrvNpa(CONSTANTS.SPACE_3);
         setLsbcaPrvNxx(CONSTANTS.SPACE_3);
         setLsbcaPrvTln(CONSTANTS.SPACE_4);
         setLsbcaPrvBlPerFromDt(CONSTANTS.SPACE_10);
         setLsbcaPrvBlPerToDt(CONSTANTS.SPACE_10);
                     setLsbcaPrvLnShrGrpNo(0);
                     setLsbcaPrvShrActvSeqNo(0);
   }

		public static int getKeyLsbcaPrevFieldLength() {
			return KEY_LSBCA_PREV_LENGTH;
		}

}
  
