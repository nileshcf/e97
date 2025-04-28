package com.cloudframe.app.init1.dto;

/**
*  The class DclWipBlCycPhaseAudit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class DclWipBlCycPhaseAudit extends DclWipBlCycPhaseAuditSerialized { 
   

								private short tb33006BlSegregateNo;

						private char[] tb33006BlCycNo = Field.fillLowValue(2);

						private char[] tb33006BlStreamCd = Field.fillLowValue(1);

								private short tb33006JobIterationNo;

						private char[] tb33006PhaseTyp = Field.fillLowValue(2);

						private char[] tb33006CycMthYr = Field.fillLowValue(6);

						private char[] tb33006RptTypCd = Field.fillLowValue(5);

						private char[] tb33006RptAttrCd = Field.fillLowValue(3);

								private int tb33006RptAttrIdNo;

						private char[] tb33006RptColNameCd = Field.fillLowValue(3);

						private char[] tb33006RptColTypCd = Field.fillLowValue(1);

								private BigDecimal tb33006RptColValue = BigDecimal.ZERO;

						private char[] tb33006DbUserid = Field.fillLowValue(8);

						private char[] tb33006DbTmstamp = Field.fillLowValue(26);
	
	/**
	* Constructor for DclWipBlCycPhaseAudit
	**/
    public DclWipBlCycPhaseAudit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tb33006BlSegregateNo
	 *	@return tb33006BlSegregateNo
	 */
	public short getTb33006BlSegregateNo() throws CFException {
        if (isTb33006BlSegregateNoModified()) { 
           tb33006BlSegregateNo = refreshTb33006BlSegregateNo();
        }
   		return tb33006BlSegregateNo;
	}
	
	/**
	 * 	Update Tb33006BlSegregateNo with the passed value
	 *  Corresponding COBOL Variable is TB33006-BL-SEGREGATE-NO
	 *	@param number
	 */
	public void setTb33006BlSegregateNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tb33006BlSegregateNo = checkTb33006BlSegregateNoMaxLimit(number); 
		serializeTb33006BlSegregateNo(tb33006BlSegregateNo);
	}

	public void setTb33006BlSegregateNo(int number) {
	    number = checkTb33006BlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTb33006BlSegregateNo((short)number);
	}
	public void setTb33006BlSegregateNo(long number) {
	    number = checkTb33006BlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTb33006BlSegregateNo((short)number);
	}
	

	/**
	 *	Returns the value of tb33006BlCycNo
	 *	@return tb33006BlCycNo
	 */
   public char[] getTb33006BlCycNo() throws CFException{
     if (isTb33006BlCycNoModified()) { 
        tb33006BlCycNo = refreshTb33006BlCycNo();
     }
   		return tb33006BlCycNo;
   }

  
	/**
	*  set variable tb33006BlCycNo
	*  Corresponding COBOL Variable is TB33006-BL-CYC-NO
	*  @param value
	**/
   public void setTb33006BlCycNo(char[] value) {
      tb33006BlCycNo = checkTb33006BlCycNoConstraints(value);
      serializeTb33006BlCycNo(tb33006BlCycNo);
   } 

     /**
	 * 	Update Tb33006BlCycNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006BlCycNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006BlCycNo,tb33006BlCycNo.length);
   	
   }
   
   public void setTb33006BlCycNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlCycNo,tb33006BlCycNo.length);
   	
   }
   
     /**
	 * 	Update Tb33006BlCycNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006BlCycNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlCycNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006BlCycNo with another Field
	 *	@param value
	 */
   public void setTb33006BlCycNo(Field source) {
       replace(source,0,source.length(),beginTb33006BlCycNo,TB_33006_BL_CYC_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006BlCycNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006BlCycNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006BlCycNo,TB_33006_BL_CYC_NO_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006BlCycNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006BlCycNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlCycNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006BlStreamCd
	 *	@return tb33006BlStreamCd
	 */
   public char[] getTb33006BlStreamCd() throws CFException{
     if (isTb33006BlStreamCdModified()) { 
        tb33006BlStreamCd = refreshTb33006BlStreamCd();
     }
   		return tb33006BlStreamCd;
   }

  
	/**
	*  set variable tb33006BlStreamCd
	*  Corresponding COBOL Variable is TB33006-BL-STREAM-CD
	*  @param value
	**/
   public void setTb33006BlStreamCd(char[] value) {
      tb33006BlStreamCd = checkTb33006BlStreamCdConstraints(value);
      serializeTb33006BlStreamCd(tb33006BlStreamCd);
   } 

     /**
	 * 	Update Tb33006BlStreamCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006BlStreamCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006BlStreamCd,tb33006BlStreamCd.length);
   	
   }
   
   public void setTb33006BlStreamCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlStreamCd,tb33006BlStreamCd.length);
   	
   }
   
     /**
	 * 	Update Tb33006BlStreamCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006BlStreamCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlStreamCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006BlStreamCd with another Field
	 *	@param value
	 */
   public void setTb33006BlStreamCd(Field source) {
       replace(source,0,source.length(),beginTb33006BlStreamCd,TB_33006_BL_STREAM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006BlStreamCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006BlStreamCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006BlStreamCd,TB_33006_BL_STREAM_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006BlStreamCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006BlStreamCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006BlStreamCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006JobIterationNo
	 *	@return tb33006JobIterationNo
	 */
	public short getTb33006JobIterationNo() throws CFException {
        if (isTb33006JobIterationNoModified()) { 
           tb33006JobIterationNo = refreshTb33006JobIterationNo();
        }
   		return tb33006JobIterationNo;
	}
	
	/**
	 * 	Update Tb33006JobIterationNo with the passed value
	 *  Corresponding COBOL Variable is TB33006-JOB-ITERATION-NO
	 *	@param number
	 */
	public void setTb33006JobIterationNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tb33006JobIterationNo = checkTb33006JobIterationNoMaxLimit(number); 
		serializeTb33006JobIterationNo(tb33006JobIterationNo);
	}

	public void setTb33006JobIterationNo(int number) {
	    number = checkTb33006JobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTb33006JobIterationNo((short)number);
	}
	public void setTb33006JobIterationNo(long number) {
	    number = checkTb33006JobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTb33006JobIterationNo((short)number);
	}
	

	/**
	 *	Returns the value of tb33006PhaseTyp
	 *	@return tb33006PhaseTyp
	 */
   public char[] getTb33006PhaseTyp() throws CFException{
     if (isTb33006PhaseTypModified()) { 
        tb33006PhaseTyp = refreshTb33006PhaseTyp();
     }
   		return tb33006PhaseTyp;
   }

  
	/**
	*  set variable tb33006PhaseTyp
	*  Corresponding COBOL Variable is TB33006-PHASE-TYP
	*  @param value
	**/
   public void setTb33006PhaseTyp(char[] value) {
      tb33006PhaseTyp = checkTb33006PhaseTypConstraints(value);
      serializeTb33006PhaseTyp(tb33006PhaseTyp);
   } 

     /**
	 * 	Update Tb33006PhaseTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006PhaseTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006PhaseTyp,tb33006PhaseTyp.length);
   	
   }
   
   public void setTb33006PhaseTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006PhaseTyp,tb33006PhaseTyp.length);
   	
   }
   
     /**
	 * 	Update Tb33006PhaseTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006PhaseTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006PhaseTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006PhaseTyp with another Field
	 *	@param value
	 */
   public void setTb33006PhaseTyp(Field source) {
       replace(source,0,source.length(),beginTb33006PhaseTyp,TB_33006_PHASE_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006PhaseTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006PhaseTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006PhaseTyp,TB_33006_PHASE_TYP_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006PhaseTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006PhaseTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006PhaseTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006CycMthYr
	 *	@return tb33006CycMthYr
	 */
   public char[] getTb33006CycMthYr() throws CFException{
     if (isTb33006CycMthYrModified()) { 
        tb33006CycMthYr = refreshTb33006CycMthYr();
     }
   		return tb33006CycMthYr;
   }

  
	/**
	*  set variable tb33006CycMthYr
	*  Corresponding COBOL Variable is TB33006-CYC-MTH-YR
	*  @param value
	**/
   public void setTb33006CycMthYr(char[] value) {
      tb33006CycMthYr = checkTb33006CycMthYrConstraints(value);
      serializeTb33006CycMthYr(tb33006CycMthYr);
   } 

     /**
	 * 	Update Tb33006CycMthYr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006CycMthYr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006CycMthYr,tb33006CycMthYr.length);
   	
   }
   
   public void setTb33006CycMthYr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006CycMthYr,tb33006CycMthYr.length);
   	
   }
   
     /**
	 * 	Update Tb33006CycMthYr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006CycMthYr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006CycMthYr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006CycMthYr with another Field
	 *	@param value
	 */
   public void setTb33006CycMthYr(Field source) {
       replace(source,0,source.length(),beginTb33006CycMthYr,TB_33006_CYC_MTH_YR_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006CycMthYr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006CycMthYr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006CycMthYr,TB_33006_CYC_MTH_YR_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006CycMthYr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006CycMthYr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006CycMthYr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006RptTypCd
	 *	@return tb33006RptTypCd
	 */
   public char[] getTb33006RptTypCd() throws CFException{
     if (isTb33006RptTypCdModified()) { 
        tb33006RptTypCd = refreshTb33006RptTypCd();
     }
   		return tb33006RptTypCd;
   }

  
	/**
	*  set variable tb33006RptTypCd
	*  Corresponding COBOL Variable is TB33006-RPT-TYP-CD
	*  @param value
	**/
   public void setTb33006RptTypCd(char[] value) {
      tb33006RptTypCd = checkTb33006RptTypCdConstraints(value);
      serializeTb33006RptTypCd(tb33006RptTypCd);
   } 

     /**
	 * 	Update Tb33006RptTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006RptTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006RptTypCd,tb33006RptTypCd.length);
   	
   }
   
   public void setTb33006RptTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptTypCd,tb33006RptTypCd.length);
   	
   }
   
     /**
	 * 	Update Tb33006RptTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006RptTypCd with another Field
	 *	@param value
	 */
   public void setTb33006RptTypCd(Field source) {
       replace(source,0,source.length(),beginTb33006RptTypCd,TB_33006_RPT_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006RptTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006RptTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006RptTypCd,TB_33006_RPT_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006RptTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006RptAttrCd
	 *	@return tb33006RptAttrCd
	 */
   public char[] getTb33006RptAttrCd() throws CFException{
     if (isTb33006RptAttrCdModified()) { 
        tb33006RptAttrCd = refreshTb33006RptAttrCd();
     }
   		return tb33006RptAttrCd;
   }

  
	/**
	*  set variable tb33006RptAttrCd
	*  Corresponding COBOL Variable is TB33006-RPT-ATTR-CD
	*  @param value
	**/
   public void setTb33006RptAttrCd(char[] value) {
      tb33006RptAttrCd = checkTb33006RptAttrCdConstraints(value);
      serializeTb33006RptAttrCd(tb33006RptAttrCd);
   } 

     /**
	 * 	Update Tb33006RptAttrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006RptAttrCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006RptAttrCd,tb33006RptAttrCd.length);
   	
   }
   
   public void setTb33006RptAttrCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptAttrCd,tb33006RptAttrCd.length);
   	
   }
   
     /**
	 * 	Update Tb33006RptAttrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptAttrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptAttrCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006RptAttrCd with another Field
	 *	@param value
	 */
   public void setTb33006RptAttrCd(Field source) {
       replace(source,0,source.length(),beginTb33006RptAttrCd,TB_33006_RPT_ATTR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006RptAttrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006RptAttrCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006RptAttrCd,TB_33006_RPT_ATTR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006RptAttrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptAttrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptAttrCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006RptAttrIdNo
	 *	@return tb33006RptAttrIdNo
	 */
	public int getTb33006RptAttrIdNo() throws CFException {
        if (isTb33006RptAttrIdNoModified()) { 
           tb33006RptAttrIdNo = refreshTb33006RptAttrIdNo();
        }
   		return tb33006RptAttrIdNo;
	}
	
	/**
	 * 	Update Tb33006RptAttrIdNo with the passed value
	 *  Corresponding COBOL Variable is TB33006-RPT-ATTR-ID-NO
	 *	@param number
	 */
	public void setTb33006RptAttrIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb33006RptAttrIdNo = checkTb33006RptAttrIdNoMaxLimit(number); 
		serializeTb33006RptAttrIdNo(tb33006RptAttrIdNo);
	}


	public void setTb33006RptAttrIdNo(long number) {
	    number = checkTb33006RptAttrIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb33006RptAttrIdNo((int)number);
	}
	
	/**
	 *	Returns the value of tb33006RptColNameCd
	 *	@return tb33006RptColNameCd
	 */
   public char[] getTb33006RptColNameCd() throws CFException{
     if (isTb33006RptColNameCdModified()) { 
        tb33006RptColNameCd = refreshTb33006RptColNameCd();
     }
   		return tb33006RptColNameCd;
   }

  
	/**
	*  set variable tb33006RptColNameCd
	*  Corresponding COBOL Variable is TB33006-RPT-COL-NAME-CD
	*  @param value
	**/
   public void setTb33006RptColNameCd(char[] value) {
      tb33006RptColNameCd = checkTb33006RptColNameCdConstraints(value);
      serializeTb33006RptColNameCd(tb33006RptColNameCd);
   } 

     /**
	 * 	Update Tb33006RptColNameCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006RptColNameCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006RptColNameCd,tb33006RptColNameCd.length);
   	
   }
   
   public void setTb33006RptColNameCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColNameCd,tb33006RptColNameCd.length);
   	
   }
   
     /**
	 * 	Update Tb33006RptColNameCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptColNameCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColNameCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006RptColNameCd with another Field
	 *	@param value
	 */
   public void setTb33006RptColNameCd(Field source) {
       replace(source,0,source.length(),beginTb33006RptColNameCd,TB_33006_RPT_COL_NAME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006RptColNameCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006RptColNameCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006RptColNameCd,TB_33006_RPT_COL_NAME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006RptColNameCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptColNameCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColNameCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006RptColTypCd
	 *	@return tb33006RptColTypCd
	 */
   public char[] getTb33006RptColTypCd() throws CFException{
     if (isTb33006RptColTypCdModified()) { 
        tb33006RptColTypCd = refreshTb33006RptColTypCd();
     }
   		return tb33006RptColTypCd;
   }

  
	/**
	*  set variable tb33006RptColTypCd
	*  Corresponding COBOL Variable is TB33006-RPT-COL-TYP-CD
	*  @param value
	**/
   public void setTb33006RptColTypCd(char[] value) {
      tb33006RptColTypCd = checkTb33006RptColTypCdConstraints(value);
      serializeTb33006RptColTypCd(tb33006RptColTypCd);
   } 

     /**
	 * 	Update Tb33006RptColTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006RptColTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006RptColTypCd,tb33006RptColTypCd.length);
   	
   }
   
   public void setTb33006RptColTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColTypCd,tb33006RptColTypCd.length);
   	
   }
   
     /**
	 * 	Update Tb33006RptColTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptColTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006RptColTypCd with another Field
	 *	@param value
	 */
   public void setTb33006RptColTypCd(Field source) {
       replace(source,0,source.length(),beginTb33006RptColTypCd,TB_33006_RPT_COL_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006RptColTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006RptColTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006RptColTypCd,TB_33006_RPT_COL_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006RptColTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006RptColTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006RptColTypCd+targetIndex,targetLen);
    
   }
	public BigDecimal getTb33006RptColValue() throws CFException {
        if (isTb33006RptColValueModified()) { 
           tb33006RptColValue = refreshTb33006RptColValue();
        }
   		return tb33006RptColValue;
	}

    public char[] getTb33006RptColValueString() {
          return  tb33006RptColValueString();
    }
	
	/**
	 * 	Update Tb33006RptColValue with the passed number
	 *  Corresponding COBOL Variable is TB33006-RPT-COL-VALUE
	 *	@param number
	 */
	public void setTb33006RptColValue(BigDecimal number) {	
     tb33006RptColValue = checkTb33006RptColValueMaxLimit(number);
	    serializeTb33006RptColValue(tb33006RptColValue);
   }
	/**
	 *	Returns the value of tb33006DbUserid
	 *	@return tb33006DbUserid
	 */
   public char[] getTb33006DbUserid() throws CFException{
     if (isTb33006DbUseridModified()) { 
        tb33006DbUserid = refreshTb33006DbUserid();
     }
   		return tb33006DbUserid;
   }

  
	/**
	*  set variable tb33006DbUserid
	*  Corresponding COBOL Variable is TB33006-DB-USERID
	*  @param value
	**/
   public void setTb33006DbUserid(char[] value) {
      tb33006DbUserid = checkTb33006DbUseridConstraints(value);
      serializeTb33006DbUserid(tb33006DbUserid);
   } 

     /**
	 * 	Update Tb33006DbUserid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006DbUserid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006DbUserid,tb33006DbUserid.length);
   	
   }
   
   public void setTb33006DbUserid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbUserid,tb33006DbUserid.length);
   	
   }
   
     /**
	 * 	Update Tb33006DbUserid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006DbUserid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbUserid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006DbUserid with another Field
	 *	@param value
	 */
   public void setTb33006DbUserid(Field source) {
       replace(source,0,source.length(),beginTb33006DbUserid,TB_33006_DB_USERID_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006DbUserid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006DbUserid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006DbUserid,TB_33006_DB_USERID_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006DbUserid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006DbUserid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbUserid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb33006DbTmstamp
	 *	@return tb33006DbTmstamp
	 */
   public char[] getTb33006DbTmstamp() throws CFException{
     if (isTb33006DbTmstampModified()) { 
        tb33006DbTmstamp = refreshTb33006DbTmstamp();
     }
   		return tb33006DbTmstamp;
   }

  
	/**
	*  set variable tb33006DbTmstamp
	*  Corresponding COBOL Variable is TB33006-DB-TMSTAMP
	*  @param value
	**/
   public void setTb33006DbTmstamp(char[] value) {
      tb33006DbTmstamp = checkTb33006DbTmstampConstraints(value);
      serializeTb33006DbTmstamp(tb33006DbTmstamp);
   } 

     /**
	 * 	Update Tb33006DbTmstamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb33006DbTmstamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb33006DbTmstamp,tb33006DbTmstamp.length);
   	
   }
   
   public void setTb33006DbTmstamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbTmstamp,tb33006DbTmstamp.length);
   	
   }
   
     /**
	 * 	Update Tb33006DbTmstamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb33006DbTmstamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbTmstamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb33006DbTmstamp with another Field
	 *	@param value
	 */
   public void setTb33006DbTmstamp(Field source) {
       replace(source,0,source.length(),beginTb33006DbTmstamp,TB_33006_DB_TMSTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Tb33006DbTmstamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb33006DbTmstamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb33006DbTmstamp,TB_33006_DB_TMSTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Tb33006DbTmstamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb33006DbTmstamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb33006DbTmstamp+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclWipBlCycPhaseAudit
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTb33006BlSegregateNo((short)0);
         setTb33006BlCycNo(CONSTANTS.SPACE_2);
         setTb33006BlStreamCd(CONSTANTS.SPACE);
         	setTb33006JobIterationNo((short)0);
         setTb33006PhaseTyp(CONSTANTS.SPACE_2);
         setTb33006CycMthYr(CONSTANTS.SPACE_6);
         setTb33006RptTypCd(CONSTANTS.SPACE_5);
         setTb33006RptAttrCd(CONSTANTS.SPACE_3);
                     setTb33006RptAttrIdNo(0);
         setTb33006RptColNameCd(CONSTANTS.SPACE_3);
         setTb33006RptColTypCd(CONSTANTS.SPACE);
			setTb33006RptColValue(BigDecimal.ZERO);
         setTb33006DbUserid(CONSTANTS.SPACE_8);
         setTb33006DbTmstamp(CONSTANTS.SPACE_26);
   }

		public static int getDclWipBlCycPhaseAuditFieldLength() {
			return DCL_WIP_BL_CYC_PHASE_AUDIT_LENGTH;
		}

}
  
