package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsItCallFromNspkGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301IsItCallFromNspkGroup extends Ip70301IsItCallFromNspkGroupSerialized { 
   

						private char[] ip70301IsItCallFromNspk = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsItCallFromNspkGroup
	**/
    public Ip70301IsItCallFromNspkGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301IsItCallFromNspk
	 *	@return ip70301IsItCallFromNspk
	 */
   public char[] getIp70301IsItCallFromNspk() throws CFException{
     if (isIp70301IsItCallFromNspkModified()) { 
        ip70301IsItCallFromNspk = refreshIp70301IsItCallFromNspk();
     }
   		return ip70301IsItCallFromNspk;
   }

  
	/**
	*  set variable ip70301IsItCallFromNspk
	*  Corresponding COBOL Variable is IP70301-IS-IT-CALL-FROM-NSPK
	*  @param value
	**/
   public void setIp70301IsItCallFromNspk(char[] value) {
      ip70301IsItCallFromNspk = checkIp70301IsItCallFromNspkConstraints(value);
      serializeIp70301IsItCallFromNspk(ip70301IsItCallFromNspk);
   } 

     /**
	 * 	Update Ip70301IsItCallFromNspk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsItCallFromNspk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsItCallFromNspk,ip70301IsItCallFromNspk.length);
   	
   }
   
   public void setIp70301IsItCallFromNspk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromNspk,ip70301IsItCallFromNspk.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsItCallFromNspk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsItCallFromNspk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromNspk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsItCallFromNspk with another Field
	 *	@param value
	 */
   public void setIp70301IsItCallFromNspk(Field source) {
       replace(source,0,source.length(),beginIp70301IsItCallFromNspk,IP_70301_IS_IT_CALL_FROM_NSPK_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsItCallFromNspk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsItCallFromNspk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromNspk,IP_70301_IS_IT_CALL_FROM_NSPK_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsItCallFromNspk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsItCallFromNspk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromNspk+targetIndex,targetLen);
    
   }
	char[] ip70301ItIsFromNspk8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301ItIsFromNspk88()
	 *	@return  Returns true if isIp70301ItIsFromNspk88() is "Y"
	 */
   public boolean isIp70301ItIsFromNspk88() throws CFException {
      return (  compareChars( getIp70301IsItCallFromNspk() , ip70301ItIsFromNspk8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301ItIsFromNspk88True() {  			
    	setIp70301IsItCallFromNspk( ip70301ItIsFromNspk8888Value);
   	}
	char[] ip70301ItIsNotFromNspk8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301ItIsNotFromNspk88()
	 *	@return  Returns true if isIp70301ItIsNotFromNspk88() is "N"
	 */
   public boolean isIp70301ItIsNotFromNspk88() throws CFException {
      return (  compareChars( getIp70301IsItCallFromNspk() , ip70301ItIsNotFromNspk8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301ItIsNotFromNspk88True() {  			
    	setIp70301IsItCallFromNspk( ip70301ItIsNotFromNspk8888Value);
   	}

	
	
	

		public static int getIp70301IsItCallFromNspkGroupFieldLength() {
			return IP_70301_IS_IT_CALL_FROM_NSPK_GROUP_LENGTH;
		}

}
  
