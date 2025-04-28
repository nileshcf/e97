package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50921Variables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50921Variables")

public class Ip50921Variables extends Ip50921VariablesSerialized  implements InitializingBean {
   

						private char[] ip50921CurrentTs = Field.fillLowValue(26);

						private char[] ip50921Filler1 = Field.fillLowValue(54);
	
	/**
	* Constructor for Ip50921Variables
	**/
    public Ip50921Variables() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50921CurrentTs
	 *	@return ip50921CurrentTs
	 */
   public char[] getIp50921CurrentTs() throws CFException{
     if (isIp50921CurrentTsModified()) { 
        ip50921CurrentTs = refreshIp50921CurrentTs();
     }
   		return ip50921CurrentTs;
   }

  
	/**
	*  set variable ip50921CurrentTs
	*  Corresponding COBOL Variable is IP50921-CURRENT-TS
	*  @param value
	**/
   public void setIp50921CurrentTs(char[] value) {
      ip50921CurrentTs = checkIp50921CurrentTsConstraints(value);
      serializeIp50921CurrentTs(ip50921CurrentTs);
   } 

     /**
	 * 	Update Ip50921CurrentTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50921CurrentTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50921CurrentTs,ip50921CurrentTs.length);
   	
   }
   
   public void setIp50921CurrentTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921CurrentTs,ip50921CurrentTs.length);
   	
   }
   
     /**
	 * 	Update Ip50921CurrentTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50921CurrentTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921CurrentTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50921CurrentTs with another Field
	 *	@param value
	 */
   public void setIp50921CurrentTs(Field source) {
       replace(source,0,source.length(),beginIp50921CurrentTs,IP_50921_CURRENT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50921CurrentTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50921CurrentTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50921CurrentTs,IP_50921_CURRENT_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip50921CurrentTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50921CurrentTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921CurrentTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50921Filler1
	 *	@return ip50921Filler1
	 */
   public char[] getIp50921Filler1() throws CFException{
     if (isIp50921Filler1Modified()) { 
        ip50921Filler1 = refreshIp50921Filler1();
     }
   		return ip50921Filler1;
   }

  
	/**
	*  set variable ip50921Filler1
	*  Corresponding COBOL Variable is IP50921-FILLER1
	*  @param value
	**/
   public void setIp50921Filler1(char[] value) {
      ip50921Filler1 = checkIp50921Filler1Constraints(value);
      serializeIp50921Filler1(ip50921Filler1);
   } 

     /**
	 * 	Update Ip50921Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50921Filler1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50921Filler1,ip50921Filler1.length);
   	
   }
   
   public void setIp50921Filler1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921Filler1,ip50921Filler1.length);
   	
   }
   
     /**
	 * 	Update Ip50921Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50921Filler1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921Filler1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50921Filler1 with another Field
	 *	@param value
	 */
   public void setIp50921Filler1(Field source) {
       replace(source,0,source.length(),beginIp50921Filler1,IP_50921_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50921Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50921Filler1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50921Filler1,IP_50921_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip50921Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50921Filler1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50921Filler1+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50921Variables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50921CurrentTs(CONSTANTS.SPACE_26);
         setIp50921Filler1(CONSTANTS.SPACE_54);
   }

		public static int getIp50921VariablesFieldLength() {
			return IP_50921_VARIABLES_LENGTH;
		}

}
  
