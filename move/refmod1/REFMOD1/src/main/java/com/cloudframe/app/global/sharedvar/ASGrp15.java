package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp15")

public class ASGrp15 extends ASGrp15Serialized  implements InitializingBean {
   

						private char[] fillerWs028 = Field.fillLowValue(3);
				private AS15 aS15 = new AS15();
	
	/**
	* Constructor for ASGrp15
	**/
    public ASGrp15() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aS15.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs028
	 *	@return fillerWs028
	 */
   public char[] getFillerWs028() throws CFException{
     if (isFillerWs028Modified()) { 
        fillerWs028 = refreshFillerWs028();
     }
   		return fillerWs028;
   }

  
	/**
	*  set variable fillerWs028
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs028(char[] value) {
      fillerWs028 = checkFillerWs028Constraints(value);
      serializeFillerWs028(fillerWs028);
   } 

     /**
	 * 	Update FillerWs028 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs028(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs028,fillerWs028.length);
   	
   }
   
   public void setFillerWs028(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs028,fillerWs028.length);
   	
   }
   
     /**
	 * 	Update FillerWs028 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs028(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs028+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs028 with another Field
	 *	@param value
	 */
   public void setFillerWs028(Field source) {
       replace(source,0,source.length(),beginFillerWs028,FILLER_WS_028_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs028 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs028(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs028,FILLER_WS_028_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs028 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs028(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs028+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS15
	 *	@return aS15
	 */   
	 public AS15 getAS15() {
   	return aS15;
   }
   /**
	* 	Update AS15 with the passed value
	*   Corresponding COBOL Variable is WS-15A-S
	*	@param value
	*/
   public void setAS15(char[] value) {
      aS15.setString(value); 
   }   
    
     /**
	 * 	Update AS15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS15.begin,aS15.length());
   }
   
     /**
	 * 	Update AS15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS15 with another Field
	 *	@param value
	 */
   public void setAS15(Field source) {
   	replace(source,0,source.length(),aS15.begin,aS15.length());
   }  
   
     /**
	 * 	Update AS15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS15.begin,aS15.length());
   }
   
     /**
	 * 	Update AS15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS15.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ASGrp15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs028(CONSTANTS.SPACE_3);
          aS15.initialize();
     
   }

		public static int getASGrp15FieldLength() {
			return A_SGRP_15_LENGTH;
		}

}
  
