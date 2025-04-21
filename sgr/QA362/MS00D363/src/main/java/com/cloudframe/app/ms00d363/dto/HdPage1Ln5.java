package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln5 extends HdPage1Ln5Serialized {
   

						private char[] hd15Cc = new char[1];




						private char[] hd15ProcId = new char[10];






	
	/**
	* Constructor for HdPage1Ln5
	**/
    public HdPage1Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd15Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("PROCESSOR ID       :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15ProcId(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(25)
             , getStartOffset() + 34
             ,25
             );
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 59
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 88
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 104
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 110
             ,23
             );
    }


 

	/**
	 *	Returns the value of hd15Cc
	 *	@return hd15Cc
	 */
   public char[] getHd15Cc() throws CFException{
     if (isHd15CcModified()) { 
        hd15Cc = refreshHd15Cc();
     }
   		return hd15Cc;
   }

  
	/**
	*  set variable hd15Cc
	*  Corresponding COBOL Variable is HD1-5-CC
	*  @param value
	**/
   public void setHd15Cc(char[] value) {
      hd15Cc = checkHd15CcConstraints(value);
      serializeHd15Cc(hd15Cc);
   } 

     /**
	 * 	Update Hd15Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd15Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd15Cc,hd15Cc.length);
   	
   }
   
   public void setHd15Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd15Cc,hd15Cc.length);
   	
   }
   
     /**
	 * 	Update Hd15Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd15Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd15Cc with another Field
	 *	@param value
	 */
   public void setHd15Cc(Field source) {
       replace(source,0,source.length(),beginHd15Cc,HD_15_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd15Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd15Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd15Cc,HD_15_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd15Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd15Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd15ProcId
	 *	@return hd15ProcId
	 */
   public char[] getHd15ProcId() throws CFException{
     if (isHd15ProcIdModified()) { 
        hd15ProcId = refreshHd15ProcId();
     }
   		return hd15ProcId;
   }

  
	/**
	*  set variable hd15ProcId
	*  Corresponding COBOL Variable is HD1-5-PROC-ID
	*  @param value
	**/
   public void setHd15ProcId(char[] value) {
      hd15ProcId = checkHd15ProcIdConstraints(value);
      serializeHd15ProcId(hd15ProcId);
   } 

     /**
	 * 	Update Hd15ProcId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd15ProcId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd15ProcId,hd15ProcId.length);
   	
   }
   
   public void setHd15ProcId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcId,hd15ProcId.length);
   	
   }
   
     /**
	 * 	Update Hd15ProcId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd15ProcId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd15ProcId with another Field
	 *	@param value
	 */
   public void setHd15ProcId(Field source) {
       replace(source,0,source.length(),beginHd15ProcId,HD_15_PROC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Hd15ProcId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd15ProcId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd15ProcId,HD_15_PROC_ID_LEN);
   	
   }
   
     /**
	 * 	Update Hd15ProcId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd15ProcId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15ProcId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln5FieldLength() {
			return HD_PAGE_1_LN_5_LENGTH;
		}

}
  
