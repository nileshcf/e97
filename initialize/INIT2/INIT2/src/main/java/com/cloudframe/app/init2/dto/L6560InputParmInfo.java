package com.cloudframe.app.init2.dto;

/**
*  The class L6560InputParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:12. using version 5.0.0.257
**/


import com.cloudframe.app.init2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class L6560InputParmInfo extends L6560InputParmInfoSerialized { 
   

						private char[] l6560RqstCd = Field.fillLowValue(2);

						private char[] l6560EffDt = Field.fillLowValue(10);

								private short l6560Cvg;

								private BigDecimal l6560SurrAmt = BigDecimal.ZERO;

						private char[] l6560SurrChrgTypCd = Field.fillLowValue(1);

								private BigDecimal l6560PolAcumValuAmt = BigDecimal.ZERO;

								private BigDecimal l6560CvgAcumValuAmt = BigDecimal.ZERO;

								private BigDecimal l6560MthvAdjAmt = BigDecimal.ZERO;

								private BigDecimal l6560MktvalAdjPct = BigDecimal.ZERO;

						private char[] l6560CalcIfTerminatedSw = Field.fillLowValue(1);

						private char[] l6560FreeWthAppliedInd = Field.fillLowValue(1);
				private L6560DbscInfo l6560DbscInfo = new L6560DbscInfo();

						private char[] l6560SurrChrgOvridInd = Field.fillLowValue(1);

	
	/**
	* Constructor for L6560InputParmInfo
	**/
    public L6560InputParmInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for L6560InputParmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560InputParmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			l6560DbscInfo.setParent(this,getStartOffset() + 56);
    } 

	/**
	 *	Returns the value of l6560RqstCd
	 *	@return l6560RqstCd
	 */
   public char[] getL6560RqstCd() throws CFException{
     if (isL6560RqstCdModified()) { 
        l6560RqstCd = refreshL6560RqstCd();
     }
   		return l6560RqstCd;
   }

  
	/**
	*  set variable l6560RqstCd
	*  Corresponding COBOL Variable is L6560-RQST-CD
	*  @param value
	**/
   public void setL6560RqstCd(char[] value) {
      l6560RqstCd = checkL6560RqstCdConstraints(value);
      serializeL6560RqstCd(l6560RqstCd);
   } 

     /**
	 * 	Update L6560RqstCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560RqstCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560RqstCd,l6560RqstCd.length);
   	
   }
   
   public void setL6560RqstCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560RqstCd,l6560RqstCd.length);
   	
   }
   
     /**
	 * 	Update L6560RqstCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560RqstCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560RqstCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560RqstCd with another Field
	 *	@param value
	 */
   public void setL6560RqstCd(Field source) {
       replace(source,0,source.length(),beginL6560RqstCd,L_6560_RQST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update L6560RqstCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560RqstCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560RqstCd,L_6560_RQST_CD_LEN);
   	
   }
   
     /**
	 * 	Update L6560RqstCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560RqstCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560RqstCd+targetIndex,targetLen);
    
   }
	char[] l6560RqstCalcSurrChrg88Value = "SC".toCharArray();
	/**
	 *	Test condition "SC" for isL6560RqstCalcSurrChrg()
	 *	@return  Returns true if isL6560RqstCalcSurrChrg() is "SC"
	 */
   public boolean isL6560RqstCalcSurrChrg() throws CFException {
      return (  compareChars( getL6560RqstCd() , l6560RqstCalcSurrChrg88Value)  == 0  );
   }


	/**
	*  set values "SC"
	*/
   	public void setL6560RqstCalcSurrChrgTrue() {  			
    	setL6560RqstCd( l6560RqstCalcSurrChrg88Value);
   	}
	/**
	 *	Returns the value of l6560EffDt
	 *	@return l6560EffDt
	 */
   public char[] getL6560EffDt() throws CFException{
     if (isL6560EffDtModified()) { 
        l6560EffDt = refreshL6560EffDt();
     }
   		return l6560EffDt;
   }

  
	/**
	*  set variable l6560EffDt
	*  Corresponding COBOL Variable is L6560-EFF-DT
	*  @param value
	**/
   public void setL6560EffDt(char[] value) {
      l6560EffDt = checkL6560EffDtConstraints(value);
      serializeL6560EffDt(l6560EffDt);
   } 

     /**
	 * 	Update L6560EffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560EffDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560EffDt,l6560EffDt.length);
   	
   }
   
   public void setL6560EffDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560EffDt,l6560EffDt.length);
   	
   }
   
     /**
	 * 	Update L6560EffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560EffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560EffDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560EffDt with another Field
	 *	@param value
	 */
   public void setL6560EffDt(Field source) {
       replace(source,0,source.length(),beginL6560EffDt,L_6560_EFF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update L6560EffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560EffDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560EffDt,L_6560_EFF_DT_LEN);
   	
   }
   
     /**
	 * 	Update L6560EffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560EffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560EffDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l6560Cvg
	 *	@return l6560Cvg
	 */
	public short getL6560Cvg() throws CFException {
        if (isL6560CvgModified()) { 
           l6560Cvg = refreshL6560Cvg();
        }
   		return l6560Cvg;
	}
	
	/**
	 * 	Update L6560Cvg with the passed value
	 *  Corresponding COBOL Variable is L6560-CVG
	 *	@param number
	 */
	public void setL6560Cvg(short number) {
	     // Truncate if the number is beyond +/- Max range
	    l6560Cvg = checkL6560CvgMaxLimit(number); 
		serializeL6560Cvg(l6560Cvg);
	}

	public void setL6560Cvg(int number) {
	    number = checkL6560CvgMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL6560Cvg((short)number);
	}
	public void setL6560Cvg(long number) {
	    number = checkL6560CvgMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL6560Cvg((short)number);
	}
	

	public BigDecimal getL6560SurrAmt() throws CFException {
        if (isL6560SurrAmtModified()) { 
           l6560SurrAmt = refreshL6560SurrAmt();
        }
   		return l6560SurrAmt;
	}

    public char[] getL6560SurrAmtString() {
          return  l6560SurrAmtString();
    }
	
	/**
	 * 	Update L6560SurrAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-SURR-AMT
	 *	@param number
	 */
	public void setL6560SurrAmt(BigDecimal number) {	
     l6560SurrAmt = checkL6560SurrAmtMaxLimit(number);
	    serializeL6560SurrAmt(l6560SurrAmt);
   }
	/**
	 *	Returns the value of l6560SurrChrgTypCd
	 *	@return l6560SurrChrgTypCd
	 */
   public char[] getL6560SurrChrgTypCd() throws CFException{
     if (isL6560SurrChrgTypCdModified()) { 
        l6560SurrChrgTypCd = refreshL6560SurrChrgTypCd();
     }
   		return l6560SurrChrgTypCd;
   }

  
	/**
	*  set variable l6560SurrChrgTypCd
	*  Corresponding COBOL Variable is L6560-SURR-CHRG-TYP-CD
	*  @param value
	**/
   public void setL6560SurrChrgTypCd(char[] value) {
      l6560SurrChrgTypCd = checkL6560SurrChrgTypCdConstraints(value);
      serializeL6560SurrChrgTypCd(l6560SurrChrgTypCd);
   } 

     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560SurrChrgTypCd,l6560SurrChrgTypCd.length);
   	
   }
   
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgTypCd,l6560SurrChrgTypCd.length);
   	
   }
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560SurrChrgTypCd with another Field
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source) {
       replace(source,0,source.length(),beginL6560SurrChrgTypCd,L_6560_SURR_CHRG_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560SurrChrgTypCd,L_6560_SURR_CHRG_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update L6560SurrChrgTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgTypCd+targetIndex,targetLen);
    
   }
	char[] l6560SurrChrgTypFull88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isL6560SurrChrgTypFull()
	 *	@return  Returns true if isL6560SurrChrgTypFull() is "F"
	 */
   public boolean isL6560SurrChrgTypFull() throws CFException {
      return (  compareChars( getL6560SurrChrgTypCd() , l6560SurrChrgTypFull88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setL6560SurrChrgTypFullTrue() {  			
    	setL6560SurrChrgTypCd( l6560SurrChrgTypFull88Value);
   	}
	char[] l6560SurrChrgTypPartl88Value1 = "G".toCharArray();
char[] l6560SurrChrgTypPartl88Value2 = "N".toCharArray();

	/**
	 *	Test condition "G" "N" for isL6560SurrChrgTypPartl()
	 *	@return  Returns true if isL6560SurrChrgTypPartl() is "G" "N"
	 */
   public boolean isL6560SurrChrgTypPartl() throws CFException {
      return (  compareChars( getL6560SurrChrgTypCd() , l6560SurrChrgTypPartl88Value1)  == 0  ||  compareChars( getL6560SurrChrgTypCd() , l6560SurrChrgTypPartl88Value2)  == 0  );
   }


	/**
	*  set values "G" "N"
	*/
   	public void setL6560SurrChrgTypPartlTrue() {  			
    	setL6560SurrChrgTypCd( l6560SurrChrgTypPartl88Value1);
   	}
	char[] l6560SurrChrgTypPartlGrs88Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isL6560SurrChrgTypPartlGrs()
	 *	@return  Returns true if isL6560SurrChrgTypPartlGrs() is "G"
	 */
   public boolean isL6560SurrChrgTypPartlGrs() throws CFException {
      return (  compareChars( getL6560SurrChrgTypCd() , l6560SurrChrgTypPartlGrs88Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setL6560SurrChrgTypPartlGrsTrue() {  			
    	setL6560SurrChrgTypCd( l6560SurrChrgTypPartlGrs88Value);
   	}
	char[] l6560SurrChrgTypPartlNet88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560SurrChrgTypPartlNet()
	 *	@return  Returns true if isL6560SurrChrgTypPartlNet() is "N"
	 */
   public boolean isL6560SurrChrgTypPartlNet() throws CFException {
      return (  compareChars( getL6560SurrChrgTypCd() , l6560SurrChrgTypPartlNet88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560SurrChrgTypPartlNetTrue() {  			
    	setL6560SurrChrgTypCd( l6560SurrChrgTypPartlNet88Value);
   	}
	public BigDecimal getL6560PolAcumValuAmt() throws CFException {
        if (isL6560PolAcumValuAmtModified()) { 
           l6560PolAcumValuAmt = refreshL6560PolAcumValuAmt();
        }
   		return l6560PolAcumValuAmt;
	}

    public char[] getL6560PolAcumValuAmtString() {
          return  l6560PolAcumValuAmtString();
    }
	
	/**
	 * 	Update L6560PolAcumValuAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-POL-ACUM-VALU-AMT
	 *	@param number
	 */
	public void setL6560PolAcumValuAmt(BigDecimal number) {	
     l6560PolAcumValuAmt = checkL6560PolAcumValuAmtMaxLimit(number);
	    serializeL6560PolAcumValuAmt(l6560PolAcumValuAmt);
   }
	public BigDecimal getL6560CvgAcumValuAmt() throws CFException {
        if (isL6560CvgAcumValuAmtModified()) { 
           l6560CvgAcumValuAmt = refreshL6560CvgAcumValuAmt();
        }
   		return l6560CvgAcumValuAmt;
	}

    public char[] getL6560CvgAcumValuAmtString() {
          return  l6560CvgAcumValuAmtString();
    }
	
	/**
	 * 	Update L6560CvgAcumValuAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-CVG-ACUM-VALU-AMT
	 *	@param number
	 */
	public void setL6560CvgAcumValuAmt(BigDecimal number) {	
     l6560CvgAcumValuAmt = checkL6560CvgAcumValuAmtMaxLimit(number);
	    serializeL6560CvgAcumValuAmt(l6560CvgAcumValuAmt);
   }
	public BigDecimal getL6560MthvAdjAmt() throws CFException {
        if (isL6560MthvAdjAmtModified()) { 
           l6560MthvAdjAmt = refreshL6560MthvAdjAmt();
        }
   		return l6560MthvAdjAmt;
	}

    public char[] getL6560MthvAdjAmtString() {
          return  l6560MthvAdjAmtString();
    }
	
	/**
	 * 	Update L6560MthvAdjAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-MTHV-ADJ-AMT
	 *	@param number
	 */
	public void setL6560MthvAdjAmt(BigDecimal number) {	
     l6560MthvAdjAmt = checkL6560MthvAdjAmtMaxLimit(number);
	    serializeL6560MthvAdjAmt(l6560MthvAdjAmt);
   }
	public BigDecimal getL6560MktvalAdjPct() throws CFException {
        if (isL6560MktvalAdjPctModified()) { 
           l6560MktvalAdjPct = refreshL6560MktvalAdjPct();
        }
   		return l6560MktvalAdjPct;
	}

    public char[] getL6560MktvalAdjPctString() {
          return  l6560MktvalAdjPctString();
    }
	
	/**
	 * 	Update L6560MktvalAdjPct with the passed number
	 *  Corresponding COBOL Variable is L6560-MKTVAL-ADJ-PCT
	 *	@param number
	 */
	public void setL6560MktvalAdjPct(BigDecimal number) {	
     l6560MktvalAdjPct = checkL6560MktvalAdjPctMaxLimit(number);
	    serializeL6560MktvalAdjPct(l6560MktvalAdjPct);
   }
	/**
	 *	Returns the value of l6560CalcIfTerminatedSw
	 *	@return l6560CalcIfTerminatedSw
	 */
   public char[] getL6560CalcIfTerminatedSw() throws CFException{
     if (isL6560CalcIfTerminatedSwModified()) { 
        l6560CalcIfTerminatedSw = refreshL6560CalcIfTerminatedSw();
     }
   		return l6560CalcIfTerminatedSw;
   }

  
	/**
	*  set variable l6560CalcIfTerminatedSw
	*  Corresponding COBOL Variable is L6560-CALC-IF-TERMINATED-SW
	*  @param value
	**/
   public void setL6560CalcIfTerminatedSw(char[] value) {
      l6560CalcIfTerminatedSw = checkL6560CalcIfTerminatedSwConstraints(value);
      serializeL6560CalcIfTerminatedSw(l6560CalcIfTerminatedSw);
   } 

     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560CalcIfTerminatedSw,l6560CalcIfTerminatedSw.length);
   	
   }
   
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560CalcIfTerminatedSw,l6560CalcIfTerminatedSw.length);
   	
   }
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560CalcIfTerminatedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560CalcIfTerminatedSw with another Field
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source) {
       replace(source,0,source.length(),beginL6560CalcIfTerminatedSw,L_6560_CALC_IF_TERMINATED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560CalcIfTerminatedSw,L_6560_CALC_IF_TERMINATED_SW_LEN);
   	
   }
   
     /**
	 * 	Update L6560CalcIfTerminatedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560CalcIfTerminatedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560CalcIfTerminatedSw+targetIndex,targetLen);
    
   }
	char[] l6560CalcIfTerminatedNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560CalcIfTerminatedNo()
	 *	@return  Returns true if isL6560CalcIfTerminatedNo() is "N"
	 */
   public boolean isL6560CalcIfTerminatedNo() throws CFException {
      return (  compareChars( getL6560CalcIfTerminatedSw() , l6560CalcIfTerminatedNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560CalcIfTerminatedNoTrue() {  			
    	setL6560CalcIfTerminatedSw( l6560CalcIfTerminatedNo88Value);
   	}
	char[] l6560CalcIfTerminated88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isL6560CalcIfTerminated()
	 *	@return  Returns true if isL6560CalcIfTerminated() is "Y"
	 */
   public boolean isL6560CalcIfTerminated() throws CFException {
      return (  compareChars( getL6560CalcIfTerminatedSw() , l6560CalcIfTerminated88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setL6560CalcIfTerminatedTrue() {  			
    	setL6560CalcIfTerminatedSw( l6560CalcIfTerminated88Value);
   	}
	/**
	 *	Returns the value of l6560FreeWthAppliedInd
	 *	@return l6560FreeWthAppliedInd
	 */
   public char[] getL6560FreeWthAppliedInd() throws CFException{
     if (isL6560FreeWthAppliedIndModified()) { 
        l6560FreeWthAppliedInd = refreshL6560FreeWthAppliedInd();
     }
   		return l6560FreeWthAppliedInd;
   }

  
	/**
	*  set variable l6560FreeWthAppliedInd
	*  Corresponding COBOL Variable is L6560-FREE-WTH-APPLIED-IND
	*  @param value
	**/
   public void setL6560FreeWthAppliedInd(char[] value) {
      l6560FreeWthAppliedInd = checkL6560FreeWthAppliedIndConstraints(value);
      serializeL6560FreeWthAppliedInd(l6560FreeWthAppliedInd);
   } 

     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560FreeWthAppliedInd,l6560FreeWthAppliedInd.length);
   	
   }
   
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560FreeWthAppliedInd,l6560FreeWthAppliedInd.length);
   	
   }
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560FreeWthAppliedInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560FreeWthAppliedInd with another Field
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source) {
       replace(source,0,source.length(),beginL6560FreeWthAppliedInd,L_6560_FREE_WTH_APPLIED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560FreeWthAppliedInd,L_6560_FREE_WTH_APPLIED_IND_LEN);
   	
   }
   
     /**
	 * 	Update L6560FreeWthAppliedInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560FreeWthAppliedInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560FreeWthAppliedInd+targetIndex,targetLen);
    
   }
	char[] l6560FreeWthApplied88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isL6560FreeWthApplied()
	 *	@return  Returns true if isL6560FreeWthApplied() is "Y"
	 */
   public boolean isL6560FreeWthApplied() throws CFException {
      return (  compareChars( getL6560FreeWthAppliedInd() , l6560FreeWthApplied88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setL6560FreeWthAppliedTrue() {  			
    	setL6560FreeWthAppliedInd( l6560FreeWthApplied88Value);
   	}
	char[] l6560FreeWthNotApplied88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560FreeWthNotApplied()
	 *	@return  Returns true if isL6560FreeWthNotApplied() is "N"
	 */
   public boolean isL6560FreeWthNotApplied() throws CFException {
      return (  compareChars( getL6560FreeWthAppliedInd() , l6560FreeWthNotApplied88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560FreeWthNotAppliedTrue() {  			
    	setL6560FreeWthAppliedInd( l6560FreeWthNotApplied88Value);
   	}
	/**
	 *	Returns the value of l6560DbscInfo
	 *	@return l6560DbscInfo
	 */   
	 public L6560DbscInfo getL6560DbscInfo() {
   	return l6560DbscInfo;
   }
   /**
	* 	Update L6560DbscInfo with the passed value
	*   Corresponding COBOL Variable is L6560-DBSC-INFO
	*	@param value
	*/
   public void setL6560DbscInfo(char[] value) {
      l6560DbscInfo.setString(value); 
   }   
    
     /**
	 * 	Update L6560DbscInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560DbscInfo.begin,l6560DbscInfo.length());
   }
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560DbscInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update L6560DbscInfo with another Field
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source) {
   	replace(source,0,source.length(),l6560DbscInfo.begin,l6560DbscInfo.length());
   }  
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560DbscInfo.begin,l6560DbscInfo.length());
   }
   
     /**
	 * 	Update L6560DbscInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560DbscInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of l6560SurrChrgOvridInd
	 *	@return l6560SurrChrgOvridInd
	 */
   public char[] getL6560SurrChrgOvridInd() throws CFException{
     if (isL6560SurrChrgOvridIndModified()) { 
        l6560SurrChrgOvridInd = refreshL6560SurrChrgOvridInd();
     }
   		return l6560SurrChrgOvridInd;
   }

  
	/**
	*  set variable l6560SurrChrgOvridInd
	*  Corresponding COBOL Variable is L6560-SURR-CHRG-OVRID-IND
	*  @param value
	**/
   public void setL6560SurrChrgOvridInd(char[] value) {
      l6560SurrChrgOvridInd = checkL6560SurrChrgOvridIndConstraints(value);
      serializeL6560SurrChrgOvridInd(l6560SurrChrgOvridInd);
   } 

     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560SurrChrgOvridInd,l6560SurrChrgOvridInd.length);
   	
   }
   
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgOvridInd,l6560SurrChrgOvridInd.length);
   	
   }
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgOvridInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560SurrChrgOvridInd with another Field
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source) {
       replace(source,0,source.length(),beginL6560SurrChrgOvridInd,L_6560_SURR_CHRG_OVRID_IND_LEN);
   	
   }  
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560SurrChrgOvridInd,L_6560_SURR_CHRG_OVRID_IND_LEN);
   	
   }
   
     /**
	 * 	Update L6560SurrChrgOvridInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560SurrChrgOvridInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560SurrChrgOvridInd+targetIndex,targetLen);
    
   }
	char[] l6560SurrChrgOvridChrg88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isL6560SurrChrgOvridChrg()
	 *	@return  Returns true if isL6560SurrChrgOvridChrg() is "C"
	 */
   public boolean isL6560SurrChrgOvridChrg() throws CFException {
      return (  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvridChrg88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setL6560SurrChrgOvridChrgTrue() {  			
    	setL6560SurrChrgOvridInd( l6560SurrChrgOvridChrg88Value);
   	}
	char[] l6560SurrChrgOvridExe88Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isL6560SurrChrgOvridExe()
	 *	@return  Returns true if isL6560SurrChrgOvridExe() is "E"
	 */
   public boolean isL6560SurrChrgOvridExe() throws CFException {
      return (  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvridExe88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setL6560SurrChrgOvridExeTrue() {  			
    	setL6560SurrChrgOvridInd( l6560SurrChrgOvridExe88Value);
   	}
	char[] l6560SurrChrgOvridFee88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isL6560SurrChrgOvridFee()
	 *	@return  Returns true if isL6560SurrChrgOvridFee() is "F"
	 */
   public boolean isL6560SurrChrgOvridFee() throws CFException {
      return (  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvridFee88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setL6560SurrChrgOvridFeeTrue() {  			
    	setL6560SurrChrgOvridInd( l6560SurrChrgOvridFee88Value);
   	}
	char[] l6560SurrChrgOvrid88Value1 = "C".toCharArray();
char[] l6560SurrChrgOvrid88Value2 = "F".toCharArray();

	/**
	 *	Test condition "C" "F" for isL6560SurrChrgOvrid()
	 *	@return  Returns true if isL6560SurrChrgOvrid() is "C" "F"
	 */
   public boolean isL6560SurrChrgOvrid() throws CFException {
      return (  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvrid88Value1)  == 0  ||  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvrid88Value2)  == 0  );
   }


	/**
	*  set values "C" "F"
	*/
   	public void setL6560SurrChrgOvridTrue() {  			
    	setL6560SurrChrgOvridInd( l6560SurrChrgOvrid88Value1);
   	}
	char[] l6560SurrChrgOvridNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560SurrChrgOvridNo()
	 *	@return  Returns true if isL6560SurrChrgOvridNo() is "N"
	 */
   public boolean isL6560SurrChrgOvridNo() throws CFException {
      return (  compareChars( getL6560SurrChrgOvridInd() , l6560SurrChrgOvridNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560SurrChrgOvridNoTrue() {  			
    	setL6560SurrChrgOvridInd( l6560SurrChrgOvridNo88Value);
   	}

	
	
	
	/**
	 * 	initializes L6560InputParmInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setL6560RqstCd(CONSTANTS.SPACE_2);
         setL6560EffDt(CONSTANTS.SPACE_10);
         	setL6560Cvg((short)0);
			setL6560SurrAmt(BigDecimal.ZERO);
         setL6560SurrChrgTypCd(CONSTANTS.SPACE);
			setL6560PolAcumValuAmt(BigDecimal.ZERO);
			setL6560CvgAcumValuAmt(BigDecimal.ZERO);
			setL6560MthvAdjAmt(BigDecimal.ZERO);
			setL6560MktvalAdjPct(BigDecimal.ZERO);
         setL6560CalcIfTerminatedSw(CONSTANTS.SPACE);
         setL6560FreeWthAppliedInd(CONSTANTS.SPACE);
          l6560DbscInfo.initialize();
     
         setL6560SurrChrgOvridInd(CONSTANTS.SPACE);
   }

		public static int getL6560InputParmInfoFieldLength() {
			return L_6560_INPUT_PARM_INFO_LENGTH;
		}

}
  
