package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln3 extends HdPage1Ln3Serialized {
   

						private char[] hd13Cc = new char[1];


						private char[] hd13AcqIss = new char[9];

						private char[] hd13Proc = new char[13];




								private char[] hd13Page = Field.fillLowValue(5);

	
	/**
	* Constructor for HdPage1Ln3
	**/
    public HdPage1Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd13Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(58)
             , getStartOffset() + 1
             ,58
             );
								setHd13AcqIss(("ACQUIRING").toCharArray());
								setHd13Proc((" PROCESSOR   ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 81
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 85
             ,36
             );
       replaceValue( // serialize and save the value
             ("PAGE:").toCharArray()
             , getStartOffset() + 121
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }


 

	/**
	 *	Returns the value of hd13Cc
	 *	@return hd13Cc
	 */
   public char[] getHd13Cc() throws CFException{
     if (isHd13CcModified()) { 
        hd13Cc = refreshHd13Cc();
     }
   		return hd13Cc;
   }

  
	/**
	*  set variable hd13Cc
	*  Corresponding COBOL Variable is HD1-3-CC
	*  @param value
	**/
   public void setHd13Cc(char[] value) {
      hd13Cc = checkHd13CcConstraints(value);
      serializeHd13Cc(hd13Cc);
   } 

     /**
	 * 	Update Hd13Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13Cc,hd13Cc.length);
   	
   }
   
   public void setHd13Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Cc,hd13Cc.length);
   	
   }
   
     /**
	 * 	Update Hd13Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13Cc with another Field
	 *	@param value
	 */
   public void setHd13Cc(Field source) {
       replace(source,0,source.length(),beginHd13Cc,HD_13_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13Cc,HD_13_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd13Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd13AcqIss
	 *	@return hd13AcqIss
	 */
   public char[] getHd13AcqIss() throws CFException{
     if (isHd13AcqIssModified()) { 
        hd13AcqIss = refreshHd13AcqIss();
     }
   		return hd13AcqIss;
   }

  
	/**
	*  set variable hd13AcqIss
	*  Corresponding COBOL Variable is HD1-3-ACQ-ISS
	*  @param value
	**/
   public void setHd13AcqIss(char[] value) {
      hd13AcqIss = checkHd13AcqIssConstraints(value);
      serializeHd13AcqIss(hd13AcqIss);
   } 

     /**
	 * 	Update Hd13AcqIss 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13AcqIss(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13AcqIss,hd13AcqIss.length);
   	
   }
   
   public void setHd13AcqIss(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13AcqIss,hd13AcqIss.length);
   	
   }
   
     /**
	 * 	Update Hd13AcqIss 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13AcqIss(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13AcqIss+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13AcqIss with another Field
	 *	@param value
	 */
   public void setHd13AcqIss(Field source) {
       replace(source,0,source.length(),beginHd13AcqIss,HD_13_ACQ_ISS_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13AcqIss 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13AcqIss(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13AcqIss,HD_13_ACQ_ISS_LEN);
   	
   }
   
     /**
	 * 	Update Hd13AcqIss 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13AcqIss(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13AcqIss+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd13Proc
	 *	@return hd13Proc
	 */
   public char[] getHd13Proc() throws CFException{
     if (isHd13ProcModified()) { 
        hd13Proc = refreshHd13Proc();
     }
   		return hd13Proc;
   }

  
	/**
	*  set variable hd13Proc
	*  Corresponding COBOL Variable is HD1-3-PROC
	*  @param value
	**/
   public void setHd13Proc(char[] value) {
      hd13Proc = checkHd13ProcConstraints(value);
      serializeHd13Proc(hd13Proc);
   } 

     /**
	 * 	Update Hd13Proc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13Proc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13Proc,hd13Proc.length);
   	
   }
   
   public void setHd13Proc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Proc,hd13Proc.length);
   	
   }
   
     /**
	 * 	Update Hd13Proc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13Proc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Proc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13Proc with another Field
	 *	@param value
	 */
   public void setHd13Proc(Field source) {
       replace(source,0,source.length(),beginHd13Proc,HD_13_PROC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13Proc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13Proc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13Proc,HD_13_PROC_LEN);
   	
   }
   
     /**
	 * 	Update Hd13Proc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13Proc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Proc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd13Page
	 *	@return hd13Page
	 */
   public char[] getHd13Page() throws CFException{
     if (isHd13PageModified()) { 
        hd13Page = refreshHd13Page();
     }
   		return hd13Page;
   }

  
	/**
	*  set variable hd13Page
	*  Corresponding COBOL Variable is HD1-3-PAGE
	*  @param value
	**/
   public void setHd13Page(char[] value) {
      hd13Page = checkHd13PageConstraints(value);
      serializeHd13Page(hd13Page);
   } 

     /**
	 * 	Update Hd13Page 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13Page(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13Page,hd13Page.length);
   	
   }
   
   public void setHd13Page(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Page,hd13Page.length);
   	
   }
   
     /**
	 * 	Update Hd13Page 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13Page(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Page+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13Page with another Field
	 *	@param value
	 */
   public void setHd13Page(Field source) {
       replace(source,0,source.length(),beginHd13Page,HD_13_PAGE_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13Page 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13Page(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13Page,HD_13_PAGE_LEN);
   	
   }
   
     /**
	 * 	Update Hd13Page 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13Page(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Page+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln3FieldLength() {
			return HD_PAGE_1_LN_3_LENGTH;
		}

}
  
