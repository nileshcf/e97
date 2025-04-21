package com.cloudframe.app.asaprnt4.dto;

/**
*  The class ReprecGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.asaprnt4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReprecGrp extends ReprecGrpSerialized {
   

						private char[] reprec = Field.fillLowValue(286);
	
	/**
	* Constructor for ReprecGrp
	**/
    public ReprecGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException{
     if (isReprecModified()) { 
        reprec = refreshReprec();
     }
   		return reprec;
   }

  
	/**
	*  set variable reprec
	*  Corresponding COBOL Variable is WS-REPREC
	*  @param value
	**/
   public void setReprec(char[] value) {
      reprec = checkReprecConstraints(value);
      serializeReprec(reprec);
   } 

     /**
	 * 	Update Reprec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReprec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReprec,reprec.length);
   	
   }
   
   public void setReprec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReprec,reprec.length);
   	
   }
   
     /**
	 * 	Update Reprec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReprec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReprec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Reprec with another Field
	 *	@param value
	 */
   public void setReprec(Field source) {
       replace(source,0,source.length(),beginReprec,REPREC_LEN);
   	
   }  
   
     /**
	 * 	Update Reprec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReprec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReprec,REPREC_LEN);
   	
   }
   
     /**
	 * 	Update Reprec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReprec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReprec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReprecGrpFieldLength() {
			return REPREC_GRP_LENGTH;
		}

}
  
