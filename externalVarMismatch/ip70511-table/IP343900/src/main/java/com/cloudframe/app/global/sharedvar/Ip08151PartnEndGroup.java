package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08151PartnEndGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip08151PartnEndGroup extends Ip08151PartnEndGroupSerialized { 
   

						private char[] ip08151PartnEnd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip08151PartnEndGroup
	**/
    public Ip08151PartnEndGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip08151PartnEnd
	 *	@return ip08151PartnEnd
	 */
   public char[] getIp08151PartnEnd() throws CFException{
     if (isIp08151PartnEndModified()) { 
        ip08151PartnEnd = refreshIp08151PartnEnd();
     }
   		return ip08151PartnEnd;
   }

  
	/**
	*  set variable ip08151PartnEnd
	*  Corresponding COBOL Variable is IP08151-PARTN-END
	*  @param value
	**/
   public void setIp08151PartnEnd(char[] value) {
      ip08151PartnEnd = checkIp08151PartnEndConstraints(value);
      serializeIp08151PartnEnd(ip08151PartnEnd);
   } 

     /**
	 * 	Update Ip08151PartnEnd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151PartnEnd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08151PartnEnd,ip08151PartnEnd.length);
   	
   }
   
   public void setIp08151PartnEnd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnEnd,ip08151PartnEnd.length);
   	
   }
   
     /**
	 * 	Update Ip08151PartnEnd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PartnEnd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnEnd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08151PartnEnd with another Field
	 *	@param value
	 */
   public void setIp08151PartnEnd(Field source) {
       replace(source,0,source.length(),beginIp08151PartnEnd,IP_08151_PARTN_END_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08151PartnEnd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151PartnEnd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08151PartnEnd,IP_08151_PARTN_END_LEN);
   	
   }
   
     /**
	 * 	Update Ip08151PartnEnd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PartnEnd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnEnd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp08151PartnEndGroupFieldLength() {
			return IP_08151_PARTN_END_GROUP_LENGTH;
		}

}
  
