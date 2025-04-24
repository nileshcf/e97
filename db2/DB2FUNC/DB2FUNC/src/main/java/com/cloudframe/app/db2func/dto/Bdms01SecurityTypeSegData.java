package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SecurityTypeSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01SecurityTypeSegData extends Bdms01SecurityTypeSegDataSerialized { 
   

								private int bdms01SecurityTypeSegSqlcd;

						private char[] msdTypeOfRecordInd = Field.fillLowValue(1);

						private char[] msdSecurityTypePos1 = Field.fillLowValue(1);
				private MsdSecTypeCodes msdSecTypeCodes = new MsdSecTypeCodes();

						private char[] msdSecPriceMultiplier = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01SecurityTypeSegData
	**/
    public Bdms01SecurityTypeSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SecurityTypeSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityTypeSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdSecTypeCodes.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of bdms01SecurityTypeSegSqlcd
	 *	@return bdms01SecurityTypeSegSqlcd
	 */
	public int getBdms01SecurityTypeSegSqlcd() throws CFException {
       if (isBdms01SecurityTypeSegSqlcdModified()) { 
           bdms01SecurityTypeSegSqlcd = refreshBdms01SecurityTypeSegSqlcd();
        }
   		return bdms01SecurityTypeSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-SECURITY-TYPE-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01SecurityTypeSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01SecurityTypeSegSqlcd = checkBdms01SecurityTypeSegSqlcdMaxLimit(number); 
		serializeBdms01SecurityTypeSegSqlcd(bdms01SecurityTypeSegSqlcd);
	}
	

	public void setBdms01SecurityTypeSegSqlcd(long number) {
	    number = checkBdms01SecurityTypeSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01SecurityTypeSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SecurityTypeSegSqlcd(char[] value) throws CFException {
		 bdms01SecurityTypeSegSqlcd = serializeBdms01SecurityTypeSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01SecurityTypeSegSqlcdString(char[] value) throws CFException {
		 setBdms01SecurityTypeSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdTypeOfRecordInd
	 *	@return msdTypeOfRecordInd
	 */
   public char[] getMsdTypeOfRecordInd() throws CFException{
     if (isMsdTypeOfRecordIndModified()) { 
        msdTypeOfRecordInd = refreshMsdTypeOfRecordInd();
     }
   		return msdTypeOfRecordInd;
   }

  
	/**
	*  set variable msdTypeOfRecordInd
	*  Corresponding COBOL Variable is MSD-TYPE-OF-RECORD-IND
	*  @param value
	**/
   public void setMsdTypeOfRecordInd(char[] value) {
      msdTypeOfRecordInd = checkMsdTypeOfRecordIndConstraints(value);
      serializeMsdTypeOfRecordInd(msdTypeOfRecordInd);
   } 

     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdTypeOfRecordInd,msdTypeOfRecordInd.length);
   	
   }
   
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTypeOfRecordInd,msdTypeOfRecordInd.length);
   	
   }
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTypeOfRecordInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdTypeOfRecordInd with another Field
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source) {
       replace(source,0,source.length(),beginMsdTypeOfRecordInd,MSD_TYPE_OF_RECORD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdTypeOfRecordInd,MSD_TYPE_OF_RECORD_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTypeOfRecordInd+targetIndex,targetLen);
    
   }
	char[] msdStockRecordFollows88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdStockRecordFollows()
	 *	@return  Returns true if isMsdStockRecordFollows() is "1"
	 */
   public boolean isMsdStockRecordFollows() throws CFException {
      return (  compareChars( getMsdTypeOfRecordInd() , msdStockRecordFollows88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdStockRecordFollowsTrue() {  			
    	setMsdTypeOfRecordInd( msdStockRecordFollows88Value);
   	}
	char[] msdBondRecordFollows88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdBondRecordFollows()
	 *	@return  Returns true if isMsdBondRecordFollows() is "2"
	 */
   public boolean isMsdBondRecordFollows() throws CFException {
      return (  compareChars( getMsdTypeOfRecordInd() , msdBondRecordFollows88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdBondRecordFollowsTrue() {  			
    	setMsdTypeOfRecordInd( msdBondRecordFollows88Value);
   	}
	char[] msdOptionRecordFollows88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdOptionRecordFollows()
	 *	@return  Returns true if isMsdOptionRecordFollows() is "3"
	 */
   public boolean isMsdOptionRecordFollows() throws CFException {
      return (  compareChars( getMsdTypeOfRecordInd() , msdOptionRecordFollows88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdOptionRecordFollowsTrue() {  			
    	setMsdTypeOfRecordInd( msdOptionRecordFollows88Value);
   	}
	/**
	 *	Returns the value of msdSecurityTypePos1
	 *	@return msdSecurityTypePos1
	 */
   public char[] getMsdSecurityTypePos1() throws CFException{
     if (isMsdSecurityTypePos1Modified()) { 
        msdSecurityTypePos1 = refreshMsdSecurityTypePos1();
     }
   		return msdSecurityTypePos1;
   }

  
	/**
	*  set variable msdSecurityTypePos1
	*  Corresponding COBOL Variable is MSD-SECURITY-TYPE-POS1
	*  @param value
	**/
   public void setMsdSecurityTypePos1(char[] value) {
      msdSecurityTypePos1 = checkMsdSecurityTypePos1Constraints(value);
      serializeMsdSecurityTypePos1(msdSecurityTypePos1);
   } 

     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityTypePos1,msdSecurityTypePos1.length);
   	
   }
   
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityTypePos1,msdSecurityTypePos1.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityTypePos1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityTypePos1 with another Field
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source) {
       replace(source,0,source.length(),beginMsdSecurityTypePos1,MSD_SECURITY_TYPE_POS_1_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityTypePos1,MSD_SECURITY_TYPE_POS_1_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityTypePos1+targetIndex,targetLen);
    
   }
	char[] msdStock88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdStock()
	 *	@return  Returns true if isMsdStock() is "1"
	 */
   public boolean isMsdStock() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdStock88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdStockTrue() {  			
    	setMsdSecurityTypePos1( msdStock88Value);
   	}
	char[] msdCorporateBond88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdCorporateBond()
	 *	@return  Returns true if isMsdCorporateBond() is "2"
	 */
   public boolean isMsdCorporateBond() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdCorporateBond88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdCorporateBondTrue() {  			
    	setMsdSecurityTypePos1( msdCorporateBond88Value);
   	}
	char[] msdTreasGovAgen88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdTreasGovAgen()
	 *	@return  Returns true if isMsdTreasGovAgen() is "3"
	 */
   public boolean isMsdTreasGovAgen() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdTreasGovAgen88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdTreasGovAgenTrue() {  			
    	setMsdSecurityTypePos1( msdTreasGovAgen88Value);
   	}
	char[] msdMuniBond88Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isMsdMuniBond()
	 *	@return  Returns true if isMsdMuniBond() is "4"
	 */
   public boolean isMsdMuniBond() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdMuniBond88Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setMsdMuniBondTrue() {  			
    	setMsdSecurityTypePos1( msdMuniBond88Value);
   	}
	char[] msdOptPrivSec88Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isMsdOptPrivSec()
	 *	@return  Returns true if isMsdOptPrivSec() is "6"
	 */
   public boolean isMsdOptPrivSec() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdOptPrivSec88Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setMsdOptPrivSecTrue() {  			
    	setMsdSecurityTypePos1( msdOptPrivSec88Value);
   	}
	char[] msdUnit88Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isMsdUnit()
	 *	@return  Returns true if isMsdUnit() is "7"
	 */
   public boolean isMsdUnit() throws CFException {
      return (  compareChars( getMsdSecurityTypePos1() , msdUnit88Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setMsdUnitTrue() {  			
    	setMsdSecurityTypePos1( msdUnit88Value);
   	}
	/**
	 *	Returns the value of msdSecTypeCodes
	 *	@return msdSecTypeCodes
	 */   
	 public MsdSecTypeCodes getMsdSecTypeCodes() {
   	return msdSecTypeCodes;
   }
   /**
	* 	Update MsdSecTypeCodes with the passed value
	*   Corresponding COBOL Variable is MSD-SEC-TYPE-CODES
	*	@param value
	*/
   public void setMsdSecTypeCodes(char[] value) {
      msdSecTypeCodes.setString(value); 
   }   
    
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypeCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecTypeCodes.begin,msdSecTypeCodes.length());
   }
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypeCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecTypeCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSecTypeCodes with another Field
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source) {
   	replace(source,0,source.length(),msdSecTypeCodes.begin,msdSecTypeCodes.length());
   }  
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecTypeCodes.begin,msdSecTypeCodes.length());
   }
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecTypeCodes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSecPriceMultiplier
	 *	@return msdSecPriceMultiplier
	 */
   public char[] getMsdSecPriceMultiplier() throws CFException{
     if (isMsdSecPriceMultiplierModified()) { 
        msdSecPriceMultiplier = refreshMsdSecPriceMultiplier();
     }
   		return msdSecPriceMultiplier;
   }

  
	/**
	*  set variable msdSecPriceMultiplier
	*  Corresponding COBOL Variable is MSD-SEC-PRICE-MULTIPLIER
	*  @param value
	**/
   public void setMsdSecPriceMultiplier(char[] value) {
      msdSecPriceMultiplier = checkMsdSecPriceMultiplierConstraints(value);
      serializeMsdSecPriceMultiplier(msdSecPriceMultiplier);
   } 

     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecPriceMultiplier,msdSecPriceMultiplier.length);
   	
   }
   
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecPriceMultiplier,msdSecPriceMultiplier.length);
   	
   }
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecPriceMultiplier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecPriceMultiplier with another Field
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source) {
       replace(source,0,source.length(),beginMsdSecPriceMultiplier,MSD_SEC_PRICE_MULTIPLIER_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecPriceMultiplier,MSD_SEC_PRICE_MULTIPLIER_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecPriceMultiplier+targetIndex,targetLen);
    
   }
	char[] msdMultiplyBy188Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isMsdMultiplyBy1()
	 *	@return  Returns true if isMsdMultiplyBy1() is "0"
	 */
   public boolean isMsdMultiplyBy1() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy188Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setMsdMultiplyBy1True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy188Value);
   	}
	char[] msdMultiplyBy1088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdMultiplyBy10()
	 *	@return  Returns true if isMsdMultiplyBy10() is "1"
	 */
   public boolean isMsdMultiplyBy10() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy1088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdMultiplyBy10True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy1088Value);
   	}
	char[] msdMultiplyBy10088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdMultiplyBy100()
	 *	@return  Returns true if isMsdMultiplyBy100() is "2"
	 */
   public boolean isMsdMultiplyBy100() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy10088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdMultiplyBy100True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy10088Value);
   	}
	char[] msdMultiplyBy100088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdMultiplyBy1000()
	 *	@return  Returns true if isMsdMultiplyBy1000() is "3"
	 */
   public boolean isMsdMultiplyBy1000() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy100088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdMultiplyBy1000True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy100088Value);
   	}
	char[] msdMultiplyBy1000088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isMsdMultiplyBy10000()
	 *	@return  Returns true if isMsdMultiplyBy10000() is "4"
	 */
   public boolean isMsdMultiplyBy10000() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy1000088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setMsdMultiplyBy10000True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy1000088Value);
   	}
	char[] msdMultiplyBy10000088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isMsdMultiplyBy100000()
	 *	@return  Returns true if isMsdMultiplyBy100000() is "5"
	 */
   public boolean isMsdMultiplyBy100000() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy10000088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setMsdMultiplyBy100000True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy10000088Value);
   	}
	char[] msdMultiplyBy100000088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isMsdMultiplyBy1000000()
	 *	@return  Returns true if isMsdMultiplyBy1000000() is "6"
	 */
   public boolean isMsdMultiplyBy1000000() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy100000088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setMsdMultiplyBy1000000True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy100000088Value);
   	}
	char[] msdMultiplyBy1000000088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isMsdMultiplyBy10000000()
	 *	@return  Returns true if isMsdMultiplyBy10000000() is "7"
	 */
   public boolean isMsdMultiplyBy10000000() throws CFException {
      return (  compareChars( getMsdSecPriceMultiplier() , msdMultiplyBy1000000088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setMsdMultiplyBy10000000True() {  			
    	setMsdSecPriceMultiplier( msdMultiplyBy1000000088Value);
   	}

	
	
	
	/**
	 * 	initializes Bdms01SecurityTypeSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01SecurityTypeSegSqlcd(0);
         setMsdTypeOfRecordInd(CONSTANTS.SPACE);
         setMsdSecurityTypePos1(CONSTANTS.SPACE);
          msdSecTypeCodes.initialize();
     
         setMsdSecPriceMultiplier(CONSTANTS.SPACE);
   }

		public static int getBdms01SecurityTypeSegDataFieldLength() {
			return BDMS_01_SECURITY_TYPE_SEG_DATA_LENGTH;
		}

}
  
