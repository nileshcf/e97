package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CanadaBondSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01CanadaBondSegData extends Bdms01CanadaBondSegDataSerialized { 
   

								private int bdms01CanBondSegSqlcd;

						private char[] bdms01ClsBooksBondDt = Field.fillLowValue(10);

						private char[] bdms01OfferingBondDt = Field.fillLowValue(10);

								private BigDecimal bdms01ParFctrPct = BigDecimal.ZERO;

								private short bdms01PayMadeNbr;
	
	/**
	* Constructor for Bdms01CanadaBondSegData
	**/
    public Bdms01CanadaBondSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01CanadaBondSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CanadaBondSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01CanBondSegSqlcd
	 *	@return bdms01CanBondSegSqlcd
	 */
	public int getBdms01CanBondSegSqlcd() throws CFException {
       if (isBdms01CanBondSegSqlcdModified()) { 
           bdms01CanBondSegSqlcd = refreshBdms01CanBondSegSqlcd();
        }
   		return bdms01CanBondSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01CanBondSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CAN-BOND-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01CanBondSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01CanBondSegSqlcd = checkBdms01CanBondSegSqlcdMaxLimit(number); 
		serializeBdms01CanBondSegSqlcd(bdms01CanBondSegSqlcd);
	}
	

	public void setBdms01CanBondSegSqlcd(long number) {
	    number = checkBdms01CanBondSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01CanBondSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01CanBondSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CanBondSegSqlcd(char[] value) throws CFException {
		 bdms01CanBondSegSqlcd = serializeBdms01CanBondSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01CanBondSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01CanBondSegSqlcdString(char[] value) throws CFException {
		 setBdms01CanBondSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01ClsBooksBondDt
	 *	@return bdms01ClsBooksBondDt
	 */
   public char[] getBdms01ClsBooksBondDt() throws CFException{
     if (isBdms01ClsBooksBondDtModified()) { 
        bdms01ClsBooksBondDt = refreshBdms01ClsBooksBondDt();
     }
   		return bdms01ClsBooksBondDt;
   }

  
	/**
	*  set variable bdms01ClsBooksBondDt
	*  Corresponding COBOL Variable is BDMS01-CLS-BOOKS-BOND-DT
	*  @param value
	**/
   public void setBdms01ClsBooksBondDt(char[] value) {
      bdms01ClsBooksBondDt = checkBdms01ClsBooksBondDtConstraints(value);
      serializeBdms01ClsBooksBondDt(bdms01ClsBooksBondDt);
   } 

     /**
	 * 	Update Bdms01ClsBooksBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ClsBooksBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ClsBooksBondDt,bdms01ClsBooksBondDt.length);
   	
   }
   
   public void setBdms01ClsBooksBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClsBooksBondDt,bdms01ClsBooksBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01ClsBooksBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClsBooksBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClsBooksBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ClsBooksBondDt with another Field
	 *	@param value
	 */
   public void setBdms01ClsBooksBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01ClsBooksBondDt,BDMS_01_CLS_BOOKS_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ClsBooksBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ClsBooksBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ClsBooksBondDt,BDMS_01_CLS_BOOKS_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ClsBooksBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClsBooksBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClsBooksBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OfferingBondDt
	 *	@return bdms01OfferingBondDt
	 */
   public char[] getBdms01OfferingBondDt() throws CFException{
     if (isBdms01OfferingBondDtModified()) { 
        bdms01OfferingBondDt = refreshBdms01OfferingBondDt();
     }
   		return bdms01OfferingBondDt;
   }

  
	/**
	*  set variable bdms01OfferingBondDt
	*  Corresponding COBOL Variable is BDMS01-OFFERING-BOND-DT
	*  @param value
	**/
   public void setBdms01OfferingBondDt(char[] value) {
      bdms01OfferingBondDt = checkBdms01OfferingBondDtConstraints(value);
      serializeBdms01OfferingBondDt(bdms01OfferingBondDt);
   } 

     /**
	 * 	Update Bdms01OfferingBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OfferingBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OfferingBondDt,bdms01OfferingBondDt.length);
   	
   }
   
   public void setBdms01OfferingBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OfferingBondDt,bdms01OfferingBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01OfferingBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OfferingBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OfferingBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OfferingBondDt with another Field
	 *	@param value
	 */
   public void setBdms01OfferingBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01OfferingBondDt,BDMS_01_OFFERING_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OfferingBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OfferingBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OfferingBondDt,BDMS_01_OFFERING_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OfferingBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OfferingBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OfferingBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ParFctrPct
	 *	@return bdms01ParFctrPct
	 */
	public BigDecimal getBdms01ParFctrPct() throws CFException {
       if (isBdms01ParFctrPctModified()) { 
           bdms01ParFctrPct = refreshBdms01ParFctrPct();
        }
   		return bdms01ParFctrPct;
	}
	

	
	   
	/**
	 * 	Update Bdms01ParFctrPct with the passed number
	 *  Corresponding COBOL Variable is BDMS01-PAR-FCTR-PCT
	 *	@param number
	 */
	public void setBdms01ParFctrPct(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01ParFctrPct = checkBdms01ParFctrPctMaxLimit(number);
	    serializeBdms01ParFctrPct(bdms01ParFctrPct);
   }
	/**
	 * 	Update Bdms01ParFctrPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ParFctrPct(char[] value) throws CFException {
		 bdms01ParFctrPct = serializeBdms01ParFctrPct(value);
	}   
	/**
	 *	Returns the value of bdms01PayMadeNbr
	 *	@return bdms01PayMadeNbr
	 */
	public short getBdms01PayMadeNbr() throws CFException {
       if (isBdms01PayMadeNbrModified()) { 
           bdms01PayMadeNbr = refreshBdms01PayMadeNbr();
        }
   		return bdms01PayMadeNbr;
	}
	

    /**
	 *	Returns the String value of bdms01PayMadeNbr
	 *	@return bdms01PayMadeNbr
	 */
	public char[]  getBdms01PayMadeNbrActualString() {
	    String value = String.valueOf(bdms01PayMadeNbr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Bdms01PayMadeNbr with the passed value
	 *  Corresponding COBOL Variable is BDMS01-PAY-MADE-NBR
	 *	@param number
	 */
	public void setBdms01PayMadeNbr(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01PayMadeNbr = checkBdms01PayMadeNbrMaxLimit(number); 
		serializeBdms01PayMadeNbr(bdms01PayMadeNbr);
	}
	
	public void setBdms01PayMadeNbr(int number) {
	    number = checkBdms01PayMadeNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBdms01PayMadeNbr((short)number);
	}
	public void setBdms01PayMadeNbr(long number) {
	    number = checkBdms01PayMadeNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBdms01PayMadeNbr((short)number);
	}
	

	/**
	 * 	Update Bdms01PayMadeNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01PayMadeNbr(char[] value) throws CFException {
		 bdms01PayMadeNbr = serializeBdms01PayMadeNbr(value);
	}
	/**
	 * 	Update Bdms01PayMadeNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01PayMadeNbrString(char[] value) throws CFException {
		 setBdms01PayMadeNbr(value);
	}

	
	
	
	/**
	 * 	initializes Bdms01CanadaBondSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01CanBondSegSqlcd(0);
         setBdms01ClsBooksBondDt(CONSTANTS.SPACE_10);
         setBdms01OfferingBondDt(CONSTANTS.SPACE_10);
			setBdms01ParFctrPct(BigDecimal.ZERO);
         	setBdms01PayMadeNbr((short)0);
   }

		public static int getBdms01CanadaBondSegDataFieldLength() {
			return BDMS_01_CANADA_BOND_SEG_DATA_LENGTH;
		}

}
  
