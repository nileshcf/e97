package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01UnitsSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01UnitsSegData extends Bdms01UnitsSegDataSerialized { 
   

								private int bdms01UnitsSegSqlcd;

						private char[] bdms01TypeUnitsCd = Field.fillLowValue(3);

	
	/**
	* Constructor for Bdms01UnitsSegData
	**/
    public Bdms01UnitsSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01UnitsSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UnitsSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01UnitsSegSqlcd
	 *	@return bdms01UnitsSegSqlcd
	 */
	public int getBdms01UnitsSegSqlcd() throws CFException {
       if (isBdms01UnitsSegSqlcdModified()) { 
           bdms01UnitsSegSqlcd = refreshBdms01UnitsSegSqlcd();
        }
   		return bdms01UnitsSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01UnitsSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-UNITS-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01UnitsSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01UnitsSegSqlcd = checkBdms01UnitsSegSqlcdMaxLimit(number); 
		serializeBdms01UnitsSegSqlcd(bdms01UnitsSegSqlcd);
	}
	

	public void setBdms01UnitsSegSqlcd(long number) {
	    number = checkBdms01UnitsSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01UnitsSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01UnitsSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01UnitsSegSqlcd(char[] value) throws CFException {
		 bdms01UnitsSegSqlcd = serializeBdms01UnitsSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01UnitsSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01UnitsSegSqlcdString(char[] value) throws CFException {
		 setBdms01UnitsSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01TypeUnitsCd
	 *	@return bdms01TypeUnitsCd
	 */
   public char[] getBdms01TypeUnitsCd() throws CFException{
     if (isBdms01TypeUnitsCdModified()) { 
        bdms01TypeUnitsCd = refreshBdms01TypeUnitsCd();
     }
   		return bdms01TypeUnitsCd;
   }

  
	/**
	*  set variable bdms01TypeUnitsCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-UNITS-CD
	*  @param value
	**/
   public void setBdms01TypeUnitsCd(char[] value) {
      bdms01TypeUnitsCd = checkBdms01TypeUnitsCdConstraints(value);
      serializeBdms01TypeUnitsCd(bdms01TypeUnitsCd);
   } 

     /**
	 * 	Update Bdms01TypeUnitsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeUnitsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeUnitsCd,bdms01TypeUnitsCd.length);
   	
   }
   
   public void setBdms01TypeUnitsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUnitsCd,bdms01TypeUnitsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeUnitsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeUnitsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUnitsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeUnitsCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeUnitsCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeUnitsCd,BDMS_01_TYPE_UNITS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeUnitsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeUnitsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeUnitsCd,BDMS_01_TYPE_UNITS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeUnitsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeUnitsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUnitsCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01UnitsSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UnitsSegSqlcd(0);
         setBdms01TypeUnitsCd(CONSTANTS.SPACE_3);
   }

		public static int getBdms01UnitsSegDataFieldLength() {
			return BDMS_01_UNITS_SEG_DATA_LENGTH;
		}

}
  
