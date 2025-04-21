package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360SrtKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360SrtKey extends X360SrtKeySerialized { 
   

						private char[] x360SrtRegion = Field.fillLowValue(2);

						private char[] x360SrtSubRegion = Field.fillLowValue(1);

						private char[] x360SrtProcessorId = Field.fillLowValue(10);

						private char[] x360SrtInstId = Field.fillLowValue(10);

						private char[] x360SrtBinId = Field.fillLowValue(11);

								private int x360SrtCntryN;

								private int x360SrtCurrencyCode;

						private char[] x360SrtSscServId = Field.fillLowValue(3);

								private long x360SrtIca;

						private char[] x360SrtIsisAgreeNum = Field.fillLowValue(4);

						private char[] x360SrtAcqIssId = Field.fillLowValue(1);

						private char[] x360SrtKeyProduct = Field.fillLowValue(3);

						private char[] x360SrtKeySubProduct = Field.fillLowValue(3);

						private char[] x360SrtKeyTrans = Field.fillLowValue(3);

						private char[] x360SrtInterType = Field.fillLowValue(1);

								private long x360SrtReconDte;

						private char[] x360InhProcFlag = Field.fillLowValue(1);

	
	/**
	* Constructor for X360SrtKey
	**/
    public X360SrtKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360SrtKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360SrtKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360SrtRegion
	 *	@return x360SrtRegion
	 */
   public char[] getX360SrtRegion() throws CFException{
     if (isX360SrtRegionModified()) { 
        x360SrtRegion = refreshX360SrtRegion();
     }
   		return x360SrtRegion;
   }

  
	/**
	*  set variable x360SrtRegion
	*  Corresponding COBOL Variable is X360-SRT-REGION
	*  @param value
	**/
   public void setX360SrtRegion(char[] value) {
      x360SrtRegion = checkX360SrtRegionConstraints(value);
      serializeX360SrtRegion(x360SrtRegion);
   } 

     /**
	 * 	Update X360SrtRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtRegion,x360SrtRegion.length);
   	
   }
   
   public void setX360SrtRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtRegion,x360SrtRegion.length);
   	
   }
   
     /**
	 * 	Update X360SrtRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtRegion with another Field
	 *	@param value
	 */
   public void setX360SrtRegion(Field source) {
       replace(source,0,source.length(),beginX360SrtRegion,X_360_SRT_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtRegion,X_360_SRT_REGION_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtRegion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtSubRegion
	 *	@return x360SrtSubRegion
	 */
   public char[] getX360SrtSubRegion() throws CFException{
     if (isX360SrtSubRegionModified()) { 
        x360SrtSubRegion = refreshX360SrtSubRegion();
     }
   		return x360SrtSubRegion;
   }

  
	/**
	*  set variable x360SrtSubRegion
	*  Corresponding COBOL Variable is X360-SRT-SUB-REGION
	*  @param value
	**/
   public void setX360SrtSubRegion(char[] value) {
      x360SrtSubRegion = checkX360SrtSubRegionConstraints(value);
      serializeX360SrtSubRegion(x360SrtSubRegion);
   } 

     /**
	 * 	Update X360SrtSubRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtSubRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtSubRegion,x360SrtSubRegion.length);
   	
   }
   
   public void setX360SrtSubRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSubRegion,x360SrtSubRegion.length);
   	
   }
   
     /**
	 * 	Update X360SrtSubRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtSubRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSubRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtSubRegion with another Field
	 *	@param value
	 */
   public void setX360SrtSubRegion(Field source) {
       replace(source,0,source.length(),beginX360SrtSubRegion,X_360_SRT_SUB_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtSubRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtSubRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtSubRegion,X_360_SRT_SUB_REGION_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtSubRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtSubRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSubRegion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtProcessorId
	 *	@return x360SrtProcessorId
	 */
   public char[] getX360SrtProcessorId() throws CFException{
     if (isX360SrtProcessorIdModified()) { 
        x360SrtProcessorId = refreshX360SrtProcessorId();
     }
   		return x360SrtProcessorId;
   }

  
	/**
	*  set variable x360SrtProcessorId
	*  Corresponding COBOL Variable is X360-SRT-PROCESSOR-ID
	*  @param value
	**/
   public void setX360SrtProcessorId(char[] value) {
      x360SrtProcessorId = checkX360SrtProcessorIdConstraints(value);
      serializeX360SrtProcessorId(x360SrtProcessorId);
   } 

     /**
	 * 	Update X360SrtProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtProcessorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtProcessorId,x360SrtProcessorId.length);
   	
   }
   
   public void setX360SrtProcessorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtProcessorId,x360SrtProcessorId.length);
   	
   }
   
     /**
	 * 	Update X360SrtProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtProcessorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtProcessorId with another Field
	 *	@param value
	 */
   public void setX360SrtProcessorId(Field source) {
       replace(source,0,source.length(),beginX360SrtProcessorId,X_360_SRT_PROCESSOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtProcessorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtProcessorId,X_360_SRT_PROCESSOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtProcessorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtInstId
	 *	@return x360SrtInstId
	 */
   public char[] getX360SrtInstId() throws CFException{
     if (isX360SrtInstIdModified()) { 
        x360SrtInstId = refreshX360SrtInstId();
     }
   		return x360SrtInstId;
   }

  
	/**
	*  set variable x360SrtInstId
	*  Corresponding COBOL Variable is X360-SRT-INST-ID
	*  @param value
	**/
   public void setX360SrtInstId(char[] value) {
      x360SrtInstId = checkX360SrtInstIdConstraints(value);
      serializeX360SrtInstId(x360SrtInstId);
   } 

     /**
	 * 	Update X360SrtInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtInstId,x360SrtInstId.length);
   	
   }
   
   public void setX360SrtInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInstId,x360SrtInstId.length);
   	
   }
   
     /**
	 * 	Update X360SrtInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtInstId with another Field
	 *	@param value
	 */
   public void setX360SrtInstId(Field source) {
       replace(source,0,source.length(),beginX360SrtInstId,X_360_SRT_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtInstId,X_360_SRT_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtBinId
	 *	@return x360SrtBinId
	 */
   public char[] getX360SrtBinId() throws CFException{
     if (isX360SrtBinIdModified()) { 
        x360SrtBinId = refreshX360SrtBinId();
     }
   		return x360SrtBinId;
   }

  
	/**
	*  set variable x360SrtBinId
	*  Corresponding COBOL Variable is X360-SRT-BIN-ID
	*  @param value
	**/
   public void setX360SrtBinId(char[] value) {
      x360SrtBinId = checkX360SrtBinIdConstraints(value);
      serializeX360SrtBinId(x360SrtBinId);
   } 

     /**
	 * 	Update X360SrtBinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtBinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtBinId,x360SrtBinId.length);
   	
   }
   
   public void setX360SrtBinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtBinId,x360SrtBinId.length);
   	
   }
   
     /**
	 * 	Update X360SrtBinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtBinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtBinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtBinId with another Field
	 *	@param value
	 */
   public void setX360SrtBinId(Field source) {
       replace(source,0,source.length(),beginX360SrtBinId,X_360_SRT_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtBinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtBinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtBinId,X_360_SRT_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtBinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtBinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtBinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtCntryN
	 *	@return x360SrtCntryN
	 */
	public int getX360SrtCntryN() throws CFException {
       if (isX360SrtCntryNModified()) { 
           x360SrtCntryN = refreshX360SrtCntryN();
        }
   		return x360SrtCntryN;
	}
	

	
	   
	/**
	 * 	Update X360SrtCntryN with the passed value
	 *  Corresponding COBOL Variable is X360-SRT-CNTRY-N
	 *	@param number
	 */
	public void setX360SrtCntryN(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360SrtCntryN = checkX360SrtCntryNMaxLimit(number); 
		serializeX360SrtCntryN(x360SrtCntryN);
	}
	

	public void setX360SrtCntryN(long number) {
	    number = checkX360SrtCntryNMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360SrtCntryN((int)number);
	}
	
	/**
	 * 	Update X360SrtCntryN with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360SrtCntryN(char[] value) throws CFException {
		 x360SrtCntryN = serializeX360SrtCntryN(value);
	}
	/**
	 * 	Update X360SrtCntryN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360SrtCntryNString(char[] value) throws CFException {
		 setX360SrtCntryN(value);
	}
	/**
	 *	Returns the value of x360SrtCurrencyCode
	 *	@return x360SrtCurrencyCode
	 */
	public int getX360SrtCurrencyCode() throws CFException {
       if (isX360SrtCurrencyCodeModified()) { 
           x360SrtCurrencyCode = refreshX360SrtCurrencyCode();
        }
   		return x360SrtCurrencyCode;
	}
	

	
	   
	/**
	 * 	Update X360SrtCurrencyCode with the passed value
	 *  Corresponding COBOL Variable is X360-SRT-CURRENCY-CODE
	 *	@param number
	 */
	public void setX360SrtCurrencyCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360SrtCurrencyCode = checkX360SrtCurrencyCodeMaxLimit(number); 
		serializeX360SrtCurrencyCode(x360SrtCurrencyCode);
	}
	

	public void setX360SrtCurrencyCode(long number) {
	    number = checkX360SrtCurrencyCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360SrtCurrencyCode((int)number);
	}
	
	/**
	 * 	Update X360SrtCurrencyCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360SrtCurrencyCode(char[] value) throws CFException {
		 x360SrtCurrencyCode = serializeX360SrtCurrencyCode(value);
	}
	/**
	 * 	Update X360SrtCurrencyCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360SrtCurrencyCodeString(char[] value) throws CFException {
		 setX360SrtCurrencyCode(value);
	}
	/**
	 *	Returns the value of x360SrtSscServId
	 *	@return x360SrtSscServId
	 */
   public char[] getX360SrtSscServId() throws CFException{
     if (isX360SrtSscServIdModified()) { 
        x360SrtSscServId = refreshX360SrtSscServId();
     }
   		return x360SrtSscServId;
   }

  
	/**
	*  set variable x360SrtSscServId
	*  Corresponding COBOL Variable is X360-SRT-SSC-SERV-ID
	*  @param value
	**/
   public void setX360SrtSscServId(char[] value) {
      x360SrtSscServId = checkX360SrtSscServIdConstraints(value);
      serializeX360SrtSscServId(x360SrtSscServId);
   } 

     /**
	 * 	Update X360SrtSscServId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtSscServId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtSscServId,x360SrtSscServId.length);
   	
   }
   
   public void setX360SrtSscServId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSscServId,x360SrtSscServId.length);
   	
   }
   
     /**
	 * 	Update X360SrtSscServId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtSscServId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSscServId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtSscServId with another Field
	 *	@param value
	 */
   public void setX360SrtSscServId(Field source) {
       replace(source,0,source.length(),beginX360SrtSscServId,X_360_SRT_SSC_SERV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtSscServId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtSscServId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtSscServId,X_360_SRT_SSC_SERV_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtSscServId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtSscServId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtSscServId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtIca
	 *	@return x360SrtIca
	 */
	public long getX360SrtIca() throws CFException {
       if (isX360SrtIcaModified()) { 
           x360SrtIca = refreshX360SrtIca();
        }
   		return x360SrtIca;
	}
	

	
	   
	/**
	 * 	Update X360SrtIca with the passed value
	 *  Corresponding COBOL Variable is X360-SRT-ICA
	 *	@param number
	 */
	public void setX360SrtIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360SrtIca = checkX360SrtIcaMaxLimit(number); 
		serializeX360SrtIca(x360SrtIca);
	}
	

	/**
	 * 	Update X360SrtIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360SrtIca(char[] value) throws CFException {
		 x360SrtIca = serializeX360SrtIca(value);
	}
	/**
	 * 	Update X360SrtIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360SrtIcaString(char[] value) throws CFException {
		 setX360SrtIca(value);
	}
	/**
	 *	Returns the value of x360SrtIsisAgreeNum
	 *	@return x360SrtIsisAgreeNum
	 */
   public char[] getX360SrtIsisAgreeNum() throws CFException{
     if (isX360SrtIsisAgreeNumModified()) { 
        x360SrtIsisAgreeNum = refreshX360SrtIsisAgreeNum();
     }
   		return x360SrtIsisAgreeNum;
   }

  
	/**
	*  set variable x360SrtIsisAgreeNum
	*  Corresponding COBOL Variable is X360-SRT-ISIS-AGREE-NUM
	*  @param value
	**/
   public void setX360SrtIsisAgreeNum(char[] value) {
      x360SrtIsisAgreeNum = checkX360SrtIsisAgreeNumConstraints(value);
      serializeX360SrtIsisAgreeNum(x360SrtIsisAgreeNum);
   } 

     /**
	 * 	Update X360SrtIsisAgreeNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtIsisAgreeNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtIsisAgreeNum,x360SrtIsisAgreeNum.length);
   	
   }
   
   public void setX360SrtIsisAgreeNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtIsisAgreeNum,x360SrtIsisAgreeNum.length);
   	
   }
   
     /**
	 * 	Update X360SrtIsisAgreeNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtIsisAgreeNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtIsisAgreeNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtIsisAgreeNum with another Field
	 *	@param value
	 */
   public void setX360SrtIsisAgreeNum(Field source) {
       replace(source,0,source.length(),beginX360SrtIsisAgreeNum,X_360_SRT_ISIS_AGREE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtIsisAgreeNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtIsisAgreeNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtIsisAgreeNum,X_360_SRT_ISIS_AGREE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtIsisAgreeNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtIsisAgreeNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtIsisAgreeNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtAcqIssId
	 *	@return x360SrtAcqIssId
	 */
   public char[] getX360SrtAcqIssId() throws CFException{
     if (isX360SrtAcqIssIdModified()) { 
        x360SrtAcqIssId = refreshX360SrtAcqIssId();
     }
   		return x360SrtAcqIssId;
   }

  
	/**
	*  set variable x360SrtAcqIssId
	*  Corresponding COBOL Variable is X360-SRT-ACQ-ISS-ID
	*  @param value
	**/
   public void setX360SrtAcqIssId(char[] value) {
      x360SrtAcqIssId = checkX360SrtAcqIssIdConstraints(value);
      serializeX360SrtAcqIssId(x360SrtAcqIssId);
   } 

     /**
	 * 	Update X360SrtAcqIssId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtAcqIssId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtAcqIssId,x360SrtAcqIssId.length);
   	
   }
   
   public void setX360SrtAcqIssId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtAcqIssId,x360SrtAcqIssId.length);
   	
   }
   
     /**
	 * 	Update X360SrtAcqIssId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtAcqIssId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtAcqIssId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtAcqIssId with another Field
	 *	@param value
	 */
   public void setX360SrtAcqIssId(Field source) {
       replace(source,0,source.length(),beginX360SrtAcqIssId,X_360_SRT_ACQ_ISS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtAcqIssId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtAcqIssId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtAcqIssId,X_360_SRT_ACQ_ISS_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtAcqIssId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtAcqIssId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtAcqIssId+targetIndex,targetLen);
    
   }
	char[] x360Acquire88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isX360Acquire()
	 *	@return  Returns true if isX360Acquire() is "1"
	 */
   public boolean isX360Acquire() throws CFException {
      return (  compareChars( getX360SrtAcqIssId() , x360Acquire88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setX360AcquireTrue() {  			
    	setX360SrtAcqIssId( x360Acquire88Value);
   	}
	char[] x360Issuer88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isX360Issuer()
	 *	@return  Returns true if isX360Issuer() is "2"
	 */
   public boolean isX360Issuer() throws CFException {
      return (  compareChars( getX360SrtAcqIssId() , x360Issuer88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setX360IssuerTrue() {  			
    	setX360SrtAcqIssId( x360Issuer88Value);
   	}
	/**
	 *	Returns the value of x360SrtKeyProduct
	 *	@return x360SrtKeyProduct
	 */
   public char[] getX360SrtKeyProduct() throws CFException{
     if (isX360SrtKeyProductModified()) { 
        x360SrtKeyProduct = refreshX360SrtKeyProduct();
     }
   		return x360SrtKeyProduct;
   }

  
	/**
	*  set variable x360SrtKeyProduct
	*  Corresponding COBOL Variable is X360-SRT-KEY-PRODUCT
	*  @param value
	**/
   public void setX360SrtKeyProduct(char[] value) {
      x360SrtKeyProduct = checkX360SrtKeyProductConstraints(value);
      serializeX360SrtKeyProduct(x360SrtKeyProduct);
   } 

     /**
	 * 	Update X360SrtKeyProduct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtKeyProduct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtKeyProduct,x360SrtKeyProduct.length);
   	
   }
   
   public void setX360SrtKeyProduct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyProduct,x360SrtKeyProduct.length);
   	
   }
   
     /**
	 * 	Update X360SrtKeyProduct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeyProduct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyProduct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtKeyProduct with another Field
	 *	@param value
	 */
   public void setX360SrtKeyProduct(Field source) {
       replace(source,0,source.length(),beginX360SrtKeyProduct,X_360_SRT_KEY_PRODUCT_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtKeyProduct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtKeyProduct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtKeyProduct,X_360_SRT_KEY_PRODUCT_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtKeyProduct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeyProduct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyProduct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtKeySubProduct
	 *	@return x360SrtKeySubProduct
	 */
   public char[] getX360SrtKeySubProduct() throws CFException{
     if (isX360SrtKeySubProductModified()) { 
        x360SrtKeySubProduct = refreshX360SrtKeySubProduct();
     }
   		return x360SrtKeySubProduct;
   }

  
	/**
	*  set variable x360SrtKeySubProduct
	*  Corresponding COBOL Variable is X360-SRT-KEY-SUB-PRODUCT
	*  @param value
	**/
   public void setX360SrtKeySubProduct(char[] value) {
      x360SrtKeySubProduct = checkX360SrtKeySubProductConstraints(value);
      serializeX360SrtKeySubProduct(x360SrtKeySubProduct);
   } 

     /**
	 * 	Update X360SrtKeySubProduct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtKeySubProduct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtKeySubProduct,x360SrtKeySubProduct.length);
   	
   }
   
   public void setX360SrtKeySubProduct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeySubProduct,x360SrtKeySubProduct.length);
   	
   }
   
     /**
	 * 	Update X360SrtKeySubProduct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeySubProduct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeySubProduct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtKeySubProduct with another Field
	 *	@param value
	 */
   public void setX360SrtKeySubProduct(Field source) {
       replace(source,0,source.length(),beginX360SrtKeySubProduct,X_360_SRT_KEY_SUB_PRODUCT_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtKeySubProduct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtKeySubProduct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtKeySubProduct,X_360_SRT_KEY_SUB_PRODUCT_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtKeySubProduct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeySubProduct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeySubProduct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtKeyTrans
	 *	@return x360SrtKeyTrans
	 */
   public char[] getX360SrtKeyTrans() throws CFException{
     if (isX360SrtKeyTransModified()) { 
        x360SrtKeyTrans = refreshX360SrtKeyTrans();
     }
   		return x360SrtKeyTrans;
   }

  
	/**
	*  set variable x360SrtKeyTrans
	*  Corresponding COBOL Variable is X360-SRT-KEY-TRANS
	*  @param value
	**/
   public void setX360SrtKeyTrans(char[] value) {
      x360SrtKeyTrans = checkX360SrtKeyTransConstraints(value);
      serializeX360SrtKeyTrans(x360SrtKeyTrans);
   } 

     /**
	 * 	Update X360SrtKeyTrans 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtKeyTrans(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtKeyTrans,x360SrtKeyTrans.length);
   	
   }
   
   public void setX360SrtKeyTrans(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyTrans,x360SrtKeyTrans.length);
   	
   }
   
     /**
	 * 	Update X360SrtKeyTrans 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeyTrans(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyTrans+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtKeyTrans with another Field
	 *	@param value
	 */
   public void setX360SrtKeyTrans(Field source) {
       replace(source,0,source.length(),beginX360SrtKeyTrans,X_360_SRT_KEY_TRANS_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtKeyTrans 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtKeyTrans(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtKeyTrans,X_360_SRT_KEY_TRANS_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtKeyTrans 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKeyTrans(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtKeyTrans+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtInterType
	 *	@return x360SrtInterType
	 */
   public char[] getX360SrtInterType() throws CFException{
     if (isX360SrtInterTypeModified()) { 
        x360SrtInterType = refreshX360SrtInterType();
     }
   		return x360SrtInterType;
   }

  
	/**
	*  set variable x360SrtInterType
	*  Corresponding COBOL Variable is X360-SRT-INTER-TYPE
	*  @param value
	**/
   public void setX360SrtInterType(char[] value) {
      x360SrtInterType = checkX360SrtInterTypeConstraints(value);
      serializeX360SrtInterType(x360SrtInterType);
   } 

     /**
	 * 	Update X360SrtInterType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtInterType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtInterType,x360SrtInterType.length);
   	
   }
   
   public void setX360SrtInterType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInterType,x360SrtInterType.length);
   	
   }
   
     /**
	 * 	Update X360SrtInterType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtInterType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInterType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtInterType with another Field
	 *	@param value
	 */
   public void setX360SrtInterType(Field source) {
       replace(source,0,source.length(),beginX360SrtInterType,X_360_SRT_INTER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtInterType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtInterType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtInterType,X_360_SRT_INTER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtInterType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtInterType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtInterType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SrtReconDte
	 *	@return x360SrtReconDte
	 */
	public long getX360SrtReconDte() throws CFException {
       if (isX360SrtReconDteModified()) { 
           x360SrtReconDte = refreshX360SrtReconDte();
        }
   		return x360SrtReconDte;
	}
	

	
	   
	/**
	 * 	Update X360SrtReconDte with the passed value
	 *  Corresponding COBOL Variable is X360-SRT-RECON-DTE
	 *	@param number
	 */
	public void setX360SrtReconDte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360SrtReconDte = checkX360SrtReconDteMaxLimit(number); 
		serializeX360SrtReconDte(x360SrtReconDte);
	}
	

	/**
	 * 	Update X360SrtReconDte with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360SrtReconDte(char[] value) throws CFException {
		 x360SrtReconDte = serializeX360SrtReconDte(value);
	}
	/**
	 * 	Update X360SrtReconDte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360SrtReconDteString(char[] value) throws CFException {
		 setX360SrtReconDte(value);
	}
	/**
	 *	Returns the value of x360InhProcFlag
	 *	@return x360InhProcFlag
	 */
   public char[] getX360InhProcFlag() throws CFException{
     if (isX360InhProcFlagModified()) { 
        x360InhProcFlag = refreshX360InhProcFlag();
     }
   		return x360InhProcFlag;
   }

  
	/**
	*  set variable x360InhProcFlag
	*  Corresponding COBOL Variable is X360-INH-PROC-FLAG
	*  @param value
	**/
   public void setX360InhProcFlag(char[] value) {
      x360InhProcFlag = checkX360InhProcFlagConstraints(value);
      serializeX360InhProcFlag(x360InhProcFlag);
   } 

     /**
	 * 	Update X360InhProcFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360InhProcFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360InhProcFlag,x360InhProcFlag.length);
   	
   }
   
   public void setX360InhProcFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360InhProcFlag,x360InhProcFlag.length);
   	
   }
   
     /**
	 * 	Update X360InhProcFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InhProcFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InhProcFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360InhProcFlag with another Field
	 *	@param value
	 */
   public void setX360InhProcFlag(Field source) {
       replace(source,0,source.length(),beginX360InhProcFlag,X_360_INH_PROC_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update X360InhProcFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360InhProcFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360InhProcFlag,X_360_INH_PROC_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update X360InhProcFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InhProcFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InhProcFlag+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360SrtKeyFieldLength() {
			return X_360_SRT_KEY_LENGTH;
		}

}
  
