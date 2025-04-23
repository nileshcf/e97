package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041ReadTableIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip500041ReadTableIdGroup")

public class Ip500041ReadTableIdGroup extends Ip500041ReadTableIdGroupSerialized  implements InitializingBean {
   

						private char[] ip500041ReadTableId = Field.fillLowValue(8);
					private Ip500041ReadTableIdRedefined ip500041ReadTableIdRedefined = new Ip500041ReadTableIdRedefined();
	
	/**
	* Constructor for Ip500041ReadTableIdGroup
	**/
    public Ip500041ReadTableIdGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip500041ReadTableIdRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip500041ReadTableId
	 *	@return ip500041ReadTableId
	 */
   public char[] getIp500041ReadTableId() throws CFException{
     if (isIp500041ReadTableIdModified()) { 
        ip500041ReadTableId = refreshIp500041ReadTableId();
     }
   		return ip500041ReadTableId;
   }

  
	/**
	*  set variable ip500041ReadTableId
	*  Corresponding COBOL Variable is IP500041-READ-TABLE-ID
	*  @param value
	**/
   public void setIp500041ReadTableId(char[] value) {
      ip500041ReadTableId = checkIp500041ReadTableIdConstraints(value);
      serializeIp500041ReadTableId(ip500041ReadTableId);
   } 

     /**
	 * 	Update Ip500041ReadTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041ReadTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041ReadTableId,ip500041ReadTableId.length);
   	
   }
   
   public void setIp500041ReadTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041ReadTableId,ip500041ReadTableId.length);
   	
   }
   
     /**
	 * 	Update Ip500041ReadTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041ReadTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041ReadTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041ReadTableId with another Field
	 *	@param value
	 */
   public void setIp500041ReadTableId(Field source) {
       replace(source,0,source.length(),beginIp500041ReadTableId,IP_500041_READ_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041ReadTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041ReadTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041ReadTableId,IP_500041_READ_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041ReadTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041ReadTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041ReadTableId+targetIndex,targetLen);
    
   }
	char[] ip500041CloseIndicator8888Value = "99999999".toCharArray();
	/**
	 *	Test condition "99999999" for isIp500041CloseIndicator88()
	 *	@return  Returns true if isIp500041CloseIndicator88() is "99999999"
	 */
   public boolean isIp500041CloseIndicator88() throws CFException {
      return (  compareChars( getIp500041ReadTableId() , ip500041CloseIndicator8888Value)  == 0  );
   }


	/**
	*  set values "99999999"
	*/
   	public void setIp500041CloseIndicator88True() {  			
    	setIp500041ReadTableId( ip500041CloseIndicator8888Value);
   	}
	/**
	 *	Returns the value of ip500041ReadTableIdRedefined
	 *	@return ip500041ReadTableIdRedefined
	 */   
	 public Ip500041ReadTableIdRedefined getIp500041ReadTableIdRedefined() {
   	return ip500041ReadTableIdRedefined;
   }
   /**
	* 	Update Ip500041ReadTableIdRedefined with the passed value
	*   Corresponding COBOL Variable is IP500041-READ-TABLE-ID-REDEFINED
	*	@param value
	*/
   public void setIp500041ReadTableIdRedefined(char[] value) {
      ip500041ReadTableIdRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip500041ReadTableIdRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp500041ReadTableIdRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041ReadTableIdRedefined.begin,ip500041ReadTableIdRedefined.length());
   }
   
     /**
	 * 	Update Ip500041ReadTableIdRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041ReadTableIdRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041ReadTableIdRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip500041ReadTableIdRedefined with another Field
	 *	@param value
	 */
   public void setIp500041ReadTableIdRedefined(Field source) {
   	replace(source,0,source.length(),ip500041ReadTableIdRedefined.begin,ip500041ReadTableIdRedefined.length());
   }  
   
     /**
	 * 	Update Ip500041ReadTableIdRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp500041ReadTableIdRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041ReadTableIdRedefined.begin,ip500041ReadTableIdRedefined.length());
   }
   
     /**
	 * 	Update Ip500041ReadTableIdRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041ReadTableIdRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041ReadTableIdRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp500041ReadTableIdGroupFieldLength() {
			return IP_500041_READ_TABLE_ID_GROUP_LENGTH;
		}

}
  
