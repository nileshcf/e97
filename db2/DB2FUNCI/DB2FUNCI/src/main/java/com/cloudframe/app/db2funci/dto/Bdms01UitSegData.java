package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01UitSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01UitSegData extends Bdms01UitSegDataSerialized { 
   

								private int bdms01UitSegSqlcd;

						private char[] msdUnitIdCd = Field.fillLowValue(2);

								private int msdUnitIdNo;

						private char[] bdms01TypeUitCd = Field.fillLowValue(2);

						private char[] bdms01UitInterestPayCd = Field.fillLowValue(2);

						private char[] bdms01SpnsrId = Field.fillLowValue(3);

						private char[] bdms01WrapInd = Field.fillLowValue(1);

						private char[] bdms01CshRnvstCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01UitSegData
	**/
    public Bdms01UitSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01UitSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UitSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01UitSegSqlcd
	 *	@return bdms01UitSegSqlcd
	 */
	public int getBdms01UitSegSqlcd() throws CFException {
       if (isBdms01UitSegSqlcdModified()) { 
           bdms01UitSegSqlcd = refreshBdms01UitSegSqlcd();
        }
   		return bdms01UitSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01UitSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-UIT-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01UitSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01UitSegSqlcd = checkBdms01UitSegSqlcdMaxLimit(number); 
		serializeBdms01UitSegSqlcd(bdms01UitSegSqlcd);
	}
	

	public void setBdms01UitSegSqlcd(long number) {
	    number = checkBdms01UitSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01UitSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01UitSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01UitSegSqlcd(char[] value) throws CFException {
		 bdms01UitSegSqlcd = serializeBdms01UitSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01UitSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01UitSegSqlcdString(char[] value) throws CFException {
		 setBdms01UitSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdUnitIdCd
	 *	@return msdUnitIdCd
	 */
   public char[] getMsdUnitIdCd() throws CFException{
     if (isMsdUnitIdCdModified()) { 
        msdUnitIdCd = refreshMsdUnitIdCd();
     }
   		return msdUnitIdCd;
   }

  
	/**
	*  set variable msdUnitIdCd
	*  Corresponding COBOL Variable is MSD-UNIT-ID-CD
	*  @param value
	**/
   public void setMsdUnitIdCd(char[] value) {
      msdUnitIdCd = checkMsdUnitIdCdConstraints(value);
      serializeMsdUnitIdCd(msdUnitIdCd);
   } 

     /**
	 * 	Update MsdUnitIdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdUnitIdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdUnitIdCd,msdUnitIdCd.length);
   	
   }
   
   public void setMsdUnitIdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnitIdCd,msdUnitIdCd.length);
   	
   }
   
     /**
	 * 	Update MsdUnitIdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdUnitIdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnitIdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdUnitIdCd with another Field
	 *	@param value
	 */
   public void setMsdUnitIdCd(Field source) {
       replace(source,0,source.length(),beginMsdUnitIdCd,MSD_UNIT_ID_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MsdUnitIdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdUnitIdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdUnitIdCd,MSD_UNIT_ID_CD_LEN);
   	
   }
   
     /**
	 * 	Update MsdUnitIdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdUnitIdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnitIdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdUnitIdNo
	 *	@return msdUnitIdNo
	 */
	public int getMsdUnitIdNo() throws CFException {
       if (isMsdUnitIdNoModified()) { 
           msdUnitIdNo = refreshMsdUnitIdNo();
        }
   		return msdUnitIdNo;
	}
	

	
	   
	/**
	 * 	Update MsdUnitIdNo with the passed value
	 *  Corresponding COBOL Variable is MSD-UNIT-ID-NO
	 *	@param number
	 */
	public void setMsdUnitIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdUnitIdNo = checkMsdUnitIdNoMaxLimit(number); 
		serializeMsdUnitIdNo(msdUnitIdNo);
	}
	

	public void setMsdUnitIdNo(long number) {
	    number = checkMsdUnitIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdUnitIdNo((int)number);
	}
	
	/**
	 * 	Update MsdUnitIdNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdUnitIdNo(char[] value) throws CFException {
		 msdUnitIdNo = serializeMsdUnitIdNo(value);
	}
	/**
	 * 	Update MsdUnitIdNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdUnitIdNoString(char[] value) throws CFException {
		 setMsdUnitIdNo(value);
	}
	/**
	 *	Returns the value of bdms01TypeUitCd
	 *	@return bdms01TypeUitCd
	 */
   public char[] getBdms01TypeUitCd() throws CFException{
     if (isBdms01TypeUitCdModified()) { 
        bdms01TypeUitCd = refreshBdms01TypeUitCd();
     }
   		return bdms01TypeUitCd;
   }

  
	/**
	*  set variable bdms01TypeUitCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-UIT-CD
	*  @param value
	**/
   public void setBdms01TypeUitCd(char[] value) {
      bdms01TypeUitCd = checkBdms01TypeUitCdConstraints(value);
      serializeBdms01TypeUitCd(bdms01TypeUitCd);
   } 

     /**
	 * 	Update Bdms01TypeUitCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeUitCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeUitCd,bdms01TypeUitCd.length);
   	
   }
   
   public void setBdms01TypeUitCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUitCd,bdms01TypeUitCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeUitCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeUitCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUitCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeUitCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeUitCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeUitCd,BDMS_01_TYPE_UIT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeUitCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeUitCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeUitCd,BDMS_01_TYPE_UIT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeUitCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeUitCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeUitCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UitInterestPayCd
	 *	@return bdms01UitInterestPayCd
	 */
   public char[] getBdms01UitInterestPayCd() throws CFException{
     if (isBdms01UitInterestPayCdModified()) { 
        bdms01UitInterestPayCd = refreshBdms01UitInterestPayCd();
     }
   		return bdms01UitInterestPayCd;
   }

  
	/**
	*  set variable bdms01UitInterestPayCd
	*  Corresponding COBOL Variable is BDMS01-UIT-INTEREST-PAY-CD
	*  @param value
	**/
   public void setBdms01UitInterestPayCd(char[] value) {
      bdms01UitInterestPayCd = checkBdms01UitInterestPayCdConstraints(value);
      serializeBdms01UitInterestPayCd(bdms01UitInterestPayCd);
   } 

     /**
	 * 	Update Bdms01UitInterestPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UitInterestPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UitInterestPayCd,bdms01UitInterestPayCd.length);
   	
   }
   
   public void setBdms01UitInterestPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitInterestPayCd,bdms01UitInterestPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UitInterestPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitInterestPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitInterestPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UitInterestPayCd with another Field
	 *	@param value
	 */
   public void setBdms01UitInterestPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01UitInterestPayCd,BDMS_01_UIT_INTEREST_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UitInterestPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UitInterestPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UitInterestPayCd,BDMS_01_UIT_INTEREST_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UitInterestPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitInterestPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitInterestPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SpnsrId
	 *	@return bdms01SpnsrId
	 */
   public char[] getBdms01SpnsrId() throws CFException{
     if (isBdms01SpnsrIdModified()) { 
        bdms01SpnsrId = refreshBdms01SpnsrId();
     }
   		return bdms01SpnsrId;
   }

  
	/**
	*  set variable bdms01SpnsrId
	*  Corresponding COBOL Variable is BDMS01-SPNSR-ID
	*  @param value
	**/
   public void setBdms01SpnsrId(char[] value) {
      bdms01SpnsrId = checkBdms01SpnsrIdConstraints(value);
      serializeBdms01SpnsrId(bdms01SpnsrId);
   } 

     /**
	 * 	Update Bdms01SpnsrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpnsrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SpnsrId,bdms01SpnsrId.length);
   	
   }
   
   public void setBdms01SpnsrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpnsrId,bdms01SpnsrId.length);
   	
   }
   
     /**
	 * 	Update Bdms01SpnsrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpnsrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpnsrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SpnsrId with another Field
	 *	@param value
	 */
   public void setBdms01SpnsrId(Field source) {
       replace(source,0,source.length(),beginBdms01SpnsrId,BDMS_01_SPNSR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SpnsrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SpnsrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SpnsrId,BDMS_01_SPNSR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SpnsrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpnsrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpnsrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01WrapInd
	 *	@return bdms01WrapInd
	 */
   public char[] getBdms01WrapInd() throws CFException{
     if (isBdms01WrapIndModified()) { 
        bdms01WrapInd = refreshBdms01WrapInd();
     }
   		return bdms01WrapInd;
   }

  
	/**
	*  set variable bdms01WrapInd
	*  Corresponding COBOL Variable is BDMS01-WRAP-IND
	*  @param value
	**/
   public void setBdms01WrapInd(char[] value) {
      bdms01WrapInd = checkBdms01WrapIndConstraints(value);
      serializeBdms01WrapInd(bdms01WrapInd);
   } 

     /**
	 * 	Update Bdms01WrapInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01WrapInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01WrapInd,bdms01WrapInd.length);
   	
   }
   
   public void setBdms01WrapInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WrapInd,bdms01WrapInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01WrapInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01WrapInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WrapInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01WrapInd with another Field
	 *	@param value
	 */
   public void setBdms01WrapInd(Field source) {
       replace(source,0,source.length(),beginBdms01WrapInd,BDMS_01_WRAP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01WrapInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01WrapInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01WrapInd,BDMS_01_WRAP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01WrapInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01WrapInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WrapInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CshRnvstCd
	 *	@return bdms01CshRnvstCd
	 */
   public char[] getBdms01CshRnvstCd() throws CFException{
     if (isBdms01CshRnvstCdModified()) { 
        bdms01CshRnvstCd = refreshBdms01CshRnvstCd();
     }
   		return bdms01CshRnvstCd;
   }

  
	/**
	*  set variable bdms01CshRnvstCd
	*  Corresponding COBOL Variable is BDMS01-CSH-RNVST-CD
	*  @param value
	**/
   public void setBdms01CshRnvstCd(char[] value) {
      bdms01CshRnvstCd = checkBdms01CshRnvstCdConstraints(value);
      serializeBdms01CshRnvstCd(bdms01CshRnvstCd);
   } 

     /**
	 * 	Update Bdms01CshRnvstCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CshRnvstCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CshRnvstCd,bdms01CshRnvstCd.length);
   	
   }
   
   public void setBdms01CshRnvstCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CshRnvstCd,bdms01CshRnvstCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CshRnvstCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CshRnvstCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CshRnvstCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CshRnvstCd with another Field
	 *	@param value
	 */
   public void setBdms01CshRnvstCd(Field source) {
       replace(source,0,source.length(),beginBdms01CshRnvstCd,BDMS_01_CSH_RNVST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CshRnvstCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CshRnvstCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CshRnvstCd,BDMS_01_CSH_RNVST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CshRnvstCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CshRnvstCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CshRnvstCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01UitSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UitSegSqlcd(0);
         setMsdUnitIdCd(CONSTANTS.SPACE_2);
                     setMsdUnitIdNo(0);
         setBdms01TypeUitCd(CONSTANTS.SPACE_2);
         setBdms01UitInterestPayCd(CONSTANTS.SPACE_2);
         setBdms01SpnsrId(CONSTANTS.SPACE_3);
         setBdms01WrapInd(CONSTANTS.SPACE);
         setBdms01CshRnvstCd(CONSTANTS.SPACE_2);
   }

		public static int getBdms01UitSegDataFieldLength() {
			return BDMS_01_UIT_SEG_DATA_LENGTH;
		}

}
  
