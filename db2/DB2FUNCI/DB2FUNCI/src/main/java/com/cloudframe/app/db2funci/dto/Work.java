package com.cloudframe.app.db2funci.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private BigDecimal cntngYldRt = BigDecimal.ZERO;

								private char[] bdms01CntngYldRtEdt = Field.fillLowValue(16);

								private long isinCnt;

								private char[] decimalEdit = Field.fillLowValue(16);

								private int ctryHoliCt;

								private char[] sqlcodeDisp = Field.fillLowValue(5);

						private char[] sysinFlag = new char[1];

						private char[] procnm = Field.fillLowValue(18);

						private char[] schema = Field.fillLowValue(8);

								private int numCursors;

								private int outCode;

								private short parmind;

						private char[] isinCursorFlg = new char[1];

						private char[] loc1 = Field.fillLowValue(0);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCtryHoliCt(0);
								setSysinFlag(fillSpace(1));
								setIsinCursorFlg(fillSpace(1));
    }


 

	public BigDecimal getCntngYldRt() throws CFException {
        if (isCntngYldRtModified()) { 
           cntngYldRt = refreshCntngYldRt();
        }
   		return cntngYldRt;
	}

    public char[] getCntngYldRtString() {
          return  cntngYldRtString();
    }
	
	/**
	 * 	Update CntngYldRt with the passed number
	 *  Corresponding COBOL Variable is WS-CNTNG-YLD-RT
	 *	@param number
	 */
	public void setCntngYldRt(BigDecimal number) {	
     cntngYldRt = checkCntngYldRtMaxLimit(number);
	    serializeCntngYldRt(cntngYldRt);
   }
	/**
	 *	Returns the value of bdms01CntngYldRtEdt
	 *	@return bdms01CntngYldRtEdt
	 */
   public char[] getBdms01CntngYldRtEdt() throws CFException{
     if (isBdms01CntngYldRtEdtModified()) { 
        bdms01CntngYldRtEdt = refreshBdms01CntngYldRtEdt();
     }
   		return bdms01CntngYldRtEdt;
   }

  
	/**
	*  set variable bdms01CntngYldRtEdt
	*  Corresponding COBOL Variable is BDMS01-CNTNG-YLD-RT-EDT
	*  @param value
	**/
   public void setBdms01CntngYldRtEdt(char[] value) {
      bdms01CntngYldRtEdt = checkBdms01CntngYldRtEdtConstraints(value);
      serializeBdms01CntngYldRtEdt(bdms01CntngYldRtEdt);
   } 

     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CntngYldRtEdt,bdms01CntngYldRtEdt.length);
   	
   }
   
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngYldRtEdt,bdms01CntngYldRtEdt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngYldRtEdt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CntngYldRtEdt with another Field
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source) {
       replace(source,0,source.length(),beginBdms01CntngYldRtEdt,BDMS_01_CNTNG_YLD_RT_EDT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CntngYldRtEdt,BDMS_01_CNTNG_YLD_RT_EDT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngYldRtEdt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of isinCnt
	 *	@return isinCnt
	 */
	public long getIsinCnt() throws CFException {
       if (isIsinCntModified()) { 
           isinCnt = refreshIsinCnt();
        }
   		return isinCnt;
	}
	

	
	   
	/**
	 * 	Update IsinCnt with the passed value
	 *  Corresponding COBOL Variable is ISIN-CNT
	 *	@param number
	 */
	public void setIsinCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    isinCnt = checkIsinCntMaxLimit(number); 
		serializeIsinCnt(isinCnt);
	}
	

	/**
	 * 	Update IsinCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsinCnt(char[] value) throws CFException {
		 isinCnt = serializeIsinCnt(value);
	}
	/**
	 * 	Update IsinCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsinCntString(char[] value) throws CFException {
		 setIsinCnt(value);
	}
	/**
	 *	Returns the value of decimalEdit
	 *	@return decimalEdit
	 */
   public char[] getDecimalEdit() throws CFException{
     if (isDecimalEditModified()) { 
        decimalEdit = refreshDecimalEdit();
     }
   		return decimalEdit;
   }

  
	/**
	*  set variable decimalEdit
	*  Corresponding COBOL Variable is DECIMAL-EDIT
	*  @param value
	**/
   public void setDecimalEdit(char[] value) {
      decimalEdit = checkDecimalEditConstraints(value);
      serializeDecimalEdit(decimalEdit);
   } 

     /**
	 * 	Update DecimalEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDecimalEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDecimalEdit,decimalEdit.length);
   	
   }
   
   public void setDecimalEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDecimalEdit,decimalEdit.length);
   	
   }
   
     /**
	 * 	Update DecimalEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDecimalEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDecimalEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DecimalEdit with another Field
	 *	@param value
	 */
   public void setDecimalEdit(Field source) {
       replace(source,0,source.length(),beginDecimalEdit,DECIMAL_EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update DecimalEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDecimalEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDecimalEdit,DECIMAL_EDIT_LEN);
   	
   }
   
     /**
	 * 	Update DecimalEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDecimalEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDecimalEdit+targetIndex,targetLen);
    
   }
	public int getCtryHoliCt() throws CFException {
        if (isCtryHoliCtModified()) { 
           ctryHoliCt = refreshCtryHoliCt();
        }
   		return ctryHoliCt;
	}
	
	/**
	 * 	Update CtryHoliCt with the passed value
	 *  Corresponding COBOL Variable is WS-CTRY-HOLI-CT
	 *	@param number
	 */
	public void setCtryHoliCt(int number) {
			ctryHoliCt = checkCtryHoliCtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCtryHoliCt(ctryHoliCt);
	}


	public void setCtryHoliCt(long number) {
	    number = checkCtryHoliCtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtryHoliCt((int)number);
	}
	
	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException{
     if (isSqlcodeDispModified()) { 
        sqlcodeDisp = refreshSqlcodeDisp();
     }
   		return sqlcodeDisp;
   }

  
	/**
	*  set variable sqlcodeDisp
	*  Corresponding COBOL Variable is SQLCODE-DISP
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) {
      sqlcodeDisp = checkSqlcodeDispConstraints(value);
      serializeSqlcodeDisp(sqlcodeDisp);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
       replace(source,0,source.length(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sysinFlag
	 *	@return sysinFlag
	 */
   public char[] getSysinFlag() throws CFException{
   		return sysinFlag;
   }

  
	/**
	*  set variable sysinFlag
	*  Corresponding COBOL Variable is SYSIN-FLAG
	*  @param value
	**/
   public void setSysinFlag(char[] value) {
       value = checkSysinFlagConstraints(value);
       arraycopy(value,0,sysinFlag,0,value.length);
   } 
	public void setSysinFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sysinFlag,0,beginIndex + endIndex);
   }
	char[] useSysin188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isUseSysin1()
	 *	@return  Returns true if isUseSysin1() is "Y"
	 */
   public boolean isUseSysin1() throws CFException {
      return (  compareChars( getSysinFlag() , useSysin188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setUseSysin1True() {  			
    	setSysinFlag( useSysin188Value);
   	}
	/**
	 *	Returns the value of procnm
	 *	@return procnm
	 */
   public char[] getProcnm() throws CFException{
   		return procnm;
   }

  
	/**
	*  set variable procnm
	*  Corresponding COBOL Variable is PROCNM
	*  @param value
	**/
   public void setProcnm(char[] value) {
       value = checkProcnmConstraints(value);
       arraycopy(value,0,procnm,0,value.length);
   } 
	public void setProcnm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,procnm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of schema
	 *	@return schema
	 */
   public char[] getSchema() throws CFException{
   		return schema;
   }

  
	/**
	*  set variable schema
	*  Corresponding COBOL Variable is SCHEMA
	*  @param value
	**/
   public void setSchema(char[] value) {
       value = checkSchemaConstraints(value);
       arraycopy(value,0,schema,0,value.length);
   } 
	public void setSchema(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,schema,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numCursors
	 *	@return numCursors
	 */
	public int getNumCursors() throws CFException {
   		return numCursors;
	}
	
	/**
	 * 	Update NumCursors with the passed value
	 *  Corresponding COBOL Variable is NUM-CURSORS
	 *	@param number
	 */
	public void setNumCursors(int number) {
	     // Truncate if the number is beyond +/- Max range
	    numCursors = checkNumCursorsMaxLimit(number); 
	}


	public void setNumCursors(long number) {
	    number = checkNumCursorsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumCursors((int)number);
	}
	
	/**
	 *	Returns the value of outCode
	 *	@return outCode
	 */
	public int getOutCode() throws CFException {
   		return outCode;
	}
	
	/**
	 * 	Update OutCode with the passed value
	 *  Corresponding COBOL Variable is OUT-CODE
	 *	@param number
	 */
	public void setOutCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outCode = checkOutCodeMaxLimit(number); 
	}


	public void setOutCode(long number) {
	    number = checkOutCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutCode((int)number);
	}
	
	/**
	 *	Returns the value of parmind
	 *	@return parmind
	 */
	public short getParmind() throws CFException {
   		return parmind;
	}
	
	/**
	 * 	Update Parmind with the passed value
	 *  Corresponding COBOL Variable is PARMIND
	 *	@param number
	 */
	public void setParmind(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmind = checkParmindMaxLimit(number); 
	}

	public void setParmind(int number) {
	    number = checkParmindMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmind((short)number);
	}
	public void setParmind(long number) {
	    number = checkParmindMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmind((short)number);
	}
	

	/**
	 *	Returns the value of isinCursorFlg
	 *	@return isinCursorFlg
	 */
   public char[] getIsinCursorFlg() throws CFException{
   		return isinCursorFlg;
   }

  
	/**
	*  set variable isinCursorFlg
	*  Corresponding COBOL Variable is ISIN-CURSOR-FLG
	*  @param value
	**/
   public void setIsinCursorFlg(char[] value) {
       value = checkIsinCursorFlgConstraints(value);
       arraycopy(value,0,isinCursorFlg,0,value.length);
   } 
	public void setIsinCursorFlg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isinCursorFlg,0,beginIndex + endIndex);
   }
	char[] eocIsinCursor88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEocIsinCursor()
	 *	@return  Returns true if isEocIsinCursor() is "Y"
	 */
   public boolean isEocIsinCursor() throws CFException {
      return (  compareChars( getIsinCursorFlg() , eocIsinCursor88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEocIsinCursorTrue() {  			
    	setIsinCursorFlg( eocIsinCursor88Value);
   	}
	/**
	 *	Returns the value of loc1
	 *	@return loc1
	 */
   public char[] getLoc1() throws CFException{
   		return loc1;
   }

  
	/**
	*  set variable loc1
	*  Corresponding COBOL Variable is LOC1
	*  @param value
	**/
   public void setLoc1(char[] value) {
       value = checkLoc1Constraints(value);
       arraycopy(value,0,loc1,0,value.length);
   } 
	public void setLoc1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,loc1,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
