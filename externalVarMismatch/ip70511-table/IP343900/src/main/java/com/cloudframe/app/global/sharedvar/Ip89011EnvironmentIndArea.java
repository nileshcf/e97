package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip89011EnvironmentIndArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip89011EnvironmentIndArea")

public class Ip89011EnvironmentIndArea extends Ip89011EnvironmentIndAreaSerialized  implements InitializingBean {
   


						private char[] ip89011Environment = Field.fillLowValue(3);


							private char[] ip89011EnvironmentIndAreaConditionGroup3 = fillLowValue(1);

	
	/**
	* Constructor for Ip89011EnvironmentIndArea
	**/
    public Ip89011EnvironmentIndArea() {
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
	 *	Returns the value of ip89011Environment
	 *	@return ip89011Environment
	 */
   public char[] getIp89011Environment() throws CFException{
     if (isIp89011EnvironmentModified()) { 
        ip89011Environment = refreshIp89011Environment();
     }
   		return ip89011Environment;
   }

  
	/**
	*  set variable ip89011Environment
	*  Corresponding COBOL Variable is IP89011-ENVIRONMENT
	*  @param value
	**/
   public void setIp89011Environment(char[] value) {
      ip89011Environment = checkIp89011EnvironmentConstraints(value);
      serializeIp89011Environment(ip89011Environment);
   } 

     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp89011Environment,ip89011Environment.length);
   	
   }
   
   public void setIp89011Environment(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011Environment,ip89011Environment.length);
   	
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011Environment+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip89011Environment with another Field
	 *	@param value
	 */
   public void setIp89011Environment(Field source) {
       replace(source,0,source.length(),beginIp89011Environment,IP_89011_ENVIRONMENT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp89011Environment,IP_89011_ENVIRONMENT_LEN);
   	
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011Environment+targetIndex,targetLen);
    
   }
	char[] ip89011TestEnv8888Value1 = "TST".toCharArray();
char[] ip89011TestEnv8888Value2 = "PTF".toCharArray();

	/**
	 *	Test condition "TST" "PTF" for isIp89011TestEnv88()
	 *	@return  Returns true if isIp89011TestEnv88() is "TST" "PTF"
	 */
   public boolean isIp89011TestEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011TestEnv8888Value1)  == 0  ||  compareChars( getIp89011Environment() , ip89011TestEnv8888Value2)  == 0  );
   }


	/**
	*  set values "TST" "PTF"
	*/
   	public void setIp89011TestEnv88True() {  			
    	setIp89011Environment( ip89011TestEnv8888Value1);
   	}
	char[] ip89011DtfEnv8888Value = "DTF".toCharArray();
	/**
	 *	Test condition "DTF" for isIp89011DtfEnv88()
	 *	@return  Returns true if isIp89011DtfEnv88() is "DTF"
	 */
   public boolean isIp89011DtfEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011DtfEnv8888Value)  == 0  );
   }


	/**
	*  set values "DTF"
	*/
   	public void setIp89011DtfEnv88True() {  			
    	setIp89011Environment( ip89011DtfEnv8888Value);
   	}
	char[] ip89011ItfEnv8888Value = "ITF".toCharArray();
	/**
	 *	Test condition "ITF" for isIp89011ItfEnv88()
	 *	@return  Returns true if isIp89011ItfEnv88() is "ITF"
	 */
   public boolean isIp89011ItfEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011ItfEnv8888Value)  == 0  );
   }


	/**
	*  set values "ITF"
	*/
   	public void setIp89011ItfEnv88True() {  			
    	setIp89011Environment( ip89011ItfEnv8888Value);
   	}
	char[] ip89011MtfEnv8888Value = "YTF".toCharArray();
	/**
	 *	Test condition "YTF" for isIp89011MtfEnv88()
	 *	@return  Returns true if isIp89011MtfEnv88() is "YTF"
	 */
   public boolean isIp89011MtfEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011MtfEnv8888Value)  == 0  );
   }


	/**
	*  set values "YTF"
	*/
   	public void setIp89011MtfEnv88True() {  			
    	setIp89011Environment( ip89011MtfEnv8888Value);
   	}
	char[] ip89011ProdEnv8888Value = "MCI".toCharArray();
	/**
	 *	Test condition "MCI" for isIp89011ProdEnv88()
	 *	@return  Returns true if isIp89011ProdEnv88() is "MCI"
	 */
   public boolean isIp89011ProdEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011ProdEnv8888Value)  == 0  );
   }


	/**
	*  set values "MCI"
	*/
   	public void setIp89011ProdEnv88True() {  			
    	setIp89011Environment( ip89011ProdEnv8888Value);
   	}
	char[] ip89011ZtfEnv8888Value = "ZTF".toCharArray();
	/**
	 *	Test condition "ZTF" for isIp89011ZtfEnv88()
	 *	@return  Returns true if isIp89011ZtfEnv88() is "ZTF"
	 */
   public boolean isIp89011ZtfEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011ZtfEnv8888Value)  == 0  );
   }


	/**
	*  set values "ZTF"
	*/
   	public void setIp89011ZtfEnv88True() {  			
    	setIp89011Environment( ip89011ZtfEnv8888Value);
   	}
	char[] ip89011FtfEnv8888Value = "FTF".toCharArray();
	/**
	 *	Test condition "FTF" for isIp89011FtfEnv88()
	 *	@return  Returns true if isIp89011FtfEnv88() is "FTF"
	 */
   public boolean isIp89011FtfEnv88() throws CFException {
      return (  compareChars( getIp89011Environment() , ip89011FtfEnv8888Value)  == 0  );
   }


	/**
	*  set values "FTF"
	*/
   	public void setIp89011FtfEnv88True() {  			
    	setIp89011Environment( ip89011FtfEnv8888Value);
   	}
	static java.util.Set<String> ip89011ValidEnv8888Value = new java.util.HashSet<>();
static { 
	ip89011ValidEnv8888Value.add( "TST");
	ip89011ValidEnv8888Value.add( "DTF");
	ip89011ValidEnv8888Value.add( "ITF");
	ip89011ValidEnv8888Value.add( "YTF");
	ip89011ValidEnv8888Value.add( "MCI");
	ip89011ValidEnv8888Value.add( "ZTF");
	ip89011ValidEnv8888Value.add( "FTF");
} 

	/**
	 *	Test condition "TST" "DTF" "ITF" "YTF" "MCI" "ZTF" "FTF" for isIp89011ValidEnv88()
	 *	@return  Returns true if isIp89011ValidEnv88() is "TST" "DTF" "ITF" "YTF" "MCI" "ZTF" "FTF"
	 */
   public boolean isIp89011ValidEnv88() throws CFException {
      return   ip89011ValidEnv8888Value.contains(String.valueOf(getIp89011Environment()));
   }


	/**
	*  set values "TST" "DTF" "ITF" "YTF" "MCI" "ZTF" "FTF"
	*/
   	public void setIp89011ValidEnv88True() {  			
    	  setIp89011Environment(ip89011ValidEnv8888Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of ip89011EnvironmentIndAreaConditionGroup3
	 *	@return ip89011EnvironmentIndAreaConditionGroup3
	 */
   public char[] getIp89011EnvironmentIndAreaConditionGroup3() throws CFException{
     if (isIp89011EnvironmentIndAreaConditionGroup3Modified()) { 
        ip89011EnvironmentIndAreaConditionGroup3 = refreshIp89011EnvironmentIndAreaConditionGroup3();
     }
   		return ip89011EnvironmentIndAreaConditionGroup3;
   }

  
	/**
	*  set variable ip89011EnvironmentIndAreaConditionGroup3
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setIp89011EnvironmentIndAreaConditionGroup3(char[] value) {
      ip89011EnvironmentIndAreaConditionGroup3 = checkIp89011EnvironmentIndAreaConditionGroup3Constraints(value);
      serializeIp89011EnvironmentIndAreaConditionGroup3(ip89011EnvironmentIndAreaConditionGroup3);
   } 

     /**
	 * 	Update Ip89011EnvironmentIndAreaConditionGroup3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp89011EnvironmentIndAreaConditionGroup3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp89011EnvironmentIndAreaConditionGroup3,ip89011EnvironmentIndAreaConditionGroup3.length);
   	
   }
   
   public void setIp89011EnvironmentIndAreaConditionGroup3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011EnvironmentIndAreaConditionGroup3,ip89011EnvironmentIndAreaConditionGroup3.length);
   	
   }
   
     /**
	 * 	Update Ip89011EnvironmentIndAreaConditionGroup3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp89011EnvironmentIndAreaConditionGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011EnvironmentIndAreaConditionGroup3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip89011EnvironmentIndAreaConditionGroup3 with another Field
	 *	@param value
	 */
   public void setIp89011EnvironmentIndAreaConditionGroup3(Field source) {
       replace(source,0,source.length(),beginIp89011EnvironmentIndAreaConditionGroup3,IP_89011_ENVIRONMENT_IND_AREA_CONDITION_GROUP_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ip89011EnvironmentIndAreaConditionGroup3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp89011EnvironmentIndAreaConditionGroup3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp89011EnvironmentIndAreaConditionGroup3,IP_89011_ENVIRONMENT_IND_AREA_CONDITION_GROUP_3_LEN);
   	
   }
   
     /**
	 * 	Update Ip89011EnvironmentIndAreaConditionGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp89011EnvironmentIndAreaConditionGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp89011EnvironmentIndAreaConditionGroup3+targetIndex,targetLen);
    
   }
	char[] ip89011DontSendToGft8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp89011DontSendToGft88()
	 *	@return  Returns true if isIp89011DontSendToGft88() is "Y"
	 */
   public boolean isIp89011DontSendToGft88() throws CFException {
      return (  compareChars( getIp89011EnvironmentIndAreaConditionGroup3() , ip89011DontSendToGft8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp89011DontSendToGft88True() {  			
    	setIp89011EnvironmentIndAreaConditionGroup3( ip89011DontSendToGft8888Value);
   	}
	char[] ip89011ValidGftControl8888Value1 = "Y".toCharArray();
char[] ip89011ValidGftControl8888Value2 = "N".toCharArray();

	/**
	 *	Test condition "Y" "N" for isIp89011ValidGftControl88()
	 *	@return  Returns true if isIp89011ValidGftControl88() is "Y" "N"
	 */
   public boolean isIp89011ValidGftControl88() throws CFException {
      return (  compareChars( getIp89011EnvironmentIndAreaConditionGroup3() , ip89011ValidGftControl8888Value1)  == 0  ||  compareChars( getIp89011EnvironmentIndAreaConditionGroup3() , ip89011ValidGftControl8888Value2)  == 0  );
   }


	/**
	*  set values "Y" "N"
	*/
   	public void setIp89011ValidGftControl88True() {  			
    	setIp89011EnvironmentIndAreaConditionGroup3( ip89011ValidGftControl8888Value1);
   	}

	
	
	
	/**
	 * 	initializes Ip89011EnvironmentIndArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp89011Environment(CONSTANTS.SPACE_3);
   }

		public static int getIp89011EnvironmentIndAreaFieldLength() {
			return IP_89011_ENVIRONMENT_IND_AREA_LENGTH;
		}

}
  
