package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iMpePeRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040iMpePeRecData extends Ip0040iMpePeRecDataSerialized { 
   

								private long ip0040iAccountRangeId;

						private char[] ip0040iAb = Field.fillLowValue(3);

								private int ip0040iPriorityCode;

								private long ip0040iPrfxIca;

						private char[] ip0040iProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip0040iMpePeRecData
	**/
    public Ip0040iMpePeRecData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iMpePeRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040iAccountRangeId
	 *	@return ip0040iAccountRangeId
	 */
	public long getIp0040iAccountRangeId() throws CFException {
       if (isIp0040iAccountRangeIdModified()) { 
           ip0040iAccountRangeId = refreshIp0040iAccountRangeId();
        }
   		return ip0040iAccountRangeId;
	}
	

	
	   
	/**
	 * 	Update Ip0040iAccountRangeId with the passed value
	 *  Corresponding COBOL Variable is IP0040I-ACCOUNT-RANGE-ID
	 *	@param number
	 */
	public void setIp0040iAccountRangeId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iAccountRangeId = checkIp0040iAccountRangeIdMaxLimit(number); 
		serializeIp0040iAccountRangeId(ip0040iAccountRangeId);
	}
	

	/**
	 * 	Update Ip0040iAccountRangeId with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iAccountRangeId(char[] value) throws CFException {
		 ip0040iAccountRangeId = serializeIp0040iAccountRangeId(value);
	}
	/**
	 * 	Update Ip0040iAccountRangeId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iAccountRangeIdString(char[] value) throws CFException {
		 setIp0040iAccountRangeId(value);
	}
	/**
	 *	Returns the value of ip0040iAb
	 *	@return ip0040iAb
	 */
   public char[] getIp0040iAb() throws CFException{
     if (isIp0040iAbModified()) { 
        ip0040iAb = refreshIp0040iAb();
     }
   		return ip0040iAb;
   }

  
	/**
	*  set variable ip0040iAb
	*  Corresponding COBOL Variable is IP0040I-AB
	*  @param value
	**/
   public void setIp0040iAb(char[] value) {
      ip0040iAb = checkIp0040iAbConstraints(value);
      serializeIp0040iAb(ip0040iAb);
   } 

     /**
	 * 	Update Ip0040iAb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iAb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iAb,ip0040iAb.length);
   	
   }
   
   public void setIp0040iAb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAb,ip0040iAb.length);
   	
   }
   
     /**
	 * 	Update Ip0040iAb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iAb with another Field
	 *	@param value
	 */
   public void setIp0040iAb(Field source) {
       replace(source,0,source.length(),beginIp0040iAb,IP_0040I_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iAb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iAb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iAb,IP_0040I_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iAb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iPriorityCode
	 *	@return ip0040iPriorityCode
	 */
	public int getIp0040iPriorityCode() throws CFException {
       if (isIp0040iPriorityCodeModified()) { 
           ip0040iPriorityCode = refreshIp0040iPriorityCode();
        }
   		return ip0040iPriorityCode;
	}
	

	
	   
	/**
	 * 	Update Ip0040iPriorityCode with the passed value
	 *  Corresponding COBOL Variable is IP0040I-PRIORITY-CODE
	 *	@param number
	 */
	public void setIp0040iPriorityCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iPriorityCode = checkIp0040iPriorityCodeMaxLimit(number); 
		serializeIp0040iPriorityCode(ip0040iPriorityCode);
	}
	

	public void setIp0040iPriorityCode(long number) {
	    number = checkIp0040iPriorityCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iPriorityCode((int)number);
	}
	
	/**
	 * 	Update Ip0040iPriorityCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iPriorityCode(char[] value) throws CFException {
		 ip0040iPriorityCode = serializeIp0040iPriorityCode(value);
	}
	/**
	 * 	Update Ip0040iPriorityCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iPriorityCodeString(char[] value) throws CFException {
		 setIp0040iPriorityCode(value);
	}
	/**
	 *	Returns the value of ip0040iPrfxIca
	 *	@return ip0040iPrfxIca
	 */
	public long getIp0040iPrfxIca() throws CFException {
       if (isIp0040iPrfxIcaModified()) { 
           ip0040iPrfxIca = refreshIp0040iPrfxIca();
        }
   		return ip0040iPrfxIca;
	}
	

	
	   
	/**
	 * 	Update Ip0040iPrfxIca with the passed value
	 *  Corresponding COBOL Variable is IP0040I-PRFX-ICA
	 *	@param number
	 */
	public void setIp0040iPrfxIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iPrfxIca = checkIp0040iPrfxIcaMaxLimit(number); 
		serializeIp0040iPrfxIca(ip0040iPrfxIca);
	}
	

	/**
	 * 	Update Ip0040iPrfxIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iPrfxIca(char[] value) throws CFException {
		 ip0040iPrfxIca = serializeIp0040iPrfxIca(value);
	}
	/**
	 * 	Update Ip0040iPrfxIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iPrfxIcaString(char[] value) throws CFException {
		 setIp0040iPrfxIca(value);
	}
	/**
	 *	Returns the value of ip0040iProdId
	 *	@return ip0040iProdId
	 */
   public char[] getIp0040iProdId() throws CFException{
     if (isIp0040iProdIdModified()) { 
        ip0040iProdId = refreshIp0040iProdId();
     }
   		return ip0040iProdId;
   }

  
	/**
	*  set variable ip0040iProdId
	*  Corresponding COBOL Variable is IP0040I-PROD-ID
	*  @param value
	**/
   public void setIp0040iProdId(char[] value) {
      ip0040iProdId = checkIp0040iProdIdConstraints(value);
      serializeIp0040iProdId(ip0040iProdId);
   } 

     /**
	 * 	Update Ip0040iProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iProdId,ip0040iProdId.length);
   	
   }
   
   public void setIp0040iProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdId,ip0040iProdId.length);
   	
   }
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iProdId with another Field
	 *	@param value
	 */
   public void setIp0040iProdId(Field source) {
       replace(source,0,source.length(),beginIp0040iProdId,IP_0040I_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iProdId,IP_0040I_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040iMpePeRecData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iAccountRangeId(0);
         setIp0040iAb(CONSTANTS.SPACE_3);
                     setIp0040iPriorityCode(0);
                     setIp0040iPrfxIca(0);
         setIp0040iProdId(CONSTANTS.SPACE_3);
   }

		public static int getIp0040iMpePeRecDataFieldLength() {
			return IP_0040I_MPE_PE_REC_DATA_LENGTH;
		}

}
  
