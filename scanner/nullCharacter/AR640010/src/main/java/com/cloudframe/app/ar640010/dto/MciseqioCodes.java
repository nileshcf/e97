package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioCodes extends MciseqioCodesSerialized { 
   
				private MciseqioRequestCodes mciseqioRequestCodes = new MciseqioRequestCodes();
				private MciseqioLabelCodes mciseqioLabelCodes = new MciseqioLabelCodes();
				private MciseqioRecfmCodes mciseqioRecfmCodes = new MciseqioRecfmCodes();
	
	/**
	* Constructor for MciseqioCodes
	**/
    public MciseqioCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciseqioCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			mciseqioRequestCodes.setParent(this,getStartOffset() + 0);
	       			mciseqioLabelCodes.setParent(this,getStartOffset() + 16);
	       			mciseqioRecfmCodes.setParent(this,getStartOffset() + 22);
    } 

	/**
	 *	Returns the value of mciseqioRequestCodes
	 *	@return mciseqioRequestCodes
	 */   
	 public MciseqioRequestCodes getMciseqioRequestCodes() {
   	return mciseqioRequestCodes;
   }
   /**
	* 	Update MciseqioRequestCodes with the passed value
	*   Corresponding COBOL Variable is MCISEQIO-REQUEST-CODES
	*	@param value
	*/
   public void setMciseqioRequestCodes(char[] value) {
      mciseqioRequestCodes.setString(value); 
   }   
    
     /**
	 * 	Update MciseqioRequestCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRequestCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRequestCodes.begin,mciseqioRequestCodes.length());
   }
   
     /**
	 * 	Update MciseqioRequestCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRequestCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRequestCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciseqioRequestCodes with another Field
	 *	@param value
	 */
   public void setMciseqioRequestCodes(Field source) {
   	replace(source,0,source.length(),mciseqioRequestCodes.begin,mciseqioRequestCodes.length());
   }  
   
     /**
	 * 	Update MciseqioRequestCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRequestCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRequestCodes.begin,mciseqioRequestCodes.length());
   }
   
     /**
	 * 	Update MciseqioRequestCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRequestCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRequestCodes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciseqioLabelCodes
	 *	@return mciseqioLabelCodes
	 */   
	 public MciseqioLabelCodes getMciseqioLabelCodes() {
   	return mciseqioLabelCodes;
   }
   /**
	* 	Update MciseqioLabelCodes with the passed value
	*   Corresponding COBOL Variable is MCISEQIO-LABEL-CODES
	*	@param value
	*/
   public void setMciseqioLabelCodes(char[] value) {
      mciseqioLabelCodes.setString(value); 
   }   
    
     /**
	 * 	Update MciseqioLabelCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciseqioLabelCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioLabelCodes.begin,mciseqioLabelCodes.length());
   }
   
     /**
	 * 	Update MciseqioLabelCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabelCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioLabelCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciseqioLabelCodes with another Field
	 *	@param value
	 */
   public void setMciseqioLabelCodes(Field source) {
   	replace(source,0,source.length(),mciseqioLabelCodes.begin,mciseqioLabelCodes.length());
   }  
   
     /**
	 * 	Update MciseqioLabelCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciseqioLabelCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioLabelCodes.begin,mciseqioLabelCodes.length());
   }
   
     /**
	 * 	Update MciseqioLabelCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabelCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioLabelCodes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciseqioRecfmCodes
	 *	@return mciseqioRecfmCodes
	 */   
	 public MciseqioRecfmCodes getMciseqioRecfmCodes() {
   	return mciseqioRecfmCodes;
   }
   /**
	* 	Update MciseqioRecfmCodes with the passed value
	*   Corresponding COBOL Variable is MCISEQIO-RECFM-CODES
	*	@param value
	*/
   public void setMciseqioRecfmCodes(char[] value) {
      mciseqioRecfmCodes.setString(value); 
   }   
    
     /**
	 * 	Update MciseqioRecfmCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRecfmCodes.begin,mciseqioRecfmCodes.length());
   }
   
     /**
	 * 	Update MciseqioRecfmCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRecfmCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciseqioRecfmCodes with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmCodes(Field source) {
   	replace(source,0,source.length(),mciseqioRecfmCodes.begin,mciseqioRecfmCodes.length());
   }  
   
     /**
	 * 	Update MciseqioRecfmCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRecfmCodes.begin,mciseqioRecfmCodes.length());
   }
   
     /**
	 * 	Update MciseqioRecfmCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioRecfmCodes.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMciseqioCodesFieldLength() {
			return MCISEQIO_CODES_LENGTH;
		}

}
  
