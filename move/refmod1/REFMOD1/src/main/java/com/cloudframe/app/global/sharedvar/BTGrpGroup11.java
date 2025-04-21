package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup11")

public class BTGrpGroup11 extends BTGrpGroup11Serialized  implements InitializingBean {
   
					private BTGrp11 bTGrp11 = new BTGrp11();

						private char[] bTGrpR11 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup11
	**/
    public BTGrpGroup11() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp11.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp11
	 *	@return bTGrp11
	 */   
	 public BTGrp11 getBTGrp11() {
   	return bTGrp11;
   }
   /**
	* 	Update BTGrp11 with the passed value
	*   Corresponding COBOL Variable is WS-11B-T-GRP
	*	@param value
	*/
   public void setBTGrp11(char[] value) {
      bTGrp11.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp11 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp11(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp11.begin,bTGrp11.length());
   }
   
     /**
	 * 	Update BTGrp11 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp11.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp11 with another Field
	 *	@param value
	 */
   public void setBTGrp11(Field source) {
   	replace(source,0,source.length(),bTGrp11.begin,bTGrp11.length());
   }  
   
     /**
	 * 	Update BTGrp11 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp11(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp11.begin,bTGrp11.length());
   }
   
     /**
	 * 	Update BTGrp11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp11.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR11
	 *	@return bTGrpR11
	 */
   public char[] getBTGrpR11() throws CFException{
     if (isBTGrpR11Modified()) { 
        bTGrpR11 = refreshBTGrpR11();
     }
   		return bTGrpR11;
   }

  
	/**
	*  set variable bTGrpR11
	*  Corresponding COBOL Variable is WS-11B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR11(char[] value) {
      bTGrpR11 = checkBTGrpR11Constraints(value);
      serializeBTGrpR11(bTGrpR11);
   } 

     /**
	 * 	Update BTGrpR11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR11,bTGrpR11.length);
   	
   }
   
   public void setBTGrpR11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR11,bTGrpR11.length);
   	
   }
   
     /**
	 * 	Update BTGrpR11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR11 with another Field
	 *	@param value
	 */
   public void setBTGrpR11(Field source) {
       replace(source,0,source.length(),beginBTGrpR11,B_TGRP_R_11_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR11,B_TGRP_R_11_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR11+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup11FieldLength() {
			return B_TGRP_GROUP_11_LENGTH;
		}

}
  
