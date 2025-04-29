package com.cloudframe.app.global.sharedvar;

/**
*  The class PtrIp280010Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ptrIp280010Group800")

public class PtrIp280010Group800 extends PtrIp280010Group800Serialized  implements InitializingBean {
   

						private char[] ptrIp280010800 = new char[8];
	
	/**
	* Constructor for PtrIp280010Group800
	**/
    public PtrIp280010Group800() {
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
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException{
     if (isPtrIp280010800Modified()) { 
        ptrIp280010800 = refreshPtrIp280010800();
     }
   		return ptrIp280010800;
   }

  
	/**
	*  set variable ptrIp280010800
	*  Corresponding COBOL Variable is 800-PTR-IP280010
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) {
      ptrIp280010800 = checkPtrIp280010800Constraints(value);
      serializePtrIp280010800(ptrIp280010800);
   } 

     /**
	 * 	Update PtrIp280010800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp280010800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp280010800,ptrIp280010800.length);
   	
   }
   
   public void setPtrIp280010800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp280010800,ptrIp280010800.length);
   	
   }
   
     /**
	 * 	Update PtrIp280010800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp280010800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp280010800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp280010800 with another Field
	 *	@param value
	 */
   public void setPtrIp280010800(Field source) {
       replace(source,0,source.length(),beginPtrIp280010800,PTR_IP_280010800_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp280010800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp280010800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp280010800,PTR_IP_280010800_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp280010800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp280010800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp280010800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPtrIp280010Group800FieldLength() {
			return PTR_IP_280010_GROUP_800_LENGTH;
		}

}
  
