package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iReadTableIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50004iReadTableIdGroup")

public class Ip50004iReadTableIdGroup extends Ip50004iReadTableIdGroupSerialized  implements InitializingBean {
   

						private char[] ip50004iReadTableId = Field.fillLowValue(8);
					private Ip50004iReadTableIdRedefined ip50004iReadTableIdRedefined = new Ip50004iReadTableIdRedefined();
	
	/**
	* Constructor for Ip50004iReadTableIdGroup
	**/
    public Ip50004iReadTableIdGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50004iReadTableIdRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50004iReadTableId
	 *	@return ip50004iReadTableId
	 */
   public char[] getIp50004iReadTableId() throws CFException{
     if (isIp50004iReadTableIdModified()) { 
        ip50004iReadTableId = refreshIp50004iReadTableId();
     }
   		return ip50004iReadTableId;
   }

  
	/**
	*  set variable ip50004iReadTableId
	*  Corresponding COBOL Variable is IP50004I-READ-TABLE-ID
	*  @param value
	**/
   public void setIp50004iReadTableId(char[] value) {
      ip50004iReadTableId = checkIp50004iReadTableIdConstraints(value);
      serializeIp50004iReadTableId(ip50004iReadTableId);
   } 

     /**
	 * 	Update Ip50004iReadTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iReadTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iReadTableId,ip50004iReadTableId.length);
   	
   }
   
   public void setIp50004iReadTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iReadTableId,ip50004iReadTableId.length);
   	
   }
   
     /**
	 * 	Update Ip50004iReadTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iReadTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iReadTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iReadTableId with another Field
	 *	@param value
	 */
   public void setIp50004iReadTableId(Field source) {
       replace(source,0,source.length(),beginIp50004iReadTableId,IP_50004I_READ_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iReadTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iReadTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iReadTableId,IP_50004I_READ_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iReadTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iReadTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iReadTableId+targetIndex,targetLen);
    
   }
	char[] ip50004iCloseIndicator8888Value = "99999999".toCharArray();
	/**
	 *	Test condition "99999999" for isIp50004iCloseIndicator88()
	 *	@return  Returns true if isIp50004iCloseIndicator88() is "99999999"
	 */
   public boolean isIp50004iCloseIndicator88() throws CFException {
      return (  compareChars( getIp50004iReadTableId() , ip50004iCloseIndicator8888Value)  == 0  );
   }


	/**
	*  set values "99999999"
	*/
   	public void setIp50004iCloseIndicator88True() {  			
    	setIp50004iReadTableId( ip50004iCloseIndicator8888Value);
   	}
	/**
	 *	Returns the value of ip50004iReadTableIdRedefined
	 *	@return ip50004iReadTableIdRedefined
	 */   
	 public Ip50004iReadTableIdRedefined getIp50004iReadTableIdRedefined() {
   	return ip50004iReadTableIdRedefined;
   }
   /**
	* 	Update Ip50004iReadTableIdRedefined with the passed value
	*   Corresponding COBOL Variable is IP50004I-READ-TABLE-ID-REDEFINED
	*	@param value
	*/
   public void setIp50004iReadTableIdRedefined(char[] value) {
      ip50004iReadTableIdRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip50004iReadTableIdRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50004iReadTableIdRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iReadTableIdRedefined.begin,ip50004iReadTableIdRedefined.length());
   }
   
     /**
	 * 	Update Ip50004iReadTableIdRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iReadTableIdRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iReadTableIdRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50004iReadTableIdRedefined with another Field
	 *	@param value
	 */
   public void setIp50004iReadTableIdRedefined(Field source) {
   	replace(source,0,source.length(),ip50004iReadTableIdRedefined.begin,ip50004iReadTableIdRedefined.length());
   }  
   
     /**
	 * 	Update Ip50004iReadTableIdRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50004iReadTableIdRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iReadTableIdRedefined.begin,ip50004iReadTableIdRedefined.length());
   }
   
     /**
	 * 	Update Ip50004iReadTableIdRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iReadTableIdRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iReadTableIdRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp50004iReadTableIdGroupFieldLength() {
			return IP_50004I_READ_TABLE_ID_GROUP_LENGTH;
		}

}
  
