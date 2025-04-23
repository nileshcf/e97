package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iAccountRangeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip0040iAccountRangeInfo")

public class Ip0040iAccountRangeInfo extends Ip0040iAccountRangeInfoSerialized  implements InitializingBean {
   
				private Ip0040iMpePeRecData ip0040iMpePeRecData = new Ip0040iMpePeRecData();
				private Ip0040iMpePeRecDataCs ip0040iMpePeRecDataCs = new Ip0040iMpePeRecDataCs();

						private char[] ip0040iFiller01 = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip0040iAccountRangeInfo
	**/
    public Ip0040iAccountRangeInfo() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip0040iMpePeRecData.setParent(this,getStartOffset() + 0);
	       			ip0040iMpePeRecDataCs.setParent(this,getStartOffset() + 25);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip0040iMpePeRecData
	 *	@return ip0040iMpePeRecData
	 */   
	 public Ip0040iMpePeRecData getIp0040iMpePeRecData() {
   	return ip0040iMpePeRecData;
   }
   /**
	* 	Update Ip0040iMpePeRecData with the passed value
	*   Corresponding COBOL Variable is IP0040I-MPE-PE-REC-DATA
	*	@param value
	*/
   public void setIp0040iMpePeRecData(char[] value) {
      ip0040iMpePeRecData.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iMpePeRecData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMpePeRecData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecData.begin,ip0040iMpePeRecData.length());
   }
   
     /**
	 * 	Update Ip0040iMpePeRecData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMpePeRecData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iMpePeRecData with another Field
	 *	@param value
	 */
   public void setIp0040iMpePeRecData(Field source) {
   	replace(source,0,source.length(),ip0040iMpePeRecData.begin,ip0040iMpePeRecData.length());
   }  
   
     /**
	 * 	Update Ip0040iMpePeRecData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMpePeRecData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecData.begin,ip0040iMpePeRecData.length());
   }
   
     /**
	 * 	Update Ip0040iMpePeRecData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMpePeRecData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iMpePeRecDataCs
	 *	@return ip0040iMpePeRecDataCs
	 */   
	 public Ip0040iMpePeRecDataCs getIp0040iMpePeRecDataCs() {
   	return ip0040iMpePeRecDataCs;
   }
   /**
	* 	Update Ip0040iMpePeRecDataCs with the passed value
	*   Corresponding COBOL Variable is IP0040I-MPE-PE-REC-DATA-CS
	*	@param value
	*/
   public void setIp0040iMpePeRecDataCs(char[] value) {
      ip0040iMpePeRecDataCs.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iMpePeRecDataCs 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMpePeRecDataCs(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecDataCs.begin,ip0040iMpePeRecDataCs.length());
   }
   
     /**
	 * 	Update Ip0040iMpePeRecDataCs 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMpePeRecDataCs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecDataCs.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iMpePeRecDataCs with another Field
	 *	@param value
	 */
   public void setIp0040iMpePeRecDataCs(Field source) {
   	replace(source,0,source.length(),ip0040iMpePeRecDataCs.begin,ip0040iMpePeRecDataCs.length());
   }  
   
     /**
	 * 	Update Ip0040iMpePeRecDataCs 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMpePeRecDataCs(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecDataCs.begin,ip0040iMpePeRecDataCs.length());
   }
   
     /**
	 * 	Update Ip0040iMpePeRecDataCs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMpePeRecDataCs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iMpePeRecDataCs.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iFiller01
	 *	@return ip0040iFiller01
	 */
   public char[] getIp0040iFiller01() throws CFException{
     if (isIp0040iFiller01Modified()) { 
        ip0040iFiller01 = refreshIp0040iFiller01();
     }
   		return ip0040iFiller01;
   }

  
	/**
	*  set variable ip0040iFiller01
	*  Corresponding COBOL Variable is IP0040I-FILLER
	*  @param value
	**/
   public void setIp0040iFiller01(char[] value) {
      ip0040iFiller01 = checkIp0040iFiller01Constraints(value);
      serializeIp0040iFiller01(ip0040iFiller01);
   } 

     /**
	 * 	Update Ip0040iFiller01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFiller01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iFiller01,ip0040iFiller01.length);
   	
   }
   
   public void setIp0040iFiller01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller01,ip0040iFiller01.length);
   	
   }
   
     /**
	 * 	Update Ip0040iFiller01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFiller01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iFiller01 with another Field
	 *	@param value
	 */
   public void setIp0040iFiller01(Field source) {
       replace(source,0,source.length(),beginIp0040iFiller01,IP_0040I_FILLER_01_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iFiller01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iFiller01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iFiller01,IP_0040I_FILLER_01_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iFiller01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFiller01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller01+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040iAccountRangeInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip0040iMpePeRecData.initialize();
     
          ip0040iMpePeRecDataCs.initialize();
     
         setIp0040iFiller01(CONSTANTS.SPACE_2);
   }

		public static int getIp0040iAccountRangeInfoFieldLength() {
			return IP_0040I_ACCOUNT_RANGE_INFO_LENGTH;
		}

}
  
