package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01XrefSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01XrefSegData extends Bdms01XrefSegDataSerialized { 
   

								private int bdms01XrefSegSqlcd;

						private char[] msdCusipNo = Field.fillLowValue(12);

						private char[] msdIsinNumber = Field.fillLowValue(12);

						private char[] msdSecuritySymbol = Field.fillLowValue(12);

						private char[] msdSedolNo = Field.fillLowValue(7);

						private char[] msdEuroNo = Field.fillLowValue(6);

						private char[] msdCinNumber = Field.fillLowValue(9);

						private char[] msdCommonCode = Field.fillLowValue(9);

						private char[] msdSedEuroInd = Field.fillLowValue(1);

						private char[] msdExchangeCode = Field.fillLowValue(1);

						private char[] msdOtcExchangeCode = Field.fillLowValue(1);
				private MsdOtherExchange msdOtherExchange = new MsdOtherExchange();
      private List<char[]> bdms01SecSymbol; 


						private char[] bdms01OptionCall = Field.fillLowValue(12);

						private char[] bdms01OptionPut = Field.fillLowValue(12);

						private char[] bdms01CbCusipNo = Field.fillLowValue(12);

						private char[] bdms01PrimaryExchangeCd = Field.fillLowValue(10);
			private List<Bdms01OtherExchanges> bdms01OtherExchanges = new ArrayList<>();
    	

						private char[] bdms01PostCd = Field.fillLowValue(1);

						private char[] msdAlternateSymbol = Field.fillLowValue(12);

						private char[] bdms01DualAdpNo = Field.fillLowValue(7);

	
	/**
	* Constructor for Bdms01XrefSegData
	**/
    public Bdms01XrefSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01XrefSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01XrefSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdOtherExchange.setParent(this,getStartOffset() + 74);
				for (int arrayIndex = 0; arrayIndex < BDMS_01_OTHER_EXCHANGES_SIZE;arrayIndex++) {
						bdms01OtherExchanges.add(new Bdms01OtherExchanges(this, beginBdms01OtherExchanges + 
						arrayIndex * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength()));
				}
    } 

	/**
	 *	Returns the value of bdms01XrefSegSqlcd
	 *	@return bdms01XrefSegSqlcd
	 */
	public int getBdms01XrefSegSqlcd() throws CFException {
       if (isBdms01XrefSegSqlcdModified()) { 
           bdms01XrefSegSqlcd = refreshBdms01XrefSegSqlcd();
        }
   		return bdms01XrefSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01XrefSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-XREF-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01XrefSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01XrefSegSqlcd = checkBdms01XrefSegSqlcdMaxLimit(number); 
		serializeBdms01XrefSegSqlcd(bdms01XrefSegSqlcd);
	}
	

	public void setBdms01XrefSegSqlcd(long number) {
	    number = checkBdms01XrefSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01XrefSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01XrefSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01XrefSegSqlcd(char[] value) throws CFException {
		 bdms01XrefSegSqlcd = serializeBdms01XrefSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01XrefSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01XrefSegSqlcdString(char[] value) throws CFException {
		 setBdms01XrefSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdCusipNo
	 *	@return msdCusipNo
	 */
   public char[] getMsdCusipNo() throws CFException{
     if (isMsdCusipNoModified()) { 
        msdCusipNo = refreshMsdCusipNo();
     }
   		return msdCusipNo;
   }

  
	/**
	*  set variable msdCusipNo
	*  Corresponding COBOL Variable is MSD-CUSIP-NO
	*  @param value
	**/
   public void setMsdCusipNo(char[] value) {
      msdCusipNo = checkMsdCusipNoConstraints(value);
      serializeMsdCusipNo(msdCusipNo);
   } 

     /**
	 * 	Update MsdCusipNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCusipNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCusipNo,msdCusipNo.length);
   	
   }
   
   public void setMsdCusipNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCusipNo,msdCusipNo.length);
   	
   }
   
     /**
	 * 	Update MsdCusipNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCusipNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCusipNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCusipNo with another Field
	 *	@param value
	 */
   public void setMsdCusipNo(Field source) {
       replace(source,0,source.length(),beginMsdCusipNo,MSD_CUSIP_NO_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCusipNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCusipNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCusipNo,MSD_CUSIP_NO_LEN);
   	
   }
   
     /**
	 * 	Update MsdCusipNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCusipNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCusipNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdIsinNumber
	 *	@return msdIsinNumber
	 */
   public char[] getMsdIsinNumber() throws CFException{
     if (isMsdIsinNumberModified()) { 
        msdIsinNumber = refreshMsdIsinNumber();
     }
   		return msdIsinNumber;
   }

  
	/**
	*  set variable msdIsinNumber
	*  Corresponding COBOL Variable is MSD-ISIN-NUMBER
	*  @param value
	**/
   public void setMsdIsinNumber(char[] value) {
      msdIsinNumber = checkMsdIsinNumberConstraints(value);
      serializeMsdIsinNumber(msdIsinNumber);
   } 

     /**
	 * 	Update MsdIsinNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdIsinNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdIsinNumber,msdIsinNumber.length);
   	
   }
   
   public void setMsdIsinNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIsinNumber,msdIsinNumber.length);
   	
   }
   
     /**
	 * 	Update MsdIsinNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdIsinNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIsinNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdIsinNumber with another Field
	 *	@param value
	 */
   public void setMsdIsinNumber(Field source) {
       replace(source,0,source.length(),beginMsdIsinNumber,MSD_ISIN_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update MsdIsinNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdIsinNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdIsinNumber,MSD_ISIN_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update MsdIsinNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdIsinNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIsinNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecuritySymbol
	 *	@return msdSecuritySymbol
	 */
   public char[] getMsdSecuritySymbol() throws CFException{
     if (isMsdSecuritySymbolModified()) { 
        msdSecuritySymbol = refreshMsdSecuritySymbol();
     }
   		return msdSecuritySymbol;
   }

  
	/**
	*  set variable msdSecuritySymbol
	*  Corresponding COBOL Variable is MSD-SECURITY-SYMBOL
	*  @param value
	**/
   public void setMsdSecuritySymbol(char[] value) {
      msdSecuritySymbol = checkMsdSecuritySymbolConstraints(value);
      serializeMsdSecuritySymbol(msdSecuritySymbol);
   } 

     /**
	 * 	Update MsdSecuritySymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecuritySymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecuritySymbol,msdSecuritySymbol.length);
   	
   }
   
   public void setMsdSecuritySymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecuritySymbol,msdSecuritySymbol.length);
   	
   }
   
     /**
	 * 	Update MsdSecuritySymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecuritySymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecuritySymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecuritySymbol with another Field
	 *	@param value
	 */
   public void setMsdSecuritySymbol(Field source) {
       replace(source,0,source.length(),beginMsdSecuritySymbol,MSD_SECURITY_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecuritySymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecuritySymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecuritySymbol,MSD_SECURITY_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecuritySymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecuritySymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecuritySymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSedolNo
	 *	@return msdSedolNo
	 */
   public char[] getMsdSedolNo() throws CFException{
     if (isMsdSedolNoModified()) { 
        msdSedolNo = refreshMsdSedolNo();
     }
   		return msdSedolNo;
   }

  
	/**
	*  set variable msdSedolNo
	*  Corresponding COBOL Variable is MSD-SEDOL-NO
	*  @param value
	**/
   public void setMsdSedolNo(char[] value) {
      msdSedolNo = checkMsdSedolNoConstraints(value);
      serializeMsdSedolNo(msdSedolNo);
   } 

     /**
	 * 	Update MsdSedolNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSedolNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSedolNo,msdSedolNo.length);
   	
   }
   
   public void setMsdSedolNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedolNo,msdSedolNo.length);
   	
   }
   
     /**
	 * 	Update MsdSedolNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSedolNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedolNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSedolNo with another Field
	 *	@param value
	 */
   public void setMsdSedolNo(Field source) {
       replace(source,0,source.length(),beginMsdSedolNo,MSD_SEDOL_NO_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSedolNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSedolNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSedolNo,MSD_SEDOL_NO_LEN);
   	
   }
   
     /**
	 * 	Update MsdSedolNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSedolNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedolNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdEuroNo
	 *	@return msdEuroNo
	 */
   public char[] getMsdEuroNo() throws CFException{
     if (isMsdEuroNoModified()) { 
        msdEuroNo = refreshMsdEuroNo();
     }
   		return msdEuroNo;
   }

  
	/**
	*  set variable msdEuroNo
	*  Corresponding COBOL Variable is MSD-EURO-NO
	*  @param value
	**/
   public void setMsdEuroNo(char[] value) {
      msdEuroNo = checkMsdEuroNoConstraints(value);
      serializeMsdEuroNo(msdEuroNo);
   } 

     /**
	 * 	Update MsdEuroNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdEuroNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdEuroNo,msdEuroNo.length);
   	
   }
   
   public void setMsdEuroNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEuroNo,msdEuroNo.length);
   	
   }
   
     /**
	 * 	Update MsdEuroNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdEuroNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEuroNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdEuroNo with another Field
	 *	@param value
	 */
   public void setMsdEuroNo(Field source) {
       replace(source,0,source.length(),beginMsdEuroNo,MSD_EURO_NO_LEN);
   	
   }  
   
     /**
	 * 	Update MsdEuroNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdEuroNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdEuroNo,MSD_EURO_NO_LEN);
   	
   }
   
     /**
	 * 	Update MsdEuroNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdEuroNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEuroNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCinNumber
	 *	@return msdCinNumber
	 */
   public char[] getMsdCinNumber() throws CFException{
     if (isMsdCinNumberModified()) { 
        msdCinNumber = refreshMsdCinNumber();
     }
   		return msdCinNumber;
   }

  
	/**
	*  set variable msdCinNumber
	*  Corresponding COBOL Variable is MSD-CIN-NUMBER
	*  @param value
	**/
   public void setMsdCinNumber(char[] value) {
      msdCinNumber = checkMsdCinNumberConstraints(value);
      serializeMsdCinNumber(msdCinNumber);
   } 

     /**
	 * 	Update MsdCinNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCinNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCinNumber,msdCinNumber.length);
   	
   }
   
   public void setMsdCinNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCinNumber,msdCinNumber.length);
   	
   }
   
     /**
	 * 	Update MsdCinNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCinNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCinNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCinNumber with another Field
	 *	@param value
	 */
   public void setMsdCinNumber(Field source) {
       replace(source,0,source.length(),beginMsdCinNumber,MSD_CIN_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCinNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCinNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCinNumber,MSD_CIN_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update MsdCinNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCinNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCinNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCommonCode
	 *	@return msdCommonCode
	 */
   public char[] getMsdCommonCode() throws CFException{
     if (isMsdCommonCodeModified()) { 
        msdCommonCode = refreshMsdCommonCode();
     }
   		return msdCommonCode;
   }

  
	/**
	*  set variable msdCommonCode
	*  Corresponding COBOL Variable is MSD-COMMON-CODE
	*  @param value
	**/
   public void setMsdCommonCode(char[] value) {
      msdCommonCode = checkMsdCommonCodeConstraints(value);
      serializeMsdCommonCode(msdCommonCode);
   } 

     /**
	 * 	Update MsdCommonCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCommonCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCommonCode,msdCommonCode.length);
   	
   }
   
   public void setMsdCommonCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCommonCode,msdCommonCode.length);
   	
   }
   
     /**
	 * 	Update MsdCommonCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCommonCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCommonCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCommonCode with another Field
	 *	@param value
	 */
   public void setMsdCommonCode(Field source) {
       replace(source,0,source.length(),beginMsdCommonCode,MSD_COMMON_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCommonCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCommonCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCommonCode,MSD_COMMON_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdCommonCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCommonCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCommonCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSedEuroInd
	 *	@return msdSedEuroInd
	 */
   public char[] getMsdSedEuroInd() throws CFException{
     if (isMsdSedEuroIndModified()) { 
        msdSedEuroInd = refreshMsdSedEuroInd();
     }
   		return msdSedEuroInd;
   }

  
	/**
	*  set variable msdSedEuroInd
	*  Corresponding COBOL Variable is MSD-SED-EURO-IND
	*  @param value
	**/
   public void setMsdSedEuroInd(char[] value) {
      msdSedEuroInd = checkMsdSedEuroIndConstraints(value);
      serializeMsdSedEuroInd(msdSedEuroInd);
   } 

     /**
	 * 	Update MsdSedEuroInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSedEuroInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSedEuroInd,msdSedEuroInd.length);
   	
   }
   
   public void setMsdSedEuroInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedEuroInd,msdSedEuroInd.length);
   	
   }
   
     /**
	 * 	Update MsdSedEuroInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSedEuroInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedEuroInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSedEuroInd with another Field
	 *	@param value
	 */
   public void setMsdSedEuroInd(Field source) {
       replace(source,0,source.length(),beginMsdSedEuroInd,MSD_SED_EURO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSedEuroInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSedEuroInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSedEuroInd,MSD_SED_EURO_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdSedEuroInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSedEuroInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSedEuroInd+targetIndex,targetLen);
    
   }
	char[] msdSedolNUeroNbrAvail88Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isMsdSedolNUeroNbrAvail()
	 *	@return  Returns true if isMsdSedolNUeroNbrAvail() is "X"
	 */
   public boolean isMsdSedolNUeroNbrAvail() throws CFException {
      return (  compareChars( getMsdSedEuroInd() , msdSedolNUeroNbrAvail88Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setMsdSedolNUeroNbrAvailTrue() {  			
    	setMsdSedEuroInd( msdSedolNUeroNbrAvail88Value);
   	}
	/**
	 *	Returns the value of msdExchangeCode
	 *	@return msdExchangeCode
	 */
   public char[] getMsdExchangeCode() throws CFException{
     if (isMsdExchangeCodeModified()) { 
        msdExchangeCode = refreshMsdExchangeCode();
     }
   		return msdExchangeCode;
   }

  
	/**
	*  set variable msdExchangeCode
	*  Corresponding COBOL Variable is MSD-EXCHANGE-CODE
	*  @param value
	**/
   public void setMsdExchangeCode(char[] value) {
      msdExchangeCode = checkMsdExchangeCodeConstraints(value);
      serializeMsdExchangeCode(msdExchangeCode);
   } 

     /**
	 * 	Update MsdExchangeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdExchangeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdExchangeCode,msdExchangeCode.length);
   	
   }
   
   public void setMsdExchangeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExchangeCode,msdExchangeCode.length);
   	
   }
   
     /**
	 * 	Update MsdExchangeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdExchangeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExchangeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdExchangeCode with another Field
	 *	@param value
	 */
   public void setMsdExchangeCode(Field source) {
       replace(source,0,source.length(),beginMsdExchangeCode,MSD_EXCHANGE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdExchangeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdExchangeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdExchangeCode,MSD_EXCHANGE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdExchangeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdExchangeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExchangeCode+targetIndex,targetLen);
    
   }
	char[] msdNyse88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isMsdNyse()
	 *	@return  Returns true if isMsdNyse() is "A"
	 */
   public boolean isMsdNyse() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdNyse88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setMsdNyseTrue() {  			
    	setMsdExchangeCode( msdNyse88Value);
   	}
	char[] msdAmex88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isMsdAmex()
	 *	@return  Returns true if isMsdAmex() is "B"
	 */
   public boolean isMsdAmex() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdAmex88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setMsdAmexTrue() {  			
    	setMsdExchangeCode( msdAmex88Value);
   	}
	char[] msdMidwest88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isMsdMidwest()
	 *	@return  Returns true if isMsdMidwest() is "C"
	 */
   public boolean isMsdMidwest() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdMidwest88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setMsdMidwestTrue() {  			
    	setMsdExchangeCode( msdMidwest88Value);
   	}
	char[] msdPacifCoast88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isMsdPacifCoast()
	 *	@return  Returns true if isMsdPacifCoast() is "D"
	 */
   public boolean isMsdPacifCoast() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdPacifCoast88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setMsdPacifCoastTrue() {  			
    	setMsdExchangeCode( msdPacifCoast88Value);
   	}
	char[] msdNatlStkExch88Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isMsdNatlStkExch()
	 *	@return  Returns true if isMsdNatlStkExch() is "E"
	 */
   public boolean isMsdNatlStkExch() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdNatlStkExch88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setMsdNatlStkExchTrue() {  			
    	setMsdExchangeCode( msdNatlStkExch88Value);
   	}
	char[] msdOtc88Value1 = "F".toCharArray();
char[] msdOtc88Value2 = "G".toCharArray();
char[] msdOtc88Value3 = "H".toCharArray();
char[] msdOtc88Value4 = " ".toCharArray();

	/**
	 *	Test condition "F" "G" "H" " " for isMsdOtc()
	 *	@return  Returns true if isMsdOtc() is "F" "G" "H" " "
	 */
   public boolean isMsdOtc() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdOtc88Value1)  == 0  ||  compareChars( getMsdExchangeCode() , msdOtc88Value2)  == 0  ||  compareChars( getMsdExchangeCode() , msdOtc88Value3)  == 0  ||  compareChars( getMsdExchangeCode() , msdOtc88Value4)  == 0  );
   }


	/**
	*  set values "F" "G" "H" " "
	*/
   	public void setMsdOtcTrue() {  			
    	setMsdExchangeCode( msdOtc88Value1);
   	}
	char[] msdNotcMrgnable88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isMsdNotcMrgnable()
	 *	@return  Returns true if isMsdNotcMrgnable() is "F"
	 */
   public boolean isMsdNotcMrgnable() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdNotcMrgnable88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setMsdNotcMrgnableTrue() {  			
    	setMsdExchangeCode( msdNotcMrgnable88Value);
   	}
	char[] msdOtcMrgnable88Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isMsdOtcMrgnable()
	 *	@return  Returns true if isMsdOtcMrgnable() is "G"
	 */
   public boolean isMsdOtcMrgnable() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdOtcMrgnable88Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setMsdOtcMrgnableTrue() {  			
    	setMsdExchangeCode( msdOtcMrgnable88Value);
   	}
	
	/**
	 *	Test condition "A" THRU "G" for isMsdMarginable()
	 *	@return  Returns true if isMsdMarginable() is "A" THRU "G"
	 */
   public boolean isMsdMarginable() throws CFException {
      return (  isGreaterOrEqual(getMsdExchangeCode(), "A" ) &&  isLessOrEqual(getMsdExchangeCode(),"G" )  );
   }


	/**
	*  set values "A" THRU "G"
	*/
   	public void setMsdMarginableTrue() {  			
    	setMsdExchangeCode( "A".toCharArray());
   	}
	char[] msdNotcNotMrgnable88Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isMsdNotcNotMrgnable()
	 *	@return  Returns true if isMsdNotcNotMrgnable() is "H"
	 */
   public boolean isMsdNotcNotMrgnable() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdNotcNotMrgnable88Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setMsdNotcNotMrgnableTrue() {  			
    	setMsdExchangeCode( msdNotcNotMrgnable88Value);
   	}
	char[] msdOtcNotMrgnable88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isMsdOtcNotMrgnable()
	 *	@return  Returns true if isMsdOtcNotMrgnable() is " "
	 */
   public boolean isMsdOtcNotMrgnable() throws CFException {
      return (  compareChars( getMsdExchangeCode() , msdOtcNotMrgnable88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setMsdOtcNotMrgnableTrue() {  			
    	setMsdExchangeCode( msdOtcNotMrgnable88Value);
   	}
	
	/**
	 *	Test condition "A" THRU "E" for isMsdSecurityIsListed()
	 *	@return  Returns true if isMsdSecurityIsListed() is "A" THRU "E"
	 */
   public boolean isMsdSecurityIsListed() throws CFException {
      return (  isGreaterOrEqual(getMsdExchangeCode(), "A" ) &&  isLessOrEqual(getMsdExchangeCode(),"E" )  );
   }


	/**
	*  set values "A" THRU "E"
	*/
   	public void setMsdSecurityIsListedTrue() {  			
    	setMsdExchangeCode( "A".toCharArray());
   	}
	/**
	 *	Returns the value of msdOtcExchangeCode
	 *	@return msdOtcExchangeCode
	 */
   public char[] getMsdOtcExchangeCode() throws CFException{
     if (isMsdOtcExchangeCodeModified()) { 
        msdOtcExchangeCode = refreshMsdOtcExchangeCode();
     }
   		return msdOtcExchangeCode;
   }

  
	/**
	*  set variable msdOtcExchangeCode
	*  Corresponding COBOL Variable is MSD-OTC-EXCHANGE-CODE
	*  @param value
	**/
   public void setMsdOtcExchangeCode(char[] value) {
      msdOtcExchangeCode = checkMsdOtcExchangeCodeConstraints(value);
      serializeMsdOtcExchangeCode(msdOtcExchangeCode);
   } 

     /**
	 * 	Update MsdOtcExchangeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdOtcExchangeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdOtcExchangeCode,msdOtcExchangeCode.length);
   	
   }
   
   public void setMsdOtcExchangeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOtcExchangeCode,msdOtcExchangeCode.length);
   	
   }
   
     /**
	 * 	Update MsdOtcExchangeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOtcExchangeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOtcExchangeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdOtcExchangeCode with another Field
	 *	@param value
	 */
   public void setMsdOtcExchangeCode(Field source) {
       replace(source,0,source.length(),beginMsdOtcExchangeCode,MSD_OTC_EXCHANGE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdOtcExchangeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdOtcExchangeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdOtcExchangeCode,MSD_OTC_EXCHANGE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdOtcExchangeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOtcExchangeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOtcExchangeCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdOtherExchange
	 *	@return msdOtherExchange
	 */   
	 public MsdOtherExchange getMsdOtherExchange() {
   	return msdOtherExchange;
   }
   /**
	* 	Update MsdOtherExchange with the passed value
	*   Corresponding COBOL Variable is MSD-OTHER-EXCHANGE
	*	@param value
	*/
   public void setMsdOtherExchange(char[] value) {
      msdOtherExchange.setString(value); 
   }   
    
     /**
	 * 	Update MsdOtherExchange 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdOtherExchange(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOtherExchange.begin,msdOtherExchange.length());
   }
   
     /**
	 * 	Update MsdOtherExchange 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOtherExchange(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOtherExchange.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdOtherExchange with another Field
	 *	@param value
	 */
   public void setMsdOtherExchange(Field source) {
   	replace(source,0,source.length(),msdOtherExchange.begin,msdOtherExchange.length());
   }  
   
     /**
	 * 	Update MsdOtherExchange 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdOtherExchange(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOtherExchange.begin,msdOtherExchange.length());
   }
   
     /**
	 * 	Update MsdOtherExchange 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOtherExchange(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOtherExchange.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of bdms01SecSymbol
	 *  Corresponding COBOL Variable is BDMS01-SEC-SYMBOL
	 *	@return bdms01SecSymbol
	 */
	public List<char[]> getBdms01SecSymbol() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < BDMS_01_SEC_SYMBOL_SIZE;index++) {
        	list.add( getBdms01SecSymbol( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return bdms01SecSymbol
	 */
	public char[] getBdms01SecSymbol(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getBdms01SecSymbol(), resetting it to 0",index);
		    index = 0;
        } else if (index >= BDMS_01_SEC_SYMBOL_SIZE) {
             	index = BDMS_01_SEC_SYMBOL_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01SecSymbol - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_SEC_SYMBOL_SIZE); 
	    }
   	      return getCharArray( (beginBdms01SecSymbol + index*BDMS_01_SEC_SYMBOL_LEN) , BDMS_01_SEC_SYMBOL_LEN );
    }
    
    
   public int  bdms01SecSymbolFieldLength() {
   	return BDMS_01_SEC_SYMBOL_LEN;
   }
   
	

  
  	/**
	 *	Update Bdms01SecSymbol with the passed value at a given index
	 *  Corresponding COBOL Variable is BDMS01-SEC-SYMBOL
	 *  @param index
	 *	@param value
	 */
  public void setBdms01SecSymbol(int index,char[] value) {
   	setBdms01SecSymbol(index,value,true);
   }
   
   
   /**
	 *	Update Bdms01SecSymbol with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setBdms01SecSymbol(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setBdms01SecSymbol(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 12)  {     
		       value = substring(value,0,12);
           }  else if (value.length < 12) {
		       value = pad(12, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(12).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeBdms01SecSymbol(index,value);		
       }
   }
   
	/**
	 *	Returns the value of bdms01OptionCall
	 *	@return bdms01OptionCall
	 */
   public char[] getBdms01OptionCall() throws CFException{
     if (isBdms01OptionCallModified()) { 
        bdms01OptionCall = refreshBdms01OptionCall();
     }
   		return bdms01OptionCall;
   }

  
	/**
	*  set variable bdms01OptionCall
	*  Corresponding COBOL Variable is BDMS01-OPTION-CALL
	*  @param value
	**/
   public void setBdms01OptionCall(char[] value) {
      bdms01OptionCall = checkBdms01OptionCallConstraints(value);
      serializeBdms01OptionCall(bdms01OptionCall);
   } 

     /**
	 * 	Update Bdms01OptionCall 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionCall(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptionCall,bdms01OptionCall.length);
   	
   }
   
   public void setBdms01OptionCall(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionCall,bdms01OptionCall.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptionCall 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionCall(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionCall+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptionCall with another Field
	 *	@param value
	 */
   public void setBdms01OptionCall(Field source) {
       replace(source,0,source.length(),beginBdms01OptionCall,BDMS_01_OPTION_CALL_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptionCall 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptionCall(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptionCall,BDMS_01_OPTION_CALL_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptionCall 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionCall(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionCall+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptionPut
	 *	@return bdms01OptionPut
	 */
   public char[] getBdms01OptionPut() throws CFException{
     if (isBdms01OptionPutModified()) { 
        bdms01OptionPut = refreshBdms01OptionPut();
     }
   		return bdms01OptionPut;
   }

  
	/**
	*  set variable bdms01OptionPut
	*  Corresponding COBOL Variable is BDMS01-OPTION-PUT
	*  @param value
	**/
   public void setBdms01OptionPut(char[] value) {
      bdms01OptionPut = checkBdms01OptionPutConstraints(value);
      serializeBdms01OptionPut(bdms01OptionPut);
   } 

     /**
	 * 	Update Bdms01OptionPut 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionPut(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptionPut,bdms01OptionPut.length);
   	
   }
   
   public void setBdms01OptionPut(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionPut,bdms01OptionPut.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptionPut 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionPut(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionPut+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptionPut with another Field
	 *	@param value
	 */
   public void setBdms01OptionPut(Field source) {
       replace(source,0,source.length(),beginBdms01OptionPut,BDMS_01_OPTION_PUT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptionPut 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptionPut(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptionPut,BDMS_01_OPTION_PUT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptionPut 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionPut(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionPut+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CbCusipNo
	 *	@return bdms01CbCusipNo
	 */
   public char[] getBdms01CbCusipNo() throws CFException{
     if (isBdms01CbCusipNoModified()) { 
        bdms01CbCusipNo = refreshBdms01CbCusipNo();
     }
   		return bdms01CbCusipNo;
   }

  
	/**
	*  set variable bdms01CbCusipNo
	*  Corresponding COBOL Variable is BDMS01-CB-CUSIP-NO
	*  @param value
	**/
   public void setBdms01CbCusipNo(char[] value) {
      bdms01CbCusipNo = checkBdms01CbCusipNoConstraints(value);
      serializeBdms01CbCusipNo(bdms01CbCusipNo);
   } 

     /**
	 * 	Update Bdms01CbCusipNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CbCusipNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CbCusipNo,bdms01CbCusipNo.length);
   	
   }
   
   public void setBdms01CbCusipNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbCusipNo,bdms01CbCusipNo.length);
   	
   }
   
     /**
	 * 	Update Bdms01CbCusipNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CbCusipNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbCusipNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CbCusipNo with another Field
	 *	@param value
	 */
   public void setBdms01CbCusipNo(Field source) {
       replace(source,0,source.length(),beginBdms01CbCusipNo,BDMS_01_CB_CUSIP_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CbCusipNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CbCusipNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CbCusipNo,BDMS_01_CB_CUSIP_NO_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CbCusipNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CbCusipNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbCusipNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrimaryExchangeCd
	 *	@return bdms01PrimaryExchangeCd
	 */
   public char[] getBdms01PrimaryExchangeCd() throws CFException{
     if (isBdms01PrimaryExchangeCdModified()) { 
        bdms01PrimaryExchangeCd = refreshBdms01PrimaryExchangeCd();
     }
   		return bdms01PrimaryExchangeCd;
   }

  
	/**
	*  set variable bdms01PrimaryExchangeCd
	*  Corresponding COBOL Variable is BDMS01-PRIMARY-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01PrimaryExchangeCd(char[] value) {
      bdms01PrimaryExchangeCd = checkBdms01PrimaryExchangeCdConstraints(value);
      serializeBdms01PrimaryExchangeCd(bdms01PrimaryExchangeCd);
   } 

     /**
	 * 	Update Bdms01PrimaryExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrimaryExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrimaryExchangeCd,bdms01PrimaryExchangeCd.length);
   	
   }
   
   public void setBdms01PrimaryExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrimaryExchangeCd,bdms01PrimaryExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrimaryExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrimaryExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrimaryExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrimaryExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01PrimaryExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrimaryExchangeCd,BDMS_01_PRIMARY_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrimaryExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrimaryExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrimaryExchangeCd,BDMS_01_PRIMARY_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrimaryExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrimaryExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrimaryExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of bdms01OtherExchanges
	 *  Corresponding COBOL Variable is BDMS01-OTHER-EXCHANGES
	 *	@return bdms01OtherExchanges
	 */
   public List<Bdms01OtherExchanges> getBdms01OtherExchanges() {
       return bdms01OtherExchanges;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return bdms01OtherExchanges
	 */
	public Bdms01OtherExchanges getBdms01OtherExchanges(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBdms01OtherExchanges(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BDMS_01_OTHER_EXCHANGES_SIZE) {
             	index = BDMS_01_OTHER_EXCHANGES_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01OtherExchanges - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_OTHER_EXCHANGES_SIZE); 
	    }
		if (index >= bdms01OtherExchanges.size()) {
       		for (int fillIndex =  bdms01OtherExchanges.size() -1; fillIndex < index;fillIndex++) {
		       bdms01OtherExchanges.add(null);
		    }
			bdms01OtherExchanges.set(index,
			   	   	new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength()) 
				                        ); 	
		} 
   	   Bdms01OtherExchanges value = bdms01OtherExchanges.get(index);
   	   if (value == null) {
   	      bdms01OtherExchanges.set(index,
			   	   	new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength()) 
				                        ); 
		  value = bdms01OtherExchanges.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Bdms01OtherExchanges at index with the passed value
	 *  Corresponding COBOL Variable is BDMS01-OTHER-EXCHANGES
	 *  @param index
	 *	@param value
	 */
  public void setBdms01OtherExchanges(int index,char[] value) {
   	getBdms01OtherExchanges(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of bdms01PostCd
	 *	@return bdms01PostCd
	 */
   public char[] getBdms01PostCd() throws CFException{
     if (isBdms01PostCdModified()) { 
        bdms01PostCd = refreshBdms01PostCd();
     }
   		return bdms01PostCd;
   }

  
	/**
	*  set variable bdms01PostCd
	*  Corresponding COBOL Variable is BDMS01-POST-CD
	*  @param value
	**/
   public void setBdms01PostCd(char[] value) {
      bdms01PostCd = checkBdms01PostCdConstraints(value);
      serializeBdms01PostCd(bdms01PostCd);
   } 

     /**
	 * 	Update Bdms01PostCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PostCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PostCd,bdms01PostCd.length);
   	
   }
   
   public void setBdms01PostCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PostCd,bdms01PostCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PostCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PostCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PostCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PostCd with another Field
	 *	@param value
	 */
   public void setBdms01PostCd(Field source) {
       replace(source,0,source.length(),beginBdms01PostCd,BDMS_01_POST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PostCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PostCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PostCd,BDMS_01_POST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PostCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PostCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PostCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdAlternateSymbol
	 *	@return msdAlternateSymbol
	 */
   public char[] getMsdAlternateSymbol() throws CFException{
     if (isMsdAlternateSymbolModified()) { 
        msdAlternateSymbol = refreshMsdAlternateSymbol();
     }
   		return msdAlternateSymbol;
   }

  
	/**
	*  set variable msdAlternateSymbol
	*  Corresponding COBOL Variable is MSD-ALTERNATE-SYMBOL
	*  @param value
	**/
   public void setMsdAlternateSymbol(char[] value) {
      msdAlternateSymbol = checkMsdAlternateSymbolConstraints(value);
      serializeMsdAlternateSymbol(msdAlternateSymbol);
   } 

     /**
	 * 	Update MsdAlternateSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdAlternateSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdAlternateSymbol,msdAlternateSymbol.length);
   	
   }
   
   public void setMsdAlternateSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAlternateSymbol,msdAlternateSymbol.length);
   	
   }
   
     /**
	 * 	Update MsdAlternateSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdAlternateSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAlternateSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdAlternateSymbol with another Field
	 *	@param value
	 */
   public void setMsdAlternateSymbol(Field source) {
       replace(source,0,source.length(),beginMsdAlternateSymbol,MSD_ALTERNATE_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update MsdAlternateSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdAlternateSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdAlternateSymbol,MSD_ALTERNATE_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update MsdAlternateSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdAlternateSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAlternateSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DualAdpNo
	 *	@return bdms01DualAdpNo
	 */
   public char[] getBdms01DualAdpNo() throws CFException{
     if (isBdms01DualAdpNoModified()) { 
        bdms01DualAdpNo = refreshBdms01DualAdpNo();
     }
   		return bdms01DualAdpNo;
   }

  
	/**
	*  set variable bdms01DualAdpNo
	*  Corresponding COBOL Variable is BDMS01-DUAL-ADP-NO
	*  @param value
	**/
   public void setBdms01DualAdpNo(char[] value) {
      bdms01DualAdpNo = checkBdms01DualAdpNoConstraints(value);
      serializeBdms01DualAdpNo(bdms01DualAdpNo);
   } 

     /**
	 * 	Update Bdms01DualAdpNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DualAdpNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DualAdpNo,bdms01DualAdpNo.length);
   	
   }
   
   public void setBdms01DualAdpNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DualAdpNo,bdms01DualAdpNo.length);
   	
   }
   
     /**
	 * 	Update Bdms01DualAdpNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DualAdpNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DualAdpNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DualAdpNo with another Field
	 *	@param value
	 */
   public void setBdms01DualAdpNo(Field source) {
       replace(source,0,source.length(),beginBdms01DualAdpNo,BDMS_01_DUAL_ADP_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DualAdpNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DualAdpNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DualAdpNo,BDMS_01_DUAL_ADP_NO_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DualAdpNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DualAdpNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DualAdpNo+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01XrefSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01XrefSegSqlcd(0);
         setMsdCusipNo(CONSTANTS.SPACE_12);
         setMsdIsinNumber(CONSTANTS.SPACE_12);
         setMsdSecuritySymbol(CONSTANTS.SPACE_12);
         setMsdSedolNo(CONSTANTS.SPACE_7);
         setMsdEuroNo(CONSTANTS.SPACE_6);
         setMsdCinNumber(CONSTANTS.SPACE_9);
         setMsdCommonCode(CONSTANTS.SPACE_9);
         setMsdSedEuroInd(CONSTANTS.SPACE);
         setMsdExchangeCode(CONSTANTS.SPACE);
         setMsdOtcExchangeCode(CONSTANTS.SPACE);
          msdOtherExchange.initialize();
     
         for (int index =0; index < BDMS_01_SEC_SYMBOL_SIZE;index++) {
             setBdms01SecSymbol(index, CONSTANTS.SPACE_12);
         }
         setBdms01OptionCall(CONSTANTS.SPACE_12);
         setBdms01OptionPut(CONSTANTS.SPACE_12);
         setBdms01CbCusipNo(CONSTANTS.SPACE_12);
         setBdms01PrimaryExchangeCd(CONSTANTS.SPACE_10);
     if (bdms01OtherExchanges.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
              Bdms01OtherExchanges  newElement = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
              newElement.initialize();
               bdms01OtherExchanges.add(newElement);
          }
     } else {
        if (bdms01OtherExchanges.size() < BDMS_01_OTHER_EXCHANGES_SIZE) {
          // prefill it first
          for (int index = bdms01OtherExchanges.size();index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
              Bdms01OtherExchanges  newElement = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
               bdms01OtherExchanges.add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
     		Bdms01OtherExchanges bdms01OtherExchangesVar = bdms01OtherExchanges.get(index);
 			if (bdms01OtherExchangesVar == null) {
                bdms01OtherExchangesVar = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
                  bdms01OtherExchanges.set(index, bdms01OtherExchangesVar);
			} 
			bdms01OtherExchangesVar.initialize();
		}
     }
         setBdms01PostCd(CONSTANTS.SPACE);
         setMsdAlternateSymbol(CONSTANTS.SPACE_12);
         setBdms01DualAdpNo(CONSTANTS.SPACE_7);
   }

		public static int getBdms01XrefSegDataFieldLength() {
			return BDMS_01_XREF_SEG_DATA_LENGTH;
		}

}
  
