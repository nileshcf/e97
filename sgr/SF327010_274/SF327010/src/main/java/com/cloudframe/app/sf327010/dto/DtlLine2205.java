package com.cloudframe.app.sf327010.dto;

/**
*  The class DtlLine2205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtlLine2205 extends DtlLine2205Serialized {
   


						private char[] serviceName205 = new char[55];

	
	/**
	* Constructor for DtlLine2205
	**/
    public DtlLine2205() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 0
             ,9
             );
								setServiceName205(fillSpace(55));
       replaceValue( // serialize and save the value
             pad(69," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 64
             ,69
             );
    }


 

	/**
	 *	Returns the value of serviceName205
	 *	@return serviceName205
	 */
   public char[] getServiceName205() throws CFException{
     if (isServiceName205Modified()) { 
        serviceName205 = refreshServiceName205();
     }
   		return serviceName205;
   }

  
	/**
	*  set variable serviceName205
	*  Corresponding COBOL Variable is 205-SERVICE-NAME
	*  @param value
	**/
   public void setServiceName205(char[] value) {
      serviceName205 = checkServiceName205Constraints(value);
      serializeServiceName205(serviceName205);
   } 

     /**
	 * 	Update ServiceName205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceName205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginServiceName205,serviceName205.length);
   	
   }
   
   public void setServiceName205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName205,serviceName205.length);
   	
   }
   
     /**
	 * 	Update ServiceName205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceName205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ServiceName205 with another Field
	 *	@param value
	 */
   public void setServiceName205(Field source) {
       replace(source,0,source.length(),beginServiceName205,SERVICE_NAME_205_LEN);
   	
   }  
   
     /**
	 * 	Update ServiceName205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceName205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginServiceName205,SERVICE_NAME_205_LEN);
   	
   }
   
     /**
	 * 	Update ServiceName205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceName205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName205+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtlLine2205FieldLength() {
			return DTL_LINE_2205_LENGTH;
		}

}
  
