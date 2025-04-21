package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00754TableEntry")

public class Ip00754TableEntry extends Ip00754TableEntrySerialized  implements InitializingBean {
   
				private Ip00754MccValsKey ip00754MccValsKey = new Ip00754MccValsKey();

						private char[] ip00754MccValsInetGrpCd = Field.fillLowValue(1);

						private char[] ip00754MccStatus = Field.fillLowValue(1);
			private List<Ip00754CabProgramTbl> ip00754CabProgramTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00754TableEntry
	**/
    public Ip00754TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00754MccValsKey.setParent(this,getStartOffset() + 0);
				for (int arrayIndex = 0; arrayIndex < IP_00754_CAB_PROGRAM_TBL_SIZE;arrayIndex++) {
						ip00754CabProgramTbl.add(new Ip00754CabProgramTbl(this, beginIp00754CabProgramTbl + 
						arrayIndex * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00754MccValsKey
	 *	@return ip00754MccValsKey
	 */   
	 public Ip00754MccValsKey getIp00754MccValsKey() {
   	return ip00754MccValsKey;
   }
   /**
	* 	Update Ip00754MccValsKey with the passed value
	*   Corresponding COBOL Variable is IP00754-MCC-VALS-KEY
	*	@param value
	*/
   public void setIp00754MccValsKey(char[] value) {
      ip00754MccValsKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip00754MccValsKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00754MccValsKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00754MccValsKey.begin,ip00754MccValsKey.length());
   }
   
     /**
	 * 	Update Ip00754MccValsKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccValsKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00754MccValsKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00754MccValsKey with another Field
	 *	@param value
	 */
   public void setIp00754MccValsKey(Field source) {
   	replace(source,0,source.length(),ip00754MccValsKey.begin,ip00754MccValsKey.length());
   }  
   
     /**
	 * 	Update Ip00754MccValsKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00754MccValsKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00754MccValsKey.begin,ip00754MccValsKey.length());
   }
   
     /**
	 * 	Update Ip00754MccValsKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccValsKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00754MccValsKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00754MccValsInetGrpCd
	 *	@return ip00754MccValsInetGrpCd
	 */
   public char[] getIp00754MccValsInetGrpCd() throws CFException{
     if (isIp00754MccValsInetGrpCdModified()) { 
        ip00754MccValsInetGrpCd = refreshIp00754MccValsInetGrpCd();
     }
   		return ip00754MccValsInetGrpCd;
   }

  
	/**
	*  set variable ip00754MccValsInetGrpCd
	*  Corresponding COBOL Variable is IP00754-MCC-VALS-INET-GRP-CD
	*  @param value
	**/
   public void setIp00754MccValsInetGrpCd(char[] value) {
      ip00754MccValsInetGrpCd = checkIp00754MccValsInetGrpCdConstraints(value);
      serializeIp00754MccValsInetGrpCd(ip00754MccValsInetGrpCd);
   } 

     /**
	 * 	Update Ip00754MccValsInetGrpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754MccValsInetGrpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754MccValsInetGrpCd,ip00754MccValsInetGrpCd.length);
   	
   }
   
   public void setIp00754MccValsInetGrpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccValsInetGrpCd,ip00754MccValsInetGrpCd.length);
   	
   }
   
     /**
	 * 	Update Ip00754MccValsInetGrpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccValsInetGrpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccValsInetGrpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754MccValsInetGrpCd with another Field
	 *	@param value
	 */
   public void setIp00754MccValsInetGrpCd(Field source) {
       replace(source,0,source.length(),beginIp00754MccValsInetGrpCd,IP_00754_MCC_VALS_INET_GRP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754MccValsInetGrpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754MccValsInetGrpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754MccValsInetGrpCd,IP_00754_MCC_VALS_INET_GRP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754MccValsInetGrpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccValsInetGrpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccValsInetGrpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00754MccStatus
	 *	@return ip00754MccStatus
	 */
   public char[] getIp00754MccStatus() throws CFException{
     if (isIp00754MccStatusModified()) { 
        ip00754MccStatus = refreshIp00754MccStatus();
     }
   		return ip00754MccStatus;
   }

  
	/**
	*  set variable ip00754MccStatus
	*  Corresponding COBOL Variable is IP00754-MCC-STATUS
	*  @param value
	**/
   public void setIp00754MccStatus(char[] value) {
      ip00754MccStatus = checkIp00754MccStatusConstraints(value);
      serializeIp00754MccStatus(ip00754MccStatus);
   } 

     /**
	 * 	Update Ip00754MccStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754MccStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754MccStatus,ip00754MccStatus.length);
   	
   }
   
   public void setIp00754MccStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccStatus,ip00754MccStatus.length);
   	
   }
   
     /**
	 * 	Update Ip00754MccStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754MccStatus with another Field
	 *	@param value
	 */
   public void setIp00754MccStatus(Field source) {
       replace(source,0,source.length(),beginIp00754MccStatus,IP_00754_MCC_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754MccStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754MccStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754MccStatus,IP_00754_MCC_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754MccStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754MccStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754MccStatus+targetIndex,targetLen);
    
   }
	char[] ip00754MccStatusActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp00754MccStatusActive88()
	 *	@return  Returns true if isIp00754MccStatusActive88() is "A"
	 */
   public boolean isIp00754MccStatusActive88() throws CFException {
      return (  compareChars( getIp00754MccStatus() , ip00754MccStatusActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp00754MccStatusActive88True() {  			
    	setIp00754MccStatus( ip00754MccStatusActive8888Value);
   	}
	char[] ip00754MccStatusObsolt8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp00754MccStatusObsolt88()
	 *	@return  Returns true if isIp00754MccStatusObsolt88() is "L"
	 */
   public boolean isIp00754MccStatusObsolt88() throws CFException {
      return (  compareChars( getIp00754MccStatus() , ip00754MccStatusObsolt8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp00754MccStatusObsolt88True() {  			
    	setIp00754MccStatus( ip00754MccStatusObsolt8888Value);
   	}
	/**
	 *	Returns the  value of ip00754CabProgramTbl
	 *  Corresponding COBOL Variable is IP00754-CAB-PROGRAM-TBL
	 *	@return ip00754CabProgramTbl
	 */
   public List<Ip00754CabProgramTbl> getIp00754CabProgramTbl() {
       return ip00754CabProgramTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00754CabProgramTbl
	 */
	public Ip00754CabProgramTbl getIp00754CabProgramTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00754CabProgramTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00754_CAB_PROGRAM_TBL_SIZE) {
             	index = IP_00754_CAB_PROGRAM_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("ip00754CabProgramTbl - Array index exceeded max Size {}, resetting it to max allowed",IP_00754_CAB_PROGRAM_TBL_SIZE); 
	    }
		if (index >= ip00754CabProgramTbl.size()) {
       		for (int fillIndex =  ip00754CabProgramTbl.size() -1; fillIndex < index;fillIndex++) {
		       ip00754CabProgramTbl.add(null);
		    }
			ip00754CabProgramTbl.set(index,
			   	   	new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength()) 
				                        ); 	
		} 
   	   Ip00754CabProgramTbl value = ip00754CabProgramTbl.get(index);
   	   if (value == null) {
   	      ip00754CabProgramTbl.set(index,
			   	   	new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength()) 
				                        ); 
		  value = ip00754CabProgramTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00754CabProgramTbl at index with the passed value
	 *  Corresponding COBOL Variable is IP00754-CAB-PROGRAM-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIp00754CabProgramTbl(int index,char[] value) {
   	getIp00754CabProgramTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip00754TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00754MccValsKey.initialize();
     
         setIp00754MccValsInetGrpCd(CONSTANTS.SPACE);
         setIp00754MccStatus(CONSTANTS.SPACE);
     if (ip00754CabProgramTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
              Ip00754CabProgramTbl  newElement = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
              newElement.initialize();
               ip00754CabProgramTbl.add(newElement);
          }
     } else {
        if (ip00754CabProgramTbl.size() < IP_00754_CAB_PROGRAM_TBL_SIZE) {
          // prefill it first
          for (int index = ip00754CabProgramTbl.size();index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
              Ip00754CabProgramTbl  newElement = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
               ip00754CabProgramTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
     		Ip00754CabProgramTbl ip00754CabProgramTblVar = ip00754CabProgramTbl.get(index);
 			if (ip00754CabProgramTblVar == null) {
                ip00754CabProgramTblVar = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
                  ip00754CabProgramTbl.set(index, ip00754CabProgramTblVar);
			} 
			ip00754CabProgramTblVar.initialize();
		}
     }
   }

		public static int getIp00754TableEntryFieldLength() {
			return IP_00754_TABLE_ENTRY_LENGTH;
		}

}
  
