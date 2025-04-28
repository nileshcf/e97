package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup19")

public class BTGrpGroup19 extends BTGrpGroup19Serialized  implements InitializingBean {
   
					private BTGrp19 bTGrp19 = new BTGrp19();

						private char[] bTGrpR19 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup19
	**/
    public BTGrpGroup19() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp19.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp19
	 *	@return bTGrp19
	 */   
	 public BTGrp19 getBTGrp19() {
   	return bTGrp19;
   }
   /**
	* 	Update BTGrp19 with the passed value
	*   Corresponding COBOL Variable is WS-19B-T-GRP
	*	@param value
	*/
   public void setBTGrp19(char[] value) {
      bTGrp19.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp19 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp19(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp19.begin,bTGrp19.length());
   }
   
     /**
	 * 	Update BTGrp19 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp19.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp19 with another Field
	 *	@param value
	 */
   public void setBTGrp19(Field source) {
   	replace(source,0,source.length(),bTGrp19.begin,bTGrp19.length());
   }  
   
     /**
	 * 	Update BTGrp19 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp19(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp19.begin,bTGrp19.length());
   }
   
     /**
	 * 	Update BTGrp19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp19.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR19
	 *	@return bTGrpR19
	 */
   public char[] getBTGrpR19() throws CFException{
     if (isBTGrpR19Modified()) { 
        bTGrpR19 = refreshBTGrpR19();
     }
   		return bTGrpR19;
   }

  
	/**
	*  set variable bTGrpR19
	*  Corresponding COBOL Variable is WS-19B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR19(char[] value) {
      bTGrpR19 = checkBTGrpR19Constraints(value);
      serializeBTGrpR19(bTGrpR19);
   } 

     /**
	 * 	Update BTGrpR19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR19,bTGrpR19.length);
   	
   }
   
   public void setBTGrpR19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR19,bTGrpR19.length);
   	
   }
   
     /**
	 * 	Update BTGrpR19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR19 with another Field
	 *	@param value
	 */
   public void setBTGrpR19(Field source) {
       replace(source,0,source.length(),beginBTGrpR19,B_TGRP_R_19_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR19,B_TGRP_R_19_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR19+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup19FieldLength() {
			return B_TGRP_GROUP_19_LENGTH;
		}

}
  
