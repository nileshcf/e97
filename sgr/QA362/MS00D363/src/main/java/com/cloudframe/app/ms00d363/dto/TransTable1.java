package com.cloudframe.app.ms00d363.dto;

/**
*  The class TransTable1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class TransTable1 extends TransTable1Serialized { 
   

								private int tb1TrnId;

						private char[] tb1TrnDesc = Field.fillLowValue(18);

								private int tb1ImpDec;

								private int tb1ImpDecEp;

								private int tb1TrnSurchgFreeCntIss;

								private int tb1TrnSurchgFreeCntAcq;

								private int tb1TrnAtmAcchrgCntICr;

								private int tb1TrnAtmAcchrgCntIDb;

								private BigDecimal tb1TrnAtmAcchrgAmtICr = BigDecimal.ZERO;

								private BigDecimal tb1TrnAtmAcchrgAmtIDb = BigDecimal.ZERO;

								private int tb1TrnPosAcchrgACntICr;

								private int tb1TrnPosAcchrgACntIDb;

								private BigDecimal tb1TrnPosAcchrgAmtICr = BigDecimal.ZERO;

								private BigDecimal tb1TrnPosAcchrgAmtIDb = BigDecimal.ZERO;

								private int tb1TrnAtmAcchrgRCntICr;

								private int tb1TrnAtmAcchrgRCntIDb;

								private BigDecimal tb1TrnAtmAcchrgRAmtICr = BigDecimal.ZERO;

								private BigDecimal tb1TrnAtmAcchrgRAmtIDb = BigDecimal.ZERO;

								private int tb1TrnPosAcchrgRCntICr;

								private int tb1TrnPosAcchrgRCntIDb;

								private BigDecimal tb1TrnPosAcchrgRAmtICr = BigDecimal.ZERO;

								private BigDecimal tb1TrnPosAcchrgRAmtIDb = BigDecimal.ZERO;

								private int tb1TrnFFinAppCntICr;

								private int tb1TrnFFinAppCntIDb;

								private int tb1TrnFFinDenCntICr;

								private int tb1TrnFFinDenCntIDb;

								private long tb1TrnFFinAmtICr;

								private long tb1TrnFFinAmtIDb;

								private int tb1TrnFFinFeeCntI;

								private int tb1TrnFPctFeeCntI;

								private int tb1TrnFNfinFeeCntI;

								private int tb1TrnFNbilFeeCntI;

								private long tb1TrnFFeeAmtICr;

								private long tb1TrnFFeeAmtIDb;

								private long tb1TrnFMcrAmtICr;

								private long tb1TrnFMcrAmtIDb;

								private long tb1TrnFIcrAmtICr;

								private long tb1TrnFIcrAmtIDb;

								private int tb1TrnEFinAppCntICr;

								private int tb1TrnEFinAppCntIDb;

								private int tb1TrnENsdA15CntICr;

								private int tb1TrnENsdA15CntIDb;

								private int tb1TrnEFinA09CntICr;

								private int tb1TrnEFinA09CntIDb;

								private int tb1TrnEFinDenCntICr;

								private int tb1TrnEFinDenCntIDb;

								private long tb1TrnEFinAmtICr;

								private long tb1TrnEFinAmtIDb;

								private long tb1TrnEFinA09AmtICr;

								private long tb1TrnEFinA09AmtIDb;

								private int tb1TrnEFinFeeCntI;

								private int tb1TrnEPctFeeCntI;

								private int tb1TrnENfinFeeCntI;

								private int tb1TrnENbilFeeCntI;

								private long tb1TrnEFeeAmtICr;

								private long tb1TrnEFeeAmtIDb;

								private long tb1TrnEMcrAmtICr;

								private long tb1TrnEMcrAmtIDb;

								private long tb1TrnEIcrAmtICr;

								private long tb1TrnEIcrAmtIDb;

								private int tb1TrnAtmAcchrgCntACr;

								private int tb1TrnAtmAcchrgCntADb;

								private BigDecimal tb1TrnAtmAcchrgAmtACr = BigDecimal.ZERO;

								private BigDecimal tb1TrnAtmAcchrgAmtADb = BigDecimal.ZERO;

								private int tb1TrnPosAcchrgCntACr;

								private int tb1TrnPosAcchrgCntADb;

								private BigDecimal tb1TrnPosAcchrgAmtACr = BigDecimal.ZERO;

								private BigDecimal tb1TrnPosAcchrgAmtADb = BigDecimal.ZERO;

								private int tb1TrnAtmAcchrgRCntACr;

								private int tb1TrnAtmAcchrgRCntADb;

								private BigDecimal tb1TrnAtmAcchrgRAmtACr = BigDecimal.ZERO;

								private BigDecimal tb1TrnAtmAcchrgRAmtADb = BigDecimal.ZERO;

								private int tb1TrnPosAcchrgRCntACr;

								private int tb1TrnPosAcchrgRCntADb;

								private BigDecimal tb1TrnPosAcchrgRAmtACr = BigDecimal.ZERO;

								private BigDecimal tb1TrnPosAcchrgRAmtADb = BigDecimal.ZERO;

								private int tb1TrnFFinAppCntACr;

								private int tb1TrnFFinAppCntADb;

								private int tb1TrnFFinDenCntACr;

								private int tb1TrnFFinDenCntADb;

								private long tb1TrnFFinAmtACr;

								private long tb1TrnFFinAmtADb;

								private int tb1TrnFFinFeeCntA;

								private int tb1TrnFPctFeeCntA;

								private int tb1TrnFNfinFeeCntA;

								private int tb1TrnFNbilFeeCntA;

								private long tb1TrnFFeeAmtACr;

								private long tb1TrnFFeeAmtADb;

								private int tb1TrnEFinAppCntACr;

								private int tb1TrnEFinAppCntADb;

								private int tb1TrnEFinA09CntACr;

								private int tb1TrnEFinA09CntADb;

								private int tb1TrnENsdA15CntACr;

								private int tb1TrnENsdA15CntADb;

								private int tb1TrnEFinDenCntACr;

								private int tb1TrnEFinDenCntADb;

								private long tb1TrnEFinAmtACr;

								private long tb1TrnEFinAmtADb;

								private long tb1TrnEFinA09AmtACr;

								private long tb1TrnEFinA09AmtADb;

								private int tb1TrnEFinFeeCntA;

								private int tb1TrnEPctFeeCntA;

								private int tb1TrnENfinFeeCntA;

								private int tb1TrnENbilFeeCntA;

								private long tb1TrnEFeeAmtACr;

								private long tb1TrnEFeeAmtADb;
	
	/**
	* Constructor for TransTable1
	**/
    public TransTable1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TransTable1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransTable1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tb1TrnId
	 *	@return tb1TrnId
	 */
	public int getTb1TrnId() throws CFException {
       if (isTb1TrnIdModified()) { 
           tb1TrnId = refreshTb1TrnId();
        }
   		return tb1TrnId;
	}
	

	
	   
	/**
	 * 	Update Tb1TrnId with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ID
	 *	@param number
	 */
	public void setTb1TrnId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tb1TrnId = checkTb1TrnIdMaxLimit(number); 
		serializeTb1TrnId(tb1TrnId);
	}
	

	public void setTb1TrnId(long number) {
	    number = checkTb1TrnIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnId((int)number);
	}
	
	/**
	 * 	Update Tb1TrnId with the passed value
	 *	@param value (String or char[])
	 */
	public void setTb1TrnId(char[] value) throws CFException {
		 tb1TrnId = serializeTb1TrnId(value);
	}
	/**
	 * 	Update Tb1TrnId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTb1TrnIdString(char[] value) throws CFException {
		 setTb1TrnId(value);
	}
	/**
	 *	Returns the value of tb1TrnDesc
	 *	@return tb1TrnDesc
	 */
   public char[] getTb1TrnDesc() throws CFException{
     if (isTb1TrnDescModified()) { 
        tb1TrnDesc = refreshTb1TrnDesc();
     }
   		return tb1TrnDesc;
   }

  
	/**
	*  set variable tb1TrnDesc
	*  Corresponding COBOL Variable is TB1-TRN-DESC
	*  @param value
	**/
   public void setTb1TrnDesc(char[] value) {
      tb1TrnDesc = checkTb1TrnDescConstraints(value);
      serializeTb1TrnDesc(tb1TrnDesc);
   } 

     /**
	 * 	Update Tb1TrnDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb1TrnDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb1TrnDesc,tb1TrnDesc.length);
   	
   }
   
   public void setTb1TrnDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb1TrnDesc,tb1TrnDesc.length);
   	
   }
   
     /**
	 * 	Update Tb1TrnDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb1TrnDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb1TrnDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb1TrnDesc with another Field
	 *	@param value
	 */
   public void setTb1TrnDesc(Field source) {
       replace(source,0,source.length(),beginTb1TrnDesc,TB_1_TRN_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Tb1TrnDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb1TrnDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb1TrnDesc,TB_1_TRN_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Tb1TrnDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb1TrnDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb1TrnDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb1ImpDec
	 *	@return tb1ImpDec
	 */
	public int getTb1ImpDec() throws CFException {
       if (isTb1ImpDecModified()) { 
           tb1ImpDec = refreshTb1ImpDec();
        }
   		return tb1ImpDec;
	}
	

	
	   
	/**
	 * 	Update Tb1ImpDec with the passed value
	 *  Corresponding COBOL Variable is TB1-IMP-DEC
	 *	@param number
	 */
	public void setTb1ImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tb1ImpDec = checkTb1ImpDecMaxLimit(number); 
		serializeTb1ImpDec(tb1ImpDec);
	}
	

	public void setTb1ImpDec(long number) {
	    number = checkTb1ImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1ImpDec((int)number);
	}
	
	/**
	 * 	Update Tb1ImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setTb1ImpDec(char[] value) throws CFException {
		 tb1ImpDec = serializeTb1ImpDec(value);
	}
	/**
	 * 	Update Tb1ImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTb1ImpDecString(char[] value) throws CFException {
		 setTb1ImpDec(value);
	}
	/**
	 *	Returns the value of tb1ImpDecEp
	 *	@return tb1ImpDecEp
	 */
	public int getTb1ImpDecEp() throws CFException {
       if (isTb1ImpDecEpModified()) { 
           tb1ImpDecEp = refreshTb1ImpDecEp();
        }
   		return tb1ImpDecEp;
	}
	

	
	   
	/**
	 * 	Update Tb1ImpDecEp with the passed value
	 *  Corresponding COBOL Variable is TB1-IMP-DEC-EP
	 *	@param number
	 */
	public void setTb1ImpDecEp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tb1ImpDecEp = checkTb1ImpDecEpMaxLimit(number); 
		serializeTb1ImpDecEp(tb1ImpDecEp);
	}
	

	public void setTb1ImpDecEp(long number) {
	    number = checkTb1ImpDecEpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1ImpDecEp((int)number);
	}
	
	/**
	 * 	Update Tb1ImpDecEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setTb1ImpDecEp(char[] value) throws CFException {
		 tb1ImpDecEp = serializeTb1ImpDecEp(value);
	}
	/**
	 * 	Update Tb1ImpDecEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTb1ImpDecEpString(char[] value) throws CFException {
		 setTb1ImpDecEp(value);
	}
	public int getTb1TrnSurchgFreeCntIss() throws CFException {
        if (isTb1TrnSurchgFreeCntIssModified()) { 
           tb1TrnSurchgFreeCntIss = refreshTb1TrnSurchgFreeCntIss();
        }
   		return tb1TrnSurchgFreeCntIss;
	}
	
	/**
	 * 	Update Tb1TrnSurchgFreeCntIss with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-SURCHG-FREE-CNT-ISS
	 *	@param number
	 */
	public void setTb1TrnSurchgFreeCntIss(int number) {
			tb1TrnSurchgFreeCntIss = checkTb1TrnSurchgFreeCntIssMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnSurchgFreeCntIss(tb1TrnSurchgFreeCntIss);
	}


	public void setTb1TrnSurchgFreeCntIss(long number) {
	    number = checkTb1TrnSurchgFreeCntIssMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnSurchgFreeCntIss((int)number);
	}
	
	public int getTb1TrnSurchgFreeCntAcq() throws CFException {
        if (isTb1TrnSurchgFreeCntAcqModified()) { 
           tb1TrnSurchgFreeCntAcq = refreshTb1TrnSurchgFreeCntAcq();
        }
   		return tb1TrnSurchgFreeCntAcq;
	}
	
	/**
	 * 	Update Tb1TrnSurchgFreeCntAcq with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-SURCHG-FREE-CNT-ACQ
	 *	@param number
	 */
	public void setTb1TrnSurchgFreeCntAcq(int number) {
			tb1TrnSurchgFreeCntAcq = checkTb1TrnSurchgFreeCntAcqMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnSurchgFreeCntAcq(tb1TrnSurchgFreeCntAcq);
	}


	public void setTb1TrnSurchgFreeCntAcq(long number) {
	    number = checkTb1TrnSurchgFreeCntAcqMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnSurchgFreeCntAcq((int)number);
	}
	
	public int getTb1TrnAtmAcchrgCntICr() throws CFException {
        if (isTb1TrnAtmAcchrgCntICrModified()) { 
           tb1TrnAtmAcchrgCntICr = refreshTb1TrnAtmAcchrgCntICr();
        }
   		return tb1TrnAtmAcchrgCntICr;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgCntICr(int number) {
			tb1TrnAtmAcchrgCntICr = checkTb1TrnAtmAcchrgCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgCntICr(tb1TrnAtmAcchrgCntICr);
	}


	public void setTb1TrnAtmAcchrgCntICr(long number) {
	    number = checkTb1TrnAtmAcchrgCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgCntICr((int)number);
	}
	
	public int getTb1TrnAtmAcchrgCntIDb() throws CFException {
        if (isTb1TrnAtmAcchrgCntIDbModified()) { 
           tb1TrnAtmAcchrgCntIDb = refreshTb1TrnAtmAcchrgCntIDb();
        }
   		return tb1TrnAtmAcchrgCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgCntIDb(int number) {
			tb1TrnAtmAcchrgCntIDb = checkTb1TrnAtmAcchrgCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgCntIDb(tb1TrnAtmAcchrgCntIDb);
	}


	public void setTb1TrnAtmAcchrgCntIDb(long number) {
	    number = checkTb1TrnAtmAcchrgCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgCntIDb((int)number);
	}
	
	public BigDecimal getTb1TrnAtmAcchrgAmtICr() throws CFException {
        if (isTb1TrnAtmAcchrgAmtICrModified()) { 
           tb1TrnAtmAcchrgAmtICr = refreshTb1TrnAtmAcchrgAmtICr();
        }
   		return tb1TrnAtmAcchrgAmtICr;
	}

    public char[] getTb1TrnAtmAcchrgAmtICrString() {
          return  tb1TrnAtmAcchrgAmtICrString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgAmtICr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgAmtICr(BigDecimal number) {	
     tb1TrnAtmAcchrgAmtICr = checkTb1TrnAtmAcchrgAmtICrMaxLimit(number);
	    serializeTb1TrnAtmAcchrgAmtICr(tb1TrnAtmAcchrgAmtICr);
   }
	public BigDecimal getTb1TrnAtmAcchrgAmtIDb() throws CFException {
        if (isTb1TrnAtmAcchrgAmtIDbModified()) { 
           tb1TrnAtmAcchrgAmtIDb = refreshTb1TrnAtmAcchrgAmtIDb();
        }
   		return tb1TrnAtmAcchrgAmtIDb;
	}

    public char[] getTb1TrnAtmAcchrgAmtIDbString() {
          return  tb1TrnAtmAcchrgAmtIDbString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgAmtIDb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgAmtIDb(BigDecimal number) {	
     tb1TrnAtmAcchrgAmtIDb = checkTb1TrnAtmAcchrgAmtIDbMaxLimit(number);
	    serializeTb1TrnAtmAcchrgAmtIDb(tb1TrnAtmAcchrgAmtIDb);
   }
	public int getTb1TrnPosAcchrgACntICr() throws CFException {
        if (isTb1TrnPosAcchrgACntICrModified()) { 
           tb1TrnPosAcchrgACntICr = refreshTb1TrnPosAcchrgACntICr();
        }
   		return tb1TrnPosAcchrgACntICr;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgACntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-A-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgACntICr(int number) {
			tb1TrnPosAcchrgACntICr = checkTb1TrnPosAcchrgACntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgACntICr(tb1TrnPosAcchrgACntICr);
	}


	public void setTb1TrnPosAcchrgACntICr(long number) {
	    number = checkTb1TrnPosAcchrgACntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgACntICr((int)number);
	}
	
	public int getTb1TrnPosAcchrgACntIDb() throws CFException {
        if (isTb1TrnPosAcchrgACntIDbModified()) { 
           tb1TrnPosAcchrgACntIDb = refreshTb1TrnPosAcchrgACntIDb();
        }
   		return tb1TrnPosAcchrgACntIDb;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgACntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-A-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgACntIDb(int number) {
			tb1TrnPosAcchrgACntIDb = checkTb1TrnPosAcchrgACntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgACntIDb(tb1TrnPosAcchrgACntIDb);
	}


	public void setTb1TrnPosAcchrgACntIDb(long number) {
	    number = checkTb1TrnPosAcchrgACntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgACntIDb((int)number);
	}
	
	public BigDecimal getTb1TrnPosAcchrgAmtICr() throws CFException {
        if (isTb1TrnPosAcchrgAmtICrModified()) { 
           tb1TrnPosAcchrgAmtICr = refreshTb1TrnPosAcchrgAmtICr();
        }
   		return tb1TrnPosAcchrgAmtICr;
	}

    public char[] getTb1TrnPosAcchrgAmtICrString() {
          return  tb1TrnPosAcchrgAmtICrString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgAmtICr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgAmtICr(BigDecimal number) {	
     tb1TrnPosAcchrgAmtICr = checkTb1TrnPosAcchrgAmtICrMaxLimit(number);
	    serializeTb1TrnPosAcchrgAmtICr(tb1TrnPosAcchrgAmtICr);
   }
	public BigDecimal getTb1TrnPosAcchrgAmtIDb() throws CFException {
        if (isTb1TrnPosAcchrgAmtIDbModified()) { 
           tb1TrnPosAcchrgAmtIDb = refreshTb1TrnPosAcchrgAmtIDb();
        }
   		return tb1TrnPosAcchrgAmtIDb;
	}

    public char[] getTb1TrnPosAcchrgAmtIDbString() {
          return  tb1TrnPosAcchrgAmtIDbString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgAmtIDb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgAmtIDb(BigDecimal number) {	
     tb1TrnPosAcchrgAmtIDb = checkTb1TrnPosAcchrgAmtIDbMaxLimit(number);
	    serializeTb1TrnPosAcchrgAmtIDb(tb1TrnPosAcchrgAmtIDb);
   }
	public int getTb1TrnAtmAcchrgRCntICr() throws CFException {
        if (isTb1TrnAtmAcchrgRCntICrModified()) { 
           tb1TrnAtmAcchrgRCntICr = refreshTb1TrnAtmAcchrgRCntICr();
        }
   		return tb1TrnAtmAcchrgRCntICr;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRCntICr(int number) {
			tb1TrnAtmAcchrgRCntICr = checkTb1TrnAtmAcchrgRCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgRCntICr(tb1TrnAtmAcchrgRCntICr);
	}


	public void setTb1TrnAtmAcchrgRCntICr(long number) {
	    number = checkTb1TrnAtmAcchrgRCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgRCntICr((int)number);
	}
	
	public int getTb1TrnAtmAcchrgRCntIDb() throws CFException {
        if (isTb1TrnAtmAcchrgRCntIDbModified()) { 
           tb1TrnAtmAcchrgRCntIDb = refreshTb1TrnAtmAcchrgRCntIDb();
        }
   		return tb1TrnAtmAcchrgRCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRCntIDb(int number) {
			tb1TrnAtmAcchrgRCntIDb = checkTb1TrnAtmAcchrgRCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgRCntIDb(tb1TrnAtmAcchrgRCntIDb);
	}


	public void setTb1TrnAtmAcchrgRCntIDb(long number) {
	    number = checkTb1TrnAtmAcchrgRCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgRCntIDb((int)number);
	}
	
	public BigDecimal getTb1TrnAtmAcchrgRAmtICr() throws CFException {
        if (isTb1TrnAtmAcchrgRAmtICrModified()) { 
           tb1TrnAtmAcchrgRAmtICr = refreshTb1TrnAtmAcchrgRAmtICr();
        }
   		return tb1TrnAtmAcchrgRAmtICr;
	}

    public char[] getTb1TrnAtmAcchrgRAmtICrString() {
          return  tb1TrnAtmAcchrgRAmtICrString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRAmtICr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRAmtICr(BigDecimal number) {	
     tb1TrnAtmAcchrgRAmtICr = checkTb1TrnAtmAcchrgRAmtICrMaxLimit(number);
	    serializeTb1TrnAtmAcchrgRAmtICr(tb1TrnAtmAcchrgRAmtICr);
   }
	public BigDecimal getTb1TrnAtmAcchrgRAmtIDb() throws CFException {
        if (isTb1TrnAtmAcchrgRAmtIDbModified()) { 
           tb1TrnAtmAcchrgRAmtIDb = refreshTb1TrnAtmAcchrgRAmtIDb();
        }
   		return tb1TrnAtmAcchrgRAmtIDb;
	}

    public char[] getTb1TrnAtmAcchrgRAmtIDbString() {
          return  tb1TrnAtmAcchrgRAmtIDbString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRAmtIDb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRAmtIDb(BigDecimal number) {	
     tb1TrnAtmAcchrgRAmtIDb = checkTb1TrnAtmAcchrgRAmtIDbMaxLimit(number);
	    serializeTb1TrnAtmAcchrgRAmtIDb(tb1TrnAtmAcchrgRAmtIDb);
   }
	public int getTb1TrnPosAcchrgRCntICr() throws CFException {
        if (isTb1TrnPosAcchrgRCntICrModified()) { 
           tb1TrnPosAcchrgRCntICr = refreshTb1TrnPosAcchrgRCntICr();
        }
   		return tb1TrnPosAcchrgRCntICr;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgRCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRCntICr(int number) {
			tb1TrnPosAcchrgRCntICr = checkTb1TrnPosAcchrgRCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgRCntICr(tb1TrnPosAcchrgRCntICr);
	}


	public void setTb1TrnPosAcchrgRCntICr(long number) {
	    number = checkTb1TrnPosAcchrgRCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgRCntICr((int)number);
	}
	
	public int getTb1TrnPosAcchrgRCntIDb() throws CFException {
        if (isTb1TrnPosAcchrgRCntIDbModified()) { 
           tb1TrnPosAcchrgRCntIDb = refreshTb1TrnPosAcchrgRCntIDb();
        }
   		return tb1TrnPosAcchrgRCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgRCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRCntIDb(int number) {
			tb1TrnPosAcchrgRCntIDb = checkTb1TrnPosAcchrgRCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgRCntIDb(tb1TrnPosAcchrgRCntIDb);
	}


	public void setTb1TrnPosAcchrgRCntIDb(long number) {
	    number = checkTb1TrnPosAcchrgRCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgRCntIDb((int)number);
	}
	
	public BigDecimal getTb1TrnPosAcchrgRAmtICr() throws CFException {
        if (isTb1TrnPosAcchrgRAmtICrModified()) { 
           tb1TrnPosAcchrgRAmtICr = refreshTb1TrnPosAcchrgRAmtICr();
        }
   		return tb1TrnPosAcchrgRAmtICr;
	}

    public char[] getTb1TrnPosAcchrgRAmtICrString() {
          return  tb1TrnPosAcchrgRAmtICrString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgRAmtICr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRAmtICr(BigDecimal number) {	
     tb1TrnPosAcchrgRAmtICr = checkTb1TrnPosAcchrgRAmtICrMaxLimit(number);
	    serializeTb1TrnPosAcchrgRAmtICr(tb1TrnPosAcchrgRAmtICr);
   }
	public BigDecimal getTb1TrnPosAcchrgRAmtIDb() throws CFException {
        if (isTb1TrnPosAcchrgRAmtIDbModified()) { 
           tb1TrnPosAcchrgRAmtIDb = refreshTb1TrnPosAcchrgRAmtIDb();
        }
   		return tb1TrnPosAcchrgRAmtIDb;
	}

    public char[] getTb1TrnPosAcchrgRAmtIDbString() {
          return  tb1TrnPosAcchrgRAmtIDbString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgRAmtIDb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRAmtIDb(BigDecimal number) {	
     tb1TrnPosAcchrgRAmtIDb = checkTb1TrnPosAcchrgRAmtIDbMaxLimit(number);
	    serializeTb1TrnPosAcchrgRAmtIDb(tb1TrnPosAcchrgRAmtIDb);
   }
	public int getTb1TrnFFinAppCntICr() throws CFException {
        if (isTb1TrnFFinAppCntICrModified()) { 
           tb1TrnFFinAppCntICr = refreshTb1TrnFFinAppCntICr();
        }
   		return tb1TrnFFinAppCntICr;
	}
	
	/**
	 * 	Update Tb1TrnFFinAppCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-APP-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFFinAppCntICr(int number) {
			tb1TrnFFinAppCntICr = checkTb1TrnFFinAppCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAppCntICr(tb1TrnFFinAppCntICr);
	}


	public void setTb1TrnFFinAppCntICr(long number) {
	    number = checkTb1TrnFFinAppCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinAppCntICr((int)number);
	}
	
	public int getTb1TrnFFinAppCntIDb() throws CFException {
        if (isTb1TrnFFinAppCntIDbModified()) { 
           tb1TrnFFinAppCntIDb = refreshTb1TrnFFinAppCntIDb();
        }
   		return tb1TrnFFinAppCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnFFinAppCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-APP-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFFinAppCntIDb(int number) {
			tb1TrnFFinAppCntIDb = checkTb1TrnFFinAppCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAppCntIDb(tb1TrnFFinAppCntIDb);
	}


	public void setTb1TrnFFinAppCntIDb(long number) {
	    number = checkTb1TrnFFinAppCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinAppCntIDb((int)number);
	}
	
	public int getTb1TrnFFinDenCntICr() throws CFException {
        if (isTb1TrnFFinDenCntICrModified()) { 
           tb1TrnFFinDenCntICr = refreshTb1TrnFFinDenCntICr();
        }
   		return tb1TrnFFinDenCntICr;
	}
	
	/**
	 * 	Update Tb1TrnFFinDenCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-DEN-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFFinDenCntICr(int number) {
			tb1TrnFFinDenCntICr = checkTb1TrnFFinDenCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinDenCntICr(tb1TrnFFinDenCntICr);
	}


	public void setTb1TrnFFinDenCntICr(long number) {
	    number = checkTb1TrnFFinDenCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinDenCntICr((int)number);
	}
	
	public int getTb1TrnFFinDenCntIDb() throws CFException {
        if (isTb1TrnFFinDenCntIDbModified()) { 
           tb1TrnFFinDenCntIDb = refreshTb1TrnFFinDenCntIDb();
        }
   		return tb1TrnFFinDenCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnFFinDenCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-DEN-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFFinDenCntIDb(int number) {
			tb1TrnFFinDenCntIDb = checkTb1TrnFFinDenCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinDenCntIDb(tb1TrnFFinDenCntIDb);
	}


	public void setTb1TrnFFinDenCntIDb(long number) {
	    number = checkTb1TrnFFinDenCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinDenCntIDb((int)number);
	}
	
	public long getTb1TrnFFinAmtICr() throws CFException {
        if (isTb1TrnFFinAmtICrModified()) { 
           tb1TrnFFinAmtICr = refreshTb1TrnFFinAmtICr();
        }
   		return tb1TrnFFinAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnFFinAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFFinAmtICr(long number) {
			tb1TrnFFinAmtICr = checkTb1TrnFFinAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAmtICr(tb1TrnFFinAmtICr);
	}


	public long getTb1TrnFFinAmtIDb() throws CFException {
        if (isTb1TrnFFinAmtIDbModified()) { 
           tb1TrnFFinAmtIDb = refreshTb1TrnFFinAmtIDb();
        }
   		return tb1TrnFFinAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnFFinAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFFinAmtIDb(long number) {
			tb1TrnFFinAmtIDb = checkTb1TrnFFinAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAmtIDb(tb1TrnFFinAmtIDb);
	}


	public int getTb1TrnFFinFeeCntI() throws CFException {
        if (isTb1TrnFFinFeeCntIModified()) { 
           tb1TrnFFinFeeCntI = refreshTb1TrnFFinFeeCntI();
        }
   		return tb1TrnFFinFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnFFinFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnFFinFeeCntI(int number) {
			tb1TrnFFinFeeCntI = checkTb1TrnFFinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinFeeCntI(tb1TrnFFinFeeCntI);
	}


	public void setTb1TrnFFinFeeCntI(long number) {
	    number = checkTb1TrnFFinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinFeeCntI((int)number);
	}
	
	public int getTb1TrnFPctFeeCntI() throws CFException {
        if (isTb1TrnFPctFeeCntIModified()) { 
           tb1TrnFPctFeeCntI = refreshTb1TrnFPctFeeCntI();
        }
   		return tb1TrnFPctFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnFPctFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-PCT-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnFPctFeeCntI(int number) {
			tb1TrnFPctFeeCntI = checkTb1TrnFPctFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFPctFeeCntI(tb1TrnFPctFeeCntI);
	}


	public void setTb1TrnFPctFeeCntI(long number) {
	    number = checkTb1TrnFPctFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFPctFeeCntI((int)number);
	}
	
	public int getTb1TrnFNfinFeeCntI() throws CFException {
        if (isTb1TrnFNfinFeeCntIModified()) { 
           tb1TrnFNfinFeeCntI = refreshTb1TrnFNfinFeeCntI();
        }
   		return tb1TrnFNfinFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnFNfinFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-NFIN-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnFNfinFeeCntI(int number) {
			tb1TrnFNfinFeeCntI = checkTb1TrnFNfinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFNfinFeeCntI(tb1TrnFNfinFeeCntI);
	}


	public void setTb1TrnFNfinFeeCntI(long number) {
	    number = checkTb1TrnFNfinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFNfinFeeCntI((int)number);
	}
	
	public int getTb1TrnFNbilFeeCntI() throws CFException {
        if (isTb1TrnFNbilFeeCntIModified()) { 
           tb1TrnFNbilFeeCntI = refreshTb1TrnFNbilFeeCntI();
        }
   		return tb1TrnFNbilFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnFNbilFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-NBIL-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnFNbilFeeCntI(int number) {
			tb1TrnFNbilFeeCntI = checkTb1TrnFNbilFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFNbilFeeCntI(tb1TrnFNbilFeeCntI);
	}


	public void setTb1TrnFNbilFeeCntI(long number) {
	    number = checkTb1TrnFNbilFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFNbilFeeCntI((int)number);
	}
	
	public long getTb1TrnFFeeAmtICr() throws CFException {
        if (isTb1TrnFFeeAmtICrModified()) { 
           tb1TrnFFeeAmtICr = refreshTb1TrnFFeeAmtICr();
        }
   		return tb1TrnFFeeAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnFFeeAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FEE-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFFeeAmtICr(long number) {
			tb1TrnFFeeAmtICr = checkTb1TrnFFeeAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFeeAmtICr(tb1TrnFFeeAmtICr);
	}


	public long getTb1TrnFFeeAmtIDb() throws CFException {
        if (isTb1TrnFFeeAmtIDbModified()) { 
           tb1TrnFFeeAmtIDb = refreshTb1TrnFFeeAmtIDb();
        }
   		return tb1TrnFFeeAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnFFeeAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FEE-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFFeeAmtIDb(long number) {
			tb1TrnFFeeAmtIDb = checkTb1TrnFFeeAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFeeAmtIDb(tb1TrnFFeeAmtIDb);
	}


	public long getTb1TrnFMcrAmtICr() throws CFException {
        if (isTb1TrnFMcrAmtICrModified()) { 
           tb1TrnFMcrAmtICr = refreshTb1TrnFMcrAmtICr();
        }
   		return tb1TrnFMcrAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnFMcrAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-MCR-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFMcrAmtICr(long number) {
			tb1TrnFMcrAmtICr = checkTb1TrnFMcrAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFMcrAmtICr(tb1TrnFMcrAmtICr);
	}


	public long getTb1TrnFMcrAmtIDb() throws CFException {
        if (isTb1TrnFMcrAmtIDbModified()) { 
           tb1TrnFMcrAmtIDb = refreshTb1TrnFMcrAmtIDb();
        }
   		return tb1TrnFMcrAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnFMcrAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-MCR-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFMcrAmtIDb(long number) {
			tb1TrnFMcrAmtIDb = checkTb1TrnFMcrAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFMcrAmtIDb(tb1TrnFMcrAmtIDb);
	}


	public long getTb1TrnFIcrAmtICr() throws CFException {
        if (isTb1TrnFIcrAmtICrModified()) { 
           tb1TrnFIcrAmtICr = refreshTb1TrnFIcrAmtICr();
        }
   		return tb1TrnFIcrAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnFIcrAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-ICR-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnFIcrAmtICr(long number) {
			tb1TrnFIcrAmtICr = checkTb1TrnFIcrAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFIcrAmtICr(tb1TrnFIcrAmtICr);
	}


	public long getTb1TrnFIcrAmtIDb() throws CFException {
        if (isTb1TrnFIcrAmtIDbModified()) { 
           tb1TrnFIcrAmtIDb = refreshTb1TrnFIcrAmtIDb();
        }
   		return tb1TrnFIcrAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnFIcrAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-ICR-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnFIcrAmtIDb(long number) {
			tb1TrnFIcrAmtIDb = checkTb1TrnFIcrAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFIcrAmtIDb(tb1TrnFIcrAmtIDb);
	}


	public int getTb1TrnEFinAppCntICr() throws CFException {
        if (isTb1TrnEFinAppCntICrModified()) { 
           tb1TrnEFinAppCntICr = refreshTb1TrnEFinAppCntICr();
        }
   		return tb1TrnEFinAppCntICr;
	}
	
	/**
	 * 	Update Tb1TrnEFinAppCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-APP-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFinAppCntICr(int number) {
			tb1TrnEFinAppCntICr = checkTb1TrnEFinAppCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAppCntICr(tb1TrnEFinAppCntICr);
	}


	public void setTb1TrnEFinAppCntICr(long number) {
	    number = checkTb1TrnEFinAppCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinAppCntICr((int)number);
	}
	
	public int getTb1TrnEFinAppCntIDb() throws CFException {
        if (isTb1TrnEFinAppCntIDbModified()) { 
           tb1TrnEFinAppCntIDb = refreshTb1TrnEFinAppCntIDb();
        }
   		return tb1TrnEFinAppCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFinAppCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-APP-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFinAppCntIDb(int number) {
			tb1TrnEFinAppCntIDb = checkTb1TrnEFinAppCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAppCntIDb(tb1TrnEFinAppCntIDb);
	}


	public void setTb1TrnEFinAppCntIDb(long number) {
	    number = checkTb1TrnEFinAppCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinAppCntIDb((int)number);
	}
	
	public int getTb1TrnENsdA15CntICr() throws CFException {
        if (isTb1TrnENsdA15CntICrModified()) { 
           tb1TrnENsdA15CntICr = refreshTb1TrnENsdA15CntICr();
        }
   		return tb1TrnENsdA15CntICr;
	}
	
	/**
	 * 	Update Tb1TrnENsdA15CntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NSD-A15-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnENsdA15CntICr(int number) {
			tb1TrnENsdA15CntICr = checkTb1TrnENsdA15CntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENsdA15CntICr(tb1TrnENsdA15CntICr);
	}


	public void setTb1TrnENsdA15CntICr(long number) {
	    number = checkTb1TrnENsdA15CntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENsdA15CntICr((int)number);
	}
	
	public int getTb1TrnENsdA15CntIDb() throws CFException {
        if (isTb1TrnENsdA15CntIDbModified()) { 
           tb1TrnENsdA15CntIDb = refreshTb1TrnENsdA15CntIDb();
        }
   		return tb1TrnENsdA15CntIDb;
	}
	
	/**
	 * 	Update Tb1TrnENsdA15CntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NSD-A15-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnENsdA15CntIDb(int number) {
			tb1TrnENsdA15CntIDb = checkTb1TrnENsdA15CntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENsdA15CntIDb(tb1TrnENsdA15CntIDb);
	}


	public void setTb1TrnENsdA15CntIDb(long number) {
	    number = checkTb1TrnENsdA15CntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENsdA15CntIDb((int)number);
	}
	
	public int getTb1TrnEFinA09CntICr() throws CFException {
        if (isTb1TrnEFinA09CntICrModified()) { 
           tb1TrnEFinA09CntICr = refreshTb1TrnEFinA09CntICr();
        }
   		return tb1TrnEFinA09CntICr;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09CntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFinA09CntICr(int number) {
			tb1TrnEFinA09CntICr = checkTb1TrnEFinA09CntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09CntICr(tb1TrnEFinA09CntICr);
	}


	public void setTb1TrnEFinA09CntICr(long number) {
	    number = checkTb1TrnEFinA09CntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinA09CntICr((int)number);
	}
	
	public int getTb1TrnEFinA09CntIDb() throws CFException {
        if (isTb1TrnEFinA09CntIDbModified()) { 
           tb1TrnEFinA09CntIDb = refreshTb1TrnEFinA09CntIDb();
        }
   		return tb1TrnEFinA09CntIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09CntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFinA09CntIDb(int number) {
			tb1TrnEFinA09CntIDb = checkTb1TrnEFinA09CntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09CntIDb(tb1TrnEFinA09CntIDb);
	}


	public void setTb1TrnEFinA09CntIDb(long number) {
	    number = checkTb1TrnEFinA09CntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinA09CntIDb((int)number);
	}
	
	public int getTb1TrnEFinDenCntICr() throws CFException {
        if (isTb1TrnEFinDenCntICrModified()) { 
           tb1TrnEFinDenCntICr = refreshTb1TrnEFinDenCntICr();
        }
   		return tb1TrnEFinDenCntICr;
	}
	
	/**
	 * 	Update Tb1TrnEFinDenCntICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-DEN-CNT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFinDenCntICr(int number) {
			tb1TrnEFinDenCntICr = checkTb1TrnEFinDenCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinDenCntICr(tb1TrnEFinDenCntICr);
	}


	public void setTb1TrnEFinDenCntICr(long number) {
	    number = checkTb1TrnEFinDenCntICrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinDenCntICr((int)number);
	}
	
	public int getTb1TrnEFinDenCntIDb() throws CFException {
        if (isTb1TrnEFinDenCntIDbModified()) { 
           tb1TrnEFinDenCntIDb = refreshTb1TrnEFinDenCntIDb();
        }
   		return tb1TrnEFinDenCntIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFinDenCntIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-DEN-CNT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFinDenCntIDb(int number) {
			tb1TrnEFinDenCntIDb = checkTb1TrnEFinDenCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinDenCntIDb(tb1TrnEFinDenCntIDb);
	}


	public void setTb1TrnEFinDenCntIDb(long number) {
	    number = checkTb1TrnEFinDenCntIDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinDenCntIDb((int)number);
	}
	
	public long getTb1TrnEFinAmtICr() throws CFException {
        if (isTb1TrnEFinAmtICrModified()) { 
           tb1TrnEFinAmtICr = refreshTb1TrnEFinAmtICr();
        }
   		return tb1TrnEFinAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnEFinAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFinAmtICr(long number) {
			tb1TrnEFinAmtICr = checkTb1TrnEFinAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAmtICr(tb1TrnEFinAmtICr);
	}


	public long getTb1TrnEFinAmtIDb() throws CFException {
        if (isTb1TrnEFinAmtIDbModified()) { 
           tb1TrnEFinAmtIDb = refreshTb1TrnEFinAmtIDb();
        }
   		return tb1TrnEFinAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFinAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFinAmtIDb(long number) {
			tb1TrnEFinAmtIDb = checkTb1TrnEFinAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAmtIDb(tb1TrnEFinAmtIDb);
	}


	public long getTb1TrnEFinA09AmtICr() throws CFException {
        if (isTb1TrnEFinA09AmtICrModified()) { 
           tb1TrnEFinA09AmtICr = refreshTb1TrnEFinA09AmtICr();
        }
   		return tb1TrnEFinA09AmtICr;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09AmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFinA09AmtICr(long number) {
			tb1TrnEFinA09AmtICr = checkTb1TrnEFinA09AmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09AmtICr(tb1TrnEFinA09AmtICr);
	}


	public long getTb1TrnEFinA09AmtIDb() throws CFException {
        if (isTb1TrnEFinA09AmtIDbModified()) { 
           tb1TrnEFinA09AmtIDb = refreshTb1TrnEFinA09AmtIDb();
        }
   		return tb1TrnEFinA09AmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09AmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFinA09AmtIDb(long number) {
			tb1TrnEFinA09AmtIDb = checkTb1TrnEFinA09AmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09AmtIDb(tb1TrnEFinA09AmtIDb);
	}


	public int getTb1TrnEFinFeeCntI() throws CFException {
        if (isTb1TrnEFinFeeCntIModified()) { 
           tb1TrnEFinFeeCntI = refreshTb1TrnEFinFeeCntI();
        }
   		return tb1TrnEFinFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnEFinFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnEFinFeeCntI(int number) {
			tb1TrnEFinFeeCntI = checkTb1TrnEFinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinFeeCntI(tb1TrnEFinFeeCntI);
	}


	public void setTb1TrnEFinFeeCntI(long number) {
	    number = checkTb1TrnEFinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinFeeCntI((int)number);
	}
	
	public int getTb1TrnEPctFeeCntI() throws CFException {
        if (isTb1TrnEPctFeeCntIModified()) { 
           tb1TrnEPctFeeCntI = refreshTb1TrnEPctFeeCntI();
        }
   		return tb1TrnEPctFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnEPctFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-PCT-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnEPctFeeCntI(int number) {
			tb1TrnEPctFeeCntI = checkTb1TrnEPctFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEPctFeeCntI(tb1TrnEPctFeeCntI);
	}


	public void setTb1TrnEPctFeeCntI(long number) {
	    number = checkTb1TrnEPctFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEPctFeeCntI((int)number);
	}
	
	public int getTb1TrnENfinFeeCntI() throws CFException {
        if (isTb1TrnENfinFeeCntIModified()) { 
           tb1TrnENfinFeeCntI = refreshTb1TrnENfinFeeCntI();
        }
   		return tb1TrnENfinFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnENfinFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NFIN-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnENfinFeeCntI(int number) {
			tb1TrnENfinFeeCntI = checkTb1TrnENfinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENfinFeeCntI(tb1TrnENfinFeeCntI);
	}


	public void setTb1TrnENfinFeeCntI(long number) {
	    number = checkTb1TrnENfinFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENfinFeeCntI((int)number);
	}
	
	public int getTb1TrnENbilFeeCntI() throws CFException {
        if (isTb1TrnENbilFeeCntIModified()) { 
           tb1TrnENbilFeeCntI = refreshTb1TrnENbilFeeCntI();
        }
   		return tb1TrnENbilFeeCntI;
	}
	
	/**
	 * 	Update Tb1TrnENbilFeeCntI with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NBIL-FEE-CNT-I
	 *	@param number
	 */
	public void setTb1TrnENbilFeeCntI(int number) {
			tb1TrnENbilFeeCntI = checkTb1TrnENbilFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENbilFeeCntI(tb1TrnENbilFeeCntI);
	}


	public void setTb1TrnENbilFeeCntI(long number) {
	    number = checkTb1TrnENbilFeeCntIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENbilFeeCntI((int)number);
	}
	
	public long getTb1TrnEFeeAmtICr() throws CFException {
        if (isTb1TrnEFeeAmtICrModified()) { 
           tb1TrnEFeeAmtICr = refreshTb1TrnEFeeAmtICr();
        }
   		return tb1TrnEFeeAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnEFeeAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FEE-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEFeeAmtICr(long number) {
			tb1TrnEFeeAmtICr = checkTb1TrnEFeeAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFeeAmtICr(tb1TrnEFeeAmtICr);
	}


	public long getTb1TrnEFeeAmtIDb() throws CFException {
        if (isTb1TrnEFeeAmtIDbModified()) { 
           tb1TrnEFeeAmtIDb = refreshTb1TrnEFeeAmtIDb();
        }
   		return tb1TrnEFeeAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnEFeeAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FEE-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEFeeAmtIDb(long number) {
			tb1TrnEFeeAmtIDb = checkTb1TrnEFeeAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFeeAmtIDb(tb1TrnEFeeAmtIDb);
	}


	public long getTb1TrnEMcrAmtICr() throws CFException {
        if (isTb1TrnEMcrAmtICrModified()) { 
           tb1TrnEMcrAmtICr = refreshTb1TrnEMcrAmtICr();
        }
   		return tb1TrnEMcrAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnEMcrAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-MCR-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEMcrAmtICr(long number) {
			tb1TrnEMcrAmtICr = checkTb1TrnEMcrAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEMcrAmtICr(tb1TrnEMcrAmtICr);
	}


	public long getTb1TrnEMcrAmtIDb() throws CFException {
        if (isTb1TrnEMcrAmtIDbModified()) { 
           tb1TrnEMcrAmtIDb = refreshTb1TrnEMcrAmtIDb();
        }
   		return tb1TrnEMcrAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnEMcrAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-MCR-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEMcrAmtIDb(long number) {
			tb1TrnEMcrAmtIDb = checkTb1TrnEMcrAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEMcrAmtIDb(tb1TrnEMcrAmtIDb);
	}


	public long getTb1TrnEIcrAmtICr() throws CFException {
        if (isTb1TrnEIcrAmtICrModified()) { 
           tb1TrnEIcrAmtICr = refreshTb1TrnEIcrAmtICr();
        }
   		return tb1TrnEIcrAmtICr;
	}
	
	/**
	 * 	Update Tb1TrnEIcrAmtICr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-ICR-AMT-I-CR
	 *	@param number
	 */
	public void setTb1TrnEIcrAmtICr(long number) {
			tb1TrnEIcrAmtICr = checkTb1TrnEIcrAmtICrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEIcrAmtICr(tb1TrnEIcrAmtICr);
	}


	public long getTb1TrnEIcrAmtIDb() throws CFException {
        if (isTb1TrnEIcrAmtIDbModified()) { 
           tb1TrnEIcrAmtIDb = refreshTb1TrnEIcrAmtIDb();
        }
   		return tb1TrnEIcrAmtIDb;
	}
	
	/**
	 * 	Update Tb1TrnEIcrAmtIDb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-ICR-AMT-I-DB
	 *	@param number
	 */
	public void setTb1TrnEIcrAmtIDb(long number) {
			tb1TrnEIcrAmtIDb = checkTb1TrnEIcrAmtIDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEIcrAmtIDb(tb1TrnEIcrAmtIDb);
	}


	public int getTb1TrnAtmAcchrgCntACr() throws CFException {
        if (isTb1TrnAtmAcchrgCntACrModified()) { 
           tb1TrnAtmAcchrgCntACr = refreshTb1TrnAtmAcchrgCntACr();
        }
   		return tb1TrnAtmAcchrgCntACr;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgCntACr(int number) {
			tb1TrnAtmAcchrgCntACr = checkTb1TrnAtmAcchrgCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgCntACr(tb1TrnAtmAcchrgCntACr);
	}


	public void setTb1TrnAtmAcchrgCntACr(long number) {
	    number = checkTb1TrnAtmAcchrgCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgCntACr((int)number);
	}
	
	public int getTb1TrnAtmAcchrgCntADb() throws CFException {
        if (isTb1TrnAtmAcchrgCntADbModified()) { 
           tb1TrnAtmAcchrgCntADb = refreshTb1TrnAtmAcchrgCntADb();
        }
   		return tb1TrnAtmAcchrgCntADb;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgCntADb(int number) {
			tb1TrnAtmAcchrgCntADb = checkTb1TrnAtmAcchrgCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgCntADb(tb1TrnAtmAcchrgCntADb);
	}


	public void setTb1TrnAtmAcchrgCntADb(long number) {
	    number = checkTb1TrnAtmAcchrgCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgCntADb((int)number);
	}
	
	public BigDecimal getTb1TrnAtmAcchrgAmtACr() throws CFException {
        if (isTb1TrnAtmAcchrgAmtACrModified()) { 
           tb1TrnAtmAcchrgAmtACr = refreshTb1TrnAtmAcchrgAmtACr();
        }
   		return tb1TrnAtmAcchrgAmtACr;
	}

    public char[] getTb1TrnAtmAcchrgAmtACrString() {
          return  tb1TrnAtmAcchrgAmtACrString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgAmtACr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgAmtACr(BigDecimal number) {	
     tb1TrnAtmAcchrgAmtACr = checkTb1TrnAtmAcchrgAmtACrMaxLimit(number);
	    serializeTb1TrnAtmAcchrgAmtACr(tb1TrnAtmAcchrgAmtACr);
   }
	public BigDecimal getTb1TrnAtmAcchrgAmtADb() throws CFException {
        if (isTb1TrnAtmAcchrgAmtADbModified()) { 
           tb1TrnAtmAcchrgAmtADb = refreshTb1TrnAtmAcchrgAmtADb();
        }
   		return tb1TrnAtmAcchrgAmtADb;
	}

    public char[] getTb1TrnAtmAcchrgAmtADbString() {
          return  tb1TrnAtmAcchrgAmtADbString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgAmtADb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgAmtADb(BigDecimal number) {	
     tb1TrnAtmAcchrgAmtADb = checkTb1TrnAtmAcchrgAmtADbMaxLimit(number);
	    serializeTb1TrnAtmAcchrgAmtADb(tb1TrnAtmAcchrgAmtADb);
   }
	public int getTb1TrnPosAcchrgCntACr() throws CFException {
        if (isTb1TrnPosAcchrgCntACrModified()) { 
           tb1TrnPosAcchrgCntACr = refreshTb1TrnPosAcchrgCntACr();
        }
   		return tb1TrnPosAcchrgCntACr;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgCntACr(int number) {
			tb1TrnPosAcchrgCntACr = checkTb1TrnPosAcchrgCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgCntACr(tb1TrnPosAcchrgCntACr);
	}


	public void setTb1TrnPosAcchrgCntACr(long number) {
	    number = checkTb1TrnPosAcchrgCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgCntACr((int)number);
	}
	
	public int getTb1TrnPosAcchrgCntADb() throws CFException {
        if (isTb1TrnPosAcchrgCntADbModified()) { 
           tb1TrnPosAcchrgCntADb = refreshTb1TrnPosAcchrgCntADb();
        }
   		return tb1TrnPosAcchrgCntADb;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgCntADb(int number) {
			tb1TrnPosAcchrgCntADb = checkTb1TrnPosAcchrgCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgCntADb(tb1TrnPosAcchrgCntADb);
	}


	public void setTb1TrnPosAcchrgCntADb(long number) {
	    number = checkTb1TrnPosAcchrgCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgCntADb((int)number);
	}
	
	public BigDecimal getTb1TrnPosAcchrgAmtACr() throws CFException {
        if (isTb1TrnPosAcchrgAmtACrModified()) { 
           tb1TrnPosAcchrgAmtACr = refreshTb1TrnPosAcchrgAmtACr();
        }
   		return tb1TrnPosAcchrgAmtACr;
	}

    public char[] getTb1TrnPosAcchrgAmtACrString() {
          return  tb1TrnPosAcchrgAmtACrString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgAmtACr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgAmtACr(BigDecimal number) {	
     tb1TrnPosAcchrgAmtACr = checkTb1TrnPosAcchrgAmtACrMaxLimit(number);
	    serializeTb1TrnPosAcchrgAmtACr(tb1TrnPosAcchrgAmtACr);
   }
	public BigDecimal getTb1TrnPosAcchrgAmtADb() throws CFException {
        if (isTb1TrnPosAcchrgAmtADbModified()) { 
           tb1TrnPosAcchrgAmtADb = refreshTb1TrnPosAcchrgAmtADb();
        }
   		return tb1TrnPosAcchrgAmtADb;
	}

    public char[] getTb1TrnPosAcchrgAmtADbString() {
          return  tb1TrnPosAcchrgAmtADbString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgAmtADb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgAmtADb(BigDecimal number) {	
     tb1TrnPosAcchrgAmtADb = checkTb1TrnPosAcchrgAmtADbMaxLimit(number);
	    serializeTb1TrnPosAcchrgAmtADb(tb1TrnPosAcchrgAmtADb);
   }
	public int getTb1TrnAtmAcchrgRCntACr() throws CFException {
        if (isTb1TrnAtmAcchrgRCntACrModified()) { 
           tb1TrnAtmAcchrgRCntACr = refreshTb1TrnAtmAcchrgRCntACr();
        }
   		return tb1TrnAtmAcchrgRCntACr;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRCntACr(int number) {
			tb1TrnAtmAcchrgRCntACr = checkTb1TrnAtmAcchrgRCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgRCntACr(tb1TrnAtmAcchrgRCntACr);
	}


	public void setTb1TrnAtmAcchrgRCntACr(long number) {
	    number = checkTb1TrnAtmAcchrgRCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgRCntACr((int)number);
	}
	
	public int getTb1TrnAtmAcchrgRCntADb() throws CFException {
        if (isTb1TrnAtmAcchrgRCntADbModified()) { 
           tb1TrnAtmAcchrgRCntADb = refreshTb1TrnAtmAcchrgRCntADb();
        }
   		return tb1TrnAtmAcchrgRCntADb;
	}
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRCntADb(int number) {
			tb1TrnAtmAcchrgRCntADb = checkTb1TrnAtmAcchrgRCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnAtmAcchrgRCntADb(tb1TrnAtmAcchrgRCntADb);
	}


	public void setTb1TrnAtmAcchrgRCntADb(long number) {
	    number = checkTb1TrnAtmAcchrgRCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnAtmAcchrgRCntADb((int)number);
	}
	
	public BigDecimal getTb1TrnAtmAcchrgRAmtACr() throws CFException {
        if (isTb1TrnAtmAcchrgRAmtACrModified()) { 
           tb1TrnAtmAcchrgRAmtACr = refreshTb1TrnAtmAcchrgRAmtACr();
        }
   		return tb1TrnAtmAcchrgRAmtACr;
	}

    public char[] getTb1TrnAtmAcchrgRAmtACrString() {
          return  tb1TrnAtmAcchrgRAmtACrString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRAmtACr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRAmtACr(BigDecimal number) {	
     tb1TrnAtmAcchrgRAmtACr = checkTb1TrnAtmAcchrgRAmtACrMaxLimit(number);
	    serializeTb1TrnAtmAcchrgRAmtACr(tb1TrnAtmAcchrgRAmtACr);
   }
	public BigDecimal getTb1TrnAtmAcchrgRAmtADb() throws CFException {
        if (isTb1TrnAtmAcchrgRAmtADbModified()) { 
           tb1TrnAtmAcchrgRAmtADb = refreshTb1TrnAtmAcchrgRAmtADb();
        }
   		return tb1TrnAtmAcchrgRAmtADb;
	}

    public char[] getTb1TrnAtmAcchrgRAmtADbString() {
          return  tb1TrnAtmAcchrgRAmtADbString();
    }
	
	/**
	 * 	Update Tb1TrnAtmAcchrgRAmtADb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-ATM-ACCHRG-R-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnAtmAcchrgRAmtADb(BigDecimal number) {	
     tb1TrnAtmAcchrgRAmtADb = checkTb1TrnAtmAcchrgRAmtADbMaxLimit(number);
	    serializeTb1TrnAtmAcchrgRAmtADb(tb1TrnAtmAcchrgRAmtADb);
   }
	public int getTb1TrnPosAcchrgRCntACr() throws CFException {
        if (isTb1TrnPosAcchrgRCntACrModified()) { 
           tb1TrnPosAcchrgRCntACr = refreshTb1TrnPosAcchrgRCntACr();
        }
   		return tb1TrnPosAcchrgRCntACr;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgRCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRCntACr(int number) {
			tb1TrnPosAcchrgRCntACr = checkTb1TrnPosAcchrgRCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgRCntACr(tb1TrnPosAcchrgRCntACr);
	}


	public void setTb1TrnPosAcchrgRCntACr(long number) {
	    number = checkTb1TrnPosAcchrgRCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgRCntACr((int)number);
	}
	
	public int getTb1TrnPosAcchrgRCntADb() throws CFException {
        if (isTb1TrnPosAcchrgRCntADbModified()) { 
           tb1TrnPosAcchrgRCntADb = refreshTb1TrnPosAcchrgRCntADb();
        }
   		return tb1TrnPosAcchrgRCntADb;
	}
	
	/**
	 * 	Update Tb1TrnPosAcchrgRCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRCntADb(int number) {
			tb1TrnPosAcchrgRCntADb = checkTb1TrnPosAcchrgRCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnPosAcchrgRCntADb(tb1TrnPosAcchrgRCntADb);
	}


	public void setTb1TrnPosAcchrgRCntADb(long number) {
	    number = checkTb1TrnPosAcchrgRCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnPosAcchrgRCntADb((int)number);
	}
	
	public BigDecimal getTb1TrnPosAcchrgRAmtACr() throws CFException {
        if (isTb1TrnPosAcchrgRAmtACrModified()) { 
           tb1TrnPosAcchrgRAmtACr = refreshTb1TrnPosAcchrgRAmtACr();
        }
   		return tb1TrnPosAcchrgRAmtACr;
	}

    public char[] getTb1TrnPosAcchrgRAmtACrString() {
          return  tb1TrnPosAcchrgRAmtACrString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgRAmtACr with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRAmtACr(BigDecimal number) {	
     tb1TrnPosAcchrgRAmtACr = checkTb1TrnPosAcchrgRAmtACrMaxLimit(number);
	    serializeTb1TrnPosAcchrgRAmtACr(tb1TrnPosAcchrgRAmtACr);
   }
	public BigDecimal getTb1TrnPosAcchrgRAmtADb() throws CFException {
        if (isTb1TrnPosAcchrgRAmtADbModified()) { 
           tb1TrnPosAcchrgRAmtADb = refreshTb1TrnPosAcchrgRAmtADb();
        }
   		return tb1TrnPosAcchrgRAmtADb;
	}

    public char[] getTb1TrnPosAcchrgRAmtADbString() {
          return  tb1TrnPosAcchrgRAmtADbString();
    }
	
	/**
	 * 	Update Tb1TrnPosAcchrgRAmtADb with the passed number
	 *  Corresponding COBOL Variable is TB1-TRN-POS-ACCHRG-R-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnPosAcchrgRAmtADb(BigDecimal number) {	
     tb1TrnPosAcchrgRAmtADb = checkTb1TrnPosAcchrgRAmtADbMaxLimit(number);
	    serializeTb1TrnPosAcchrgRAmtADb(tb1TrnPosAcchrgRAmtADb);
   }
	public int getTb1TrnFFinAppCntACr() throws CFException {
        if (isTb1TrnFFinAppCntACrModified()) { 
           tb1TrnFFinAppCntACr = refreshTb1TrnFFinAppCntACr();
        }
   		return tb1TrnFFinAppCntACr;
	}
	
	/**
	 * 	Update Tb1TrnFFinAppCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-APP-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnFFinAppCntACr(int number) {
			tb1TrnFFinAppCntACr = checkTb1TrnFFinAppCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAppCntACr(tb1TrnFFinAppCntACr);
	}


	public void setTb1TrnFFinAppCntACr(long number) {
	    number = checkTb1TrnFFinAppCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinAppCntACr((int)number);
	}
	
	public int getTb1TrnFFinAppCntADb() throws CFException {
        if (isTb1TrnFFinAppCntADbModified()) { 
           tb1TrnFFinAppCntADb = refreshTb1TrnFFinAppCntADb();
        }
   		return tb1TrnFFinAppCntADb;
	}
	
	/**
	 * 	Update Tb1TrnFFinAppCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-APP-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnFFinAppCntADb(int number) {
			tb1TrnFFinAppCntADb = checkTb1TrnFFinAppCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAppCntADb(tb1TrnFFinAppCntADb);
	}


	public void setTb1TrnFFinAppCntADb(long number) {
	    number = checkTb1TrnFFinAppCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinAppCntADb((int)number);
	}
	
	public int getTb1TrnFFinDenCntACr() throws CFException {
        if (isTb1TrnFFinDenCntACrModified()) { 
           tb1TrnFFinDenCntACr = refreshTb1TrnFFinDenCntACr();
        }
   		return tb1TrnFFinDenCntACr;
	}
	
	/**
	 * 	Update Tb1TrnFFinDenCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-DEN-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnFFinDenCntACr(int number) {
			tb1TrnFFinDenCntACr = checkTb1TrnFFinDenCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinDenCntACr(tb1TrnFFinDenCntACr);
	}


	public void setTb1TrnFFinDenCntACr(long number) {
	    number = checkTb1TrnFFinDenCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinDenCntACr((int)number);
	}
	
	public int getTb1TrnFFinDenCntADb() throws CFException {
        if (isTb1TrnFFinDenCntADbModified()) { 
           tb1TrnFFinDenCntADb = refreshTb1TrnFFinDenCntADb();
        }
   		return tb1TrnFFinDenCntADb;
	}
	
	/**
	 * 	Update Tb1TrnFFinDenCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-DEN-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnFFinDenCntADb(int number) {
			tb1TrnFFinDenCntADb = checkTb1TrnFFinDenCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinDenCntADb(tb1TrnFFinDenCntADb);
	}


	public void setTb1TrnFFinDenCntADb(long number) {
	    number = checkTb1TrnFFinDenCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinDenCntADb((int)number);
	}
	
	public long getTb1TrnFFinAmtACr() throws CFException {
        if (isTb1TrnFFinAmtACrModified()) { 
           tb1TrnFFinAmtACr = refreshTb1TrnFFinAmtACr();
        }
   		return tb1TrnFFinAmtACr;
	}
	
	/**
	 * 	Update Tb1TrnFFinAmtACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnFFinAmtACr(long number) {
			tb1TrnFFinAmtACr = checkTb1TrnFFinAmtACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAmtACr(tb1TrnFFinAmtACr);
	}


	public long getTb1TrnFFinAmtADb() throws CFException {
        if (isTb1TrnFFinAmtADbModified()) { 
           tb1TrnFFinAmtADb = refreshTb1TrnFFinAmtADb();
        }
   		return tb1TrnFFinAmtADb;
	}
	
	/**
	 * 	Update Tb1TrnFFinAmtADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnFFinAmtADb(long number) {
			tb1TrnFFinAmtADb = checkTb1TrnFFinAmtADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinAmtADb(tb1TrnFFinAmtADb);
	}


	public int getTb1TrnFFinFeeCntA() throws CFException {
        if (isTb1TrnFFinFeeCntAModified()) { 
           tb1TrnFFinFeeCntA = refreshTb1TrnFFinFeeCntA();
        }
   		return tb1TrnFFinFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnFFinFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FIN-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnFFinFeeCntA(int number) {
			tb1TrnFFinFeeCntA = checkTb1TrnFFinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFinFeeCntA(tb1TrnFFinFeeCntA);
	}


	public void setTb1TrnFFinFeeCntA(long number) {
	    number = checkTb1TrnFFinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFFinFeeCntA((int)number);
	}
	
	public int getTb1TrnFPctFeeCntA() throws CFException {
        if (isTb1TrnFPctFeeCntAModified()) { 
           tb1TrnFPctFeeCntA = refreshTb1TrnFPctFeeCntA();
        }
   		return tb1TrnFPctFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnFPctFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-PCT-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnFPctFeeCntA(int number) {
			tb1TrnFPctFeeCntA = checkTb1TrnFPctFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFPctFeeCntA(tb1TrnFPctFeeCntA);
	}


	public void setTb1TrnFPctFeeCntA(long number) {
	    number = checkTb1TrnFPctFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFPctFeeCntA((int)number);
	}
	
	public int getTb1TrnFNfinFeeCntA() throws CFException {
        if (isTb1TrnFNfinFeeCntAModified()) { 
           tb1TrnFNfinFeeCntA = refreshTb1TrnFNfinFeeCntA();
        }
   		return tb1TrnFNfinFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnFNfinFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-NFIN-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnFNfinFeeCntA(int number) {
			tb1TrnFNfinFeeCntA = checkTb1TrnFNfinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFNfinFeeCntA(tb1TrnFNfinFeeCntA);
	}


	public void setTb1TrnFNfinFeeCntA(long number) {
	    number = checkTb1TrnFNfinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFNfinFeeCntA((int)number);
	}
	
	public int getTb1TrnFNbilFeeCntA() throws CFException {
        if (isTb1TrnFNbilFeeCntAModified()) { 
           tb1TrnFNbilFeeCntA = refreshTb1TrnFNbilFeeCntA();
        }
   		return tb1TrnFNbilFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnFNbilFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-NBIL-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnFNbilFeeCntA(int number) {
			tb1TrnFNbilFeeCntA = checkTb1TrnFNbilFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFNbilFeeCntA(tb1TrnFNbilFeeCntA);
	}


	public void setTb1TrnFNbilFeeCntA(long number) {
	    number = checkTb1TrnFNbilFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnFNbilFeeCntA((int)number);
	}
	
	public long getTb1TrnFFeeAmtACr() throws CFException {
        if (isTb1TrnFFeeAmtACrModified()) { 
           tb1TrnFFeeAmtACr = refreshTb1TrnFFeeAmtACr();
        }
   		return tb1TrnFFeeAmtACr;
	}
	
	/**
	 * 	Update Tb1TrnFFeeAmtACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FEE-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnFFeeAmtACr(long number) {
			tb1TrnFFeeAmtACr = checkTb1TrnFFeeAmtACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFeeAmtACr(tb1TrnFFeeAmtACr);
	}


	public long getTb1TrnFFeeAmtADb() throws CFException {
        if (isTb1TrnFFeeAmtADbModified()) { 
           tb1TrnFFeeAmtADb = refreshTb1TrnFFeeAmtADb();
        }
   		return tb1TrnFFeeAmtADb;
	}
	
	/**
	 * 	Update Tb1TrnFFeeAmtADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-F-FEE-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnFFeeAmtADb(long number) {
			tb1TrnFFeeAmtADb = checkTb1TrnFFeeAmtADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnFFeeAmtADb(tb1TrnFFeeAmtADb);
	}


	public int getTb1TrnEFinAppCntACr() throws CFException {
        if (isTb1TrnEFinAppCntACrModified()) { 
           tb1TrnEFinAppCntACr = refreshTb1TrnEFinAppCntACr();
        }
   		return tb1TrnEFinAppCntACr;
	}
	
	/**
	 * 	Update Tb1TrnEFinAppCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-APP-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFinAppCntACr(int number) {
			tb1TrnEFinAppCntACr = checkTb1TrnEFinAppCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAppCntACr(tb1TrnEFinAppCntACr);
	}


	public void setTb1TrnEFinAppCntACr(long number) {
	    number = checkTb1TrnEFinAppCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinAppCntACr((int)number);
	}
	
	public int getTb1TrnEFinAppCntADb() throws CFException {
        if (isTb1TrnEFinAppCntADbModified()) { 
           tb1TrnEFinAppCntADb = refreshTb1TrnEFinAppCntADb();
        }
   		return tb1TrnEFinAppCntADb;
	}
	
	/**
	 * 	Update Tb1TrnEFinAppCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-APP-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFinAppCntADb(int number) {
			tb1TrnEFinAppCntADb = checkTb1TrnEFinAppCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAppCntADb(tb1TrnEFinAppCntADb);
	}


	public void setTb1TrnEFinAppCntADb(long number) {
	    number = checkTb1TrnEFinAppCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinAppCntADb((int)number);
	}
	
	public int getTb1TrnEFinA09CntACr() throws CFException {
        if (isTb1TrnEFinA09CntACrModified()) { 
           tb1TrnEFinA09CntACr = refreshTb1TrnEFinA09CntACr();
        }
   		return tb1TrnEFinA09CntACr;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09CntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFinA09CntACr(int number) {
			tb1TrnEFinA09CntACr = checkTb1TrnEFinA09CntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09CntACr(tb1TrnEFinA09CntACr);
	}


	public void setTb1TrnEFinA09CntACr(long number) {
	    number = checkTb1TrnEFinA09CntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinA09CntACr((int)number);
	}
	
	public int getTb1TrnEFinA09CntADb() throws CFException {
        if (isTb1TrnEFinA09CntADbModified()) { 
           tb1TrnEFinA09CntADb = refreshTb1TrnEFinA09CntADb();
        }
   		return tb1TrnEFinA09CntADb;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09CntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFinA09CntADb(int number) {
			tb1TrnEFinA09CntADb = checkTb1TrnEFinA09CntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09CntADb(tb1TrnEFinA09CntADb);
	}


	public void setTb1TrnEFinA09CntADb(long number) {
	    number = checkTb1TrnEFinA09CntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinA09CntADb((int)number);
	}
	
	public int getTb1TrnENsdA15CntACr() throws CFException {
        if (isTb1TrnENsdA15CntACrModified()) { 
           tb1TrnENsdA15CntACr = refreshTb1TrnENsdA15CntACr();
        }
   		return tb1TrnENsdA15CntACr;
	}
	
	/**
	 * 	Update Tb1TrnENsdA15CntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NSD-A15-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnENsdA15CntACr(int number) {
			tb1TrnENsdA15CntACr = checkTb1TrnENsdA15CntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENsdA15CntACr(tb1TrnENsdA15CntACr);
	}


	public void setTb1TrnENsdA15CntACr(long number) {
	    number = checkTb1TrnENsdA15CntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENsdA15CntACr((int)number);
	}
	
	public int getTb1TrnENsdA15CntADb() throws CFException {
        if (isTb1TrnENsdA15CntADbModified()) { 
           tb1TrnENsdA15CntADb = refreshTb1TrnENsdA15CntADb();
        }
   		return tb1TrnENsdA15CntADb;
	}
	
	/**
	 * 	Update Tb1TrnENsdA15CntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NSD-A15-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnENsdA15CntADb(int number) {
			tb1TrnENsdA15CntADb = checkTb1TrnENsdA15CntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENsdA15CntADb(tb1TrnENsdA15CntADb);
	}


	public void setTb1TrnENsdA15CntADb(long number) {
	    number = checkTb1TrnENsdA15CntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENsdA15CntADb((int)number);
	}
	
	public int getTb1TrnEFinDenCntACr() throws CFException {
        if (isTb1TrnEFinDenCntACrModified()) { 
           tb1TrnEFinDenCntACr = refreshTb1TrnEFinDenCntACr();
        }
   		return tb1TrnEFinDenCntACr;
	}
	
	/**
	 * 	Update Tb1TrnEFinDenCntACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-DEN-CNT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFinDenCntACr(int number) {
			tb1TrnEFinDenCntACr = checkTb1TrnEFinDenCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinDenCntACr(tb1TrnEFinDenCntACr);
	}


	public void setTb1TrnEFinDenCntACr(long number) {
	    number = checkTb1TrnEFinDenCntACrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinDenCntACr((int)number);
	}
	
	public int getTb1TrnEFinDenCntADb() throws CFException {
        if (isTb1TrnEFinDenCntADbModified()) { 
           tb1TrnEFinDenCntADb = refreshTb1TrnEFinDenCntADb();
        }
   		return tb1TrnEFinDenCntADb;
	}
	
	/**
	 * 	Update Tb1TrnEFinDenCntADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-DEN-CNT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFinDenCntADb(int number) {
			tb1TrnEFinDenCntADb = checkTb1TrnEFinDenCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinDenCntADb(tb1TrnEFinDenCntADb);
	}


	public void setTb1TrnEFinDenCntADb(long number) {
	    number = checkTb1TrnEFinDenCntADbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinDenCntADb((int)number);
	}
	
	public long getTb1TrnEFinAmtACr() throws CFException {
        if (isTb1TrnEFinAmtACrModified()) { 
           tb1TrnEFinAmtACr = refreshTb1TrnEFinAmtACr();
        }
   		return tb1TrnEFinAmtACr;
	}
	
	/**
	 * 	Update Tb1TrnEFinAmtACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFinAmtACr(long number) {
			tb1TrnEFinAmtACr = checkTb1TrnEFinAmtACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAmtACr(tb1TrnEFinAmtACr);
	}


	public long getTb1TrnEFinAmtADb() throws CFException {
        if (isTb1TrnEFinAmtADbModified()) { 
           tb1TrnEFinAmtADb = refreshTb1TrnEFinAmtADb();
        }
   		return tb1TrnEFinAmtADb;
	}
	
	/**
	 * 	Update Tb1TrnEFinAmtADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFinAmtADb(long number) {
			tb1TrnEFinAmtADb = checkTb1TrnEFinAmtADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinAmtADb(tb1TrnEFinAmtADb);
	}


	public long getTb1TrnEFinA09AmtACr() throws CFException {
        if (isTb1TrnEFinA09AmtACrModified()) { 
           tb1TrnEFinA09AmtACr = refreshTb1TrnEFinA09AmtACr();
        }
   		return tb1TrnEFinA09AmtACr;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09AmtACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFinA09AmtACr(long number) {
			tb1TrnEFinA09AmtACr = checkTb1TrnEFinA09AmtACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09AmtACr(tb1TrnEFinA09AmtACr);
	}


	public long getTb1TrnEFinA09AmtADb() throws CFException {
        if (isTb1TrnEFinA09AmtADbModified()) { 
           tb1TrnEFinA09AmtADb = refreshTb1TrnEFinA09AmtADb();
        }
   		return tb1TrnEFinA09AmtADb;
	}
	
	/**
	 * 	Update Tb1TrnEFinA09AmtADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-A09-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFinA09AmtADb(long number) {
			tb1TrnEFinA09AmtADb = checkTb1TrnEFinA09AmtADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinA09AmtADb(tb1TrnEFinA09AmtADb);
	}


	public int getTb1TrnEFinFeeCntA() throws CFException {
        if (isTb1TrnEFinFeeCntAModified()) { 
           tb1TrnEFinFeeCntA = refreshTb1TrnEFinFeeCntA();
        }
   		return tb1TrnEFinFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnEFinFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FIN-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnEFinFeeCntA(int number) {
			tb1TrnEFinFeeCntA = checkTb1TrnEFinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFinFeeCntA(tb1TrnEFinFeeCntA);
	}


	public void setTb1TrnEFinFeeCntA(long number) {
	    number = checkTb1TrnEFinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEFinFeeCntA((int)number);
	}
	
	public int getTb1TrnEPctFeeCntA() throws CFException {
        if (isTb1TrnEPctFeeCntAModified()) { 
           tb1TrnEPctFeeCntA = refreshTb1TrnEPctFeeCntA();
        }
   		return tb1TrnEPctFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnEPctFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-PCT-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnEPctFeeCntA(int number) {
			tb1TrnEPctFeeCntA = checkTb1TrnEPctFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEPctFeeCntA(tb1TrnEPctFeeCntA);
	}


	public void setTb1TrnEPctFeeCntA(long number) {
	    number = checkTb1TrnEPctFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnEPctFeeCntA((int)number);
	}
	
	public int getTb1TrnENfinFeeCntA() throws CFException {
        if (isTb1TrnENfinFeeCntAModified()) { 
           tb1TrnENfinFeeCntA = refreshTb1TrnENfinFeeCntA();
        }
   		return tb1TrnENfinFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnENfinFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NFIN-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnENfinFeeCntA(int number) {
			tb1TrnENfinFeeCntA = checkTb1TrnENfinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENfinFeeCntA(tb1TrnENfinFeeCntA);
	}


	public void setTb1TrnENfinFeeCntA(long number) {
	    number = checkTb1TrnENfinFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENfinFeeCntA((int)number);
	}
	
	public int getTb1TrnENbilFeeCntA() throws CFException {
        if (isTb1TrnENbilFeeCntAModified()) { 
           tb1TrnENbilFeeCntA = refreshTb1TrnENbilFeeCntA();
        }
   		return tb1TrnENbilFeeCntA;
	}
	
	/**
	 * 	Update Tb1TrnENbilFeeCntA with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-NBIL-FEE-CNT-A
	 *	@param number
	 */
	public void setTb1TrnENbilFeeCntA(int number) {
			tb1TrnENbilFeeCntA = checkTb1TrnENbilFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnENbilFeeCntA(tb1TrnENbilFeeCntA);
	}


	public void setTb1TrnENbilFeeCntA(long number) {
	    number = checkTb1TrnENbilFeeCntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb1TrnENbilFeeCntA((int)number);
	}
	
	public long getTb1TrnEFeeAmtACr() throws CFException {
        if (isTb1TrnEFeeAmtACrModified()) { 
           tb1TrnEFeeAmtACr = refreshTb1TrnEFeeAmtACr();
        }
   		return tb1TrnEFeeAmtACr;
	}
	
	/**
	 * 	Update Tb1TrnEFeeAmtACr with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FEE-AMT-A-CR
	 *	@param number
	 */
	public void setTb1TrnEFeeAmtACr(long number) {
			tb1TrnEFeeAmtACr = checkTb1TrnEFeeAmtACrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFeeAmtACr(tb1TrnEFeeAmtACr);
	}


	public long getTb1TrnEFeeAmtADb() throws CFException {
        if (isTb1TrnEFeeAmtADbModified()) { 
           tb1TrnEFeeAmtADb = refreshTb1TrnEFeeAmtADb();
        }
   		return tb1TrnEFeeAmtADb;
	}
	
	/**
	 * 	Update Tb1TrnEFeeAmtADb with the passed value
	 *  Corresponding COBOL Variable is TB1-TRN-E-FEE-AMT-A-DB
	 *	@param number
	 */
	public void setTb1TrnEFeeAmtADb(long number) {
			tb1TrnEFeeAmtADb = checkTb1TrnEFeeAmtADbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTb1TrnEFeeAmtADb(tb1TrnEFeeAmtADb);
	}



	
	
	

		public static int getTransTable1FieldLength() {
			return TRANS_TABLE_1_LENGTH;
		}

}
  
