package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckFirstGetPimGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_checkFirstGetPimGroup100")

public class CheckFirstGetPimGroup100 extends CheckFirstGetPimGroup100Serialized  implements InitializingBean {
   

						private char[] checkFirstGetPim100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckFirstGetPimGroup100
	**/
    public CheckFirstGetPimGroup100() {
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
	 *	Returns the value of checkFirstGetPim100
	 *	@return checkFirstGetPim100
	 */
   public char[] getCheckFirstGetPim100() throws CFException{
     if (isCheckFirstGetPim100Modified()) { 
        checkFirstGetPim100 = refreshCheckFirstGetPim100();
     }
   		return checkFirstGetPim100;
   }

  
	/**
	*  set variable checkFirstGetPim100
	*  Corresponding COBOL Variable is 100-CHECK-FIRST-GET-PIM
	*  @param value
	**/
   public void setCheckFirstGetPim100(char[] value) {
      checkFirstGetPim100 = checkCheckFirstGetPim100Constraints(value);
      serializeCheckFirstGetPim100(checkFirstGetPim100);
   } 

     /**
	 * 	Update CheckFirstGetPim100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCheckFirstGetPim100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCheckFirstGetPim100,checkFirstGetPim100.length);
   	
   }
   
   public void setCheckFirstGetPim100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstGetPim100,checkFirstGetPim100.length);
   	
   }
   
     /**
	 * 	Update CheckFirstGetPim100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCheckFirstGetPim100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstGetPim100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CheckFirstGetPim100 with another Field
	 *	@param value
	 */
   public void setCheckFirstGetPim100(Field source) {
       replace(source,0,source.length(),beginCheckFirstGetPim100,CHECK_FIRST_GET_PIM_100_LEN);
   	
   }  
   
     /**
	 * 	Update CheckFirstGetPim100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCheckFirstGetPim100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCheckFirstGetPim100,CHECK_FIRST_GET_PIM_100_LEN);
   	
   }
   
     /**
	 * 	Update CheckFirstGetPim100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCheckFirstGetPim100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstGetPim100+targetIndex,targetLen);
    
   }
	char[] firstGetPim8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstGetPim88100()
	 *	@return  Returns true if isFirstGetPim88100() is "Y"
	 */
   public boolean isFirstGetPim88100() throws CFException {
      return (  compareChars( getCheckFirstGetPim100() , firstGetPim8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstGetPim88100True() {  			
    	setCheckFirstGetPim100( firstGetPim8810088Value);
   	}
	char[] notFirstGetPim8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotFirstGetPim88100()
	 *	@return  Returns true if isNotFirstGetPim88100() is "N"
	 */
   public boolean isNotFirstGetPim88100() throws CFException {
      return (  compareChars( getCheckFirstGetPim100() , notFirstGetPim8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotFirstGetPim88100True() {  			
    	setCheckFirstGetPim100( notFirstGetPim8810088Value);
   	}

	
	
	

		public static int getCheckFirstGetPimGroup100FieldLength() {
			return CHECK_FIRST_GET_PIM_GROUP_100_LENGTH;
		}

}
  
