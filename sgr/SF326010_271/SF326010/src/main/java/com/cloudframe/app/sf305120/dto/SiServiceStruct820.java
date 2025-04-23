package com.cloudframe.app.sf305120.dto;

/**
*  The class SiServiceStruct820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SiServiceStruct820 extends SiServiceStruct820Serialized { 
   

						private char[] siServiceId820 = new char[4];

						private char[] siSrvReqId820 = new char[6];

						private char[] siServiceStatus820 = new char[1];

						private char[] siReturnCode820 = new char[1];

						private char[] siServiceRc820 = new char[1];

								private short siDataLen820;
	
	/**
	* Constructor for SiServiceStruct820
	**/
    public SiServiceStruct820() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SiServiceStruct820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiServiceStruct820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSiServiceId820(fillSpace(4));
								setSiSrvReqId820(fillSpace(6));
								setSiServiceStatus820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiReturnCode820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiServiceRc820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiDataLen820((short)0);
    } 

	/**
	 *	Returns the value of siServiceId820
	 *	@return siServiceId820
	 */
   public char[] getSiServiceId820() throws CFException{
     if (isSiServiceId820Modified()) { 
        siServiceId820 = refreshSiServiceId820();
     }
   		return siServiceId820;
   }

  
	/**
	*  set variable siServiceId820
	*  Corresponding COBOL Variable is 820-SI-SERVICE-ID
	*  @param value
	**/
   public void setSiServiceId820(char[] value) {
      siServiceId820 = checkSiServiceId820Constraints(value);
      serializeSiServiceId820(siServiceId820);
   } 

     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiServiceId820,siServiceId820.length);
   	
   }
   
   public void setSiServiceId820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceId820,siServiceId820.length);
   	
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceId820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiServiceId820 with another Field
	 *	@param value
	 */
   public void setSiServiceId820(Field source) {
       replace(source,0,source.length(),beginSiServiceId820,SI_SERVICE_ID_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiServiceId820,SI_SERVICE_ID_820_LEN);
   	
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceId820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of siSrvReqId820
	 *	@return siSrvReqId820
	 */
   public char[] getSiSrvReqId820() throws CFException{
     if (isSiSrvReqId820Modified()) { 
        siSrvReqId820 = refreshSiSrvReqId820();
     }
   		return siSrvReqId820;
   }

  
	/**
	*  set variable siSrvReqId820
	*  Corresponding COBOL Variable is 820-SI-SRV-REQ-ID
	*  @param value
	**/
   public void setSiSrvReqId820(char[] value) {
      siSrvReqId820 = checkSiSrvReqId820Constraints(value);
      serializeSiSrvReqId820(siSrvReqId820);
   } 

     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiSrvReqId820,siSrvReqId820.length);
   	
   }
   
   public void setSiSrvReqId820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiSrvReqId820,siSrvReqId820.length);
   	
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiSrvReqId820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiSrvReqId820 with another Field
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source) {
       replace(source,0,source.length(),beginSiSrvReqId820,SI_SRV_REQ_ID_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiSrvReqId820,SI_SRV_REQ_ID_820_LEN);
   	
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiSrvReqId820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of siServiceStatus820
	 *	@return siServiceStatus820
	 */
   public char[] getSiServiceStatus820() throws CFException{
     if (isSiServiceStatus820Modified()) { 
        siServiceStatus820 = refreshSiServiceStatus820();
     }
   		return siServiceStatus820;
   }

  
	/**
	*  set variable siServiceStatus820
	*  Corresponding COBOL Variable is 820-SI-SERVICE-STATUS
	*  @param value
	**/
   public void setSiServiceStatus820(char[] value) {
      siServiceStatus820 = checkSiServiceStatus820Constraints(value);
      serializeSiServiceStatus820(siServiceStatus820);
   } 

     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiServiceStatus820,siServiceStatus820.length);
   	
   }
   
   public void setSiServiceStatus820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceStatus820,siServiceStatus820.length);
   	
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceStatus820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiServiceStatus820 with another Field
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source) {
       replace(source,0,source.length(),beginSiServiceStatus820,SI_SERVICE_STATUS_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiServiceStatus820,SI_SERVICE_STATUS_820_LEN);
   	
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceStatus820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of siReturnCode820
	 *	@return siReturnCode820
	 */
   public char[] getSiReturnCode820() throws CFException{
     if (isSiReturnCode820Modified()) { 
        siReturnCode820 = refreshSiReturnCode820();
     }
   		return siReturnCode820;
   }

  
	/**
	*  set variable siReturnCode820
	*  Corresponding COBOL Variable is 820-SI-RETURN-CODE
	*  @param value
	**/
   public void setSiReturnCode820(char[] value) {
      siReturnCode820 = checkSiReturnCode820Constraints(value);
      serializeSiReturnCode820(siReturnCode820);
   } 

     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiReturnCode820,siReturnCode820.length);
   	
   }
   
   public void setSiReturnCode820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiReturnCode820,siReturnCode820.length);
   	
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiReturnCode820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiReturnCode820 with another Field
	 *	@param value
	 */
   public void setSiReturnCode820(Field source) {
       replace(source,0,source.length(),beginSiReturnCode820,SI_RETURN_CODE_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiReturnCode820,SI_RETURN_CODE_820_LEN);
   	
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiReturnCode820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of siServiceRc820
	 *	@return siServiceRc820
	 */
   public char[] getSiServiceRc820() throws CFException{
     if (isSiServiceRc820Modified()) { 
        siServiceRc820 = refreshSiServiceRc820();
     }
   		return siServiceRc820;
   }

  
	/**
	*  set variable siServiceRc820
	*  Corresponding COBOL Variable is 820-SI-SERVICE-RC
	*  @param value
	**/
   public void setSiServiceRc820(char[] value) {
      siServiceRc820 = checkSiServiceRc820Constraints(value);
      serializeSiServiceRc820(siServiceRc820);
   } 

     /**
	 * 	Update SiServiceRc820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceRc820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiServiceRc820,siServiceRc820.length);
   	
   }
   
   public void setSiServiceRc820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceRc820,siServiceRc820.length);
   	
   }
   
     /**
	 * 	Update SiServiceRc820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceRc820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceRc820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiServiceRc820 with another Field
	 *	@param value
	 */
   public void setSiServiceRc820(Field source) {
       replace(source,0,source.length(),beginSiServiceRc820,SI_SERVICE_RC_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiServiceRc820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceRc820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiServiceRc820,SI_SERVICE_RC_820_LEN);
   	
   }
   
     /**
	 * 	Update SiServiceRc820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceRc820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiServiceRc820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of siDataLen820
	 *	@return siDataLen820
	 */
	public short getSiDataLen820() throws CFException {
        if (isSiDataLen820Modified()) { 
           siDataLen820 = refreshSiDataLen820();
        }
   		return siDataLen820;
	}
	
	/**
	 * 	Update SiDataLen820 with the passed value
	 *  Corresponding COBOL Variable is 820-SI-DATA-LEN
	 *	@param number
	 */
	public void setSiDataLen820(short number) {
	     // Truncate if the number is beyond +/- Max range
	    siDataLen820 = checkSiDataLen820MaxLimit(number); 
		serializeSiDataLen820(siDataLen820);
	}

	public void setSiDataLen820(int number) {
	    number = checkSiDataLen820MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSiDataLen820((short)number);
	}
	public void setSiDataLen820(long number) {
	    number = checkSiDataLen820MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSiDataLen820((short)number);
	}
	


	
	
	

		public static int getSiServiceStruct820FieldLength() {
			return SI_SERVICE_STRUCT_820_LENGTH;
		}

}
  
