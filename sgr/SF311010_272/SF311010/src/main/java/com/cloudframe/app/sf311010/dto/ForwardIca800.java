package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardIca800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ForwardIca800 extends ForwardIca800Serialized { 
   
				private ForwardIcaOnly5800 forwardIcaOnly5800 = new ForwardIcaOnly5800();

						private char[] fwdFiller2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for ForwardIca800
	**/
    public ForwardIca800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			forwardIcaOnly5800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of forwardIcaOnly5800
	 *	@return forwardIcaOnly5800
	 */   
	 public ForwardIcaOnly5800 getForwardIcaOnly5800() {
   	return forwardIcaOnly5800;
   }
   /**
	* 	Update ForwardIcaOnly5800 with the passed value
	*   Corresponding COBOL Variable is 800-FORWARD-ICA-ONLY5
	*	@param value
	*/
   public void setForwardIcaOnly5800(char[] value) {
      forwardIcaOnly5800.setString(value); 
   }   
    
     /**
	 * 	Update ForwardIcaOnly5800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setForwardIcaOnly5800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,forwardIcaOnly5800.begin,forwardIcaOnly5800.length());
   }
   
     /**
	 * 	Update ForwardIcaOnly5800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setForwardIcaOnly5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,forwardIcaOnly5800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ForwardIcaOnly5800 with another Field
	 *	@param value
	 */
   public void setForwardIcaOnly5800(Field source) {
   	replace(source,0,source.length(),forwardIcaOnly5800.begin,forwardIcaOnly5800.length());
   }  
   
     /**
	 * 	Update ForwardIcaOnly5800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setForwardIcaOnly5800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,forwardIcaOnly5800.begin,forwardIcaOnly5800.length());
   }
   
     /**
	 * 	Update ForwardIcaOnly5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setForwardIcaOnly5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,forwardIcaOnly5800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fwdFiller2800
	 *	@return fwdFiller2800
	 */
   public char[] getFwdFiller2800() throws CFException{
     if (isFwdFiller2800Modified()) { 
        fwdFiller2800 = refreshFwdFiller2800();
     }
   		return fwdFiller2800;
   }

  
	/**
	*  set variable fwdFiller2800
	*  Corresponding COBOL Variable is 800-FWD-FILLER-2
	*  @param value
	**/
   public void setFwdFiller2800(char[] value) {
      fwdFiller2800 = checkFwdFiller2800Constraints(value);
      serializeFwdFiller2800(fwdFiller2800);
   } 

     /**
	 * 	Update FwdFiller2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFwdFiller2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFwdFiller2800,fwdFiller2800.length);
   	
   }
   
   public void setFwdFiller2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller2800,fwdFiller2800.length);
   	
   }
   
     /**
	 * 	Update FwdFiller2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFwdFiller2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FwdFiller2800 with another Field
	 *	@param value
	 */
   public void setFwdFiller2800(Field source) {
       replace(source,0,source.length(),beginFwdFiller2800,FWD_FILLER_2800_LEN);
   	
   }  
   
     /**
	 * 	Update FwdFiller2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFwdFiller2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFwdFiller2800,FWD_FILLER_2800_LEN);
   	
   }
   
     /**
	 * 	Update FwdFiller2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFwdFiller2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller2800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getForwardIca800FieldLength() {
			return FORWARD_ICA_800_LENGTH;
		}

}
  
