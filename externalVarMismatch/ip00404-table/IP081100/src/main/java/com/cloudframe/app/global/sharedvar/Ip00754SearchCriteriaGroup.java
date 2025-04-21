package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754SearchCriteriaGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00754SearchCriteriaGroup")

public class Ip00754SearchCriteriaGroup extends Ip00754SearchCriteriaGroupSerialized  implements InitializingBean {
   

						private char[] ip00754SearchCriteria = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00754SearchCriteriaGroup
	**/
    public Ip00754SearchCriteriaGroup() {
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
	 *	Returns the value of ip00754SearchCriteria
	 *	@return ip00754SearchCriteria
	 */
   public char[] getIp00754SearchCriteria() throws CFException{
     if (isIp00754SearchCriteriaModified()) { 
        ip00754SearchCriteria = refreshIp00754SearchCriteria();
     }
   		return ip00754SearchCriteria;
   }

  
	/**
	*  set variable ip00754SearchCriteria
	*  Corresponding COBOL Variable is IP00754-SEARCH-CRITERIA
	*  @param value
	**/
   public void setIp00754SearchCriteria(char[] value) {
      ip00754SearchCriteria = checkIp00754SearchCriteriaConstraints(value);
      serializeIp00754SearchCriteria(ip00754SearchCriteria);
   } 

     /**
	 * 	Update Ip00754SearchCriteria 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754SearchCriteria(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754SearchCriteria,ip00754SearchCriteria.length);
   	
   }
   
   public void setIp00754SearchCriteria(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754SearchCriteria,ip00754SearchCriteria.length);
   	
   }
   
     /**
	 * 	Update Ip00754SearchCriteria 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754SearchCriteria(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754SearchCriteria+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754SearchCriteria with another Field
	 *	@param value
	 */
   public void setIp00754SearchCriteria(Field source) {
       replace(source,0,source.length(),beginIp00754SearchCriteria,IP_00754_SEARCH_CRITERIA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754SearchCriteria 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754SearchCriteria(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754SearchCriteria,IP_00754_SEARCH_CRITERIA_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754SearchCriteria 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754SearchCriteria(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754SearchCriteria+targetIndex,targetLen);
    
   }
	char[] ip00754SearchBothRecMz8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00754SearchBothRecMz88()
	 *	@return  Returns true if isIp00754SearchBothRecMz88() is "Y"
	 */
   public boolean isIp00754SearchBothRecMz88() throws CFException {
      return (  compareChars( getIp00754SearchCriteria() , ip00754SearchBothRecMz8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00754SearchBothRecMz88True() {  			
    	setIp00754SearchCriteria( ip00754SearchBothRecMz8888Value);
   	}
	char[] ip00754SearchOnlyRecM8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00754SearchOnlyRecM88()
	 *	@return  Returns true if isIp00754SearchOnlyRecM88() is "N"
	 */
   public boolean isIp00754SearchOnlyRecM88() throws CFException {
      return (  compareChars( getIp00754SearchCriteria() , ip00754SearchOnlyRecM8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00754SearchOnlyRecM88True() {  			
    	setIp00754SearchCriteria( ip00754SearchOnlyRecM8888Value);
   	}

	
	
	

		public static int getIp00754SearchCriteriaGroupFieldLength() {
			return IP_00754_SEARCH_CRITERIA_GROUP_LENGTH;
		}

}
  
