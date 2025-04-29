package com.cloudframe.app.bm8090m.dto;

/**
*  The class Pe8090p is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Pe8090p extends Pe8090pSerialized { 
   
			private List<Pe8090r> pe8090r = new ArrayList<>();
    	

						private char[] pe00tc00 = Field.fillLowValue(100);

						private char[] pe00tc01 = Field.fillLowValue(60);

						private char[] pe00tc02 = Field.fillLowValue(60);
	
	/**
	* Constructor for Pe8090p
	**/
    public Pe8090p() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pe8090p. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090p(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of pe8090r
	 *  Corresponding COBOL Variable is PE8090R
	 *	@return pe8090r
	 */
   public List<Pe8090r> getPe8090r() {
       return pe8090r;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return pe8090r
	 */
	public Pe8090r getPe8090r(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getPe8090r(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PE_8090R_SIZE) {
             	index = PE_8090R_SIZE -1; // can't exceed max array size
             	logger.trace("pe8090r - Array index exceeded max Size {}, resetting it to max allowed",PE_8090R_SIZE); 
	    }
		if (index >= pe8090r.size()) {
       		for (int fillIndex =  pe8090r.size() -1; fillIndex < index;fillIndex++) {
		       pe8090r.add(null);
		    }
			pe8090r.set(index,
			   	   	new Pe8090r(this,beginPe8090r + index * Pe8090r.getPe8090rFieldLength()) 
				                        ); 	
		} 
   	   Pe8090r value = pe8090r.get(index);
   	   if (value == null) {
   	      pe8090r.set(index,
			   	   	new Pe8090r(this,beginPe8090r + index * Pe8090r.getPe8090rFieldLength()) 
				                        ); 
		  value = pe8090r.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Pe8090r at index with the passed value
	 *  Corresponding COBOL Variable is PE8090R
	 *  @param index
	 *	@param value
	 */
  public void setPe8090r(int index,char[] value) {
   	getPe8090r(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of pe00tc00
	 *	@return pe00tc00
	 */
   public char[] getPe00tc00() throws CFException{
     if (isPe00tc00Modified()) { 
        pe00tc00 = refreshPe00tc00();
     }
   		return pe00tc00;
   }

  
	/**
	*  set variable pe00tc00
	*  Corresponding COBOL Variable is PE00TC00
	*  @param value
	**/
   public void setPe00tc00(char[] value) {
      pe00tc00 = checkPe00tc00Constraints(value);
      serializePe00tc00(pe00tc00);
   } 

     /**
	 * 	Update Pe00tc00 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc00(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPe00tc00,pe00tc00.length);
   	
   }
   
   public void setPe00tc00(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc00,pe00tc00.length);
   	
   }
   
     /**
	 * 	Update Pe00tc00 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc00(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc00+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pe00tc00 with another Field
	 *	@param value
	 */
   public void setPe00tc00(Field source) {
       replace(source,0,source.length(),beginPe00tc00,PE_00TC_00_LEN);
   	
   }  
   
     /**
	 * 	Update Pe00tc00 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc00(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPe00tc00,PE_00TC_00_LEN);
   	
   }
   
     /**
	 * 	Update Pe00tc00 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc00(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc00+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pe00tc01
	 *	@return pe00tc01
	 */
   public char[] getPe00tc01() throws CFException{
     if (isPe00tc01Modified()) { 
        pe00tc01 = refreshPe00tc01();
     }
   		return pe00tc01;
   }

  
	/**
	*  set variable pe00tc01
	*  Corresponding COBOL Variable is PE00TC01
	*  @param value
	**/
   public void setPe00tc01(char[] value) {
      pe00tc01 = checkPe00tc01Constraints(value);
      serializePe00tc01(pe00tc01);
   } 

     /**
	 * 	Update Pe00tc01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPe00tc01,pe00tc01.length);
   	
   }
   
   public void setPe00tc01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc01,pe00tc01.length);
   	
   }
   
     /**
	 * 	Update Pe00tc01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pe00tc01 with another Field
	 *	@param value
	 */
   public void setPe00tc01(Field source) {
       replace(source,0,source.length(),beginPe00tc01,PE_00TC_01_LEN);
   	
   }  
   
     /**
	 * 	Update Pe00tc01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPe00tc01,PE_00TC_01_LEN);
   	
   }
   
     /**
	 * 	Update Pe00tc01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pe00tc02
	 *	@return pe00tc02
	 */
   public char[] getPe00tc02() throws CFException{
     if (isPe00tc02Modified()) { 
        pe00tc02 = refreshPe00tc02();
     }
   		return pe00tc02;
   }

  
	/**
	*  set variable pe00tc02
	*  Corresponding COBOL Variable is PE00TC02
	*  @param value
	**/
   public void setPe00tc02(char[] value) {
      pe00tc02 = checkPe00tc02Constraints(value);
      serializePe00tc02(pe00tc02);
   } 

     /**
	 * 	Update Pe00tc02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPe00tc02,pe00tc02.length);
   	
   }
   
   public void setPe00tc02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc02,pe00tc02.length);
   	
   }
   
     /**
	 * 	Update Pe00tc02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pe00tc02 with another Field
	 *	@param value
	 */
   public void setPe00tc02(Field source) {
       replace(source,0,source.length(),beginPe00tc02,PE_00TC_02_LEN);
   	
   }  
   
     /**
	 * 	Update Pe00tc02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPe00tc02,PE_00TC_02_LEN);
   	
   }
   
     /**
	 * 	Update Pe00tc02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPe00tc02+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPe8090pFieldLength() {
			return PE_8090P_LENGTH;
		}

}
  
