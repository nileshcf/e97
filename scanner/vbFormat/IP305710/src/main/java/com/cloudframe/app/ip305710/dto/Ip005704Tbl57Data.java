package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005704Tbl57Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip005704Tbl57Data extends Ip005704Tbl57DataSerialized { 
   

						private char[] ip005704ProdClass = Field.fillLowValue(3);

						private char[] ip005704CabCode = Field.fillLowValue(4);
				private Ip005704CtcR ip005704CtcR = new Ip005704CtcR();

						private char[] ip005704McAssgnId = Field.fillLowValue(6);

								private int ip005704OvrdePrtyNum;

								private long ip005704FeeCodePtr;
	
	/**
	* Constructor for Ip005704Tbl57Data
	**/
    public Ip005704Tbl57Data() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip005704Tbl57Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005704Tbl57Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip005704CtcR.setParent(this,getStartOffset() + 3);
    } 

	/**
	 *	Returns the value of ip005704ProdClass
	 *	@return ip005704ProdClass
	 */
   public char[] getIp005704ProdClass() throws CFException{
     if (isIp005704ProdClassModified()) { 
        ip005704ProdClass = refreshIp005704ProdClass();
     }
   		return ip005704ProdClass;
   }

  
	/**
	*  set variable ip005704ProdClass
	*  Corresponding COBOL Variable is IP005704-PROD-CLASS
	*  @param value
	**/
   public void setIp005704ProdClass(char[] value) {
      ip005704ProdClass = checkIp005704ProdClassConstraints(value);
      serializeIp005704ProdClass(ip005704ProdClass);
   } 

     /**
	 * 	Update Ip005704ProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704ProdClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005704ProdClass,ip005704ProdClass.length);
   	
   }
   
   public void setIp005704ProdClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704ProdClass,ip005704ProdClass.length);
   	
   }
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704ProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704ProdClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005704ProdClass with another Field
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source) {
       replace(source,0,source.length(),beginIp005704ProdClass,IP_005704_PROD_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005704ProdClass,IP_005704_PROD_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704ProdClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005704CabCode
	 *	@return ip005704CabCode
	 */
   public char[] getIp005704CabCode() throws CFException{
     if (isIp005704CabCodeModified()) { 
        ip005704CabCode = refreshIp005704CabCode();
     }
   		return ip005704CabCode;
   }

  
	/**
	*  set variable ip005704CabCode
	*  Corresponding COBOL Variable is IP005704-CAB-CODE
	*  @param value
	**/
   public void setIp005704CabCode(char[] value) {
      ip005704CabCode = checkIp005704CabCodeConstraints(value);
      serializeIp005704CabCode(ip005704CabCode);
   } 

     /**
	 * 	Update Ip005704CabCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704CabCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005704CabCode,ip005704CabCode.length);
   	
   }
   
   public void setIp005704CabCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704CabCode,ip005704CabCode.length);
   	
   }
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CabCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704CabCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005704CabCode with another Field
	 *	@param value
	 */
   public void setIp005704CabCode(Field source) {
       replace(source,0,source.length(),beginIp005704CabCode,IP_005704_CAB_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704CabCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005704CabCode,IP_005704_CAB_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CabCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704CabCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005704CtcR
	 *	@return ip005704CtcR
	 */   
	 public Ip005704CtcR getIp005704CtcR() {
   	return ip005704CtcR;
   }
   /**
	* 	Update Ip005704CtcR with the passed value
	*   Corresponding COBOL Variable is IP005704-CTC-R
	*	@param value
	*/
   public void setIp005704CtcR(char[] value) {
      ip005704CtcR.setString(value); 
   }   
    
     /**
	 * 	Update Ip005704CtcR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp005704CtcR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005704CtcR.begin,ip005704CtcR.length());
   }
   
     /**
	 * 	Update Ip005704CtcR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CtcR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005704CtcR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip005704CtcR with another Field
	 *	@param value
	 */
   public void setIp005704CtcR(Field source) {
   	replace(source,0,source.length(),ip005704CtcR.begin,ip005704CtcR.length());
   }  
   
     /**
	 * 	Update Ip005704CtcR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp005704CtcR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005704CtcR.begin,ip005704CtcR.length());
   }
   
     /**
	 * 	Update Ip005704CtcR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CtcR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005704CtcR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip005704McAssgnId
	 *	@return ip005704McAssgnId
	 */
   public char[] getIp005704McAssgnId() throws CFException{
     if (isIp005704McAssgnIdModified()) { 
        ip005704McAssgnId = refreshIp005704McAssgnId();
     }
   		return ip005704McAssgnId;
   }

  
	/**
	*  set variable ip005704McAssgnId
	*  Corresponding COBOL Variable is IP005704-MC-ASSGN-ID
	*  @param value
	**/
   public void setIp005704McAssgnId(char[] value) {
      ip005704McAssgnId = checkIp005704McAssgnIdConstraints(value);
      serializeIp005704McAssgnId(ip005704McAssgnId);
   } 

     /**
	 * 	Update Ip005704McAssgnId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704McAssgnId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005704McAssgnId,ip005704McAssgnId.length);
   	
   }
   
   public void setIp005704McAssgnId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704McAssgnId,ip005704McAssgnId.length);
   	
   }
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704McAssgnId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704McAssgnId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005704McAssgnId with another Field
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source) {
       replace(source,0,source.length(),beginIp005704McAssgnId,IP_005704_MC_ASSGN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005704McAssgnId,IP_005704_MC_ASSGN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704McAssgnId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005704OvrdePrtyNum
	 *	@return ip005704OvrdePrtyNum
	 */
	public int getIp005704OvrdePrtyNum() throws CFException {
       if (isIp005704OvrdePrtyNumModified()) { 
           ip005704OvrdePrtyNum = refreshIp005704OvrdePrtyNum();
        }
   		return ip005704OvrdePrtyNum;
	}
	

	
	   
	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value
	 *  Corresponding COBOL Variable is IP005704-OVRDE-PRTY-NUM
	 *	@param number
	 */
	public void setIp005704OvrdePrtyNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip005704OvrdePrtyNum = checkIp005704OvrdePrtyNumMaxLimit(number); 
		serializeIp005704OvrdePrtyNum(ip005704OvrdePrtyNum);
	}
	

	public void setIp005704OvrdePrtyNum(long number) {
	    number = checkIp005704OvrdePrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp005704OvrdePrtyNum((int)number);
	}
	
	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005704OvrdePrtyNum(char[] value) throws CFException {
		 ip005704OvrdePrtyNum = serializeIp005704OvrdePrtyNum(value);
	}
	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005704OvrdePrtyNumString(char[] value) throws CFException {
		 setIp005704OvrdePrtyNum(value);
	}
	public long getIp005704FeeCodePtr() throws CFException {
        if (isIp005704FeeCodePtrModified()) { 
           ip005704FeeCodePtr = refreshIp005704FeeCodePtr();
        }
   		return ip005704FeeCodePtr;
	}
	
	/**
	 * 	Update Ip005704FeeCodePtr with the passed value
	 *  Corresponding COBOL Variable is IP005704-FEE-CODE-PTR
	 *	@param number
	 */
	public void setIp005704FeeCodePtr(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			ip005704FeeCodePtr = checkIp005704FeeCodePtrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp005704FeeCodePtr(ip005704FeeCodePtr);
	}



	
	
	

		public static int getIp005704Tbl57DataFieldLength() {
			return IP_005704_TBL_57_DATA_LENGTH;
		}

}
  
