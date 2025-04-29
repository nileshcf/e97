package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup18")

public class BTGrpGroup18 extends BTGrpGroup18Serialized  implements InitializingBean {
   
					private BTGrp18 bTGrp18 = new BTGrp18();

						private char[] bTGrpR18 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup18
	**/
    public BTGrpGroup18() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp18.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp18
	 *	@return bTGrp18
	 */   
	 public BTGrp18 getBTGrp18() {
   	return bTGrp18;
   }
   /**
	* 	Update BTGrp18 with the passed value
	*   Corresponding COBOL Variable is WS-18B-T-GRP
	*	@param value
	*/
   public void setBTGrp18(char[] value) {
      bTGrp18.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp18 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp18(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp18.begin,bTGrp18.length());
   }
   
     /**
	 * 	Update BTGrp18 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp18.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp18 with another Field
	 *	@param value
	 */
   public void setBTGrp18(Field source) {
   	replace(source,0,source.length(),bTGrp18.begin,bTGrp18.length());
   }  
   
     /**
	 * 	Update BTGrp18 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp18(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp18.begin,bTGrp18.length());
   }
   
     /**
	 * 	Update BTGrp18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp18.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR18
	 *	@return bTGrpR18
	 */
   public char[] getBTGrpR18() throws CFException{
     if (isBTGrpR18Modified()) { 
        bTGrpR18 = refreshBTGrpR18();
     }
   		return bTGrpR18;
   }

  
	/**
	*  set variable bTGrpR18
	*  Corresponding COBOL Variable is WS-18B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR18(char[] value) {
      bTGrpR18 = checkBTGrpR18Constraints(value);
      serializeBTGrpR18(bTGrpR18);
   } 

     /**
	 * 	Update BTGrpR18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR18,bTGrpR18.length);
   	
   }
   
   public void setBTGrpR18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR18,bTGrpR18.length);
   	
   }
   
     /**
	 * 	Update BTGrpR18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR18 with another Field
	 *	@param value
	 */
   public void setBTGrpR18(Field source) {
       replace(source,0,source.length(),beginBTGrpR18,B_TGRP_R_18_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR18,B_TGRP_R_18_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR18+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup18FieldLength() {
			return B_TGRP_GROUP_18_LENGTH;
		}

}
  
