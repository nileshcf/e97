package com.cloudframe.app.move0.dto;

/**
*  The class GrandParent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class GrandParent extends GrandParentSerialized {
   

								private char[] parent1 = Field.fillLowValue(10);
				private Parent2 parent2 = new Parent2();

								private char[] parent3 = Field.fillLowValue(10);

						private char[] parent4 = Field.fillLowValue(2);
				private Parent5 parent5 = new Parent5();
	
	/**
	* Constructor for GrandParent
	**/
    public GrandParent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			parent2.setParent(this,getStartOffset() + 10);
	       			parent5.setParent(this,getStartOffset() + 23);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parent1
	 *	@return parent1
	 */
   public char[] getParent1() throws CFException{
     if (isParent1Modified()) { 
        parent1 = refreshParent1();
     }
   		return parent1;
   }

  
	/**
	*  set variable parent1
	*  Corresponding COBOL Variable is WS-PARENT-1
	*  @param value
	**/
   public void setParent1(char[] value) {
      parent1 = checkParent1Constraints(value);
      serializeParent1(parent1);
   } 

     /**
	 * 	Update Parent1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParent1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParent1,parent1.length);
   	
   }
   
   public void setParent1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParent1,parent1.length);
   	
   }
   
     /**
	 * 	Update Parent1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parent1 with another Field
	 *	@param value
	 */
   public void setParent1(Field source) {
       replace(source,0,source.length(),beginParent1,PARENT_1_LEN);
   	
   }  
   
     /**
	 * 	Update Parent1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParent1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParent1,PARENT_1_LEN);
   	
   }
   
     /**
	 * 	Update Parent1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parent2
	 *	@return parent2
	 */   
	 public Parent2 getParent2() {
   	return parent2;
   }
   /**
	* 	Update Parent2 with the passed value
	*   Corresponding COBOL Variable is WS-PARENT-2
	*	@param value
	*/
   public void setParent2(char[] value) {
      parent2.setString(value); 
   }   
    
     /**
	 * 	Update Parent2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParent2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent2.begin,parent2.length());
   }
   
     /**
	 * 	Update Parent2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parent2 with another Field
	 *	@param value
	 */
   public void setParent2(Field source) {
   	replace(source,0,source.length(),parent2.begin,parent2.length());
   }  
   
     /**
	 * 	Update Parent2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParent2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent2.begin,parent2.length());
   }
   
     /**
	 * 	Update Parent2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parent3
	 *	@return parent3
	 */
   public char[] getParent3() throws CFException{
     if (isParent3Modified()) { 
        parent3 = refreshParent3();
     }
   		return parent3;
   }

  
	/**
	*  set variable parent3
	*  Corresponding COBOL Variable is WS-PARENT-3
	*  @param value
	**/
   public void setParent3(char[] value) {
      parent3 = checkParent3Constraints(value);
      serializeParent3(parent3);
   } 

     /**
	 * 	Update Parent3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParent3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParent3,parent3.length);
   	
   }
   
   public void setParent3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParent3,parent3.length);
   	
   }
   
     /**
	 * 	Update Parent3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parent3 with another Field
	 *	@param value
	 */
   public void setParent3(Field source) {
       replace(source,0,source.length(),beginParent3,PARENT_3_LEN);
   	
   }  
   
     /**
	 * 	Update Parent3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParent3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParent3,PARENT_3_LEN);
   	
   }
   
     /**
	 * 	Update Parent3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parent4
	 *	@return parent4
	 */
   public char[] getParent4() throws CFException{
     if (isParent4Modified()) { 
        parent4 = refreshParent4();
     }
   		return parent4;
   }

  
	/**
	*  set variable parent4
	*  Corresponding COBOL Variable is WS-PARENT-4
	*  @param value
	**/
   public void setParent4(char[] value) {
      parent4 = checkParent4Constraints(value);
      serializeParent4(parent4);
   } 

     /**
	 * 	Update Parent4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParent4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParent4,parent4.length);
   	
   }
   
   public void setParent4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParent4,parent4.length);
   	
   }
   
     /**
	 * 	Update Parent4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parent4 with another Field
	 *	@param value
	 */
   public void setParent4(Field source) {
       replace(source,0,source.length(),beginParent4,PARENT_4_LEN);
   	
   }  
   
     /**
	 * 	Update Parent4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParent4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParent4,PARENT_4_LEN);
   	
   }
   
     /**
	 * 	Update Parent4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parent5
	 *	@return parent5
	 */   
	 public Parent5 getParent5() {
   	return parent5;
   }
   /**
	* 	Update Parent5 with the passed value
	*   Corresponding COBOL Variable is WS-PARENT-5
	*	@param value
	*/
   public void setParent5(char[] value) {
      parent5.setString(value); 
   }   
    
     /**
	 * 	Update Parent5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParent5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent5.begin,parent5.length());
   }
   
     /**
	 * 	Update Parent5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parent5 with another Field
	 *	@param value
	 */
   public void setParent5(Field source) {
   	replace(source,0,source.length(),parent5.begin,parent5.length());
   }  
   
     /**
	 * 	Update Parent5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParent5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent5.begin,parent5.length());
   }
   
     /**
	 * 	Update Parent5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent5.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes GrandParent
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setParent1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
          parent2.initialize();
     
                    setParent3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
         setParent4(CONSTANTS.SPACE_2);
          parent5.initialize();
     
   }

		public static int getGrandParentFieldLength() {
			return GRAND_PARENT_LENGTH;
		}

}
  
