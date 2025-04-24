package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckFirstPutPimGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class CheckFirstPutPimGroup100 extends CheckFirstPutPimGroup100Serialized { 
   

						private char[] checkFirstPutPim100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckFirstPutPimGroup100
	**/
    public CheckFirstPutPimGroup100() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of checkFirstPutPim100
	 *	@return checkFirstPutPim100
	 */
   public char[] getCheckFirstPutPim100() throws CFException{
     if (isCheckFirstPutPim100Modified()) { 
        checkFirstPutPim100 = refreshCheckFirstPutPim100();
     }
   		return checkFirstPutPim100;
   }

  
	/**
	*  set variable checkFirstPutPim100
	*  Corresponding COBOL Variable is 100-CHECK-FIRST-PUT-PIM
	*  @param value
	**/
   public void setCheckFirstPutPim100(char[] value) {
      checkFirstPutPim100 = checkCheckFirstPutPim100Constraints(value);
      serializeCheckFirstPutPim100(checkFirstPutPim100);
   } 

     /**
	 * 	Update CheckFirstPutPim100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCheckFirstPutPim100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCheckFirstPutPim100,checkFirstPutPim100.length);
   	
   }
   
   public void setCheckFirstPutPim100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstPutPim100,checkFirstPutPim100.length);
   	
   }
   
     /**
	 * 	Update CheckFirstPutPim100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCheckFirstPutPim100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstPutPim100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CheckFirstPutPim100 with another Field
	 *	@param value
	 */
   public void setCheckFirstPutPim100(Field source) {
       replace(source,0,source.length(),beginCheckFirstPutPim100,CHECK_FIRST_PUT_PIM_100_LEN);
   	
   }  
   
     /**
	 * 	Update CheckFirstPutPim100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCheckFirstPutPim100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCheckFirstPutPim100,CHECK_FIRST_PUT_PIM_100_LEN);
   	
   }
   
     /**
	 * 	Update CheckFirstPutPim100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCheckFirstPutPim100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckFirstPutPim100+targetIndex,targetLen);
    
   }
	char[] firstPutPim8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstPutPim88100()
	 *	@return  Returns true if isFirstPutPim88100() is "Y"
	 */
   public boolean isFirstPutPim88100() throws CFException {
      return (  compareChars( getCheckFirstPutPim100() , firstPutPim8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstPutPim88100True() {  			
    	setCheckFirstPutPim100( firstPutPim8810088Value);
   	}
	char[] notFirstPutPim8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotFirstPutPim88100()
	 *	@return  Returns true if isNotFirstPutPim88100() is "N"
	 */
   public boolean isNotFirstPutPim88100() throws CFException {
      return (  compareChars( getCheckFirstPutPim100() , notFirstPutPim8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotFirstPutPim88100True() {  			
    	setCheckFirstPutPim100( notFirstPutPim8810088Value);
   	}

	
	
	

		public static int getCheckFirstPutPimGroup100FieldLength() {
			return CHECK_FIRST_PUT_PIM_GROUP_100_LENGTH;
		}

}
  
