package com.cloudframe.app.global.sharedvar;

/**
*  The class PtrSi994010Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ptrSi994010Group800")

public class PtrSi994010Group800 extends PtrSi994010Group800Serialized  implements InitializingBean {
   

						private char[] ptrSi994010800 = new char[8];
	
	/**
	* Constructor for PtrSi994010Group800
	**/
    public PtrSi994010Group800() {
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
	 *	Returns the value of ptrSi994010800
	 *	@return ptrSi994010800
	 */
   public char[] getPtrSi994010800() throws CFException{
     if (isPtrSi994010800Modified()) { 
        ptrSi994010800 = refreshPtrSi994010800();
     }
   		return ptrSi994010800;
   }

  
	/**
	*  set variable ptrSi994010800
	*  Corresponding COBOL Variable is 800-PTR-SI994010
	*  @param value
	**/
   public void setPtrSi994010800(char[] value) {
      ptrSi994010800 = checkPtrSi994010800Constraints(value);
      serializePtrSi994010800(ptrSi994010800);
   } 

     /**
	 * 	Update PtrSi994010800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrSi994010800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrSi994010800,ptrSi994010800.length);
   	
   }
   
   public void setPtrSi994010800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSi994010800,ptrSi994010800.length);
   	
   }
   
     /**
	 * 	Update PtrSi994010800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrSi994010800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSi994010800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrSi994010800 with another Field
	 *	@param value
	 */
   public void setPtrSi994010800(Field source) {
       replace(source,0,source.length(),beginPtrSi994010800,PTR_SI_994010800_LEN);
   	
   }  
   
     /**
	 * 	Update PtrSi994010800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrSi994010800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrSi994010800,PTR_SI_994010800_LEN);
   	
   }
   
     /**
	 * 	Update PtrSi994010800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrSi994010800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSi994010800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPtrSi994010Group800FieldLength() {
			return PTR_SI_994010_GROUP_800_LENGTH;
		}

}
  
