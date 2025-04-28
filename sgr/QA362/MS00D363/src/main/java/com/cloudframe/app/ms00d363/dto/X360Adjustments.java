package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360Adjustments is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360Adjustments extends X360AdjustmentsSerialized { 
   
				private X360ASurchrgFields x360ASurchrgFields = new X360ASurchrgFields();
				private X360AMcsMdsBase x360AMcsMdsBase = new X360AMcsMdsBase();
				private X360AMcsAcqSetl x360AMcsAcqSetl = new X360AMcsAcqSetl();
				private X360AMcsIssSetl x360AMcsIssSetl = new X360AMcsIssSetl();
	
	/**
	* Constructor for X360Adjustments
	**/
    public X360Adjustments() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360Adjustments. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360Adjustments(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360ASurchrgFields.setParent(this,getStartOffset() + 0);
	       			x360AMcsMdsBase.setParent(this,getStartOffset() + 5);
	       			x360AMcsAcqSetl.setParent(this,getStartOffset() + 148);
	       			x360AMcsIssSetl.setParent(this,getStartOffset() + 148);
    } 

	/**
	 *	Returns the value of x360ASurchrgFields
	 *	@return x360ASurchrgFields
	 */   
	 public X360ASurchrgFields getX360ASurchrgFields() {
   	return x360ASurchrgFields;
   }
   /**
	* 	Update X360ASurchrgFields with the passed value
	*   Corresponding COBOL Variable is X360-A-SURCHRG-FIELDS
	*	@param value
	*/
   public void setX360ASurchrgFields(char[] value) {
      x360ASurchrgFields.setString(value); 
   }   
    
     /**
	 * 	Update X360ASurchrgFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360ASurchrgFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360ASurchrgFields.begin,x360ASurchrgFields.length());
   }
   
     /**
	 * 	Update X360ASurchrgFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360ASurchrgFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360ASurchrgFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360ASurchrgFields with another Field
	 *	@param value
	 */
   public void setX360ASurchrgFields(Field source) {
   	replace(source,0,source.length(),x360ASurchrgFields.begin,x360ASurchrgFields.length());
   }  
   
     /**
	 * 	Update X360ASurchrgFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360ASurchrgFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360ASurchrgFields.begin,x360ASurchrgFields.length());
   }
   
     /**
	 * 	Update X360ASurchrgFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360ASurchrgFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360ASurchrgFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AMcsMdsBase
	 *	@return x360AMcsMdsBase
	 */   
	 public X360AMcsMdsBase getX360AMcsMdsBase() {
   	return x360AMcsMdsBase;
   }
   /**
	* 	Update X360AMcsMdsBase with the passed value
	*   Corresponding COBOL Variable is X360-A-MCS-MDS-BASE
	*	@param value
	*/
   public void setX360AMcsMdsBase(char[] value) {
      x360AMcsMdsBase.setString(value); 
   }   
    
     /**
	 * 	Update X360AMcsMdsBase 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsMdsBase(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsMdsBase.begin,x360AMcsMdsBase.length());
   }
   
     /**
	 * 	Update X360AMcsMdsBase 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsMdsBase(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsMdsBase.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AMcsMdsBase with another Field
	 *	@param value
	 */
   public void setX360AMcsMdsBase(Field source) {
   	replace(source,0,source.length(),x360AMcsMdsBase.begin,x360AMcsMdsBase.length());
   }  
   
     /**
	 * 	Update X360AMcsMdsBase 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsMdsBase(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsMdsBase.begin,x360AMcsMdsBase.length());
   }
   
     /**
	 * 	Update X360AMcsMdsBase 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsMdsBase(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsMdsBase.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AMcsAcqSetl
	 *	@return x360AMcsAcqSetl
	 */   
	 public X360AMcsAcqSetl getX360AMcsAcqSetl() {
   	return x360AMcsAcqSetl;
   }
   /**
	* 	Update X360AMcsAcqSetl with the passed value
	*   Corresponding COBOL Variable is X360-A-MCS-ACQ-SETL
	*	@param value
	*/
   public void setX360AMcsAcqSetl(char[] value) {
      x360AMcsAcqSetl.setString(value); 
   }   
    
     /**
	 * 	Update X360AMcsAcqSetl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsAcqSetl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsAcqSetl.begin,x360AMcsAcqSetl.length());
   }
   
     /**
	 * 	Update X360AMcsAcqSetl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsAcqSetl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsAcqSetl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AMcsAcqSetl with another Field
	 *	@param value
	 */
   public void setX360AMcsAcqSetl(Field source) {
   	replace(source,0,source.length(),x360AMcsAcqSetl.begin,x360AMcsAcqSetl.length());
   }  
   
     /**
	 * 	Update X360AMcsAcqSetl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsAcqSetl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsAcqSetl.begin,x360AMcsAcqSetl.length());
   }
   
     /**
	 * 	Update X360AMcsAcqSetl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsAcqSetl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsAcqSetl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AMcsIssSetl
	 *	@return x360AMcsIssSetl
	 */   
	 public X360AMcsIssSetl getX360AMcsIssSetl() {
   	return x360AMcsIssSetl;
   }
   /**
	* 	Update X360AMcsIssSetl with the passed value
	*   Corresponding COBOL Variable is X360-A-MCS-ISS-SETL
	*	@param value
	*/
   public void setX360AMcsIssSetl(char[] value) {
      x360AMcsIssSetl.setString(value); 
   }   
    
     /**
	 * 	Update X360AMcsIssSetl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsIssSetl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsIssSetl.begin,x360AMcsIssSetl.length());
   }
   
     /**
	 * 	Update X360AMcsIssSetl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsIssSetl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsIssSetl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AMcsIssSetl with another Field
	 *	@param value
	 */
   public void setX360AMcsIssSetl(Field source) {
   	replace(source,0,source.length(),x360AMcsIssSetl.begin,x360AMcsIssSetl.length());
   }  
   
     /**
	 * 	Update X360AMcsIssSetl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AMcsIssSetl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsIssSetl.begin,x360AMcsIssSetl.length());
   }
   
     /**
	 * 	Update X360AMcsIssSetl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AMcsIssSetl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AMcsIssSetl.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX360AdjustmentsFieldLength() {
			return X_360_ADJUSTMENTS_LENGTH;
		}

}
  
