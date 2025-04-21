package com.cloudframe.app.sf305120.dto;

/**
*  The class Sf539ServiceTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf539ServiceTable extends Sf539ServiceTableSerialized { 
   

								private int sf539ServiceReqNo;

						private char[] sf539ServiceRefno = Field.fillLowValue(6);

						private char[] sf539ServiceCode = Field.fillLowValue(4);

						private char[] sf539ServiceStatus = Field.fillLowValue(1);

						private char[] sf539ServiceRc = Field.fillLowValue(1);

								private int sf539SrvDataLnth;

						private char[] sf539ServiceData = Field.fillLowValue(50);

	
	/**
	* Constructor for Sf539ServiceTable
	**/
    public Sf539ServiceTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf539ServiceTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf539ServiceTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public int getSf539ServiceReqNo() throws CFException {
       if (isSf539ServiceReqNoModified()) { 
           sf539ServiceReqNo = refreshSf539ServiceReqNo();
        }
   		return sf539ServiceReqNo;
	}
	

	
	   
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *  Corresponding COBOL Variable is SF539-SERVICE-REQ-NO
	 *	@param number
	 */
	public void setSf539ServiceReqNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sf539ServiceReqNo = checkSf539ServiceReqNoMaxLimit(number); 
		serializeSf539ServiceReqNo(sf539ServiceReqNo);
	}
	

	public void setSf539ServiceReqNo(long number) {
	    number = checkSf539ServiceReqNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539ServiceReqNo((int)number);
	}
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNo(char[] value) throws CFException {
		 sf539ServiceReqNo = serializeSf539ServiceReqNo(value);
	}
	/**
	 * 	Update Sf539ServiceReqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNoString(char[] value) throws CFException {
		 setSf539ServiceReqNo(value);
	}
	/**
	 *	Returns the value of sf539ServiceRefno
	 *	@return sf539ServiceRefno
	 */
   public char[] getSf539ServiceRefno() throws CFException{
     if (isSf539ServiceRefnoModified()) { 
        sf539ServiceRefno = refreshSf539ServiceRefno();
     }
   		return sf539ServiceRefno;
   }

  
	/**
	*  set variable sf539ServiceRefno
	*  Corresponding COBOL Variable is SF539-SERVICE-REFNO
	*  @param value
	**/
   public void setSf539ServiceRefno(char[] value) {
      sf539ServiceRefno = checkSf539ServiceRefnoConstraints(value);
      serializeSf539ServiceRefno(sf539ServiceRefno);
   } 

     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRefno(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539ServiceRefno,sf539ServiceRefno.length);
   	
   }
   
   public void setSf539ServiceRefno(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRefno,sf539ServiceRefno.length);
   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRefno+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539ServiceRefno with another Field
	 *	@param value
	 */
   public void setSf539ServiceRefno(Field source) {
       replace(source,0,source.length(),beginSf539ServiceRefno,SF_539_SERVICE_REFNO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRefno(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539ServiceRefno,SF_539_SERVICE_REFNO_LEN);
   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRefno+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode() throws CFException{
     if (isSf539ServiceCodeModified()) { 
        sf539ServiceCode = refreshSf539ServiceCode();
     }
   		return sf539ServiceCode;
   }

  
	/**
	*  set variable sf539ServiceCode
	*  Corresponding COBOL Variable is SF539-SERVICE-CODE
	*  @param value
	**/
   public void setSf539ServiceCode(char[] value) {
      sf539ServiceCode = checkSf539ServiceCodeConstraints(value);
      serializeSf539ServiceCode(sf539ServiceCode);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539ServiceCode,sf539ServiceCode.length);
   	
   }
   
   public void setSf539ServiceCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceCode,sf539ServiceCode.length);
   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(Field source) {
       replace(source,0,source.length(),beginSf539ServiceCode,SF_539_SERVICE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539ServiceCode,SF_539_SERVICE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus() throws CFException{
     if (isSf539ServiceStatusModified()) { 
        sf539ServiceStatus = refreshSf539ServiceStatus();
     }
   		return sf539ServiceStatus;
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  Corresponding COBOL Variable is SF539-SERVICE-STATUS
	*  @param value
	**/
   public void setSf539ServiceStatus(char[] value) {
      sf539ServiceStatus = checkSf539ServiceStatusConstraints(value);
      serializeSf539ServiceStatus(sf539ServiceStatus);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539ServiceStatus,sf539ServiceStatus.length);
   	
   }
   
   public void setSf539ServiceStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceStatus,sf539ServiceStatus.length);
   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(Field source) {
       replace(source,0,source.length(),beginSf539ServiceStatus,SF_539_SERVICE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539ServiceStatus,SF_539_SERVICE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539ServiceRc
	 *	@return sf539ServiceRc
	 */
   public char[] getSf539ServiceRc() throws CFException{
     if (isSf539ServiceRcModified()) { 
        sf539ServiceRc = refreshSf539ServiceRc();
     }
   		return sf539ServiceRc;
   }

  
	/**
	*  set variable sf539ServiceRc
	*  Corresponding COBOL Variable is SF539-SERVICE-RC
	*  @param value
	**/
   public void setSf539ServiceRc(char[] value) {
      sf539ServiceRc = checkSf539ServiceRcConstraints(value);
      serializeSf539ServiceRc(sf539ServiceRc);
   } 

     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539ServiceRc,sf539ServiceRc.length);
   	
   }
   
   public void setSf539ServiceRc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRc,sf539ServiceRc.length);
   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539ServiceRc with another Field
	 *	@param value
	 */
   public void setSf539ServiceRc(Field source) {
       replace(source,0,source.length(),beginSf539ServiceRc,SF_539_SERVICE_RC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539ServiceRc,SF_539_SERVICE_RC_LEN);
   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceRc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public int getSf539SrvDataLnth() throws CFException {
       if (isSf539SrvDataLnthModified()) { 
           sf539SrvDataLnth = refreshSf539SrvDataLnth();
        }
   		return sf539SrvDataLnth;
	}
	

	
	   
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *  Corresponding COBOL Variable is SF539-SRV-DATA-LNTH
	 *	@param number
	 */
	public void setSf539SrvDataLnth(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sf539SrvDataLnth = checkSf539SrvDataLnthMaxLimit(number); 
		serializeSf539SrvDataLnth(sf539SrvDataLnth);
	}
	

	public void setSf539SrvDataLnth(long number) {
	    number = checkSf539SrvDataLnthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539SrvDataLnth((int)number);
	}
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnth(char[] value) throws CFException {
		 sf539SrvDataLnth = serializeSf539SrvDataLnth(value);
	}
	/**
	 * 	Update Sf539SrvDataLnth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnthString(char[] value) throws CFException {
		 setSf539SrvDataLnth(value);
	}
	/**
	 *	Returns the value of sf539ServiceData
	 *	@return sf539ServiceData
	 */
   public char[] getSf539ServiceData() throws CFException{
     if (isSf539ServiceDataModified()) { 
        sf539ServiceData = refreshSf539ServiceData();
     }
   		return sf539ServiceData;
   }

  
	/**
	*  set variable sf539ServiceData
	*  Corresponding COBOL Variable is SF539-SERVICE-DATA
	*  @param value
	**/
   public void setSf539ServiceData(char[] value) {
      sf539ServiceData = checkSf539ServiceDataConstraints(value);
      serializeSf539ServiceData(sf539ServiceData);
   } 

     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539ServiceData,sf539ServiceData.length);
   	
   }
   
   public void setSf539ServiceData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceData,sf539ServiceData.length);
   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539ServiceData with another Field
	 *	@param value
	 */
   public void setSf539ServiceData(Field source) {
       replace(source,0,source.length(),beginSf539ServiceData,SF_539_SERVICE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539ServiceData,SF_539_SERVICE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539ServiceData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf539ServiceTableFieldLength() {
			return SF_539_SERVICE_TABLE_LENGTH;
		}

}
  
