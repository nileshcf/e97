package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701TipamrqEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip70701TipamrqEntries")

public class Ip70701TipamrqEntries extends Ip70701TipamrqEntriesSerialized  implements InitializingBean {
   
				private Ip70701TipamrqKey ip70701TipamrqKey = new Ip70701TipamrqKey();
				private Ip70701RequestData ip70701RequestData = new Ip70701RequestData();

						private char[] ip70701JobGrpId = Field.fillLowValue(6);

								private int ip70701JobGrpNum;
	
	/**
	* Constructor for Ip70701TipamrqEntries
	**/
    public Ip70701TipamrqEntries() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip70701TipamrqKey.setParent(this,getStartOffset() + 0);
	       			ip70701RequestData.setParent(this,getStartOffset() + 57);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip70701TipamrqKey
	 *	@return ip70701TipamrqKey
	 */   
	 public Ip70701TipamrqKey getIp70701TipamrqKey() {
   	return ip70701TipamrqKey;
   }
   /**
	* 	Update Ip70701TipamrqKey with the passed value
	*   Corresponding COBOL Variable is IP70701-TIPAMRQ-KEY
	*	@param value
	*/
   public void setIp70701TipamrqKey(char[] value) {
      ip70701TipamrqKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip70701TipamrqKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70701TipamrqKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70701TipamrqKey.begin,ip70701TipamrqKey.length());
   }
   
     /**
	 * 	Update Ip70701TipamrqKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701TipamrqKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70701TipamrqKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70701TipamrqKey with another Field
	 *	@param value
	 */
   public void setIp70701TipamrqKey(Field source) {
   	replace(source,0,source.length(),ip70701TipamrqKey.begin,ip70701TipamrqKey.length());
   }  
   
     /**
	 * 	Update Ip70701TipamrqKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70701TipamrqKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70701TipamrqKey.begin,ip70701TipamrqKey.length());
   }
   
     /**
	 * 	Update Ip70701TipamrqKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701TipamrqKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70701TipamrqKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip70701RequestData
	 *	@return ip70701RequestData
	 */   
	 public Ip70701RequestData getIp70701RequestData() {
   	return ip70701RequestData;
   }
   /**
	* 	Update Ip70701RequestData with the passed value
	*   Corresponding COBOL Variable is IP70701-REQUEST-DATA
	*	@param value
	*/
   public void setIp70701RequestData(char[] value) {
      ip70701RequestData.setString(value); 
   }   
    
     /**
	 * 	Update Ip70701RequestData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70701RequestData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70701RequestData.begin,ip70701RequestData.length());
   }
   
     /**
	 * 	Update Ip70701RequestData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701RequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70701RequestData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70701RequestData with another Field
	 *	@param value
	 */
   public void setIp70701RequestData(Field source) {
   	replace(source,0,source.length(),ip70701RequestData.begin,ip70701RequestData.length());
   }  
   
     /**
	 * 	Update Ip70701RequestData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70701RequestData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70701RequestData.begin,ip70701RequestData.length());
   }
   
     /**
	 * 	Update Ip70701RequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701RequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70701RequestData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip70701JobGrpId
	 *	@return ip70701JobGrpId
	 */
   public char[] getIp70701JobGrpId() throws CFException{
     if (isIp70701JobGrpIdModified()) { 
        ip70701JobGrpId = refreshIp70701JobGrpId();
     }
   		return ip70701JobGrpId;
   }

  
	/**
	*  set variable ip70701JobGrpId
	*  Corresponding COBOL Variable is IP70701-JOB-GRP-ID
	*  @param value
	**/
   public void setIp70701JobGrpId(char[] value) {
      ip70701JobGrpId = checkIp70701JobGrpIdConstraints(value);
      serializeIp70701JobGrpId(ip70701JobGrpId);
   } 

     /**
	 * 	Update Ip70701JobGrpId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701JobGrpId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701JobGrpId,ip70701JobGrpId.length);
   	
   }
   
   public void setIp70701JobGrpId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701JobGrpId,ip70701JobGrpId.length);
   	
   }
   
     /**
	 * 	Update Ip70701JobGrpId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701JobGrpId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701JobGrpId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701JobGrpId with another Field
	 *	@param value
	 */
   public void setIp70701JobGrpId(Field source) {
       replace(source,0,source.length(),beginIp70701JobGrpId,IP_70701_JOB_GRP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701JobGrpId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701JobGrpId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701JobGrpId,IP_70701_JOB_GRP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701JobGrpId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701JobGrpId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701JobGrpId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70701JobGrpNum
	 *	@return ip70701JobGrpNum
	 */
	public int getIp70701JobGrpNum() throws CFException {
       if (isIp70701JobGrpNumModified()) { 
           ip70701JobGrpNum = refreshIp70701JobGrpNum();
        }
   		return ip70701JobGrpNum;
	}
	

	
	   
	/**
	 * 	Update Ip70701JobGrpNum with the passed value
	 *  Corresponding COBOL Variable is IP70701-JOB-GRP-NUM
	 *	@param number
	 */
	public void setIp70701JobGrpNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip70701JobGrpNum = checkIp70701JobGrpNumMaxLimit(number); 
		serializeIp70701JobGrpNum(ip70701JobGrpNum);
	}
	

	public void setIp70701JobGrpNum(long number) {
	    number = checkIp70701JobGrpNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70701JobGrpNum((int)number);
	}
	
	/**
	 * 	Update Ip70701JobGrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70701JobGrpNum(char[] value) throws CFException {
		 ip70701JobGrpNum = serializeIp70701JobGrpNum(value);
	}
	/**
	 * 	Update Ip70701JobGrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70701JobGrpNumString(char[] value) throws CFException {
		 setIp70701JobGrpNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip70701TipamrqEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip70701TipamrqKey.initialize();
     
          ip70701RequestData.initialize();
     
         setIp70701JobGrpId(CONSTANTS.SPACE_6);
                     setIp70701JobGrpNum(0);
   }

		public static int getIp70701TipamrqEntriesFieldLength() {
			return IP_70701_TIPAMRQ_ENTRIES_LENGTH;
		}

}
  
