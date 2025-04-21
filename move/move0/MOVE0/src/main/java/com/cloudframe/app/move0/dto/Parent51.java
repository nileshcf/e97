package com.cloudframe.app.move0.dto;

/**
*  The class Parent51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class Parent51 extends Parent51Serialized { 
   


								private char[] child3 = Field.fillLowValue(2);

								private char[] child4 = Field.fillLowValue(4);
	
	/**
	* Constructor for Parent51
	**/
    public Parent51() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parent51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of child3
	 *	@return child3
	 */
   public char[] getChild3() throws CFException{
     if (isChild3Modified()) { 
        child3 = refreshChild3();
     }
   		return child3;
   }

  
	/**
	*  set variable child3
	*  Corresponding COBOL Variable is WS-CHILD-3
	*  @param value
	**/
   public void setChild3(char[] value) {
      child3 = checkChild3Constraints(value);
      serializeChild3(child3);
   } 

     /**
	 * 	Update Child3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChild3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChild3,child3.length);
   	
   }
   
   public void setChild3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChild3,child3.length);
   	
   }
   
     /**
	 * 	Update Child3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChild3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Child3 with another Field
	 *	@param value
	 */
   public void setChild3(Field source) {
       replace(source,0,source.length(),beginChild3,CHILD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Child3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChild3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChild3,CHILD_3_LEN);
   	
   }
   
     /**
	 * 	Update Child3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChild3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild3+targetIndex,targetLen);
    
   }
	char[] child3188Value1 = "11".toCharArray();
char[] child3188Value2 = "12".toCharArray();

	/**
	 *	Test condition "11" "12" for isChild31()
	 *	@return  Returns true if isChild31() is "11" "12"
	 */
   public boolean isChild31() throws CFException {
      return (  compareChars( getChild3() , child3188Value1)  == 0  ||  compareChars( getChild3() , child3188Value2)  == 0  );
   }


	/**
	*  set values "11" "12"
	*/
   	public void setChild31True() {  			
    	setChild3( child3188Value1);
   	}
	char[] child3288Value1 = "23".toCharArray();
char[] child3288Value2 = "24".toCharArray();

	/**
	 *	Test condition "23" "24" for isChild32()
	 *	@return  Returns true if isChild32() is "23" "24"
	 */
   public boolean isChild32() throws CFException {
      return (  compareChars( getChild3() , child3288Value1)  == 0  ||  compareChars( getChild3() , child3288Value2)  == 0  );
   }


	/**
	*  set values "23" "24"
	*/
   	public void setChild32True() {  			
    	setChild3( child3288Value1);
   	}
	char[] child3Lv88Value = "0 ".toCharArray();
	/**
	 *	Test condition "0" for isChild3Lv()
	 *	@return  Returns true if isChild3Lv() is "0"
	 */
   public boolean isChild3Lv() throws CFException {
      return (  compareChars( getChild3() , child3Lv88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setChild3LvTrue() {  			
    	setChild3( child3Lv88Value);
   	}
	
	/**
	 *	Test condition "10" THRU "25" for isChild3Valid()
	 *	@return  Returns true if isChild3Valid() is "10" THRU "25"
	 */
   public boolean isChild3Valid() throws CFException {
      return (  isGreaterOrEqual(getChild3(), "10" ) &&  isLessOrEqual(getChild3(),"25" )  );
   }


	/**
	*  set values "10" THRU "25"
	*/
   	public void setChild3ValidTrue() {  			
    	setChild3( "10".toCharArray());
   	}
	/**
	 *	Returns the value of child4
	 *	@return child4
	 */
   public char[] getChild4() throws CFException{
     if (isChild4Modified()) { 
        child4 = refreshChild4();
     }
   		return child4;
   }

  
	/**
	*  set variable child4
	*  Corresponding COBOL Variable is WS-CHILD-4
	*  @param value
	**/
   public void setChild4(char[] value) {
      child4 = checkChild4Constraints(value);
      serializeChild4(child4);
   } 

     /**
	 * 	Update Child4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChild4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChild4,child4.length);
   	
   }
   
   public void setChild4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChild4,child4.length);
   	
   }
   
     /**
	 * 	Update Child4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChild4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Child4 with another Field
	 *	@param value
	 */
   public void setChild4(Field source) {
       replace(source,0,source.length(),beginChild4,CHILD_4_LEN);
   	
   }  
   
     /**
	 * 	Update Child4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChild4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChild4,CHILD_4_LEN);
   	
   }
   
     /**
	 * 	Update Child4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChild4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChild4+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Parent51
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setChild3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1057940,"0".toCharArray()));
                    setChild4(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1007746112,"0".toCharArray()));
   }

		public static int getParent51FieldLength() {
			return PARENT_51_LENGTH;
		}

}
  
