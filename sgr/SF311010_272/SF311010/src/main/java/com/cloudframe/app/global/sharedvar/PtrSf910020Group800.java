package com.cloudframe.app.global.sharedvar;

/**
*  The class PtrSf910020Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ptrSf910020Group800")

public class PtrSf910020Group800 extends PtrSf910020Group800Serialized  implements InitializingBean {
   

						private char[] ptrSf910020800 = new char[8];
	
	/**
	* Constructor for PtrSf910020Group800
	**/
    public PtrSf910020Group800() {
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
	 *	Returns the value of ptrSf910020800
	 *	@return ptrSf910020800
	 */
   public char[] getPtrSf910020800() throws CFException{
     if (isPtrSf910020800Modified()) { 
        ptrSf910020800 = refreshPtrSf910020800();
     }
   		return ptrSf910020800;
   }

  
	/**
	*  set variable ptrSf910020800
	*  Corresponding COBOL Variable is 800-PTR-SF910020
	*  @param value
	**/
   public void setPtrSf910020800(char[] value) {
      ptrSf910020800 = checkPtrSf910020800Constraints(value);
      serializePtrSf910020800(ptrSf910020800);
   } 

     /**
	 * 	Update PtrSf910020800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrSf910020800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrSf910020800,ptrSf910020800.length);
   	
   }
   
   public void setPtrSf910020800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSf910020800,ptrSf910020800.length);
   	
   }
   
     /**
	 * 	Update PtrSf910020800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrSf910020800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSf910020800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrSf910020800 with another Field
	 *	@param value
	 */
   public void setPtrSf910020800(Field source) {
       replace(source,0,source.length(),beginPtrSf910020800,PTR_SF_910020800_LEN);
   	
   }  
   
     /**
	 * 	Update PtrSf910020800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrSf910020800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrSf910020800,PTR_SF_910020800_LEN);
   	
   }
   
     /**
	 * 	Update PtrSf910020800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrSf910020800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrSf910020800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPtrSf910020Group800FieldLength() {
			return PTR_SF_910020_GROUP_800_LENGTH;
		}

}
  
