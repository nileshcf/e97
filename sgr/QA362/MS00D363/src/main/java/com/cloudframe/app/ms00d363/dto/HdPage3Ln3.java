package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage3Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage3Ln3 extends HdPage3Ln3Serialized { 
   

						private char[] hd33Cc = new char[1];



						private char[] hd33GcmsOrSam = new char[6];









	
	/**
	* Constructor for HdPage3Ln3
	**/
    public HdPage3Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd33Cc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT ").toCharArray()
             , getStartOffset() + 2
             ,15
             );
								setHd33GcmsOrSam(("(GCMS)").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(12)
             , getStartOffset() + 23
             ,12
             );
       replaceValue( // serialize and save the value
             ("NETACQ").toCharArray()
             , getStartOffset() + 35
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 41
             ,13
             );
       replaceValue( // serialize and save the value
             ("FEEACQ").toCharArray()
             , getStartOffset() + 54
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 60
             ,13
             );
       replaceValue( // serialize and save the value
             ("NETISS").toCharArray()
             , getStartOffset() + 73
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 79
             ,13
             );
       replaceValue( // serialize and save the value
             ("FEEISS").toCharArray()
             , getStartOffset() + 92
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 98
             ,35
             );
    }


 

	/**
	 *	Returns the value of hd33Cc
	 *	@return hd33Cc
	 */
   public char[] getHd33Cc() throws CFException{
     if (isHd33CcModified()) { 
        hd33Cc = refreshHd33Cc();
     }
   		return hd33Cc;
   }

  
	/**
	*  set variable hd33Cc
	*  Corresponding COBOL Variable is HD3-3-CC
	*  @param value
	**/
   public void setHd33Cc(char[] value) {
      hd33Cc = checkHd33CcConstraints(value);
      serializeHd33Cc(hd33Cc);
   } 

     /**
	 * 	Update Hd33Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd33Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd33Cc,hd33Cc.length);
   	
   }
   
   public void setHd33Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd33Cc,hd33Cc.length);
   	
   }
   
     /**
	 * 	Update Hd33Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd33Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd33Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd33Cc with another Field
	 *	@param value
	 */
   public void setHd33Cc(Field source) {
       replace(source,0,source.length(),beginHd33Cc,HD_33_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd33Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd33Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd33Cc,HD_33_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd33Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd33Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd33Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd33GcmsOrSam
	 *	@return hd33GcmsOrSam
	 */
   public char[] getHd33GcmsOrSam() throws CFException{
     if (isHd33GcmsOrSamModified()) { 
        hd33GcmsOrSam = refreshHd33GcmsOrSam();
     }
   		return hd33GcmsOrSam;
   }

  
	/**
	*  set variable hd33GcmsOrSam
	*  Corresponding COBOL Variable is HD3-3-GCMS-OR-SAM
	*  @param value
	**/
   public void setHd33GcmsOrSam(char[] value) {
      hd33GcmsOrSam = checkHd33GcmsOrSamConstraints(value);
      serializeHd33GcmsOrSam(hd33GcmsOrSam);
   } 

     /**
	 * 	Update Hd33GcmsOrSam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd33GcmsOrSam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd33GcmsOrSam,hd33GcmsOrSam.length);
   	
   }
   
   public void setHd33GcmsOrSam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd33GcmsOrSam,hd33GcmsOrSam.length);
   	
   }
   
     /**
	 * 	Update Hd33GcmsOrSam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd33GcmsOrSam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd33GcmsOrSam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd33GcmsOrSam with another Field
	 *	@param value
	 */
   public void setHd33GcmsOrSam(Field source) {
       replace(source,0,source.length(),beginHd33GcmsOrSam,HD_33_GCMS_OR_SAM_LEN);
   	
   }  
   
     /**
	 * 	Update Hd33GcmsOrSam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd33GcmsOrSam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd33GcmsOrSam,HD_33_GCMS_OR_SAM_LEN);
   	
   }
   
     /**
	 * 	Update Hd33GcmsOrSam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd33GcmsOrSam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd33GcmsOrSam+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage3Ln3FieldLength() {
			return HD_PAGE_3_LN_3_LENGTH;
		}

}
  
