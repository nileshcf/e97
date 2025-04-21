package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys002CntlIchgRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Sys002CntlIchgRec extends Sys002CntlIchgRecSerialized {
   

						private char[] ip98153RecType = Field.fillLowValue(1);

								private BigDecimal ip98153TxnLowAmt = BigDecimal.ZERO;

								private long ip98153TxnLowAmtU;

								private BigDecimal ip98153TxnHighAmt = BigDecimal.ZERO;

								private long ip98153TxnHighAmtU;
	
	/**
	* Constructor for Sys002CntlIchgRec
	**/
    public Sys002CntlIchgRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip98153RecType
	 *	@return ip98153RecType
	 */
   public char[] getIp98153RecType() throws CFException{
     if (isIp98153RecTypeModified()) { 
        ip98153RecType = refreshIp98153RecType();
     }
   		return ip98153RecType;
   }

  
	/**
	*  set variable ip98153RecType
	*  Corresponding COBOL Variable is IP98153-REC-TYPE
	*  @param value
	**/
   public void setIp98153RecType(char[] value) {
      ip98153RecType = checkIp98153RecTypeConstraints(value);
      serializeIp98153RecType(ip98153RecType);
   } 

     /**
	 * 	Update Ip98153RecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98153RecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98153RecType,ip98153RecType.length);
   	
   }
   
   public void setIp98153RecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98153RecType,ip98153RecType.length);
   	
   }
   
     /**
	 * 	Update Ip98153RecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98153RecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98153RecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98153RecType with another Field
	 *	@param value
	 */
   public void setIp98153RecType(Field source) {
       replace(source,0,source.length(),beginIp98153RecType,IP_98153_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98153RecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98153RecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98153RecType,IP_98153_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip98153RecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98153RecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98153RecType+targetIndex,targetLen);
    
   }
	char[] ip9815388ValidRecType88Value1 = "C".toCharArray();
char[] ip9815388ValidRecType88Value2 = "D".toCharArray();

	/**
	 *	Test condition "C" "D" for isIp9815388ValidRecType()
	 *	@return  Returns true if isIp9815388ValidRecType() is "C" "D"
	 */
   public boolean isIp9815388ValidRecType() throws CFException {
      return (  compareChars( getIp98153RecType() , ip9815388ValidRecType88Value1)  == 0  ||  compareChars( getIp98153RecType() , ip9815388ValidRecType88Value2)  == 0  );
   }


	/**
	*  set values "C" "D"
	*/
   	public void setIp9815388ValidRecTypeTrue() {  			
    	setIp98153RecType( ip9815388ValidRecType88Value1);
   	}
	/**
	 *	Returns the value of ip98153TxnLowAmt
	 *	@return ip98153TxnLowAmt
	 */
	public BigDecimal getIp98153TxnLowAmt() throws CFException {
       if (isIp98153TxnLowAmtModified()) { 
           ip98153TxnLowAmt = refreshIp98153TxnLowAmt();
        }
   		return ip98153TxnLowAmt;
	}
	

	
	   
	/**
	 * 	Update Ip98153TxnLowAmt with the passed number
	 *  Corresponding COBOL Variable is IP98153-TXN-LOW-AMT
	 *	@param number
	 */
	public void setIp98153TxnLowAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ip98153TxnLowAmt = checkIp98153TxnLowAmtMaxLimit(number);
	    serializeIp98153TxnLowAmt(ip98153TxnLowAmt);
   }
	/**
	 * 	Update Ip98153TxnLowAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnLowAmt(char[] value) throws CFException {
		 ip98153TxnLowAmt = serializeIp98153TxnLowAmt(value);
	}   
	/**
	 *	Returns the value of ip98153TxnLowAmtU
	 *	@return ip98153TxnLowAmtU
	 */
	public long getIp98153TxnLowAmtU() throws CFException {
       if (isIp98153TxnLowAmtUModified()) { 
           ip98153TxnLowAmtU = refreshIp98153TxnLowAmtU();
        }
   		return ip98153TxnLowAmtU;
	}
	

	
	   
	/**
	 * 	Update Ip98153TxnLowAmtU with the passed value
	 *  Corresponding COBOL Variable is IP98153-TXN-LOW-AMT-U
	 *	@param number
	 */
	public void setIp98153TxnLowAmtU(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98153TxnLowAmtU = checkIp98153TxnLowAmtUMaxLimit(number); 
		serializeIp98153TxnLowAmtU(ip98153TxnLowAmtU);
	}
	

	/**
	 * 	Update Ip98153TxnLowAmtU with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnLowAmtU(char[] value) throws CFException {
		 ip98153TxnLowAmtU = serializeIp98153TxnLowAmtU(value);
	}
	/**
	 * 	Update Ip98153TxnLowAmtU with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnLowAmtUString(char[] value) throws CFException {
		 setIp98153TxnLowAmtU(value);
	}
	/**
	 *	Returns the value of ip98153TxnHighAmt
	 *	@return ip98153TxnHighAmt
	 */
	public BigDecimal getIp98153TxnHighAmt() throws CFException {
       if (isIp98153TxnHighAmtModified()) { 
           ip98153TxnHighAmt = refreshIp98153TxnHighAmt();
        }
   		return ip98153TxnHighAmt;
	}
	

	
	   
	/**
	 * 	Update Ip98153TxnHighAmt with the passed number
	 *  Corresponding COBOL Variable is IP98153-TXN-HIGH-AMT
	 *	@param number
	 */
	public void setIp98153TxnHighAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ip98153TxnHighAmt = checkIp98153TxnHighAmtMaxLimit(number);
	    serializeIp98153TxnHighAmt(ip98153TxnHighAmt);
   }
	/**
	 * 	Update Ip98153TxnHighAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnHighAmt(char[] value) throws CFException {
		 ip98153TxnHighAmt = serializeIp98153TxnHighAmt(value);
	}   
	/**
	 *	Returns the value of ip98153TxnHighAmtU
	 *	@return ip98153TxnHighAmtU
	 */
	public long getIp98153TxnHighAmtU() throws CFException {
       if (isIp98153TxnHighAmtUModified()) { 
           ip98153TxnHighAmtU = refreshIp98153TxnHighAmtU();
        }
   		return ip98153TxnHighAmtU;
	}
	

	
	   
	/**
	 * 	Update Ip98153TxnHighAmtU with the passed value
	 *  Corresponding COBOL Variable is IP98153-TXN-HIGH-AMT-U
	 *	@param number
	 */
	public void setIp98153TxnHighAmtU(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98153TxnHighAmtU = checkIp98153TxnHighAmtUMaxLimit(number); 
		serializeIp98153TxnHighAmtU(ip98153TxnHighAmtU);
	}
	

	/**
	 * 	Update Ip98153TxnHighAmtU with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnHighAmtU(char[] value) throws CFException {
		 ip98153TxnHighAmtU = serializeIp98153TxnHighAmtU(value);
	}
	/**
	 * 	Update Ip98153TxnHighAmtU with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98153TxnHighAmtUString(char[] value) throws CFException {
		 setIp98153TxnHighAmtU(value);
	}

	
	
	

		public static int getSys002CntlIchgRecFieldLength() {
			return SYS_002_CNTL_ICHG_REC_LENGTH;
		}

}
  
