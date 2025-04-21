package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360Financials is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360Financials extends X360FinancialsSerialized { 
   
				private X360FSurchrgFields x360FSurchrgFields = new X360FSurchrgFields();
				private X360FMcsMdsBase x360FMcsMdsBase = new X360FMcsMdsBase();
				private X360FMcsAcqSetl x360FMcsAcqSetl = new X360FMcsAcqSetl();
				private X360FMcsIssSetl x360FMcsIssSetl = new X360FMcsIssSetl();
	
	/**
	* Constructor for X360Financials
	**/
    public X360Financials() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360Financials. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360Financials(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360FSurchrgFields.setParent(this,getStartOffset() + 0);
	       			x360FMcsMdsBase.setParent(this,getStartOffset() + 5);
	       			x360FMcsAcqSetl.setParent(this,getStartOffset() + 124);
	       			x360FMcsIssSetl.setParent(this,getStartOffset() + 124);
    } 

	/**
	 *	Returns the value of x360FSurchrgFields
	 *	@return x360FSurchrgFields
	 */   
	 public X360FSurchrgFields getX360FSurchrgFields() {
   	return x360FSurchrgFields;
   }
   /**
	* 	Update X360FSurchrgFields with the passed value
	*   Corresponding COBOL Variable is X360-F-SURCHRG-FIELDS
	*	@param value
	*/
   public void setX360FSurchrgFields(char[] value) {
      x360FSurchrgFields.setString(value); 
   }   
    
     /**
	 * 	Update X360FSurchrgFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FSurchrgFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FSurchrgFields.begin,x360FSurchrgFields.length());
   }
   
     /**
	 * 	Update X360FSurchrgFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FSurchrgFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FSurchrgFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FSurchrgFields with another Field
	 *	@param value
	 */
   public void setX360FSurchrgFields(Field source) {
   	replace(source,0,source.length(),x360FSurchrgFields.begin,x360FSurchrgFields.length());
   }  
   
     /**
	 * 	Update X360FSurchrgFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FSurchrgFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FSurchrgFields.begin,x360FSurchrgFields.length());
   }
   
     /**
	 * 	Update X360FSurchrgFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FSurchrgFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FSurchrgFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FMcsMdsBase
	 *	@return x360FMcsMdsBase
	 */   
	 public X360FMcsMdsBase getX360FMcsMdsBase() {
   	return x360FMcsMdsBase;
   }
   /**
	* 	Update X360FMcsMdsBase with the passed value
	*   Corresponding COBOL Variable is X360-F-MCS-MDS-BASE
	*	@param value
	*/
   public void setX360FMcsMdsBase(char[] value) {
      x360FMcsMdsBase.setString(value); 
   }   
    
     /**
	 * 	Update X360FMcsMdsBase 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsMdsBase(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsMdsBase.begin,x360FMcsMdsBase.length());
   }
   
     /**
	 * 	Update X360FMcsMdsBase 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsMdsBase(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsMdsBase.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FMcsMdsBase with another Field
	 *	@param value
	 */
   public void setX360FMcsMdsBase(Field source) {
   	replace(source,0,source.length(),x360FMcsMdsBase.begin,x360FMcsMdsBase.length());
   }  
   
     /**
	 * 	Update X360FMcsMdsBase 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsMdsBase(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsMdsBase.begin,x360FMcsMdsBase.length());
   }
   
     /**
	 * 	Update X360FMcsMdsBase 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsMdsBase(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsMdsBase.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FMcsAcqSetl
	 *	@return x360FMcsAcqSetl
	 */   
	 public X360FMcsAcqSetl getX360FMcsAcqSetl() {
   	return x360FMcsAcqSetl;
   }
   /**
	* 	Update X360FMcsAcqSetl with the passed value
	*   Corresponding COBOL Variable is X360-F-MCS-ACQ-SETL
	*	@param value
	*/
   public void setX360FMcsAcqSetl(char[] value) {
      x360FMcsAcqSetl.setString(value); 
   }   
    
     /**
	 * 	Update X360FMcsAcqSetl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsAcqSetl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsAcqSetl.begin,x360FMcsAcqSetl.length());
   }
   
     /**
	 * 	Update X360FMcsAcqSetl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsAcqSetl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsAcqSetl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FMcsAcqSetl with another Field
	 *	@param value
	 */
   public void setX360FMcsAcqSetl(Field source) {
   	replace(source,0,source.length(),x360FMcsAcqSetl.begin,x360FMcsAcqSetl.length());
   }  
   
     /**
	 * 	Update X360FMcsAcqSetl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsAcqSetl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsAcqSetl.begin,x360FMcsAcqSetl.length());
   }
   
     /**
	 * 	Update X360FMcsAcqSetl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsAcqSetl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsAcqSetl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FMcsIssSetl
	 *	@return x360FMcsIssSetl
	 */   
	 public X360FMcsIssSetl getX360FMcsIssSetl() {
   	return x360FMcsIssSetl;
   }
   /**
	* 	Update X360FMcsIssSetl with the passed value
	*   Corresponding COBOL Variable is X360-F-MCS-ISS-SETL
	*	@param value
	*/
   public void setX360FMcsIssSetl(char[] value) {
      x360FMcsIssSetl.setString(value); 
   }   
    
     /**
	 * 	Update X360FMcsIssSetl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsIssSetl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsIssSetl.begin,x360FMcsIssSetl.length());
   }
   
     /**
	 * 	Update X360FMcsIssSetl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsIssSetl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsIssSetl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FMcsIssSetl with another Field
	 *	@param value
	 */
   public void setX360FMcsIssSetl(Field source) {
   	replace(source,0,source.length(),x360FMcsIssSetl.begin,x360FMcsIssSetl.length());
   }  
   
     /**
	 * 	Update X360FMcsIssSetl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FMcsIssSetl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsIssSetl.begin,x360FMcsIssSetl.length());
   }
   
     /**
	 * 	Update X360FMcsIssSetl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FMcsIssSetl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FMcsIssSetl.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX360FinancialsFieldLength() {
			return X_360_FINANCIALS_LENGTH;
		}

}
  
