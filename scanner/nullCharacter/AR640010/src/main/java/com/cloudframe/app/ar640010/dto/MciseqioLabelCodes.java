package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioLabelCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioLabelCodes extends MciseqioLabelCodesSerialized { 
   

						private char[] mciseqioLabelOnDd = new char[2];

						private char[] mciseqioNoLabel = new char[2];

						private char[] mciseqioStdLabel = new char[2];
	
	/**
	* Constructor for MciseqioLabelCodes
	**/
    public MciseqioLabelCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciseqioLabelCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioLabelCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioLabelOnDd(fillSpace(2));
								setMciseqioNoLabel(("NL").toCharArray());
								setMciseqioStdLabel(("SL").toCharArray());
    } 

	/**
	 *	Returns the value of mciseqioLabelOnDd
	 *	@return mciseqioLabelOnDd
	 */
   public char[] getMciseqioLabelOnDd() throws CFException{
     if (isMciseqioLabelOnDdModified()) { 
        mciseqioLabelOnDd = refreshMciseqioLabelOnDd();
     }
   		return mciseqioLabelOnDd;
   }

  
	/**
	*  set variable mciseqioLabelOnDd
	*  Corresponding COBOL Variable is MCISEQIO-LABEL-ON-DD
	*  @param value
	**/
   public void setMciseqioLabelOnDd(char[] value) {
      mciseqioLabelOnDd = checkMciseqioLabelOnDdConstraints(value);
      serializeMciseqioLabelOnDd(mciseqioLabelOnDd);
   } 

     /**
	 * 	Update MciseqioLabelOnDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioLabelOnDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioLabelOnDd,mciseqioLabelOnDd.length);
   	
   }
   
   public void setMciseqioLabelOnDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabelOnDd,mciseqioLabelOnDd.length);
   	
   }
   
     /**
	 * 	Update MciseqioLabelOnDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabelOnDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabelOnDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioLabelOnDd with another Field
	 *	@param value
	 */
   public void setMciseqioLabelOnDd(Field source) {
       replace(source,0,source.length(),beginMciseqioLabelOnDd,MCISEQIO_LABEL_ON_DD_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioLabelOnDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioLabelOnDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioLabelOnDd,MCISEQIO_LABEL_ON_DD_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioLabelOnDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabelOnDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabelOnDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioNoLabel
	 *	@return mciseqioNoLabel
	 */
   public char[] getMciseqioNoLabel() throws CFException{
     if (isMciseqioNoLabelModified()) { 
        mciseqioNoLabel = refreshMciseqioNoLabel();
     }
   		return mciseqioNoLabel;
   }

  
	/**
	*  set variable mciseqioNoLabel
	*  Corresponding COBOL Variable is MCISEQIO-NO-LABEL
	*  @param value
	**/
   public void setMciseqioNoLabel(char[] value) {
      mciseqioNoLabel = checkMciseqioNoLabelConstraints(value);
      serializeMciseqioNoLabel(mciseqioNoLabel);
   } 

     /**
	 * 	Update MciseqioNoLabel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioNoLabel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioNoLabel,mciseqioNoLabel.length);
   	
   }
   
   public void setMciseqioNoLabel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioNoLabel,mciseqioNoLabel.length);
   	
   }
   
     /**
	 * 	Update MciseqioNoLabel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioNoLabel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioNoLabel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioNoLabel with another Field
	 *	@param value
	 */
   public void setMciseqioNoLabel(Field source) {
       replace(source,0,source.length(),beginMciseqioNoLabel,MCISEQIO_NO_LABEL_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioNoLabel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioNoLabel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioNoLabel,MCISEQIO_NO_LABEL_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioNoLabel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioNoLabel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioNoLabel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioStdLabel
	 *	@return mciseqioStdLabel
	 */
   public char[] getMciseqioStdLabel() throws CFException{
     if (isMciseqioStdLabelModified()) { 
        mciseqioStdLabel = refreshMciseqioStdLabel();
     }
   		return mciseqioStdLabel;
   }

  
	/**
	*  set variable mciseqioStdLabel
	*  Corresponding COBOL Variable is MCISEQIO-STD-LABEL
	*  @param value
	**/
   public void setMciseqioStdLabel(char[] value) {
      mciseqioStdLabel = checkMciseqioStdLabelConstraints(value);
      serializeMciseqioStdLabel(mciseqioStdLabel);
   } 

     /**
	 * 	Update MciseqioStdLabel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioStdLabel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioStdLabel,mciseqioStdLabel.length);
   	
   }
   
   public void setMciseqioStdLabel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioStdLabel,mciseqioStdLabel.length);
   	
   }
   
     /**
	 * 	Update MciseqioStdLabel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioStdLabel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioStdLabel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioStdLabel with another Field
	 *	@param value
	 */
   public void setMciseqioStdLabel(Field source) {
       replace(source,0,source.length(),beginMciseqioStdLabel,MCISEQIO_STD_LABEL_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioStdLabel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioStdLabel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioStdLabel,MCISEQIO_STD_LABEL_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioStdLabel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioStdLabel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioStdLabel+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMciseqioLabelCodesFieldLength() {
			return MCISEQIO_LABEL_CODES_LENGTH;
		}

}
  
