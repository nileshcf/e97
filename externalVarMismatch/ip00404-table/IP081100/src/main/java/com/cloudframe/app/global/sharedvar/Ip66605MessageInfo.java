package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66605MessageInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip66605MessageInfo")

public class Ip66605MessageInfo extends Ip66605MessageInfoSerialized  implements InitializingBean {
   

						private char[] ip66605WriteRecs = Field.fillLowValue(1);

						private char[] ip66605DoesTagTableExist = Field.fillLowValue(1);
				private Ip66605IpmFileInformation ip66605IpmFileInformation = new Ip66605IpmFileInformation();
	
	/**
	* Constructor for Ip66605MessageInfo
	**/
    public Ip66605MessageInfo() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip66605IpmFileInformation.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip66605WriteRecs
	 *	@return ip66605WriteRecs
	 */
   public char[] getIp66605WriteRecs() throws CFException{
     if (isIp66605WriteRecsModified()) { 
        ip66605WriteRecs = refreshIp66605WriteRecs();
     }
   		return ip66605WriteRecs;
   }

  
	/**
	*  set variable ip66605WriteRecs
	*  Corresponding COBOL Variable is IP66605-WRITE-RECS
	*  @param value
	**/
   public void setIp66605WriteRecs(char[] value) {
      ip66605WriteRecs = checkIp66605WriteRecsConstraints(value);
      serializeIp66605WriteRecs(ip66605WriteRecs);
   } 

     /**
	 * 	Update Ip66605WriteRecs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605WriteRecs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605WriteRecs,ip66605WriteRecs.length);
   	
   }
   
   public void setIp66605WriteRecs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteRecs,ip66605WriteRecs.length);
   	
   }
   
     /**
	 * 	Update Ip66605WriteRecs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605WriteRecs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteRecs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605WriteRecs with another Field
	 *	@param value
	 */
   public void setIp66605WriteRecs(Field source) {
       replace(source,0,source.length(),beginIp66605WriteRecs,IP_66605_WRITE_RECS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605WriteRecs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605WriteRecs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605WriteRecs,IP_66605_WRITE_RECS_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605WriteRecs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605WriteRecs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteRecs+targetIndex,targetLen);
    
   }
	char[] ip66605WriteSingleRec8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp66605WriteSingleRec88()
	 *	@return  Returns true if isIp66605WriteSingleRec88() is "S"
	 */
   public boolean isIp66605WriteSingleRec88() throws CFException {
      return (  compareChars( getIp66605WriteRecs() , ip66605WriteSingleRec8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp66605WriteSingleRec88True() {  			
    	setIp66605WriteRecs( ip66605WriteSingleRec8888Value);
   	}
	char[] ip66605WriteAllRec8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp66605WriteAllRec88()
	 *	@return  Returns true if isIp66605WriteAllRec88() is "A"
	 */
   public boolean isIp66605WriteAllRec88() throws CFException {
      return (  compareChars( getIp66605WriteRecs() , ip66605WriteAllRec8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp66605WriteAllRec88True() {  			
    	setIp66605WriteRecs( ip66605WriteAllRec8888Value);
   	}
	/**
	 *	Returns the value of ip66605DoesTagTableExist
	 *	@return ip66605DoesTagTableExist
	 */
   public char[] getIp66605DoesTagTableExist() throws CFException{
     if (isIp66605DoesTagTableExistModified()) { 
        ip66605DoesTagTableExist = refreshIp66605DoesTagTableExist();
     }
   		return ip66605DoesTagTableExist;
   }

  
	/**
	*  set variable ip66605DoesTagTableExist
	*  Corresponding COBOL Variable is IP66605-DOES-TAG-TABLE-EXIST
	*  @param value
	**/
   public void setIp66605DoesTagTableExist(char[] value) {
      ip66605DoesTagTableExist = checkIp66605DoesTagTableExistConstraints(value);
      serializeIp66605DoesTagTableExist(ip66605DoesTagTableExist);
   } 

     /**
	 * 	Update Ip66605DoesTagTableExist 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605DoesTagTableExist(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605DoesTagTableExist,ip66605DoesTagTableExist.length);
   	
   }
   
   public void setIp66605DoesTagTableExist(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoesTagTableExist,ip66605DoesTagTableExist.length);
   	
   }
   
     /**
	 * 	Update Ip66605DoesTagTableExist 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605DoesTagTableExist(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoesTagTableExist+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605DoesTagTableExist with another Field
	 *	@param value
	 */
   public void setIp66605DoesTagTableExist(Field source) {
       replace(source,0,source.length(),beginIp66605DoesTagTableExist,IP_66605_DOES_TAG_TABLE_EXIST_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605DoesTagTableExist 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605DoesTagTableExist(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605DoesTagTableExist,IP_66605_DOES_TAG_TABLE_EXIST_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605DoesTagTableExist 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605DoesTagTableExist(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoesTagTableExist+targetIndex,targetLen);
    
   }
	char[] ip66605TagTableExists88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp66605TagTableExists()
	 *	@return  Returns true if isIp66605TagTableExists() is "Y"
	 */
   public boolean isIp66605TagTableExists() throws CFException {
      return (  compareChars( getIp66605DoesTagTableExist() , ip66605TagTableExists88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp66605TagTableExistsTrue() {  			
    	setIp66605DoesTagTableExist( ip66605TagTableExists88Value);
   	}
	char[] ip66605ThereIsNoTagTable88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp66605ThereIsNoTagTable()
	 *	@return  Returns true if isIp66605ThereIsNoTagTable() is " "
	 */
   public boolean isIp66605ThereIsNoTagTable() throws CFException {
      return (  compareChars( getIp66605DoesTagTableExist() , ip66605ThereIsNoTagTable88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp66605ThereIsNoTagTableTrue() {  			
    	setIp66605DoesTagTableExist( ip66605ThereIsNoTagTable88Value);
   	}
	/**
	 *	Returns the value of ip66605IpmFileInformation
	 *	@return ip66605IpmFileInformation
	 */   
	 public Ip66605IpmFileInformation getIp66605IpmFileInformation() {
   	return ip66605IpmFileInformation;
   }
   /**
	* 	Update Ip66605IpmFileInformation with the passed value
	*   Corresponding COBOL Variable is IP66605-IPM-FILE-INFORMATION
	*	@param value
	*/
   public void setIp66605IpmFileInformation(char[] value) {
      ip66605IpmFileInformation.setString(value); 
   }   
    
     /**
	 * 	Update Ip66605IpmFileInformation 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66605IpmFileInformation(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66605IpmFileInformation.begin,ip66605IpmFileInformation.length());
   }
   
     /**
	 * 	Update Ip66605IpmFileInformation 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IpmFileInformation(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66605IpmFileInformation.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66605IpmFileInformation with another Field
	 *	@param value
	 */
   public void setIp66605IpmFileInformation(Field source) {
   	replace(source,0,source.length(),ip66605IpmFileInformation.begin,ip66605IpmFileInformation.length());
   }  
   
     /**
	 * 	Update Ip66605IpmFileInformation 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66605IpmFileInformation(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66605IpmFileInformation.begin,ip66605IpmFileInformation.length());
   }
   
     /**
	 * 	Update Ip66605IpmFileInformation 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IpmFileInformation(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66605IpmFileInformation.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip66605MessageInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66605WriteRecs(CONSTANTS.SPACE);
         setIp66605DoesTagTableExist(CONSTANTS.SPACE);
          ip66605IpmFileInformation.initialize();
     
   }

		public static int getIp66605MessageInfoFieldLength() {
			return IP_66605_MESSAGE_INFO_LENGTH;
		}

}
  
