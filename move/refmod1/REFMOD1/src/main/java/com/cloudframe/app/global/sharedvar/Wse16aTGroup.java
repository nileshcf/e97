package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse16aTGroup")

public class Wse16aTGroup extends Wse16aTGroupSerialized  implements InitializingBean {
   
					private Wse16aT wse16aT = new Wse16aT();

						private char[] wse16aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse16aTGroup
	**/
    public Wse16aTGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse16aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse16aT
	 *	@return wse16aT
	 */   
	 public Wse16aT getWse16aT() {
   	return wse16aT;
   }
   /**
	* 	Update Wse16aT with the passed value
	*   Corresponding COBOL Variable is WSE-16A-T
	*	@param value
	*/
   public void setWse16aT(char[] value) {
      wse16aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse16aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse16aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse16aT.begin,wse16aT.length());
   }
   
     /**
	 * 	Update Wse16aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse16aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse16aT with another Field
	 *	@param value
	 */
   public void setWse16aT(Field source) {
   	replace(source,0,source.length(),wse16aT.begin,wse16aT.length());
   }  
   
     /**
	 * 	Update Wse16aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse16aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse16aT.begin,wse16aT.length());
   }
   
     /**
	 * 	Update Wse16aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse16aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse16aTR
	 *	@return wse16aTR
	 */
   public char[] getWse16aTR() throws CFException{
     if (isWse16aTRModified()) { 
        wse16aTR = refreshWse16aTR();
     }
   		return wse16aTR;
   }

  
	/**
	*  set variable wse16aTR
	*  Corresponding COBOL Variable is WSE-16A-T-R
	*  @param value
	**/
   public void setWse16aTR(char[] value) {
      wse16aTR = checkWse16aTRConstraints(value);
      serializeWse16aTR(wse16aTR);
   } 

     /**
	 * 	Update Wse16aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16aTR,wse16aTR.length);
   	
   }
   
   public void setWse16aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTR,wse16aTR.length);
   	
   }
   
     /**
	 * 	Update Wse16aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16aTR with another Field
	 *	@param value
	 */
   public void setWse16aTR(Field source) {
       replace(source,0,source.length(),beginWse16aTR,WSE_16A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16aTR,WSE_16A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse16aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse16aTGroupFieldLength() {
			return WSE_16A_TGROUP_LENGTH;
		}

}
  
