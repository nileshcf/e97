package com.cloudframe.app.ip606130.dto;

/**
*  The class TotalDefaultsMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class TotalDefaultsMsg600 extends TotalDefaultsMsg600Serialized {
   


								private char[] defaultsBuild600 = new char[11];
							
	
	/**
	* Constructor for TotalDefaultsMsg600
	**/
    public TotalDefaultsMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TOTAL NO. OF DEFAULTS CREATED              :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setDefaultsBuild600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of defaultsBuild600
	 *	@return defaultsBuild600
	 */
   public char[] getDefaultsBuild600() throws CFException{
     if (isDefaultsBuild600Modified()) { 
        defaultsBuild600 = refreshDefaultsBuild600();
     }
   		return defaultsBuild600;
   }

  
	/**
	*  set variable defaultsBuild600
	*  Corresponding COBOL Variable is 600-DEFAULTS-BUILD
	*  @param value
	**/
   public void setDefaultsBuild600(char[] value) {
      defaultsBuild600 = checkDefaultsBuild600Constraints(value);
      serializeDefaultsBuild600(defaultsBuild600);
   } 

     /**
	 * 	Update DefaultsBuild600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDefaultsBuild600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDefaultsBuild600,defaultsBuild600.length);
   	
   }
   
   public void setDefaultsBuild600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDefaultsBuild600,defaultsBuild600.length);
   	
   }
   
     /**
	 * 	Update DefaultsBuild600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDefaultsBuild600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDefaultsBuild600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DefaultsBuild600 with another Field
	 *	@param value
	 */
   public void setDefaultsBuild600(Field source) {
       replace(source,0,source.length(),beginDefaultsBuild600,DEFAULTS_BUILD_600_LEN);
   	
   }  
   
     /**
	 * 	Update DefaultsBuild600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDefaultsBuild600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDefaultsBuild600,DEFAULTS_BUILD_600_LEN);
   	
   }
   
     /**
	 * 	Update DefaultsBuild600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDefaultsBuild600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDefaultsBuild600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotalDefaultsMsg600FieldLength() {
			return TOTAL_DEFAULTS_MSG_600_LENGTH;
		}

}
  
