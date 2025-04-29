package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404MpePeRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404MpePeRecData extends Ip00404MpePeRecDataSerialized { 
   

								private long ip00404AccountRangeId;

						private char[] ip00404Ab = Field.fillLowValue(3);

								private int ip00404PriorityCode;

								private long ip00404PrfxIca;

						private char[] ip00404ProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00404MpePeRecData
	**/
    public Ip00404MpePeRecData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404MpePeRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404AccountRangeId
	 *	@return ip00404AccountRangeId
	 */
	public long getIp00404AccountRangeId() throws CFException {
       if (isIp00404AccountRangeIdModified()) { 
           ip00404AccountRangeId = refreshIp00404AccountRangeId();
        }
   		return ip00404AccountRangeId;
	}
	

	
	   
	/**
	 * 	Update Ip00404AccountRangeId with the passed value
	 *  Corresponding COBOL Variable is IP00404-ACCOUNT-RANGE-ID
	 *	@param number
	 */
	public void setIp00404AccountRangeId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404AccountRangeId = checkIp00404AccountRangeIdMaxLimit(number); 
		serializeIp00404AccountRangeId(ip00404AccountRangeId);
	}
	

	/**
	 * 	Update Ip00404AccountRangeId with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404AccountRangeId(char[] value) throws CFException {
		 ip00404AccountRangeId = serializeIp00404AccountRangeId(value);
	}
	/**
	 * 	Update Ip00404AccountRangeId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404AccountRangeIdString(char[] value) throws CFException {
		 setIp00404AccountRangeId(value);
	}
	/**
	 *	Returns the value of ip00404Ab
	 *	@return ip00404Ab
	 */
   public char[] getIp00404Ab() throws CFException{
     if (isIp00404AbModified()) { 
        ip00404Ab = refreshIp00404Ab();
     }
   		return ip00404Ab;
   }

  
	/**
	*  set variable ip00404Ab
	*  Corresponding COBOL Variable is IP00404-AB
	*  @param value
	**/
   public void setIp00404Ab(char[] value) {
      ip00404Ab = checkIp00404AbConstraints(value);
      serializeIp00404Ab(ip00404Ab);
   } 

     /**
	 * 	Update Ip00404Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Ab(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Ab,ip00404Ab.length);
   	
   }
   
   public void setIp00404Ab(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Ab,ip00404Ab.length);
   	
   }
   
     /**
	 * 	Update Ip00404Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Ab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Ab+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Ab with another Field
	 *	@param value
	 */
   public void setIp00404Ab(Field source) {
       replace(source,0,source.length(),beginIp00404Ab,IP_00404_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Ab(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Ab,IP_00404_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Ab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Ab+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404PriorityCode
	 *	@return ip00404PriorityCode
	 */
	public int getIp00404PriorityCode() throws CFException {
       if (isIp00404PriorityCodeModified()) { 
           ip00404PriorityCode = refreshIp00404PriorityCode();
        }
   		return ip00404PriorityCode;
	}
	

	
	   
	/**
	 * 	Update Ip00404PriorityCode with the passed value
	 *  Corresponding COBOL Variable is IP00404-PRIORITY-CODE
	 *	@param number
	 */
	public void setIp00404PriorityCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404PriorityCode = checkIp00404PriorityCodeMaxLimit(number); 
		serializeIp00404PriorityCode(ip00404PriorityCode);
	}
	

	public void setIp00404PriorityCode(long number) {
	    number = checkIp00404PriorityCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404PriorityCode((int)number);
	}
	
	/**
	 * 	Update Ip00404PriorityCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404PriorityCode(char[] value) throws CFException {
		 ip00404PriorityCode = serializeIp00404PriorityCode(value);
	}
	/**
	 * 	Update Ip00404PriorityCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404PriorityCodeString(char[] value) throws CFException {
		 setIp00404PriorityCode(value);
	}
	/**
	 *	Returns the value of ip00404PrfxIca
	 *	@return ip00404PrfxIca
	 */
	public long getIp00404PrfxIca() throws CFException {
       if (isIp00404PrfxIcaModified()) { 
           ip00404PrfxIca = refreshIp00404PrfxIca();
        }
   		return ip00404PrfxIca;
	}
	

	
	   
	/**
	 * 	Update Ip00404PrfxIca with the passed value
	 *  Corresponding COBOL Variable is IP00404-PRFX-ICA
	 *	@param number
	 */
	public void setIp00404PrfxIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404PrfxIca = checkIp00404PrfxIcaMaxLimit(number); 
		serializeIp00404PrfxIca(ip00404PrfxIca);
	}
	

	/**
	 * 	Update Ip00404PrfxIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404PrfxIca(char[] value) throws CFException {
		 ip00404PrfxIca = serializeIp00404PrfxIca(value);
	}
	/**
	 * 	Update Ip00404PrfxIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404PrfxIcaString(char[] value) throws CFException {
		 setIp00404PrfxIca(value);
	}
	/**
	 *	Returns the value of ip00404ProdId
	 *	@return ip00404ProdId
	 */
   public char[] getIp00404ProdId() throws CFException{
     if (isIp00404ProdIdModified()) { 
        ip00404ProdId = refreshIp00404ProdId();
     }
   		return ip00404ProdId;
   }

  
	/**
	*  set variable ip00404ProdId
	*  Corresponding COBOL Variable is IP00404-PROD-ID
	*  @param value
	**/
   public void setIp00404ProdId(char[] value) {
      ip00404ProdId = checkIp00404ProdIdConstraints(value);
      serializeIp00404ProdId(ip00404ProdId);
   } 

     /**
	 * 	Update Ip00404ProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ProdId,ip00404ProdId.length);
   	
   }
   
   public void setIp00404ProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdId,ip00404ProdId.length);
   	
   }
   
     /**
	 * 	Update Ip00404ProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ProdId with another Field
	 *	@param value
	 */
   public void setIp00404ProdId(Field source) {
       replace(source,0,source.length(),beginIp00404ProdId,IP_00404_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ProdId,IP_00404_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00404MpePeRecData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404AccountRangeId(0);
         setIp00404Ab(CONSTANTS.SPACE_3);
                     setIp00404PriorityCode(0);
                     setIp00404PrfxIca(0);
         setIp00404ProdId(CONSTANTS.SPACE_3);
   }

		public static int getIp00404MpePeRecDataFieldLength() {
			return IP_00404_MPE_PE_REC_DATA_LENGTH;
		}

}
  
