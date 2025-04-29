package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTblEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ComnTblEntry500 extends ComnTblEntry500Serialized { 
   
				private ComnTagKey500 comnTagKey500 = new ComnTagKey500();
				private ComnTagData500 comnTagData500 = new ComnTagData500();
	
	/**
	* Constructor for ComnTblEntry500
	**/
    public ComnTblEntry500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ComnTblEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTblEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			comnTagKey500.setParent(this,getStartOffset() + 0);
	       			comnTagData500.setParent(this,getStartOffset() + 13);
    } 

	/**
	 *	Returns the value of comnTagKey500
	 *	@return comnTagKey500
	 */   
	 public ComnTagKey500 getComnTagKey500() {
   	return comnTagKey500;
   }
   /**
	* 	Update ComnTagKey500 with the passed value
	*   Corresponding COBOL Variable is 500-COMN-TAG-KEY
	*	@param value
	*/
   public void setComnTagKey500(char[] value) {
      comnTagKey500.setString(value); 
   }   
    
     /**
	 * 	Update ComnTagKey500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setComnTagKey500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,comnTagKey500.begin,comnTagKey500.length());
   }
   
     /**
	 * 	Update ComnTagKey500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setComnTagKey500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,comnTagKey500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ComnTagKey500 with another Field
	 *	@param value
	 */
   public void setComnTagKey500(Field source) {
   	replace(source,0,source.length(),comnTagKey500.begin,comnTagKey500.length());
   }  
   
     /**
	 * 	Update ComnTagKey500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setComnTagKey500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,comnTagKey500.begin,comnTagKey500.length());
   }
   
     /**
	 * 	Update ComnTagKey500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setComnTagKey500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,comnTagKey500.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of comnTagData500
	 *	@return comnTagData500
	 */   
	 public ComnTagData500 getComnTagData500() {
   	return comnTagData500;
   }
   /**
	* 	Update ComnTagData500 with the passed value
	*   Corresponding COBOL Variable is 500-COMN-TAG-DATA
	*	@param value
	*/
   public void setComnTagData500(char[] value) {
      comnTagData500.setString(value); 
   }   
    
     /**
	 * 	Update ComnTagData500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setComnTagData500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,comnTagData500.begin,comnTagData500.length());
   }
   
     /**
	 * 	Update ComnTagData500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setComnTagData500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,comnTagData500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ComnTagData500 with another Field
	 *	@param value
	 */
   public void setComnTagData500(Field source) {
   	replace(source,0,source.length(),comnTagData500.begin,comnTagData500.length());
   }  
   
     /**
	 * 	Update ComnTagData500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setComnTagData500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,comnTagData500.begin,comnTagData500.length());
   }
   
     /**
	 * 	Update ComnTagData500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setComnTagData500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,comnTagData500.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getComnTblEntry500FieldLength() {
			return COMN_TBL_ENTRY_500_LENGTH;
		}

}
  
