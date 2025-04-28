package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01TcontrolSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01TcontrolSegData extends Bdms01TcontrolSegDataSerialized { 
   

								private int bdms01TcontrolSegSqlcd;

						private char[] bdms01UpdtTranCd = Field.fillLowValue(8);

						private char[] bdms01UpdtTmstp = Field.fillLowValue(26);

						private char[] bdms01UpdtTrmlCd = Field.fillLowValue(8);

						private char[] bdms01UpdtCommentTxt = Field.fillLowValue(79);

	
	/**
	* Constructor for Bdms01TcontrolSegData
	**/
    public Bdms01TcontrolSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01TcontrolSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TcontrolSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01TcontrolSegSqlcd
	 *	@return bdms01TcontrolSegSqlcd
	 */
	public int getBdms01TcontrolSegSqlcd() throws CFException {
       if (isBdms01TcontrolSegSqlcdModified()) { 
           bdms01TcontrolSegSqlcd = refreshBdms01TcontrolSegSqlcd();
        }
   		return bdms01TcontrolSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01TcontrolSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-TCONTROL-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01TcontrolSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01TcontrolSegSqlcd = checkBdms01TcontrolSegSqlcdMaxLimit(number); 
		serializeBdms01TcontrolSegSqlcd(bdms01TcontrolSegSqlcd);
	}
	

	public void setBdms01TcontrolSegSqlcd(long number) {
	    number = checkBdms01TcontrolSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01TcontrolSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01TcontrolSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01TcontrolSegSqlcd(char[] value) throws CFException {
		 bdms01TcontrolSegSqlcd = serializeBdms01TcontrolSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01TcontrolSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01TcontrolSegSqlcdString(char[] value) throws CFException {
		 setBdms01TcontrolSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01UpdtTranCd
	 *	@return bdms01UpdtTranCd
	 */
   public char[] getBdms01UpdtTranCd() throws CFException{
     if (isBdms01UpdtTranCdModified()) { 
        bdms01UpdtTranCd = refreshBdms01UpdtTranCd();
     }
   		return bdms01UpdtTranCd;
   }

  
	/**
	*  set variable bdms01UpdtTranCd
	*  Corresponding COBOL Variable is BDMS01-UPDT-TRAN-CD
	*  @param value
	**/
   public void setBdms01UpdtTranCd(char[] value) {
      bdms01UpdtTranCd = checkBdms01UpdtTranCdConstraints(value);
      serializeBdms01UpdtTranCd(bdms01UpdtTranCd);
   } 

     /**
	 * 	Update Bdms01UpdtTranCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UpdtTranCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UpdtTranCd,bdms01UpdtTranCd.length);
   	
   }
   
   public void setBdms01UpdtTranCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTranCd,bdms01UpdtTranCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTranCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTranCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTranCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UpdtTranCd with another Field
	 *	@param value
	 */
   public void setBdms01UpdtTranCd(Field source) {
       replace(source,0,source.length(),beginBdms01UpdtTranCd,BDMS_01_UPDT_TRAN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UpdtTranCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UpdtTranCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UpdtTranCd,BDMS_01_UPDT_TRAN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTranCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTranCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTranCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UpdtTmstp
	 *	@return bdms01UpdtTmstp
	 */
   public char[] getBdms01UpdtTmstp() throws CFException{
     if (isBdms01UpdtTmstpModified()) { 
        bdms01UpdtTmstp = refreshBdms01UpdtTmstp();
     }
   		return bdms01UpdtTmstp;
   }

  
	/**
	*  set variable bdms01UpdtTmstp
	*  Corresponding COBOL Variable is BDMS01-UPDT-TMSTP
	*  @param value
	**/
   public void setBdms01UpdtTmstp(char[] value) {
      bdms01UpdtTmstp = checkBdms01UpdtTmstpConstraints(value);
      serializeBdms01UpdtTmstp(bdms01UpdtTmstp);
   } 

     /**
	 * 	Update Bdms01UpdtTmstp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UpdtTmstp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UpdtTmstp,bdms01UpdtTmstp.length);
   	
   }
   
   public void setBdms01UpdtTmstp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTmstp,bdms01UpdtTmstp.length);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTmstp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTmstp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTmstp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UpdtTmstp with another Field
	 *	@param value
	 */
   public void setBdms01UpdtTmstp(Field source) {
       replace(source,0,source.length(),beginBdms01UpdtTmstp,BDMS_01_UPDT_TMSTP_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UpdtTmstp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UpdtTmstp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UpdtTmstp,BDMS_01_UPDT_TMSTP_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTmstp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTmstp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTmstp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UpdtTrmlCd
	 *	@return bdms01UpdtTrmlCd
	 */
   public char[] getBdms01UpdtTrmlCd() throws CFException{
     if (isBdms01UpdtTrmlCdModified()) { 
        bdms01UpdtTrmlCd = refreshBdms01UpdtTrmlCd();
     }
   		return bdms01UpdtTrmlCd;
   }

  
	/**
	*  set variable bdms01UpdtTrmlCd
	*  Corresponding COBOL Variable is BDMS01-UPDT-TRML-CD
	*  @param value
	**/
   public void setBdms01UpdtTrmlCd(char[] value) {
      bdms01UpdtTrmlCd = checkBdms01UpdtTrmlCdConstraints(value);
      serializeBdms01UpdtTrmlCd(bdms01UpdtTrmlCd);
   } 

     /**
	 * 	Update Bdms01UpdtTrmlCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UpdtTrmlCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UpdtTrmlCd,bdms01UpdtTrmlCd.length);
   	
   }
   
   public void setBdms01UpdtTrmlCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTrmlCd,bdms01UpdtTrmlCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTrmlCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTrmlCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTrmlCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UpdtTrmlCd with another Field
	 *	@param value
	 */
   public void setBdms01UpdtTrmlCd(Field source) {
       replace(source,0,source.length(),beginBdms01UpdtTrmlCd,BDMS_01_UPDT_TRML_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UpdtTrmlCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UpdtTrmlCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UpdtTrmlCd,BDMS_01_UPDT_TRML_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtTrmlCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtTrmlCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtTrmlCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UpdtCommentTxt
	 *	@return bdms01UpdtCommentTxt
	 */
   public char[] getBdms01UpdtCommentTxt() throws CFException{
     if (isBdms01UpdtCommentTxtModified()) { 
        bdms01UpdtCommentTxt = refreshBdms01UpdtCommentTxt();
     }
   		return bdms01UpdtCommentTxt;
   }

  
	/**
	*  set variable bdms01UpdtCommentTxt
	*  Corresponding COBOL Variable is BDMS01-UPDT-COMMENT-TXT
	*  @param value
	**/
   public void setBdms01UpdtCommentTxt(char[] value) {
      bdms01UpdtCommentTxt = checkBdms01UpdtCommentTxtConstraints(value);
      serializeBdms01UpdtCommentTxt(bdms01UpdtCommentTxt);
   } 

     /**
	 * 	Update Bdms01UpdtCommentTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UpdtCommentTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UpdtCommentTxt,bdms01UpdtCommentTxt.length);
   	
   }
   
   public void setBdms01UpdtCommentTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtCommentTxt,bdms01UpdtCommentTxt.length);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtCommentTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtCommentTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtCommentTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UpdtCommentTxt with another Field
	 *	@param value
	 */
   public void setBdms01UpdtCommentTxt(Field source) {
       replace(source,0,source.length(),beginBdms01UpdtCommentTxt,BDMS_01_UPDT_COMMENT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UpdtCommentTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UpdtCommentTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UpdtCommentTxt,BDMS_01_UPDT_COMMENT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UpdtCommentTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UpdtCommentTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UpdtCommentTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01TcontrolSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01TcontrolSegSqlcd(0);
         setBdms01UpdtTranCd(CONSTANTS.SPACE_8);
         setBdms01UpdtTmstp(CONSTANTS.SPACE_26);
         setBdms01UpdtTrmlCd(CONSTANTS.SPACE_8);
         setBdms01UpdtCommentTxt(CONSTANTS.SPACE_79);
   }

		public static int getBdms01TcontrolSegDataFieldLength() {
			return BDMS_01_TCONTROL_SEG_DATA_LENGTH;
		}

}
  
