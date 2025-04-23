package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup17")

public class BTGrpGroup17 extends BTGrpGroup17Serialized  implements InitializingBean {
   
					private BTGrp17 bTGrp17 = new BTGrp17();

						private char[] bTGrpR17 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup17
	**/
    public BTGrpGroup17() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp17.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp17
	 *	@return bTGrp17
	 */   
	 public BTGrp17 getBTGrp17() {
   	return bTGrp17;
   }
   /**
	* 	Update BTGrp17 with the passed value
	*   Corresponding COBOL Variable is WS-17B-T-GRP
	*	@param value
	*/
   public void setBTGrp17(char[] value) {
      bTGrp17.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp17 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp17(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp17.begin,bTGrp17.length());
   }
   
     /**
	 * 	Update BTGrp17 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp17.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp17 with another Field
	 *	@param value
	 */
   public void setBTGrp17(Field source) {
   	replace(source,0,source.length(),bTGrp17.begin,bTGrp17.length());
   }  
   
     /**
	 * 	Update BTGrp17 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp17(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp17.begin,bTGrp17.length());
   }
   
     /**
	 * 	Update BTGrp17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp17.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR17
	 *	@return bTGrpR17
	 */
   public char[] getBTGrpR17() throws CFException{
     if (isBTGrpR17Modified()) { 
        bTGrpR17 = refreshBTGrpR17();
     }
   		return bTGrpR17;
   }

  
	/**
	*  set variable bTGrpR17
	*  Corresponding COBOL Variable is WS-17B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR17(char[] value) {
      bTGrpR17 = checkBTGrpR17Constraints(value);
      serializeBTGrpR17(bTGrpR17);
   } 

     /**
	 * 	Update BTGrpR17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR17,bTGrpR17.length);
   	
   }
   
   public void setBTGrpR17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR17,bTGrpR17.length);
   	
   }
   
     /**
	 * 	Update BTGrpR17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR17 with another Field
	 *	@param value
	 */
   public void setBTGrpR17(Field source) {
       replace(source,0,source.length(),beginBTGrpR17,B_TGRP_R_17_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR17,B_TGRP_R_17_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR17+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup17FieldLength() {
			return B_TGRP_GROUP_17_LENGTH;
		}

}
  
