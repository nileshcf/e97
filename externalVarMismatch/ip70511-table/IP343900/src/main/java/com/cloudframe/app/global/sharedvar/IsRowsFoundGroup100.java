package com.cloudframe.app.global.sharedvar;

/**
*  The class IsRowsFoundGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_isRowsFoundGroup100")

public class IsRowsFoundGroup100 extends IsRowsFoundGroup100Serialized  implements InitializingBean {
   

						private char[] isRowsFound100 = Field.fillLowValue(1);
	
	/**
	* Constructor for IsRowsFoundGroup100
	**/
    public IsRowsFoundGroup100() {
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
	 *	Returns the value of isRowsFound100
	 *	@return isRowsFound100
	 */
   public char[] getIsRowsFound100() throws CFException{
     if (isIsRowsFound100Modified()) { 
        isRowsFound100 = refreshIsRowsFound100();
     }
   		return isRowsFound100;
   }

  
	/**
	*  set variable isRowsFound100
	*  Corresponding COBOL Variable is 100-IS-ROWS-FOUND
	*  @param value
	**/
   public void setIsRowsFound100(char[] value) {
      isRowsFound100 = checkIsRowsFound100Constraints(value);
      serializeIsRowsFound100(isRowsFound100);
   } 

     /**
	 * 	Update IsRowsFound100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsRowsFound100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsRowsFound100,isRowsFound100.length);
   	
   }
   
   public void setIsRowsFound100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsRowsFound100,isRowsFound100.length);
   	
   }
   
     /**
	 * 	Update IsRowsFound100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsRowsFound100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsRowsFound100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsRowsFound100 with another Field
	 *	@param value
	 */
   public void setIsRowsFound100(Field source) {
       replace(source,0,source.length(),beginIsRowsFound100,IS_ROWS_FOUND_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsRowsFound100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsRowsFound100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsRowsFound100,IS_ROWS_FOUND_100_LEN);
   	
   }
   
     /**
	 * 	Update IsRowsFound100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsRowsFound100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsRowsFound100+targetIndex,targetLen);
    
   }
	char[] rowsFoundR8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRowsFoundR88100()
	 *	@return  Returns true if isRowsFoundR88100() is "Y"
	 */
   public boolean isRowsFoundR88100() throws CFException {
      return (  compareChars( getIsRowsFound100() , rowsFoundR8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRowsFoundR88100True() {  			
    	setIsRowsFound100( rowsFoundR8810088Value);
   	}
	char[] rowsNotFndR8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRowsNotFndR88100()
	 *	@return  Returns true if isRowsNotFndR88100() is "N"
	 */
   public boolean isRowsNotFndR88100() throws CFException {
      return (  compareChars( getIsRowsFound100() , rowsNotFndR8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRowsNotFndR88100True() {  			
    	setIsRowsFound100( rowsNotFndR8810088Value);
   	}

	
	
	

		public static int getIsRowsFoundGroup100FieldLength() {
			return IS_ROWS_FOUND_GROUP_100_LENGTH;
		}

}
  
