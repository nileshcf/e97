package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005703Tbl57Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip005703Tbl57Data extends Ip005703Tbl57DataSerialized { 
   

						private char[] ip005703ProdClass = Field.fillLowValue(3);

						private char[] ip005703CabCode = Field.fillLowValue(4);
				private Ip005703CtcR ip005703CtcR = new Ip005703CtcR();

						private char[] ip005703McAssgnId = Field.fillLowValue(6);

								private int ip005703OvrdePrtyNum;

								private long ip005703FeeCodePtr;
	
	/**
	* Constructor for Ip005703Tbl57Data
	**/
    public Ip005703Tbl57Data() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip005703Tbl57Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005703Tbl57Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip005703CtcR.setParent(this,getStartOffset() + 3);
    } 

	/**
	 *	Returns the value of ip005703ProdClass
	 *	@return ip005703ProdClass
	 */
   public char[] getIp005703ProdClass() throws CFException{
     if (isIp005703ProdClassModified()) { 
        ip005703ProdClass = refreshIp005703ProdClass();
     }
   		return ip005703ProdClass;
   }

  
	/**
	*  set variable ip005703ProdClass
	*  Corresponding COBOL Variable is IP005703-PROD-CLASS
	*  @param value
	**/
   public void setIp005703ProdClass(char[] value) {
      ip005703ProdClass = checkIp005703ProdClassConstraints(value);
      serializeIp005703ProdClass(ip005703ProdClass);
   } 

     /**
	 * 	Update Ip005703ProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703ProdClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005703ProdClass,ip005703ProdClass.length);
   	
   }
   
   public void setIp005703ProdClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703ProdClass,ip005703ProdClass.length);
   	
   }
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703ProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703ProdClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005703ProdClass with another Field
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source) {
       replace(source,0,source.length(),beginIp005703ProdClass,IP_005703_PROD_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005703ProdClass,IP_005703_PROD_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703ProdClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005703CabCode
	 *	@return ip005703CabCode
	 */
   public char[] getIp005703CabCode() throws CFException{
     if (isIp005703CabCodeModified()) { 
        ip005703CabCode = refreshIp005703CabCode();
     }
   		return ip005703CabCode;
   }

  
	/**
	*  set variable ip005703CabCode
	*  Corresponding COBOL Variable is IP005703-CAB-CODE
	*  @param value
	**/
   public void setIp005703CabCode(char[] value) {
      ip005703CabCode = checkIp005703CabCodeConstraints(value);
      serializeIp005703CabCode(ip005703CabCode);
   } 

     /**
	 * 	Update Ip005703CabCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703CabCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005703CabCode,ip005703CabCode.length);
   	
   }
   
   public void setIp005703CabCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703CabCode,ip005703CabCode.length);
   	
   }
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CabCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703CabCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005703CabCode with another Field
	 *	@param value
	 */
   public void setIp005703CabCode(Field source) {
       replace(source,0,source.length(),beginIp005703CabCode,IP_005703_CAB_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703CabCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005703CabCode,IP_005703_CAB_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CabCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703CabCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005703CtcR
	 *	@return ip005703CtcR
	 */   
	 public Ip005703CtcR getIp005703CtcR() {
   	return ip005703CtcR;
   }
   /**
	* 	Update Ip005703CtcR with the passed value
	*   Corresponding COBOL Variable is IP005703-CTC-R
	*	@param value
	*/
   public void setIp005703CtcR(char[] value) {
      ip005703CtcR.setString(value); 
   }   
    
     /**
	 * 	Update Ip005703CtcR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp005703CtcR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005703CtcR.begin,ip005703CtcR.length());
   }
   
     /**
	 * 	Update Ip005703CtcR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CtcR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005703CtcR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip005703CtcR with another Field
	 *	@param value
	 */
   public void setIp005703CtcR(Field source) {
   	replace(source,0,source.length(),ip005703CtcR.begin,ip005703CtcR.length());
   }  
   
     /**
	 * 	Update Ip005703CtcR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp005703CtcR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005703CtcR.begin,ip005703CtcR.length());
   }
   
     /**
	 * 	Update Ip005703CtcR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CtcR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005703CtcR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip005703McAssgnId
	 *	@return ip005703McAssgnId
	 */
   public char[] getIp005703McAssgnId() throws CFException{
     if (isIp005703McAssgnIdModified()) { 
        ip005703McAssgnId = refreshIp005703McAssgnId();
     }
   		return ip005703McAssgnId;
   }

  
	/**
	*  set variable ip005703McAssgnId
	*  Corresponding COBOL Variable is IP005703-MC-ASSGN-ID
	*  @param value
	**/
   public void setIp005703McAssgnId(char[] value) {
      ip005703McAssgnId = checkIp005703McAssgnIdConstraints(value);
      serializeIp005703McAssgnId(ip005703McAssgnId);
   } 

     /**
	 * 	Update Ip005703McAssgnId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703McAssgnId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005703McAssgnId,ip005703McAssgnId.length);
   	
   }
   
   public void setIp005703McAssgnId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703McAssgnId,ip005703McAssgnId.length);
   	
   }
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703McAssgnId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703McAssgnId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005703McAssgnId with another Field
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source) {
       replace(source,0,source.length(),beginIp005703McAssgnId,IP_005703_MC_ASSGN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005703McAssgnId,IP_005703_MC_ASSGN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005703McAssgnId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip005703OvrdePrtyNum
	 *	@return ip005703OvrdePrtyNum
	 */
	public int getIp005703OvrdePrtyNum() throws CFException {
       if (isIp005703OvrdePrtyNumModified()) { 
           ip005703OvrdePrtyNum = refreshIp005703OvrdePrtyNum();
        }
   		return ip005703OvrdePrtyNum;
	}
	

	
	   
	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value
	 *  Corresponding COBOL Variable is IP005703-OVRDE-PRTY-NUM
	 *	@param number
	 */
	public void setIp005703OvrdePrtyNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip005703OvrdePrtyNum = checkIp005703OvrdePrtyNumMaxLimit(number); 
		serializeIp005703OvrdePrtyNum(ip005703OvrdePrtyNum);
	}
	

	public void setIp005703OvrdePrtyNum(long number) {
	    number = checkIp005703OvrdePrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp005703OvrdePrtyNum((int)number);
	}
	
	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703OvrdePrtyNum(char[] value) throws CFException {
		 ip005703OvrdePrtyNum = serializeIp005703OvrdePrtyNum(value);
	}
	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703OvrdePrtyNumString(char[] value) throws CFException {
		 setIp005703OvrdePrtyNum(value);
	}
	/**
	 *	Returns the value of ip005703FeeCodePtr
	 *	@return ip005703FeeCodePtr
	 */
	public long getIp005703FeeCodePtr() throws CFException {
       if (isIp005703FeeCodePtrModified()) { 
           ip005703FeeCodePtr = refreshIp005703FeeCodePtr();
        }
   		return ip005703FeeCodePtr;
	}
	

	
	   
	/**
	 * 	Update Ip005703FeeCodePtr with the passed value
	 *  Corresponding COBOL Variable is IP005703-FEE-CODE-PTR
	 *	@param number
	 */
	public void setIp005703FeeCodePtr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip005703FeeCodePtr = checkIp005703FeeCodePtrMaxLimit(number); 
		serializeIp005703FeeCodePtr(ip005703FeeCodePtr);
	}
	

	/**
	 * 	Update Ip005703FeeCodePtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703FeeCodePtr(char[] value) throws CFException {
		 ip005703FeeCodePtr = serializeIp005703FeeCodePtr(value);
	}
	/**
	 * 	Update Ip005703FeeCodePtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703FeeCodePtrString(char[] value) throws CFException {
		 setIp005703FeeCodePtr(value);
	}

	
	
	

		public static int getIp005703Tbl57DataFieldLength() {
			return IP_005703_TBL_57_DATA_LENGTH;
		}

}
  
